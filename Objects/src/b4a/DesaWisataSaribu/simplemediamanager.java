package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class simplemediamanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSaribu.simplemediamanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSaribu.simplemediamanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _smmediameta{
public boolean IsInitialized;
public String Mime;
public int MediaType;
public String Key;
public int MetaState;
public b4a.DesaWisataSaribu.httpjob Job;
public boolean Permanent;
public b4a.DesaWisataSaribu.b4xset WaitingRequestsSets;
public String FirstUrl;
public String Dir;
public String FileName;
public void Initialize() {
IsInitialized = true;
Mime = "";
MediaType = 0;
Key = "";
MetaState = 0;
Job = new b4a.DesaWisataSaribu.httpjob();
Permanent = false;
WaitingRequestsSets = new b4a.DesaWisataSaribu.b4xset();
FirstUrl = "";
Dir = "";
FileName = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _smmedia{
public boolean IsInitialized;
public Object Media;
public b4a.DesaWisataSaribu.simplemediamanager._smmediameta Meta;
public b4a.DesaWisataSaribu.b4xset UsedBy;
public int MediaState;
public b4a.DesaWisataSaribu.b4xset WaitingRequestsSets;
public b4a.DesaWisataSaribu.httpjob Job;
public void Initialize() {
IsInitialized = true;
Media = new Object();
Meta = new b4a.DesaWisataSaribu.simplemediamanager._smmediameta();
UsedBy = new b4a.DesaWisataSaribu.b4xset();
MediaState = 0;
WaitingRequestsSets = new b4a.DesaWisataSaribu.b4xset();
Job = new b4a.DesaWisataSaribu.httpjob();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _smmediarequest{
public boolean IsInitialized;
public String Key;
public String Url;
public String Mime;
public anywheresoftware.b4a.objects.collections.Map Extra;
public void Initialize() {
IsInitialized = true;
Key = "";
Url = "";
Mime = "";
Extra = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _smmediarequestset{
public boolean IsInitialized;
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest Loading;
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest MainMedia;
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest Error;
public anywheresoftware.b4a.objects.B4XViewWrapper Target;
public int NumberOfAncestors;
public int RequestState;
public Object Callback;
public void Initialize() {
IsInitialized = true;
Loading = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequest();
MainMedia = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequest();
Error = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequest();
Target = new anywheresoftware.b4a.objects.B4XViewWrapper();
NumberOfAncestors = 0;
RequestState = 0;
Callback = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public int _state_loading = 0;
public int _state_error = 0;
public int _state_ready = 0;
public anywheresoftware.b4a.objects.collections.Map _metacache = null;
public b4a.DesaWisataSaribu.b4xorderedmap _mediacache = null;
public int _maxmediacachesize = 0;
public anywheresoftware.b4a.objects.collections.Map _viewsrequestset = null;
public b4a.DesaWisataSaribu.bitmapsasync _imagesloader = null;
public b4a.DesaWisataSaribu.httpjob _jobempty = null;
public String _key_default_loading = "";
public String _key_default_error = "";
public String _mime_unknown = "";
public int _maximagesize = 0;
public int _defaultfadeanimationduration = 0;
public String _defaultresizemode = "";
public int _defaultbackgroundcolor = 0;
public int _defaultforegroundcolor = 0;
public b4a.DesaWisataSaribu.smmviews _viewsmanager = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _defaultloadingrequest = null;
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _defaulterrorrequest = null;
public String _request_roundimage = "";
public String _request_background = "";
public String _request_resize_mode = "";
public String _request_fade_animation_duration = "";
public String _request_foreground = "";
public String _request_callback = "";
public String _request_zoomimageview = "";
public String _request_file = "";
public String _request_dir = "";
public String _request_headers = "";
public long _lasttrimcache = 0L;
public long _mintimebetweentrims = 0L;
public long _sleepdurationbeforedownload = 0L;
public b4a.DesaWisataSaribu.requestsmanager _httprequestsmanager = null;
public int _b4asdkversion = 0;
public int _defaultrequesttimeout = 0;
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
public b4a.DesaWisataSaribu.register _register = null;
public b4a.DesaWisataSaribu.listpackage _listpackage = null;
public b4a.DesaWisataSaribu.core _core = null;
public b4a.DesaWisataSaribu.cart _cart = null;
public b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4j.object.JavaObject _build = null;
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="ImagesLoader.Initialize";
__ref._imagesloader /*b4a.DesaWisataSaribu.bitmapsasync*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="ImagesLoader.MaxFileSize = 8 * 1024 * 1024";
__ref._imagesloader /*b4a.DesaWisataSaribu.bitmapsasync*/ ._maxfilesize /*long*/  = (long) (8*1024*1024);
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="MetaCache.Initialize";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="MediaCache.Initialize";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="ViewsRequestSet.Initialize";
__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="ViewsManager.Initialize (Me)";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._initialize /*String*/ (null,ba,(b4a.DesaWisataSaribu.simplemediamanager)(this));
RDebugUtils.currentLine=12648456;
 //BA.debugLineNum = 12648456;BA.debugLine="Dim build As JavaObject";
_build = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=12648457;
 //BA.debugLineNum = 12648457;BA.debugLine="B4ASdkVersion =  build.InitializeStatic(\"android.";
__ref._b4asdkversion /*int*/  = (int)(BA.ObjectToNumber(_build.InitializeStatic("android.os.Build$VERSION").GetField("SDK_INT")));
RDebugUtils.currentLine=12648459;
 //BA.debugLineNum = 12648459;BA.debugLine="AddLocalMedia(KEY_DEFAULT_ERROR, Null, \"none\")";
__ref._addlocalmedia /*b4a.DesaWisataSaribu.simplemediamanager._smmedia*/ (null,__ref._key_default_error /*String*/ ,__c.Null,"none");
RDebugUtils.currentLine=12648460;
 //BA.debugLineNum = 12648460;BA.debugLine="DefaultLoadingRequest = CreateSMMRequest(KEY_DEFA";
__ref._defaultloadingrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/  = __ref._createsmmrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,__ref._key_default_loading /*String*/ ,"",__ref._mime_unknown /*String*/ );
RDebugUtils.currentLine=12648461;
 //BA.debugLineNum = 12648461;BA.debugLine="DefaultLoadingRequest.Extra.Put(REQUEST_BACKGROUN";
__ref._defaultloadingrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._request_background /*String*/ ),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White));
RDebugUtils.currentLine=12648462;
 //BA.debugLineNum = 12648462;BA.debugLine="DefaultErrorRequest = CreateSMMRequest(KEY_DEFAUL";
__ref._defaulterrorrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/  = __ref._createsmmrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,__ref._key_default_error /*String*/ ,"",__ref._mime_unknown /*String*/ );
RDebugUtils.currentLine=12648463;
 //BA.debugLineNum = 12648463;BA.debugLine="DefaultErrorRequest.Extra.Put(REQUEST_BACKGROUND,";
__ref._defaulterrorrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._request_background /*String*/ ),(Object)(((int)0xff6a6a6a)));
RDebugUtils.currentLine=12648464;
 //BA.debugLineNum = 12648464;BA.debugLine="AddLocalMedia(KEY_DEFAULT_LOADING, Null, \"none\")";
__ref._addlocalmedia /*b4a.DesaWisataSaribu.simplemediamanager._smmedia*/ (null,__ref._key_default_loading /*String*/ ,__c.Null,"none");
RDebugUtils.currentLine=12648465;
 //BA.debugLineNum = 12648465;BA.debugLine="LastTrimCache = DateTime.Now";
__ref._lasttrimcache /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=12648466;
 //BA.debugLineNum = 12648466;BA.debugLine="HttpRequestsManager.Initialize";
__ref._httprequestsmanager /*b4a.DesaWisataSaribu.requestsmanager*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=12648470;
 //BA.debugLineNum = 12648470;BA.debugLine="End Sub";
return "";
}
public String  _setmediawithextra(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target,String _url,String _mime,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmediawithextra", true))
	 {return ((String) Debug.delegate(ba, "setmediawithextra", new Object[] {_target,_url,_mime,_extra}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _request = null;
b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _rs = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub SetMediaWithExtra (Target As B4XView, U";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="If Mime = \"\" Then Mime = MIME_UNKNOWN";
if ((_mime).equals("")) { 
_mime = __ref._mime_unknown /*String*/ ;};
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="If Extra = Null Or Extra.IsInitialized = False Th";
if (_extra== null || _extra.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="Dim Extra As Map";
_extra = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="Extra.Initialize";
_extra.Initialize();
 };
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="Dim Request As SMMediaRequest = CreateSMMRequest2";
_request = __ref._createsmmrequest2 /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,_url,_url,_mime,_extra);
RDebugUtils.currentLine=13041671;
 //BA.debugLineNum = 13041671;BA.debugLine="Dim rs As SMMediaRequestSet = CreateSMMediaReques";
_rs = __ref._createsmmediarequestset /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset*/ (null,__ref._clonerequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,__ref._defaultloadingrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ ),_request,__ref._clonerequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,__ref._defaulterrorrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ ),_target);
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="If Extra.ContainsKey(REQUEST_CALLBACK) Then rs.Ca";
if (_extra.ContainsKey((Object)(__ref._request_callback /*String*/ ))) { 
_rs.Callback /*Object*/  = _extra.Get((Object)(__ref._request_callback /*String*/ ));};
RDebugUtils.currentLine=13041675;
 //BA.debugLineNum = 13041675;BA.debugLine="SetMediaWithRequestSet(rs)";
__ref._setmediawithrequestset /*String*/ (null,_rs);
RDebugUtils.currentLine=13041676;
 //BA.debugLineNum = 13041676;BA.debugLine="End Sub";
return "";
}
public String  _addheaderstojob(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.httpjob _j,b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _request) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "addheaderstojob", true))
	 {return ((String) Debug.delegate(ba, "addheaderstojob", new Object[] {_j,_request}));}
anywheresoftware.b4a.objects.collections.Map _headers = null;
String _key = "";
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Private Sub AddHeadersToJob(j As HttpJob, request";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="If request.Extra.ContainsKey(REQUEST_HEADERS) The";
if (_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(__ref._request_headers /*String*/ ))) { 
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="Dim headers As Map = request.Extra.Get(REQUEST_H";
_headers = new anywheresoftware.b4a.objects.collections.Map();
_headers = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._request_headers /*String*/ ))));
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="For Each key As String In headers.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _headers.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="j.GetRequest.SetHeader(key, headers.Get(key))";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader(_key,BA.ObjectToString(_headers.Get((Object)(_key))));
 }
};
 };
RDebugUtils.currentLine=13303815;
 //BA.debugLineNum = 13303815;BA.debugLine="End Sub";
return "";
}
public b4a.DesaWisataSaribu.simplemediamanager._smmedia  _addlocalmedia(b4a.DesaWisataSaribu.simplemediamanager __ref,String _key,Object _media,String _mime) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "addlocalmedia", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmedia) Debug.delegate(ba, "addlocalmedia", new Object[] {_key,_media,_mime}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediameta _meta = null;
b4a.DesaWisataSaribu.simplemediamanager._smmedia _smedia = null;
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub AddLocalMedia (Key As String, Media As";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Dim meta As SMMediaMeta = CreateSMMediaMeta(Mime,";
_meta = __ref._createsmmediameta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ (null,_mime,_key,__ref._state_ready /*int*/ ,__c.True);
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="Dim smedia As SMMedia = CreateSMMedia(Media, meta";
_smedia = __ref._createsmmedia /*b4a.DesaWisataSaribu.simplemediamanager._smmedia*/ (null,_media,_meta,__ref._state_ready /*int*/ );
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="MetaCache.Put(meta.Key, meta)";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_meta.Key /*String*/ ),(Object)(_meta));
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="MediaCache.Put(meta.Key, smedia)";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_meta.Key /*String*/ ),(Object)(_smedia));
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="Return smedia";
if (true) return _smedia;
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediameta  _createsmmediameta(b4a.DesaWisataSaribu.simplemediamanager __ref,String _mime,String _key,int _metastate,boolean _permanent) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmediameta", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediameta) Debug.delegate(ba, "createsmmediameta", new Object[] {_mime,_key,_metastate,_permanent}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediameta _t1 = null;
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Private Sub CreateSMMediaMeta (Mime As String, Key";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Dim t1 As SMMediaMeta";
_t1 = new b4a.DesaWisataSaribu.simplemediamanager._smmediameta();
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="t1.Mime = Mime";
_t1.Mime /*String*/  = _mime;
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="t1.MediaType = ViewsManager.MimeToMediaType(Mime)";
_t1.MediaType /*int*/  = __ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._mimetomediatype /*int*/ (null,_mime);
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="t1.MetaState = MetaState";
_t1.MetaState /*int*/  = _metastate;
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="t1.Permanent = Permanent";
_t1.Permanent /*boolean*/  = _permanent;
RDebugUtils.currentLine=14614536;
 //BA.debugLineNum = 14614536;BA.debugLine="t1.WaitingRequestsSets.Initialize";
_t1.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14614537;
 //BA.debugLineNum = 14614537;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=14614538;
 //BA.debugLineNum = 14614538;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmedia  _createsmmedia(b4a.DesaWisataSaribu.simplemediamanager __ref,Object _media,b4a.DesaWisataSaribu.simplemediamanager._smmediameta _meta,int _mediastate) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmedia", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmedia) Debug.delegate(ba, "createsmmedia", new Object[] {_media,_meta,_mediastate}));}
b4a.DesaWisataSaribu.simplemediamanager._smmedia _t1 = null;
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Public Sub CreateSMMedia (Media As Object, Meta As";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Dim t1 As SMMedia";
_t1 = new b4a.DesaWisataSaribu.simplemediamanager._smmedia();
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="t1.Media = Media";
_t1.Media /*Object*/  = _media;
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="t1.Meta = Meta";
_t1.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/  = _meta;
RDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="t1.MediaState = MediaState";
_t1.MediaState /*int*/  = _mediastate;
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="t1.WaitingRequestsSets.Initialize";
_t1.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="t1.UsedBy.Initialize";
_t1.UsedBy /*b4a.DesaWisataSaribu.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14680072;
 //BA.debugLineNum = 14680072;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=14680073;
 //BA.debugLineNum = 14680073;BA.debugLine="End Sub";
return null;
}
public String  _canceldisconnectedtargets(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "canceldisconnectedtargets", true))
	 {return ((String) Debug.delegate(ba, "canceldisconnectedtargets", new Object[] {_media}));}
b4a.DesaWisataSaribu.b4xset _set = null;
int _i = 0;
b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _requestset = null;
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Private Sub CancelDisconnectedTargets (Media As SM";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="For Each set As B4XSet In Array(Media.UsedBy, Med";
{
final Object[] group1 = new Object[]{(Object)(_media.UsedBy /*b4a.DesaWisataSaribu.b4xset*/ ),(Object)(_media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ )};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_set = (b4a.DesaWisataSaribu.b4xset)(group1[index1]);
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="For i = set.Size - 1 To 0 Step - 1";
{
final int step2 = -1;
final int limit2 = (int) (0);
_i = (int) (_set._getsize /*int*/ (null)-1) ;
for (;_i >= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="Dim RequestSet As SMMediaRequestSet = set.AsLis";
_requestset = (b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset)(_set._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null).Get(_i));
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="If RequestSet.NumberOfAncestors > CountAncestor";
if (_requestset.NumberOfAncestors /*int*/ >__ref._countancestors /*int*/ (null,_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ )) { 
RDebugUtils.currentLine=14155784;
 //BA.debugLineNum = 14155784;BA.debugLine="ViewsManager.CancelRequest(RequestSet.Target)";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._cancelrequest /*String*/ (null,_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=14155785;
 //BA.debugLineNum = 14155785;BA.debugLine="set.Remove(RequestSet)";
_set._remove /*String*/ (null,(Object)(_requestset));
 };
 }
};
 }
};
RDebugUtils.currentLine=14155789;
 //BA.debugLineNum = 14155789;BA.debugLine="End Sub";
return "";
}
public int  _countancestors(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "countancestors", true))
	 {return ((Integer) Debug.delegate(ba, "countancestors", new Object[] {_target}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _count = 0;
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Private Sub CountAncestors(Target As B4XView) As I";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Dim p As B4XView = Target";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _target;
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="Dim count As Int";
_count = 0;
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="Do While p.Parent Is View";
while (_p.getParent().getObjectOrNull() instanceof android.view.View) {
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
RDebugUtils.currentLine=14811145;
 //BA.debugLineNum = 14811145;BA.debugLine="p = p.Parent";
_p = _p.getParent();
 }
;
RDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="Return count";
if (true) return _count;
RDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="End Sub";
return 0;
}
public String  _cancelrequest(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _requestset) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "cancelrequest", true))
	 {return ((String) Debug.delegate(ba, "cancelrequest", new Object[] {_requestset}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediameta _meta = null;
b4a.DesaWisataSaribu.simplemediamanager._smmedia _media = null;
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Private Sub CancelRequest (RequestSet As SMMediaRe";
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="ViewsRequestSet.Remove(RequestSet.Target)";
__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="ViewsManager.CancelRequest(RequestSet.Target)";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._cancelrequest /*String*/ (null,_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="Dim meta As SMMediaMeta = MetaCache.Get(RequestSe";
_meta = (b4a.DesaWisataSaribu.simplemediamanager._smmediameta)(__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
RDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="If meta <> Null Then";
if (_meta!= null) { 
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="meta.WaitingRequestsSets.Remove(RequestSet)";
_meta.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._remove /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=13828105;
 //BA.debugLineNum = 13828105;BA.debugLine="Dim media As SMMedia = MediaCache.Get(RequestSet";
_media = (b4a.DesaWisataSaribu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
RDebugUtils.currentLine=13828106;
 //BA.debugLineNum = 13828106;BA.debugLine="If media <> Null Then";
if (_media!= null) { 
RDebugUtils.currentLine=13828107;
 //BA.debugLineNum = 13828107;BA.debugLine="media.WaitingRequestsSets.Remove(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._remove /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=13828108;
 //BA.debugLineNum = 13828108;BA.debugLine="media.UsedBy.Remove(RequestSet)";
_media.UsedBy /*b4a.DesaWisataSaribu.b4xset*/ ._remove /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=13828109;
 //BA.debugLineNum = 13828109;BA.debugLine="CancelDisconnectedTargets(media)";
__ref._canceldisconnectedtargets /*String*/ (null,_media);
 };
 };
RDebugUtils.currentLine=13828112;
 //BA.debugLineNum = 13828112;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.DesaWisataSaribu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Type SMMediaMeta (Mime As String, MediaType As In";
;
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Type SMMedia (Media As Object, Meta As SMMediaMet";
;
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="Type SMMediaRequest (Key As String, Url As String";
;
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="Type SMMediaRequestSet (Loading As SMMediaRequest";
;
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="Public Const STATE_LOADING = 1, STATE_ERROR = 2,";
_state_loading = (int) (1);
_state_error = (int) (2);
_state_ready = (int) (3);
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="Private MetaCache As Map";
_metacache = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="Private MediaCache As B4XOrderedMap";
_mediacache = new b4a.DesaWisataSaribu.b4xorderedmap();
RDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="Public MaxMediaCacheSize As Int = 40";
_maxmediacachesize = (int) (40);
RDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="Private ViewsRequestSet As Map";
_viewsrequestset = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12582923;
 //BA.debugLineNum = 12582923;BA.debugLine="Private ImagesLoader As BitmapsAsync";
_imagesloader = new b4a.DesaWisataSaribu.bitmapsasync();
RDebugUtils.currentLine=12582924;
 //BA.debugLineNum = 12582924;BA.debugLine="Private JobEmpty As HttpJob";
_jobempty = new b4a.DesaWisataSaribu.httpjob();
RDebugUtils.currentLine=12582925;
 //BA.debugLineNum = 12582925;BA.debugLine="Public const KEY_DEFAULT_LOADING = \"~loading\", KE";
_key_default_loading = "~loading";
_key_default_error = "~error";
RDebugUtils.currentLine=12582926;
 //BA.debugLineNum = 12582926;BA.debugLine="Public const MIME_UNKNOWN As String = \"~unknown\"";
_mime_unknown = "~unknown";
RDebugUtils.currentLine=12582927;
 //BA.debugLineNum = 12582927;BA.debugLine="Public MaxImageSize = 1000 As Int";
_maximagesize = (int) (1000);
RDebugUtils.currentLine=12582928;
 //BA.debugLineNum = 12582928;BA.debugLine="Public DefaultFadeAnimationDuration As Int = 300";
_defaultfadeanimationduration = (int) (300);
RDebugUtils.currentLine=12582929;
 //BA.debugLineNum = 12582929;BA.debugLine="Public DefaultResizeMode As String = \"FIT\"";
_defaultresizemode = "FIT";
RDebugUtils.currentLine=12582930;
 //BA.debugLineNum = 12582930;BA.debugLine="Public DefaultBackgroundColor As Int = xui.Color_";
_defaultbackgroundcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=12582931;
 //BA.debugLineNum = 12582931;BA.debugLine="Public DefaultForegroundColor As Int = xui.Color_";
_defaultforegroundcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=12582932;
 //BA.debugLineNum = 12582932;BA.debugLine="Public ViewsManager As SMMViews";
_viewsmanager = new b4a.DesaWisataSaribu.smmviews();
RDebugUtils.currentLine=12582933;
 //BA.debugLineNum = 12582933;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=12582934;
 //BA.debugLineNum = 12582934;BA.debugLine="Public DefaultLoadingRequest, DefaultErrorRequest";
_defaultloadingrequest = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequest();
_defaulterrorrequest = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequest();
RDebugUtils.currentLine=12582935;
 //BA.debugLineNum = 12582935;BA.debugLine="Public Const REQUEST_ROUNDIMAGE = \"round_image\",";
_request_roundimage = "round_image";
_request_background = "background";
_request_resize_mode = "resize_mode";
_request_fade_animation_duration = "fade_animation";
RDebugUtils.currentLine=12582936;
 //BA.debugLineNum = 12582936;BA.debugLine="Public Const REQUEST_FOREGROUND = \"foreground\" As";
_request_foreground = "foreground";
RDebugUtils.currentLine=12582937;
 //BA.debugLineNum = 12582937;BA.debugLine="Public Const REQUEST_CALLBACK = \"callback\" As Str";
_request_callback = "callback";
RDebugUtils.currentLine=12582938;
 //BA.debugLineNum = 12582938;BA.debugLine="Public Const REQUEST_ZOOMIMAGEVIEW = \"zoomimagevi";
_request_zoomimageview = "zoomimageview";
RDebugUtils.currentLine=12582939;
 //BA.debugLineNum = 12582939;BA.debugLine="Private Const REQUEST_FILE = \"file\", REQUEST_DIR";
_request_file = "file";
_request_dir = "dir";
RDebugUtils.currentLine=12582940;
 //BA.debugLineNum = 12582940;BA.debugLine="Public Const REQUEST_HEADERS = \"headers\" As Strin";
_request_headers = "headers";
RDebugUtils.currentLine=12582941;
 //BA.debugLineNum = 12582941;BA.debugLine="Private LastTrimCache As Long";
_lasttrimcache = 0L;
RDebugUtils.currentLine=12582942;
 //BA.debugLineNum = 12582942;BA.debugLine="Public MinTimeBetweenTrims As Long = 2000";
_mintimebetweentrims = (long) (2000);
RDebugUtils.currentLine=12582943;
 //BA.debugLineNum = 12582943;BA.debugLine="Public SleepDurationBeforeDownload As Long = 50";
_sleepdurationbeforedownload = (long) (50);
RDebugUtils.currentLine=12582944;
 //BA.debugLineNum = 12582944;BA.debugLine="Private HttpRequestsManager As RequestsManager";
_httprequestsmanager = new b4a.DesaWisataSaribu.requestsmanager();
RDebugUtils.currentLine=12582945;
 //BA.debugLineNum = 12582945;BA.debugLine="Public B4ASdkVersion As Int";
_b4asdkversion = 0;
RDebugUtils.currentLine=12582946;
 //BA.debugLineNum = 12582946;BA.debugLine="Public DefaultRequestTimeout As Int = 30000";
_defaultrequesttimeout = (int) (30000);
RDebugUtils.currentLine=12582950;
 //BA.debugLineNum = 12582950;BA.debugLine="End Sub";
return "";
}
public String  _clearmedia(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "clearmedia", true))
	 {return ((String) Debug.delegate(ba, "clearmedia", new Object[] {_target}));}
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Public Sub ClearMedia(Target As B4XView)";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="If ViewsRequestSet.ContainsKey(Target) Then";
if (__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_target.getObject()))) { 
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="CancelRequest(ViewsRequestSet.Get(Target))";
__ref._cancelrequest /*String*/ (null,(b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset)(__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_target.getObject()))));
 };
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="End Sub";
return "";
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest  _clonerequest(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _request) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "clonerequest", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediarequest) Debug.delegate(ba, "clonerequest", new Object[] {_request}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _req = null;
String _k = "";
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Public Sub CloneRequest(Request As SMMediaRequest)";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Dim req As SMMediaRequest = CreateSMMRequest(Requ";
_req = __ref._createsmmrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,_request.Key /*String*/ ,_request.Url /*String*/ ,_request.Mime /*String*/ );
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="For Each k As String In Request.Extra.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="req.Extra.Put(k, Request.Extra.Get(k))";
_req.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 }
};
RDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest  _createsmmrequest(b4a.DesaWisataSaribu.simplemediamanager __ref,String _key,String _url,String _mime) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmrequest", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediarequest) Debug.delegate(ba, "createsmmrequest", new Object[] {_key,_url,_mime}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _t1 = null;
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Private Sub CreateSMMRequest (Key As String, Url A";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Dim t1 As SMMediaRequest";
_t1 = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequest();
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="t1.Url = Url";
_t1.Url /*String*/  = _url;
RDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="t1.Mime = Mime";
_t1.Mime /*String*/  = _mime;
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="t1.Extra.Initialize";
_t1.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=14417927;
 //BA.debugLineNum = 14417927;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=14417928;
 //BA.debugLineNum = 14417928;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest  _createrequest(b4a.DesaWisataSaribu.simplemediamanager __ref,String _url,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createrequest", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediarequest) Debug.delegate(ba, "createrequest", new Object[] {_url,_extra}));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Public Sub CreateRequest (Url As String, Extra As";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Return CreateSMMRequest2(Url, Url, MIME_UNKNOWN,";
if (true) return __ref._createsmmrequest2 /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,_url,_url,__ref._mime_unknown /*String*/ ,_extra);
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest  _createsmmrequest2(b4a.DesaWisataSaribu.simplemediamanager __ref,String _key,String _url,String _mime,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmrequest2", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediarequest) Debug.delegate(ba, "createsmmrequest2", new Object[] {_key,_url,_mime,_extra}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _t1 = null;
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Private Sub CreateSMMRequest2 (Key As String, Url";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Dim t1 As SMMediaRequest";
_t1 = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequest();
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="t1.Url = Url";
_t1.Url /*String*/  = _url;
RDebugUtils.currentLine=14483461;
 //BA.debugLineNum = 14483461;BA.debugLine="t1.Mime = Mime";
_t1.Mime /*String*/  = _mime;
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="t1.Extra = Extra";
_t1.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = _extra;
RDebugUtils.currentLine=14483463;
 //BA.debugLineNum = 14483463;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=14483464;
 //BA.debugLineNum = 14483464;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset  _createsmmediarequestset(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _loading,b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _mainmedia,b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _error,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmediarequestset", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset) Debug.delegate(ba, "createsmmediarequestset", new Object[] {_loading,_mainmedia,_error,_target}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _t1 = null;
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub CreateSMMediaRequestSet (Loading As SMM";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Dim t1 As SMMediaRequestSet";
_t1 = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset();
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="t1.Loading = Loading";
_t1.Loading /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/  = _loading;
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="t1.MainMedia = MainMedia";
_t1.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/  = _mainmedia;
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="t1.Error = Error";
_t1.Error /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/  = _error;
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="t1.Target = Target";
_t1.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _target;
RDebugUtils.currentLine=14745607;
 //BA.debugLineNum = 14745607;BA.debugLine="t1.NumberOfAncestors = CountAncestors(t1.Target)";
_t1.NumberOfAncestors /*int*/  = __ref._countancestors /*int*/ (null,_t1.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=14745608;
 //BA.debugLineNum = 14745608;BA.debugLine="t1.Callback = Null";
_t1.Callback /*Object*/  = __c.Null;
RDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="If t1.NumberOfAncestors = 0 Then";
if (_t1.NumberOfAncestors /*int*/ ==0) { 
RDebugUtils.currentLine=14745610;
 //BA.debugLineNum = 14745610;BA.debugLine="Log(\"Target is not in the views tree!\")";
__c.LogImpl("914745610","Target is not in the views tree!",0);
 };
RDebugUtils.currentLine=14745612;
 //BA.debugLineNum = 14745612;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=14745613;
 //BA.debugLineNum = 14745613;BA.debugLine="End Sub";
return null;
}
public String  _deletemedia(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "deletemedia", true))
	 {return ((String) Debug.delegate(ba, "deletemedia", new Object[] {_media}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Private Sub DeleteMedia (Media As SMMedia)";
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="If Media.MediaState = STATE_READY Then";
if (_media.MediaState /*int*/ ==__ref._state_ready /*int*/ ) { 
RDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="Select Media.Meta.MediaType";
switch (BA.switchObjectToInt(_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_image /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_html /*int*/ )) {
case 0: {
RDebugUtils.currentLine=14024712;
 //BA.debugLineNum = 14024712;BA.debugLine="Dim jo As JavaObject = Media.Media 'B4XBitmap";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_media.Media /*Object*/ ));
RDebugUtils.currentLine=14024713;
 //BA.debugLineNum = 14024713;BA.debugLine="jo.RunMethod(\"recycle\", Null)";
_jo.RunMethod("recycle",(Object[])(__c.Null));
 break; }
case 1: {
RDebugUtils.currentLine=14024716;
 //BA.debugLineNum = 14024716;BA.debugLine="MetaCache.Remove(Media.Meta.Key)";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Key /*String*/ ));
 break; }
}
;
 }else 
{RDebugUtils.currentLine=14024718;
 //BA.debugLineNum = 14024718;BA.debugLine="Else if Media.MediaState = STATE_LOADING Then";
if (_media.MediaState /*int*/ ==__ref._state_loading /*int*/ ) { 
RDebugUtils.currentLine=14024722;
 //BA.debugLineNum = 14024722;BA.debugLine="If Media.Job.IsInitialized Then";
if (_media.Job /*b4a.DesaWisataSaribu.httpjob*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=14024723;
 //BA.debugLineNum = 14024723;BA.debugLine="HttpRequestsManager.CancelRequest(Media.Meta.Fi";
__ref._httprequestsmanager /*b4a.DesaWisataSaribu.requestsmanager*/ ._cancelrequest /*String*/ (null,_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .FirstUrl /*String*/ ,_media.Job /*b4a.DesaWisataSaribu.httpjob*/ );
 };
 }}
;
RDebugUtils.currentLine=14024726;
 //BA.debugLineNum = 14024726;BA.debugLine="MediaCache.Remove(Media.Meta.Key)";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Key /*String*/ ));
RDebugUtils.currentLine=14024727;
 //BA.debugLineNum = 14024727;BA.debugLine="End Sub";
return "";
}
public String  _designersetmedia(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.keywords.DesignerArgs _designerargs) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "designersetmedia", true))
	 {return ((String) Debug.delegate(ba, "designersetmedia", new Object[] {_designerargs}));}
anywheresoftware.b4a.objects.B4XViewWrapper _target = null;
String _url = "";
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Private Sub DesignerSetMedia(DesignerArgs As Desig";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Dim Target As B4XView = DesignerArgs.GetViewFromA";
_target = new anywheresoftware.b4a.objects.B4XViewWrapper();
_target = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_designerargs.GetViewFromArgs((int) (0))));
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="Dim url As String = DesignerArgs.Arguments.Get(1)";
_url = BA.ObjectToString(_designerargs.getArguments().Get((int) (1)));
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="If DesignerArgs.FirstRun Then";
if (_designerargs.getFirstRun()) { 
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="SetMedia(Target, url)";
__ref._setmedia /*String*/ (null,_target,_url);
 }else {
RDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="PanelResized(Target)";
__ref._panelresized /*String*/ (null,_target);
 };
RDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="End Sub";
return "";
}
public String  _setmedia(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmedia", true))
	 {return ((String) Debug.delegate(ba, "setmedia", new Object[] {_target,_url}));}
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub SetMedia(Target As B4XView, Url As Stri";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="SetMediaWithExtra(Target, Url, MIME_UNKNOWN, Crea";
__ref._setmediawithextra /*String*/ (null,_target,_url,__ref._mime_unknown /*String*/ ,__c.createMap(new Object[] {}));
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="End Sub";
return "";
}
public String  _panelresized(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "panelresized", true))
	 {return ((String) Debug.delegate(ba, "panelresized", new Object[] {_target}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _set = null;
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Public Sub PanelResized (Target As B4XView)";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Dim set As SMMediaRequestSet = ViewsRequestSet.Ge";
_set = (b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset)(__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_target.getObject())));
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="If set <> Null Then";
if (_set!= null) { 
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="ViewsManager.ParentResized(Target)";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._parentresized /*String*/ (null,_target);
 };
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="End Sub";
return "";
}
public void  _downloadimagemedia(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media,b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _request) throws Exception{
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "downloadimagemedia", true))
	 {Debug.delegate(ba, "downloadimagemedia", new Object[] {_media,_request}); return;}
ResumableSub_DownloadImageMedia rsub = new ResumableSub_DownloadImageMedia(this,__ref,_media,_request);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadImageMedia extends BA.ResumableSub {
public ResumableSub_DownloadImageMedia(b4a.DesaWisataSaribu.simplemediamanager parent,b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media,b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _request) {
this.parent = parent;
this.__ref = __ref;
this._media = _media;
this._request = _request;
this.__ref = parent;
}
b4a.DesaWisataSaribu.simplemediamanager __ref;
b4a.DesaWisataSaribu.simplemediamanager parent;
b4a.DesaWisataSaribu.simplemediamanager._smmedia _media;
b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _request;
b4a.DesaWisataSaribu.httpjob _job = null;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="simplemediamanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="If Media.Meta.MetaState = STATE_READY Then";
if (true) break;

case 1:
//if
this.state = 25;
if (_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .MetaState /*int*/ ==__ref._state_ready /*int*/ ) { 
this.state = 3;
}else {
this.state = 24;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="If SleepDurationBeforeDownload > 0 Then";
if (true) break;

case 4:
//if
this.state = 11;
if (__ref._sleepdurationbeforedownload /*long*/ >0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="Sleep(SleepDurationBeforeDownload)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "downloadimagemedia"),(int) (__ref._sleepdurationbeforedownload /*long*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="CancelDisconnectedTargets(Media)";
__ref._canceldisconnectedtargets /*String*/ (null,_media);
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="If IsMediaStillRelevant(Media) = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._ismediastillrelevant /*boolean*/ (null,_media)==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=13434889;
 //BA.debugLineNum = 13434889;BA.debugLine="DeleteMedia(Media) 'media is loading state. Re";
__ref._deletemedia /*String*/ (null,_media);
RDebugUtils.currentLine=13434890;
 //BA.debugLineNum = 13434890;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;
;
RDebugUtils.currentLine=13434893;
 //BA.debugLineNum = 13434893;BA.debugLine="If Media.Meta.Dir = \"\" Then";

case 11:
//if
this.state = 22;
if ((_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Dir /*String*/ ).equals("")) { 
this.state = 13;
}else {
this.state = 21;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=13434894;
 //BA.debugLineNum = 13434894;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSaribu.httpjob();
RDebugUtils.currentLine=13434895;
 //BA.debugLineNum = 13434895;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13434896;
 //BA.debugLineNum = 13434896;BA.debugLine="job.Download(Media.Meta.FirstUrl)";
_job._download /*String*/ (null,_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .FirstUrl /*String*/ );
RDebugUtils.currentLine=13434897;
 //BA.debugLineNum = 13434897;BA.debugLine="job.GetRequest.Timeout = DefaultRequestTimeout";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._defaultrequesttimeout /*int*/ );
RDebugUtils.currentLine=13434898;
 //BA.debugLineNum = 13434898;BA.debugLine="AddHeadersToJob(job, Request)";
__ref._addheaderstojob /*String*/ (null,_job,_request);
RDebugUtils.currentLine=13434902;
 //BA.debugLineNum = 13434902;BA.debugLine="Media.Job = job";
_media.Job /*b4a.DesaWisataSaribu.httpjob*/  = _job;
RDebugUtils.currentLine=13434903;
 //BA.debugLineNum = 13434903;BA.debugLine="Wait For (job) JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "downloadimagemedia"), (Object)(_job));
this.state = 27;
return;
case 27:
//C
this.state = 14;
_job = (b4a.DesaWisataSaribu.httpjob) result[1];
;
RDebugUtils.currentLine=13434904;
 //BA.debugLineNum = 13434904;BA.debugLine="Media.Job = JobEmpty";
_media.Job /*b4a.DesaWisataSaribu.httpjob*/  = __ref._jobempty /*b4a.DesaWisataSaribu.httpjob*/ ;
RDebugUtils.currentLine=13434909;
 //BA.debugLineNum = 13434909;BA.debugLine="If job.Success Then";
if (true) break;

case 14:
//if
this.state = 19;
if (_job._success /*boolean*/ ) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=13434910;
 //BA.debugLineNum = 13434910;BA.debugLine="Wait For (PrepareMedia(Media, job, \"\", \"\", Fal";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "downloadimagemedia"), __ref._preparemedia /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_media,_job,"","",parent.__c.False));
this.state = 28;
return;
case 28:
//C
this.state = 19;
_unused = (Boolean) result[1];
;
RDebugUtils.currentLine=13434911;
 //BA.debugLineNum = 13434911;BA.debugLine="Media.MediaState = IIf(Media.Media <> Null, ST";
_media.MediaState /*int*/  = (int)(BA.ObjectToNumber(((_media.Media /*Object*/ != null) ? ((Object)(__ref._state_ready /*int*/ )) : ((Object)(__ref._state_error /*int*/ )))));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=13434913;
 //BA.debugLineNum = 13434913;BA.debugLine="Media.MediaState = STATE_ERROR";
_media.MediaState /*int*/  = __ref._state_error /*int*/ ;
 if (true) break;

case 19:
//C
this.state = 22;
;
RDebugUtils.currentLine=13434915;
 //BA.debugLineNum = 13434915;BA.debugLine="job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=13434920;
 //BA.debugLineNum = 13434920;BA.debugLine="Wait For (PrepareMedia(Media, Null, Media.Meta.";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "downloadimagemedia"), __ref._preparemedia /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_media,(b4a.DesaWisataSaribu.httpjob)(parent.__c.Null),_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Dir /*String*/ ,_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .FileName /*String*/ ,parent.__c.True));
this.state = 29;
return;
case 29:
//C
this.state = 22;
_unused = (Boolean) result[1];
;
RDebugUtils.currentLine=13434921;
 //BA.debugLineNum = 13434921;BA.debugLine="Media.MediaState = IIf(Media.Media <> Null, STA";
_media.MediaState /*int*/  = (int)(BA.ObjectToNumber(((_media.Media /*Object*/ != null) ? ((Object)(__ref._state_ready /*int*/ )) : ((Object)(__ref._state_error /*int*/ )))));
 if (true) break;

case 22:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=13434925;
 //BA.debugLineNum = 13434925;BA.debugLine="Media.MediaState = STATE_ERROR";
_media.MediaState /*int*/  = __ref._state_error /*int*/ ;
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=13434927;
 //BA.debugLineNum = 13434927;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
RDebugUtils.currentLine=13434928;
 //BA.debugLineNum = 13434928;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _ismediastillrelevant(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "ismediastillrelevant", true))
	 {return ((Boolean) Debug.delegate(ba, "ismediastillrelevant", new Object[] {_media}));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Private Sub IsMediaStillRelevant (Media As SMMedia";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Return Media.Meta.Permanent Or (Media.MediaState";
if (true) return _media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Permanent /*boolean*/  || (_media.MediaState /*int*/ ==__ref._state_loading /*int*/  && _media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._getsize /*int*/ (null)>0) || (_media.MediaState /*int*/ !=__ref._state_loading /*int*/  && _media.UsedBy /*b4a.DesaWisataSaribu.b4xset*/ ._getsize /*int*/ (null)>0);
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparemedia(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media,b4a.DesaWisataSaribu.httpjob _job,String _dir,String _filename,boolean _fromfile) throws Exception{
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "preparemedia", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "preparemedia", new Object[] {_media,_job,_dir,_filename,_fromfile}));}
ResumableSub_PrepareMedia rsub = new ResumableSub_PrepareMedia(this,__ref,_media,_job,_dir,_filename,_fromfile);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareMedia extends BA.ResumableSub {
public ResumableSub_PrepareMedia(b4a.DesaWisataSaribu.simplemediamanager parent,b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media,b4a.DesaWisataSaribu.httpjob _job,String _dir,String _filename,boolean _fromfile) {
this.parent = parent;
this.__ref = __ref;
this._media = _media;
this._job = _job;
this._dir = _dir;
this._filename = _filename;
this._fromfile = _fromfile;
this.__ref = parent;
}
b4a.DesaWisataSaribu.simplemediamanager __ref;
b4a.DesaWisataSaribu.simplemediamanager parent;
b4a.DesaWisataSaribu.simplemediamanager._smmedia _media;
b4a.DesaWisataSaribu.httpjob _job;
String _dir;
String _filename;
boolean _fromfile;
int _mediatype = 0;
boolean _skipregularimageloading = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="simplemediamanager";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Dim MediaType As Int = Media.Meta.MediaType";
_mediatype = _media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ;
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="If MediaType = ViewsManager.MEDIA_TYPE_IMAGE Then";
if (true) break;

case 1:
//if
this.state = 25;
if (_mediatype==__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_image /*int*/ ) { 
this.state = 3;
}else {
this.state = 18;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="Dim SkipRegularImageLoading As Boolean 'ignore";
_skipregularimageloading = false;
RDebugUtils.currentLine=13500426;
 //BA.debugLineNum = 13500426;BA.debugLine="If SkipRegularImageLoading = False Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_skipregularimageloading==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=13500427;
 //BA.debugLineNum = 13500427;BA.debugLine="If FromFile Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_fromfile) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=13500428;
 //BA.debugLineNum = 13500428;BA.debugLine="Wait For (ImagesLoader.LoadFromFile(Dir, FileN";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "preparemedia"), __ref._imagesloader /*b4a.DesaWisataSaribu.bitmapsasync*/ ._loadfromfile /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_dir,_filename,__ref._maximagesize /*int*/ ,__ref._maximagesize /*int*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 12;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[1];
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=13500430;
 //BA.debugLineNum = 13500430;BA.debugLine="Wait For (ImagesLoader.LoadFromHttpJob(job, Ma";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "preparemedia"), __ref._imagesloader /*b4a.DesaWisataSaribu.bitmapsasync*/ ._loadfromhttpjob /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_job,__ref._maximagesize /*int*/ ,__ref._maximagesize /*int*/ ));
this.state = 27;
return;
case 27:
//C
this.state = 12;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[1];
;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=13500432;
 //BA.debugLineNum = 13500432;BA.debugLine="Media.Media = IIf(bmp.IsInitialized, bmp, Null)";
_media.Media /*Object*/  = ((_bmp.IsInitialized()) ? ((Object)(_bmp.getObject())) : (parent.__c.Null));
 if (true) break;
;
RDebugUtils.currentLine=13500434;
 //BA.debugLineNum = 13500434;BA.debugLine="If (xui.IsB4A Or xui.IsB4J) And Media.Meta.Mime";

case 13:
//if
this.state = 16;
if ((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) && (_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Mime /*String*/ ).equals("image/jpeg") && _media.Media /*Object*/ != null) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=13500435;
 //BA.debugLineNum = 13500435;BA.debugLine="PreprocessExif(Media, IIf(FromFile, File.OpenIn";
__ref._preprocessexif /*String*/ (null,_media,(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(((_fromfile) ? ((Object)(parent.__c.File.OpenInput(_dir,_filename).getObject())) : ((Object)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()))))));
 if (true) break;

case 16:
//C
this.state = 25;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=13500438;
 //BA.debugLineNum = 13500438;BA.debugLine="Dim in As InputStream = IIf(FromFile, File.OpenI";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(((_fromfile) ? ((Object)(parent.__c.File.OpenInput(_dir,_filename).getObject())) : ((Object)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject())))));
RDebugUtils.currentLine=13500439;
 //BA.debugLineNum = 13500439;BA.debugLine="Select MediaType";
if (true) break;

case 19:
//select
this.state = 24;
switch (BA.switchObjectToInt(_mediatype,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_gif /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_webp /*int*/ )) {
case 0: {
this.state = 21;
if (true) break;
}
case 1: {
this.state = 23;
if (true) break;
}
}
if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=13500441;
 //BA.debugLineNum = 13500441;BA.debugLine="Media.Media = Bit.InputStreamToBytes(in)";
_media.Media /*Object*/  = (Object)(parent.__c.Bit.InputStreamToBytes((java.io.InputStream)(_in.getObject())));
 if (true) break;

case 23:
//C
this.state = 24;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=13500460;
 //BA.debugLineNum = 13500460;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=13500461;
 //BA.debugLineNum = 13500461;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _mediaisready(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "mediaisready", true))
	 {return ((String) Debug.delegate(ba, "mediaisready", new Object[] {_media}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _req = null;
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Private Sub MediaIsReady (Media As SMMedia)";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="CancelDisconnectedTargets(Media)";
__ref._canceldisconnectedtargets /*String*/ (null,_media);
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="For Each req As SMMediaRequestSet In Media.Waitin";
{
final anywheresoftware.b4a.BA.IterableList group2 = _media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_req = (b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset)(group2.Get(index2));
RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="req.RequestState = Media.MediaState";
_req.RequestState /*int*/  = _media.MediaState /*int*/ ;
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="If Media.MediaState = STATE_READY Then";
if (_media.MediaState /*int*/ ==__ref._state_ready /*int*/ ) { 
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="Media.UsedBy.Add(req)";
_media.UsedBy /*b4a.DesaWisataSaribu.b4xset*/ ._add /*String*/ (null,(Object)(_req));
RDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="ViewsManager.AddMedia(req, Media, GetRequestFro";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._addmedia /*void*/ (null,_req,_media,__ref._getrequestfromrequestset /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,_req));
 }else 
{RDebugUtils.currentLine=13631495;
 //BA.debugLineNum = 13631495;BA.debugLine="Else if Media.MediaState = STATE_ERROR Then";
if (_media.MediaState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=13631496;
 //BA.debugLineNum = 13631496;BA.debugLine="ViewsManager.AddMedia(req, MediaCache.Get(req.E";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._addmedia /*void*/ (null,_req,(b4a.DesaWisataSaribu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_req.Error /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ ))),__ref._getrequestfromrequestset /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,_req));
 }else {
RDebugUtils.currentLine=13631498;
 //BA.debugLineNum = 13631498;BA.debugLine="Log(\"MediaIsReady Unexpected state!\")";
__c.LogImpl("913631498","MediaIsReady Unexpected state!",0);
 }}
;
 }
};
RDebugUtils.currentLine=13631501;
 //BA.debugLineNum = 13631501;BA.debugLine="Media.WaitingRequestsSets.Clear";
_media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=13631502;
 //BA.debugLineNum = 13631502;BA.debugLine="If Media.MediaState = STATE_ERROR Then";
if (_media.MediaState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=13631506;
 //BA.debugLineNum = 13631506;BA.debugLine="MediaCache.Remove(Media.Meta.Key)";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Key /*String*/ ));
 };
RDebugUtils.currentLine=13631508;
 //BA.debugLineNum = 13631508;BA.debugLine="End Sub";
return "";
}
public long  _getmaximagefilesize(b4a.DesaWisataSaribu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "getmaximagefilesize", true))
	 {return ((Long) Debug.delegate(ba, "getmaximagefilesize", null));}
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub getMaxImageFileSize As Long";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Return ImagesLoader.MaxFileSize";
if (true) return __ref._imagesloader /*b4a.DesaWisataSaribu.bitmapsasync*/ ._maxfilesize /*long*/ ;
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="End Sub";
return 0L;
}
public int  _getmediacachesize(b4a.DesaWisataSaribu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "getmediacachesize", true))
	 {return ((Integer) Debug.delegate(ba, "getmediacachesize", null));}
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Public Sub getMediaCacheSize As Int";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Return MediaCache.Size";
if (true) return __ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="End Sub";
return 0;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest  _getrequestfromrequestset(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _rs) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "getrequestfromrequestset", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediarequest) Debug.delegate(ba, "getrequestfromrequestset", new Object[] {_rs}));}
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Private Sub GetRequestFromRequestSet(rs As SMMedia";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="If rs.RequestState = STATE_LOADING Then";
if (_rs.RequestState /*int*/ ==__ref._state_loading /*int*/ ) { 
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="Return rs.Loading";
if (true) return _rs.Loading /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ ;
 }else 
{RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="Else If rs.RequestState = STATE_ERROR Then";
if (_rs.RequestState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="Return rs.Error";
if (true) return _rs.Error /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ ;
 }else {
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="Return rs.MainMedia";
if (true) return _rs.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ ;
 }}
;
RDebugUtils.currentLine=14286856;
 //BA.debugLineNum = 14286856;BA.debugLine="End Sub";
return null;
}
public boolean  _iswebpanimated(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "iswebpanimated", true))
	 {return ((Boolean) Debug.delegate(ba, "iswebpanimated", new Object[] {_media}));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Public Sub IsWebPAnimated(Media As SMMedia) As Boo";
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="Return B4ASdkVersion >= 28 And Media.Meta.MediaTy";
if (true) return __ref._b4asdkversion /*int*/ >=28 && _media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ==__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_webp /*int*/ ;
RDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="End Sub";
return false;
}
public String  _metaisready(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediameta _meta) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "metaisready", true))
	 {return ((String) Debug.delegate(ba, "metaisready", new Object[] {_meta}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _requestset = null;
b4a.DesaWisataSaribu.simplemediamanager._smmedia _media = null;
int _mediatype = 0;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Private Sub MetaIsReady (Meta As SMMediaMeta)";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="For Each RequestSet As SMMediaRequestSet In Meta.";
{
final anywheresoftware.b4a.BA.IterableList group1 = _meta.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_requestset = (b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset)(group1.Get(index1));
RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="If MediaCache.ContainsKey(Meta.Key) Then";
if (__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_meta.Key /*String*/ ))) { 
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="Dim Media As SMMedia = MediaCache.Get(Meta.Key)";
_media = (b4a.DesaWisataSaribu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_meta.Key /*String*/ )));
RDebugUtils.currentLine=13369352;
 //BA.debugLineNum = 13369352;BA.debugLine="MediaCache.Remove(Meta.Key)";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_meta.Key /*String*/ ));
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="MediaCache.Put(Meta.Key, Media)";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_meta.Key /*String*/ ),(Object)(_media));
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="Media.WaitingRequestsSets.Add(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=13369355;
 //BA.debugLineNum = 13369355;BA.debugLine="If Media.MediaState <> STATE_LOADING Then";
if (_media.MediaState /*int*/ !=__ref._state_loading /*int*/ ) { 
RDebugUtils.currentLine=13369356;
 //BA.debugLineNum = 13369356;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
 };
 }else {
RDebugUtils.currentLine=13369359;
 //BA.debugLineNum = 13369359;BA.debugLine="Media = CreateSMMedia(Null, Meta, IIf(Meta.Meta";
_media = __ref._createsmmedia /*b4a.DesaWisataSaribu.simplemediamanager._smmedia*/ (null,__c.Null,_meta,(int)(BA.ObjectToNumber(((_meta.MetaState /*int*/ ==__ref._state_ready /*int*/ ) ? ((Object)(__ref._state_loading /*int*/ )) : ((Object)(__ref._state_error /*int*/ ))))));
RDebugUtils.currentLine=13369360;
 //BA.debugLineNum = 13369360;BA.debugLine="Media.WaitingRequestsSets.Add(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=13369361;
 //BA.debugLineNum = 13369361;BA.debugLine="MediaCache.Put(Media.Meta.Key, Media)";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Key /*String*/ ),(Object)(_media));
RDebugUtils.currentLine=13369362;
 //BA.debugLineNum = 13369362;BA.debugLine="TrimMediaCacheImpl";
__ref._trimmediacacheimpl /*String*/ (null);
RDebugUtils.currentLine=13369363;
 //BA.debugLineNum = 13369363;BA.debugLine="If Media.MediaState = STATE_ERROR Then";
if (_media.MediaState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=13369364;
 //BA.debugLineNum = 13369364;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
 }else {
RDebugUtils.currentLine=13369366;
 //BA.debugLineNum = 13369366;BA.debugLine="Dim MediaType As Int = Media.Meta.MediaType";
_mediatype = _media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ;
RDebugUtils.currentLine=13369367;
 //BA.debugLineNum = 13369367;BA.debugLine="Select MediaType";
switch (BA.switchObjectToInt(_mediatype,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_gif /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_image /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_webp /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_video /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_html /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_none /*int*/ )) {
case 0: 
case 1: 
case 2: {
RDebugUtils.currentLine=13369369;
 //BA.debugLineNum = 13369369;BA.debugLine="DownloadImageMedia(Media, RequestSet.MainMed";
__ref._downloadimagemedia /*void*/ (null,_media,_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ );
 break; }
case 3: 
case 4: {
RDebugUtils.currentLine=13369371;
 //BA.debugLineNum = 13369371;BA.debugLine="Media.MediaState = STATE_READY";
_media.MediaState /*int*/  = __ref._state_ready /*int*/ ;
RDebugUtils.currentLine=13369372;
 //BA.debugLineNum = 13369372;BA.debugLine="Media.Media = Meta.FirstUrl";
_media.Media /*Object*/  = (Object)(_meta.FirstUrl /*String*/ );
RDebugUtils.currentLine=13369373;
 //BA.debugLineNum = 13369373;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
 break; }
case 5: {
RDebugUtils.currentLine=13369375;
 //BA.debugLineNum = 13369375;BA.debugLine="Log(\"Unexpected mime: \" & Media.Meta.Mime)";
__c.LogImpl("913369375","Unexpected mime: "+_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Mime /*String*/ ,0);
RDebugUtils.currentLine=13369376;
 //BA.debugLineNum = 13369376;BA.debugLine="Media.MediaState = STATE_ERROR";
_media.MediaState /*int*/  = __ref._state_error /*int*/ ;
RDebugUtils.currentLine=13369377;
 //BA.debugLineNum = 13369377;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
 break; }
}
;
 };
 };
 }
};
RDebugUtils.currentLine=13369382;
 //BA.debugLineNum = 13369382;BA.debugLine="Meta.WaitingRequestsSets.Clear";
_meta.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=13369383;
 //BA.debugLineNum = 13369383;BA.debugLine="If Meta.MetaState = STATE_ERROR Then";
if (_meta.MetaState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=13369387;
 //BA.debugLineNum = 13369387;BA.debugLine="MetaCache.Remove(Meta)";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_meta));
 };
RDebugUtils.currentLine=13369389;
 //BA.debugLineNum = 13369389;BA.debugLine="End Sub";
return "";
}
public String  _trimmediacacheimpl(b4a.DesaWisataSaribu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "trimmediacacheimpl", true))
	 {return ((String) Debug.delegate(ba, "trimmediacacheimpl", null));}
boolean _onlylookfordisconnectedtargets = false;
int _i = 0;
b4a.DesaWisataSaribu.simplemediamanager._smmedia _media = null;
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Private Sub TrimMediaCacheImpl";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="If DateTime.Now > LastTrimCache + MinTimeBetweenT";
if (__c.DateTime.getNow()>__ref._lasttrimcache /*long*/ +__ref._mintimebetweentrims /*long*/ ) { 
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Dim OnlyLookForDisconnectedTargets As Boolean =";
_onlylookfordisconnectedtargets = __ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getsize /*int*/ (null)<__ref._maxmediacachesize /*int*/ ;
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="LastTrimCache = DateTime.Now";
__ref._lasttrimcache /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=13959175;
 //BA.debugLineNum = 13959175;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=13959176;
 //BA.debugLineNum = 13959176;BA.debugLine="Do While i < MediaCache.Size";
while (_i<__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getsize /*int*/ (null)) {
RDebugUtils.currentLine=13959177;
 //BA.debugLineNum = 13959177;BA.debugLine="Dim Media As SMMedia = MediaCache.Get(MediaCach";
_media = (b4a.DesaWisataSaribu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Get(_i)));
RDebugUtils.currentLine=13959178;
 //BA.debugLineNum = 13959178;BA.debugLine="CancelDisconnectedTargets(Media)";
__ref._canceldisconnectedtargets /*String*/ (null,_media);
RDebugUtils.currentLine=13959179;
 //BA.debugLineNum = 13959179;BA.debugLine="If OnlyLookForDisconnectedTargets = False And M";
if (_onlylookfordisconnectedtargets==__c.False && __ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getsize /*int*/ (null)>__ref._maxmediacachesize /*int*/ /(double)2 && __ref._ismediastillrelevant /*boolean*/ (null,_media)==__c.False) { 
RDebugUtils.currentLine=13959180;
 //BA.debugLineNum = 13959180;BA.debugLine="DeleteMedia(Media)";
__ref._deletemedia /*String*/ (null,_media);
RDebugUtils.currentLine=13959181;
 //BA.debugLineNum = 13959181;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 };
RDebugUtils.currentLine=13959183;
 //BA.debugLineNum = 13959183;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
 };
RDebugUtils.currentLine=13959186;
 //BA.debugLineNum = 13959186;BA.debugLine="End Sub";
return "";
}
public String  _preprocessexif(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "preprocessexif", true))
	 {return ((String) Debug.delegate(ba, "preprocessexif", new Object[] {_media,_in}));}
anywheresoftware.b4j.object.JavaObject _exifinterface = null;
int _orientation = 0;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Public Sub PreprocessExif (Media As SMMedia, In As";
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="If Media.Meta.Mime <> \"image/jpeg\" Then";
if ((_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Mime /*String*/ ).equals("image/jpeg") == false) { 
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="Log(\"image/jpeg mime expected!\")";
__c.LogImpl("914876677","image/jpeg mime expected!",0);
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="In.Close";
_in.Close();
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=14876682;
 //BA.debugLineNum = 14876682;BA.debugLine="If B4ASdkVersion >= 24 Then";
if (__ref._b4asdkversion /*int*/ >=24) { 
RDebugUtils.currentLine=14876683;
 //BA.debugLineNum = 14876683;BA.debugLine="Dim ExifInterface As JavaObject";
_exifinterface = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=14876684;
 //BA.debugLineNum = 14876684;BA.debugLine="ExifInterface.InitializeNewInstance(\"android.med";
_exifinterface.InitializeNewInstance("android.media.ExifInterface",new Object[]{(Object)(_in.getObject())});
RDebugUtils.currentLine=14876685;
 //BA.debugLineNum = 14876685;BA.debugLine="Dim orientation As Int = ExifInterface.RunMethod";
_orientation = (int)(BA.ObjectToNumber(_exifinterface.RunMethod("getAttribute",new Object[]{(Object)("Orientation")})));
RDebugUtils.currentLine=14876686;
 //BA.debugLineNum = 14876686;BA.debugLine="Media.Media = RotateBitmapBasedOnOrientation(Med";
_media.Media /*Object*/  = (Object)(__ref._rotatebitmapbasedonorientation /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_media.Media /*Object*/ )),_orientation).getObject());
 };
RDebugUtils.currentLine=14876688;
 //BA.debugLineNum = 14876688;BA.debugLine="In.Close";
_in.Close();
RDebugUtils.currentLine=14876708;
 //BA.debugLineNum = 14876708;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _rotatebitmapbasedonorientation(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _orientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "rotatebitmapbasedonorientation", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "rotatebitmapbasedonorientation", new Object[] {_bmp,_orientation}));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub RotateBitmapBasedOnOrientation (bmp As";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Select orientation";
switch (_orientation) {
case 3: {
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="bmp = bmp.Rotate(180)";
_bmp = _bmp.Rotate((int) (180));
 break; }
case 6: {
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="bmp = bmp.Rotate(90)";
_bmp = _bmp.Rotate((int) (90));
 break; }
case 8: {
RDebugUtils.currentLine=14942215;
 //BA.debugLineNum = 14942215;BA.debugLine="bmp = bmp.Rotate(270)";
_bmp = _bmp.Rotate((int) (270));
 break; }
}
;
RDebugUtils.currentLine=14942217;
 //BA.debugLineNum = 14942217;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=14942218;
 //BA.debugLineNum = 14942218;BA.debugLine="End Sub";
return null;
}
public void  _registerformeta(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _requestset) throws Exception{
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "registerformeta", true))
	 {Debug.delegate(ba, "registerformeta", new Object[] {_requestset}); return;}
ResumableSub_RegisterForMeta rsub = new ResumableSub_RegisterForMeta(this,__ref,_requestset);
rsub.resume(ba, null);
}
public static class ResumableSub_RegisterForMeta extends BA.ResumableSub {
public ResumableSub_RegisterForMeta(b4a.DesaWisataSaribu.simplemediamanager parent,b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _requestset) {
this.parent = parent;
this.__ref = __ref;
this._requestset = _requestset;
this.__ref = parent;
}
b4a.DesaWisataSaribu.simplemediamanager __ref;
b4a.DesaWisataSaribu.simplemediamanager parent;
b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _requestset;
b4a.DesaWisataSaribu.simplemediamanager._smmedia _media = null;
b4a.DesaWisataSaribu.simplemediamanager._smmediameta _meta = null;
b4a.DesaWisataSaribu.httpjob _job = null;
Object _o = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="simplemediamanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="ClearMedia(RequestSet.Target)";
__ref._clearmedia /*String*/ (null,_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="ViewsRequestSet.Put(RequestSet.Target, RequestSet";
__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_requestset));
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="Dim media As SMMedia = MediaCache.Get(RequestSet.";
_media = (b4a.DesaWisataSaribu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="If media <> Null And media.MediaState = STATE_REA";
if (true) break;

case 1:
//if
this.state = 30;
if (_media!= null && _media.MediaState /*int*/ ==__ref._state_ready /*int*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 30;
RDebugUtils.currentLine=13238282;
 //BA.debugLineNum = 13238282;BA.debugLine="media.WaitingRequestsSets.Add(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=13238283;
 //BA.debugLineNum = 13238283;BA.debugLine="MediaIsReady(media)";
__ref._mediaisready /*String*/ (null,_media);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13238285;
 //BA.debugLineNum = 13238285;BA.debugLine="If media <> Null And media.MediaState = STATE_ER";
if (true) break;

case 6:
//if
this.state = 9;
if (_media!= null && _media.MediaState /*int*/ ==__ref._state_error /*int*/ ) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=13238286;
 //BA.debugLineNum = 13238286;BA.debugLine="Log(\"Unexpected state:  media.MediaState = STAT";
parent.__c.LogImpl("913238286","Unexpected state:  media.MediaState = STATE_ERROR",0);
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=13238288;
 //BA.debugLineNum = 13238288;BA.debugLine="RequestSet.RequestState = STATE_LOADING";
_requestset.RequestState /*int*/  = __ref._state_loading /*int*/ ;
RDebugUtils.currentLine=13238289;
 //BA.debugLineNum = 13238289;BA.debugLine="ViewsManager.AddMedia(RequestSet, MediaCache.Get";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._addmedia /*void*/ (null,_requestset,(b4a.DesaWisataSaribu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_requestset.Loading /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ ))),_requestset.Loading /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ );
RDebugUtils.currentLine=13238290;
 //BA.debugLineNum = 13238290;BA.debugLine="If MetaCache.ContainsKey(RequestSet.MainMedia.Ke";
if (true) break;

case 10:
//if
this.state = 29;
if (__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ ))) { 
this.state = 12;
}else {
this.state = 18;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=13238291;
 //BA.debugLineNum = 13238291;BA.debugLine="Dim meta As SMMediaMeta = MetaCache.Get(Request";
_meta = (b4a.DesaWisataSaribu.simplemediamanager._smmediameta)(__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
RDebugUtils.currentLine=13238292;
 //BA.debugLineNum = 13238292;BA.debugLine="meta.WaitingRequestsSets.Add(RequestSet)";
_meta.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=13238293;
 //BA.debugLineNum = 13238293;BA.debugLine="If meta.MetaState <> STATE_LOADING Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_meta.MetaState /*int*/ !=__ref._state_loading /*int*/ ) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=13238294;
 //BA.debugLineNum = 13238294;BA.debugLine="MetaIsReady(meta)";
__ref._metaisready /*String*/ (null,_meta);
 if (true) break;

case 16:
//C
this.state = 29;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=13238297;
 //BA.debugLineNum = 13238297;BA.debugLine="meta = CreateSMMediaMeta(RequestSet.MainMedia.M";
_meta = __ref._createsmmediameta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ (null,_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Mime /*String*/ ,_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ ,(int)(BA.ObjectToNumber((((_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Mime /*String*/ ).equals(__ref._mime_unknown /*String*/ )) ? ((Object)(__ref._state_loading /*int*/ )) : ((Object)(__ref._state_ready /*int*/ ))))),parent.__c.False);
RDebugUtils.currentLine=13238298;
 //BA.debugLineNum = 13238298;BA.debugLine="meta.FirstUrl = RequestSet.MainMedia.Url";
_meta.FirstUrl /*String*/  = _requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Url /*String*/ ;
RDebugUtils.currentLine=13238299;
 //BA.debugLineNum = 13238299;BA.debugLine="meta.WaitingRequestsSets.Add(RequestSet)";
_meta.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=13238300;
 //BA.debugLineNum = 13238300;BA.debugLine="meta.Dir = RequestSet.MainMedia.Extra.GetDefaul";
_meta.Dir /*String*/  = BA.ObjectToString(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._request_dir /*String*/ ),(Object)("")));
RDebugUtils.currentLine=13238301;
 //BA.debugLineNum = 13238301;BA.debugLine="meta.FileName = RequestSet.MainMedia.Extra.GetD";
_meta.FileName /*String*/  = BA.ObjectToString(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._request_file /*String*/ ),(Object)("")));
RDebugUtils.currentLine=13238302;
 //BA.debugLineNum = 13238302;BA.debugLine="MetaCache.Put(meta.Key, meta)";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_meta.Key /*String*/ ),(Object)(_meta));
RDebugUtils.currentLine=13238303;
 //BA.debugLineNum = 13238303;BA.debugLine="If meta.MetaState = STATE_LOADING Then";
if (true) break;

case 19:
//if
this.state = 28;
if (_meta.MetaState /*int*/ ==__ref._state_loading /*int*/ ) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=13238304;
 //BA.debugLineNum = 13238304;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSaribu.httpjob();
RDebugUtils.currentLine=13238305;
 //BA.debugLineNum = 13238305;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13238306;
 //BA.debugLineNum = 13238306;BA.debugLine="job.Head(RequestSet.MainMedia.Url)";
_job._head /*String*/ (null,_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Url /*String*/ );
RDebugUtils.currentLine=13238307;
 //BA.debugLineNum = 13238307;BA.debugLine="job.GetRequest.Timeout = DefaultRequestTimeout";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._defaultrequesttimeout /*int*/ );
RDebugUtils.currentLine=13238308;
 //BA.debugLineNum = 13238308;BA.debugLine="AddHeadersToJob(job, RequestSet.MainMedia)";
__ref._addheaderstojob /*String*/ (null,_job,_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ );
RDebugUtils.currentLine=13238309;
 //BA.debugLineNum = 13238309;BA.debugLine="meta.Job = job";
_meta.Job /*b4a.DesaWisataSaribu.httpjob*/  = _job;
RDebugUtils.currentLine=13238310;
 //BA.debugLineNum = 13238310;BA.debugLine="Wait For (job) JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "registerformeta"), (Object)(_job));
this.state = 31;
return;
case 31:
//C
this.state = 22;
_job = (b4a.DesaWisataSaribu.httpjob) result[1];
;
RDebugUtils.currentLine=13238311;
 //BA.debugLineNum = 13238311;BA.debugLine="meta.Job = JobEmpty";
_meta.Job /*b4a.DesaWisataSaribu.httpjob*/  = __ref._jobempty /*b4a.DesaWisataSaribu.httpjob*/ ;
RDebugUtils.currentLine=13238312;
 //BA.debugLineNum = 13238312;BA.debugLine="If job.Success Then";
if (true) break;

case 22:
//if
this.state = 27;
if (_job._success /*boolean*/ ) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=13238313;
 //BA.debugLineNum = 13238313;BA.debugLine="Dim o As Object = job.Response.ContentType";
_o = (Object)(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getContentType());
RDebugUtils.currentLine=13238314;
 //BA.debugLineNum = 13238314;BA.debugLine="meta.Mime = IIf(o = Null, \"\", o).As(String)";
_meta.Mime /*String*/  = (((_o== null) ? ("") : (BA.ObjectToString(_o))));
RDebugUtils.currentLine=13238315;
 //BA.debugLineNum = 13238315;BA.debugLine="meta.MediaType = ViewsManager.MimeToMediaType";
_meta.MediaType /*int*/  = __ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._mimetomediatype /*int*/ (null,_meta.Mime /*String*/ );
RDebugUtils.currentLine=13238316;
 //BA.debugLineNum = 13238316;BA.debugLine="meta.MetaState = STATE_READY";
_meta.MetaState /*int*/  = __ref._state_ready /*int*/ ;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=13238321;
 //BA.debugLineNum = 13238321;BA.debugLine="meta.MetaState = STATE_ERROR";
_meta.MetaState /*int*/  = __ref._state_error /*int*/ ;
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=13238323;
 //BA.debugLineNum = 13238323;BA.debugLine="job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=13238326;
 //BA.debugLineNum = 13238326;BA.debugLine="MetaIsReady(meta)";
__ref._metaisready /*String*/ (null,_meta);
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=13238329;
 //BA.debugLineNum = 13238329;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setmaximagefilesize(b4a.DesaWisataSaribu.simplemediamanager __ref,long _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmaximagefilesize", true))
	 {return ((String) Debug.delegate(ba, "setmaximagefilesize", new Object[] {_s}));}
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub setMaxImageFileSize (s As Long)";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="ImagesLoader.MaxFileSize = s";
__ref._imagesloader /*b4a.DesaWisataSaribu.bitmapsasync*/ ._maxfilesize /*long*/  = _s;
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="End Sub";
return "";
}
public String  _setmediafromfile(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target,String _dir,String _filename,String _mime,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmediafromfile", true))
	 {return ((String) Debug.delegate(ba, "setmediafromfile", new Object[] {_target,_dir,_filename,_mime,_extra}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Public Sub SetMediaFromFile(Target As B4XView, Dir";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="If Extra = Null Or Extra.IsInitialized = False Th";
if (_extra== null || _extra.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="Dim Extra As Map";
_extra = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="Extra.Initialize";
_extra.Initialize();
 };
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="Extra.Put(REQUEST_DIR, IIf(Dir = \"\", FileName, Di";
_extra.Put((Object)(__ref._request_dir /*String*/ ),(((_dir).equals("")) ? ((Object)(_filename)) : ((Object)(_dir))));
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="Extra.Put(REQUEST_FILE, IIf(Dir = \"\", \"\", FileNam";
_extra.Put((Object)(__ref._request_file /*String*/ ),(((_dir).equals("")) ? ((Object)("")) : ((Object)(_filename))));
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="If ViewsManager.MimeToMediaType(Mime) = ViewsMana";
if (__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._mimetomediatype /*int*/ (null,_mime)==__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_none /*int*/ ) { 
RDebugUtils.currentLine=13107208;
 //BA.debugLineNum = 13107208;BA.debugLine="Log(\"Invalid mime!\")";
__c.LogImpl("913107208","Invalid mime!",0);
RDebugUtils.currentLine=13107209;
 //BA.debugLineNum = 13107209;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=13107211;
 //BA.debugLineNum = 13107211;BA.debugLine="SetMediaWithExtra(Target, xui.FileUri(Dir, FileNa";
__ref._setmediawithextra /*String*/ (null,_target,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .FileUri(_dir,_filename),_mime,_extra);
RDebugUtils.currentLine=13107212;
 //BA.debugLineNum = 13107212;BA.debugLine="End Sub";
return "";
}
public String  _setmediawithrequestset(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _requestset) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmediawithrequestset", true))
	 {return ((String) Debug.delegate(ba, "setmediawithrequestset", new Object[] {_requestset}));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub SetMediaWithRequestSet (RequestSet As S";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="RegisterForMeta(RequestSet)";
__ref._registerformeta /*void*/ (null,_requestset);
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="End Sub";
return "";
}
public String  _trimmediacache(b4a.DesaWisataSaribu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "trimmediacache", true))
	 {return ((String) Debug.delegate(ba, "trimmediacache", null));}
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Public Sub TrimMediaCache";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="LastTrimCache = 0";
__ref._lasttrimcache /*long*/  = (long) (0);
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="TrimMediaCacheImpl";
__ref._trimmediacacheimpl /*String*/ (null);
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="End Sub";
return "";
}
}