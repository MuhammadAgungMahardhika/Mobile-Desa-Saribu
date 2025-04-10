package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xbreadcrumb extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSaribu.b4xbreadcrumb");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSaribu.b4xbreadcrumb.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.collections.List _mitems = null;
public anywheresoftware.b4a.objects.collections.List _rightpositions = null;
public int _textcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
public int _offset = 0;
public b4a.example.bitmapcreator _bc = null;
public int _crumbcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public int _presseditem = 0;
public Object _tag = null;
public boolean _mhaptic = false;
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
public String  _base_resize(b4a.DesaWisataSaribu.b4xbreadcrumb __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.DesaWisataSaribu.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
b4a.example.bitmapcreator._argbcolor _bcolor = null;
int _strokecolor = 0;
int[] _clrs = null;
int _left = 0;
int _i = 0;
int _sc = 0;
int _width = 0;
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Private Sub Draw";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
__ref._bc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._crumbcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="bcolor.r = Min(255, bcolor.r * 2)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*2));
RDebugUtils.currentLine=19464197;
 //BA.debugLineNum = 19464197;BA.debugLine="bcolor.g = Min(255, bcolor.g * 2)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*2));
RDebugUtils.currentLine=19464198;
 //BA.debugLineNum = 19464198;BA.debugLine="bcolor.b = Min(255, bcolor.b * 2)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*2));
RDebugUtils.currentLine=19464199;
 //BA.debugLineNum = 19464199;BA.debugLine="Dim strokeColor As Int = bc.ARGBToColor(bcolor)";
_strokecolor = __ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor);
RDebugUtils.currentLine=19464201;
 //BA.debugLineNum = 19464201;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
__ref._bc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._crumbcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=19464202;
 //BA.debugLineNum = 19464202;BA.debugLine="bcolor.r = bcolor.r * 0.8";
_bcolor.r = (int) (_bcolor.r*0.8);
RDebugUtils.currentLine=19464203;
 //BA.debugLineNum = 19464203;BA.debugLine="bcolor.g = bcolor.g * 0.8";
_bcolor.g = (int) (_bcolor.g*0.8);
RDebugUtils.currentLine=19464204;
 //BA.debugLineNum = 19464204;BA.debugLine="bcolor.b = bcolor.b * 0.8";
_bcolor.b = (int) (_bcolor.b*0.8);
RDebugUtils.currentLine=19464205;
 //BA.debugLineNum = 19464205;BA.debugLine="Dim Clrs() As Int = Array As Int(CrumbColor, bc.A";
_clrs = new int[]{__ref._crumbcolor /*int*/ ,__ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor)};
RDebugUtils.currentLine=19464207;
 //BA.debugLineNum = 19464207;BA.debugLine="RightPositions.Clear";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=19464208;
 //BA.debugLineNum = 19464208;BA.debugLine="If mItems.Size = 0 Then Return";
if (__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=19464209;
 //BA.debugLineNum = 19464209;BA.debugLine="Dim Left As Int = 0";
_left = (int) (0);
RDebugUtils.currentLine=19464210;
 //BA.debugLineNum = 19464210;BA.debugLine="For i = 0 To mItems.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=19464211;
 //BA.debugLineNum = 19464211;BA.debugLine="Dim sc As Int";
_sc = 0;
RDebugUtils.currentLine=19464212;
 //BA.debugLineNum = 19464212;BA.debugLine="If PressedItem = i Then sc = strokeColor Else sc";
if (__ref._presseditem /*int*/ ==_i) { 
_sc = _strokecolor;}
else {
_sc = (int) (0);};
RDebugUtils.currentLine=19464213;
 //BA.debugLineNum = 19464213;BA.debugLine="Dim width As Int = DrawItem(Left, mItems.Get(i),";
_width = __ref._drawitem /*int*/ (null,_left,BA.ObjectToString(__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),_i==0,_i==__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,_clrs[(int) (_i%_clrs.length)],_sc);
RDebugUtils.currentLine=19464214;
 //BA.debugLineNum = 19464214;BA.debugLine="Left = Left + width + offset + 2dip";
_left = (int) (_left+_width+__ref._offset /*int*/ +__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=19464215;
 //BA.debugLineNum = 19464215;BA.debugLine="RightPositions.Add(Left)";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_left));
 }
};
RDebugUtils.currentLine=19464217;
 //BA.debugLineNum = 19464217;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=19464218;
 //BA.debugLineNum = 19464218;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.DesaWisataSaribu.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=19202051;
 //BA.debugLineNum = 19202051;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19202053;
 //BA.debugLineNum = 19202053;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=19202054;
 //BA.debugLineNum = 19202054;BA.debugLine="Private mItems As List";
_mitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19202055;
 //BA.debugLineNum = 19202055;BA.debugLine="Private RightPositions As List";
_rightpositions = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19202056;
 //BA.debugLineNum = 19202056;BA.debugLine="Public TextColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=19202057;
 //BA.debugLineNum = 19202057;BA.debugLine="Public fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=19202058;
 //BA.debugLineNum = 19202058;BA.debugLine="Private offset As Int = 10dip";
_offset = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=19202059;
 //BA.debugLineNum = 19202059;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=19202060;
 //BA.debugLineNum = 19202060;BA.debugLine="Public CrumbColor As Int";
_crumbcolor = 0;
RDebugUtils.currentLine=19202061;
 //BA.debugLineNum = 19202061;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19202062;
 //BA.debugLineNum = 19202062;BA.debugLine="Private PressedItem As Int = -1";
_presseditem = (int) (-1);
RDebugUtils.currentLine=19202063;
 //BA.debugLineNum = 19202063;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=19202064;
 //BA.debugLineNum = 19202064;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=19202065;
 //BA.debugLineNum = 19202065;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.DesaWisataSaribu.b4xbreadcrumb __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
String _items = "";
String _s = "";
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=19333124;
 //BA.debugLineNum = 19333124;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=19333125;
 //BA.debugLineNum = 19333125;BA.debugLine="fnt = xlbl.Font";
__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=19333126;
 //BA.debugLineNum = 19333126;BA.debugLine="TextColor = xlbl.TextColor";
__ref._textcolor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=19333127;
 //BA.debugLineNum = 19333127;BA.debugLine="CrumbColor = xui.PaintOrColorToColor(Props.Get(\"C";
__ref._crumbcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CrumbColor")));
RDebugUtils.currentLine=19333128;
 //BA.debugLineNum = 19333128;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=19333129;
 //BA.debugLineNum = 19333129;BA.debugLine="TouchPanel = xui.CreatePanel(\"Touch\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"Touch");
RDebugUtils.currentLine=19333130;
 //BA.debugLineNum = 19333130;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=19333131;
 //BA.debugLineNum = 19333131;BA.debugLine="Dim items As String = Props.Get(\"Items\")";
_items = BA.ObjectToString(_props.Get((Object)("Items")));
RDebugUtils.currentLine=19333132;
 //BA.debugLineNum = 19333132;BA.debugLine="For Each s As String In Regex.Split(\"\\|\", items)";
{
final String[] group13 = __c.Regex.Split("\\|",_items);
final int groupLen13 = group13.length
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_s = group13[index13];
RDebugUtils.currentLine=19333133;
 //BA.debugLineNum = 19333133;BA.debugLine="mItems.Add(s)";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=19333135;
 //BA.debugLineNum = 19333135;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=19333136;
 //BA.debugLineNum = 19333136;BA.debugLine="End Sub";
return "";
}
public int  _drawitem(b4a.DesaWisataSaribu.b4xbreadcrumb __ref,int _left,String _text,boolean _first,boolean _last,int _clr,int _strokecolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "drawitem", true))
	 {return ((Integer) Debug.delegate(ba, "drawitem", new Object[] {_left,_text,_first,_last,_clr,_strokecolor}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _itemwidth = 0;
int _itemheight = 0;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Private Sub DrawItem(Left As Int, Text As String,";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(Text, fnt)";
_r = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_text,__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="Dim ItemWidth As Int = r.Width + 30dip";
_itemwidth = (int) (_r.getWidth()+__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="Dim ItemHeight As Int = cvs.TargetRect.Height";
_itemheight = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight());
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="Dim BaseLine As Int = cvs.TargetRect.CenterY - r.";
_baseline = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="p.Initialize(Left, 0)";
_p.Initialize((float) (_left),(float) (0));
RDebugUtils.currentLine=19529735;
 //BA.debugLineNum = 19529735;BA.debugLine="p.LineTo(Left + ItemWidth, 0)";
_p.LineTo((float) (_left+_itemwidth),(float) (0));
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="If Last = False Then";
if (_last==__c.False) { 
RDebugUtils.currentLine=19529737;
 //BA.debugLineNum = 19529737;BA.debugLine="p.LineTo(Left + ItemWidth + offset, ItemHeight /";
_p.LineTo((float) (_left+_itemwidth+__ref._offset /*int*/ ),(float) (_itemheight/(double)2));
 };
RDebugUtils.currentLine=19529739;
 //BA.debugLineNum = 19529739;BA.debugLine="p.LineTo(Left + ItemWidth, ItemHeight)";
_p.LineTo((float) (_left+_itemwidth),(float) (_itemheight));
RDebugUtils.currentLine=19529740;
 //BA.debugLineNum = 19529740;BA.debugLine="If First = False Then";
if (_first==__c.False) { 
RDebugUtils.currentLine=19529741;
 //BA.debugLineNum = 19529741;BA.debugLine="p.LineTo(Left - offset, ItemHeight)";
_p.LineTo((float) (_left-__ref._offset /*int*/ ),(float) (_itemheight));
RDebugUtils.currentLine=19529742;
 //BA.debugLineNum = 19529742;BA.debugLine="p.LineTo(Left, ItemHeight / 2)";
_p.LineTo((float) (_left),(float) (_itemheight/(double)2));
RDebugUtils.currentLine=19529743;
 //BA.debugLineNum = 19529743;BA.debugLine="p.LineTo(Left - offset, 0)";
_p.LineTo((float) (_left-__ref._offset /*int*/ ),(float) (0));
 }else {
RDebugUtils.currentLine=19529745;
 //BA.debugLineNum = 19529745;BA.debugLine="p.LineTo(Left, ItemHeight)";
_p.LineTo((float) (_left),(float) (_itemheight));
 };
RDebugUtils.currentLine=19529747;
 //BA.debugLineNum = 19529747;BA.debugLine="p.LineTo(Left, 0)";
_p.LineTo((float) (_left),(float) (0));
RDebugUtils.currentLine=19529748;
 //BA.debugLineNum = 19529748;BA.debugLine="cvs.DrawPath(p, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_clr,__c.True,(float) (0));
RDebugUtils.currentLine=19529749;
 //BA.debugLineNum = 19529749;BA.debugLine="If strokeColor <> 0 Then";
if (_strokecolor!=0) { 
RDebugUtils.currentLine=19529750;
 //BA.debugLineNum = 19529750;BA.debugLine="cvs.DrawPath(p, strokeColor, False, 3dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_strokecolor,__c.False,(float) (__c.DipToCurrent((int) (3))));
 };
RDebugUtils.currentLine=19529753;
 //BA.debugLineNum = 19529753;BA.debugLine="cvs.DrawText(Text, Left + ItemWidth / 2, BaseLine";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,_text,(float) (_left+_itemwidth/(double)2),(float) (_baseline),__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._textcolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=19529754;
 //BA.debugLineNum = 19529754;BA.debugLine="Return ItemWidth";
if (true) return _itemwidth;
RDebugUtils.currentLine=19529755;
 //BA.debugLineNum = 19529755;BA.debugLine="End Sub";
return 0;
}
public int  _finditem(b4a.DesaWisataSaribu.b4xbreadcrumb __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "finditem", true))
	 {return ((Integer) Debug.delegate(ba, "finditem", new Object[] {_x,_y}));}
int _r = 0;
int _i = 0;
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Private Sub FindItem (x As Int, y As Int) As Int";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="If RightPositions.Size = 0 Then Return -1";
if (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="If y < 0 Or y > cvs.TargetRect.Height Then Return";
if (_y<0 || _y>__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="Dim r As Int = RightPositions.Get(RightPositions.";
_r = (int)(BA.ObjectToNumber(__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="If x > r Then Return -1";
if (_x>_r) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="For i = RightPositions.Size - 2 To 0 Step -1";
{
final int step5 = -1;
final int limit5 = (int) (0);
_i = (int) (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-2) ;
for (;_i >= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=19660806;
 //BA.debugLineNum = 19660806;BA.debugLine="Dim r As Int = RightPositions.Get(i)";
_r = (int)(BA.ObjectToNumber(__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="If x > r Then Return i + 1";
if (_x>_r) { 
if (true) return (int) (_i+1);};
 }
};
RDebugUtils.currentLine=19660809;
 //BA.debugLineNum = 19660809;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=19660810;
 //BA.debugLineNum = 19660810;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getitems(b4a.DesaWisataSaribu.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "getitems", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getitems", null));}
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Public Sub getItems As List";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="Return mItems";
if (true) return __ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.DesaWisataSaribu.b4xbreadcrumb __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="mItems.Initialize";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=19267588;
 //BA.debugLineNum = 19267588;BA.debugLine="RightPositions.Initialize";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=19267589;
 //BA.debugLineNum = 19267589;BA.debugLine="bc.Initialize(1, 1)";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (1),(int) (1));
RDebugUtils.currentLine=19267590;
 //BA.debugLineNum = 19267590;BA.debugLine="End Sub";
return "";
}
public String  _setitems(b4a.DesaWisataSaribu.b4xbreadcrumb __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((String) Debug.delegate(ba, "setitems", new Object[] {_i}));}
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Public Sub setItems (i As List)";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="mItems = i";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/  = _i;
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="End Sub";
return "";
}
public String  _touch_touch(b4a.DesaWisataSaribu.b4xbreadcrumb __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "touch_touch", true))
	 {return ((String) Debug.delegate(ba, "touch_touch", new Object[] {_action,_x,_y}));}
int _prev = 0;
int _index = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
int _i = 0;
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Private Sub Touch_Touch (Action As Int, X As Float";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP)) {
case 0: 
case 1: {
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="Dim prev As Int = PressedItem";
_prev = __ref._presseditem /*int*/ ;
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="PressedItem = FindItem(X, Y)";
__ref._presseditem /*int*/  = __ref._finditem /*int*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=19595269;
 //BA.debugLineNum = 19595269;BA.debugLine="If prev <> PressedItem Then Draw";
if (_prev!=__ref._presseditem /*int*/ ) { 
__ref._draw /*String*/ (null);};
 break; }
case 2: {
RDebugUtils.currentLine=19595271;
 //BA.debugLineNum = 19595271;BA.debugLine="Dim index As Int = FindItem(X, Y)";
_index = __ref._finditem /*int*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=19595272;
 //BA.debugLineNum = 19595272;BA.debugLine="If index = PressedItem And index > -1 Then";
if (_index==__ref._presseditem /*int*/  && _index>-1) { 
RDebugUtils.currentLine=19595273;
 //BA.debugLineNum = 19595273;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19595274;
 //BA.debugLineNum = 19595274;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=19595275;
 //BA.debugLineNum = 19595275;BA.debugLine="For i = 0 To index";
{
final int step11 = 1;
final int limit11 = _index;
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=19595276;
 //BA.debugLineNum = 19595276;BA.debugLine="Items.Add(mItems.Get(i))";
_items.Add(__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=19595278;
 //BA.debugLineNum = 19595278;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=19595279;
 //BA.debugLineNum = 19595279;BA.debugLine="CallSub2(mCallBack, mEventName & \"_CrumbClick\"";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CrumbClick",(Object)(_items));
 };
RDebugUtils.currentLine=19595281;
 //BA.debugLineNum = 19595281;BA.debugLine="PressedItem = -1";
__ref._presseditem /*int*/  = (int) (-1);
RDebugUtils.currentLine=19595282;
 //BA.debugLineNum = 19595282;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 break; }
}
;
RDebugUtils.currentLine=19595284;
 //BA.debugLineNum = 19595284;BA.debugLine="End Sub";
return "";
}
}