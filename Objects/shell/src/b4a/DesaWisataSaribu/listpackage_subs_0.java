package b4a.DesaWisataSaribu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class listpackage_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (listpackage) ","listpackage",12,listpackage.mostCurrent.activityBA,listpackage.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSaribu.listpackage.remoteMe.runUserSub(false, "listpackage","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(268435456);
listpackage.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),listpackage.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="MainScroll.Panel.LoadLayout(\"ListPackage\")";
Debug.ShouldStop(536870912);
listpackage.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ListPackage")),listpackage.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="WebViewPackage.Height = MainScroll.Height";
Debug.ShouldStop(1073741824);
listpackage.mostCurrent._webviewpackage.runMethod(true,"setHeight",listpackage.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 32;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(-2147483648);
listpackage.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",listpackage.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 33;BA.debugLine="TitleNavbar.Text = \"List Tourism Package\"";
Debug.ShouldStop(1);
listpackage.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence("List Tourism Package"));
 BA.debugLineNum = 35;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewPackage";
Debug.ShouldStop(4);
listpackage.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",listpackage.mostCurrent.activityBA,(Object)((listpackage.mostCurrent._webviewpackage.getObject())),(Object)(RemoteObject.createImmutable("WebViewPackage")));
 BA.debugLineNum = 36;BA.debugLine="WebViewPackage.JavaScriptEnabled = True";
Debug.ShouldStop(8);
listpackage.mostCurrent._webviewpackage.runMethod(true,"setJavaScriptEnabled",listpackage.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 37;BA.debugLine="WebViewPackage.LoadUrl(Main.MobileUri&\"package\")";
Debug.ShouldStop(16);
listpackage.mostCurrent._webviewpackage.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(listpackage.mostCurrent._main._mobileuri /*RemoteObject*/ ,RemoteObject.createImmutable("package"))));
 BA.debugLineNum = 38;BA.debugLine="MyWebViewSettings.setDOMStorageEnabled(WebViewPac";
Debug.ShouldStop(32);
listpackage.mostCurrent._mywebviewsettings.runVoidMethod ("setDOMStorageEnabled",(Object)((listpackage.mostCurrent._webviewpackage.getObject())),(Object)(listpackage.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Pause (listpackage) ","listpackage",12,listpackage.mostCurrent.activityBA,listpackage.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSaribu.listpackage.remoteMe.runUserSub(false, "listpackage","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (listpackage) ","listpackage",12,listpackage.mostCurrent.activityBA,listpackage.mostCurrent,41);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSaribu.listpackage.remoteMe.runUserSub(false, "listpackage","activity_resume");}
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("BtnBack_Click (listpackage) ","listpackage",12,listpackage.mostCurrent.activityBA,listpackage.mostCurrent,49);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSaribu.listpackage.remoteMe.runUserSub(false, "listpackage","btnback_click");}
 BA.debugLineNum = 49;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(131072);
listpackage.mostCurrent.__c.runVoidMethod ("LogImpl","88585217",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 51;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
listpackage.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private MainScroll As ScrollView";
listpackage.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private TitleNavbar As Label";
listpackage.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Navbar As Panel";
listpackage.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private WebViewPackage As WebView";
listpackage.mostCurrent._webviewpackage = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
listpackage.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 21;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
listpackage.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 22;BA.debugLine="Public manager As AHPreferenceManager";
listpackage.mostCurrent._manager = RemoteObject.createNew ("de.amberhome.objects.preferenceactivity.PreferenceManager");
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
		Debug.PushSubsStack("SetUserId (listpackage) ","listpackage",12,listpackage.mostCurrent.activityBA,listpackage.mostCurrent,54);
if (RapidSub.canDelegate("setuserid")) { return b4a.DesaWisataSaribu.listpackage.remoteMe.runUserSub(false, "listpackage","setuserid");}
RemoteObject _userid = RemoteObject.createImmutable("");
RemoteObject _exectfunction = RemoteObject.createImmutable("");
 BA.debugLineNum = 54;BA.debugLine="Public Sub SetUserId";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Log(\"Set User Id\")";
Debug.ShouldStop(4194304);
listpackage.mostCurrent.__c.runVoidMethod ("LogImpl","88650753",RemoteObject.createImmutable("Set User Id"),0);
 BA.debugLineNum = 56;BA.debugLine="Dim userId As String";
Debug.ShouldStop(8388608);
_userid = RemoteObject.createImmutable("");Debug.locals.put("userId", _userid);
 BA.debugLineNum = 57;BA.debugLine="Dim exectFunction As String";
Debug.ShouldStop(16777216);
_exectfunction = RemoteObject.createImmutable("");Debug.locals.put("exectFunction", _exectfunction);
 BA.debugLineNum = 59;BA.debugLine="userId = manager.GetString(\"user_id\")";
Debug.ShouldStop(67108864);
_userid = listpackage.mostCurrent._manager.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("user_id")));Debug.locals.put("userId", _userid);
 BA.debugLineNum = 60;BA.debugLine="Log(\"User ID: \" & userId)";
Debug.ShouldStop(134217728);
listpackage.mostCurrent.__c.runVoidMethod ("LogImpl","88650758",RemoteObject.concat(RemoteObject.createImmutable("User ID: "),_userid),0);
 BA.debugLineNum = 62;BA.debugLine="If userId <> \"\" And userId <> Null Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_userid,BA.ObjectToString("")) && RemoteObject.solveBoolean("N",_userid)) { 
 BA.debugLineNum = 63;BA.debugLine="exectFunction = \"receiveUserIdFromB4A('\" & userI";
Debug.ShouldStop(1073741824);
_exectfunction = RemoteObject.concat(RemoteObject.createImmutable("receiveUserIdFromB4A('"),_userid,RemoteObject.createImmutable("')"));Debug.locals.put("exectFunction", _exectfunction);
 BA.debugLineNum = 64;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewPackage";
Debug.ShouldStop(-2147483648);
listpackage.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((listpackage.mostCurrent._webviewpackage.getObject())),(Object)(_exectfunction));
 }else {
 BA.debugLineNum = 66;BA.debugLine="Log(\"User ID is empty or null\")";
Debug.ShouldStop(2);
listpackage.mostCurrent.__c.runVoidMethod ("LogImpl","88650764",RemoteObject.createImmutable("User ID is empty or null"),0);
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
public static RemoteObject  _webviewpackage_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebViewPackage_PageFinished (listpackage) ","listpackage",12,listpackage.mostCurrent.activityBA,listpackage.mostCurrent,72);
if (RapidSub.canDelegate("webviewpackage_pagefinished")) { return b4a.DesaWisataSaribu.listpackage.remoteMe.runUserSub(false, "listpackage","webviewpackage_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 72;BA.debugLine="Private Sub WebViewPackage_PageFinished (Url As St";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Log(\"page finished\")";
Debug.ShouldStop(256);
listpackage.mostCurrent.__c.runVoidMethod ("LogImpl","88716289",RemoteObject.createImmutable("page finished"),0);
 BA.debugLineNum = 74;BA.debugLine="SetUserId";
Debug.ShouldStop(512);
_setuserid();
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}