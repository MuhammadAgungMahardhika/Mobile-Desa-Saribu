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

public class register extends Activity implements B4AActivity{
	public static register mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.DesaWisataSaribu", "b4a.DesaWisataSaribu.register");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (register).");
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
		activityBA = new BA(this, layout, processBA, "b4a.DesaWisataSaribu", "b4a.DesaWisataSaribu.register");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSaribu.register", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (register) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (register) Resume **");
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
		return register.class;
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
            BA.LogInfo("** Activity (register) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (register) Pause event (activity is not paused). **");
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
            register mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (register) Resume **");
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
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editfirstname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editlastname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editemail = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editpassword = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editconfirmpassword = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnregister = null;
public static String _sessionid = "";
public static String _csrftoken = "";
public de.amberhome.objects.preferenceactivity.PreferenceManager _manager = null;
public anywheresoftware.b4a.objects.PanelWrapper _panellogin = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSaribu.main _main = null;
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
public b4a.DesaWisataSaribu.cart _cart = null;
public b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="register";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="MainScroll.Panel.LoadLayout(\"login - copy\")";
mostCurrent._mainscroll.getPanel().LoadLayout("login - copy",mostCurrent.activityBA);
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="Navbar.Visible = False";
mostCurrent._navbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="If Navbar.Visible == False Then";
if (mostCurrent._navbar.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
mostCurrent._mainscroll.setTop((int) (mostCurrent._mainscroll.getTop()-mostCurrent._navbar.getHeight()));
RDebugUtils.currentLine=8585224;
 //BA.debugLineNum = 8585224;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
mostCurrent._mainscroll.setHeight((int) (mostCurrent._mainscroll.getHeight()+mostCurrent._navbar.getHeight()));
 };
RDebugUtils.currentLine=8585227;
 //BA.debugLineNum = 8585227;BA.debugLine="PanelLogin.Height = MainScroll.Height";
mostCurrent._panellogin.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=8585228;
 //BA.debugLineNum = 8585228;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=8585230;
 //BA.debugLineNum = 8585230;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="register";
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="register";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return "";
}
public static String  _btnregister_click() throws Exception{
RDebugUtils.currentModule="register";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnregister_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnregister_click", null));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Private Sub BtnRegister_Click";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Core.ExecuteUrl(Main.API&\"register\", \"username=\"&";
mostCurrent._core._executeurl /*String*/ (mostCurrent.activityBA,mostCurrent._main._api /*String*/ +"register","username="+mostCurrent._editusername.getText()+"&first_name="+mostCurrent._editfirstname.getText()+"&last_name="+mostCurrent._editlastname.getText()+"&email="+mostCurrent._editemail.getText()+"&password="+mostCurrent._editpassword.getText()+"&confirm_password="+mostCurrent._editconfirmpassword.getText()+"&role_id="+"2","Register",register.getObject());
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSaribu.httpjob _job) throws Exception{
RDebugUtils.currentModule="register";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
int _status = 0;
Object _message = null;
String _messagestring = "";
anywheresoftware.b4a.objects.collections.List _templist = null;
anywheresoftware.b4a.objects.collections.Map _errormap = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sberrors = null;
String _key = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
String _id = "";
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="Log(\"JobDone: JobName = \" & Job.JobName & \", Succ";
anywheresoftware.b4a.keywords.Common.LogImpl("28847365","JobDone: JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="If Job.JobName = \"Register\" Then";
if ((_job._jobname /*String*/ ).equals("Register")) { 
RDebugUtils.currentLine=8847372;
 //BA.debugLineNum = 8847372;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=8847374;
 //BA.debugLineNum = 8847374;BA.debugLine="Try";
try {RDebugUtils.currentLine=8847375;
 //BA.debugLineNum = 8847375;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=8847376;
 //BA.debugLineNum = 8847376;BA.debugLine="res = Job.GetString ' Get the response body as";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=8847377;
 //BA.debugLineNum = 8847377;BA.debugLine="Log(\"Response from server (Register Job): \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("28847377","Response from server (Register Job): "+_res,0);
RDebugUtils.currentLine=8847380;
 //BA.debugLineNum = 8847380;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=8847381;
 //BA.debugLineNum = 8847381;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=8847382;
 //BA.debugLineNum = 8847382;BA.debugLine="Dim map As Map = parser.NextObject ' Get the r";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _parser.NextObject();
RDebugUtils.currentLine=8847385;
 //BA.debugLineNum = 8847385;BA.debugLine="Dim status As Int = map.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_map.Get((Object)("status"))));
RDebugUtils.currentLine=8847386;
 //BA.debugLineNum = 8847386;BA.debugLine="Dim message As Object = map.Get(\"message\")";
_message = _map.Get((Object)("message"));
RDebugUtils.currentLine=8847387;
 //BA.debugLineNum = 8847387;BA.debugLine="Dim messageString As String";
_messagestring = "";
RDebugUtils.currentLine=8847390;
 //BA.debugLineNum = 8847390;BA.debugLine="If message Is String Then";
if (_message instanceof String) { 
RDebugUtils.currentLine=8847391;
 //BA.debugLineNum = 8847391;BA.debugLine="messageString = message";
_messagestring = BA.ObjectToString(_message);
 }else 
{RDebugUtils.currentLine=8847392;
 //BA.debugLineNum = 8847392;BA.debugLine="Else If message Is List Then";
if (_message instanceof java.util.List) { 
RDebugUtils.currentLine=8847394;
 //BA.debugLineNum = 8847394;BA.debugLine="Dim tempList As List = message";
_templist = new anywheresoftware.b4a.objects.collections.List();
_templist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_message));
RDebugUtils.currentLine=8847395;
 //BA.debugLineNum = 8847395;BA.debugLine="If tempList.Size > 0 Then";
if (_templist.getSize()>0) { 
RDebugUtils.currentLine=8847396;
 //BA.debugLineNum = 8847396;BA.debugLine="messageString = tempList.Get(0) ' Ambil pesa";
_messagestring = BA.ObjectToString(_templist.Get((int) (0)));
 }else {
RDebugUtils.currentLine=8847398;
 //BA.debugLineNum = 8847398;BA.debugLine="messageString = \"Received an empty success m";
_messagestring = "Received an empty success message list.";
 };
RDebugUtils.currentLine=8847400;
 //BA.debugLineNum = 8847400;BA.debugLine="Log(\"Message field is a List: \" & message)";
anywheresoftware.b4a.keywords.Common.LogImpl("28847400","Message field is a List: "+BA.ObjectToString(_message),0);
 }else 
{RDebugUtils.currentLine=8847401;
 //BA.debugLineNum = 8847401;BA.debugLine="Else If message Is Map Then";
if (_message instanceof java.util.Map) { 
RDebugUtils.currentLine=8847403;
 //BA.debugLineNum = 8847403;BA.debugLine="Dim errorMap As Map = message";
_errormap = new anywheresoftware.b4a.objects.collections.Map();
_errormap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_message));
RDebugUtils.currentLine=8847404;
 //BA.debugLineNum = 8847404;BA.debugLine="Dim sbErrors As StringBuilder";
_sberrors = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=8847405;
 //BA.debugLineNum = 8847405;BA.debugLine="sbErrors.Initialize";
_sberrors.Initialize();
RDebugUtils.currentLine=8847406;
 //BA.debugLineNum = 8847406;BA.debugLine="For Each key As String In errorMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group29 = _errormap.Keys();
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_key = BA.ObjectToString(group29.Get(index29));
RDebugUtils.currentLine=8847407;
 //BA.debugLineNum = 8847407;BA.debugLine="sbErrors.Append(key).Append(\": \").Append(err";
_sberrors.Append(_key).Append(": ").Append(BA.ObjectToString(_errormap.Get((Object)(_key)))).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 }
};
RDebugUtils.currentLine=8847409;
 //BA.debugLineNum = 8847409;BA.debugLine="messageString = sbErrors.ToString ' String be";
_messagestring = _sberrors.ToString();
RDebugUtils.currentLine=8847410;
 //BA.debugLineNum = 8847410;BA.debugLine="Log(\"Message field is a Map (Validation Error";
anywheresoftware.b4a.keywords.Common.LogImpl("28847410","Message field is a Map (Validation Errors): "+BA.ObjectToString(_message),0);
 }else {
RDebugUtils.currentLine=8847413;
 //BA.debugLineNum = 8847413;BA.debugLine="messageString = \"Unknown or null message form";
_messagestring = "Unknown or null message format received from server.";
RDebugUtils.currentLine=8847414;
 //BA.debugLineNum = 8847414;BA.debugLine="Log(\"Message field has an unexpected type or";
anywheresoftware.b4a.keywords.Common.LogImpl("28847414","Message field has an unexpected type or is null.",0);
 }}}
;
RDebugUtils.currentLine=8847418;
 //BA.debugLineNum = 8847418;BA.debugLine="If status = 201 Then ' Assuming 201 means succ";
if (_status==201) { 
RDebugUtils.currentLine=8847420;
 //BA.debugLineNum = 8847420;BA.debugLine="ToastMessageShow(\"Registration Successful!\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Registration Successful!"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8847423;
 //BA.debugLineNum = 8847423;BA.debugLine="Log(\"Account created\")";
anywheresoftware.b4a.keywords.Common.LogImpl("28847423","Account created",0);
RDebugUtils.currentLine=8847424;
 //BA.debugLineNum = 8847424;BA.debugLine="Log(map) ' Log map untuk debugging";
anywheresoftware.b4a.keywords.Common.LogImpl("28847424",BA.ObjectToString(_map),0);
RDebugUtils.currentLine=8847426;
 //BA.debugLineNum = 8847426;BA.debugLine="If map.ContainsKey(\"data\") Then";
if (_map.ContainsKey((Object)("data"))) { 
RDebugUtils.currentLine=8847427;
 //BA.debugLineNum = 8847427;BA.debugLine="Dim data As Map = map.Get(\"data\")";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=8847428;
 //BA.debugLineNum = 8847428;BA.debugLine="If data <> Null And data.IsInitialized Then";
if (_data!= null && _data.IsInitialized()) { 
RDebugUtils.currentLine=8847429;
 //BA.debugLineNum = 8847429;BA.debugLine="If data.ContainsKey(\"session_id\") Then";
if (_data.ContainsKey((Object)("session_id"))) { 
RDebugUtils.currentLine=8847430;
 //BA.debugLineNum = 8847430;BA.debugLine="Dim sessionID As String = data.Get(\"sessio";
mostCurrent._sessionid = BA.ObjectToString(_data.Get((Object)("session_id")));
RDebugUtils.currentLine=8847431;
 //BA.debugLineNum = 8847431;BA.debugLine="manager.SetString(\"session_id\", sessionID)";
mostCurrent._manager.SetString("session_id",mostCurrent._sessionid);
 };
RDebugUtils.currentLine=8847433;
 //BA.debugLineNum = 8847433;BA.debugLine="If data.ContainsKey(\"csrf_token\") Then";
if (_data.ContainsKey((Object)("csrf_token"))) { 
RDebugUtils.currentLine=8847434;
 //BA.debugLineNum = 8847434;BA.debugLine="Dim csrfToken As String = data.Get(\"csrf_t";
mostCurrent._csrftoken = BA.ObjectToString(_data.Get((Object)("csrf_token")));
RDebugUtils.currentLine=8847435;
 //BA.debugLineNum = 8847435;BA.debugLine="manager.SetString(\"csrf_token\", csrfToken)";
mostCurrent._manager.SetString("csrf_token",mostCurrent._csrftoken);
 };
RDebugUtils.currentLine=8847437;
 //BA.debugLineNum = 8847437;BA.debugLine="If data.ContainsKey(\"id\") Then";
if (_data.ContainsKey((Object)("id"))) { 
RDebugUtils.currentLine=8847438;
 //BA.debugLineNum = 8847438;BA.debugLine="Dim id As String = data.Get(\"id\")";
_id = BA.ObjectToString(_data.Get((Object)("id")));
RDebugUtils.currentLine=8847439;
 //BA.debugLineNum = 8847439;BA.debugLine="manager.SetString(\"user_id\", id)";
mostCurrent._manager.SetString("user_id",_id);
 };
 }else {
RDebugUtils.currentLine=8847442;
 //BA.debugLineNum = 8847442;BA.debugLine="Log(\"Data field received but is null or not";
anywheresoftware.b4a.keywords.Common.LogImpl("28847442","Data field received but is null or not initialized.",0);
 };
 }else {
RDebugUtils.currentLine=8847445;
 //BA.debugLineNum = 8847445;BA.debugLine="Log(\"Data field not found in the successful";
anywheresoftware.b4a.keywords.Common.LogImpl("28847445","Data field not found in the successful response.",0);
 };
RDebugUtils.currentLine=8847450;
 //BA.debugLineNum = 8847450;BA.debugLine="manager.SetBoolean(\"is_login\", False)";
mostCurrent._manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8847451;
 //BA.debugLineNum = 8847451;BA.debugLine="manager.SetBoolean(\"user\", True)";
mostCurrent._manager.SetBoolean("user",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8847452;
 //BA.debugLineNum = 8847452;BA.debugLine="manager.SetBoolean(\"visitor\", False)";
mostCurrent._manager.SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8847455;
 //BA.debugLineNum = 8847455;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=8847456;
 //BA.debugLineNum = 8847456;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 }else {
RDebugUtils.currentLine=8847461;
 //BA.debugLineNum = 8847461;BA.debugLine="ToastMessageShow(\"Registration Failed. See de";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Registration Failed. See details."),anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e72) {
			processBA.setLastException(e72);RDebugUtils.currentLine=8847465;
 //BA.debugLineNum = 8847465;BA.debugLine="Log(\"Error processing server response (Registe";
anywheresoftware.b4a.keywords.Common.LogImpl("28847465","Error processing server response (Register Job):",0);
RDebugUtils.currentLine=8847466;
 //BA.debugLineNum = 8847466;BA.debugLine="Log(LastException) ' Log the full exception de";
anywheresoftware.b4a.keywords.Common.LogImpl("28847466",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=8847469;
 //BA.debugLineNum = 8847469;BA.debugLine="ToastMessageShow(\"Error processing response.\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error processing response."),anywheresoftware.b4a.keywords.Common.True);
 };
 }else {
RDebugUtils.currentLine=8847473;
 //BA.debugLineNum = 8847473;BA.debugLine="Log(\"Error in Register Job: \" & Job.ErrorMessag";
anywheresoftware.b4a.keywords.Common.LogImpl("28847473","Error in Register Job: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=8847476;
 //BA.debugLineNum = 8847476;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage,";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage /*String*/ ),anywheresoftware.b4a.keywords.Common.True);
 };
 }else {
RDebugUtils.currentLine=8847483;
 //BA.debugLineNum = 8847483;BA.debugLine="Log(\"JobDone received for unexpected JobName: \"";
anywheresoftware.b4a.keywords.Common.LogImpl("28847483","JobDone received for unexpected JobName: "+_job._jobname /*String*/ ,0);
 };
RDebugUtils.currentLine=8847487;
 //BA.debugLineNum = 8847487;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=8847488;
 //BA.debugLineNum = 8847488;BA.debugLine="End Sub";
return "";
}
}