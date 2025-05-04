package b4a.DesaWisataSaribu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homeuser_subs_2 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homeuser) ","homeuser",6,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,49);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSaribu.homeuser.remoteMe.runUserSub(false, "homeuser","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="Activity.LoadLayout(\"MainScrollView\") ' Muat layo";
Debug.ShouldStop(262144);
homeuser.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),homeuser.mostCurrent.activityBA);
 BA.debugLineNum = 52;BA.debugLine="MainScroll.Panel.LoadLayout(\"HomeUser\") ' Muat la";
Debug.ShouldStop(524288);
homeuser.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HomeUser")),homeuser.mostCurrent.activityBA);
 BA.debugLineNum = 53;BA.debugLine="PanelHome.Height = MainScroll.Height ' Sesuaikan";
Debug.ShouldStop(1048576);
homeuser.mostCurrent._panelhome.runMethod(true,"setHeight",homeuser.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 54;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height ' Ses";
Debug.ShouldStop(2097152);
homeuser.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",homeuser.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 55;BA.debugLine="TitleNavbar.Text=\"Home User\" ' Set judul navbar";
Debug.ShouldStop(4194304);
homeuser.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence("Home User"));
 BA.debugLineNum = 56;BA.debugLine="BtnBack.Visible = False ' Sembunyikan tombol kemb";
Debug.ShouldStop(8388608);
homeuser.mostCurrent._btnback.runMethod(true,"setVisible",homeuser.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(67108864);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 60;BA.debugLine="profileDataLoaded = False";
Debug.ShouldStop(134217728);
homeuser._profiledataloaded = homeuser.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (homeuser) ","homeuser",6,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,87);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSaribu.homeuser.remoteMe.runUserSub(false, "homeuser","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 87;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (homeuser) ","homeuser",6,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,64);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSaribu.homeuser.remoteMe.runUserSub(false, "homeuser","activity_resume");}
RemoteObject _userid = RemoteObject.createImmutable("");
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Log(\"HomeUser loaded (Resume)\")";
Debug.ShouldStop(1);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24718593",RemoteObject.createImmutable("HomeUser loaded (Resume)"),0);
 BA.debugLineNum = 67;BA.debugLine="Dim userId As String = Main.manager.GetString(\"us";
Debug.ShouldStop(4);
_userid = homeuser.mostCurrent._main._manager /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("user_id")));Debug.locals.put("userId", _userid);Debug.locals.put("userId", _userid);
 BA.debugLineNum = 71;BA.debugLine="If userId <> \"\" And Not(profileDataLoaded) Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",_userid,BA.ObjectToString("")) && RemoteObject.solveBoolean(".",homeuser.mostCurrent.__c.runMethod(true,"Not",(Object)(homeuser._profiledataloaded)))) { 
 BA.debugLineNum = 72;BA.debugLine="Log(\"User ID found: \" & userId & \". Profile data";
Debug.ShouldStop(128);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24718600",RemoteObject.concat(RemoteObject.createImmutable("User ID found: "),_userid,RemoteObject.createImmutable(". Profile data not loaded yet. Fetching profile...")),0);
 BA.debugLineNum = 73;BA.debugLine="Core.ExecuteUrlGet(Main.API & \"user/\" & userId,";
Debug.ShouldStop(256);
homeuser.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,homeuser.mostCurrent.activityBA,(Object)(RemoteObject.concat(homeuser.mostCurrent._main._api /*RemoteObject*/ ,RemoteObject.createImmutable("user/"),_userid)),(Object)(BA.ObjectToString("Profile")),(Object)(homeuser.getObject()));
 }else 
{ BA.debugLineNum = 74;BA.debugLine="Else If userId = \"\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_userid,BA.ObjectToString(""))) { 
 BA.debugLineNum = 75;BA.debugLine="Log(\"User ID not found in manager. Cannot fetch";
Debug.ShouldStop(1024);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24718603",RemoteObject.createImmutable("User ID not found in manager. Cannot fetch profile."),0);
 BA.debugLineNum = 77;BA.debugLine="ToastMessageShow(\"Sesi tidak valid, silakan logi";
Debug.ShouldStop(4096);
homeuser.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Sesi tidak valid, silakan login kembali.")),(Object)(homeuser.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 78;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
homeuser.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 79;BA.debugLine="StartActivity(Main) ' Kembali ke activity Main/L";
Debug.ShouldStop(16384);
homeuser.mostCurrent.__c.runVoidMethod ("StartActivity",homeuser.processBA,(Object)((homeuser.mostCurrent._main.getObject())));
 }else {
 BA.debugLineNum = 81;BA.debugLine="Log(\"Profile data already loaded. Skipping API c";
Debug.ShouldStop(65536);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24718609",RemoteObject.createImmutable("Profile data already loaded. Skipping API call."),0);
 }}
;
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnback_click() throws Exception{
try {
		Debug.PushSubsStack("BtnBack_Click (homeuser) ","homeuser",6,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,272);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSaribu.homeuser.remoteMe.runUserSub(false, "homeuser","btnback_click");}
 BA.debugLineNum = 272;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 273;BA.debugLine="Activity.Finish ' Kembali ke activity sebelumnya";
Debug.ShouldStop(65536);
homeuser.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncart_click() throws Exception{
try {
		Debug.PushSubsStack("btnCart_Click (homeuser) ","homeuser",6,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,266);
if (RapidSub.canDelegate("btncart_click")) { return b4a.DesaWisataSaribu.homeuser.remoteMe.runUserSub(false, "homeuser","btncart_click");}
 BA.debugLineNum = 266;BA.debugLine="Private Sub btnCart_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 267;BA.debugLine="Log(\"Redirect to Cart Activity\")";
Debug.ShouldStop(1024);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","242270721",RemoteObject.createImmutable("Redirect to Cart Activity"),0);
 BA.debugLineNum = 268;BA.debugLine="StartActivity(Cart)";
Debug.ShouldStop(2048);
homeuser.mostCurrent.__c.runVoidMethod ("StartActivity",homeuser.processBA,(Object)((homeuser.mostCurrent._cart.getObject())));
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btngemma_click() throws Exception{
try {
		Debug.PushSubsStack("BtnGemma_Click (homeuser) ","homeuser",6,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,260);
if (RapidSub.canDelegate("btngemma_click")) { return b4a.DesaWisataSaribu.homeuser.remoteMe.runUserSub(false, "homeuser","btngemma_click");}
 BA.debugLineNum = 260;BA.debugLine="Private Sub BtnGemma_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 261;BA.debugLine="Log(\"Redirect to Gemma Activity\")";
Debug.ShouldStop(16);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","25111809",RemoteObject.createImmutable("Redirect to Gemma Activity"),0);
 BA.debugLineNum = 262;BA.debugLine="StartActivity(Gemma)";
Debug.ShouldStop(32);
homeuser.mostCurrent.__c.runVoidMethod ("StartActivity",homeuser.processBA,(Object)((homeuser.mostCurrent._gemma.getObject())));
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnlogout_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogout_Click (homeuser) ","homeuser",6,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,241);
if (RapidSub.canDelegate("btnlogout_click")) { b4a.DesaWisataSaribu.homeuser.remoteMe.runUserSub(false, "homeuser","btnlogout_click"); return;}
ResumableSub_BtnLogout_Click rsub = new ResumableSub_BtnLogout_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BtnLogout_Click extends BA.ResumableSub {
public ResumableSub_BtnLogout_Click(b4a.DesaWisataSaribu.homeuser parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.DesaWisataSaribu.homeuser parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BtnLogout_Click (homeuser) ","homeuser",6,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,241);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 242;BA.debugLine="Log(\"Attempting to logout...\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","24980737",RemoteObject.createImmutable("Attempting to logout..."),0);
 BA.debugLineNum = 244;BA.debugLine="Msgbox2Async(\"Are you sure you want to log out?\"";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Are you sure you want to log out?")),(Object)(BA.ObjectToCharSequence("Confirm Logout")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),homeuser.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 245;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", homeuser.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "homeuser", "btnlogout_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 246;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 247;BA.debugLine="Log(\"Logout confirmed. Calling API...\")";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","24980742",RemoteObject.createImmutable("Logout confirmed. Calling API..."),0);
 BA.debugLineNum = 248;BA.debugLine="Core.ExecuteUrlGet(Main.API & \"logout\", \"Logout\"";
Debug.ShouldStop(8388608);
parent.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,homeuser.mostCurrent.activityBA,(Object)(RemoteObject.concat(parent.mostCurrent._main._api /*RemoteObject*/ ,RemoteObject.createImmutable("logout"))),(Object)(BA.ObjectToString("Logout")),(Object)(homeuser.getObject()));
 BA.debugLineNum = 249;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 251;BA.debugLine="Log(\"Logout cancelled.\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","24980746",RemoteObject.createImmutable("Logout cancelled."),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnpackage_click() throws Exception{
try {
		Debug.PushSubsStack("BtnPackage_Click (homeuser) ","homeuser",6,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,255);
if (RapidSub.canDelegate("btnpackage_click")) { return b4a.DesaWisataSaribu.homeuser.remoteMe.runUserSub(false, "homeuser","btnpackage_click");}
 BA.debugLineNum = 255;BA.debugLine="Private Sub BtnPackage_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="Log(\"Redirect to List Package\")";
Debug.ShouldStop(-2147483648);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","25046273",RemoteObject.createImmutable("Redirect to List Package"),0);
 BA.debugLineNum = 257;BA.debugLine="StartActivity(ListPackage)";
Debug.ShouldStop(1);
homeuser.mostCurrent.__c.runVoidMethod ("StartActivity",homeuser.processBA,(Object)((homeuser.mostCurrent._listpackage.getObject())));
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnrg_click() throws Exception{
try {
		Debug.PushSubsStack("BtnRG_Click (homeuser) ","homeuser",6,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,236);
if (RapidSub.canDelegate("btnrg_click")) { return b4a.DesaWisataSaribu.homeuser.remoteMe.runUserSub(false, "homeuser","btnrg_click");}
 BA.debugLineNum = 236;BA.debugLine="Private Sub BtnRG_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 237;BA.debugLine="Log(\"Redirect to MapsRG Activity\")";
Debug.ShouldStop(4096);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24915201",RemoteObject.createImmutable("Redirect to MapsRG Activity"),0);
 BA.debugLineNum = 238;BA.debugLine="StartActivity(MapsRG)";
Debug.ShouldStop(8192);
homeuser.mostCurrent.__c.runVoidMethod ("StartActivity",homeuser.processBA,(Object)((homeuser.mostCurrent._mapsrg.getObject())));
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private LabelHeader As Label";
homeuser.mostCurrent._labelheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LabelLogout As Label";
homeuser.mostCurrent._labellogout = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LabelName As Label";
homeuser.mostCurrent._labelname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LabelUsername As Label";
homeuser.mostCurrent._labelusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelBanner As Panel";
homeuser.mostCurrent._panelbanner = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PanelHome As Panel";
homeuser.mostCurrent._panelhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private PanelMenu As Panel";
homeuser.mostCurrent._panelmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private PanelProfile As Panel";
homeuser.mostCurrent._panelprofile = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ProfileAvatar As ImageView";
homeuser.mostCurrent._profileavatar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private BtnBack As Button";
homeuser.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private MainScroll As ScrollView";
homeuser.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Navbar As Panel";
homeuser.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private TitleNavbar As Label";
homeuser.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private BtnLogout As Button";
homeuser.mostCurrent._btnlogout = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private BtnRG As Button";
homeuser.mostCurrent._btnrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private LabelPackage As Label";
homeuser.mostCurrent._labelpackage = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private LabelRG As Label";
homeuser.mostCurrent._labelrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private BtnGemma As Button";
homeuser.mostCurrent._btngemma = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private LabelGemma As Label";
homeuser.mostCurrent._labelgemma = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private BtnPackage As Button";
homeuser.mostCurrent._btnpackage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private profileDataLoaded As Boolean = False ' Pe";
homeuser._profiledataloaded = homeuser.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (homeuser) ","homeuser",6,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,91);
if (RapidSub.canDelegate("jobdone")) { return b4a.DesaWisataSaribu.homeuser.remoteMe.runUserSub(false, "homeuser","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _profiledata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tempusername = RemoteObject.createImmutable("");
RemoteObject _tempfirstname = RemoteObject.createImmutable("");
RemoteObject _templastname = RemoteObject.createImmutable("");
RemoteObject _tempavatar = RemoteObject.createImmutable("");
RemoteObject _validfirstname = RemoteObject.createImmutable("");
RemoteObject _validlastname = RemoteObject.createImmutable("");
RemoteObject _trimmedfirstname = RemoteObject.createImmutable("");
RemoteObject _trimmedlastname = RemoteObject.createImmutable("");
RemoteObject _fullname = RemoteObject.createImmutable("");
RemoteObject _isavatarvalid = RemoteObject.createImmutable(false);
RemoteObject _trimmedavatar = RemoteObject.createImmutable("");
RemoteObject _avatarmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _avatarpath = RemoteObject.createImmutable("");
RemoteObject _errorparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _errormap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _errormsg = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 91;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(134217728);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24849665",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 93;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(268435456);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 94;BA.debugLine="Dim res As String";
Debug.ShouldStop(536870912);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 95;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(1073741824);
_res = _job.runClassMethod (b4a.DesaWisataSaribu.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 96;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 97;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 98;BA.debugLine="Log(\"Response from server :\"&res)";
Debug.ShouldStop(2);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24849671",RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res),0);
 BA.debugLineNum = 99;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("Profile"),BA.ObjectToString("Logout"))) {
case 0: {
 BA.debugLineNum = 101;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 102;BA.debugLine="Dim map As Map";
Debug.ShouldStop(32);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 103;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(64);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 104;BA.debugLine="Dim profileData As Map ' Gunakan variabel lok";
Debug.ShouldStop(128);
_profiledata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("profileData", _profiledata);
 BA.debugLineNum = 105;BA.debugLine="profileData = map.Get(\"data\")";
Debug.ShouldStop(256);
_profiledata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("profileData", _profiledata);
 BA.debugLineNum = 106;BA.debugLine="If profileData = Null Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("n",_profiledata)) { 
 BA.debugLineNum = 107;BA.debugLine="Log(\"Error: 'data' field is null in profile";
Debug.ShouldStop(1024);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24849680",RemoteObject.createImmutable("Error: 'data' field is null in profile response."),0);
 BA.debugLineNum = 108;BA.debugLine="profileDataLoaded = False ' Gagal memuat";
Debug.ShouldStop(2048);
homeuser._profiledataloaded = homeuser.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 109;BA.debugLine="Return ' Keluar jika data null";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 114;BA.debugLine="Dim tempUsername As String = profileData.Get(";
Debug.ShouldStop(131072);
_tempusername = BA.ObjectToString(_profiledata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("tempUsername", _tempusername);Debug.locals.put("tempUsername", _tempusername);
 BA.debugLineNum = 115;BA.debugLine="Dim tempFirstName As String = profileData.Get";
Debug.ShouldStop(262144);
_tempfirstname = BA.ObjectToString(_profiledata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_name")))));Debug.locals.put("tempFirstName", _tempfirstname);Debug.locals.put("tempFirstName", _tempfirstname);
 BA.debugLineNum = 116;BA.debugLine="Dim tempLastName As String = profileData.Get(";
Debug.ShouldStop(524288);
_templastname = BA.ObjectToString(_profiledata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("last_name")))));Debug.locals.put("tempLastName", _templastname);Debug.locals.put("tempLastName", _templastname);
 BA.debugLineNum = 117;BA.debugLine="Dim tempAvatar As String = profileData.Get(\"a";
Debug.ShouldStop(1048576);
_tempavatar = BA.ObjectToString(_profiledata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("avatar")))));Debug.locals.put("tempAvatar", _tempavatar);Debug.locals.put("tempAvatar", _tempavatar);
 BA.debugLineNum = 121;BA.debugLine="Dim validFirstName As String = \"\"";
Debug.ShouldStop(16777216);
_validfirstname = BA.ObjectToString("");Debug.locals.put("validFirstName", _validfirstname);Debug.locals.put("validFirstName", _validfirstname);
 BA.debugLineNum = 122;BA.debugLine="Dim validLastName As String = \"\"";
Debug.ShouldStop(33554432);
_validlastname = BA.ObjectToString("");Debug.locals.put("validLastName", _validlastname);Debug.locals.put("validLastName", _validlastname);
 BA.debugLineNum = 124;BA.debugLine="If tempFirstName <> Null Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("N",_tempfirstname)) { 
 BA.debugLineNum = 125;BA.debugLine="Dim trimmedFirstName As String = tempFirstNa";
Debug.ShouldStop(268435456);
_trimmedfirstname = _tempfirstname.runMethod(true,"trim");Debug.locals.put("trimmedFirstName", _trimmedfirstname);Debug.locals.put("trimmedFirstName", _trimmedfirstname);
 BA.debugLineNum = 126;BA.debugLine="If trimmedFirstName <> \"\" And trimmedFirstNa";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_trimmedfirstname,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_trimmedfirstname.runMethod(true,"toLowerCase"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 127;BA.debugLine="validFirstName = tempFirstName";
Debug.ShouldStop(1073741824);
_validfirstname = _tempfirstname;Debug.locals.put("validFirstName", _validfirstname);
 };
 };
 BA.debugLineNum = 131;BA.debugLine="If tempLastName <> Null Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("N",_templastname)) { 
 BA.debugLineNum = 132;BA.debugLine="Dim trimmedLastName As String = tempLastName";
Debug.ShouldStop(8);
_trimmedlastname = _templastname.runMethod(true,"trim");Debug.locals.put("trimmedLastName", _trimmedlastname);Debug.locals.put("trimmedLastName", _trimmedlastname);
 BA.debugLineNum = 133;BA.debugLine="If trimmedLastName <> \"\" And trimmedLastName";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_trimmedlastname,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_trimmedlastname.runMethod(true,"toLowerCase"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 134;BA.debugLine="validLastName = tempLastName";
Debug.ShouldStop(32);
_validlastname = _templastname;Debug.locals.put("validLastName", _validlastname);
 };
 };
 BA.debugLineNum = 138;BA.debugLine="Dim fullName As String = \"\"";
Debug.ShouldStop(512);
_fullname = BA.ObjectToString("");Debug.locals.put("fullName", _fullname);Debug.locals.put("fullName", _fullname);
 BA.debugLineNum = 139;BA.debugLine="If validFirstName <> \"\" Then fullName = valid";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("!",_validfirstname,BA.ObjectToString(""))) { 
_fullname = _validfirstname;Debug.locals.put("fullName", _fullname);};
 BA.debugLineNum = 140;BA.debugLine="If validLastName <> \"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",_validlastname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 141;BA.debugLine="If fullName <> \"\" Then fullName = fullName &";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",_fullname,BA.ObjectToString(""))) { 
_fullname = RemoteObject.concat(_fullname,RemoteObject.createImmutable(" "),_validlastname);Debug.locals.put("fullName", _fullname);};
 }else {
 BA.debugLineNum = 143;BA.debugLine="fullName = validLastName";
Debug.ShouldStop(16384);
_fullname = _validlastname;Debug.locals.put("fullName", _fullname);
 };
 BA.debugLineNum = 146;BA.debugLine="LabelName.Text = fullName";
Debug.ShouldStop(131072);
homeuser.mostCurrent._labelname.runMethod(true,"setText",BA.ObjectToCharSequence(_fullname));
 BA.debugLineNum = 147;BA.debugLine="LabelUsername.Text = \"@\" & tempUsername ' Gun";
Debug.ShouldStop(262144);
homeuser.mostCurrent._labelusername.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("@"),_tempusername)));
 BA.debugLineNum = 151;BA.debugLine="Dim isAvatarValid As Boolean = False";
Debug.ShouldStop(4194304);
_isavatarvalid = homeuser.mostCurrent.__c.getField(true,"False");Debug.locals.put("isAvatarValid", _isavatarvalid);Debug.locals.put("isAvatarValid", _isavatarvalid);
 BA.debugLineNum = 152;BA.debugLine="If tempAvatar <> Null Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",_tempavatar)) { 
 BA.debugLineNum = 153;BA.debugLine="Dim trimmedAvatar As String = tempAvatar.Tri";
Debug.ShouldStop(16777216);
_trimmedavatar = _tempavatar.runMethod(true,"trim");Debug.locals.put("trimmedAvatar", _trimmedavatar);Debug.locals.put("trimmedAvatar", _trimmedavatar);
 BA.debugLineNum = 154;BA.debugLine="If trimmedAvatar <> \"\" And trimmedAvatar.ToL";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",_trimmedavatar,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_trimmedavatar.runMethod(true,"toLowerCase"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 155;BA.debugLine="isAvatarValid = True";
Debug.ShouldStop(67108864);
_isavatarvalid = homeuser.mostCurrent.__c.getField(true,"True");Debug.locals.put("isAvatarValid", _isavatarvalid);
 };
 };
 BA.debugLineNum = 160;BA.debugLine="If isAvatarValid Then";
Debug.ShouldStop(-2147483648);
if (_isavatarvalid.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 161;BA.debugLine="Log(\"Avatar check passed. Avatar value: \"\"\"";
Debug.ShouldStop(1);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24849734",RemoteObject.concat(RemoteObject.createImmutable("Avatar check passed. Avatar value: \""),_tempavatar,RemoteObject.createImmutable("\". Attempting download.")),0);
 BA.debugLineNum = 162;BA.debugLine="Dim avatarMap As Map";
Debug.ShouldStop(2);
_avatarmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("avatarMap", _avatarmap);
 BA.debugLineNum = 163;BA.debugLine="Dim avatarPath As String";
Debug.ShouldStop(4);
_avatarpath = RemoteObject.createImmutable("");Debug.locals.put("avatarPath", _avatarpath);
 BA.debugLineNum = 164;BA.debugLine="avatarPath = Main.server & \"media/photos/\" &";
Debug.ShouldStop(8);
_avatarpath = RemoteObject.concat(homeuser.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("media/photos/"),_tempavatar);Debug.locals.put("avatarPath", _avatarpath);
 BA.debugLineNum = 165;BA.debugLine="Log(\"Attempting to download avatar from: \" &";
Debug.ShouldStop(16);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24849738",RemoteObject.concat(RemoteObject.createImmutable("Attempting to download avatar from: "),_avatarpath),0);
 BA.debugLineNum = 166;BA.debugLine="avatarMap.Initialize";
Debug.ShouldStop(32);
_avatarmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 167;BA.debugLine="avatarMap.Put(ProfileAvatar, avatarPath)";
Debug.ShouldStop(64);
_avatarmap.runVoidMethod ("Put",(Object)((homeuser.mostCurrent._profileavatar.getObject())),(Object)((_avatarpath)));
 BA.debugLineNum = 168;BA.debugLine="CallSubDelayed2(Starter, \"Download\", avatarM";
Debug.ShouldStop(128);
homeuser.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",homeuser.processBA,(Object)((homeuser.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_avatarmap)));
 }else {
 BA.debugLineNum = 170;BA.debugLine="Log(\"Avatar check failed. Avatar is Null, em";
Debug.ShouldStop(512);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24849743",RemoteObject.createImmutable("Avatar check failed. Avatar is Null, empty string, or the string \"null\". Skipping download."),0);
 };
 BA.debugLineNum = 175;BA.debugLine="profileDataLoaded = True  ' Tandai bahwa data";
Debug.ShouldStop(16384);
homeuser._profiledataloaded = homeuser.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 176;BA.debugLine="Log(\"Profile data successfully processed and";
Debug.ShouldStop(32768);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24849749",RemoteObject.createImmutable("Profile data successfully processed and loaded."),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e69) {
			BA.rdebugUtils.runVoidMethod("setLastException",homeuser.processBA, e69.toString()); BA.debugLineNum = 180;BA.debugLine="Log(\"Error processing profile data: \" & LastE";
Debug.ShouldStop(524288);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24849753",RemoteObject.concat(RemoteObject.createImmutable("Error processing profile data: "),homeuser.mostCurrent.__c.runMethod(false,"LastException",homeuser.mostCurrent.activityBA)),0);
 BA.debugLineNum = 181;BA.debugLine="profileDataLoaded = False ' Set false jika ad";
Debug.ShouldStop(1048576);
homeuser._profiledataloaded = homeuser.mostCurrent.__c.getField(true,"False");
 };
 break; }
case 1: {
 BA.debugLineNum = 185;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 186;BA.debugLine="Dim map As Map";
Debug.ShouldStop(33554432);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 187;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(67108864);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 188;BA.debugLine="status = map.Get(\"status\")";
Debug.ShouldStop(134217728);
homeuser._status = BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));
 BA.debugLineNum = 189;BA.debugLine="If status == 200 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",homeuser._status,BA.numberCast(double.class, 200))) { 
 BA.debugLineNum = 190;BA.debugLine="MsgboxAsync(\"Successfully logged out\", \"Log";
Debug.ShouldStop(536870912);
homeuser.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Successfully logged out")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Log Out"))),homeuser.processBA);
 BA.debugLineNum = 191;BA.debugLine="Main.manager.SetBoolean(\"is_login\", False)";
Debug.ShouldStop(1073741824);
homeuser.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(homeuser.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 192;BA.debugLine="Main.manager.SetBoolean(\"visitor\", False)";
Debug.ShouldStop(-2147483648);
homeuser.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("visitor")),(Object)(homeuser.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 193;BA.debugLine="Main.manager.SetBoolean(\"user\", False)";
Debug.ShouldStop(1);
homeuser.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("user")),(Object)(homeuser.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 194;BA.debugLine="Main.manager.SetString(\"user_id\", \"\") ' Koso";
Debug.ShouldStop(2);
homeuser.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetString",(Object)(BA.ObjectToString("user_id")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 196;BA.debugLine="Log(\"Successfully logged out\")";
Debug.ShouldStop(8);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24849769",RemoteObject.createImmutable("Successfully logged out"),0);
 BA.debugLineNum = 197;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
homeuser.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 198;BA.debugLine="StartActivity(Main) ' Kembali ke activity Ma";
Debug.ShouldStop(32);
homeuser.mostCurrent.__c.runVoidMethod ("StartActivity",homeuser.processBA,(Object)((homeuser.mostCurrent._main.getObject())));
 }else {
 BA.debugLineNum = 200;BA.debugLine="MsgboxAsync(\"Logout failed. Status: \" & stat";
Debug.ShouldStop(128);
homeuser.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Logout failed. Status: "),homeuser._status))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Log Out Error"))),homeuser.processBA);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e90) {
			BA.rdebugUtils.runVoidMethod("setLastException",homeuser.processBA, e90.toString()); BA.debugLineNum = 203;BA.debugLine="Log(\"Error processing logout response: \" & La";
Debug.ShouldStop(1024);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24849776",RemoteObject.concat(RemoteObject.createImmutable("Error processing logout response: "),homeuser.mostCurrent.__c.runMethod(false,"LastException",homeuser.mostCurrent.activityBA)),0);
 BA.debugLineNum = 204;BA.debugLine="MsgboxAsync(\"Error during logout process.\", \"";
Debug.ShouldStop(2048);
homeuser.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Error during logout process.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Log Out Error"))),homeuser.processBA);
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 209;BA.debugLine="Dim errorParser As JSONParser";
Debug.ShouldStop(65536);
_errorparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("errorParser", _errorparser);
 BA.debugLineNum = 210;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
Debug.ShouldStop(131072);
_errorparser.runVoidMethod ("Initialize",(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 211;BA.debugLine="Dim errorMap As Map";
Debug.ShouldStop(262144);
_errormap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 212;BA.debugLine="errorMap = errorParser.NextObject";
Debug.ShouldStop(524288);
_errormap = _errorparser.runMethod(false,"NextObject");Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 213;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(1048576);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24849786",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 215;BA.debugLine="Dim errorMsg As String = \"Unknown error\"";
Debug.ShouldStop(4194304);
_errormsg = BA.ObjectToString("Unknown error");Debug.locals.put("errorMsg", _errormsg);Debug.locals.put("errorMsg", _errormsg);
 BA.debugLineNum = 216;BA.debugLine="If errorMap <> Null And errorMap.ContainsKey(\"me";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",_errormap) && RemoteObject.solveBoolean(".",_errormap.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("message")))))) { 
 BA.debugLineNum = 217;BA.debugLine="errorMsg = errorMap.Get(\"message\")";
Debug.ShouldStop(16777216);
_errormsg = BA.ObjectToString(_errormap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))));Debug.locals.put("errorMsg", _errormsg);
 }else 
{ BA.debugLineNum = 218;BA.debugLine="Else if Job.ErrorMessage.Contains(\"java.net.\") T";
Debug.ShouldStop(33554432);
if (_job.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("java.net."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 219;BA.debugLine="errorMsg = \"Network error. Please check your co";
Debug.ShouldStop(67108864);
_errormsg = BA.ObjectToString("Network error. Please check your connection.");Debug.locals.put("errorMsg", _errormsg);
 }}
;
 BA.debugLineNum = 222;BA.debugLine="ToastMessageShow(\"Error: \" & errorMsg, True)";
Debug.ShouldStop(536870912);
homeuser.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_errormsg))),(Object)(homeuser.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 225;BA.debugLine="If Job.JobName = \"Profile\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("Profile"))) { 
 BA.debugLineNum = 226;BA.debugLine="profileDataLoaded = False ' Set false agar bisa";
Debug.ShouldStop(2);
homeuser._profiledataloaded = homeuser.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 227;BA.debugLine="Log(\"API call for Profile failed. Flag reset to";
Debug.ShouldStop(4);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","24849800",RemoteObject.createImmutable("API call for Profile failed. Flag reset to false."),0);
 };
 };
 BA.debugLineNum = 231;BA.debugLine="Job.Release";
Debug.ShouldStop(64);
_job.runClassMethod (b4a.DesaWisataSaribu.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Public status As Int";
homeuser._status = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}