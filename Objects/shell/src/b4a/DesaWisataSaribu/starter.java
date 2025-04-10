
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

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "b4a.DesaWisataSaribu.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("b4a.DesaWisataSaribu.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) mostCurrent.pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cache = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _ongoingtasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _gps1 = RemoteObject.declareNull("anywheresoftware.b4a.gps.GPS");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _gpsstarted = RemoteObject.createImmutable(false);
public static RemoteObject _lat = RemoteObject.createImmutable("");
public static RemoteObject _lng = RemoteObject.createImmutable("");
public static RemoteObject _mapstatus = RemoteObject.createImmutable("");
public static RemoteObject _webviewloading = RemoteObject.createImmutable(0);
public static RemoteObject _selectedobj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.DesaWisataSaribu.main _main = null;
public static b4a.DesaWisataSaribu.homevisitor _homevisitor = null;
public static b4a.DesaWisataSaribu.listrg _listrg = null;
public static b4a.DesaWisataSaribu.detailev _detailev = null;
public static b4a.DesaWisataSaribu.mapsrg _mapsrg = null;
public static b4a.DesaWisataSaribu.homeuser _homeuser = null;
public static b4a.DesaWisataSaribu.gemma _gemma = null;
public static b4a.DesaWisataSaribu.mapsev _mapsev = null;
public static b4a.DesaWisataSaribu.detailrg _detailrg = null;
public static b4a.DesaWisataSaribu.listev _listev = null;
public static b4a.DesaWisataSaribu.core _core = null;
public static b4a.DesaWisataSaribu.listpackage _listpackage = null;
public static b4a.DesaWisataSaribu.cart _cart = null;
public static b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public static b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public static b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(b4a.DesaWisataSaribu.b4xcollections.class),"cache",starter._cache,"Cart",Debug.moduleToString(b4a.DesaWisataSaribu.cart.class),"Core",Debug.moduleToString(b4a.DesaWisataSaribu.core.class),"DateUtils",starter.mostCurrent._dateutils,"DetailEV",Debug.moduleToString(b4a.DesaWisataSaribu.detailev.class),"DetailRG",Debug.moduleToString(b4a.DesaWisataSaribu.detailrg.class),"Gemma",Debug.moduleToString(b4a.DesaWisataSaribu.gemma.class),"GPS1",starter._gps1,"gpsStarted",starter._gpsstarted,"HomeUser",Debug.moduleToString(b4a.DesaWisataSaribu.homeuser.class),"HomeVisitor",Debug.moduleToString(b4a.DesaWisataSaribu.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.DesaWisataSaribu.httputils2service.class),"lat",starter._lat,"ListEv",Debug.moduleToString(b4a.DesaWisataSaribu.listev.class),"ListPackage",Debug.moduleToString(b4a.DesaWisataSaribu.listpackage.class),"ListRG",Debug.moduleToString(b4a.DesaWisataSaribu.listrg.class),"lng",starter._lng,"Main",Debug.moduleToString(b4a.DesaWisataSaribu.main.class),"MapsEV",Debug.moduleToString(b4a.DesaWisataSaribu.mapsev.class),"MapsRG",Debug.moduleToString(b4a.DesaWisataSaribu.mapsrg.class),"mapStatus",starter._mapstatus,"ongoingTasks",starter._ongoingtasks,"rp",starter._rp,"selectedObj",starter._selectedobj,"Service",starter.mostCurrent._service,"tasks",starter._tasks,"webviewLoading",starter._webviewloading,"XUIViewsUtils",Debug.moduleToString(b4a.DesaWisataSaribu.xuiviewsutils.class)};
}
}