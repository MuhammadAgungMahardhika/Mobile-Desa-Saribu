package b4a.DesaWisataSaribu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homevisitor_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSaribu.homevisitor.remoteMe.runUserSub(false, "homevisitor","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(16);
homevisitor.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),homevisitor.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="MainScroll.Panel.LoadLayout(\"HomeVisitor\")";
Debug.ShouldStop(32);
homevisitor.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HomeVisitor")),homevisitor.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="PanelHome.Height = MainScroll.Height";
Debug.ShouldStop(64);
homevisitor.mostCurrent._panelhome.runMethod(true,"setHeight",homevisitor.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 40;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(128);
homevisitor.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",homevisitor.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 41;BA.debugLine="TitleNavbar.Text=\"Home Visitor\"";
Debug.ShouldStop(256);
homevisitor.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence("Home Visitor"));
 BA.debugLineNum = 42;BA.debugLine="BtnBack.Visible = False";
Debug.ShouldStop(512);
homevisitor.mostCurrent._btnback.runMethod(true,"setVisible",homevisitor.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Pause (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,53);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSaribu.homevisitor.remoteMe.runUserSub(false, "homevisitor","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Resume (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,46);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSaribu.homevisitor.remoteMe.runUserSub(false, "homevisitor","activity_resume");}
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Log(\"HomeVisitor loaded\")";
Debug.ShouldStop(16384);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","21703937",RemoteObject.createImmutable("HomeVisitor loaded"),0);
 BA.debugLineNum = 48;BA.debugLine="LabelName.Text = \"Hello, Visitor\"";
Debug.ShouldStop(32768);
homevisitor.mostCurrent._labelname.runMethod(true,"setText",BA.ObjectToCharSequence("Hello, Visitor"));
 BA.debugLineNum = 49;BA.debugLine="LabelUsername.Text = \"\"";
Debug.ShouldStop(65536);
homevisitor.mostCurrent._labelusername.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogin_Click (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,63);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.DesaWisataSaribu.homevisitor.remoteMe.runUserSub(false, "homevisitor","btnlogin_click");}
 BA.debugLineNum = 63;BA.debugLine="Private Sub BtnLogin_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Log(\"Redirect to Main Activity\")";
Debug.ShouldStop(-2147483648);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","21900545",RemoteObject.createImmutable("Redirect to Main Activity"),0);
 BA.debugLineNum = 66;BA.debugLine="Main.manager.SetBoolean(\"is_login\", False)";
Debug.ShouldStop(2);
homevisitor.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(homevisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 67;BA.debugLine="Main.manager.SetBoolean(\"visitor\", False)";
Debug.ShouldStop(4);
homevisitor.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("visitor")),(Object)(homevisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 68;BA.debugLine="Main.manager.SetBoolean(\"user\", False)";
Debug.ShouldStop(8);
homevisitor.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("user")),(Object)(homevisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 69;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
homevisitor.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 70;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(32);
homevisitor.mostCurrent.__c.runVoidMethod ("StartActivity",homevisitor.processBA,(Object)((homevisitor.mostCurrent._main.getObject())));
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
public static RemoteObject  _btnrg_click() throws Exception{
try {
		Debug.PushSubsStack("BtnRG_Click (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,58);
if (RapidSub.canDelegate("btnrg_click")) { return b4a.DesaWisataSaribu.homevisitor.remoteMe.runUserSub(false, "homevisitor","btnrg_click");}
 BA.debugLineNum = 58;BA.debugLine="Private Sub BtnRG_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Log(\"Redirect to MapsRG Activity\")";
Debug.ShouldStop(67108864);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","21835009",RemoteObject.createImmutable("Redirect to MapsRG Activity"),0);
 BA.debugLineNum = 60;BA.debugLine="StartActivity(MapsRG)";
Debug.ShouldStop(134217728);
homevisitor.mostCurrent.__c.runVoidMethod ("StartActivity",homevisitor.processBA,(Object)((homevisitor.mostCurrent._mapsrg.getObject())));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
 //BA.debugLineNum = 16;BA.debugLine="Private LabelHeader As Label";
homevisitor.mostCurrent._labelheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private LabelName As Label";
homevisitor.mostCurrent._labelname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelUsername As Label";
homevisitor.mostCurrent._labelusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private PanelBanner As Panel";
homevisitor.mostCurrent._panelbanner = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelHome As Panel";
homevisitor.mostCurrent._panelhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelMenu As Panel";
homevisitor.mostCurrent._panelmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private PanelProfile As Panel";
homevisitor.mostCurrent._panelprofile = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ProfileAvatar As ImageView";
homevisitor.mostCurrent._profileavatar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private BtnBack As Button";
homevisitor.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private MainScroll As ScrollView";
homevisitor.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Navbar As Panel";
homevisitor.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private TitleNavbar As Label";
homevisitor.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private BtnLogin As Button";
homevisitor.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private BtnRG As Button";
homevisitor.mostCurrent._btnrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private LabelLogin As Label";
homevisitor.mostCurrent._labellogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private LabelRG As Label";
homevisitor.mostCurrent._labelrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}