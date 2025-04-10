
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

public class listpackage implements IRemote{
	public static listpackage mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public listpackage() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("listpackage"), "b4a.DesaWisataSaribu.listpackage");
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
		pcBA = new PCBA(this, listpackage.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _titlenavbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _navbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _webviewpackage = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _mywebviewextras = RemoteObject.declareNull("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
public static RemoteObject _mywebviewsettings = RemoteObject.declareNull("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
public static RemoteObject _manager = RemoteObject.declareNull("de.amberhome.objects.preferenceactivity.PreferenceManager");
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
public static b4a.DesaWisataSaribu.core _core = null;
public static b4a.DesaWisataSaribu.cart _cart = null;
public static b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public static b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public static b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",listpackage.mostCurrent._activity,"B4XCollections",Debug.moduleToString(b4a.DesaWisataSaribu.b4xcollections.class),"Cart",Debug.moduleToString(b4a.DesaWisataSaribu.cart.class),"Core",Debug.moduleToString(b4a.DesaWisataSaribu.core.class),"DateUtils",listpackage.mostCurrent._dateutils,"DetailEV",Debug.moduleToString(b4a.DesaWisataSaribu.detailev.class),"DetailRG",Debug.moduleToString(b4a.DesaWisataSaribu.detailrg.class),"Gemma",Debug.moduleToString(b4a.DesaWisataSaribu.gemma.class),"HomeUser",Debug.moduleToString(b4a.DesaWisataSaribu.homeuser.class),"HomeVisitor",Debug.moduleToString(b4a.DesaWisataSaribu.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.DesaWisataSaribu.httputils2service.class),"ListEv",Debug.moduleToString(b4a.DesaWisataSaribu.listev.class),"ListRG",Debug.moduleToString(b4a.DesaWisataSaribu.listrg.class),"Main",Debug.moduleToString(b4a.DesaWisataSaribu.main.class),"MainScroll",listpackage.mostCurrent._mainscroll,"manager",listpackage.mostCurrent._manager,"MapsEV",Debug.moduleToString(b4a.DesaWisataSaribu.mapsev.class),"MapsRG",Debug.moduleToString(b4a.DesaWisataSaribu.mapsrg.class),"MyWebViewExtras",listpackage.mostCurrent._mywebviewextras,"MyWebViewSettings",listpackage.mostCurrent._mywebviewsettings,"Navbar",listpackage.mostCurrent._navbar,"Starter",Debug.moduleToString(b4a.DesaWisataSaribu.starter.class),"TitleNavbar",listpackage.mostCurrent._titlenavbar,"WebViewPackage",listpackage.mostCurrent._webviewpackage,"XUIViewsUtils",Debug.moduleToString(b4a.DesaWisataSaribu.xuiviewsutils.class)};
}
}