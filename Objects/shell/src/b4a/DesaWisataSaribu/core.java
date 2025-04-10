
package b4a.DesaWisataSaribu;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class core implements IRemote{
	public static core mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public core() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, core.class);
    static {
		mostCurrent = new core();
        remoteMe = RemoteObject.declareNull("b4a.DesaWisataSaribu.core");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("core"), "b4a.DesaWisataSaribu.core");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.DesaWisataSaribu.core"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.DesaWisataSaribu.main _main = null;
public static b4a.DesaWisataSaribu.starter _starter = null;
public static b4a.DesaWisataSaribu.homevisitor _homevisitor = null;
public static b4a.DesaWisataSaribu.listrg _listrg = null;
public static b4a.DesaWisataSaribu.detailev _detailev = null;
public static b4a.DesaWisataSaribu.mapsrg _mapsrg = null;
public static b4a.DesaWisataSaribu.homeuser _homeuser = null;
public static b4a.DesaWisataSaribu.gemma _gemma = null;
public static b4a.DesaWisataSaribu.mapsev _mapsev = null;
public static b4a.DesaWisataSaribu.detailrg _detailrg = null;
public static b4a.DesaWisataSaribu.listev _listev = null;
public static b4a.DesaWisataSaribu.listpackage _listpackage = null;
public static b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public static b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public static b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(b4a.DesaWisataSaribu.b4xcollections.class),"DateUtils",core.mostCurrent._dateutils,"DetailEV",Debug.moduleToString(b4a.DesaWisataSaribu.detailev.class),"DetailRG",Debug.moduleToString(b4a.DesaWisataSaribu.detailrg.class),"Gemma",Debug.moduleToString(b4a.DesaWisataSaribu.gemma.class),"HomeUser",Debug.moduleToString(b4a.DesaWisataSaribu.homeuser.class),"HomeVisitor",Debug.moduleToString(b4a.DesaWisataSaribu.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.DesaWisataSaribu.httputils2service.class),"ListEv",Debug.moduleToString(b4a.DesaWisataSaribu.listev.class),"ListPackage",Debug.moduleToString(b4a.DesaWisataSaribu.listpackage.class),"ListRG",Debug.moduleToString(b4a.DesaWisataSaribu.listrg.class),"Main",Debug.moduleToString(b4a.DesaWisataSaribu.main.class),"MapsEV",Debug.moduleToString(b4a.DesaWisataSaribu.mapsev.class),"MapsRG",Debug.moduleToString(b4a.DesaWisataSaribu.mapsrg.class),"Starter",Debug.moduleToString(b4a.DesaWisataSaribu.starter.class),"XUIViewsUtils",Debug.moduleToString(b4a.DesaWisataSaribu.xuiviewsutils.class)};
}
}