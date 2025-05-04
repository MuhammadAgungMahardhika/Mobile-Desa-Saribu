
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

public class register implements IRemote{
	public static register mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public register() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("register"), "b4a.DesaWisataSaribu.register");
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
		pcBA = new PCBA(this, register.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _navbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _editusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _editfirstname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _editlastname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _editemail = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _editpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _editconfirmpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnregister = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _sessionid = RemoteObject.createImmutable("");
public static RemoteObject _csrftoken = RemoteObject.createImmutable("");
public static RemoteObject _manager = RemoteObject.declareNull("de.amberhome.objects.preferenceactivity.PreferenceManager");
public static RemoteObject _panellogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
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
public static b4a.DesaWisataSaribu.core _core = null;
public static b4a.DesaWisataSaribu.cart _cart = null;
public static b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public static b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public static b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",register.mostCurrent._activity,"B4XCollections",Debug.moduleToString(b4a.DesaWisataSaribu.b4xcollections.class),"BtnRegister",register.mostCurrent._btnregister,"Cart",Debug.moduleToString(b4a.DesaWisataSaribu.cart.class),"Core",Debug.moduleToString(b4a.DesaWisataSaribu.core.class),"csrfToken",register.mostCurrent._csrftoken,"DateUtils",register.mostCurrent._dateutils,"DetailEV",Debug.moduleToString(b4a.DesaWisataSaribu.detailev.class),"DetailRG",Debug.moduleToString(b4a.DesaWisataSaribu.detailrg.class),"EditConfirmpassword",register.mostCurrent._editconfirmpassword,"EditEmail",register.mostCurrent._editemail,"EditFirstname",register.mostCurrent._editfirstname,"EditLastname",register.mostCurrent._editlastname,"EditPassword",register.mostCurrent._editpassword,"EditUsername",register.mostCurrent._editusername,"Gemma",Debug.moduleToString(b4a.DesaWisataSaribu.gemma.class),"HomeUser",Debug.moduleToString(b4a.DesaWisataSaribu.homeuser.class),"HomeVisitor",Debug.moduleToString(b4a.DesaWisataSaribu.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.DesaWisataSaribu.httputils2service.class),"ListEv",Debug.moduleToString(b4a.DesaWisataSaribu.listev.class),"ListPackage",Debug.moduleToString(b4a.DesaWisataSaribu.listpackage.class),"ListRG",Debug.moduleToString(b4a.DesaWisataSaribu.listrg.class),"Main",Debug.moduleToString(b4a.DesaWisataSaribu.main.class),"MainScroll",register.mostCurrent._mainscroll,"manager",register.mostCurrent._manager,"MapsEV",Debug.moduleToString(b4a.DesaWisataSaribu.mapsev.class),"MapsRG",Debug.moduleToString(b4a.DesaWisataSaribu.mapsrg.class),"Navbar",register.mostCurrent._navbar,"PanelLogin",register.mostCurrent._panellogin,"sessionID",register.mostCurrent._sessionid,"Starter",Debug.moduleToString(b4a.DesaWisataSaribu.starter.class),"XUIViewsUtils",Debug.moduleToString(b4a.DesaWisataSaribu.xuiviewsutils.class)};
}
}