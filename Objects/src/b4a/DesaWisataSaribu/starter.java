package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.DesaWisataSaribu", "b4a.DesaWisataSaribu.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSaribu.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			if (ServiceHelper.StarterHelper.runWaitForLayouts() == false) {
                BA.LogInfo("stopping spontaneous created service");
                stopSelf();
            }
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }

	public void onTimeout(int startId) {
        BA.LogInfo("** Service (starter) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _tasks = null;
public static anywheresoftware.b4a.objects.collections.Map _cache = null;
public static anywheresoftware.b4a.objects.collections.Map _ongoingtasks = null;
public static anywheresoftware.b4a.gps.GPS _gps1 = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static boolean _gpsstarted = false;
public static String _lat = "";
public static String _lng = "";
public static String _mapstatus = "";
public static int _webviewloading = 0;
public static anywheresoftware.b4a.objects.collections.Map _selectedobj = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSaribu.main _main = null;
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
public b4a.DesaWisataSaribu.core _core = null;
public b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(processBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper  _createbitmap() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "createbitmap", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper) Debug.delegate(processBA, "createbitmap", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rect = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _path = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
float _x = 0f;
float _y = 0f;
float _radius = 0f;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub CreateBitmap As Canvas";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Public bmp  As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="bmp.InitializeMutable(200dip, 200dip)";
_bmp.InitializeMutable(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)));
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Public cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Public rect As Rect";
_rect = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="rect.Initialize(0, 0, bmp.Width, bmp.Height)";
_rect.Initialize((int) (0),(int) (0),_bmp.getWidth(),_bmp.getHeight());
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="cvs.DrawRect(rect, Colors.Transparent, True, 0)";
_cvs.DrawRect((android.graphics.Rect)(_rect.getObject()),anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.True,(float) (0));
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Public path As Path";
_path = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="path.Initialize(0, 0)";
_path.Initialize((float) (0),(float) (0));
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Public jo As JavaObject = path";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_path.getObject()));
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Public x = 100dip, y = 100dip, radius = 100dip As";
_x = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
_y = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
_radius = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="jo.RunMethod(\"addCircle\", Array As Object(x, y, r";
_jo.RunMethod("addCircle",new Object[]{(Object)(_x),(Object)(_y),(Object)(_radius),(Object)("CW")});
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="cvs.ClipPath(path)";
_cvs.ClipPath((android.graphics.Path)(_path.getObject()));
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="Return cvs";
if (true) return _cvs;
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="End Sub";
return null;
}
public static String  _download(anywheresoftware.b4a.objects.collections.Map _imagemap) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "download", false))
	 {return ((String) Debug.delegate(processBA, "download", new Object[] {_imagemap}));}
int _i = 0;
String _path = "";
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
b4a.DesaWisataSaribu.httpjob _job = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Download (ImageMap As Map)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="For i = 0 To ImageMap.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_imagemap.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="tasks.Put(ImageMap.GetKeyAt(i), ImageMap.GetValu";
_tasks.Put(_imagemap.GetKeyAt(_i),_imagemap.GetValueAt(_i));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Public path As String = ImageMap.GetValueAt(i)";
_path = BA.ObjectToString(_imagemap.GetValueAt(_i));
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="If cache.ContainsKey(path) Then";
if (_cache.ContainsKey((Object)(_path))) { 
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Public iv As ImageView = ImageMap.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imagemap.GetKeyAt(_i)));
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="iv.SetBackgroundImage(cache.Get(path))";
_iv.SetBackgroundImageNew((android.graphics.Bitmap)(_cache.Get((Object)(_path))));
 }else 
{RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Else If ongoingTasks.ContainsKey(path) = False T";
if (_ongoingtasks.ContainsKey((Object)(_path))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="ongoingTasks.Put(path, \"\")";
_ongoingtasks.Put((Object)(_path),(Object)(""));
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="Public Job As HttpJob";
_job = new b4a.DesaWisataSaribu.httpjob();
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Job.Initialize(path, Me)";
_job._initialize /*String*/ (null,processBA,_path,starter.getObject());
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Job.Download(path)";
_job._download /*String*/ (null,_path);
 }}
;
 }
};
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="End Sub";
return "";
}
public static String  _drawroundbitmap(anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "drawroundbitmap", false))
	 {return ((String) Debug.delegate(processBA, "drawroundbitmap", new Object[] {_cvs,_bmp}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub DrawRoundBitmap (cvs As Canvas, bmp As Bitmap)";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Public r As Rect";
_r = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="r.Initialize(0, 0, cvs.Bitmap.Width, cvs.Bitmap.H";
_r.Initialize((int) (0),(int) (0),_cvs.getBitmap().getWidth(),_cvs.getBitmap().getHeight());
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="cvs.DrawBitmap(bmp, Null, r)";
_cvs.DrawBitmap((android.graphics.Bitmap)(_bmp.getObject()),(android.graphics.Rect)(anywheresoftware.b4a.keywords.Common.Null),(android.graphics.Rect)(_r.getObject()));
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="End Sub";
return "";
}
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "gps_locationchanged", false))
	 {return ((String) Debug.delegate(processBA, "gps_locationchanged", new Object[] {_location1}));}
String _currentlat = "";
String _currentlng = "";
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub GPS_LocationChanged(Location1 As Location)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim currentLat, currentLng As String";
_currentlat = "";
_currentlng = "";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="currentLat = Location1.Latitude";
_currentlat = BA.NumberToString(_location1.getLatitude());
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="currentLng = Location1.Longitude";
_currentlng = BA.NumberToString(_location1.getLongitude());
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="If currentLat <> lat And currentLng <> lng Then";
if ((_currentlat).equals(_lat) == false && (_currentlng).equals(_lng) == false) { 
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="lat = currentLat";
_lat = _currentlat;
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="lng = currentLng";
_lng = _currentlng;
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Log(\"Current Location\")";
anywheresoftware.b4a.keywords.Common.LogImpl("61114119","Current Location",0);
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="Log(\"Lat = \" & lat)";
anywheresoftware.b4a.keywords.Common.LogImpl("61114120","Lat = "+_lat,0);
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Log(\"Lng = \" & lng)";
anywheresoftware.b4a.keywords.Common.LogImpl("61114121","Lng = "+_lng,0);
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="If webviewLoading == 100 Then";
if (_webviewloading==100) { 
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="If mapStatus == \"RG\" Then";
if ((_mapstatus).equals("RG")) { 
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="CallSub(MapsRG, \"UpdateLocation\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._mapsrg.getObject()),"UpdateLocation");
 }else 
{RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="Else If mapStatus == \"EV\" Then";
if ((_mapstatus).equals("EV")) { 
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="CallSub(MapsEV, \"UpdateLocation\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._mapsev.getObject()),"UpdateLocation");
 }}
;
 };
 };
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSaribu.httpjob _job) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "jobdone", false))
	 {return ((String) Debug.delegate(processBA, "jobdone", new Object[] {_job}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
int _i = 0;
String _path = "";
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _canvas = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
_ongoingtasks.Remove((Object)(_job._jobname /*String*/ ));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Public bmp As Bitmap = Job.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _job._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="If tasks.IsInitialized Then";
if (_tasks.IsInitialized()) { 
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="For i = 0 To tasks.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_tasks.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Public path As String = tasks.GetValueAt(i)";
_path = BA.ObjectToString(_tasks.GetValueAt(_i));
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="If path = Job.JobName Then";
if ((_path).equals(_job._jobname /*String*/ )) { 
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Public iv As ImageView = tasks.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_tasks.GetKeyAt(_i)));
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Public canvas As Canvas = CreateBitmap";
_canvas = _createbitmap();
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="DrawRoundBitmap(canvas, bmp)";
_drawroundbitmap(_canvas,_bmp);
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="iv.SetBackgroundImage(canvas.Bitmap)";
_iv.SetBackgroundImageNew((android.graphics.Bitmap)(_canvas.getBitmap().getObject()));
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="cache.Put(Job.JobName, canvas.Bitmap)";
_cache.Put((Object)(_job._jobname /*String*/ ),(Object)(_canvas.getBitmap().getObject()));
 };
 }
};
 };
 }else {
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
anywheresoftware.b4a.keywords.Common.LogImpl("6917521","Error downloading image: "+_job._jobname /*String*/ +anywheresoftware.b4a.keywords.Common.CRLF+_job._errormessage /*String*/ ,0);
 };
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="cache.Initialize";
_cache.Initialize();
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="ongoingTasks.Initialize";
_ongoingtasks.Initialize();
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="GPS1.Initialize(\"GPS\")";
_gps1.Initialize("GPS");
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_taskremoved", false))
	 {return ((String) Debug.delegate(processBA, "service_taskremoved", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Service_TaskRemoved";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public static String  _startgps() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "startgps", false))
	 {return ((String) Debug.delegate(processBA, "startgps", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub StartGPS";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="If gpsStarted = False Then";
if (_gpsstarted==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="GPS1.Start(0, 0)";
_gps1.Start(processBA,(long) (0),(float) (0));
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="gpsStarted = True";
_gpsstarted = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Log(\"GPS is started\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6720900","GPS is started",0);
 };
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="End Sub";
return "";
}
public static String  _stopgps() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "stopgps", false))
	 {return ((String) Debug.delegate(processBA, "stopgps", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub StopGPS";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="If gpsStarted Then";
if (_gpsstarted) { 
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="GPS1.Stop";
_gps1.Stop();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="gpsStarted = False";
_gpsstarted = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Log(\"GPS is stopped\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6786436","GPS is stopped",0);
 };
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="End Sub";
return "";
}
}