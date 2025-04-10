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
public b4a.DesaWisataSaribu.cart _cart = null;
public b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
public static String  _executeurl(anywheresoftware.b4a.BA _ba,String _url,String _parameters,String _jobname,Object _obj) throws Exception{
RDebugUtils.currentModule="core";
if (Debug.shouldDelegate(null, "executeurl", false))
	 {return ((String) Debug.delegate(null, "executeurl", new Object[] {_ba,_url,_parameters,_jobname,_obj}));}
b4a.DesaWisataSaribu.httpjob _job = null;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub ExecuteUrl(Url As String, Parameters As String";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSaribu.httpjob();
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="job.Initialize(JobName, Obj)";
_job._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_jobname,_obj);
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="job.PostString(Url, Parameters)";
_job._poststring /*String*/ (null,_url,_parameters);
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="End Sub";
return "";
}
public static String  _executeurlget(anywheresoftware.b4a.BA _ba,String _url,String _jobname,Object _obj) throws Exception{
RDebugUtils.currentModule="core";
if (Debug.shouldDelegate(null, "executeurlget", false))
	 {return ((String) Debug.delegate(null, "executeurlget", new Object[] {_ba,_url,_jobname,_obj}));}
b4a.DesaWisataSaribu.httpjob _job = null;
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub ExecuteUrlGet(Url As String, JobName As String";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSaribu.httpjob();
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="job.Initialize(JobName, Obj)";
_job._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_jobname,_obj);
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="job.Download(Url)";
_job._download /*String*/ (null,_url);
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="End Sub";
return "";
}
}