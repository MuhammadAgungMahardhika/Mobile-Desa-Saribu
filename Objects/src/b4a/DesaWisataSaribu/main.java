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
vis = vis | (cart.mostCurrent != null);
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

 {
            Activity __a = null;
            if (cart.previousOne != null) {
				__a = cart.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(cart.mostCurrent == null ? null : cart.mostCurrent.processBA);
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
public b4a.DesaWisataSaribu.core _core = null;
public b4a.DesaWisataSaribu.listpackage _listpackage = null;
public b4a.DesaWisataSaribu.cart _cart = null;
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
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub CheckLogin";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Log(\"Checking login status...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("8458753","Checking login status...",0);
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Dim isLogin As Boolean";
_islogin = false;
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="isLogin = manager.GetBoolean(\"is_login\")";
_islogin = _manager.GetBoolean("is_login");
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="If isLogin Then";
if (_islogin) { 
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="If manager.GetBoolean(\"user\") Then";
if (_manager.GetBoolean("user")) { 
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Log(\"Redirecting to HomeUser activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("8458758","Redirecting to HomeUser activity",0);
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="StartActivity(HomeUser)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeuser.getObject()));
 };
 };
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="End Sub";
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
anywheresoftware.b4a.keywords.Common.LogImpl("8196609","Login loaded",0);
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Log(\"Resume: \"&manager.GetBoolean(\"Hanafi\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("8196610","Resume: "+BA.ObjectToString(_manager.GetBoolean("Hanafi")),0);
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogin_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlogin_click", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub BtnLogin_Click";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Core.ExecuteUrl(API&\"login\", \"login=\"&EditLogin.T";
mostCurrent._core._executeurl /*String*/ (mostCurrent.activityBA,_api+"login","login="+mostCurrent._editlogin.getText()+"&password="+mostCurrent._editpassword.getText(),"Login",main.getObject());
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
public static String  _btnvisitor_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnvisitor_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnvisitor_click", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub BtnVisitor_Click";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Log(\"Redirecting to HomeVisitor Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("8327681","Redirecting to HomeVisitor Activity",0);
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="manager.SetBoolean(\"is_login\", False)";
_manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="manager.SetBoolean(\"visitor\", True)";
_manager.SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="manager.SetBoolean(\"user\", False)";
_manager.SetBoolean("user",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="StartActivity(HomeVisitor)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homevisitor.getObject()));
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("8524289","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Try";
try {RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="Log(\"Response from server :\"&res)";
anywheresoftware.b4a.keywords.Common.LogImpl("8524296","Response from server :"+_res,0);
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="sessionID  = data.Get(\"session_id\")";
_sessionid = BA.ObjectToString(_data.Get((Object)("session_id")));
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="csrfToken = data.Get(\"csrf_token\")";
_csrftoken = BA.ObjectToString(_data.Get((Object)("csrf_token")));
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="in_group = data.Get(\"in_group\")";
_in_group = BA.ObjectToBoolean(_data.Get((Object)("in_group")));
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="If in_group Then";
if (_in_group) { 
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="user = data.Get(\"user\")";
_user = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.Get((Object)("user"))));
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="id = user.Get(\"id\")";
_id = BA.ObjectToString(_user.Get((Object)("id")));
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="email = user.Get(\"email\")";
_email = BA.ObjectToString(_user.Get((Object)("email")));
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="username = user.Get(\"username\")";
_username = BA.ObjectToString(_user.Get((Object)("username")));
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="first_name = user.Get(\"first_name\")";
_first_name = BA.ObjectToString(_user.Get((Object)("first_name")));
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="last_name = user.Get(\"last_name\")";
_last_name = BA.ObjectToString(_user.Get((Object)("last_name")));
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="avatar = user.Get(\"avatar\")";
_avatar = BA.ObjectToString(_user.Get((Object)("avatar")));
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="address = user.Get(\"address\")";
_address = BA.ObjectToString(_user.Get((Object)("address")));
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="phone = user.Get(\"phone\")";
_phone = BA.ObjectToString(_user.Get((Object)("phone")));
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="ToastMessageShow(\"Login as User\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Login as User"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="MsgboxAsync(\"Hi, \"&first_name&\" \"&last_name, \"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Hi, "+_first_name+" "+_last_name),BA.ObjectToCharSequence("Logged In"),processBA);
RDebugUtils.currentLine=524318;
 //BA.debugLineNum = 524318;BA.debugLine="Log(\"Redirect to HomeUser Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("8524318","Redirect to HomeUser Activity",0);
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="manager.SetBoolean(\"is_login\", True)";
_manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524321;
 //BA.debugLineNum = 524321;BA.debugLine="manager.SetBoolean(\"user\", True)";
_manager.SetBoolean("user",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524322;
 //BA.debugLineNum = 524322;BA.debugLine="manager.SetBoolean(\"visitor\", False)";
_manager.SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524323;
 //BA.debugLineNum = 524323;BA.debugLine="manager.SetString(\"user_id\", id)";
_manager.SetString("user_id",_id);
RDebugUtils.currentLine=524326;
 //BA.debugLineNum = 524326;BA.debugLine="manager.SetString(\"session_id\", sessionID)";
_manager.SetString("session_id",_sessionid);
RDebugUtils.currentLine=524327;
 //BA.debugLineNum = 524327;BA.debugLine="manager.SetString(\"csrf_token\", csrfToken)";
_manager.SetString("csrf_token",_csrftoken);
RDebugUtils.currentLine=524328;
 //BA.debugLineNum = 524328;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=524329;
 //BA.debugLineNum = 524329;BA.debugLine="StartActivity(HomeUser)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeuser.getObject()));
 }else {
RDebugUtils.currentLine=524331;
 //BA.debugLineNum = 524331;BA.debugLine="MsgboxAsync(\"Please input correct credentials\"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please input correct credentials"),BA.ObjectToCharSequence("Login Failed"),processBA);
 };
 } 
       catch (Exception e40) {
			processBA.setLastException(e40);RDebugUtils.currentLine=524334;
 //BA.debugLineNum = 524334;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("8524334",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }else {
RDebugUtils.currentLine=524337;
 //BA.debugLineNum = 524337;BA.debugLine="Dim errorParser As JSONParser";
_errorparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=524338;
 //BA.debugLineNum = 524338;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
_errorparser.Initialize(_job._errormessage /*String*/ );
RDebugUtils.currentLine=524340;
 //BA.debugLineNum = 524340;BA.debugLine="Dim errorMap As Map";
_errormap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=524341;
 //BA.debugLineNum = 524341;BA.debugLine="errorMap = errorParser.NextObject";
_errormap = _errorparser.NextObject();
RDebugUtils.currentLine=524342;
 //BA.debugLineNum = 524342;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("8524342","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=524344;
 //BA.debugLineNum = 524344;BA.debugLine="Dim error As String";
_error = "";
RDebugUtils.currentLine=524345;
 //BA.debugLineNum = 524345;BA.debugLine="error = errorMap.Get(\"message\")";
_error = BA.ObjectToString(_errormap.Get((Object)("message")));
RDebugUtils.currentLine=524346;
 //BA.debugLineNum = 524346;BA.debugLine="ToastMessageShow(\"Error: \" & error, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_error),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=524348;
 //BA.debugLineNum = 524348;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=524349;
 //BA.debugLineNum = 524349;BA.debugLine="End Sub";
return "";
}
}