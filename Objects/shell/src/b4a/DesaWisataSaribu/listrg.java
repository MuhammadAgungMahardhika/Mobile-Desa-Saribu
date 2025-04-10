
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

public class listrg implements IRemote{
	public static listrg mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public listrg() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("listrg"), "b4a.DesaWisataSaribu.listrg");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, listrg.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _isdownloadready = RemoteObject.createImmutable(false);
public static RemoteObject _btnback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _titlenavbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _navbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnrefresh = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _loadrefresh = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _clv = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _panellist = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panellistitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _idrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _namerg = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _ivrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _imgmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mediamanager = RemoteObject.declareNull("b4a.DesaWisataSaribu.simplemediamanager");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.DesaWisataSaribu.main _main = null;
public static b4a.DesaWisataSaribu.starter _starter = null;
public static b4a.DesaWisataSaribu.homevisitor _homevisitor = null;
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
		return new Object[] {"Activity",listrg.mostCurrent._activity,"B4XCollections",Debug.moduleToString(b4a.DesaWisataSaribu.b4xcollections.class),"BtnBack",listrg.mostCurrent._btnback,"btnRefresh",listrg.mostCurrent._btnrefresh,"Cart",Debug.moduleToString(b4a.DesaWisataSaribu.cart.class),"CLV",listrg.mostCurrent._clv,"Core",Debug.moduleToString(b4a.DesaWisataSaribu.core.class),"DateUtils",listrg.mostCurrent._dateutils,"DetailEV",Debug.moduleToString(b4a.DesaWisataSaribu.detailev.class),"DetailRG",Debug.moduleToString(b4a.DesaWisataSaribu.detailrg.class),"Gemma",Debug.moduleToString(b4a.DesaWisataSaribu.gemma.class),"HomeUser",Debug.moduleToString(b4a.DesaWisataSaribu.homeuser.class),"HomeVisitor",Debug.moduleToString(b4a.DesaWisataSaribu.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.DesaWisataSaribu.httputils2service.class),"idRG",listrg.mostCurrent._idrg,"imgMap",listrg.mostCurrent._imgmap,"isDownloadReady",listrg._isdownloadready,"ivRG",listrg.mostCurrent._ivrg,"ListEv",Debug.moduleToString(b4a.DesaWisataSaribu.listev.class),"ListPackage",Debug.moduleToString(b4a.DesaWisataSaribu.listpackage.class),"loadRefresh",listrg.mostCurrent._loadrefresh,"Main",Debug.moduleToString(b4a.DesaWisataSaribu.main.class),"MainScroll",listrg.mostCurrent._mainscroll,"MapsEV",Debug.moduleToString(b4a.DesaWisataSaribu.mapsev.class),"MapsRG",Debug.moduleToString(b4a.DesaWisataSaribu.mapsrg.class),"MediaManager",listrg.mostCurrent._mediamanager,"nameRG",listrg.mostCurrent._namerg,"Navbar",listrg.mostCurrent._navbar,"PanelList",listrg.mostCurrent._panellist,"PanelListItem",listrg.mostCurrent._panellistitem,"Starter",Debug.moduleToString(b4a.DesaWisataSaribu.starter.class),"TitleNavbar",listrg.mostCurrent._titlenavbar,"xui",listrg._xui,"XUIViewsUtils",Debug.moduleToString(b4a.DesaWisataSaribu.xuiviewsutils.class)};
}
}