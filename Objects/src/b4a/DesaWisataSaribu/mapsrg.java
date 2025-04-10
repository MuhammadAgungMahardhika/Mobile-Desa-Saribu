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

public class mapsrg extends Activity implements B4AActivity{
	public static mapsrg mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.DesaWisataSaribu", "b4a.DesaWisataSaribu.mapsrg");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (mapsrg).");
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
		activityBA = new BA(this, layout, processBA, "b4a.DesaWisataSaribu", "b4a.DesaWisataSaribu.mapsrg");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSaribu.mapsrg", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (mapsrg) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (mapsrg) Resume **");
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
		return mapsrg.class;
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
            BA.LogInfo("** Activity (mapsrg) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (mapsrg) Pause event (activity is not paused). **");
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
            mapsrg mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (mapsrg) Resume **");
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
public static String _namerg = "";
public static anywheresoftware.b4a.objects.collections.Map _facilitymap = null;
public static boolean _isfiltered = false;
public uk.co.martinpearman.b4a.webviewextras.WebViewExtras _mywebviewextras = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelrg = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webviewrg = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlenavbar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnuserloc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnobj = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtsearchrg = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelsearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlist = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelrating = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinrating = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfacility = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinfacility = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelcategory = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spincategory = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSaribu.main _main = null;
public b4a.DesaWisataSaribu.starter _starter = null;
public b4a.DesaWisataSaribu.homevisitor _homevisitor = null;
public b4a.DesaWisataSaribu.listrg _listrg = null;
public b4a.DesaWisataSaribu.detailev _detailev = null;
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
public static String  _updatelocation() throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatelocation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatelocation", null));}
String _userposition = "";
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub UpdateLocation";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Log(\"Update user position on Maps Rumah Gadang\")";
anywheresoftware.b4a.keywords.Common.LogImpl("83538945","Update user position on Maps Rumah Gadang",0);
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Log(\"Lat: \"&Starter.lat&\"; Long: \"&Starter.lng)";
anywheresoftware.b4a.keywords.Common.LogImpl("83538946","Lat: "+mostCurrent._starter._lat /*String*/ +"; Long: "+mostCurrent._starter._lng /*String*/ ,0);
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Dim userPosition As String";
_userposition = "";
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="userPosition = \"userPositionAPI(\"&Starter.lat&\",";
_userposition = "userPositionAPI("+mostCurrent._starter._lat /*String*/ +", "+mostCurrent._starter._lng /*String*/ +")";
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, user";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_userposition);
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="Starter.mapStatus = \"RG\"";
mostCurrent._starter._mapstatus /*String*/  = "RG";
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsRG\")";
mostCurrent._mainscroll.getPanel().LoadLayout("MapsRG",mostCurrent.activityBA);
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="WebViewRG.Height = MainScroll.Height";
mostCurrent._webviewrg.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="PanelRG.Height = MainScroll.Height";
mostCurrent._panelrg.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="TitleNavbar.Text = \"Rumah Gadang / Homestay \"";
mostCurrent._titlenavbar.setText(BA.ObjectToCharSequence("Rumah Gadang / Homestay "));
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewRG, \"We";
mostCurrent._mywebviewextras.addWebChromeClient(mostCurrent.activityBA,(android.webkit.WebView)(mostCurrent._webviewrg.getObject()),"WebViewRG");
RDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="WebViewRG.JavaScriptEnabled = True";
mostCurrent._webviewrg.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211279;
 //BA.debugLineNum = 3211279;BA.debugLine="WebViewRG.LoadUrl(Main.MobileUri&\"rumahGadang/map";
mostCurrent._webviewrg.LoadUrl(mostCurrent._main._mobileuri /*String*/ +"rumahGadang/maps");
RDebugUtils.currentLine=3211281;
 //BA.debugLineNum = 3211281;BA.debugLine="PanelSearch.Visible = False";
mostCurrent._panelsearch.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211282;
 //BA.debugLineNum = 3211282;BA.debugLine="btnObj.Visible = False";
mostCurrent._btnobj.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211283;
 //BA.debugLineNum = 3211283;BA.debugLine="btnUserLoc.Visible = False";
mostCurrent._btnuserloc.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211284;
 //BA.debugLineNum = 3211284;BA.debugLine="btnList.Visible = False";
mostCurrent._btnlist.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211285;
 //BA.debugLineNum = 3211285;BA.debugLine="PanelRating.Visible = False";
mostCurrent._panelrating.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211286;
 //BA.debugLineNum = 3211286;BA.debugLine="PanelFacility.Visible = False";
mostCurrent._panelfacility.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211287;
 //BA.debugLineNum = 3211287;BA.debugLine="PanelCategory.Visible = False";
mostCurrent._panelcategory.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211296;
 //BA.debugLineNum = 3211296;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="mapsrg";
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._starter.getObject()),"StopGPS");
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_resume", null); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.DesaWisataSaribu.mapsrg parent) {
this.parent = parent;
}
b4a.DesaWisataSaribu.mapsrg parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mapsrg";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Log(\"MapsRG Loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("83342337","MapsRG Loaded",0);
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent._starter._gps1 /*anywheresoftware.b4a.gps.GPS*/ .getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please enable the GPS device."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._starter._gps1 /*anywheresoftware.b4a.gps.GPS*/ .getLocationSettingsIntent()));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mapsrg", "activity_resume"), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="If Result Then";
if (true) break;

case 6:
//if
this.state = 11;
if (_result) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._starter.getObject()),"StartGPS");
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="ToastMessageShow(\"Please allow GPS to run this";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please allow GPS to run this appliation"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=3342351;
 //BA.debugLineNum = 3342351;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnback_click() throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnback_click", null));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub BtnBack_Click";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Log(\"Going back to previous activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("83473409","Going back to previous activity",0);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Starter.mapStatus = \"\"";
mostCurrent._starter._mapstatus /*String*/  = "";
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="End Sub";
return "";
}
public static String  _btncart_click() throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncart_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncart_click", null));}
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Private Sub btnCart_Click";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="Log(\"Redirect to Cart Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("841418753","Redirect to Cart Activity",0);
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="StartActivity(Cart)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._cart.getObject()));
RDebugUtils.currentLine=41418755;
 //BA.debugLineNum = 41418755;BA.debugLine="End Sub";
return "";
}
public static String  _btnlist_click() throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlist_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlist_click", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Private Sub btnList_Click";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Log(\"Redirect to ListRG activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("84063233","Redirect to ListRG activity",0);
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="StartActivity(ListRG)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._listrg.getObject()));
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="End Sub";
return "";
}
public static String  _btnobj_click() throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnobj_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnobj_click", null));}
String _boundtoobject = "";
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub btnObj_Click";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Log(\"Pan to Rumah Gadang\")";
anywheresoftware.b4a.keywords.Common.LogImpl("83735553","Pan to Rumah Gadang",0);
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Dim boundToObject As String";
_boundtoobject = "";
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="If isFiltered Then";
if (_isfiltered) { 
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="boundToObject = \"findRG('')\"";
_boundtoobject = "findRG('')";
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="spinFacility.SelectedIndex = 0";
mostCurrent._spinfacility.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
 }else {
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="boundToObject = \"boundToObject(false)\"";
_boundtoobject = "boundToObject(false)";
 };
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, boun";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_boundtoobject);
RDebugUtils.currentLine=3735566;
 //BA.debugLineNum = 3735566;BA.debugLine="End Sub";
return "";
}
public static String  _btnuserloc_click() throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnuserloc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnuserloc_click", null));}
String _pantouser = "";
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Private Sub btnUserLoc_Click";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Log(\"Panning to user location\")";
anywheresoftware.b4a.keywords.Common.LogImpl("83670017","Panning to user location",0);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="UpdateLocation";
_updatelocation();
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Dim panToUser As String = \"panToUser()\"";
_pantouser = "panToUser()";
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, panT";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_pantouser);
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="End Sub";
return "";
}
public static String  _edtsearchrg_enterpressed() throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edtsearchrg_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edtsearchrg_enterpressed", null));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub edtSearchRG_EnterPressed";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="nameRG = edtSearchRG.Text";
_namerg = mostCurrent._edtsearchrg.getText();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="FindRG";
_findrg();
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="End Sub";
return "";
}
public static String  _findrg() throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "findrg", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "findrg", null));}
String _searchrg = "";
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub FindRG";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="spinFacility.SelectedIndex = 0";
mostCurrent._spinfacility.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="Log(\"Searching '\"&nameRG&\"' on maps\")";
anywheresoftware.b4a.keywords.Common.LogImpl("83866630","Searching '"+_namerg+"' on maps",0);
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="Dim searchRG As String";
_searchrg = "";
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="searchRG = \"findRG('\"&nameRG&\"')\"";
_searchrg = "findRG('"+_namerg+"')";
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, sear";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_searchrg);
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSaribu.httpjob _job) throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _data = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _facility = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("83932161","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"LoadFacility")) {
case 0: {
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=3932173;
 //BA.debugLineNum = 3932173;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3932174;
 //BA.debugLineNum = 3932174;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=3932175;
 //BA.debugLineNum = 3932175;BA.debugLine="facilityMap.Initialize";
_facilitymap.Initialize();
RDebugUtils.currentLine=3932176;
 //BA.debugLineNum = 3932176;BA.debugLine="spinFacility.Add(\"Facility...\")";
mostCurrent._spinfacility.Add("Facility...");
RDebugUtils.currentLine=3932177;
 //BA.debugLineNum = 3932177;BA.debugLine="For i = 0 To data.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_data.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=3932178;
 //BA.debugLineNum = 3932178;BA.debugLine="Dim facility As Map";
_facility = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3932179;
 //BA.debugLineNum = 3932179;BA.debugLine="facility = data.Get(i)";
_facility = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.Get(_i)));
RDebugUtils.currentLine=3932180;
 //BA.debugLineNum = 3932180;BA.debugLine="facilityMap.Put(facility.Get(\"facility\"), fa";
_facilitymap.Put(_facility.Get((Object)("facility")),_facility.Get((Object)("id")));
RDebugUtils.currentLine=3932181;
 //BA.debugLineNum = 3932181;BA.debugLine="spinFacility.Add(facility.Get(\"facility\"))";
mostCurrent._spinfacility.Add(BA.ObjectToString(_facility.Get((Object)("facility"))));
 }
};
 } 
       catch (Exception e23) {
			processBA.setLastException(e23);RDebugUtils.currentLine=3932184;
 //BA.debugLineNum = 3932184;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("83932184",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
RDebugUtils.currentLine=3932188;
 //BA.debugLineNum = 3932188;BA.debugLine="End Sub";
return "";
}
public static String  _spincategory_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spincategory_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spincategory_itemclick", new Object[] {_position,_value}));}
String _findbycategoryrg = "";
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub spinCategory_ItemClick (Position As In";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim findByCategoryRG As String";
_findbycategoryrg = "";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="MsgboxAsync(\"Please choose category\", \"Search by";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose category"),BA.ObjectToCharSequence("Search by Category"),processBA);
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="spinFacility.SelectedIndex = 0";
mostCurrent._spinfacility.setSelectedIndex((int) (0));
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="findByCategoryRG = \"findRG('')\"";
_findbycategoryrg = "findRG('')";
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_findbycategoryrg);
 }else {
RDebugUtils.currentLine=4259852;
 //BA.debugLineNum = 4259852;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="spinFacility.SelectedIndex = 0";
mostCurrent._spinfacility.setSelectedIndex((int) (0));
RDebugUtils.currentLine=4259854;
 //BA.debugLineNum = 4259854;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="Log(\"Searching RG with category: \"&Value)";
anywheresoftware.b4a.keywords.Common.LogImpl("84259856","Searching RG with category: "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=4259857;
 //BA.debugLineNum = 4259857;BA.debugLine="findByCategoryRG = \"findByCategoryRG('\"&Value&\"'";
_findbycategoryrg = "findByCategoryRG('"+BA.ObjectToString(_value)+"')";
RDebugUtils.currentLine=4259858;
 //BA.debugLineNum = 4259858;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_findbycategoryrg);
 };
RDebugUtils.currentLine=4259860;
 //BA.debugLineNum = 4259860;BA.debugLine="End Sub";
return "";
}
public static String  _spinfacility_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinfacility_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinfacility_itemclick", new Object[] {_position,_value}));}
String _findbyfacilityrg = "";
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub spinFacility_ItemClick (Position As In";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim findByFacilityRG As String";
_findbyfacilityrg = "";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="MsgboxAsync(\"Please choose facility\", \"Search by";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose facility"),BA.ObjectToCharSequence("Search by Facility"),processBA);
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="findByFacilityRG = \"findRG('')\"";
_findbyfacilityrg = "findRG('')";
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_findbyfacilityrg);
 }else {
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=4194319;
 //BA.debugLineNum = 4194319;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4194321;
 //BA.debugLineNum = 4194321;BA.debugLine="Log(\"Searching RG with facility: \"&Value)";
anywheresoftware.b4a.keywords.Common.LogImpl("84194321","Searching RG with facility: "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="findByFacilityRG = \"findByFacilityRG('\"&facility";
_findbyfacilityrg = "findByFacilityRG('"+BA.ObjectToString(_facilitymap.Get(_value))+"')";
RDebugUtils.currentLine=4194323;
 //BA.debugLineNum = 4194323;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_findbyfacilityrg);
 };
RDebugUtils.currentLine=4194325;
 //BA.debugLineNum = 4194325;BA.debugLine="End Sub";
return "";
}
public static String  _spinrating_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinrating_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinrating_itemclick", new Object[] {_position,_value}));}
String _findbyratingrg = "";
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub spinRating_ItemClick (Position As Int,";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim findByRatingRG As String";
_findbyratingrg = "";
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="MsgboxAsync(\"Please choose rating from 1-5\", \"Se";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose rating from 1-5"),BA.ObjectToCharSequence("Search by Rating"),processBA);
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="spinFacility.SelectedIndex = 0";
mostCurrent._spinfacility.setSelectedIndex((int) (0));
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="findByRatingRG = \"findRG('')\"";
_findbyratingrg = "findRG('')";
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_findbyratingrg);
 }else {
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=4128781;
 //BA.debugLineNum = 4128781;BA.debugLine="spinFacility.SelectedIndex = 0";
mostCurrent._spinfacility.setSelectedIndex((int) (0));
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=4128783;
 //BA.debugLineNum = 4128783;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4128785;
 //BA.debugLineNum = 4128785;BA.debugLine="Log(\"Searching RG with \"&Value&\" rating\")";
anywheresoftware.b4a.keywords.Common.LogImpl("84128785","Searching RG with "+BA.ObjectToString(_value)+" rating",0);
RDebugUtils.currentLine=4128786;
 //BA.debugLineNum = 4128786;BA.debugLine="findByRatingRG = \"findByRatingRG('\"&Value&\"')\"";
_findbyratingrg = "findByRatingRG('"+BA.ObjectToString(_value)+"')";
RDebugUtils.currentLine=4128787;
 //BA.debugLineNum = 4128787;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_findbyratingrg);
 };
RDebugUtils.currentLine=4128789;
 //BA.debugLineNum = 4128789;BA.debugLine="End Sub";
return "";
}
public static String  _webviewrg_pagefinished(String _url) throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "webviewrg_pagefinished", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "webviewrg_pagefinished", new Object[] {_url}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Private Sub WebViewRG_PageFinished (Url As String)";
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return "";
}
public static String  _webviewrg_progresschanged(int _loading) throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "webviewrg_progresschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "webviewrg_progresschanged", new Object[] {_loading}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub WebViewRG_ProgressChanged(loading As Int)";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="If loading == 100 Then";
if (_loading==100) { 
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Log(\"Webview loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("83604482","Webview loaded",0);
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Starter.webviewLoading = loading";
mostCurrent._starter._webviewloading /*int*/  = _loading;
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="PanelSearch.Visible = True";
mostCurrent._panelsearch.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="btnObj.Visible = True";
mostCurrent._btnobj.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="btnUserLoc.Visible = True";
mostCurrent._btnuserloc.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="btnList.Visible = True";
mostCurrent._btnlist.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=3604493;
 //BA.debugLineNum = 3604493;BA.debugLine="Log(\"Webview loading at \"&loading&\"% ....\")";
anywheresoftware.b4a.keywords.Common.LogImpl("83604493","Webview loading at "+BA.NumberToString(_loading)+"% ....",0);
 };
RDebugUtils.currentLine=3604495;
 //BA.debugLineNum = 3604495;BA.debugLine="End Sub";
return "";
}
public static String  _webviewrg_receivederror(int _errorcode,String _description,String _failingurl) throws Exception{
RDebugUtils.currentModule="mapsrg";
if (Debug.shouldDelegate(mostCurrent.activityBA, "webviewrg_receivederror", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "webviewrg_receivederror", new Object[] {_errorcode,_description,_failingurl}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub WebViewRG_ReceivedError(ErrorCode As Int, Desc";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Log(\"WebView Error:\")";
anywheresoftware.b4a.keywords.Common.LogImpl("83276801","WebView Error:",0);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Log(\"Error Code: \" & ErrorCode)";
anywheresoftware.b4a.keywords.Common.LogImpl("83276802","Error Code: "+BA.NumberToString(_errorcode),0);
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Log(\"Description: \" & Description)";
anywheresoftware.b4a.keywords.Common.LogImpl("83276803","Description: "+_description,0);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="Log(\"Failing URL: \" & FailingUrl)";
anywheresoftware.b4a.keywords.Common.LogImpl("83276804","Failing URL: "+_failingurl,0);
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="End Sub";
return "";
}
}