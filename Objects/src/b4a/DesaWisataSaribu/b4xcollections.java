package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcollections {
private static b4xcollections mostCurrent = new b4xcollections();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
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
public b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
public static b4a.DesaWisataSaribu.b4xbitset  _createbitset(anywheresoftware.b4a.BA _ba,int _size) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createbitset", true))
	 {return ((b4a.DesaWisataSaribu.b4xbitset) Debug.delegate(null, "createbitset", new Object[] {_ba,_size}));}
b4a.DesaWisataSaribu.b4xbitset _s = null;
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="Dim s As B4XBitSet";
_s = new b4a.DesaWisataSaribu.b4xbitset();
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="s.Initialize(Size)";
_s._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_size);
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="End Sub";
return null;
}
public static b4a.DesaWisataSaribu.b4xorderedmap  _createorderedmap(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createorderedmap", true))
	 {return ((b4a.DesaWisataSaribu.b4xorderedmap) Debug.delegate(null, "createorderedmap", new Object[] {_ba}));}
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return _createorderedmap2(_ba,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="End Sub";
return null;
}
public static b4a.DesaWisataSaribu.b4xorderedmap  _createorderedmap2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createorderedmap2", true))
	 {return ((b4a.DesaWisataSaribu.b4xorderedmap) Debug.delegate(null, "createorderedmap2", new Object[] {_ba,_keys,_values}));}
b4a.DesaWisataSaribu.b4xorderedmap _m = null;
int _i = 0;
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="Dim m As B4XOrderedMap";
_m = new b4a.DesaWisataSaribu.b4xorderedmap();
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="m.Initialize";
_m._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= null && _values!= null && _keys.IsInitialized() && _values.IsInitialized()) { 
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=15859717;
 //BA.debugLineNum = 15859717;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
_m._put /*String*/ (null,_keys.Get(_i),_values.Get(_i));
 }
};
 };
RDebugUtils.currentLine=15859720;
 //BA.debugLineNum = 15859720;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=15859721;
 //BA.debugLineNum = 15859721;BA.debugLine="End Sub";
return null;
}
public static b4a.DesaWisataSaribu.b4xset  _createset(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createset", true))
	 {return ((b4a.DesaWisataSaribu.b4xset) Debug.delegate(null, "createset", new Object[] {_ba}));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Public Sub CreateSet As B4XSet";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Return CreateSet2(Null)";
if (true) return _createset2(_ba,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="End Sub";
return null;
}
public static b4a.DesaWisataSaribu.b4xset  _createset2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createset2", true))
	 {return ((b4a.DesaWisataSaribu.b4xset) Debug.delegate(null, "createset2", new Object[] {_ba,_values}));}
b4a.DesaWisataSaribu.b4xset _s = null;
Object _v = null;
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Dim s As B4XSet";
_s = new b4a.DesaWisataSaribu.b4xset();
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="s.Initialize";
_s._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= null && _values.IsInitialized()) { 
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="For Each v As Object In Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _values;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = group4.Get(index4);
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="s.Add(v)";
_s._add /*String*/ (null,_v);
 }
};
 };
RDebugUtils.currentLine=15728648;
 //BA.debugLineNum = 15728648;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=15728649;
 //BA.debugLineNum = 15728649;BA.debugLine="End Sub";
return null;
}
}