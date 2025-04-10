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

public class homeuser extends Activity implements B4AActivity{
	public static homeuser mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.DesaWisataSaribu", "b4a.DesaWisataSaribu.homeuser");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (homeuser).");
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
		activityBA = new BA(this, layout, processBA, "b4a.DesaWisataSaribu", "b4a.DesaWisataSaribu.homeuser");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSaribu.homeuser", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (homeuser) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (homeuser) Resume **");
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
		return homeuser.class;
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
            BA.LogInfo("** Activity (homeuser) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (homeuser) Pause event (activity is not paused). **");
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
            homeuser mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (homeuser) Resume **");
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
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _data = null;
public static String _id = "";
public static String _username = "";
public static String _email = "";
public static String _first_name = "";
public static String _last_name = "";
public static String _avatar = "";
public static String _address = "";
public static String _phone = "";
public static int _status = 0;
public anywheresoftware.b4a.objects.LabelWrapper _labelheader = null;
public anywheresoftware.b4a.objects.LabelWrapper _labellogout = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelname = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelusername = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbanner = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelhome = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmenu = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelprofile = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _profileavatar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlenavbar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogout = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnrg = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelpackage = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelrg = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btngemma = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelgemma = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnpackage = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSaribu.main _main = null;
public b4a.DesaWisataSaribu.starter _starter = null;
public b4a.DesaWisataSaribu.homevisitor _homevisitor = null;
public b4a.DesaWisataSaribu.listrg _listrg = null;
public b4a.DesaWisataSaribu.detailev _detailev = null;
public b4a.DesaWisataSaribu.mapsrg _mapsrg = null;
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
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="MainScroll.Panel.LoadLayout(\"HomeUser\")";
mostCurrent._mainscroll.getPanel().LoadLayout("HomeUser",mostCurrent.activityBA);
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="PanelHome.Height = MainScroll.Height";
mostCurrent._panelhome.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="TitleNavbar.Text=\"Home User\"";
mostCurrent._titlenavbar.setText(BA.ObjectToCharSequence("Home User"));
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="BtnBack.Visible = False";
mostCurrent._btnback.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="homeuser";
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Log(\"HomeUser loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("84521985","HomeUser loaded",0);
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Core.ExecuteUrl(Main.API&\"profile\", \"id=\"&Main.ma";
mostCurrent._core._executeurl /*String*/ (mostCurrent.activityBA,mostCurrent._main._api /*String*/ +"profile","id="+mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .GetString("user_id"),"Profile",homeuser.getObject());
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="End Sub";
return "";
}
public static String  _btncart_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncart_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncart_click", null));}
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Private Sub btnCart_Click";
RDebugUtils.currentLine=41353217;
 //BA.debugLineNum = 41353217;BA.debugLine="Log(\"Redirect to Cart Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("841353217","Redirect to Cart Activity",0);
RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="StartActivity(Cart)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._cart.getObject()));
RDebugUtils.currentLine=41353219;
 //BA.debugLineNum = 41353219;BA.debugLine="End Sub";
return "";
}
public static String  _btngemma_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btngemma_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btngemma_click", null));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub BtnGemma_Click";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Log(\"Redirect to Gemma Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("84915201","Redirect to Gemma Activity",0);
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="StartActivity(Gemma)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._gemma.getObject()));
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogout_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogout_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlogout_click", null));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Private Sub BtnLogout_Click";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Log(\"Redirect to Main Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("84784129","Redirect to Main Activity",0);
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"logout\", \"Logout\", M";
mostCurrent._core._executeurlget /*String*/ (mostCurrent.activityBA,mostCurrent._main._api /*String*/ +"logout","Logout",homeuser.getObject());
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="End Sub";
return "";
}
public static String  _btnpackage_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnpackage_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnpackage_click", null));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Private Sub BtnPackage_Click";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Log(\"Redirect to List Package\")";
anywheresoftware.b4a.keywords.Common.LogImpl("84849665","Redirect to List Package",0);
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="StartActivity(ListPackage)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._listpackage.getObject()));
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="End Sub";
return "";
}
public static String  _btnrg_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnrg_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnrg_click", null));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub BtnRG_Click";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Log(\"Redirect to MapsRG Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("84718593","Redirect to MapsRG Activity",0);
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="StartActivity(MapsRG)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._mapsrg.getObject()));
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSaribu.httpjob _job) throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
String _fullname = "";
anywheresoftware.b4a.objects.collections.Map _avatarmap = null;
String _avatarpath = "";
anywheresoftware.b4a.objects.collections.JSONParser _errorparser = null;
anywheresoftware.b4a.objects.collections.Map _errormap = null;
String _error = "";
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("84653057","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="Log(\"Response from server :\"&res)";
anywheresoftware.b4a.keywords.Common.LogImpl("84653063","Response from server :"+_res,0);
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"Profile","Logout")) {
case 0: {
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="Try";
try {RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=4653070;
 //BA.debugLineNum = 4653070;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=4653071;
 //BA.debugLineNum = 4653071;BA.debugLine="id = data.Get(\"id\")";
_id = BA.ObjectToString(_data.Get((Object)("id")));
RDebugUtils.currentLine=4653072;
 //BA.debugLineNum = 4653072;BA.debugLine="email = data.Get(\"email\")";
_email = BA.ObjectToString(_data.Get((Object)("email")));
RDebugUtils.currentLine=4653073;
 //BA.debugLineNum = 4653073;BA.debugLine="username = data.Get(\"username\")";
_username = BA.ObjectToString(_data.Get((Object)("username")));
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="first_name = data.Get(\"first_name\")";
_first_name = BA.ObjectToString(_data.Get((Object)("first_name")));
RDebugUtils.currentLine=4653075;
 //BA.debugLineNum = 4653075;BA.debugLine="last_name = data.Get(\"last_name\")";
_last_name = BA.ObjectToString(_data.Get((Object)("last_name")));
RDebugUtils.currentLine=4653076;
 //BA.debugLineNum = 4653076;BA.debugLine="avatar = data.Get(\"avatar\")";
_avatar = BA.ObjectToString(_data.Get((Object)("avatar")));
RDebugUtils.currentLine=4653077;
 //BA.debugLineNum = 4653077;BA.debugLine="address = data.Get(\"address\")";
_address = BA.ObjectToString(_data.Get((Object)("address")));
RDebugUtils.currentLine=4653078;
 //BA.debugLineNum = 4653078;BA.debugLine="phone = data.Get(\"phone\")";
_phone = BA.ObjectToString(_data.Get((Object)("phone")));
RDebugUtils.currentLine=4653081;
 //BA.debugLineNum = 4653081;BA.debugLine="Dim fullName As String";
_fullname = "";
RDebugUtils.currentLine=4653082;
 //BA.debugLineNum = 4653082;BA.debugLine="If first_name <> Null And first_name <> \"\" Th";
if (_first_name!= null && (_first_name).equals("") == false) { 
_fullname = _first_name;};
RDebugUtils.currentLine=4653083;
 //BA.debugLineNum = 4653083;BA.debugLine="If last_name <> Null And last_name <> \"\" Then";
if (_last_name!= null && (_last_name).equals("") == false) { 
_fullname = _fullname+" "+_last_name;};
RDebugUtils.currentLine=4653084;
 //BA.debugLineNum = 4653084;BA.debugLine="LabelName.Text = fullName.Trim  ' Hapus spasi";
mostCurrent._labelname.setText(BA.ObjectToCharSequence(_fullname.trim()));
RDebugUtils.currentLine=4653085;
 //BA.debugLineNum = 4653085;BA.debugLine="LabelUsername.Text = \"@\"&username";
mostCurrent._labelusername.setText(BA.ObjectToCharSequence("@"+_username));
RDebugUtils.currentLine=4653087;
 //BA.debugLineNum = 4653087;BA.debugLine="Dim avatarMap As Map";
_avatarmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4653088;
 //BA.debugLineNum = 4653088;BA.debugLine="Dim avatarPath As String";
_avatarpath = "";
RDebugUtils.currentLine=4653089;
 //BA.debugLineNum = 4653089;BA.debugLine="avatarPath = Main.server & \"media/photos/\" &a";
_avatarpath = mostCurrent._main._server /*String*/ +"media/photos/"+_avatar;
RDebugUtils.currentLine=4653090;
 //BA.debugLineNum = 4653090;BA.debugLine="avatarMap.Initialize";
_avatarmap.Initialize();
RDebugUtils.currentLine=4653091;
 //BA.debugLineNum = 4653091;BA.debugLine="avatarMap.Put(ProfileAvatar, avatarPath)";
_avatarmap.Put((Object)(mostCurrent._profileavatar.getObject()),(Object)(_avatarpath));
RDebugUtils.currentLine=4653092;
 //BA.debugLineNum = 4653092;BA.debugLine="CallSubDelayed2(Starter, \"Download\", avatarMa";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._starter.getObject()),"Download",(Object)(_avatarmap));
 } 
       catch (Exception e34) {
			processBA.setLastException(e34);RDebugUtils.currentLine=4653094;
 //BA.debugLineNum = 4653094;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("84653094",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 break; }
case 1: {
RDebugUtils.currentLine=4653098;
 //BA.debugLineNum = 4653098;BA.debugLine="Try";
try {RDebugUtils.currentLine=4653099;
 //BA.debugLineNum = 4653099;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4653100;
 //BA.debugLineNum = 4653100;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=4653101;
 //BA.debugLineNum = 4653101;BA.debugLine="status = map.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_map.Get((Object)("status"))));
RDebugUtils.currentLine=4653102;
 //BA.debugLineNum = 4653102;BA.debugLine="If status == 200 Then";
if (_status==200) { 
RDebugUtils.currentLine=4653103;
 //BA.debugLineNum = 4653103;BA.debugLine="MsgboxAsync(\"Successfully logged out\", \"Log";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Successfully logged out"),BA.ObjectToCharSequence("Log Out"),processBA);
RDebugUtils.currentLine=4653104;
 //BA.debugLineNum = 4653104;BA.debugLine="Main.manager.SetBoolean(\"is_login\", False)";
mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4653105;
 //BA.debugLineNum = 4653105;BA.debugLine="Main.manager.SetBoolean(\"visitor\", False)";
mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4653106;
 //BA.debugLineNum = 4653106;BA.debugLine="Main.manager.SetBoolean(\"user\", False)";
mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .SetBoolean("user",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4653107;
 //BA.debugLineNum = 4653107;BA.debugLine="Log(\"Successfully logged out\")";
anywheresoftware.b4a.keywords.Common.LogImpl("84653107","Successfully logged out",0);
RDebugUtils.currentLine=4653108;
 //BA.debugLineNum = 4653108;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4653109;
 //BA.debugLineNum = 4653109;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 };
 } 
       catch (Exception e51) {
			processBA.setLastException(e51);RDebugUtils.currentLine=4653112;
 //BA.debugLineNum = 4653112;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("84653112",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=4653117;
 //BA.debugLineNum = 4653117;BA.debugLine="Dim errorParser As JSONParser";
_errorparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4653118;
 //BA.debugLineNum = 4653118;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
_errorparser.Initialize(_job._errormessage /*String*/ );
RDebugUtils.currentLine=4653120;
 //BA.debugLineNum = 4653120;BA.debugLine="Dim errorMap As Map";
_errormap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4653121;
 //BA.debugLineNum = 4653121;BA.debugLine="errorMap = errorParser.NextObject";
_errormap = _errorparser.NextObject();
RDebugUtils.currentLine=4653122;
 //BA.debugLineNum = 4653122;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("84653122","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=4653124;
 //BA.debugLineNum = 4653124;BA.debugLine="Dim error As String";
_error = "";
RDebugUtils.currentLine=4653125;
 //BA.debugLineNum = 4653125;BA.debugLine="error = errorMap.Get(\"message\")";
_error = BA.ObjectToString(_errormap.Get((Object)("message")));
RDebugUtils.currentLine=4653126;
 //BA.debugLineNum = 4653126;BA.debugLine="ToastMessageShow(\"Error: \" & error, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_error),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=4653128;
 //BA.debugLineNum = 4653128;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=4653129;
 //BA.debugLineNum = 4653129;BA.debugLine="End Sub";
return "";
}
}