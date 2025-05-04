
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

public class mapsrg implements IRemote{
	public static mapsrg mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mapsrg() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mapsrg"), "b4a.DesaWisataSaribu.mapsrg");
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
		pcBA = new PCBA(this, mapsrg.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _namerg = RemoteObject.createImmutable("");
public static RemoteObject _facilitymap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _isfiltered = RemoteObject.createImmutable(false);
public static RemoteObject _mywebviewextras = RemoteObject.declareNull("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
public static RemoteObject _panelrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _webviewrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _btnback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _navbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _titlenavbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnuserloc = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnobj = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _edtsearchrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _panelsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelrating = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _spinrating = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _panelfacility = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _spinfacility = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _panelcategory = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _spincategory = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.DesaWisataSaribu.main _main = null;
public static b4a.DesaWisataSaribu.starter _starter = null;
public static b4a.DesaWisataSaribu.homevisitor _homevisitor = null;
public static b4a.DesaWisataSaribu.listrg _listrg = null;
public static b4a.DesaWisataSaribu.detailev _detailev = null;
public static b4a.DesaWisataSaribu.homeuser _homeuser = null;
public static b4a.DesaWisataSaribu.gemma _gemma = null;
public static b4a.DesaWisataSaribu.mapsev _mapsev = null;
public static b4a.DesaWisataSaribu.detailrg _detailrg = null;
public static b4a.DesaWisataSaribu.listev _listev = null;
public static b4a.DesaWisataSaribu.register _register = null;
public static b4a.DesaWisataSaribu.listpackage _listpackage = null;
public static b4a.DesaWisataSaribu.core _core = null;
public static b4a.DesaWisataSaribu.cart _cart = null;
public static b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public static b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public static b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mapsrg.mostCurrent._activity,"B4XCollections",Debug.moduleToString(b4a.DesaWisataSaribu.b4xcollections.class),"BtnBack",mapsrg.mostCurrent._btnback,"btnList",mapsrg.mostCurrent._btnlist,"btnObj",mapsrg.mostCurrent._btnobj,"btnUserLoc",mapsrg.mostCurrent._btnuserloc,"Cart",Debug.moduleToString(b4a.DesaWisataSaribu.cart.class),"Core",Debug.moduleToString(b4a.DesaWisataSaribu.core.class),"DateUtils",mapsrg.mostCurrent._dateutils,"DetailEV",Debug.moduleToString(b4a.DesaWisataSaribu.detailev.class),"DetailRG",Debug.moduleToString(b4a.DesaWisataSaribu.detailrg.class),"edtSearchRG",mapsrg.mostCurrent._edtsearchrg,"facilityMap",mapsrg._facilitymap,"Gemma",Debug.moduleToString(b4a.DesaWisataSaribu.gemma.class),"HomeUser",Debug.moduleToString(b4a.DesaWisataSaribu.homeuser.class),"HomeVisitor",Debug.moduleToString(b4a.DesaWisataSaribu.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.DesaWisataSaribu.httputils2service.class),"isFiltered",mapsrg._isfiltered,"ListEv",Debug.moduleToString(b4a.DesaWisataSaribu.listev.class),"ListPackage",Debug.moduleToString(b4a.DesaWisataSaribu.listpackage.class),"ListRG",Debug.moduleToString(b4a.DesaWisataSaribu.listrg.class),"Main",Debug.moduleToString(b4a.DesaWisataSaribu.main.class),"MainScroll",mapsrg.mostCurrent._mainscroll,"MapsEV",Debug.moduleToString(b4a.DesaWisataSaribu.mapsev.class),"MyWebViewExtras",mapsrg.mostCurrent._mywebviewextras,"nameRG",mapsrg._namerg,"Navbar",mapsrg.mostCurrent._navbar,"PanelCategory",mapsrg.mostCurrent._panelcategory,"PanelFacility",mapsrg.mostCurrent._panelfacility,"PanelRating",mapsrg.mostCurrent._panelrating,"PanelRG",mapsrg.mostCurrent._panelrg,"PanelSearch",mapsrg.mostCurrent._panelsearch,"Register",Debug.moduleToString(b4a.DesaWisataSaribu.register.class),"spinCategory",mapsrg.mostCurrent._spincategory,"spinFacility",mapsrg.mostCurrent._spinfacility,"spinRating",mapsrg.mostCurrent._spinrating,"Starter",Debug.moduleToString(b4a.DesaWisataSaribu.starter.class),"TitleNavbar",mapsrg.mostCurrent._titlenavbar,"WebViewRG",mapsrg.mostCurrent._webviewrg,"XUIViewsUtils",Debug.moduleToString(b4a.DesaWisataSaribu.xuiviewsutils.class)};
}
}