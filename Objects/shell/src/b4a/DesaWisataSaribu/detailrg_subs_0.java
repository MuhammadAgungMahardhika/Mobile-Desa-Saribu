package b4a.DesaWisataSaribu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class detailrg_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (detailrg) ","detailrg",9,detailrg.mostCurrent.activityBA,detailrg.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSaribu.detailrg.remoteMe.runUserSub(false, "detailrg","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(268435456);
detailrg.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),detailrg.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="MainScroll.Panel.LoadLayout(\"Detail\")";
Debug.ShouldStop(536870912);
detailrg.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Detail")),detailrg.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="wvDetail.Height = MainScroll.Height";
Debug.ShouldStop(1073741824);
detailrg.mostCurrent._wvdetail.runMethod(true,"setHeight",detailrg.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 32;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(-2147483648);
detailrg.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",detailrg.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 33;BA.debugLine="TitleNavbar.Text = Starter.selectedObj.Get(\"name\"";
Debug.ShouldStop(1);
detailrg.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence(detailrg.mostCurrent._starter._selectedobj /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 35;BA.debugLine="MyWebViewExtras.addWebChromeClient(wvDetail, \"wvD";
Debug.ShouldStop(4);
detailrg.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",detailrg.mostCurrent.activityBA,(Object)((detailrg.mostCurrent._wvdetail.getObject())),(Object)(RemoteObject.createImmutable("wvDetail")));
 BA.debugLineNum = 36;BA.debugLine="wvDetail.JavaScriptEnabled = True";
Debug.ShouldStop(8);
detailrg.mostCurrent._wvdetail.runMethod(true,"setJavaScriptEnabled",detailrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 37;BA.debugLine="wvDetail.LoadUrl(Main.MobileUri&\"rumahGadang/\"&St";
Debug.ShouldStop(16);
detailrg.mostCurrent._wvdetail.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(detailrg.mostCurrent._main._mobileuri /*RemoteObject*/ ,RemoteObject.createImmutable("rumahGadang/"),detailrg.mostCurrent._starter._selectedobj /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_rumah_gadang")))))));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Pause (detailrg) ","detailrg",9,detailrg.mostCurrent.activityBA,detailrg.mostCurrent,44);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSaribu.detailrg.remoteMe.runUserSub(false, "detailrg","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Resume (detailrg) ","detailrg",9,detailrg.mostCurrent.activityBA,detailrg.mostCurrent,40);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSaribu.detailrg.remoteMe.runUserSub(false, "detailrg","activity_resume");}
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Log(\"DetailRG loaded\")";
Debug.ShouldStop(256);
detailrg.mostCurrent.__c.runVoidMethod ("LogImpl","86946817",RemoteObject.createImmutable("DetailRG loaded"),0);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("BtnBack_Click (detailrg) ","detailrg",9,detailrg.mostCurrent.activityBA,detailrg.mostCurrent,49);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSaribu.detailrg.remoteMe.runUserSub(false, "detailrg","btnback_click");}
 BA.debugLineNum = 49;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(131072);
detailrg.mostCurrent.__c.runVoidMethod ("LogImpl","87077889",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 51;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
detailrg.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("btnCart_Click (detailrg) ","detailrg",9,detailrg.mostCurrent.activityBA,detailrg.mostCurrent,75);
if (RapidSub.canDelegate("btncart_click")) { return b4a.DesaWisataSaribu.detailrg.remoteMe.runUserSub(false, "detailrg","btncart_click");}
 BA.debugLineNum = 75;BA.debugLine="Private Sub btnCart_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Log(\"Redirect to Cart Activity\")";
Debug.ShouldStop(2048);
detailrg.mostCurrent.__c.runVoidMethod ("LogImpl","841615361",RemoteObject.createImmutable("Redirect to Cart Activity"),0);
 BA.debugLineNum = 77;BA.debugLine="StartActivity(Cart)";
Debug.ShouldStop(4096);
detailrg.mostCurrent.__c.runVoidMethod ("StartActivity",detailrg.processBA,(Object)((detailrg.mostCurrent._cart.getObject())));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
detailrg.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnBack As Button";
detailrg.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private MainScroll As ScrollView";
detailrg.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Navbar As Panel";
detailrg.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private TitleNavbar As Label";
detailrg.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private wvDetail As WebView";
detailrg.mostCurrent._wvdetail = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Public manager As AHPreferenceManager";
detailrg.mostCurrent._manager = RemoteObject.createNew ("de.amberhome.objects.preferenceactivity.PreferenceManager");
 //BA.debugLineNum = 23;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
detailrg.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setuserid() throws Exception{
try {
		Debug.PushSubsStack("SetUserId (detailrg) ","detailrg",9,detailrg.mostCurrent.activityBA,detailrg.mostCurrent,54);
if (RapidSub.canDelegate("setuserid")) { return b4a.DesaWisataSaribu.detailrg.remoteMe.runUserSub(false, "detailrg","setuserid");}
RemoteObject _userid = RemoteObject.createImmutable("");
RemoteObject _exectfunction = RemoteObject.createImmutable("");
 BA.debugLineNum = 54;BA.debugLine="Public Sub SetUserId";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Log(\"Set User Id\")";
Debug.ShouldStop(4194304);
detailrg.mostCurrent.__c.runVoidMethod ("LogImpl","87143425",RemoteObject.createImmutable("Set User Id"),0);
 BA.debugLineNum = 56;BA.debugLine="Dim userId As String";
Debug.ShouldStop(8388608);
_userid = RemoteObject.createImmutable("");Debug.locals.put("userId", _userid);
 BA.debugLineNum = 57;BA.debugLine="Dim exectFunction As String";
Debug.ShouldStop(16777216);
_exectfunction = RemoteObject.createImmutable("");Debug.locals.put("exectFunction", _exectfunction);
 BA.debugLineNum = 59;BA.debugLine="userId = manager.GetString(\"user_id\")";
Debug.ShouldStop(67108864);
_userid = detailrg.mostCurrent._manager.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("user_id")));Debug.locals.put("userId", _userid);
 BA.debugLineNum = 60;BA.debugLine="Log(\"User ID: \" & userId)";
Debug.ShouldStop(134217728);
detailrg.mostCurrent.__c.runVoidMethod ("LogImpl","87143430",RemoteObject.concat(RemoteObject.createImmutable("User ID: "),_userid),0);
 BA.debugLineNum = 62;BA.debugLine="If userId <> \"\" And userId <> Null Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_userid,BA.ObjectToString("")) && RemoteObject.solveBoolean("N",_userid)) { 
 BA.debugLineNum = 63;BA.debugLine="exectFunction = \"receiveUserIdFromB4A('\" & userI";
Debug.ShouldStop(1073741824);
_exectfunction = RemoteObject.concat(RemoteObject.createImmutable("receiveUserIdFromB4A('"),_userid,RemoteObject.createImmutable("')"));Debug.locals.put("exectFunction", _exectfunction);
 BA.debugLineNum = 64;BA.debugLine="MyWebViewExtras.executeJavascript(wvDetail, exec";
Debug.ShouldStop(-2147483648);
detailrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((detailrg.mostCurrent._wvdetail.getObject())),(Object)(_exectfunction));
 }else {
 BA.debugLineNum = 66;BA.debugLine="Log(\"User ID is empty or null\")";
Debug.ShouldStop(2);
detailrg.mostCurrent.__c.runVoidMethod ("LogImpl","87143436",RemoteObject.createImmutable("User ID is empty or null"),0);
 };
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _wvdetail_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("wvDetail_PageFinished (detailrg) ","detailrg",9,detailrg.mostCurrent.activityBA,detailrg.mostCurrent,70);
if (RapidSub.canDelegate("wvdetail_pagefinished")) { return b4a.DesaWisataSaribu.detailrg.remoteMe.runUserSub(false, "detailrg","wvdetail_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 70;BA.debugLine="Private Sub wvDetail_PageFinished (Url As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Log(\"page finished\")";
Debug.ShouldStop(64);
detailrg.mostCurrent.__c.runVoidMethod ("LogImpl","87208961",RemoteObject.createImmutable("page finished"),0);
 BA.debugLineNum = 72;BA.debugLine="SetUserId";
Debug.ShouldStop(128);
_setuserid();
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}