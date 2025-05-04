
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

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.DesaWisataSaribu.main");
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
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _server = RemoteObject.createImmutable("");
public static RemoteObject _api = RemoteObject.createImmutable("");
public static RemoteObject _mobileuri = RemoteObject.createImmutable("");
public static RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _user = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _email = RemoteObject.createImmutable("");
public static RemoteObject _first_name = RemoteObject.createImmutable("");
public static RemoteObject _last_name = RemoteObject.createImmutable("");
public static RemoteObject _avatar = RemoteObject.createImmutable("");
public static RemoteObject _address = RemoteObject.createImmutable("");
public static RemoteObject _phone = RemoteObject.createImmutable("");
public static RemoteObject _in_group = RemoteObject.createImmutable(false);
public static RemoteObject _sessionid = RemoteObject.createImmutable("");
public static RemoteObject _csrftoken = RemoteObject.createImmutable("");
public static RemoteObject _manager = RemoteObject.declareNull("de.amberhome.objects.preferenceactivity.PreferenceManager");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _navbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnvisitor = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _editlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _editpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _imagelogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _panellogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnregister = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
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
public static b4a.DesaWisataSaribu.register _register = null;
public static b4a.DesaWisataSaribu.listpackage _listpackage = null;
public static b4a.DesaWisataSaribu.core _core = null;
public static b4a.DesaWisataSaribu.cart _cart = null;
public static b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public static b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public static b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"address",main._address,"API",main._api,"avatar",main._avatar,"B4XCollections",Debug.moduleToString(b4a.DesaWisataSaribu.b4xcollections.class),"BtnLogin",main.mostCurrent._btnlogin,"BtnRegister",main.mostCurrent._btnregister,"BtnVisitor",main.mostCurrent._btnvisitor,"Cart",Debug.moduleToString(b4a.DesaWisataSaribu.cart.class),"Core",Debug.moduleToString(b4a.DesaWisataSaribu.core.class),"csrfToken",main._csrftoken,"data",main._data,"DateUtils",main.mostCurrent._dateutils,"DetailEV",Debug.moduleToString(b4a.DesaWisataSaribu.detailev.class),"DetailRG",Debug.moduleToString(b4a.DesaWisataSaribu.detailrg.class),"EditLogin",main.mostCurrent._editlogin,"EditPassword",main.mostCurrent._editpassword,"email",main._email,"first_name",main._first_name,"Gemma",Debug.moduleToString(b4a.DesaWisataSaribu.gemma.class),"HomeUser",Debug.moduleToString(b4a.DesaWisataSaribu.homeuser.class),"HomeVisitor",Debug.moduleToString(b4a.DesaWisataSaribu.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.DesaWisataSaribu.httputils2service.class),"id",main._id,"ImageLogin",main.mostCurrent._imagelogin,"in_group",main._in_group,"last_name",main._last_name,"ListEv",Debug.moduleToString(b4a.DesaWisataSaribu.listev.class),"ListPackage",Debug.moduleToString(b4a.DesaWisataSaribu.listpackage.class),"ListRG",Debug.moduleToString(b4a.DesaWisataSaribu.listrg.class),"MainScroll",main.mostCurrent._mainscroll,"manager",main._manager,"MapsEV",Debug.moduleToString(b4a.DesaWisataSaribu.mapsev.class),"MapsRG",Debug.moduleToString(b4a.DesaWisataSaribu.mapsrg.class),"MobileUri",main._mobileuri,"Navbar",main.mostCurrent._navbar,"PanelLogin",main.mostCurrent._panellogin,"phone",main._phone,"Register",Debug.moduleToString(b4a.DesaWisataSaribu.register.class),"server",main._server,"sessionID",main._sessionid,"Starter",Debug.moduleToString(b4a.DesaWisataSaribu.starter.class),"user",main._user,"username",main._username,"xui",main._xui,"XUIViewsUtils",Debug.moduleToString(b4a.DesaWisataSaribu.xuiviewsutils.class)};
}
}