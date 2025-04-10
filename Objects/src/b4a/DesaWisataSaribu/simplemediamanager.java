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
public b4a.DesaWisataSaribu.listpackage _listpackage = null;
public b4a.DesaWisataSaribu.core _core = null;
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
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="ImagesLoader.Initialize";
__ref._imagesloader /*b4a.DesaWisataSaribu.bitmapsasync*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="ImagesLoader.MaxFileSize = 8 * 1024 * 1024";
__ref._imagesloader /*b4a.DesaWisataSaribu.bitmapsasync*/ ._maxfilesize /*long*/  = (long) (8*1024*1024);
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="MetaCache.Initialize";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="MediaCache.Initialize";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="ViewsRequestSet.Initialize";
__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="ViewsManager.Initialize (Me)";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._initialize /*String*/ (null,ba,(b4a.DesaWisataSaribu.simplemediamanager)(this));
RDebugUtils.currentLine=9502728;
 //BA.debugLineNum = 9502728;BA.debugLine="Dim build As JavaObject";
_build = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=9502729;
 //BA.debugLineNum = 9502729;BA.debugLine="B4ASdkVersion =  build.InitializeStatic(\"android.";
__ref._b4asdkversion /*int*/  = (int)(BA.ObjectToNumber(_build.InitializeStatic("android.os.Build$VERSION").GetField("SDK_INT")));
RDebugUtils.currentLine=9502731;
 //BA.debugLineNum = 9502731;BA.debugLine="AddLocalMedia(KEY_DEFAULT_ERROR, Null, \"none\")";
__ref._addlocalmedia /*b4a.DesaWisataSaribu.simplemediamanager._smmedia*/ (null,__ref._key_default_error /*String*/ ,__c.Null,"none");
RDebugUtils.currentLine=9502732;
 //BA.debugLineNum = 9502732;BA.debugLine="DefaultLoadingRequest = CreateSMMRequest(KEY_DEFA";
__ref._defaultloadingrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/  = __ref._createsmmrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,__ref._key_default_loading /*String*/ ,"",__ref._mime_unknown /*String*/ );
RDebugUtils.currentLine=9502733;
 //BA.debugLineNum = 9502733;BA.debugLine="DefaultLoadingRequest.Extra.Put(REQUEST_BACKGROUN";
__ref._defaultloadingrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._request_background /*String*/ ),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White));
RDebugUtils.currentLine=9502734;
 //BA.debugLineNum = 9502734;BA.debugLine="DefaultErrorRequest = CreateSMMRequest(KEY_DEFAUL";
__ref._defaulterrorrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/  = __ref._createsmmrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,__ref._key_default_error /*String*/ ,"",__ref._mime_unknown /*String*/ );
RDebugUtils.currentLine=9502735;
 //BA.debugLineNum = 9502735;BA.debugLine="DefaultErrorRequest.Extra.Put(REQUEST_BACKGROUND,";
__ref._defaulterrorrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._request_background /*String*/ ),(Object)(((int)0xff6a6a6a)));
RDebugUtils.currentLine=9502736;
 //BA.debugLineNum = 9502736;BA.debugLine="AddLocalMedia(KEY_DEFAULT_LOADING, Null, \"none\")";
__ref._addlocalmedia /*b4a.DesaWisataSaribu.simplemediamanager._smmedia*/ (null,__ref._key_default_loading /*String*/ ,__c.Null,"none");
RDebugUtils.currentLine=9502737;
 //BA.debugLineNum = 9502737;BA.debugLine="LastTrimCache = DateTime.Now";
__ref._lasttrimcache /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=9502738;
 //BA.debugLineNum = 9502738;BA.debugLine="HttpRequestsManager.Initialize";
__ref._httprequestsmanager /*b4a.DesaWisataSaribu.requestsmanager*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9502742;
 //BA.debugLineNum = 9502742;BA.debugLine="End Sub";
return "";
}
public String  _setmediawithextra(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target,String _url,String _mime,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmediawithextra", true))
	 {return ((String) Debug.delegate(ba, "setmediawithextra", new Object[] {_target,_url,_mime,_extra}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _request = null;
b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _rs = null;
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub SetMediaWithExtra (Target As B4XView, U";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="If Mime = \"\" Then Mime = MIME_UNKNOWN";
if ((_mime).equals("")) { 
_mime = __ref._mime_unknown /*String*/ ;};
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="If Extra = Null Or Extra.IsInitialized = False Th";
if (_extra== null || _extra.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="Dim Extra As Map";
_extra = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="Extra.Initialize";
_extra.Initialize();
 };
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="Dim Request As SMMediaRequest = CreateSMMRequest2";
_request = __ref._createsmmrequest2 /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,_url,_url,_mime,_extra);
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="Dim rs As SMMediaRequestSet = CreateSMMediaReques";
_rs = __ref._createsmmediarequestset /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset*/ (null,__ref._clonerequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,__ref._defaultloadingrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ ),_request,__ref._clonerequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,__ref._defaulterrorrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ ),_target);
RDebugUtils.currentLine=9895946;
 //BA.debugLineNum = 9895946;BA.debugLine="If Extra.ContainsKey(REQUEST_CALLBACK) Then rs.Ca";
if (_extra.ContainsKey((Object)(__ref._request_callback /*String*/ ))) { 
_rs.Callback /*Object*/  = _extra.Get((Object)(__ref._request_callback /*String*/ ));};
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="SetMediaWithRequestSet(rs)";
__ref._setmediawithrequestset /*String*/ (null,_rs);
RDebugUtils.currentLine=9895948;
 //BA.debugLineNum = 9895948;BA.debugLine="End Sub";
return "";
}
public String  _addheaderstojob(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.httpjob _j,b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _request) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "addheaderstojob", true))
	 {return ((String) Debug.delegate(ba, "addheaderstojob", new Object[] {_j,_request}));}
anywheresoftware.b4a.objects.collections.Map _headers = null;
String _key = "";
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub AddHeadersToJob(j As HttpJob, request";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="If request.Extra.ContainsKey(REQUEST_HEADERS) The";
if (_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(__ref._request_headers /*String*/ ))) { 
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Dim headers As Map = request.Extra.Get(REQUEST_H";
_headers = new anywheresoftware.b4a.objects.collections.Map();
_headers = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._request_headers /*String*/ ))));
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="For Each key As String In headers.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _headers.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="j.GetRequest.SetHeader(key, headers.Get(key))";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader(_key,BA.ObjectToString(_headers.Get((Object)(_key))));
 }
};
 };
RDebugUtils.currentLine=10158087;
 //BA.debugLineNum = 10158087;BA.debugLine="End Sub";
return "";
}
public b4a.DesaWisataSaribu.simplemediamanager._smmedia  _addlocalmedia(b4a.DesaWisataSaribu.simplemediamanager __ref,String _key,Object _media,String _mime) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "addlocalmedia", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmedia) Debug.delegate(ba, "addlocalmedia", new Object[] {_key,_media,_mime}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediameta _meta = null;
b4a.DesaWisataSaribu.simplemediamanager._smmedia _smedia = null;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub AddLocalMedia (Key As String, Media As";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Dim meta As SMMediaMeta = CreateSMMediaMeta(Mime,";
_meta = __ref._createsmmediameta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ (null,_mime,_key,__ref._state_ready /*int*/ ,__c.True);
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Dim smedia As SMMedia = CreateSMMedia(Media, meta";
_smedia = __ref._createsmmedia /*b4a.DesaWisataSaribu.simplemediamanager._smmedia*/ (null,_media,_meta,__ref._state_ready /*int*/ );
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="MetaCache.Put(meta.Key, meta)";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_meta.Key /*String*/ ),(Object)(_meta));
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="MediaCache.Put(meta.Key, smedia)";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_meta.Key /*String*/ ),(Object)(_smedia));
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="Return smedia";
if (true) return _smedia;
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediameta  _createsmmediameta(b4a.DesaWisataSaribu.simplemediamanager __ref,String _mime,String _key,int _metastate,boolean _permanent) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmediameta", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediameta) Debug.delegate(ba, "createsmmediameta", new Object[] {_mime,_key,_metastate,_permanent}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediameta _t1 = null;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Private Sub CreateSMMediaMeta (Mime As String, Key";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Dim t1 As SMMediaMeta";
_t1 = new b4a.DesaWisataSaribu.simplemediamanager._smmediameta();
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="t1.Mime = Mime";
_t1.Mime /*String*/  = _mime;
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="t1.MediaType = ViewsManager.MimeToMediaType(Mime)";
_t1.MediaType /*int*/  = __ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._mimetomediatype /*int*/ (null,_mime);
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="t1.MetaState = MetaState";
_t1.MetaState /*int*/  = _metastate;
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="t1.Permanent = Permanent";
_t1.Permanent /*boolean*/  = _permanent;
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="t1.WaitingRequestsSets.Initialize";
_t1.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmedia  _createsmmedia(b4a.DesaWisataSaribu.simplemediamanager __ref,Object _media,b4a.DesaWisataSaribu.simplemediamanager._smmediameta _meta,int _mediastate) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmedia", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmedia) Debug.delegate(ba, "createsmmedia", new Object[] {_media,_meta,_mediastate}));}
b4a.DesaWisataSaribu.simplemediamanager._smmedia _t1 = null;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub CreateSMMedia (Media As Object, Meta As";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Dim t1 As SMMedia";
_t1 = new b4a.DesaWisataSaribu.simplemediamanager._smmedia();
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="t1.Media = Media";
_t1.Media /*Object*/  = _media;
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="t1.Meta = Meta";
_t1.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/  = _meta;
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="t1.MediaState = MediaState";
_t1.MediaState /*int*/  = _mediastate;
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="t1.WaitingRequestsSets.Initialize";
_t1.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="t1.UsedBy.Initialize";
_t1.UsedBy /*b4a.DesaWisataSaribu.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub CancelDisconnectedTargets (Media As SM";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="For Each set As B4XSet In Array(Media.UsedBy, Med";
{
final Object[] group1 = new Object[]{(Object)(_media.UsedBy /*b4a.DesaWisataSaribu.b4xset*/ ),(Object)(_media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ )};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_set = (b4a.DesaWisataSaribu.b4xset)(group1[index1]);
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="For i = set.Size - 1 To 0 Step - 1";
{
final int step2 = -1;
final int limit2 = (int) (0);
_i = (int) (_set._getsize /*int*/ (null)-1) ;
for (;_i >= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="Dim RequestSet As SMMediaRequestSet = set.AsLis";
_requestset = (b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset)(_set._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null).Get(_i));
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="If RequestSet.NumberOfAncestors > CountAncestor";
if (_requestset.NumberOfAncestors /*int*/ >__ref._countancestors /*int*/ (null,_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ )) { 
RDebugUtils.currentLine=11010056;
 //BA.debugLineNum = 11010056;BA.debugLine="ViewsManager.CancelRequest(RequestSet.Target)";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._cancelrequest /*String*/ (null,_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=11010057;
 //BA.debugLineNum = 11010057;BA.debugLine="set.Remove(RequestSet)";
_set._remove /*String*/ (null,(Object)(_requestset));
 };
 }
};
 }
};
RDebugUtils.currentLine=11010061;
 //BA.debugLineNum = 11010061;BA.debugLine="End Sub";
return "";
}
public int  _countancestors(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "countancestors", true))
	 {return ((Integer) Debug.delegate(ba, "countancestors", new Object[] {_target}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _count = 0;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Private Sub CountAncestors(Target As B4XView) As I";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Dim p As B4XView = Target";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _target;
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="Dim count As Int";
_count = 0;
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="Do While p.Parent Is View";
while (_p.getParent().getObjectOrNull() instanceof android.view.View) {
RDebugUtils.currentLine=11665416;
 //BA.debugLineNum = 11665416;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="p = p.Parent";
_p = _p.getParent();
 }
;
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="Return count";
if (true) return _count;
RDebugUtils.currentLine=11665420;
 //BA.debugLineNum = 11665420;BA.debugLine="End Sub";
return 0;
}
public String  _cancelrequest(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _requestset) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "cancelrequest", true))
	 {return ((String) Debug.delegate(ba, "cancelrequest", new Object[] {_requestset}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediameta _meta = null;
b4a.DesaWisataSaribu.simplemediamanager._smmedia _media = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub CancelRequest (RequestSet As SMMediaRe";
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="ViewsRequestSet.Remove(RequestSet.Target)";
__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="ViewsManager.CancelRequest(RequestSet.Target)";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._cancelrequest /*String*/ (null,_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="Dim meta As SMMediaMeta = MetaCache.Get(RequestSe";
_meta = (b4a.DesaWisataSaribu.simplemediamanager._smmediameta)(__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="If meta <> Null Then";
if (_meta!= null) { 
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="meta.WaitingRequestsSets.Remove(RequestSet)";
_meta.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._remove /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="Dim media As SMMedia = MediaCache.Get(RequestSet";
_media = (b4a.DesaWisataSaribu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="If media <> Null Then";
if (_media!= null) { 
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="media.WaitingRequestsSets.Remove(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._remove /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=10682380;
 //BA.debugLineNum = 10682380;BA.debugLine="media.UsedBy.Remove(RequestSet)";
_media.UsedBy /*b4a.DesaWisataSaribu.b4xset*/ ._remove /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=10682381;
 //BA.debugLineNum = 10682381;BA.debugLine="CancelDisconnectedTargets(media)";
__ref._canceldisconnectedtargets /*String*/ (null,_media);
 };
 };
RDebugUtils.currentLine=10682384;
 //BA.debugLineNum = 10682384;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.DesaWisataSaribu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Type SMMediaMeta (Mime As String, MediaType As In";
;
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="Type SMMedia (Media As Object, Meta As SMMediaMet";
;
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="Type SMMediaRequest (Key As String, Url As String";
;
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="Type SMMediaRequestSet (Loading As SMMediaRequest";
;
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="Public Const STATE_LOADING = 1, STATE_ERROR = 2,";
_state_loading = (int) (1);
_state_error = (int) (2);
_state_ready = (int) (3);
RDebugUtils.currentLine=9437191;
 //BA.debugLineNum = 9437191;BA.debugLine="Private MetaCache As Map";
_metacache = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9437192;
 //BA.debugLineNum = 9437192;BA.debugLine="Private MediaCache As B4XOrderedMap";
_mediacache = new b4a.DesaWisataSaribu.b4xorderedmap();
RDebugUtils.currentLine=9437193;
 //BA.debugLineNum = 9437193;BA.debugLine="Public MaxMediaCacheSize As Int = 40";
_maxmediacachesize = (int) (40);
RDebugUtils.currentLine=9437194;
 //BA.debugLineNum = 9437194;BA.debugLine="Private ViewsRequestSet As Map";
_viewsrequestset = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9437195;
 //BA.debugLineNum = 9437195;BA.debugLine="Private ImagesLoader As BitmapsAsync";
_imagesloader = new b4a.DesaWisataSaribu.bitmapsasync();
RDebugUtils.currentLine=9437196;
 //BA.debugLineNum = 9437196;BA.debugLine="Private JobEmpty As HttpJob";
_jobempty = new b4a.DesaWisataSaribu.httpjob();
RDebugUtils.currentLine=9437197;
 //BA.debugLineNum = 9437197;BA.debugLine="Public const KEY_DEFAULT_LOADING = \"~loading\", KE";
_key_default_loading = "~loading";
_key_default_error = "~error";
RDebugUtils.currentLine=9437198;
 //BA.debugLineNum = 9437198;BA.debugLine="Public const MIME_UNKNOWN As String = \"~unknown\"";
_mime_unknown = "~unknown";
RDebugUtils.currentLine=9437199;
 //BA.debugLineNum = 9437199;BA.debugLine="Public MaxImageSize = 1000 As Int";
_maximagesize = (int) (1000);
RDebugUtils.currentLine=9437200;
 //BA.debugLineNum = 9437200;BA.debugLine="Public DefaultFadeAnimationDuration As Int = 300";
_defaultfadeanimationduration = (int) (300);
RDebugUtils.currentLine=9437201;
 //BA.debugLineNum = 9437201;BA.debugLine="Public DefaultResizeMode As String = \"FIT\"";
_defaultresizemode = "FIT";
RDebugUtils.currentLine=9437202;
 //BA.debugLineNum = 9437202;BA.debugLine="Public DefaultBackgroundColor As Int = xui.Color_";
_defaultbackgroundcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=9437203;
 //BA.debugLineNum = 9437203;BA.debugLine="Public DefaultForegroundColor As Int = xui.Color_";
_defaultforegroundcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=9437204;
 //BA.debugLineNum = 9437204;BA.debugLine="Public ViewsManager As SMMViews";
_viewsmanager = new b4a.DesaWisataSaribu.smmviews();
RDebugUtils.currentLine=9437205;
 //BA.debugLineNum = 9437205;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9437206;
 //BA.debugLineNum = 9437206;BA.debugLine="Public DefaultLoadingRequest, DefaultErrorRequest";
_defaultloadingrequest = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequest();
_defaulterrorrequest = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequest();
RDebugUtils.currentLine=9437207;
 //BA.debugLineNum = 9437207;BA.debugLine="Public Const REQUEST_ROUNDIMAGE = \"round_image\",";
_request_roundimage = "round_image";
_request_background = "background";
_request_resize_mode = "resize_mode";
_request_fade_animation_duration = "fade_animation";
RDebugUtils.currentLine=9437208;
 //BA.debugLineNum = 9437208;BA.debugLine="Public Const REQUEST_FOREGROUND = \"foreground\" As";
_request_foreground = "foreground";
RDebugUtils.currentLine=9437209;
 //BA.debugLineNum = 9437209;BA.debugLine="Public Const REQUEST_CALLBACK = \"callback\" As Str";
_request_callback = "callback";
RDebugUtils.currentLine=9437210;
 //BA.debugLineNum = 9437210;BA.debugLine="Public Const REQUEST_ZOOMIMAGEVIEW = \"zoomimagevi";
_request_zoomimageview = "zoomimageview";
RDebugUtils.currentLine=9437211;
 //BA.debugLineNum = 9437211;BA.debugLine="Private Const REQUEST_FILE = \"file\", REQUEST_DIR";
_request_file = "file";
_request_dir = "dir";
RDebugUtils.currentLine=9437212;
 //BA.debugLineNum = 9437212;BA.debugLine="Public Const REQUEST_HEADERS = \"headers\" As Strin";
_request_headers = "headers";
RDebugUtils.currentLine=9437213;
 //BA.debugLineNum = 9437213;BA.debugLine="Private LastTrimCache As Long";
_lasttrimcache = 0L;
RDebugUtils.currentLine=9437214;
 //BA.debugLineNum = 9437214;BA.debugLine="Public MinTimeBetweenTrims As Long = 2000";
_mintimebetweentrims = (long) (2000);
RDebugUtils.currentLine=9437215;
 //BA.debugLineNum = 9437215;BA.debugLine="Public SleepDurationBeforeDownload As Long = 50";
_sleepdurationbeforedownload = (long) (50);
RDebugUtils.currentLine=9437216;
 //BA.debugLineNum = 9437216;BA.debugLine="Private HttpRequestsManager As RequestsManager";
_httprequestsmanager = new b4a.DesaWisataSaribu.requestsmanager();
RDebugUtils.currentLine=9437217;
 //BA.debugLineNum = 9437217;BA.debugLine="Public B4ASdkVersion As Int";
_b4asdkversion = 0;
RDebugUtils.currentLine=9437218;
 //BA.debugLineNum = 9437218;BA.debugLine="Public DefaultRequestTimeout As Int = 30000";
_defaultrequesttimeout = (int) (30000);
RDebugUtils.currentLine=9437222;
 //BA.debugLineNum = 9437222;BA.debugLine="End Sub";
return "";
}
public String  _clearmedia(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "clearmedia", true))
	 {return ((String) Debug.delegate(ba, "clearmedia", new Object[] {_target}));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Public Sub ClearMedia(Target As B4XView)";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="If ViewsRequestSet.ContainsKey(Target) Then";
if (__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_target.getObject()))) { 
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="CancelRequest(ViewsRequestSet.Get(Target))";
__ref._cancelrequest /*String*/ (null,(b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset)(__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_target.getObject()))));
 };
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="End Sub";
return "";
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest  _clonerequest(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _request) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "clonerequest", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediarequest) Debug.delegate(ba, "clonerequest", new Object[] {_request}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _req = null;
String _k = "";
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub CloneRequest(Request As SMMediaRequest)";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Dim req As SMMediaRequest = CreateSMMRequest(Requ";
_req = __ref._createsmmrequest /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,_request.Key /*String*/ ,_request.Url /*String*/ ,_request.Mime /*String*/ );
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="For Each k As String In Request.Extra.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="req.Extra.Put(k, Request.Extra.Get(k))";
_req.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 }
};
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest  _createsmmrequest(b4a.DesaWisataSaribu.simplemediamanager __ref,String _key,String _url,String _mime) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmrequest", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediarequest) Debug.delegate(ba, "createsmmrequest", new Object[] {_key,_url,_mime}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _t1 = null;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub CreateSMMRequest (Key As String, Url A";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim t1 As SMMediaRequest";
_t1 = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequest();
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="t1.Url = Url";
_t1.Url /*String*/  = _url;
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="t1.Mime = Mime";
_t1.Mime /*String*/  = _mime;
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="t1.Extra.Initialize";
_t1.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest  _createrequest(b4a.DesaWisataSaribu.simplemediamanager __ref,String _url,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createrequest", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediarequest) Debug.delegate(ba, "createrequest", new Object[] {_url,_extra}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Public Sub CreateRequest (Url As String, Extra As";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="Return CreateSMMRequest2(Url, Url, MIME_UNKNOWN,";
if (true) return __ref._createsmmrequest2 /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,_url,_url,__ref._mime_unknown /*String*/ ,_extra);
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest  _createsmmrequest2(b4a.DesaWisataSaribu.simplemediamanager __ref,String _key,String _url,String _mime,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmrequest2", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediarequest) Debug.delegate(ba, "createsmmrequest2", new Object[] {_key,_url,_mime,_extra}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _t1 = null;
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Private Sub CreateSMMRequest2 (Key As String, Url";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Dim t1 As SMMediaRequest";
_t1 = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequest();
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="t1.Url = Url";
_t1.Url /*String*/  = _url;
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="t1.Mime = Mime";
_t1.Mime /*String*/  = _mime;
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="t1.Extra = Extra";
_t1.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = _extra;
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset  _createsmmediarequestset(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _loading,b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _mainmedia,b4a.DesaWisataSaribu.simplemediamanager._smmediarequest _error,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "createsmmediarequestset", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset) Debug.delegate(ba, "createsmmediarequestset", new Object[] {_loading,_mainmedia,_error,_target}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _t1 = null;
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub CreateSMMediaRequestSet (Loading As SMM";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Dim t1 As SMMediaRequestSet";
_t1 = new b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset();
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="t1.Loading = Loading";
_t1.Loading /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/  = _loading;
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="t1.MainMedia = MainMedia";
_t1.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/  = _mainmedia;
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="t1.Error = Error";
_t1.Error /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/  = _error;
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="t1.Target = Target";
_t1.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _target;
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="t1.NumberOfAncestors = CountAncestors(t1.Target)";
_t1.NumberOfAncestors /*int*/  = __ref._countancestors /*int*/ (null,_t1.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="t1.Callback = Null";
_t1.Callback /*Object*/  = __c.Null;
RDebugUtils.currentLine=11599881;
 //BA.debugLineNum = 11599881;BA.debugLine="If t1.NumberOfAncestors = 0 Then";
if (_t1.NumberOfAncestors /*int*/ ==0) { 
RDebugUtils.currentLine=11599882;
 //BA.debugLineNum = 11599882;BA.debugLine="Log(\"Target is not in the views tree!\")";
__c.LogImpl("911599882","Target is not in the views tree!",0);
 };
RDebugUtils.currentLine=11599884;
 //BA.debugLineNum = 11599884;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=11599885;
 //BA.debugLineNum = 11599885;BA.debugLine="End Sub";
return null;
}
public String  _deletemedia(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "deletemedia", true))
	 {return ((String) Debug.delegate(ba, "deletemedia", new Object[] {_media}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub DeleteMedia (Media As SMMedia)";
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="If Media.MediaState = STATE_READY Then";
if (_media.MediaState /*int*/ ==__ref._state_ready /*int*/ ) { 
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="Select Media.Meta.MediaType";
switch (BA.switchObjectToInt(_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_image /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_html /*int*/ )) {
case 0: {
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="Dim jo As JavaObject = Media.Media 'B4XBitmap";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_media.Media /*Object*/ ));
RDebugUtils.currentLine=10878985;
 //BA.debugLineNum = 10878985;BA.debugLine="jo.RunMethod(\"recycle\", Null)";
_jo.RunMethod("recycle",(Object[])(__c.Null));
 break; }
case 1: {
RDebugUtils.currentLine=10878988;
 //BA.debugLineNum = 10878988;BA.debugLine="MetaCache.Remove(Media.Meta.Key)";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Key /*String*/ ));
 break; }
}
;
 }else 
{RDebugUtils.currentLine=10878990;
 //BA.debugLineNum = 10878990;BA.debugLine="Else if Media.MediaState = STATE_LOADING Then";
if (_media.MediaState /*int*/ ==__ref._state_loading /*int*/ ) { 
RDebugUtils.currentLine=10878994;
 //BA.debugLineNum = 10878994;BA.debugLine="If Media.Job.IsInitialized Then";
if (_media.Job /*b4a.DesaWisataSaribu.httpjob*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=10878995;
 //BA.debugLineNum = 10878995;BA.debugLine="HttpRequestsManager.CancelRequest(Media.Meta.Fi";
__ref._httprequestsmanager /*b4a.DesaWisataSaribu.requestsmanager*/ ._cancelrequest /*String*/ (null,_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .FirstUrl /*String*/ ,_media.Job /*b4a.DesaWisataSaribu.httpjob*/ );
 };
 }}
;
RDebugUtils.currentLine=10878998;
 //BA.debugLineNum = 10878998;BA.debugLine="MediaCache.Remove(Media.Meta.Key)";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Key /*String*/ ));
RDebugUtils.currentLine=10878999;
 //BA.debugLineNum = 10878999;BA.debugLine="End Sub";
return "";
}
public String  _designersetmedia(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.keywords.DesignerArgs _designerargs) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "designersetmedia", true))
	 {return ((String) Debug.delegate(ba, "designersetmedia", new Object[] {_designerargs}));}
anywheresoftware.b4a.objects.B4XViewWrapper _target = null;
String _url = "";
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub DesignerSetMedia(DesignerArgs As Desig";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Dim Target As B4XView = DesignerArgs.GetViewFromA";
_target = new anywheresoftware.b4a.objects.B4XViewWrapper();
_target = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_designerargs.GetViewFromArgs((int) (0))));
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Dim url As String = DesignerArgs.Arguments.Get(1)";
_url = BA.ObjectToString(_designerargs.getArguments().Get((int) (1)));
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="If DesignerArgs.FirstRun Then";
if (_designerargs.getFirstRun()) { 
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="SetMedia(Target, url)";
__ref._setmedia /*String*/ (null,_target,_url);
 }else {
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="PanelResized(Target)";
__ref._panelresized /*String*/ (null,_target);
 };
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="End Sub";
return "";
}
public String  _setmedia(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmedia", true))
	 {return ((String) Debug.delegate(ba, "setmedia", new Object[] {_target,_url}));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub SetMedia(Target As B4XView, Url As Stri";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="SetMediaWithExtra(Target, Url, MIME_UNKNOWN, Crea";
__ref._setmediawithextra /*String*/ (null,_target,_url,__ref._mime_unknown /*String*/ ,__c.createMap(new Object[] {}));
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="End Sub";
return "";
}
public String  _panelresized(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "panelresized", true))
	 {return ((String) Debug.delegate(ba, "panelresized", new Object[] {_target}));}
b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _set = null;
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Public Sub PanelResized (Target As B4XView)";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Dim set As SMMediaRequestSet = ViewsRequestSet.Ge";
_set = (b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset)(__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_target.getObject())));
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="If set <> Null Then";
if (_set!= null) { 
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="ViewsManager.ParentResized(Target)";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._parentresized /*String*/ (null,_target);
 };
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="If Media.Meta.MetaState = STATE_READY Then";
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
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="If SleepDurationBeforeDownload > 0 Then";
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
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="Sleep(SleepDurationBeforeDownload)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "downloadimagemedia"),(int) (__ref._sleepdurationbeforedownload /*long*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="CancelDisconnectedTargets(Media)";
__ref._canceldisconnectedtargets /*String*/ (null,_media);
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="If IsMediaStillRelevant(Media) = False Then";
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
RDebugUtils.currentLine=10289161;
 //BA.debugLineNum = 10289161;BA.debugLine="DeleteMedia(Media) 'media is loading state. Re";
__ref._deletemedia /*String*/ (null,_media);
RDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;
;
RDebugUtils.currentLine=10289165;
 //BA.debugLineNum = 10289165;BA.debugLine="If Media.Meta.Dir = \"\" Then";

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
RDebugUtils.currentLine=10289166;
 //BA.debugLineNum = 10289166;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSaribu.httpjob();
RDebugUtils.currentLine=10289167;
 //BA.debugLineNum = 10289167;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=10289168;
 //BA.debugLineNum = 10289168;BA.debugLine="job.Download(Media.Meta.FirstUrl)";
_job._download /*String*/ (null,_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .FirstUrl /*String*/ );
RDebugUtils.currentLine=10289169;
 //BA.debugLineNum = 10289169;BA.debugLine="job.GetRequest.Timeout = DefaultRequestTimeout";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._defaultrequesttimeout /*int*/ );
RDebugUtils.currentLine=10289170;
 //BA.debugLineNum = 10289170;BA.debugLine="AddHeadersToJob(job, Request)";
__ref._addheaderstojob /*String*/ (null,_job,_request);
RDebugUtils.currentLine=10289174;
 //BA.debugLineNum = 10289174;BA.debugLine="Media.Job = job";
_media.Job /*b4a.DesaWisataSaribu.httpjob*/  = _job;
RDebugUtils.currentLine=10289175;
 //BA.debugLineNum = 10289175;BA.debugLine="Wait For (job) JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "downloadimagemedia"), (Object)(_job));
this.state = 27;
return;
case 27:
//C
this.state = 14;
_job = (b4a.DesaWisataSaribu.httpjob) result[1];
;
RDebugUtils.currentLine=10289176;
 //BA.debugLineNum = 10289176;BA.debugLine="Media.Job = JobEmpty";
_media.Job /*b4a.DesaWisataSaribu.httpjob*/  = __ref._jobempty /*b4a.DesaWisataSaribu.httpjob*/ ;
RDebugUtils.currentLine=10289181;
 //BA.debugLineNum = 10289181;BA.debugLine="If job.Success Then";
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
RDebugUtils.currentLine=10289182;
 //BA.debugLineNum = 10289182;BA.debugLine="Wait For (PrepareMedia(Media, job, \"\", \"\", Fal";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "downloadimagemedia"), __ref._preparemedia /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_media,_job,"","",parent.__c.False));
this.state = 28;
return;
case 28:
//C
this.state = 19;
_unused = (Boolean) result[1];
;
RDebugUtils.currentLine=10289183;
 //BA.debugLineNum = 10289183;BA.debugLine="Media.MediaState = IIf(Media.Media <> Null, ST";
_media.MediaState /*int*/  = (int)(BA.ObjectToNumber(((_media.Media /*Object*/ != null) ? ((Object)(__ref._state_ready /*int*/ )) : ((Object)(__ref._state_error /*int*/ )))));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=10289185;
 //BA.debugLineNum = 10289185;BA.debugLine="Media.MediaState = STATE_ERROR";
_media.MediaState /*int*/  = __ref._state_error /*int*/ ;
 if (true) break;

case 19:
//C
this.state = 22;
;
RDebugUtils.currentLine=10289187;
 //BA.debugLineNum = 10289187;BA.debugLine="job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=10289192;
 //BA.debugLineNum = 10289192;BA.debugLine="Wait For (PrepareMedia(Media, Null, Media.Meta.";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "downloadimagemedia"), __ref._preparemedia /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_media,(b4a.DesaWisataSaribu.httpjob)(parent.__c.Null),_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Dir /*String*/ ,_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .FileName /*String*/ ,parent.__c.True));
this.state = 29;
return;
case 29:
//C
this.state = 22;
_unused = (Boolean) result[1];
;
RDebugUtils.currentLine=10289193;
 //BA.debugLineNum = 10289193;BA.debugLine="Media.MediaState = IIf(Media.Media <> Null, STA";
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
RDebugUtils.currentLine=10289197;
 //BA.debugLineNum = 10289197;BA.debugLine="Media.MediaState = STATE_ERROR";
_media.MediaState /*int*/  = __ref._state_error /*int*/ ;
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=10289199;
 //BA.debugLineNum = 10289199;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
RDebugUtils.currentLine=10289200;
 //BA.debugLineNum = 10289200;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub IsMediaStillRelevant (Media As SMMedia";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Return Media.Meta.Permanent Or (Media.MediaState";
if (true) return _media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Permanent /*boolean*/  || (_media.MediaState /*int*/ ==__ref._state_loading /*int*/  && _media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._getsize /*int*/ (null)>0) || (_media.MediaState /*int*/ !=__ref._state_loading /*int*/  && _media.UsedBy /*b4a.DesaWisataSaribu.b4xset*/ ._getsize /*int*/ (null)>0);
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Dim MediaType As Int = Media.Meta.MediaType";
_mediatype = _media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ;
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="If MediaType = ViewsManager.MEDIA_TYPE_IMAGE Then";
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
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="Dim SkipRegularImageLoading As Boolean 'ignore";
_skipregularimageloading = false;
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="If SkipRegularImageLoading = False Then";
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
RDebugUtils.currentLine=10354699;
 //BA.debugLineNum = 10354699;BA.debugLine="If FromFile Then";
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
RDebugUtils.currentLine=10354700;
 //BA.debugLineNum = 10354700;BA.debugLine="Wait For (ImagesLoader.LoadFromFile(Dir, FileN";
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
RDebugUtils.currentLine=10354702;
 //BA.debugLineNum = 10354702;BA.debugLine="Wait For (ImagesLoader.LoadFromHttpJob(job, Ma";
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
RDebugUtils.currentLine=10354704;
 //BA.debugLineNum = 10354704;BA.debugLine="Media.Media = IIf(bmp.IsInitialized, bmp, Null)";
_media.Media /*Object*/  = ((_bmp.IsInitialized()) ? ((Object)(_bmp.getObject())) : (parent.__c.Null));
 if (true) break;
;
RDebugUtils.currentLine=10354706;
 //BA.debugLineNum = 10354706;BA.debugLine="If (xui.IsB4A Or xui.IsB4J) And Media.Meta.Mime";

case 13:
//if
this.state = 16;
if ((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) && (_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Mime /*String*/ ).equals("image/jpeg") && _media.Media /*Object*/ != null) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=10354707;
 //BA.debugLineNum = 10354707;BA.debugLine="PreprocessExif(Media, IIf(FromFile, File.OpenIn";
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
RDebugUtils.currentLine=10354710;
 //BA.debugLineNum = 10354710;BA.debugLine="Dim in As InputStream = IIf(FromFile, File.OpenI";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(((_fromfile) ? ((Object)(parent.__c.File.OpenInput(_dir,_filename).getObject())) : ((Object)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject())))));
RDebugUtils.currentLine=10354711;
 //BA.debugLineNum = 10354711;BA.debugLine="Select MediaType";
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
RDebugUtils.currentLine=10354713;
 //BA.debugLineNum = 10354713;BA.debugLine="Media.Media = Bit.InputStreamToBytes(in)";
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
RDebugUtils.currentLine=10354732;
 //BA.debugLineNum = 10354732;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=10354733;
 //BA.debugLineNum = 10354733;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub MediaIsReady (Media As SMMedia)";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="CancelDisconnectedTargets(Media)";
__ref._canceldisconnectedtargets /*String*/ (null,_media);
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="For Each req As SMMediaRequestSet In Media.Waitin";
{
final anywheresoftware.b4a.BA.IterableList group2 = _media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_req = (b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset)(group2.Get(index2));
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="req.RequestState = Media.MediaState";
_req.RequestState /*int*/  = _media.MediaState /*int*/ ;
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="If Media.MediaState = STATE_READY Then";
if (_media.MediaState /*int*/ ==__ref._state_ready /*int*/ ) { 
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="Media.UsedBy.Add(req)";
_media.UsedBy /*b4a.DesaWisataSaribu.b4xset*/ ._add /*String*/ (null,(Object)(_req));
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="ViewsManager.AddMedia(req, Media, GetRequestFro";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._addmedia /*void*/ (null,_req,_media,__ref._getrequestfromrequestset /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,_req));
 }else 
{RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="Else if Media.MediaState = STATE_ERROR Then";
if (_media.MediaState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="ViewsManager.AddMedia(req, MediaCache.Get(req.E";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._addmedia /*void*/ (null,_req,(b4a.DesaWisataSaribu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_req.Error /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ ))),__ref._getrequestfromrequestset /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ (null,_req));
 }else {
RDebugUtils.currentLine=10485770;
 //BA.debugLineNum = 10485770;BA.debugLine="Log(\"MediaIsReady Unexpected state!\")";
__c.LogImpl("910485770","MediaIsReady Unexpected state!",0);
 }}
;
 }
};
RDebugUtils.currentLine=10485773;
 //BA.debugLineNum = 10485773;BA.debugLine="Media.WaitingRequestsSets.Clear";
_media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=10485774;
 //BA.debugLineNum = 10485774;BA.debugLine="If Media.MediaState = STATE_ERROR Then";
if (_media.MediaState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=10485778;
 //BA.debugLineNum = 10485778;BA.debugLine="MediaCache.Remove(Media.Meta.Key)";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Key /*String*/ ));
 };
RDebugUtils.currentLine=10485780;
 //BA.debugLineNum = 10485780;BA.debugLine="End Sub";
return "";
}
public long  _getmaximagefilesize(b4a.DesaWisataSaribu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "getmaximagefilesize", true))
	 {return ((Long) Debug.delegate(ba, "getmaximagefilesize", null));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub getMaxImageFileSize As Long";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Return ImagesLoader.MaxFileSize";
if (true) return __ref._imagesloader /*b4a.DesaWisataSaribu.bitmapsasync*/ ._maxfilesize /*long*/ ;
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="End Sub";
return 0L;
}
public int  _getmediacachesize(b4a.DesaWisataSaribu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "getmediacachesize", true))
	 {return ((Integer) Debug.delegate(ba, "getmediacachesize", null));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub getMediaCacheSize As Int";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Return MediaCache.Size";
if (true) return __ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="End Sub";
return 0;
}
public b4a.DesaWisataSaribu.simplemediamanager._smmediarequest  _getrequestfromrequestset(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _rs) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "getrequestfromrequestset", true))
	 {return ((b4a.DesaWisataSaribu.simplemediamanager._smmediarequest) Debug.delegate(ba, "getrequestfromrequestset", new Object[] {_rs}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub GetRequestFromRequestSet(rs As SMMedia";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="If rs.RequestState = STATE_LOADING Then";
if (_rs.RequestState /*int*/ ==__ref._state_loading /*int*/ ) { 
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="Return rs.Loading";
if (true) return _rs.Loading /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ ;
 }else 
{RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="Else If rs.RequestState = STATE_ERROR Then";
if (_rs.RequestState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="Return rs.Error";
if (true) return _rs.Error /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ ;
 }else {
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="Return rs.MainMedia";
if (true) return _rs.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ ;
 }}
;
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="End Sub";
return null;
}
public boolean  _iswebpanimated(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "iswebpanimated", true))
	 {return ((Boolean) Debug.delegate(ba, "iswebpanimated", new Object[] {_media}));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Public Sub IsWebPAnimated(Media As SMMedia) As Boo";
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Return B4ASdkVersion >= 28 And Media.Meta.MediaTy";
if (true) return __ref._b4asdkversion /*int*/ >=28 && _media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ==__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_webp /*int*/ ;
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub MetaIsReady (Meta As SMMediaMeta)";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="For Each RequestSet As SMMediaRequestSet In Meta.";
{
final anywheresoftware.b4a.BA.IterableList group1 = _meta.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_requestset = (b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset)(group1.Get(index1));
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="If MediaCache.ContainsKey(Meta.Key) Then";
if (__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_meta.Key /*String*/ ))) { 
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="Dim Media As SMMedia = MediaCache.Get(Meta.Key)";
_media = (b4a.DesaWisataSaribu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_meta.Key /*String*/ )));
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="MediaCache.Remove(Meta.Key)";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_meta.Key /*String*/ ));
RDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="MediaCache.Put(Meta.Key, Media)";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_meta.Key /*String*/ ),(Object)(_media));
RDebugUtils.currentLine=10223626;
 //BA.debugLineNum = 10223626;BA.debugLine="Media.WaitingRequestsSets.Add(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=10223627;
 //BA.debugLineNum = 10223627;BA.debugLine="If Media.MediaState <> STATE_LOADING Then";
if (_media.MediaState /*int*/ !=__ref._state_loading /*int*/ ) { 
RDebugUtils.currentLine=10223628;
 //BA.debugLineNum = 10223628;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
 };
 }else {
RDebugUtils.currentLine=10223631;
 //BA.debugLineNum = 10223631;BA.debugLine="Media = CreateSMMedia(Null, Meta, IIf(Meta.Meta";
_media = __ref._createsmmedia /*b4a.DesaWisataSaribu.simplemediamanager._smmedia*/ (null,__c.Null,_meta,(int)(BA.ObjectToNumber(((_meta.MetaState /*int*/ ==__ref._state_ready /*int*/ ) ? ((Object)(__ref._state_loading /*int*/ )) : ((Object)(__ref._state_error /*int*/ ))))));
RDebugUtils.currentLine=10223632;
 //BA.debugLineNum = 10223632;BA.debugLine="Media.WaitingRequestsSets.Add(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=10223633;
 //BA.debugLineNum = 10223633;BA.debugLine="MediaCache.Put(Media.Meta.Key, Media)";
__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Key /*String*/ ),(Object)(_media));
RDebugUtils.currentLine=10223634;
 //BA.debugLineNum = 10223634;BA.debugLine="TrimMediaCacheImpl";
__ref._trimmediacacheimpl /*String*/ (null);
RDebugUtils.currentLine=10223635;
 //BA.debugLineNum = 10223635;BA.debugLine="If Media.MediaState = STATE_ERROR Then";
if (_media.MediaState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=10223636;
 //BA.debugLineNum = 10223636;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
 }else {
RDebugUtils.currentLine=10223638;
 //BA.debugLineNum = 10223638;BA.debugLine="Dim MediaType As Int = Media.Meta.MediaType";
_mediatype = _media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ;
RDebugUtils.currentLine=10223639;
 //BA.debugLineNum = 10223639;BA.debugLine="Select MediaType";
switch (BA.switchObjectToInt(_mediatype,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_gif /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_image /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_webp /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_video /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_html /*int*/ ,__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_none /*int*/ )) {
case 0: 
case 1: 
case 2: {
RDebugUtils.currentLine=10223641;
 //BA.debugLineNum = 10223641;BA.debugLine="DownloadImageMedia(Media, RequestSet.MainMed";
__ref._downloadimagemedia /*void*/ (null,_media,_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ );
 break; }
case 3: 
case 4: {
RDebugUtils.currentLine=10223643;
 //BA.debugLineNum = 10223643;BA.debugLine="Media.MediaState = STATE_READY";
_media.MediaState /*int*/  = __ref._state_ready /*int*/ ;
RDebugUtils.currentLine=10223644;
 //BA.debugLineNum = 10223644;BA.debugLine="Media.Media = Meta.FirstUrl";
_media.Media /*Object*/  = (Object)(_meta.FirstUrl /*String*/ );
RDebugUtils.currentLine=10223645;
 //BA.debugLineNum = 10223645;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
 break; }
case 5: {
RDebugUtils.currentLine=10223647;
 //BA.debugLineNum = 10223647;BA.debugLine="Log(\"Unexpected mime: \" & Media.Meta.Mime)";
__c.LogImpl("910223647","Unexpected mime: "+_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Mime /*String*/ ,0);
RDebugUtils.currentLine=10223648;
 //BA.debugLineNum = 10223648;BA.debugLine="Media.MediaState = STATE_ERROR";
_media.MediaState /*int*/  = __ref._state_error /*int*/ ;
RDebugUtils.currentLine=10223649;
 //BA.debugLineNum = 10223649;BA.debugLine="MediaIsReady(Media)";
__ref._mediaisready /*String*/ (null,_media);
 break; }
}
;
 };
 };
 }
};
RDebugUtils.currentLine=10223654;
 //BA.debugLineNum = 10223654;BA.debugLine="Meta.WaitingRequestsSets.Clear";
_meta.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=10223655;
 //BA.debugLineNum = 10223655;BA.debugLine="If Meta.MetaState = STATE_ERROR Then";
if (_meta.MetaState /*int*/ ==__ref._state_error /*int*/ ) { 
RDebugUtils.currentLine=10223659;
 //BA.debugLineNum = 10223659;BA.debugLine="MetaCache.Remove(Meta)";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_meta));
 };
RDebugUtils.currentLine=10223661;
 //BA.debugLineNum = 10223661;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub TrimMediaCacheImpl";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="If DateTime.Now > LastTrimCache + MinTimeBetweenT";
if (__c.DateTime.getNow()>__ref._lasttrimcache /*long*/ +__ref._mintimebetweentrims /*long*/ ) { 
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="Dim OnlyLookForDisconnectedTargets As Boolean =";
_onlylookfordisconnectedtargets = __ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getsize /*int*/ (null)<__ref._maxmediacachesize /*int*/ ;
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="LastTrimCache = DateTime.Now";
__ref._lasttrimcache /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="Do While i < MediaCache.Size";
while (_i<__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getsize /*int*/ (null)) {
RDebugUtils.currentLine=10813449;
 //BA.debugLineNum = 10813449;BA.debugLine="Dim Media As SMMedia = MediaCache.Get(MediaCach";
_media = (b4a.DesaWisataSaribu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Get(_i)));
RDebugUtils.currentLine=10813450;
 //BA.debugLineNum = 10813450;BA.debugLine="CancelDisconnectedTargets(Media)";
__ref._canceldisconnectedtargets /*String*/ (null,_media);
RDebugUtils.currentLine=10813451;
 //BA.debugLineNum = 10813451;BA.debugLine="If OnlyLookForDisconnectedTargets = False And M";
if (_onlylookfordisconnectedtargets==__c.False && __ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getsize /*int*/ (null)>__ref._maxmediacachesize /*int*/ /(double)2 && __ref._ismediastillrelevant /*boolean*/ (null,_media)==__c.False) { 
RDebugUtils.currentLine=10813452;
 //BA.debugLineNum = 10813452;BA.debugLine="DeleteMedia(Media)";
__ref._deletemedia /*String*/ (null,_media);
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 };
RDebugUtils.currentLine=10813455;
 //BA.debugLineNum = 10813455;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
 };
RDebugUtils.currentLine=10813458;
 //BA.debugLineNum = 10813458;BA.debugLine="End Sub";
return "";
}
public String  _preprocessexif(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmedia _media,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "preprocessexif", true))
	 {return ((String) Debug.delegate(ba, "preprocessexif", new Object[] {_media,_in}));}
anywheresoftware.b4j.object.JavaObject _exifinterface = null;
int _orientation = 0;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Public Sub PreprocessExif (Media As SMMedia, In As";
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="If Media.Meta.Mime <> \"image/jpeg\" Then";
if ((_media.Meta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ .Mime /*String*/ ).equals("image/jpeg") == false) { 
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="Log(\"image/jpeg mime expected!\")";
__c.LogImpl("911730949","image/jpeg mime expected!",0);
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="In.Close";
_in.Close();
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11730954;
 //BA.debugLineNum = 11730954;BA.debugLine="If B4ASdkVersion >= 24 Then";
if (__ref._b4asdkversion /*int*/ >=24) { 
RDebugUtils.currentLine=11730955;
 //BA.debugLineNum = 11730955;BA.debugLine="Dim ExifInterface As JavaObject";
_exifinterface = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=11730956;
 //BA.debugLineNum = 11730956;BA.debugLine="ExifInterface.InitializeNewInstance(\"android.med";
_exifinterface.InitializeNewInstance("android.media.ExifInterface",new Object[]{(Object)(_in.getObject())});
RDebugUtils.currentLine=11730957;
 //BA.debugLineNum = 11730957;BA.debugLine="Dim orientation As Int = ExifInterface.RunMethod";
_orientation = (int)(BA.ObjectToNumber(_exifinterface.RunMethod("getAttribute",new Object[]{(Object)("Orientation")})));
RDebugUtils.currentLine=11730958;
 //BA.debugLineNum = 11730958;BA.debugLine="Media.Media = RotateBitmapBasedOnOrientation(Med";
_media.Media /*Object*/  = (Object)(__ref._rotatebitmapbasedonorientation /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_media.Media /*Object*/ )),_orientation).getObject());
 };
RDebugUtils.currentLine=11730960;
 //BA.debugLineNum = 11730960;BA.debugLine="In.Close";
_in.Close();
RDebugUtils.currentLine=11730980;
 //BA.debugLineNum = 11730980;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _rotatebitmapbasedonorientation(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _orientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "rotatebitmapbasedonorientation", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "rotatebitmapbasedonorientation", new Object[] {_bmp,_orientation}));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub RotateBitmapBasedOnOrientation (bmp As";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Select orientation";
switch (_orientation) {
case 3: {
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="bmp = bmp.Rotate(180)";
_bmp = _bmp.Rotate((int) (180));
 break; }
case 6: {
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="bmp = bmp.Rotate(90)";
_bmp = _bmp.Rotate((int) (90));
 break; }
case 8: {
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="bmp = bmp.Rotate(270)";
_bmp = _bmp.Rotate((int) (270));
 break; }
}
;
RDebugUtils.currentLine=11796489;
 //BA.debugLineNum = 11796489;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=11796490;
 //BA.debugLineNum = 11796490;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="ClearMedia(RequestSet.Target)";
__ref._clearmedia /*String*/ (null,_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="ViewsRequestSet.Put(RequestSet.Target, RequestSet";
__ref._viewsrequestset /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_requestset));
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="Dim media As SMMedia = MediaCache.Get(RequestSet.";
_media = (b4a.DesaWisataSaribu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
RDebugUtils.currentLine=10092553;
 //BA.debugLineNum = 10092553;BA.debugLine="If media <> Null And media.MediaState = STATE_REA";
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
RDebugUtils.currentLine=10092554;
 //BA.debugLineNum = 10092554;BA.debugLine="media.WaitingRequestsSets.Add(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=10092555;
 //BA.debugLineNum = 10092555;BA.debugLine="MediaIsReady(media)";
__ref._mediaisready /*String*/ (null,_media);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=10092557;
 //BA.debugLineNum = 10092557;BA.debugLine="If media <> Null And media.MediaState = STATE_ER";
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
RDebugUtils.currentLine=10092558;
 //BA.debugLineNum = 10092558;BA.debugLine="Log(\"Unexpected state:  media.MediaState = STAT";
parent.__c.LogImpl("910092558","Unexpected state:  media.MediaState = STATE_ERROR",0);
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=10092560;
 //BA.debugLineNum = 10092560;BA.debugLine="RequestSet.RequestState = STATE_LOADING";
_requestset.RequestState /*int*/  = __ref._state_loading /*int*/ ;
RDebugUtils.currentLine=10092561;
 //BA.debugLineNum = 10092561;BA.debugLine="ViewsManager.AddMedia(RequestSet, MediaCache.Get";
__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._addmedia /*void*/ (null,_requestset,(b4a.DesaWisataSaribu.simplemediamanager._smmedia)(__ref._mediacache /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_requestset.Loading /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ ))),_requestset.Loading /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ );
RDebugUtils.currentLine=10092562;
 //BA.debugLineNum = 10092562;BA.debugLine="If MetaCache.ContainsKey(RequestSet.MainMedia.Ke";
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
RDebugUtils.currentLine=10092563;
 //BA.debugLineNum = 10092563;BA.debugLine="Dim meta As SMMediaMeta = MetaCache.Get(Request";
_meta = (b4a.DesaWisataSaribu.simplemediamanager._smmediameta)(__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
RDebugUtils.currentLine=10092564;
 //BA.debugLineNum = 10092564;BA.debugLine="meta.WaitingRequestsSets.Add(RequestSet)";
_meta.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=10092565;
 //BA.debugLineNum = 10092565;BA.debugLine="If meta.MetaState <> STATE_LOADING Then";
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
RDebugUtils.currentLine=10092566;
 //BA.debugLineNum = 10092566;BA.debugLine="MetaIsReady(meta)";
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
RDebugUtils.currentLine=10092569;
 //BA.debugLineNum = 10092569;BA.debugLine="meta = CreateSMMediaMeta(RequestSet.MainMedia.M";
_meta = __ref._createsmmediameta /*b4a.DesaWisataSaribu.simplemediamanager._smmediameta*/ (null,_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Mime /*String*/ ,_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Key /*String*/ ,(int)(BA.ObjectToNumber((((_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Mime /*String*/ ).equals(__ref._mime_unknown /*String*/ )) ? ((Object)(__ref._state_loading /*int*/ )) : ((Object)(__ref._state_ready /*int*/ ))))),parent.__c.False);
RDebugUtils.currentLine=10092570;
 //BA.debugLineNum = 10092570;BA.debugLine="meta.FirstUrl = RequestSet.MainMedia.Url";
_meta.FirstUrl /*String*/  = _requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Url /*String*/ ;
RDebugUtils.currentLine=10092571;
 //BA.debugLineNum = 10092571;BA.debugLine="meta.WaitingRequestsSets.Add(RequestSet)";
_meta.WaitingRequestsSets /*b4a.DesaWisataSaribu.b4xset*/ ._add /*String*/ (null,(Object)(_requestset));
RDebugUtils.currentLine=10092572;
 //BA.debugLineNum = 10092572;BA.debugLine="meta.Dir = RequestSet.MainMedia.Extra.GetDefaul";
_meta.Dir /*String*/  = BA.ObjectToString(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._request_dir /*String*/ ),(Object)("")));
RDebugUtils.currentLine=10092573;
 //BA.debugLineNum = 10092573;BA.debugLine="meta.FileName = RequestSet.MainMedia.Extra.GetD";
_meta.FileName /*String*/  = BA.ObjectToString(_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._request_file /*String*/ ),(Object)("")));
RDebugUtils.currentLine=10092574;
 //BA.debugLineNum = 10092574;BA.debugLine="MetaCache.Put(meta.Key, meta)";
__ref._metacache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_meta.Key /*String*/ ),(Object)(_meta));
RDebugUtils.currentLine=10092575;
 //BA.debugLineNum = 10092575;BA.debugLine="If meta.MetaState = STATE_LOADING Then";
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
RDebugUtils.currentLine=10092576;
 //BA.debugLineNum = 10092576;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSaribu.httpjob();
RDebugUtils.currentLine=10092577;
 //BA.debugLineNum = 10092577;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=10092578;
 //BA.debugLineNum = 10092578;BA.debugLine="job.Head(RequestSet.MainMedia.Url)";
_job._head /*String*/ (null,_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ .Url /*String*/ );
RDebugUtils.currentLine=10092579;
 //BA.debugLineNum = 10092579;BA.debugLine="job.GetRequest.Timeout = DefaultRequestTimeout";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._defaultrequesttimeout /*int*/ );
RDebugUtils.currentLine=10092580;
 //BA.debugLineNum = 10092580;BA.debugLine="AddHeadersToJob(job, RequestSet.MainMedia)";
__ref._addheaderstojob /*String*/ (null,_job,_requestset.MainMedia /*b4a.DesaWisataSaribu.simplemediamanager._smmediarequest*/ );
RDebugUtils.currentLine=10092581;
 //BA.debugLineNum = 10092581;BA.debugLine="meta.Job = job";
_meta.Job /*b4a.DesaWisataSaribu.httpjob*/  = _job;
RDebugUtils.currentLine=10092582;
 //BA.debugLineNum = 10092582;BA.debugLine="Wait For (job) JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "simplemediamanager", "registerformeta"), (Object)(_job));
this.state = 31;
return;
case 31:
//C
this.state = 22;
_job = (b4a.DesaWisataSaribu.httpjob) result[1];
;
RDebugUtils.currentLine=10092583;
 //BA.debugLineNum = 10092583;BA.debugLine="meta.Job = JobEmpty";
_meta.Job /*b4a.DesaWisataSaribu.httpjob*/  = __ref._jobempty /*b4a.DesaWisataSaribu.httpjob*/ ;
RDebugUtils.currentLine=10092584;
 //BA.debugLineNum = 10092584;BA.debugLine="If job.Success Then";
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
RDebugUtils.currentLine=10092585;
 //BA.debugLineNum = 10092585;BA.debugLine="Dim o As Object = job.Response.ContentType";
_o = (Object)(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getContentType());
RDebugUtils.currentLine=10092586;
 //BA.debugLineNum = 10092586;BA.debugLine="meta.Mime = IIf(o = Null, \"\", o).As(String)";
_meta.Mime /*String*/  = (((_o== null) ? ("") : (BA.ObjectToString(_o))));
RDebugUtils.currentLine=10092587;
 //BA.debugLineNum = 10092587;BA.debugLine="meta.MediaType = ViewsManager.MimeToMediaType";
_meta.MediaType /*int*/  = __ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._mimetomediatype /*int*/ (null,_meta.Mime /*String*/ );
RDebugUtils.currentLine=10092588;
 //BA.debugLineNum = 10092588;BA.debugLine="meta.MetaState = STATE_READY";
_meta.MetaState /*int*/  = __ref._state_ready /*int*/ ;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=10092593;
 //BA.debugLineNum = 10092593;BA.debugLine="meta.MetaState = STATE_ERROR";
_meta.MetaState /*int*/  = __ref._state_error /*int*/ ;
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=10092595;
 //BA.debugLineNum = 10092595;BA.debugLine="job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=10092598;
 //BA.debugLineNum = 10092598;BA.debugLine="MetaIsReady(meta)";
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
RDebugUtils.currentLine=10092601;
 //BA.debugLineNum = 10092601;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub setMaxImageFileSize (s As Long)";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="ImagesLoader.MaxFileSize = s";
__ref._imagesloader /*b4a.DesaWisataSaribu.bitmapsasync*/ ._maxfilesize /*long*/  = _s;
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="End Sub";
return "";
}
public String  _setmediafromfile(b4a.DesaWisataSaribu.simplemediamanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target,String _dir,String _filename,String _mime,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmediafromfile", true))
	 {return ((String) Debug.delegate(ba, "setmediafromfile", new Object[] {_target,_dir,_filename,_mime,_extra}));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Public Sub SetMediaFromFile(Target As B4XView, Dir";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="If Extra = Null Or Extra.IsInitialized = False Th";
if (_extra== null || _extra.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Dim Extra As Map";
_extra = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="Extra.Initialize";
_extra.Initialize();
 };
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="Extra.Put(REQUEST_DIR, IIf(Dir = \"\", FileName, Di";
_extra.Put((Object)(__ref._request_dir /*String*/ ),(((_dir).equals("")) ? ((Object)(_filename)) : ((Object)(_dir))));
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="Extra.Put(REQUEST_FILE, IIf(Dir = \"\", \"\", FileNam";
_extra.Put((Object)(__ref._request_file /*String*/ ),(((_dir).equals("")) ? ((Object)("")) : ((Object)(_filename))));
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="If ViewsManager.MimeToMediaType(Mime) = ViewsMana";
if (__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._mimetomediatype /*int*/ (null,_mime)==__ref._viewsmanager /*b4a.DesaWisataSaribu.smmviews*/ ._media_type_none /*int*/ ) { 
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="Log(\"Invalid mime!\")";
__c.LogImpl("99961480","Invalid mime!",0);
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="SetMediaWithExtra(Target, xui.FileUri(Dir, FileNa";
__ref._setmediawithextra /*String*/ (null,_target,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .FileUri(_dir,_filename),_mime,_extra);
RDebugUtils.currentLine=9961484;
 //BA.debugLineNum = 9961484;BA.debugLine="End Sub";
return "";
}
public String  _setmediawithrequestset(b4a.DesaWisataSaribu.simplemediamanager __ref,b4a.DesaWisataSaribu.simplemediamanager._smmediarequestset _requestset) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "setmediawithrequestset", true))
	 {return ((String) Debug.delegate(ba, "setmediawithrequestset", new Object[] {_requestset}));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub SetMediaWithRequestSet (RequestSet As S";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="RegisterForMeta(RequestSet)";
__ref._registerformeta /*void*/ (null,_requestset);
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="End Sub";
return "";
}
public String  _trimmediacache(b4a.DesaWisataSaribu.simplemediamanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="simplemediamanager";
if (Debug.shouldDelegate(ba, "trimmediacache", true))
	 {return ((String) Debug.delegate(ba, "trimmediacache", null));}
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Public Sub TrimMediaCache";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="LastTrimCache = 0";
__ref._lasttrimcache /*long*/  = (long) (0);
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="TrimMediaCacheImpl";
__ref._trimmediacacheimpl /*String*/ (null);
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="End Sub";
return "";
}
}