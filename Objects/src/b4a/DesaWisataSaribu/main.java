package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.DesaWisataSaribu", "b4a.DesaWisataSaribu.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.DesaWisataSaribu", "b4a.DesaWisataSaribu.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSaribu.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (homevisitor.mostCurrent != null);
vis = vis | (listrg.mostCurrent != null);
vis = vis | (detailev.mostCurrent != null);
vis = vis | (mapsrg.mostCurrent != null);
vis = vis | (homeuser.mostCurrent != null);
vis = vis | (gemma.mostCurrent != null);
vis = vis | (mapsev.mostCurrent != null);
vis = vis | (detailrg.mostCurrent != null);
vis = vis | (listev.mostCurrent != null);
vis = vis | (listpackage.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (homevisitor.previousOne != null) {
				__a = homevisitor.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(homevisitor.mostCurrent == null ? null : homevisitor.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (listrg.previousOne != null) {
				__a = listrg.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(listrg.mostCurrent == null ? null : listrg.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (detailev.previousOne != null) {
				__a = detailev.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(detailev.mostCurrent == null ? null : detailev.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (mapsrg.previousOne != null) {
				__a = mapsrg.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(mapsrg.mostCurrent == null ? null : mapsrg.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (homeuser.previousOne != null) {
				__a = homeuser.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(homeuser.mostCurrent == null ? null : homeuser.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (gemma.previousOne != null) {
				__a = gemma.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(gemma.mostCurrent == null ? null : gemma.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (mapsev.previousOne != null) {
				__a = mapsev.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(mapsev.mostCurrent == null ? null : mapsev.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (detailrg.previousOne != null) {
				__a = detailrg.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(detailrg.mostCurrent == null ? null : detailrg.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (listev.previousOne != null) {
				__a = listev.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(listev.mostCurrent == null ? null : listev.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (listpackage.previousOne != null) {
				__a = listpackage.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(listpackage.mostCurrent == null ? null : listpackage.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _server = "";
public static String _api = "";
public static String _mobileuri = "";
public static anywheresoftware.b4a.objects.collections.Map _data = null;
public static anywheresoftware.b4a.objects.collections.Map _user = null;
public static String _id = "";
public static String _username = "";
public static String _email = "";
public static String _first_name = "";
public static String _last_name = "";
public static String _avatar = "";
public static String _address = "";
public static String _phone = "";
public static boolean _in_group = false;
public static String _sessionid = "";
public static String _csrftoken = "";
public static de.amberhome.objects.preferenceactivity.PreferenceManager _manager = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnvisitor = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editlogin = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editpassword = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagelogin = null;
public anywheresoftware.b4a.objects.PanelWrapper _panellogin = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSaribu.starter _starter = null;
public b4a.DesaWisataSaribu.homevisitor _homevisitor = null;
public b4a.DesaWisataSaribu.listrg _listrg = null;
public b4a.DesaWisataSaribu.detailev _detailev = null;
public b4a.DesaWisataSaribu.mapsrg _mapsrg = null;
public b4a.DesaWisataSaribu.homeuser _homeuser = null;
public b4a.DesaWisataSaribu.gemma _gemma = null;
public b4a.DesaWisataSaribu.mapsev _mapsev = null;
public b4a.DesaWisataSaribu.detailrg _detailrg = null;
public b4a.DesaWisataSaribu.listev _listev = null;
public b4a.DesaWisataSaribu.listpackage _listpackage = null;
public b4a.DesaWisataSaribu.core _core = null;
public b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="CheckLogin";
_checklogin();
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="MainScroll.Panel.LoadLayout(\"Login\")";
mostCurrent._mainscroll.getPanel().LoadLayout("Login",mostCurrent.activityBA);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Navbar.Visible = False";
mostCurrent._navbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="If Navbar.Visible == False Then";
if (mostCurrent._navbar.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
mostCurrent._mainscroll.setTop((int) (mostCurrent._mainscroll.getTop()-mostCurrent._navbar.getHeight()));
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
mostCurrent._mainscroll.setHeight((int) (mostCurrent._mainscroll.getHeight()+mostCurrent._navbar.getHeight()));
 };
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="PanelLogin.Height = MainScroll.Height";
mostCurrent._panellogin.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="End Sub";
return "";
}
public static String  _checklogin() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checklogin", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checklogin", null));}
boolean _islogin = false;
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Sub CheckLogin";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="Log(\"Checking login status...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("639190529","Checking login status...",0);
RDebugUtils.currentLine=39190530;
 //BA.debugLineNum = 39190530;BA.debugLine="Dim isLogin As Boolean";
_islogin = false;
RDebugUtils.currentLine=39190531;
 //BA.debugLineNum = 39190531;BA.debugLine="isLogin = manager.GetBoolean(\"is_login\")";
_islogin = _manager.GetBoolean("is_login");
RDebugUtils.currentLine=39190532;
 //BA.debugLineNum = 39190532;BA.debugLine="If isLogin Then";
if (_islogin) { 
RDebugUtils.currentLine=39190533;
 //BA.debugLineNum = 39190533;BA.debugLine="If manager.GetBoolean(\"user\") Then";
if (_manager.GetBoolean("user")) { 
RDebugUtils.currentLine=39190534;
 //BA.debugLineNum = 39190534;BA.debugLine="Log(\"Redirecting to HomeUser activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("639190534","Redirecting to HomeUser activity",0);
RDebugUtils.currentLine=39190535;
 //BA.debugLineNum = 39190535;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=39190536;
 //BA.debugLineNum = 39190536;BA.debugLine="StartActivity(HomeUser)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeuser.getObject()));
 };
 };
RDebugUtils.currentLine=39190539;
 //BA.debugLineNum = 39190539;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Log(\"Login loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196609","Login loaded",0);
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Log(\"Resume: \"&manager.GetBoolean(\"Hanafi\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("6196610","Resume: "+BA.ObjectToString(_manager.GetBoolean("Hanafi")),0);
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogin_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlogin_click", null));}
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Private Sub BtnLogin_Click";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="Core.ExecuteUrl(API&\"login\", \"login=\"&EditLogin.T";
mostCurrent._core._executeurl /*String*/ (mostCurrent.activityBA,_api+"login","login="+mostCurrent._editlogin.getText()+"&password="+mostCurrent._editpassword.getText(),"Login",main.getObject());
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="End Sub";
return "";
}
public static String  _btnvisitor_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnvisitor_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnvisitor_click", null));}
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Private Sub BtnVisitor_Click";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="Log(\"Redirecting to HomeVisitor Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("639059457","Redirecting to HomeVisitor Activity",0);
RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="manager.SetBoolean(\"is_login\", False)";
_manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=39059459;
 //BA.debugLineNum = 39059459;BA.debugLine="manager.SetBoolean(\"visitor\", True)";
_manager.SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=39059460;
 //BA.debugLineNum = 39059460;BA.debugLine="manager.SetBoolean(\"user\", False)";
_manager.SetBoolean("user",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=39059461;
 //BA.debugLineNum = 39059461;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=39059462;
 //BA.debugLineNum = 39059462;BA.debugLine="StartActivity(HomeVisitor)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homevisitor.getObject()));
RDebugUtils.currentLine=39059463;
 //BA.debugLineNum = 39059463;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSaribu.httpjob _job) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.JSONParser _errorparser = null;
anywheresoftware.b4a.objects.collections.Map _errormap = null;
String _error = "";
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("639256065","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=39256067;
 //BA.debugLineNum = 39256067;BA.debugLine="Try";
try {RDebugUtils.currentLine=39256068;
 //BA.debugLineNum = 39256068;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=39256069;
 //BA.debugLineNum = 39256069;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=39256070;
 //BA.debugLineNum = 39256070;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=39256071;
 //BA.debugLineNum = 39256071;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=39256072;
 //BA.debugLineNum = 39256072;BA.debugLine="Log(\"Response from server :\"&res)";
anywheresoftware.b4a.keywords.Common.LogImpl("639256072","Response from server :"+_res,0);
RDebugUtils.currentLine=39256074;
 //BA.debugLineNum = 39256074;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=39256075;
 //BA.debugLineNum = 39256075;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=39256076;
 //BA.debugLineNum = 39256076;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=39256078;
 //BA.debugLineNum = 39256078;BA.debugLine="sessionID  = data.Get(\"session_id\")";
_sessionid = BA.ObjectToString(_data.Get((Object)("session_id")));
RDebugUtils.currentLine=39256079;
 //BA.debugLineNum = 39256079;BA.debugLine="csrfToken = data.Get(\"csrf_token\")";
_csrftoken = BA.ObjectToString(_data.Get((Object)("csrf_token")));
RDebugUtils.currentLine=39256080;
 //BA.debugLineNum = 39256080;BA.debugLine="in_group = data.Get(\"in_group\")";
_in_group = BA.ObjectToBoolean(_data.Get((Object)("in_group")));
RDebugUtils.currentLine=39256081;
 //BA.debugLineNum = 39256081;BA.debugLine="If in_group Then";
if (_in_group) { 
RDebugUtils.currentLine=39256082;
 //BA.debugLineNum = 39256082;BA.debugLine="user = data.Get(\"user\")";
_user = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.Get((Object)("user"))));
RDebugUtils.currentLine=39256083;
 //BA.debugLineNum = 39256083;BA.debugLine="id = user.Get(\"id\")";
_id = BA.ObjectToString(_user.Get((Object)("id")));
RDebugUtils.currentLine=39256084;
 //BA.debugLineNum = 39256084;BA.debugLine="email = user.Get(\"email\")";
_email = BA.ObjectToString(_user.Get((Object)("email")));
RDebugUtils.currentLine=39256085;
 //BA.debugLineNum = 39256085;BA.debugLine="username = user.Get(\"username\")";
_username = BA.ObjectToString(_user.Get((Object)("username")));
RDebugUtils.currentLine=39256086;
 //BA.debugLineNum = 39256086;BA.debugLine="first_name = user.Get(\"first_name\")";
_first_name = BA.ObjectToString(_user.Get((Object)("first_name")));
RDebugUtils.currentLine=39256087;
 //BA.debugLineNum = 39256087;BA.debugLine="last_name = user.Get(\"last_name\")";
_last_name = BA.ObjectToString(_user.Get((Object)("last_name")));
RDebugUtils.currentLine=39256088;
 //BA.debugLineNum = 39256088;BA.debugLine="avatar = user.Get(\"avatar\")";
_avatar = BA.ObjectToString(_user.Get((Object)("avatar")));
RDebugUtils.currentLine=39256089;
 //BA.debugLineNum = 39256089;BA.debugLine="address = user.Get(\"address\")";
_address = BA.ObjectToString(_user.Get((Object)("address")));
RDebugUtils.currentLine=39256090;
 //BA.debugLineNum = 39256090;BA.debugLine="phone = user.Get(\"phone\")";
_phone = BA.ObjectToString(_user.Get((Object)("phone")));
RDebugUtils.currentLine=39256092;
 //BA.debugLineNum = 39256092;BA.debugLine="ToastMessageShow(\"Login as User\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Login as User"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=39256093;
 //BA.debugLineNum = 39256093;BA.debugLine="MsgboxAsync(\"Hi, \"&first_name&\" \"&last_name, \"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Hi, "+_first_name+" "+_last_name),BA.ObjectToCharSequence("Logged In"),processBA);
RDebugUtils.currentLine=39256094;
 //BA.debugLineNum = 39256094;BA.debugLine="Log(\"Redirect to HomeUser Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("639256094","Redirect to HomeUser Activity",0);
RDebugUtils.currentLine=39256096;
 //BA.debugLineNum = 39256096;BA.debugLine="manager.SetBoolean(\"is_login\", True)";
_manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=39256097;
 //BA.debugLineNum = 39256097;BA.debugLine="manager.SetBoolean(\"user\", True)";
_manager.SetBoolean("user",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=39256098;
 //BA.debugLineNum = 39256098;BA.debugLine="manager.SetBoolean(\"visitor\", False)";
_manager.SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=39256099;
 //BA.debugLineNum = 39256099;BA.debugLine="manager.SetString(\"user_id\", id)";
_manager.SetString("user_id",_id);
RDebugUtils.currentLine=39256102;
 //BA.debugLineNum = 39256102;BA.debugLine="manager.SetString(\"session_id\", sessionID)";
_manager.SetString("session_id",_sessionid);
RDebugUtils.currentLine=39256103;
 //BA.debugLineNum = 39256103;BA.debugLine="manager.SetString(\"csrf_token\", csrfToken)";
_manager.SetString("csrf_token",_csrftoken);
RDebugUtils.currentLine=39256104;
 //BA.debugLineNum = 39256104;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=39256105;
 //BA.debugLineNum = 39256105;BA.debugLine="StartActivity(HomeUser)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeuser.getObject()));
 }else {
RDebugUtils.currentLine=39256107;
 //BA.debugLineNum = 39256107;BA.debugLine="MsgboxAsync(\"Please input correct credentials\"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please input correct credentials"),BA.ObjectToCharSequence("Login Failed"),processBA);
 };
 } 
       catch (Exception e40) {
			processBA.setLastException(e40);RDebugUtils.currentLine=39256110;
 //BA.debugLineNum = 39256110;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("639256110",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }else {
RDebugUtils.currentLine=39256113;
 //BA.debugLineNum = 39256113;BA.debugLine="Dim errorParser As JSONParser";
_errorparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=39256114;
 //BA.debugLineNum = 39256114;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
_errorparser.Initialize(_job._errormessage /*String*/ );
RDebugUtils.currentLine=39256116;
 //BA.debugLineNum = 39256116;BA.debugLine="Dim errorMap As Map";
_errormap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=39256117;
 //BA.debugLineNum = 39256117;BA.debugLine="errorMap = errorParser.NextObject";
_errormap = _errorparser.NextObject();
RDebugUtils.currentLine=39256118;
 //BA.debugLineNum = 39256118;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("639256118","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=39256120;
 //BA.debugLineNum = 39256120;BA.debugLine="Dim error As String";
_error = "";
RDebugUtils.currentLine=39256121;
 //BA.debugLineNum = 39256121;BA.debugLine="error = errorMap.Get(\"message\")";
_error = BA.ObjectToString(_errormap.Get((Object)("message")));
RDebugUtils.currentLine=39256122;
 //BA.debugLineNum = 39256122;BA.debugLine="ToastMessageShow(\"Error: \" & error, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_error),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=39256124;
 //BA.debugLineNum = 39256124;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=39256125;
 //BA.debugLineNum = 39256125;BA.debugLine="End Sub";
return "";
}
}