package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcache extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSaribu.b4xcache");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSaribu.b4xcache.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xcacheitem{
public boolean IsInitialized;
public Object Value;
public long LastAccessedTime;
public String Key;
public boolean Eternal;
public void Initialize() {
IsInitialized = true;
Value = new Object();
LastAccessedTime = 0L;
Key = "";
Eternal = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.DesaWisataSaribu.b4xorderedmap _data = null;
public int _mmaxsize = 0;
public float _removethreshold = 0f;
public int _eternalcounts = 0;
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
public String  _class_globals(b4a.DesaWisataSaribu.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Type B4XCacheItem (Value As Object, LastAccessedT";
;
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="Private Data As B4XOrderedMap";
_data = new b4a.DesaWisataSaribu.b4xorderedmap();
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="Private mMaxSize As Int = 100";
_mmaxsize = (int) (100);
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="Private RemoveThreshold As Float = 0.3";
_removethreshold = (float) (0.3);
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="Private EternalCounts As Int";
_eternalcounts = 0;
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="End Sub";
return "";
}
public boolean  _containskey(b4a.DesaWisataSaribu.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "containskey", true))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Return Data.ContainsKey(Key)";
if (true) return __ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_key));
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="End Sub";
return false;
}
public b4a.DesaWisataSaribu.b4xcache._b4xcacheitem  _createb4xcacheitem(b4a.DesaWisataSaribu.b4xcache __ref,Object _value,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "createb4xcacheitem", true))
	 {return ((b4a.DesaWisataSaribu.b4xcache._b4xcacheitem) Debug.delegate(ba, "createb4xcacheitem", new Object[] {_value,_key}));}
b4a.DesaWisataSaribu.b4xcache._b4xcacheitem _t1 = null;
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Private Sub CreateB4XCacheItem (Value As Object, K";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="Dim t1 As B4XCacheItem";
_t1 = new b4a.DesaWisataSaribu.b4xcache._b4xcacheitem();
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="t1.Value = Value";
_t1.Value /*Object*/  = _value;
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="t1.LastAccessedTime = DateTime.Now";
_t1.LastAccessedTime /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="End Sub";
return null;
}
public Object  _get(b4a.DesaWisataSaribu.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
b4a.DesaWisataSaribu.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Public Sub Get (Key As String) As Object";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (b4a.DesaWisataSaribu.b4xcache._b4xcacheitem)(__ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_key)));
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="If ci <> Null Then";
if (_ci!= null) { 
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="If ci.Eternal = False Then ci.LastAccessedTime =";
if (_ci.Eternal /*boolean*/ ==__c.False) { 
_ci.LastAccessedTime /*long*/  = __c.DateTime.getNow();};
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="Return ci.Value";
if (true) return _ci.Value /*Object*/ ;
 };
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="End Sub";
return null;
}
public int  _getmaxsize(b4a.DesaWisataSaribu.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "getmaxsize", true))
	 {return ((Integer) Debug.delegate(ba, "getmaxsize", null));}
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Public Sub getMaxSize As Int";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Return mMaxSize";
if (true) return __ref._mmaxsize /*int*/ ;
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.DesaWisataSaribu.b4xcache __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Data.Initialize";
__ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="End Sub";
return "";
}
public boolean  _iseternal(b4a.DesaWisataSaribu.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "iseternal", true))
	 {return ((Boolean) Debug.delegate(ba, "iseternal", new Object[] {_key}));}
b4a.DesaWisataSaribu.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub IsEternal(Key As String) As Boolean";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (b4a.DesaWisataSaribu.b4xcache._b4xcacheitem)(__ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_key)));
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Return IIf(ci = Null, False, ci.Eternal)";
if (true) return BA.ObjectToBoolean(((_ci== null) ? ((Object)(__c.False)) : ((Object)(_ci.Eternal /*boolean*/ ))));
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _keys(b4a.DesaWisataSaribu.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "keys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "keys", null));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Public Sub Keys As List";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Return Data.Keys";
if (true) return __ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="End Sub";
return null;
}
public Object  _put(b4a.DesaWisataSaribu.b4xcache __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "put", true))
	 {return ((Object) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Public Sub Put (Key As String, Value As Object) As";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="Data.Put(Key, CreateB4XCacheItem(Value, Key))";
__ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_key),(Object)(__ref._createb4xcacheitem /*b4a.DesaWisataSaribu.b4xcache._b4xcacheitem*/ (null,_value,_key)));
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="TrimIfOversize";
__ref._trimifoversize /*String*/ (null);
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="End Sub";
return null;
}
public String  _trimifoversize(b4a.DesaWisataSaribu.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "trimifoversize", true))
	 {return ((String) Debug.delegate(ba, "trimifoversize", null));}
anywheresoftware.b4a.objects.collections.List _values = null;
int _numberofitemstoremove = 0;
int _i = 0;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub TrimIfOversize";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="If Data.Size - EternalCounts > mMaxSize Then";
if (__ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getsize /*int*/ (null)-__ref._eternalcounts /*int*/ >__ref._mmaxsize /*int*/ ) { 
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="Dim values As List = Data.Values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = __ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="values.SortType(\"LastAccessedTime\", True)";
_values.SortType("LastAccessedTime",__c.True);
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="Dim NumberOfItemsToRemove As Int = Ceil(mMaxSize";
_numberofitemstoremove = (int) (__c.Ceil(__ref._mmaxsize /*int*/ *__ref._removethreshold /*float*/ ));
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="For i = 0 To NumberOfItemsToRemove";
{
final int step5 = 1;
final int limit5 = _numberofitemstoremove;
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="Data.Remove(values.Get(i).As(B4XCacheItem).Key)";
__ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(((b4a.DesaWisataSaribu.b4xcache._b4xcacheitem)(_values.Get(_i))).Key /*String*/ ));
 }
};
 };
RDebugUtils.currentLine=15269897;
 //BA.debugLineNum = 15269897;BA.debugLine="End Sub";
return "";
}
public Object  _puteternal(b4a.DesaWisataSaribu.b4xcache __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "puteternal", true))
	 {return ((Object) Debug.delegate(ba, "puteternal", new Object[] {_key,_value}));}
b4a.DesaWisataSaribu.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Public Sub PutEternal (Key As String, Value As Obj";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="Dim ci As B4XCacheItem = CreateB4XCacheItem(Value";
_ci = __ref._createb4xcacheitem /*b4a.DesaWisataSaribu.b4xcache._b4xcacheitem*/ (null,_value,_key);
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="ci.Eternal = True";
_ci.Eternal /*boolean*/  = __c.True;
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="ci.LastAccessedTime = 9223372036854775807";
_ci.LastAccessedTime /*long*/  = (long) (9223372036854775807L);
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="EternalCounts = EternalCounts + 1";
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ +1);
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="Data.Put(Key, ci)";
__ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_key),(Object)(_ci));
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=15007752;
 //BA.debugLineNum = 15007752;BA.debugLine="End Sub";
return null;
}
public String  _remove(b4a.DesaWisataSaribu.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Public Sub Remove (Key As String)";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="Data.Remove(Key)";
__ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_key));
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="End Sub";
return "";
}
public String  _removeolditems(b4a.DesaWisataSaribu.b4xcache __ref,long _agems) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "removeolditems", true))
	 {return ((String) Debug.delegate(ba, "removeolditems", new Object[] {_agems}));}
anywheresoftware.b4a.objects.collections.List _values = null;
long _level = 0L;
b4a.DesaWisataSaribu.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Public Sub RemoveOldItems (AgeMs As Long)";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="Dim values As List = Data.Values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = __ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="Dim level As Long = DateTime.Now - AgeMs";
_level = (long) (__c.DateTime.getNow()-_agems);
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="For Each ci As B4XCacheItem In values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _values;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_ci = (b4a.DesaWisataSaribu.b4xcache._b4xcacheitem)(group3.Get(index3));
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="If ci.LastAccessedTime <= level Then";
if (_ci.LastAccessedTime /*long*/ <=_level) { 
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="Data.Remove(ci.Key)";
__ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_ci.Key /*String*/ ));
 };
 }
};
RDebugUtils.currentLine=15335432;
 //BA.debugLineNum = 15335432;BA.debugLine="End Sub";
return "";
}
public String  _setmaxsize(b4a.DesaWisataSaribu.b4xcache __ref,int _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "setmaxsize", true))
	 {return ((String) Debug.delegate(ba, "setmaxsize", new Object[] {_s}));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub setMaxSize(s As Int)";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="mMaxSize = s";
__ref._mmaxsize /*int*/  = _s;
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="TrimIfOversize";
__ref._trimifoversize /*String*/ (null);
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="End Sub";
return "";
}
public int  _size(b4a.DesaWisataSaribu.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "size", true))
	 {return ((Integer) Debug.delegate(ba, "size", null));}
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Public Sub Size As Int";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Return Data.Size";
if (true) return __ref._data /*b4a.DesaWisataSaribu.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="End Sub";
return 0;
}
}