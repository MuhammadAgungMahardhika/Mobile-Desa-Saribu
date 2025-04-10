package b4a.DesaWisataSaribu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gemma_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (gemma) ","gemma",7,gemma.mostCurrent.activityBA,gemma.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSaribu.gemma.remoteMe.runUserSub(false, "gemma","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(134217728);
gemma.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),gemma.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="MainScroll.Panel.LoadLayout(\"Gemma\")";
Debug.ShouldStop(268435456);
gemma.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Gemma")),gemma.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="WebViewGemma.Height = MainScroll.Height";
Debug.ShouldStop(536870912);
gemma.mostCurrent._webviewgemma.runMethod(true,"setHeight",gemma.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 32;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(-2147483648);
gemma.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",gemma.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 33;BA.debugLine="TitleNavbar.Text = \"Desa Saribu with Gemini AI\"";
Debug.ShouldStop(1);
gemma.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence("Desa Saribu with Gemini AI"));
 BA.debugLineNum = 35;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewGemma,";
Debug.ShouldStop(4);
gemma.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",gemma.mostCurrent.activityBA,(Object)((gemma.mostCurrent._webviewgemma.getObject())),(Object)(RemoteObject.createImmutable("WebViewGemma")));
 BA.debugLineNum = 36;BA.debugLine="MyWebViewExtras.clearCache(WebViewGemma,True)";
Debug.ShouldStop(8);
gemma.mostCurrent._mywebviewextras.runVoidMethod ("clearCache",(Object)((gemma.mostCurrent._webviewgemma.getObject())),(Object)(gemma.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 37;BA.debugLine="WebViewGemma.JavaScriptEnabled = True";
Debug.ShouldStop(16);
gemma.mostCurrent._webviewgemma.runMethod(true,"setJavaScriptEnabled",gemma.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 38;BA.debugLine="WebViewGemma.AllowFileAccess = True";
Debug.ShouldStop(32);
gemma.mostCurrent._webviewgemma.runMethod(true,"setAllowFileAccess",gemma.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="WebViewGemma.LoadUrl(Main.server&\"mobile/gemma\")";
Debug.ShouldStop(128);
gemma.mostCurrent._webviewgemma.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(gemma.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("mobile/gemma"))));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (gemma) ","gemma",7,gemma.mostCurrent.activityBA,gemma.mostCurrent,78);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSaribu.gemma.remoteMe.runUserSub(false, "gemma","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 78;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Resume (gemma) ","gemma",7,gemma.mostCurrent.activityBA,gemma.mostCurrent,74);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSaribu.gemma.remoteMe.runUserSub(false, "gemma","activity_resume");}
 BA.debugLineNum = 74;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Log(\"Gemma Loaded\")";
Debug.ShouldStop(1024);
gemma.mostCurrent.__c.runVoidMethod ("LogImpl","85373953",RemoteObject.createImmutable("Gemma Loaded"),0);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("BtnBack_Click (gemma) ","gemma",7,gemma.mostCurrent.activityBA,gemma.mostCurrent,69);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSaribu.gemma.remoteMe.runUserSub(false, "gemma","btnback_click");}
 BA.debugLineNum = 69;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(32);
gemma.mostCurrent.__c.runVoidMethod ("LogImpl","85308417",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 71;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
gemma.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("btnCart_Click (gemma) ","gemma",7,gemma.mostCurrent.activityBA,gemma.mostCurrent,88);
if (RapidSub.canDelegate("btncart_click")) { return b4a.DesaWisataSaribu.gemma.remoteMe.runUserSub(false, "gemma","btncart_click");}
 BA.debugLineNum = 88;BA.debugLine="Private Sub btnCart_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Log(\"Redirect to Cart Activity\")";
Debug.ShouldStop(16777216);
gemma.mostCurrent.__c.runVoidMethod ("LogImpl","841549825",RemoteObject.createImmutable("Redirect to Cart Activity"),0);
 BA.debugLineNum = 90;BA.debugLine="StartActivity(Cart)";
Debug.ShouldStop(33554432);
gemma.mostCurrent.__c.runVoidMethod ("StartActivity",gemma.processBA,(Object)((gemma.mostCurrent._cart.getObject())));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
gemma.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 16;BA.debugLine="Private MainScroll As ScrollView";
gemma.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private TitleNavbar As Label";
gemma.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Public sessionID As String";
gemma.mostCurrent._sessionid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Public csrfToken As String";
gemma.mostCurrent._csrftoken = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Public manager As AHPreferenceManager";
gemma.mostCurrent._manager = RemoteObject.createNew ("de.amberhome.objects.preferenceactivity.PreferenceManager");
 //BA.debugLineNum = 21;BA.debugLine="Private WebViewGemma As WebView";
gemma.mostCurrent._webviewgemma = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Navbar As Panel";
gemma.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
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
		Debug.PushSubsStack("SetUserId (gemma) ","gemma",7,gemma.mostCurrent.activityBA,gemma.mostCurrent,44);
if (RapidSub.canDelegate("setuserid")) { return b4a.DesaWisataSaribu.gemma.remoteMe.runUserSub(false, "gemma","setuserid");}
RemoteObject _userid = RemoteObject.createImmutable("");
RemoteObject _exectfunction = RemoteObject.createImmutable("");
 BA.debugLineNum = 44;BA.debugLine="Public Sub SetUserId";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Log(\"Set User Id\")";
Debug.ShouldStop(4096);
gemma.mostCurrent.__c.runVoidMethod ("LogImpl","85177345",RemoteObject.createImmutable("Set User Id"),0);
 BA.debugLineNum = 46;BA.debugLine="Dim userId As String";
Debug.ShouldStop(8192);
_userid = RemoteObject.createImmutable("");Debug.locals.put("userId", _userid);
 BA.debugLineNum = 47;BA.debugLine="Dim exectFunction As String";
Debug.ShouldStop(16384);
_exectfunction = RemoteObject.createImmutable("");Debug.locals.put("exectFunction", _exectfunction);
 BA.debugLineNum = 49;BA.debugLine="userId = manager.GetString(\"user_id\")";
Debug.ShouldStop(65536);
_userid = gemma.mostCurrent._manager.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("user_id")));Debug.locals.put("userId", _userid);
 BA.debugLineNum = 50;BA.debugLine="Log(\"User ID: \" & userId)";
Debug.ShouldStop(131072);
gemma.mostCurrent.__c.runVoidMethod ("LogImpl","85177350",RemoteObject.concat(RemoteObject.createImmutable("User ID: "),_userid),0);
 BA.debugLineNum = 52;BA.debugLine="If userId <> \"\" And userId <> Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",_userid,BA.ObjectToString("")) && RemoteObject.solveBoolean("N",_userid)) { 
 BA.debugLineNum = 53;BA.debugLine="exectFunction = \"receiveUserIdFromB4A('\" & userI";
Debug.ShouldStop(1048576);
_exectfunction = RemoteObject.concat(RemoteObject.createImmutable("receiveUserIdFromB4A('"),_userid,RemoteObject.createImmutable("')"));Debug.locals.put("exectFunction", _exectfunction);
 BA.debugLineNum = 54;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewGemma,";
Debug.ShouldStop(2097152);
gemma.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((gemma.mostCurrent._webviewgemma.getObject())),(Object)(_exectfunction));
 }else {
 BA.debugLineNum = 56;BA.debugLine="Log(\"User ID is empty or null\")";
Debug.ShouldStop(8388608);
gemma.mostCurrent.__c.runVoidMethod ("LogImpl","85177356",RemoteObject.createImmutable("User ID is empty or null"),0);
 };
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewgemma_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebViewGemma_PageFinished (gemma) ","gemma",7,gemma.mostCurrent.activityBA,gemma.mostCurrent,83);
if (RapidSub.canDelegate("webviewgemma_pagefinished")) { return b4a.DesaWisataSaribu.gemma.remoteMe.runUserSub(false, "gemma","webviewgemma_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 83;BA.debugLine="Private Sub WebViewGemma_PageFinished (Url As Stri";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Log(\"page finished\")";
Debug.ShouldStop(524288);
gemma.mostCurrent.__c.runVoidMethod ("LogImpl","85505025",RemoteObject.createImmutable("page finished"),0);
 BA.debugLineNum = 85;BA.debugLine="SetUserId";
Debug.ShouldStop(1048576);
_setuserid();
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewgemma_progresschanged(RemoteObject _loading) throws Exception{
try {
		Debug.PushSubsStack("WebViewGemma_ProgressChanged (gemma) ","gemma",7,gemma.mostCurrent.activityBA,gemma.mostCurrent,61);
if (RapidSub.canDelegate("webviewgemma_progresschanged")) { return b4a.DesaWisataSaribu.gemma.remoteMe.runUserSub(false, "gemma","webviewgemma_progresschanged", _loading);}
Debug.locals.put("loading", _loading);
 BA.debugLineNum = 61;BA.debugLine="Sub WebViewGemma_ProgressChanged(loading As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="If loading == 100 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_loading,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 63;BA.debugLine="Log(\"Webview loaded\")";
Debug.ShouldStop(1073741824);
gemma.mostCurrent.__c.runVoidMethod ("LogImpl","85242882",RemoteObject.createImmutable("Webview loaded"),0);
 BA.debugLineNum = 64;BA.debugLine="Starter.webviewLoading = loading";
Debug.ShouldStop(-2147483648);
gemma.mostCurrent._starter._webviewloading /*RemoteObject*/  = _loading;
 }else {
 BA.debugLineNum = 66;BA.debugLine="Log(\"Webview loading at \"&loading&\"% ....\")";
Debug.ShouldStop(2);
gemma.mostCurrent.__c.runVoidMethod ("LogImpl","85242885",RemoteObject.concat(RemoteObject.createImmutable("Webview loading at "),_loading,RemoteObject.createImmutable("% ....")),0);
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
}