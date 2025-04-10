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
public b4a.DesaWisataSaribu.listpackage _listpackage = null;
public b4a.DesaWisataSaribu.core _core = null;
public b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
public static String  _updatelocation() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatelocation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatelocation", null));}
String _userposition = "";
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub UpdateLocation";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Log(\"Update user position on Maps Event\")";
anywheresoftware.b4a.keywords.Common.LogImpl("65701633","Update user position on Maps Event",0);
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Log(\"Lat: \"&Starter.lat&\"; Long: \"&Starter.lng)";
anywheresoftware.b4a.keywords.Common.LogImpl("65701634","Lat: "+mostCurrent._starter._lat /*String*/ +"; Long: "+mostCurrent._starter._lng /*String*/ ,0);
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="Dim userPosition As String";
_userposition = "";
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="userPosition = \"userPositionAPI(\"&Starter.lat&\",";
_userposition = "userPositionAPI("+mostCurrent._starter._lat /*String*/ +", "+mostCurrent._starter._lng /*String*/ +")";
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, user";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_userposition);
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="Starter.mapStatus = \"EV\"";
mostCurrent._starter._mapstatus /*String*/  = "EV";
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsEV\")";
mostCurrent._mainscroll.getPanel().LoadLayout("MapsEV",mostCurrent.activityBA);
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="Navbar.Visible = False";
mostCurrent._navbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="If Navbar.Visible == False Then";
if (mostCurrent._navbar.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
mostCurrent._mainscroll.setTop((int) (mostCurrent._mainscroll.getTop()-mostCurrent._navbar.getHeight()));
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
mostCurrent._mainscroll.setHeight((int) (mostCurrent._mainscroll.getHeight()+mostCurrent._navbar.getHeight()));
 };
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="WebViewEV.Height = MainScroll.Height";
mostCurrent._webviewev.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="PanelEV.Height = MainScroll.Height";
mostCurrent._panelev.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=5439504;
 //BA.debugLineNum = 5439504;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewEV, \"We";
mostCurrent._mywebviewextras.addWebChromeClient(mostCurrent.activityBA,(android.webkit.WebView)(mostCurrent._webviewev.getObject()),"WebViewEV");
RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="WebViewEV.JavaScriptEnabled = True";
mostCurrent._webviewev.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5439506;
 //BA.debugLineNum = 5439506;BA.debugLine="WebViewEV.LoadUrl(Main.server&\"web/event/maps\")";
mostCurrent._webviewev.LoadUrl(mostCurrent._main._server /*String*/ +"web/event/maps");
RDebugUtils.currentLine=5439508;
 //BA.debugLineNum = 5439508;BA.debugLine="PanelSearch.Visible = False";
mostCurrent._panelsearch.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5439509;
 //BA.debugLineNum = 5439509;BA.debugLine="btnObj.Visible = False";
mostCurrent._btnobj.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5439510;
 //BA.debugLineNum = 5439510;BA.debugLine="btnUserLoc.Visible = False";
mostCurrent._btnuserloc.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5439511;
 //BA.debugLineNum = 5439511;BA.debugLine="btnList.Visible = False";
mostCurrent._btnlist.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5439512;
 //BA.debugLineNum = 5439512;BA.debugLine="PanelRating.Visible = False";
mostCurrent._panelrating.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5439513;
 //BA.debugLineNum = 5439513;BA.debugLine="PanelDate.Visible = False";
mostCurrent._paneldate.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5439514;
 //BA.debugLineNum = 5439514;BA.debugLine="PanelCategory.Visible = False";
mostCurrent._panelcategory.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5439516;
 //BA.debugLineNum = 5439516;BA.debugLine="spinRating.DropdownBackgroundColor = Colors.White";
mostCurrent._spinrating.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=5439517;
 //BA.debugLineNum = 5439517;BA.debugLine="spinCategory.DropdownBackgroundColor = Colors.Whi";
mostCurrent._spincategory.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=5439519;
 //BA.debugLineNum = 5439519;BA.debugLine="spinRating.AddAll(Array As String(\"Rating...\", \"1";
mostCurrent._spinrating.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Rating...","1","2","3","4","5"}));
RDebugUtils.currentLine=5439520;
 //BA.debugLineNum = 5439520;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"event/category\", \"Lo";
mostCurrent._core._executeurlget /*String*/ (mostCurrent.activityBA,mostCurrent._main._api /*String*/ +"event/category","LoadCategory",mapsev.getObject());
RDebugUtils.currentLine=5439521;
 //BA.debugLineNum = 5439521;BA.debugLine="Dialog.Initialize (Activity)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
RDebugUtils.currentLine=5439522;
 //BA.debugLineNum = 5439522;BA.debugLine="Dialog.Title = \"Select Date...\"";
mostCurrent._dialog._title /*Object*/  = (Object)("Select Date...");
RDebugUtils.currentLine=5439523;
 //BA.debugLineNum = 5439523;BA.debugLine="DateTemplate.Initialize";
mostCurrent._datetemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=5439524;
 //BA.debugLineNum = 5439524;BA.debugLine="DateTemplate.MinYear = 2000";
mostCurrent._datetemplate._minyear /*int*/  = (int) (2000);
RDebugUtils.currentLine=5439525;
 //BA.debugLineNum = 5439525;BA.debugLine="DateTemplate.MaxYear = 2050";
mostCurrent._datetemplate._maxyear /*int*/  = (int) (2050);
RDebugUtils.currentLine=5439526;
 //BA.debugLineNum = 5439526;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
RDebugUtils.currentLine=5439527;
 //BA.debugLineNum = 5439527;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="mapsev";
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._starter.getObject()),"StopGPS");
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Log(\"MapsEV Loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("65505025","MapsEV Loaded",0);
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
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
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please enable the GPS device."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._starter._gps1 /*anywheresoftware.b4a.gps.GPS*/ .getLocationSettingsIntent()));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mapsev", "activity_resume"), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="If Result Then";
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
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._starter.getObject()),"StartGPS");
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="ToastMessageShow(\"Please allow GPS to run this";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please allow GPS to run this appliation"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="Activity.Finish";
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
RDebugUtils.currentLine=5505039;
 //BA.debugLineNum = 5505039;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnback_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnback_click", null));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub BtnBack_Click";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Log(\"Going back to previous activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("65636097","Going back to previous activity",0);
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Starter.mapStatus = \"\"";
mostCurrent._starter._mapstatus /*String*/  = "";
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"\", \"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mapsev", "btndate_click"), parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._datetemplate),(Object)(""),(Object)(""),(Object)("Cancel")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="Dim selectedDate As String";
_selecteddate = "";
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Dim findByDateEV As String";
_findbydateev = "";
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="selectedDate = DateTime.Date(DateTemplate.Date)";
_selecteddate = anywheresoftware.b4a.keywords.Common.DateTime.Date(parent.mostCurrent._datetemplate._getdate /*long*/ (null));
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="btnDate.xLBL.Text = selectedDate";
parent.mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_selecteddate));
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="edtSearchEV.Text = \"\"";
parent.mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="spinRating.SelectedIndex = 0";
parent.mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="spinCategory.SelectedIndex = 0";
parent.mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="isFiltered = True";
parent._isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="Log(\"Searching EV with date: \"&selectedDate)";
anywheresoftware.b4a.keywords.Common.LogImpl("66422542","Searching EV with date: "+_selecteddate,0);
RDebugUtils.currentLine=6422543;
 //BA.debugLineNum = 6422543;BA.debugLine="findByDateEV = \"findByDateEV('\"&selectedDate&\"')";
_findbydateev = "findByDateEV('"+_selecteddate+"')";
RDebugUtils.currentLine=6422544;
 //BA.debugLineNum = 6422544;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
parent.mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(parent.mostCurrent._webviewev.getObject()),_findbydateev);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=6422546;
 //BA.debugLineNum = 6422546;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnlist_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlist_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlist_click", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub btnList_Click";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Log(\"Redirect to ListEV activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("66225921","Redirect to ListEV activity",0);
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="StartActivity(ListEV)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._listev.getObject()));
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="End Sub";
return "";
}
public static String  _btnobj_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnobj_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnobj_click", null));}
String _boundtoobject = "";
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub btnObj_Click";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Log(\"Pan to Event\")";
anywheresoftware.b4a.keywords.Common.LogImpl("65898241","Pan to Event",0);
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Dim boundToObject As String";
_boundtoobject = "";
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="If isFiltered Then";
if (_isfiltered) { 
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="boundToObject = \"findEV('')\"";
_boundtoobject = "findEV('')";
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
 }else {
RDebugUtils.currentLine=5898251;
 //BA.debugLineNum = 5898251;BA.debugLine="boundToObject = \"boundToObject(false)\"";
_boundtoobject = "boundToObject(false)";
 };
RDebugUtils.currentLine=5898253;
 //BA.debugLineNum = 5898253;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, boun";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_boundtoobject);
RDebugUtils.currentLine=5898254;
 //BA.debugLineNum = 5898254;BA.debugLine="End Sub";
return "";
}
public static String  _btnuserloc_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnuserloc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnuserloc_click", null));}
String _pantouser = "";
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub btnUserLoc_Click";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Log(\"Panning to user location\")";
anywheresoftware.b4a.keywords.Common.LogImpl("65832705","Panning to user location",0);
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="UpdateLocation";
_updatelocation();
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="Dim panToUser As String = \"panToUser()\"";
_pantouser = "panToUser()";
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, panT";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_pantouser);
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="End Sub";
return "";
}
public static String  _edtsearchev_enterpressed() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edtsearchev_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edtsearchev_enterpressed", null));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub edtSearchEV_EnterPressed";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="nameEV = edtSearchEV.Text";
_nameev = mostCurrent._edtsearchev.getText();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="FindEV";
_findev();
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="End Sub";
return "";
}
public static String  _findev() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "findev", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "findev", null));}
String _searchrg = "";
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub FindEV";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="Log(\"Searching '\"&nameEV&\"' on maps\")";
anywheresoftware.b4a.keywords.Common.LogImpl("66029318","Searching '"+_nameev+"' on maps",0);
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="Dim searchRG As String";
_searchrg = "";
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="searchRG = \"findEV('\"&nameEV&\"')\"";
_searchrg = "findEV('"+_nameev+"')";
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, sear";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_searchrg);
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("66094849","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"LoadCategory")) {
case 0: {
RDebugUtils.currentLine=6094858;
 //BA.debugLineNum = 6094858;BA.debugLine="Try";
try {RDebugUtils.currentLine=6094859;
 //BA.debugLineNum = 6094859;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6094860;
 //BA.debugLineNum = 6094860;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=6094861;
 //BA.debugLineNum = 6094861;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6094862;
 //BA.debugLineNum = 6094862;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=6094863;
 //BA.debugLineNum = 6094863;BA.debugLine="categoryMap.Initialize";
_categorymap.Initialize();
RDebugUtils.currentLine=6094864;
 //BA.debugLineNum = 6094864;BA.debugLine="spinCategory.Add(\"Category...\")";
mostCurrent._spincategory.Add("Category...");
RDebugUtils.currentLine=6094865;
 //BA.debugLineNum = 6094865;BA.debugLine="For i = 0 To data.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_data.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=6094866;
 //BA.debugLineNum = 6094866;BA.debugLine="Dim category As Map";
_category = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6094867;
 //BA.debugLineNum = 6094867;BA.debugLine="category = data.Get(i)";
_category = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.Get(_i)));
RDebugUtils.currentLine=6094868;
 //BA.debugLineNum = 6094868;BA.debugLine="categoryMap.Put(category.Get(\"category\"), ca";
_categorymap.Put(_category.Get((Object)("category")),_category.Get((Object)("id")));
RDebugUtils.currentLine=6094869;
 //BA.debugLineNum = 6094869;BA.debugLine="spinCategory.Add(category.Get(\"category\"))";
mostCurrent._spincategory.Add(BA.ObjectToString(_category.Get((Object)("category"))));
 }
};
 } 
       catch (Exception e23) {
			processBA.setLastException(e23);RDebugUtils.currentLine=6094872;
 //BA.debugLineNum = 6094872;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("66094872",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
RDebugUtils.currentLine=6094876;
 //BA.debugLineNum = 6094876;BA.debugLine="End Sub";
return "";
}
public static String  _spincategory_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spincategory_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spincategory_itemclick", new Object[] {_position,_value}));}
String _findbycategoryev = "";
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub spinCategory_ItemClick (Position As In";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Dim findByCategoryEV As String";
_findbycategoryev = "";
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="MsgboxAsync(\"Please choose category\", \"Search by";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose category"),BA.ObjectToCharSequence("Search by Category"),processBA);
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="findByCategoryEV = \"findEV('')\"";
_findbycategoryev = "findEV('')";
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_findbycategoryev);
 }else {
RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6357006;
 //BA.debugLineNum = 6357006;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
RDebugUtils.currentLine=6357007;
 //BA.debugLineNum = 6357007;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6357009;
 //BA.debugLineNum = 6357009;BA.debugLine="Log(\"Searching EV with category: \"&Value)";
anywheresoftware.b4a.keywords.Common.LogImpl("66357009","Searching EV with category: "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=6357010;
 //BA.debugLineNum = 6357010;BA.debugLine="findByCategoryEV = \"findByCategoryEV('\"&category";
_findbycategoryev = "findByCategoryEV('"+BA.ObjectToString(_categorymap.Get(_value))+"')";
RDebugUtils.currentLine=6357011;
 //BA.debugLineNum = 6357011;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_findbycategoryev);
 };
RDebugUtils.currentLine=6357013;
 //BA.debugLineNum = 6357013;BA.debugLine="End Sub";
return "";
}
public static String  _spinrating_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinrating_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinrating_itemclick", new Object[] {_position,_value}));}
String _findbyratingev = "";
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub spinRating_ItemClick (Position As Int,";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Dim findByRatingEV As String";
_findbyratingev = "";
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="MsgboxAsync(\"Please choose rating from 1-5\", \"Se";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose rating from 1-5"),BA.ObjectToCharSequence("Search by Rating"),processBA);
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
RDebugUtils.currentLine=6291465;
 //BA.debugLineNum = 6291465;BA.debugLine="findByRatingEV = \"findEV('')\"";
_findbyratingev = "findEV('')";
RDebugUtils.currentLine=6291466;
 //BA.debugLineNum = 6291466;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_findbyratingev);
 }else {
RDebugUtils.currentLine=6291468;
 //BA.debugLineNum = 6291468;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6291469;
 //BA.debugLineNum = 6291469;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
RDebugUtils.currentLine=6291470;
 //BA.debugLineNum = 6291470;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
RDebugUtils.currentLine=6291471;
 //BA.debugLineNum = 6291471;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6291473;
 //BA.debugLineNum = 6291473;BA.debugLine="Log(\"Searching EV with \"&Value&\" rating\")";
anywheresoftware.b4a.keywords.Common.LogImpl("66291473","Searching EV with "+BA.ObjectToString(_value)+" rating",0);
RDebugUtils.currentLine=6291474;
 //BA.debugLineNum = 6291474;BA.debugLine="findByRatingEV = \"findByRatingEV('\"&Value&\"')\"";
_findbyratingev = "findByRatingEV('"+BA.ObjectToString(_value)+"')";
RDebugUtils.currentLine=6291475;
 //BA.debugLineNum = 6291475;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_findbyratingev);
 };
RDebugUtils.currentLine=6291477;
 //BA.debugLineNum = 6291477;BA.debugLine="End Sub";
return "";
}
public static String  _webviewev_pagefinished(String _url) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "webviewev_pagefinished", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "webviewev_pagefinished", new Object[] {_url}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub WebViewEV_PageFinished (Url As String)";
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
public static String  _webviewev_progresschanged(int _loading) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "webviewev_progresschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "webviewev_progresschanged", new Object[] {_loading}));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub WebViewEV_ProgressChanged(loading As Int)";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="If loading == 100 Then";
if (_loading==100) { 
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Log(\"Webview loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("65767170","Webview loaded",0);
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="Starter.webviewLoading = loading";
mostCurrent._starter._webviewloading /*int*/  = _loading;
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="PanelSearch.Visible = True";
mostCurrent._panelsearch.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="btnObj.Visible = True";
mostCurrent._btnobj.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="btnUserLoc.Visible = True";
mostCurrent._btnuserloc.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="btnList.Visible = True";
mostCurrent._btnlist.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5767176;
 //BA.debugLineNum = 5767176;BA.debugLine="PanelRating.Visible = True";
mostCurrent._panelrating.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5767177;
 //BA.debugLineNum = 5767177;BA.debugLine="PanelDate.Visible = True";
mostCurrent._paneldate.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5767178;
 //BA.debugLineNum = 5767178;BA.debugLine="PanelCategory.Visible = True";
mostCurrent._panelcategory.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5767179;
 //BA.debugLineNum = 5767179;BA.debugLine="UpdateLocation";
_updatelocation();
 }else {
RDebugUtils.currentLine=5767181;
 //BA.debugLineNum = 5767181;BA.debugLine="Log(\"Webview loading at \"&loading&\"% ....\")";
anywheresoftware.b4a.keywords.Common.LogImpl("65767181","Webview loading at "+BA.NumberToString(_loading)+"% ....",0);
 };
RDebugUtils.currentLine=5767183;
 //BA.debugLineNum = 5767183;BA.debugLine="End Sub";
return "";
}
}