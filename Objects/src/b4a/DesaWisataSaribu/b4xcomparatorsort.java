package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcomparatorsort extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSaribu.b4xcomparatorsort");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSaribu.b4xcomparatorsort.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public b4a.DesaWisataSaribu.core _core = null;
public b4a.DesaWisataSaribu.listpackage _listpackage = null;
public b4a.DesaWisataSaribu.cart _cart = null;
public b4a.DesaWisataSaribu.httputils2service _httputils2service = null;
public b4a.DesaWisataSaribu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSaribu.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4a.DesaWisataSaribu.b4xcomparatorsort __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.DesaWisataSaribu.b4xcomparatorsort __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="End Sub";
return "";
}
public int  _partition(b4a.DesaWisataSaribu.b4xcomparatorsort __ref,anywheresoftware.b4a.objects.collections.List _data,int _startindex,int _length,int _pivotindex,Object _comparator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "partition", true))
	 {return ((Integer) Debug.delegate(ba, "partition", new Object[] {_data,_startindex,_length,_pivotindex,_comparator}));}
Object _pivotvalue = null;
int _l = 0;
int _i = 0;
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub Partition(Data As List, StartIndex As";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Dim PivotValue As Object = Data.Get(StartIndex +";
_pivotvalue = _data.Get((int) (_startindex+_pivotindex));
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="Swap(Data, StartIndex, PivotIndex, Length - 1)";
__ref._swap /*String*/ (null,_data,_startindex,_pivotindex,(int) (_length-1));
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="Dim L As Int = 0";
_l = (int) (0);
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="For i = 0 To Length - 2";
{
final int step4 = 1;
final int limit4 = (int) (_length-2);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="If CallSub3(Comparator, \"Compare\", Data.Get(Star";
if (((int)(BA.ObjectToNumber(__c.CallSubDebug3(ba,_comparator,"Compare",_data.Get((int) (_startindex+_i)),_pivotvalue))))<0) { 
RDebugUtils.currentLine=18022406;
 //BA.debugLineNum = 18022406;BA.debugLine="L = L + 1";
_l = (int) (_l+1);
RDebugUtils.currentLine=18022407;
 //BA.debugLineNum = 18022407;BA.debugLine="Swap(Data, StartIndex, L - 1, i)";
__ref._swap /*String*/ (null,_data,_startindex,(int) (_l-1),_i);
 };
 }
};
RDebugUtils.currentLine=18022410;
 //BA.debugLineNum = 18022410;BA.debugLine="Swap(Data, StartIndex, Length - 1, L)";
__ref._swap /*String*/ (null,_data,_startindex,(int) (_length-1),_l);
RDebugUtils.currentLine=18022411;
 //BA.debugLineNum = 18022411;BA.debugLine="Return L";
if (true) return _l;
RDebugUtils.currentLine=18022412;
 //BA.debugLineNum = 18022412;BA.debugLine="End Sub";
return 0;
}
public String  _swap(b4a.DesaWisataSaribu.b4xcomparatorsort __ref,anywheresoftware.b4a.objects.collections.List _data,int _startindex,int _i1,int _i2) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "swap", true))
	 {return ((String) Debug.delegate(ba, "swap", new Object[] {_data,_startindex,_i1,_i2}));}
Object _o = null;
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Private Sub Swap (Data As List, StartIndex As Int,";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Dim o As Object = Data.Get(StartIndex + i1)";
_o = _data.Get((int) (_startindex+_i1));
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="Data.Set(StartIndex + i1, Data.Get(StartIndex + i";
_data.Set((int) (_startindex+_i1),_data.Get((int) (_startindex+_i2)));
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="Data.Set(StartIndex + i2, o)";
_data.Set((int) (_startindex+_i2),_o);
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="End Sub";
return "";
}
public String  _quicksort(b4a.DesaWisataSaribu.b4xcomparatorsort __ref,anywheresoftware.b4a.objects.collections.List _data,int _startindex,int _length,Object _comparator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "quicksort", true))
	 {return ((String) Debug.delegate(ba, "quicksort", new Object[] {_data,_startindex,_length,_comparator}));}
int _pivotindex = 0;
int _r = 0;
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Private Sub QuickSort (Data As List, StartIndex As";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="If Length > 1 Then";
if (_length>1) { 
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="Dim PivotIndex As Int = Rnd(0, Length)";
_pivotindex = __c.Rnd((int) (0),_length);
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="Dim r As Int = Partition(Data, StartIndex, Lengt";
_r = __ref._partition /*int*/ (null,_data,_startindex,_length,_pivotindex,_comparator);
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="QuickSort(Data, StartIndex, r, Comparator)";
__ref._quicksort /*String*/ (null,_data,_startindex,_r,_comparator);
RDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="QuickSort(Data, StartIndex + r + 1, Length - r -";
__ref._quicksort /*String*/ (null,_data,(int) (_startindex+_r+1),(int) (_length-_r-1),_comparator);
 };
RDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="End Sub";
return "";
}
public String  _sort(b4a.DesaWisataSaribu.b4xcomparatorsort __ref,anywheresoftware.b4a.objects.collections.List _data,Object _comparator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "sort", true))
	 {return ((String) Debug.delegate(ba, "sort", new Object[] {_data,_comparator}));}
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Public Sub Sort (Data As List, Comparator As Objec";
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="QuickSort(Data, 0, Data.Size, Comparator)";
__ref._quicksort /*String*/ (null,_data,(int) (0),_data.getSize(),_comparator);
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="End Sub";
return "";
}
}