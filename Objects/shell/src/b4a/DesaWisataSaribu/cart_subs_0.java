package b4a.DesaWisataSaribu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cart_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (cart) ","cart",14,cart.mostCurrent.activityBA,cart.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSaribu.cart.remoteMe.runUserSub(false, "cart","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(268435456);
cart.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),cart.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="MainScroll.Panel.LoadLayout(\"Gemma\")";
Debug.ShouldStop(536870912);
cart.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Gemma")),cart.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="WebViewGemma.Height = MainScroll.Height";
Debug.ShouldStop(1073741824);
cart.mostCurrent._webviewgemma.runMethod(true,"setHeight",cart.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 33;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(1);
cart.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",cart.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 34;BA.debugLine="TitleNavbar.Text = \"Cart\"";
Debug.ShouldStop(2);
cart.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence("Cart"));
 BA.debugLineNum = 35;BA.debugLine="btnCart.Visible = False";
Debug.ShouldStop(4);
cart.mostCurrent._btncart.runMethod(true,"setVisible",cart.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 36;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewGemma,";
Debug.ShouldStop(8);
cart.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",cart.mostCurrent.activityBA,(Object)((cart.mostCurrent._webviewgemma.getObject())),(Object)(RemoteObject.createImmutable("WebViewGemma")));
 BA.debugLineNum = 37;BA.debugLine="MyWebViewExtras.clearCache(WebViewGemma,True)";
Debug.ShouldStop(16);
cart.mostCurrent._mywebviewextras.runVoidMethod ("clearCache",(Object)((cart.mostCurrent._webviewgemma.getObject())),(Object)(cart.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 38;BA.debugLine="WebViewGemma.JavaScriptEnabled = True";
Debug.ShouldStop(32);
cart.mostCurrent._webviewgemma.runMethod(true,"setJavaScriptEnabled",cart.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 39;BA.debugLine="WebViewGemma.AllowFileAccess = True";
Debug.ShouldStop(64);
cart.mostCurrent._webviewgemma.runMethod(true,"setAllowFileAccess",cart.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="userId = manager.GetString(\"user_id\")";
Debug.ShouldStop(128);
cart.mostCurrent._userid = cart.mostCurrent._manager.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("user_id")));
 BA.debugLineNum = 41;BA.debugLine="WebViewGemma.LoadUrl(Main.server&\"mobile/reservat";
Debug.ShouldStop(256);
cart.mostCurrent._webviewgemma.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(cart.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("mobile/reservation/"),cart.mostCurrent._userid)));
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
		Debug.PushSubsStack("Activity_Pause (cart) ","cart",14,cart.mostCurrent.activityBA,cart.mostCurrent,48);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSaribu.cart.remoteMe.runUserSub(false, "cart","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Resume (cart) ","cart",14,cart.mostCurrent.activityBA,cart.mostCurrent,44);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSaribu.cart.remoteMe.runUserSub(false, "cart","activity_resume");}
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _btnback_click() throws Exception{
try {
		Debug.PushSubsStack("BtnBack_Click (cart) ","cart",14,cart.mostCurrent.activityBA,cart.mostCurrent,73);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSaribu.cart.remoteMe.runUserSub(false, "cart","btnback_click");}
 BA.debugLineNum = 73;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(512);
cart.mostCurrent.__c.runVoidMethod ("LogImpl","210092545",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 75;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
cart.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
cart.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 15;BA.debugLine="Private MainScroll As ScrollView";
cart.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private TitleNavbar As Label";
cart.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Public sessionID As String";
cart.mostCurrent._sessionid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Public csrfToken As String";
cart.mostCurrent._csrftoken = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Public manager As AHPreferenceManager";
cart.mostCurrent._manager = RemoteObject.createNew ("de.amberhome.objects.preferenceactivity.PreferenceManager");
 //BA.debugLineNum = 20;BA.debugLine="Private WebViewGemma As WebView";
cart.mostCurrent._webviewgemma = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Navbar As Panel";
cart.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim userId As String";
cart.mostCurrent._userid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Private btnCart As B4XView";
cart.mostCurrent._btncart = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setuserid() throws Exception{
try {
		Debug.PushSubsStack("SetUserId (cart) ","cart",14,cart.mostCurrent.activityBA,cart.mostCurrent,53);
if (RapidSub.canDelegate("setuserid")) { return b4a.DesaWisataSaribu.cart.remoteMe.runUserSub(false, "cart","setuserid");}
RemoteObject _exectfunction = RemoteObject.createImmutable("");
 BA.debugLineNum = 53;BA.debugLine="Public Sub SetUserId";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Log(\"Set User Id\")";
Debug.ShouldStop(2097152);
cart.mostCurrent.__c.runVoidMethod ("LogImpl","29961473",RemoteObject.createImmutable("Set User Id"),0);
 BA.debugLineNum = 55;BA.debugLine="Dim exectFunction As String";
Debug.ShouldStop(4194304);
_exectfunction = RemoteObject.createImmutable("");Debug.locals.put("exectFunction", _exectfunction);
 BA.debugLineNum = 57;BA.debugLine="userId = manager.GetString(\"user_id\")";
Debug.ShouldStop(16777216);
cart.mostCurrent._userid = cart.mostCurrent._manager.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("user_id")));
 BA.debugLineNum = 58;BA.debugLine="Log(\"User ID: \" & userId)";
Debug.ShouldStop(33554432);
cart.mostCurrent.__c.runVoidMethod ("LogImpl","29961477",RemoteObject.concat(RemoteObject.createImmutable("User ID: "),cart.mostCurrent._userid),0);
 BA.debugLineNum = 60;BA.debugLine="If userId <> \"\" And userId <> Null Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("!",cart.mostCurrent._userid,BA.ObjectToString("")) && RemoteObject.solveBoolean("N",cart.mostCurrent._userid)) { 
 BA.debugLineNum = 61;BA.debugLine="exectFunction = \"receiveUserIdFromB4A('\" & userI";
Debug.ShouldStop(268435456);
_exectfunction = RemoteObject.concat(RemoteObject.createImmutable("receiveUserIdFromB4A('"),cart.mostCurrent._userid,RemoteObject.createImmutable("')"));Debug.locals.put("exectFunction", _exectfunction);
 BA.debugLineNum = 62;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewGemma,";
Debug.ShouldStop(536870912);
cart.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((cart.mostCurrent._webviewgemma.getObject())),(Object)(_exectfunction));
 }else {
 BA.debugLineNum = 64;BA.debugLine="Log(\"User ID is empty or null\")";
Debug.ShouldStop(-2147483648);
cart.mostCurrent.__c.runVoidMethod ("LogImpl","29961483",RemoteObject.createImmutable("User ID is empty or null"),0);
 };
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("WebViewGemma_PageFinished (cart) ","cart",14,cart.mostCurrent.activityBA,cart.mostCurrent,68);
if (RapidSub.canDelegate("webviewgemma_pagefinished")) { return b4a.DesaWisataSaribu.cart.remoteMe.runUserSub(false, "cart","webviewgemma_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 68;BA.debugLine="Private Sub WebViewGemma_PageFinished (Url As Stri";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Log(\"page finished\")";
Debug.ShouldStop(16);
cart.mostCurrent.__c.runVoidMethod ("LogImpl","210027009",RemoteObject.createImmutable("page finished"),0);
 BA.debugLineNum = 70;BA.debugLine="SetUserId";
Debug.ShouldStop(32);
_setuserid();
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}