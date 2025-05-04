package b4a.DesaWisataSaribu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class register_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (register) ","register",11,register.mostCurrent.activityBA,register.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSaribu.register.remoteMe.runUserSub(false, "register","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(-2147483648);
register.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),register.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="MainScroll.Panel.LoadLayout(\"login - copy\")";
Debug.ShouldStop(1);
register.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("login - copy")),register.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="Navbar.Visible = False";
Debug.ShouldStop(2);
register.mostCurrent._navbar.runMethod(true,"setVisible",register.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 36;BA.debugLine="If Navbar.Visible == False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",register.mostCurrent._navbar.runMethod(true,"getVisible"),register.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 37;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
Debug.ShouldStop(16);
register.mostCurrent._mainscroll.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {register.mostCurrent._mainscroll.runMethod(true,"getTop"),register.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 38;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
Debug.ShouldStop(32);
register.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {register.mostCurrent._mainscroll.runMethod(true,"getHeight"),register.mostCurrent._navbar.runMethod(true,"getHeight")}, "+",1, 1));
 };
 BA.debugLineNum = 41;BA.debugLine="PanelLogin.Height = MainScroll.Height";
Debug.ShouldStop(256);
register.mostCurrent._panellogin.runMethod(true,"setHeight",register.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 42;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(512);
register.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",register.mostCurrent._mainscroll.runMethod(true,"getHeight"));
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
		Debug.PushSubsStack("Activity_Pause (register) ","register",11,register.mostCurrent.activityBA,register.mostCurrent,50);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSaribu.register.remoteMe.runUserSub(false, "register","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(131072);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (register) ","register",11,register.mostCurrent.activityBA,register.mostCurrent,46);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSaribu.register.remoteMe.runUserSub(false, "register","activity_resume");}
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8192);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnregister_click() throws Exception{
try {
		Debug.PushSubsStack("BtnRegister_Click (register) ","register",11,register.mostCurrent.activityBA,register.mostCurrent,55);
if (RapidSub.canDelegate("btnregister_click")) { return b4a.DesaWisataSaribu.register.remoteMe.runUserSub(false, "register","btnregister_click");}
 BA.debugLineNum = 55;BA.debugLine="Private Sub BtnRegister_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Core.ExecuteUrl(Main.API&\"register\", \"username=\"&";
Debug.ShouldStop(8388608);
register.mostCurrent._core.runVoidMethod ("_executeurl" /*RemoteObject*/ ,register.mostCurrent.activityBA,(Object)(RemoteObject.concat(register.mostCurrent._main._api /*RemoteObject*/ ,RemoteObject.createImmutable("register"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("username="),register.mostCurrent._editusername.runMethod(true,"getText"),RemoteObject.createImmutable("&first_name="),register.mostCurrent._editfirstname.runMethod(true,"getText"),RemoteObject.createImmutable("&last_name="),register.mostCurrent._editlastname.runMethod(true,"getText"),RemoteObject.createImmutable("&email="),register.mostCurrent._editemail.runMethod(true,"getText"),RemoteObject.createImmutable("&password="),register.mostCurrent._editpassword.runMethod(true,"getText"),RemoteObject.createImmutable("&confirm_password="),register.mostCurrent._editconfirmpassword.runMethod(true,"getText"),RemoteObject.createImmutable("&role_id="),RemoteObject.createImmutable("2"))),(Object)(BA.ObjectToString("Register")),(Object)(register.getObject()));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
register.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private Navbar As Panel";
register.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EditUsername As EditText";
register.mostCurrent._editusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private EditFirstname As EditText";
register.mostCurrent._editfirstname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private EditLastname As EditText";
register.mostCurrent._editlastname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private EditEmail As EditText";
register.mostCurrent._editemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private EditPassword As EditText";
register.mostCurrent._editpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private EditConfirmpassword As EditText";
register.mostCurrent._editconfirmpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private BtnRegister As Button";
register.mostCurrent._btnregister = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Public sessionID As String";
register.mostCurrent._sessionid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Public csrfToken As String";
register.mostCurrent._csrftoken = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="Public manager As AHPreferenceManager";
register.mostCurrent._manager = RemoteObject.createNew ("de.amberhome.objects.preferenceactivity.PreferenceManager");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelLogin As Panel";
register.mostCurrent._panellogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (register) ","register",11,register.mostCurrent.activityBA,register.mostCurrent,59);
if (RapidSub.canDelegate("jobdone")) { return b4a.DesaWisataSaribu.register.remoteMe.runUserSub(false, "register","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _message = RemoteObject.declareNull("Object");
RemoteObject _messagestring = RemoteObject.createImmutable("");
RemoteObject _templist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _errormap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sberrors = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 59;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(268435456);
register.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 64;BA.debugLine="Log(\"JobDone: JobName = \" & Job.JobName & \", Succ";
Debug.ShouldStop(-2147483648);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847365",RemoteObject.concat(RemoteObject.createImmutable("JobDone: JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 67;BA.debugLine="If Job.JobName = \"Register\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("Register"))) { 
 BA.debugLineNum = 71;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(64);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 73;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 74;BA.debugLine="Dim res As String";
Debug.ShouldStop(512);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 75;BA.debugLine="res = Job.GetString ' Get the response body as";
Debug.ShouldStop(1024);
_res = _job.runClassMethod (b4a.DesaWisataSaribu.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 76;BA.debugLine="Log(\"Response from server (Register Job): \" &";
Debug.ShouldStop(2048);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847377",RemoteObject.concat(RemoteObject.createImmutable("Response from server (Register Job): "),_res),0);
 BA.debugLineNum = 79;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(16384);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 80;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(32768);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 81;BA.debugLine="Dim map As Map = parser.NextObject ' Get the r";
Debug.ShouldStop(65536);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 84;BA.debugLine="Dim status As Int = map.Get(\"status\")";
Debug.ShouldStop(524288);
_status = BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 85;BA.debugLine="Dim message As Object = map.Get(\"message\")";
Debug.ShouldStop(1048576);
_message = _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message"))));Debug.locals.put("message", _message);Debug.locals.put("message", _message);
 BA.debugLineNum = 86;BA.debugLine="Dim messageString As String";
Debug.ShouldStop(2097152);
_messagestring = RemoteObject.createImmutable("");Debug.locals.put("messageString", _messagestring);
 BA.debugLineNum = 89;BA.debugLine="If message Is String Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("i",_message, RemoteObject.createImmutable("String"))) { 
 BA.debugLineNum = 90;BA.debugLine="messageString = message";
Debug.ShouldStop(33554432);
_messagestring = BA.ObjectToString(_message);Debug.locals.put("messageString", _messagestring);
 }else 
{ BA.debugLineNum = 91;BA.debugLine="Else If message Is List Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("i",_message, RemoteObject.createImmutable("java.util.List"))) { 
 BA.debugLineNum = 93;BA.debugLine="Dim tempList As List = message";
Debug.ShouldStop(268435456);
_templist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_templist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _message);Debug.locals.put("tempList", _templist);Debug.locals.put("tempList", _templist);
 BA.debugLineNum = 94;BA.debugLine="If tempList.Size > 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_templist.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 95;BA.debugLine="messageString = tempList.Get(0) ' Ambil pesa";
Debug.ShouldStop(1073741824);
_messagestring = BA.ObjectToString(_templist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("messageString", _messagestring);
 }else {
 BA.debugLineNum = 97;BA.debugLine="messageString = \"Received an empty success m";
Debug.ShouldStop(1);
_messagestring = BA.ObjectToString("Received an empty success message list.");Debug.locals.put("messageString", _messagestring);
 };
 BA.debugLineNum = 99;BA.debugLine="Log(\"Message field is a List: \" & message)";
Debug.ShouldStop(4);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847400",RemoteObject.concat(RemoteObject.createImmutable("Message field is a List: "),_message),0);
 }else 
{ BA.debugLineNum = 100;BA.debugLine="Else If message Is Map Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("i",_message, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 102;BA.debugLine="Dim errorMap As Map = message";
Debug.ShouldStop(32);
_errormap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_errormap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _message);Debug.locals.put("errorMap", _errormap);Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 103;BA.debugLine="Dim sbErrors As StringBuilder";
Debug.ShouldStop(64);
_sberrors = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbErrors", _sberrors);
 BA.debugLineNum = 104;BA.debugLine="sbErrors.Initialize";
Debug.ShouldStop(128);
_sberrors.runVoidMethod ("Initialize");
 BA.debugLineNum = 105;BA.debugLine="For Each key As String In errorMap.Keys";
Debug.ShouldStop(256);
{
final RemoteObject group29 = _errormap.runMethod(false,"Keys");
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_key = BA.ObjectToString(group29.runMethod(false,"Get",index29));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 106;BA.debugLine="sbErrors.Append(key).Append(\": \").Append(err";
Debug.ShouldStop(512);
_sberrors.runMethod(false,"Append",(Object)(_key)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(": "))).runMethod(false,"Append",(Object)(BA.ObjectToString(_errormap.runMethod(false,"Get",(Object)((_key)))))).runVoidMethod ("Append",(Object)(register.mostCurrent.__c.getField(true,"CRLF")));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 108;BA.debugLine="messageString = sbErrors.ToString ' String be";
Debug.ShouldStop(2048);
_messagestring = _sberrors.runMethod(true,"ToString");Debug.locals.put("messageString", _messagestring);
 BA.debugLineNum = 109;BA.debugLine="Log(\"Message field is a Map (Validation Error";
Debug.ShouldStop(4096);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847410",RemoteObject.concat(RemoteObject.createImmutable("Message field is a Map (Validation Errors): "),_message),0);
 }else {
 BA.debugLineNum = 112;BA.debugLine="messageString = \"Unknown or null message form";
Debug.ShouldStop(32768);
_messagestring = BA.ObjectToString("Unknown or null message format received from server.");Debug.locals.put("messageString", _messagestring);
 BA.debugLineNum = 113;BA.debugLine="Log(\"Message field has an unexpected type or";
Debug.ShouldStop(65536);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847414",RemoteObject.createImmutable("Message field has an unexpected type or is null."),0);
 }}}
;
 BA.debugLineNum = 117;BA.debugLine="If status = 201 Then ' Assuming 201 means succ";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 201))) { 
 BA.debugLineNum = 119;BA.debugLine="ToastMessageShow(\"Registration Successful!\",";
Debug.ShouldStop(4194304);
register.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Registration Successful!")),(Object)(register.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 122;BA.debugLine="Log(\"Account created\")";
Debug.ShouldStop(33554432);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847423",RemoteObject.createImmutable("Account created"),0);
 BA.debugLineNum = 123;BA.debugLine="Log(map) ' Log map untuk debugging";
Debug.ShouldStop(67108864);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847424",BA.ObjectToString(_map),0);
 BA.debugLineNum = 125;BA.debugLine="If map.ContainsKey(\"data\") Then";
Debug.ShouldStop(268435456);
if (_map.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("data")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 126;BA.debugLine="Dim data As Map = map.Get(\"data\")";
Debug.ShouldStop(536870912);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 127;BA.debugLine="If data <> Null And data.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("N",_data) && RemoteObject.solveBoolean(".",_data.runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 128;BA.debugLine="If data.ContainsKey(\"session_id\") Then";
Debug.ShouldStop(-2147483648);
if (_data.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("session_id")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 129;BA.debugLine="Dim sessionID As String = data.Get(\"sessio";
Debug.ShouldStop(1);
register.mostCurrent._sessionid = BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("session_id")))));
 BA.debugLineNum = 130;BA.debugLine="manager.SetString(\"session_id\", sessionID)";
Debug.ShouldStop(2);
register.mostCurrent._manager.runVoidMethod ("SetString",(Object)(BA.ObjectToString("session_id")),(Object)(register.mostCurrent._sessionid));
 };
 BA.debugLineNum = 132;BA.debugLine="If data.ContainsKey(\"csrf_token\") Then";
Debug.ShouldStop(8);
if (_data.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("csrf_token")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 133;BA.debugLine="Dim csrfToken As String = data.Get(\"csrf_t";
Debug.ShouldStop(16);
register.mostCurrent._csrftoken = BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("csrf_token")))));
 BA.debugLineNum = 134;BA.debugLine="manager.SetString(\"csrf_token\", csrfToken)";
Debug.ShouldStop(32);
register.mostCurrent._manager.runVoidMethod ("SetString",(Object)(BA.ObjectToString("csrf_token")),(Object)(register.mostCurrent._csrftoken));
 };
 BA.debugLineNum = 136;BA.debugLine="If data.ContainsKey(\"id\") Then";
Debug.ShouldStop(128);
if (_data.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("id")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 137;BA.debugLine="Dim id As String = data.Get(\"id\")";
Debug.ShouldStop(256);
_id = BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 138;BA.debugLine="manager.SetString(\"user_id\", id)";
Debug.ShouldStop(512);
register.mostCurrent._manager.runVoidMethod ("SetString",(Object)(BA.ObjectToString("user_id")),(Object)(_id));
 };
 }else {
 BA.debugLineNum = 141;BA.debugLine="Log(\"Data field received but is null or not";
Debug.ShouldStop(4096);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847442",RemoteObject.createImmutable("Data field received but is null or not initialized."),0);
 };
 }else {
 BA.debugLineNum = 144;BA.debugLine="Log(\"Data field not found in the successful";
Debug.ShouldStop(32768);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847445",RemoteObject.createImmutable("Data field not found in the successful response."),0);
 };
 BA.debugLineNum = 149;BA.debugLine="manager.SetBoolean(\"is_login\", False)";
Debug.ShouldStop(1048576);
register.mostCurrent._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(register.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 150;BA.debugLine="manager.SetBoolean(\"user\", True)";
Debug.ShouldStop(2097152);
register.mostCurrent._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("user")),(Object)(register.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 151;BA.debugLine="manager.SetBoolean(\"visitor\", False)";
Debug.ShouldStop(4194304);
register.mostCurrent._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("visitor")),(Object)(register.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 154;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
register.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 155;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(67108864);
register.mostCurrent.__c.runVoidMethod ("StartActivity",register.processBA,(Object)((register.mostCurrent._main.getObject())));
 }else {
 BA.debugLineNum = 160;BA.debugLine="ToastMessageShow(\"Registration Failed. See de";
Debug.ShouldStop(-2147483648);
register.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Registration Failed. See details.")),(Object)(register.mostCurrent.__c.getField(true,"True")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e72) {
			BA.rdebugUtils.runVoidMethod("setLastException",register.processBA, e72.toString()); BA.debugLineNum = 164;BA.debugLine="Log(\"Error processing server response (Registe";
Debug.ShouldStop(8);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847465",RemoteObject.createImmutable("Error processing server response (Register Job):"),0);
 BA.debugLineNum = 165;BA.debugLine="Log(LastException) ' Log the full exception de";
Debug.ShouldStop(16);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847466",BA.ObjectToString(register.mostCurrent.__c.runMethod(false,"LastException",register.mostCurrent.activityBA)),0);
 BA.debugLineNum = 168;BA.debugLine="ToastMessageShow(\"Error processing response.\",";
Debug.ShouldStop(128);
register.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error processing response.")),(Object)(register.mostCurrent.__c.getField(true,"True")));
 };
 }else {
 BA.debugLineNum = 172;BA.debugLine="Log(\"Error in Register Job: \" & Job.ErrorMessag";
Debug.ShouldStop(2048);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847473",RemoteObject.concat(RemoteObject.createImmutable("Error in Register Job: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 175;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage,";
Debug.ShouldStop(16384);
register.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(register.mostCurrent.__c.getField(true,"True")));
 };
 }else {
 BA.debugLineNum = 182;BA.debugLine="Log(\"JobDone received for unexpected JobName: \"";
Debug.ShouldStop(2097152);
register.mostCurrent.__c.runVoidMethod ("LogImpl","28847483",RemoteObject.concat(RemoteObject.createImmutable("JobDone received for unexpected JobName: "),_job.getField(true,"_jobname" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 186;BA.debugLine="Job.Release";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4a.DesaWisataSaribu.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}