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

public class mapsev extends Activity implements B4AActivity{
	public static mapsev mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.DesaWisataSaribu", "b4a.DesaWisataSaribu.mapsev");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (mapsev).");
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
		activityBA = new BA(this, layout, processBA, "b4a.DesaWisataSaribu", "b4a.DesaWisataSaribu.mapsev");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSaribu.mapsev", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (mapsev) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (mapsev) Resume **");
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
		return mapsev.class;
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
            BA.LogInfo("** Activity (mapsev) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (mapsev) Pause event (activity is not paused). **");
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
            mapsev mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (mapsev) Resume **");
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
public static String _nameev = "";
public static anywheresoftware.b4a.objects.collections.Map _categorymap = null;
public static boolean _isfiltered = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public uk.co.martinpearman.b4a.webviewextras.WebViewExtras _mywebviewextras = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelev = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webviewev = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnuserloc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnobj = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtsearchev = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelsearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlist = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelcategory = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneldate = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelrating = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spincategory = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinrating = null;
public b4a.DesaWisataSaribu.swiftbutton _btndate = null;
public b4a.DesaWisataSaribu.b4xdatetemplate _datetemplate = null;
public b4a.DesaWisataSaribu.b4xdialog _dialog = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSaribu.main _main = null;
public b4a.DesaWisataSaribu.starter _starter = null;
public b4a.DesaWisataSaribu.homevisitor _homevisitor = null;
public b4a.DesaWisataSaribu.listrg _listrg = null;
public b4a.DesaWisataSaribu.detailev _detailev = null;
public b4a.DesaWisataSaribu.mapsrg _mapsrg = null;
public b4a.DesaWisataSaribu.homeuser _homeuser = null;
public b4a.DesaWisataSaribu.gemma _gemma = null;
public b4a.DesaWisataSaribu.detailrg _detailrg = null;
public b4a.DesaWisataSaribu.listev _listev = null;
public b4a.DesaWisataSaribu.register _register = null;
public b4a.DesaWisataSaribu.listpackage _listpackage = null;
public b4a.DesaWisataSaribu.core _core = null;
public b4a.DesaWisataSaribu.cart _cart = null;
public b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
public static String  _updatelocation() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatelocation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatelocation", null));}
String _userposition = "";
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub UpdateLocation";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Log(\"Update user position on Maps Event\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26291457","Update user position on Maps Event",0);
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="Log(\"Lat: \"&Starter.lat&\"; Long: \"&Starter.lng)";
anywheresoftware.b4a.keywords.Common.LogImpl("26291458","Lat: "+mostCurrent._starter._lat /*String*/ +"; Long: "+mostCurrent._starter._lng /*String*/ ,0);
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="Dim userPosition As String";
_userposition = "";
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="userPosition = \"userPositionAPI(\"&Starter.lat&\",";
_userposition = "userPositionAPI("+mostCurrent._starter._lat /*String*/ +", "+mostCurrent._starter._lng /*String*/ +")";
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, user";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_userposition);
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="Starter.mapStatus = \"EV\"";
mostCurrent._starter._mapstatus /*String*/  = "EV";
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsEV\")";
mostCurrent._mainscroll.getPanel().LoadLayout("MapsEV",mostCurrent.activityBA);
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="Navbar.Visible = False";
mostCurrent._navbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="If Navbar.Visible == False Then";
if (mostCurrent._navbar.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
mostCurrent._mainscroll.setTop((int) (mostCurrent._mainscroll.getTop()-mostCurrent._navbar.getHeight()));
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
mostCurrent._mainscroll.setHeight((int) (mostCurrent._mainscroll.getHeight()+mostCurrent._navbar.getHeight()));
 };
RDebugUtils.currentLine=6029324;
 //BA.debugLineNum = 6029324;BA.debugLine="WebViewEV.Height = MainScroll.Height";
mostCurrent._webviewev.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=6029325;
 //BA.debugLineNum = 6029325;BA.debugLine="PanelEV.Height = MainScroll.Height";
mostCurrent._panelev.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=6029326;
 //BA.debugLineNum = 6029326;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=6029328;
 //BA.debugLineNum = 6029328;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewEV, \"We";
mostCurrent._mywebviewextras.addWebChromeClient(mostCurrent.activityBA,(android.webkit.WebView)(mostCurrent._webviewev.getObject()),"WebViewEV");
RDebugUtils.currentLine=6029329;
 //BA.debugLineNum = 6029329;BA.debugLine="WebViewEV.JavaScriptEnabled = True";
mostCurrent._webviewev.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6029330;
 //BA.debugLineNum = 6029330;BA.debugLine="WebViewEV.LoadUrl(Main.server&\"web/event/maps\")";
mostCurrent._webviewev.LoadUrl(mostCurrent._main._server /*String*/ +"web/event/maps");
RDebugUtils.currentLine=6029332;
 //BA.debugLineNum = 6029332;BA.debugLine="PanelSearch.Visible = False";
mostCurrent._panelsearch.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029333;
 //BA.debugLineNum = 6029333;BA.debugLine="btnObj.Visible = False";
mostCurrent._btnobj.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029334;
 //BA.debugLineNum = 6029334;BA.debugLine="btnUserLoc.Visible = False";
mostCurrent._btnuserloc.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029335;
 //BA.debugLineNum = 6029335;BA.debugLine="btnList.Visible = False";
mostCurrent._btnlist.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029336;
 //BA.debugLineNum = 6029336;BA.debugLine="PanelRating.Visible = False";
mostCurrent._panelrating.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029337;
 //BA.debugLineNum = 6029337;BA.debugLine="PanelDate.Visible = False";
mostCurrent._paneldate.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029338;
 //BA.debugLineNum = 6029338;BA.debugLine="PanelCategory.Visible = False";
mostCurrent._panelcategory.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029340;
 //BA.debugLineNum = 6029340;BA.debugLine="spinRating.DropdownBackgroundColor = Colors.White";
mostCurrent._spinrating.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=6029341;
 //BA.debugLineNum = 6029341;BA.debugLine="spinCategory.DropdownBackgroundColor = Colors.Whi";
mostCurrent._spincategory.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=6029343;
 //BA.debugLineNum = 6029343;BA.debugLine="spinRating.AddAll(Array As String(\"Rating...\", \"1";
mostCurrent._spinrating.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Rating...","1","2","3","4","5"}));
RDebugUtils.currentLine=6029344;
 //BA.debugLineNum = 6029344;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"event/category\", \"Lo";
mostCurrent._core._executeurlget /*String*/ (mostCurrent.activityBA,mostCurrent._main._api /*String*/ +"event/category","LoadCategory",mapsev.getObject());
RDebugUtils.currentLine=6029345;
 //BA.debugLineNum = 6029345;BA.debugLine="Dialog.Initialize (Activity)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
RDebugUtils.currentLine=6029346;
 //BA.debugLineNum = 6029346;BA.debugLine="Dialog.Title = \"Select Date...\"";
mostCurrent._dialog._title /*Object*/  = (Object)("Select Date...");
RDebugUtils.currentLine=6029347;
 //BA.debugLineNum = 6029347;BA.debugLine="DateTemplate.Initialize";
mostCurrent._datetemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=6029348;
 //BA.debugLineNum = 6029348;BA.debugLine="DateTemplate.MinYear = 2000";
mostCurrent._datetemplate._minyear /*int*/  = (int) (2000);
RDebugUtils.currentLine=6029349;
 //BA.debugLineNum = 6029349;BA.debugLine="DateTemplate.MaxYear = 2050";
mostCurrent._datetemplate._maxyear /*int*/  = (int) (2050);
RDebugUtils.currentLine=6029350;
 //BA.debugLineNum = 6029350;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
RDebugUtils.currentLine=6029351;
 //BA.debugLineNum = 6029351;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="mapsev";
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._starter.getObject()),"StopGPS");
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_resume", null); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.DesaWisataSaribu.mapsev parent) {
this.parent = parent;
}
b4a.DesaWisataSaribu.mapsev parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mapsev";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Log(\"MapsEV Loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26094849","MapsEV Loaded",0);
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
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
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please enable the GPS device."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._starter._gps1 /*anywheresoftware.b4a.gps.GPS*/ .getLocationSettingsIntent()));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mapsev", "activity_resume"), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="If Result Then";
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
RDebugUtils.currentLine=6094857;
 //BA.debugLineNum = 6094857;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._starter.getObject()),"StartGPS");
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=6094859;
 //BA.debugLineNum = 6094859;BA.debugLine="ToastMessageShow(\"Please allow GPS to run this";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please allow GPS to run this appliation"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6094860;
 //BA.debugLineNum = 6094860;BA.debugLine="Activity.Finish";
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
RDebugUtils.currentLine=6094863;
 //BA.debugLineNum = 6094863;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnback_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnback_click", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub BtnBack_Click";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Log(\"Going back to previous activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26225921","Going back to previous activity",0);
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="Starter.mapStatus = \"\"";
mostCurrent._starter._mapstatus /*String*/  = "";
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="End Sub";
return "";
}
public static void  _btndate_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndate_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btndate_click", null); return;}
ResumableSub_btnDate_Click rsub = new ResumableSub_btnDate_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnDate_Click extends BA.ResumableSub {
public ResumableSub_btnDate_Click(b4a.DesaWisataSaribu.mapsev parent) {
this.parent = parent;
}
b4a.DesaWisataSaribu.mapsev parent;
int _result = 0;
String _selecteddate = "";
String _findbydateev = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mapsev";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"\", \"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mapsev", "btndate_click"), parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._datetemplate),(Object)(""),(Object)(""),(Object)("Cancel")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Dim selectedDate As String";
_selecteddate = "";
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Dim findByDateEV As String";
_findbydateev = "";
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="selectedDate = DateTime.Date(DateTemplate.Date)";
_selecteddate = anywheresoftware.b4a.keywords.Common.DateTime.Date(parent.mostCurrent._datetemplate._getdate /*long*/ (null));
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="btnDate.xLBL.Text = selectedDate";
parent.mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_selecteddate));
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="edtSearchEV.Text = \"\"";
parent.mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="spinRating.SelectedIndex = 0";
parent.mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="spinCategory.SelectedIndex = 0";
parent.mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="isFiltered = True";
parent._isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=7012366;
 //BA.debugLineNum = 7012366;BA.debugLine="Log(\"Searching EV with date: \"&selectedDate)";
anywheresoftware.b4a.keywords.Common.LogImpl("27012366","Searching EV with date: "+_selecteddate,0);
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="findByDateEV = \"findByDateEV('\"&selectedDate&\"')";
_findbydateev = "findByDateEV('"+_selecteddate+"')";
RDebugUtils.currentLine=7012368;
 //BA.debugLineNum = 7012368;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
parent.mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(parent.mostCurrent._webviewev.getObject()),_findbydateev);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=7012370;
 //BA.debugLineNum = 7012370;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnlist_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlist_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlist_click", null));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub btnList_Click";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Log(\"Redirect to ListEV activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26815745","Redirect to ListEV activity",0);
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="StartActivity(ListEV)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._listev.getObject()));
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="End Sub";
return "";
}
public static String  _btnobj_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnobj_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnobj_click", null));}
String _boundtoobject = "";
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Private Sub btnObj_Click";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Log(\"Pan to Event\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26488065","Pan to Event",0);
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Dim boundToObject As String";
_boundtoobject = "";
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="If isFiltered Then";
if (_isfiltered) { 
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="boundToObject = \"findEV('')\"";
_boundtoobject = "findEV('')";
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
 }else {
RDebugUtils.currentLine=6488075;
 //BA.debugLineNum = 6488075;BA.debugLine="boundToObject = \"boundToObject(false)\"";
_boundtoobject = "boundToObject(false)";
 };
RDebugUtils.currentLine=6488077;
 //BA.debugLineNum = 6488077;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, boun";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_boundtoobject);
RDebugUtils.currentLine=6488078;
 //BA.debugLineNum = 6488078;BA.debugLine="End Sub";
return "";
}
public static String  _btnuserloc_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnuserloc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnuserloc_click", null));}
String _pantouser = "";
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub btnUserLoc_Click";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Log(\"Panning to user location\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26422529","Panning to user location",0);
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="UpdateLocation";
_updatelocation();
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="Dim panToUser As String = \"panToUser()\"";
_pantouser = "panToUser()";
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, panT";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_pantouser);
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="End Sub";
return "";
}
public static String  _edtsearchev_enterpressed() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edtsearchev_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edtsearchev_enterpressed", null));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Private Sub edtSearchEV_EnterPressed";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="nameEV = edtSearchEV.Text";
_nameev = mostCurrent._edtsearchev.getText();
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="FindEV";
_findev();
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="End Sub";
return "";
}
public static String  _findev() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "findev", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "findev", null));}
String _searchrg = "";
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub FindEV";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="Log(\"Searching '\"&nameEV&\"' on maps\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26619142","Searching '"+_nameev+"' on maps",0);
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="Dim searchRG As String";
_searchrg = "";
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="searchRG = \"findEV('\"&nameEV&\"')\"";
_searchrg = "findEV('"+_nameev+"')";
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, sear";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_searchrg);
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSaribu.httpjob _job) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _data = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _category = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("26684673","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"LoadCategory")) {
case 0: {
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="Try";
try {RDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=6684685;
 //BA.debugLineNum = 6684685;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6684686;
 //BA.debugLineNum = 6684686;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=6684687;
 //BA.debugLineNum = 6684687;BA.debugLine="categoryMap.Initialize";
_categorymap.Initialize();
RDebugUtils.currentLine=6684688;
 //BA.debugLineNum = 6684688;BA.debugLine="spinCategory.Add(\"Category...\")";
mostCurrent._spincategory.Add("Category...");
RDebugUtils.currentLine=6684689;
 //BA.debugLineNum = 6684689;BA.debugLine="For i = 0 To data.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_data.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=6684690;
 //BA.debugLineNum = 6684690;BA.debugLine="Dim category As Map";
_category = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6684691;
 //BA.debugLineNum = 6684691;BA.debugLine="category = data.Get(i)";
_category = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.Get(_i)));
RDebugUtils.currentLine=6684692;
 //BA.debugLineNum = 6684692;BA.debugLine="categoryMap.Put(category.Get(\"category\"), ca";
_categorymap.Put(_category.Get((Object)("category")),_category.Get((Object)("id")));
RDebugUtils.currentLine=6684693;
 //BA.debugLineNum = 6684693;BA.debugLine="spinCategory.Add(category.Get(\"category\"))";
mostCurrent._spincategory.Add(BA.ObjectToString(_category.Get((Object)("category"))));
 }
};
 } 
       catch (Exception e23) {
			processBA.setLastException(e23);RDebugUtils.currentLine=6684696;
 //BA.debugLineNum = 6684696;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("26684696",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
RDebugUtils.currentLine=6684700;
 //BA.debugLineNum = 6684700;BA.debugLine="End Sub";
return "";
}
public static String  _spincategory_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spincategory_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spincategory_itemclick", new Object[] {_position,_value}));}
String _findbycategoryev = "";
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub spinCategory_ItemClick (Position As In";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Dim findByCategoryEV As String";
_findbycategoryev = "";
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="MsgboxAsync(\"Please choose category\", \"Search by";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose category"),BA.ObjectToCharSequence("Search by Category"),processBA);
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="findByCategoryEV = \"findEV('')\"";
_findbycategoryev = "findEV('')";
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_findbycategoryev);
 }else {
RDebugUtils.currentLine=6946828;
 //BA.debugLineNum = 6946828;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6946829;
 //BA.debugLineNum = 6946829;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6946830;
 //BA.debugLineNum = 6946830;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
RDebugUtils.currentLine=6946831;
 //BA.debugLineNum = 6946831;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6946833;
 //BA.debugLineNum = 6946833;BA.debugLine="Log(\"Searching EV with category: \"&Value)";
anywheresoftware.b4a.keywords.Common.LogImpl("26946833","Searching EV with category: "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=6946834;
 //BA.debugLineNum = 6946834;BA.debugLine="findByCategoryEV = \"findByCategoryEV('\"&category";
_findbycategoryev = "findByCategoryEV('"+BA.ObjectToString(_categorymap.Get(_value))+"')";
RDebugUtils.currentLine=6946835;
 //BA.debugLineNum = 6946835;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_findbycategoryev);
 };
RDebugUtils.currentLine=6946837;
 //BA.debugLineNum = 6946837;BA.debugLine="End Sub";
return "";
}
public static String  _spinrating_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinrating_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinrating_itemclick", new Object[] {_position,_value}));}
String _findbyratingev = "";
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub spinRating_ItemClick (Position As Int,";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim findByRatingEV As String";
_findbyratingev = "";
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="MsgboxAsync(\"Please choose rating from 1-5\", \"Se";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose rating from 1-5"),BA.ObjectToCharSequence("Search by Rating"),processBA);
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="findByRatingEV = \"findEV('')\"";
_findbyratingev = "findEV('')";
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_findbyratingev);
 }else {
RDebugUtils.currentLine=6881292;
 //BA.debugLineNum = 6881292;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6881293;
 //BA.debugLineNum = 6881293;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
RDebugUtils.currentLine=6881295;
 //BA.debugLineNum = 6881295;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6881297;
 //BA.debugLineNum = 6881297;BA.debugLine="Log(\"Searching EV with \"&Value&\" rating\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26881297","Searching EV with "+BA.ObjectToString(_value)+" rating",0);
RDebugUtils.currentLine=6881298;
 //BA.debugLineNum = 6881298;BA.debugLine="findByRatingEV = \"findByRatingEV('\"&Value&\"')\"";
_findbyratingev = "findByRatingEV('"+BA.ObjectToString(_value)+"')";
RDebugUtils.currentLine=6881299;
 //BA.debugLineNum = 6881299;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_findbyratingev);
 };
RDebugUtils.currentLine=6881301;
 //BA.debugLineNum = 6881301;BA.debugLine="End Sub";
return "";
}
public static String  _webviewev_pagefinished(String _url) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "webviewev_pagefinished", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "webviewev_pagefinished", new Object[] {_url}));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub WebViewEV_PageFinished (Url As String)";
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return "";
}
public static String  _webviewev_progresschanged(int _loading) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "webviewev_progresschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "webviewev_progresschanged", new Object[] {_loading}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub WebViewEV_ProgressChanged(loading As Int)";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="If loading == 100 Then";
if (_loading==100) { 
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Log(\"Webview loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26356994","Webview loaded",0);
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="Starter.webviewLoading = loading";
mostCurrent._starter._webviewloading /*int*/  = _loading;
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="PanelSearch.Visible = True";
mostCurrent._panelsearch.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="btnObj.Visible = True";
mostCurrent._btnobj.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="btnUserLoc.Visible = True";
mostCurrent._btnuserloc.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="btnList.Visible = True";
mostCurrent._btnlist.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="PanelRating.Visible = True";
mostCurrent._panelrating.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="PanelDate.Visible = True";
mostCurrent._paneldate.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="PanelCategory.Visible = True";
mostCurrent._panelcategory.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="UpdateLocation";
_updatelocation();
 }else {
RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="Log(\"Webview loading at \"&loading&\"% ....\")";
anywheresoftware.b4a.keywords.Common.LogImpl("26357005","Webview loading at "+BA.NumberToString(_loading)+"% ....",0);
 };
RDebugUtils.currentLine=6357007;
 //BA.debugLineNum = 6357007;BA.debugLine="End Sub";
return "";
}
}