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
public static boolean _profiledataloaded = false;
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
public b4a.DesaWisataSaribu.register _register = null;
public b4a.DesaWisataSaribu.listpackage _listpackage = null;
public b4a.DesaWisataSaribu.core _core = null;
public b4a.DesaWisataSaribu.cart _cart = null;
public b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Activity.LoadLayout(\"MainScrollView\") ' Muat layo";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="MainScroll.Panel.LoadLayout(\"HomeUser\") ' Muat la";
mostCurrent._mainscroll.getPanel().LoadLayout("HomeUser",mostCurrent.activityBA);
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="PanelHome.Height = MainScroll.Height ' Sesuaikan";
mostCurrent._panelhome.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height ' Ses";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="TitleNavbar.Text=\"Home User\" ' Set judul navbar";
mostCurrent._titlenavbar.setText(BA.ObjectToCharSequence("Home User"));
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="BtnBack.Visible = False ' Sembunyikan tombol kemb";
mostCurrent._btnback.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="profileDataLoaded = False";
_profiledataloaded = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="homeuser";
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
String _userid = "";
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Log(\"HomeUser loaded (Resume)\")";
anywheresoftware.b4a.keywords.Common.LogImpl("24718593","HomeUser loaded (Resume)",0);
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="Dim userId As String = Main.manager.GetString(\"us";
_userid = mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .GetString("user_id");
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="If userId <> \"\" And Not(profileDataLoaded) Then";
if ((_userid).equals("") == false && anywheresoftware.b4a.keywords.Common.Not(_profiledataloaded)) { 
RDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="Log(\"User ID found: \" & userId & \". Profile data";
anywheresoftware.b4a.keywords.Common.LogImpl("24718600","User ID found: "+_userid+". Profile data not loaded yet. Fetching profile...",0);
RDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="Core.ExecuteUrlGet(Main.API & \"user/\" & userId,";
mostCurrent._core._executeurlget /*String*/ (mostCurrent.activityBA,mostCurrent._main._api /*String*/ +"user/"+_userid,"Profile",homeuser.getObject());
 }else 
{RDebugUtils.currentLine=4718602;
 //BA.debugLineNum = 4718602;BA.debugLine="Else If userId = \"\" Then";
if ((_userid).equals("")) { 
RDebugUtils.currentLine=4718603;
 //BA.debugLineNum = 4718603;BA.debugLine="Log(\"User ID not found in manager. Cannot fetch";
anywheresoftware.b4a.keywords.Common.LogImpl("24718603","User ID not found in manager. Cannot fetch profile.",0);
RDebugUtils.currentLine=4718605;
 //BA.debugLineNum = 4718605;BA.debugLine="ToastMessageShow(\"Sesi tidak valid, silakan logi";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Sesi tidak valid, silakan login kembali."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4718607;
 //BA.debugLineNum = 4718607;BA.debugLine="StartActivity(Main) ' Kembali ke activity Main/L";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 }else {
RDebugUtils.currentLine=4718609;
 //BA.debugLineNum = 4718609;BA.debugLine="Log(\"Profile data already loaded. Skipping API c";
anywheresoftware.b4a.keywords.Common.LogImpl("24718609","Profile data already loaded. Skipping API call.",0);
 }}
;
RDebugUtils.currentLine=4718613;
 //BA.debugLineNum = 4718613;BA.debugLine="End Sub";
return "";
}
public static String  _btnback_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnback_click", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub BtnBack_Click";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Activity.Finish ' Kembali ke activity sebelumnya";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return "";
}
public static String  _btncart_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncart_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncart_click", null));}
RDebugUtils.currentLine=42270720;
 //BA.debugLineNum = 42270720;BA.debugLine="Private Sub btnCart_Click";
RDebugUtils.currentLine=42270721;
 //BA.debugLineNum = 42270721;BA.debugLine="Log(\"Redirect to Cart Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("242270721","Redirect to Cart Activity",0);
RDebugUtils.currentLine=42270722;
 //BA.debugLineNum = 42270722;BA.debugLine="StartActivity(Cart)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._cart.getObject()));
RDebugUtils.currentLine=42270723;
 //BA.debugLineNum = 42270723;BA.debugLine="End Sub";
return "";
}
public static String  _btngemma_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btngemma_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btngemma_click", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub BtnGemma_Click";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Log(\"Redirect to Gemma Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("25111809","Redirect to Gemma Activity",0);
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="StartActivity(Gemma)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._gemma.getObject()));
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="End Sub";
return "";
}
public static void  _btnlogout_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogout_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnlogout_click", null); return;}
ResumableSub_BtnLogout_Click rsub = new ResumableSub_BtnLogout_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BtnLogout_Click extends BA.ResumableSub {
public ResumableSub_BtnLogout_Click(b4a.DesaWisataSaribu.homeuser parent) {
this.parent = parent;
}
b4a.DesaWisataSaribu.homeuser parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="homeuser";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Log(\"Attempting to logout...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("24980737","Attempting to logout...",0);
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Msgbox2Async(\"Are you sure you want to log out?\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Are you sure you want to log out?"),BA.ObjectToCharSequence("Confirm Logout"),"Yes","","No",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "homeuser", "btnlogout_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="Log(\"Logout confirmed. Calling API...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("24980742","Logout confirmed. Calling API...",0);
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Core.ExecuteUrlGet(Main.API & \"logout\", \"Logout\"";
parent.mostCurrent._core._executeurlget /*String*/ (mostCurrent.activityBA,parent.mostCurrent._main._api /*String*/ +"logout","Logout",homeuser.getObject());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="Log(\"Logout cancelled.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("24980745","Logout cancelled.",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnpackage_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnpackage_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnpackage_click", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub BtnPackage_Click";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Log(\"Redirect to List Package\")";
anywheresoftware.b4a.keywords.Common.LogImpl("25046273","Redirect to List Package",0);
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="StartActivity(ListPackage)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._listpackage.getObject()));
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="End Sub";
return "";
}
public static String  _btnrg_click() throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnrg_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnrg_click", null));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub BtnRG_Click";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Log(\"Redirect to MapsRG Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("24915201","Redirect to MapsRG Activity",0);
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="StartActivity(MapsRG)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._mapsrg.getObject()));
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSaribu.httpjob _job) throws Exception{
RDebugUtils.currentModule="homeuser";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.Map _profiledata = null;
String _tempusername = "";
String _tempfirstname = "";
String _templastname = "";
String _tempavatar = "";
String _validfirstname = "";
String _validlastname = "";
String _trimmedfirstname = "";
String _trimmedlastname = "";
String _fullname = "";
boolean _isavatarvalid = false;
String _trimmedavatar = "";
anywheresoftware.b4a.objects.collections.Map _avatarmap = null;
String _avatarpath = "";
anywheresoftware.b4a.objects.collections.JSONParser _errorparser = null;
anywheresoftware.b4a.objects.collections.Map _errormap = null;
String _errormsg = "";
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("24849665","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="Log(\"Response from server :\"&res)";
anywheresoftware.b4a.keywords.Common.LogImpl("24849671","Response from server :"+_res,0);
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"Profile","Logout")) {
case 0: {
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="Try";
try {RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="Dim profileData As Map ' Gunakan variabel lok";
_profiledata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="profileData = map.Get(\"data\")";
_profiledata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="If profileData = Null Then";
if (_profiledata== null) { 
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="Log(\"Error: 'data' field is null in profile";
anywheresoftware.b4a.keywords.Common.LogImpl("24849680","Error: 'data' field is null in profile response.",0);
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="profileDataLoaded = False ' Gagal memuat";
_profiledataloaded = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="Return ' Keluar jika data null";
if (true) return "";
 };
RDebugUtils.currentLine=4849687;
 //BA.debugLineNum = 4849687;BA.debugLine="Dim tempUsername As String = profileData.Get(";
_tempusername = BA.ObjectToString(_profiledata.Get((Object)("username")));
RDebugUtils.currentLine=4849688;
 //BA.debugLineNum = 4849688;BA.debugLine="Dim tempFirstName As String = profileData.Get";
_tempfirstname = BA.ObjectToString(_profiledata.Get((Object)("first_name")));
RDebugUtils.currentLine=4849689;
 //BA.debugLineNum = 4849689;BA.debugLine="Dim tempLastName As String = profileData.Get(";
_templastname = BA.ObjectToString(_profiledata.Get((Object)("last_name")));
RDebugUtils.currentLine=4849690;
 //BA.debugLineNum = 4849690;BA.debugLine="Dim tempAvatar As String = profileData.Get(\"a";
_tempavatar = BA.ObjectToString(_profiledata.Get((Object)("avatar")));
RDebugUtils.currentLine=4849694;
 //BA.debugLineNum = 4849694;BA.debugLine="Dim validFirstName As String = \"\"";
_validfirstname = "";
RDebugUtils.currentLine=4849695;
 //BA.debugLineNum = 4849695;BA.debugLine="Dim validLastName As String = \"\"";
_validlastname = "";
RDebugUtils.currentLine=4849697;
 //BA.debugLineNum = 4849697;BA.debugLine="If tempFirstName <> Null Then";
if (_tempfirstname!= null) { 
RDebugUtils.currentLine=4849698;
 //BA.debugLineNum = 4849698;BA.debugLine="Dim trimmedFirstName As String = tempFirstNa";
_trimmedfirstname = _tempfirstname.trim();
RDebugUtils.currentLine=4849699;
 //BA.debugLineNum = 4849699;BA.debugLine="If trimmedFirstName <> \"\" And trimmedFirstNa";
if ((_trimmedfirstname).equals("") == false && (_trimmedfirstname.toLowerCase()).equals("null") == false) { 
RDebugUtils.currentLine=4849700;
 //BA.debugLineNum = 4849700;BA.debugLine="validFirstName = tempFirstName";
_validfirstname = _tempfirstname;
 };
 };
RDebugUtils.currentLine=4849704;
 //BA.debugLineNum = 4849704;BA.debugLine="If tempLastName <> Null Then";
if (_templastname!= null) { 
RDebugUtils.currentLine=4849705;
 //BA.debugLineNum = 4849705;BA.debugLine="Dim trimmedLastName As String = tempLastName";
_trimmedlastname = _templastname.trim();
RDebugUtils.currentLine=4849706;
 //BA.debugLineNum = 4849706;BA.debugLine="If trimmedLastName <> \"\" And trimmedLastName";
if ((_trimmedlastname).equals("") == false && (_trimmedlastname.toLowerCase()).equals("null") == false) { 
RDebugUtils.currentLine=4849707;
 //BA.debugLineNum = 4849707;BA.debugLine="validLastName = tempLastName";
_validlastname = _templastname;
 };
 };
RDebugUtils.currentLine=4849711;
 //BA.debugLineNum = 4849711;BA.debugLine="Dim fullName As String = \"\"";
_fullname = "";
RDebugUtils.currentLine=4849712;
 //BA.debugLineNum = 4849712;BA.debugLine="If validFirstName <> \"\" Then fullName = valid";
if ((_validfirstname).equals("") == false) { 
_fullname = _validfirstname;};
RDebugUtils.currentLine=4849713;
 //BA.debugLineNum = 4849713;BA.debugLine="If validLastName <> \"\" Then";
if ((_validlastname).equals("") == false) { 
RDebugUtils.currentLine=4849714;
 //BA.debugLineNum = 4849714;BA.debugLine="If fullName <> \"\" Then fullName = fullName &";
if ((_fullname).equals("") == false) { 
_fullname = _fullname+" "+_validlastname;};
 }else {
RDebugUtils.currentLine=4849716;
 //BA.debugLineNum = 4849716;BA.debugLine="fullName = validLastName";
_fullname = _validlastname;
 };
RDebugUtils.currentLine=4849719;
 //BA.debugLineNum = 4849719;BA.debugLine="LabelName.Text = fullName";
mostCurrent._labelname.setText(BA.ObjectToCharSequence(_fullname));
RDebugUtils.currentLine=4849720;
 //BA.debugLineNum = 4849720;BA.debugLine="LabelUsername.Text = \"@\" & tempUsername ' Gun";
mostCurrent._labelusername.setText(BA.ObjectToCharSequence("@"+_tempusername));
RDebugUtils.currentLine=4849724;
 //BA.debugLineNum = 4849724;BA.debugLine="Dim isAvatarValid As Boolean = False";
_isavatarvalid = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4849725;
 //BA.debugLineNum = 4849725;BA.debugLine="If tempAvatar <> Null Then";
if (_tempavatar!= null) { 
RDebugUtils.currentLine=4849726;
 //BA.debugLineNum = 4849726;BA.debugLine="Dim trimmedAvatar As String = tempAvatar.Tri";
_trimmedavatar = _tempavatar.trim();
RDebugUtils.currentLine=4849727;
 //BA.debugLineNum = 4849727;BA.debugLine="If trimmedAvatar <> \"\" And trimmedAvatar.ToL";
if ((_trimmedavatar).equals("") == false && (_trimmedavatar.toLowerCase()).equals("null") == false) { 
RDebugUtils.currentLine=4849728;
 //BA.debugLineNum = 4849728;BA.debugLine="isAvatarValid = True";
_isavatarvalid = anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=4849733;
 //BA.debugLineNum = 4849733;BA.debugLine="If isAvatarValid Then";
if (_isavatarvalid) { 
RDebugUtils.currentLine=4849734;
 //BA.debugLineNum = 4849734;BA.debugLine="Log(\"Avatar check passed. Avatar value: \"\"\"";
anywheresoftware.b4a.keywords.Common.LogImpl("24849734","Avatar check passed. Avatar value: \""+_tempavatar+"\". Attempting download.",0);
RDebugUtils.currentLine=4849735;
 //BA.debugLineNum = 4849735;BA.debugLine="Dim avatarMap As Map";
_avatarmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4849736;
 //BA.debugLineNum = 4849736;BA.debugLine="Dim avatarPath As String";
_avatarpath = "";
RDebugUtils.currentLine=4849737;
 //BA.debugLineNum = 4849737;BA.debugLine="avatarPath = Main.server & \"media/photos/\" &";
_avatarpath = mostCurrent._main._server /*String*/ +"media/photos/"+_tempavatar;
RDebugUtils.currentLine=4849738;
 //BA.debugLineNum = 4849738;BA.debugLine="Log(\"Attempting to download avatar from: \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("24849738","Attempting to download avatar from: "+_avatarpath,0);
RDebugUtils.currentLine=4849739;
 //BA.debugLineNum = 4849739;BA.debugLine="avatarMap.Initialize";
_avatarmap.Initialize();
RDebugUtils.currentLine=4849740;
 //BA.debugLineNum = 4849740;BA.debugLine="avatarMap.Put(ProfileAvatar, avatarPath)";
_avatarmap.Put((Object)(mostCurrent._profileavatar.getObject()),(Object)(_avatarpath));
RDebugUtils.currentLine=4849741;
 //BA.debugLineNum = 4849741;BA.debugLine="CallSubDelayed2(Starter, \"Download\", avatarM";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._starter.getObject()),"Download",(Object)(_avatarmap));
 }else {
RDebugUtils.currentLine=4849743;
 //BA.debugLineNum = 4849743;BA.debugLine="Log(\"Avatar check failed. Avatar is Null, em";
anywheresoftware.b4a.keywords.Common.LogImpl("24849743","Avatar check failed. Avatar is Null, empty string, or the string \"null\". Skipping download.",0);
 };
RDebugUtils.currentLine=4849748;
 //BA.debugLineNum = 4849748;BA.debugLine="profileDataLoaded = True  ' Tandai bahwa data";
_profiledataloaded = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4849749;
 //BA.debugLineNum = 4849749;BA.debugLine="Log(\"Profile data successfully processed and";
anywheresoftware.b4a.keywords.Common.LogImpl("24849749","Profile data successfully processed and loaded.",0);
 } 
       catch (Exception e69) {
			processBA.setLastException(e69);RDebugUtils.currentLine=4849753;
 //BA.debugLineNum = 4849753;BA.debugLine="Log(\"Error processing profile data: \" & LastE";
anywheresoftware.b4a.keywords.Common.LogImpl("24849753","Error processing profile data: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=4849754;
 //BA.debugLineNum = 4849754;BA.debugLine="profileDataLoaded = False ' Set false jika ad";
_profiledataloaded = anywheresoftware.b4a.keywords.Common.False;
 };
 break; }
case 1: {
RDebugUtils.currentLine=4849758;
 //BA.debugLineNum = 4849758;BA.debugLine="Try";
try {RDebugUtils.currentLine=4849759;
 //BA.debugLineNum = 4849759;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4849760;
 //BA.debugLineNum = 4849760;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=4849761;
 //BA.debugLineNum = 4849761;BA.debugLine="status = map.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_map.Get((Object)("status"))));
RDebugUtils.currentLine=4849762;
 //BA.debugLineNum = 4849762;BA.debugLine="If status == 200 Then";
if (_status==200) { 
RDebugUtils.currentLine=4849763;
 //BA.debugLineNum = 4849763;BA.debugLine="MsgboxAsync(\"Successfully logged out\", \"Log";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Successfully logged out"),BA.ObjectToCharSequence("Log Out"),processBA);
RDebugUtils.currentLine=4849764;
 //BA.debugLineNum = 4849764;BA.debugLine="Main.manager.SetBoolean(\"is_login\", False)";
mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4849765;
 //BA.debugLineNum = 4849765;BA.debugLine="Main.manager.SetBoolean(\"visitor\", False)";
mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4849766;
 //BA.debugLineNum = 4849766;BA.debugLine="Main.manager.SetBoolean(\"user\", False)";
mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .SetBoolean("user",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4849767;
 //BA.debugLineNum = 4849767;BA.debugLine="Main.manager.SetString(\"user_id\", \"\") ' Koso";
mostCurrent._main._manager /*de.amberhome.objects.preferenceactivity.PreferenceManager*/ .SetString("user_id","");
RDebugUtils.currentLine=4849768;
 //BA.debugLineNum = 4849768;BA.debugLine="Log(\"Successfully logged out\")";
anywheresoftware.b4a.keywords.Common.LogImpl("24849768","Successfully logged out",0);
RDebugUtils.currentLine=4849769;
 //BA.debugLineNum = 4849769;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4849770;
 //BA.debugLineNum = 4849770;BA.debugLine="StartActivity(Main) ' Kembali ke activity Ma";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 }else {
RDebugUtils.currentLine=4849772;
 //BA.debugLineNum = 4849772;BA.debugLine="MsgboxAsync(\"Logout failed. Status: \" & stat";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Logout failed. Status: "+BA.NumberToString(_status)),BA.ObjectToCharSequence("Log Out Error"),processBA);
 };
 } 
       catch (Exception e90) {
			processBA.setLastException(e90);RDebugUtils.currentLine=4849775;
 //BA.debugLineNum = 4849775;BA.debugLine="Log(\"Error processing logout response: \" & La";
anywheresoftware.b4a.keywords.Common.LogImpl("24849775","Error processing logout response: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=4849776;
 //BA.debugLineNum = 4849776;BA.debugLine="MsgboxAsync(\"Error during logout process.\", \"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Error during logout process."),BA.ObjectToCharSequence("Log Out Error"),processBA);
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=4849781;
 //BA.debugLineNum = 4849781;BA.debugLine="Dim errorParser As JSONParser";
_errorparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4849782;
 //BA.debugLineNum = 4849782;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
_errorparser.Initialize(_job._errormessage /*String*/ );
RDebugUtils.currentLine=4849783;
 //BA.debugLineNum = 4849783;BA.debugLine="Dim errorMap As Map";
_errormap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4849784;
 //BA.debugLineNum = 4849784;BA.debugLine="errorMap = errorParser.NextObject";
_errormap = _errorparser.NextObject();
RDebugUtils.currentLine=4849785;
 //BA.debugLineNum = 4849785;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("24849785","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=4849787;
 //BA.debugLineNum = 4849787;BA.debugLine="Dim errorMsg As String = \"Unknown error\"";
_errormsg = "Unknown error";
RDebugUtils.currentLine=4849788;
 //BA.debugLineNum = 4849788;BA.debugLine="If errorMap <> Null And errorMap.ContainsKey(\"me";
if (_errormap!= null && _errormap.ContainsKey((Object)("message"))) { 
RDebugUtils.currentLine=4849789;
 //BA.debugLineNum = 4849789;BA.debugLine="errorMsg = errorMap.Get(\"message\")";
_errormsg = BA.ObjectToString(_errormap.Get((Object)("message")));
 }else 
{RDebugUtils.currentLine=4849790;
 //BA.debugLineNum = 4849790;BA.debugLine="Else if Job.ErrorMessage.Contains(\"java.net.\") T";
if (_job._errormessage /*String*/ .contains("java.net.")) { 
RDebugUtils.currentLine=4849791;
 //BA.debugLineNum = 4849791;BA.debugLine="errorMsg = \"Network error. Please check your co";
_errormsg = "Network error. Please check your connection.";
 }}
;
RDebugUtils.currentLine=4849794;
 //BA.debugLineNum = 4849794;BA.debugLine="ToastMessageShow(\"Error: \" & errorMsg, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_errormsg),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4849797;
 //BA.debugLineNum = 4849797;BA.debugLine="If Job.JobName = \"Profile\" Then";
if ((_job._jobname /*String*/ ).equals("Profile")) { 
RDebugUtils.currentLine=4849798;
 //BA.debugLineNum = 4849798;BA.debugLine="profileDataLoaded = False ' Set false agar bisa";
_profiledataloaded = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4849799;
 //BA.debugLineNum = 4849799;BA.debugLine="Log(\"API call for Profile failed. Flag reset to";
anywheresoftware.b4a.keywords.Common.LogImpl("24849799","API call for Profile failed. Flag reset to false.",0);
 };
 };
RDebugUtils.currentLine=4849803;
 //BA.debugLineNum = 4849803;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=4849804;
 //BA.debugLineNum = 4849804;BA.debugLine="End Sub";
return "";
}
}