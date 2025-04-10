package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class core {
private static core mostCurrent = new core();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
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
public b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
public static String  _executeurl(anywheresoftware.b4a.BA _ba,String _url,String _parameters,String _jobname,Object _obj) throws Exception{
RDebugUtils.currentModule="core";
if (Debug.shouldDelegate(null, "executeurl", false))
	 {return ((String) Debug.delegate(null, "executeurl", new Object[] {_ba,_url,_parameters,_jobname,_obj}));}
b4a.DesaWisataSaribu.httpjob _job = null;
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Sub ExecuteUrl(Url As String, Parameters As String";
RDebugUtils.currentLine=40697857;
 //BA.debugLineNum = 40697857;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSaribu.httpjob();
RDebugUtils.currentLine=40697858;
 //BA.debugLineNum = 40697858;BA.debugLine="job.Initialize(JobName, Obj)";
_job._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_jobname,_obj);
RDebugUtils.currentLine=40697859;
 //BA.debugLineNum = 40697859;BA.debugLine="job.PostString(Url, Parameters)";
_job._poststring /*String*/ (null,_url,_parameters);
RDebugUtils.currentLine=40697860;
 //BA.debugLineNum = 40697860;BA.debugLine="End Sub";
return "";
}
public static String  _executeurlget(anywheresoftware.b4a.BA _ba,String _url,String _jobname,Object _obj) throws Exception{
RDebugUtils.currentModule="core";
if (Debug.shouldDelegate(null, "executeurlget", false))
	 {return ((String) Debug.delegate(null, "executeurlget", new Object[] {_ba,_url,_jobname,_obj}));}
b4a.DesaWisataSaribu.httpjob _job = null;
RDebugUtils.currentLine=40763392;
 //BA.debugLineNum = 40763392;BA.debugLine="Sub ExecuteUrlGet(Url As String, JobName As String";
RDebugUtils.currentLine=40763393;
 //BA.debugLineNum = 40763393;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSaribu.httpjob();
RDebugUtils.currentLine=40763394;
 //BA.debugLineNum = 40763394;BA.debugLine="job.Initialize(JobName, Obj)";
_job._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_jobname,_obj);
RDebugUtils.currentLine=40763395;
 //BA.debugLineNum = 40763395;BA.debugLine="job.Download(Url)";
_job._download /*String*/ (null,_url);
RDebugUtils.currentLine=40763396;
 //BA.debugLineNum = 40763396;BA.debugLine="End Sub";
return "";
}
}