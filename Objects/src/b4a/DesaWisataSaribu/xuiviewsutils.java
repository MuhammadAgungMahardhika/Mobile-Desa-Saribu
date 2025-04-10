package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xuiviewsutils {
private static xuiviewsutils mostCurrent = new xuiviewsutils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static boolean _utilsinitialized = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
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
public static b4a.DesaWisataSaribu.b4ximageview  _createb4ximageview(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "createb4ximageview", true))
	 {return ((b4a.DesaWisataSaribu.b4ximageview) Debug.delegate(null, "createb4ximageview", new Object[] {_ba}));}
b4a.DesaWisataSaribu.b4ximageview _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Public Sub CreateB4XImageView As B4XImageView";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="Dim iv As B4XImageView";
_iv = new b4a.DesaWisataSaribu.b4ximageview();
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="iv.Initialize(Null, \"\")";
_iv._initialize /*String*/ (null,_ba,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=38928387;
 //BA.debugLineNum = 38928387;BA.debugLine="Dim base As B4XView = xui.CreatePanel(\"\")";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_base = _xui.CreatePanel((_ba.processBA == null ? _ba : _ba.processBA),"");
RDebugUtils.currentLine=38928388;
 //BA.debugLineNum = 38928388;BA.debugLine="base.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
_base.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=38928389;
 //BA.debugLineNum = 38928389;BA.debugLine="iv.DesignerCreateView(base, Null, CreateMap(\"Roun";
_iv._designercreateview /*String*/ (null,(Object)(_base.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Round"),(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)("ResizeMode"),(Object)("FIT"),(Object)("BackgroundColor"),(Object)(((int)0xffaaaaaa)),(Object)("CornersRadius"),(Object)(0)}));
RDebugUtils.currentLine=38928390;
 //BA.debugLineNum = 38928390;BA.debugLine="Return iv";
if (true) return _iv;
RDebugUtils.currentLine=38928391;
 //BA.debugLineNum = 38928391;BA.debugLine="End Sub";
return null;
}
public static String  _performhapticfeedback(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "performhapticfeedback", true))
	 {return ((String) Debug.delegate(null, "performhapticfeedback", new Object[] {_ba,_view}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Public Sub PerformHapticFeedback (View As B4XView)";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="Initialize";
_initialize(_ba);
RDebugUtils.currentLine=38600707;
 //BA.debugLineNum = 38600707;BA.debugLine="Dim jo As JavaObject = View";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=38600708;
 //BA.debugLineNum = 38600708;BA.debugLine="jo.RunMethod(\"performHapticFeedback\", Array(1))";
_jo.RunMethod("performHapticFeedback",new Object[]{(Object)(1)});
RDebugUtils.currentLine=38600714;
 //BA.debugLineNum = 38600714;BA.debugLine="End Sub";
return "";
}
public static String  _settextorcsbuildertolabel(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "settextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(null, "settextorcsbuildertolabel", new Object[] {_ba,_xlbl,_text}));}
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Public Sub SetTextOrCSBuilderToLabel(xlbl As B4XVi";
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=38731788;
 //BA.debugLineNum = 38731788;BA.debugLine="End Sub";
return "";
}
public static String  _addstubtoclvifneeded(anywheresoftware.b4a.BA _ba,b4a.example3.customlistview _customlistview1,int _color) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "addstubtoclvifneeded", true))
	 {return ((String) Debug.delegate(null, "addstubtoclvifneeded", new Object[] {_ba,_customlistview1,_color}));}
b4a.example3.customlistview._clvitem _lastitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _height = 0;
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Public Sub AddStubToCLVIfNeeded(CustomListView1 As";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="If CustomListView1.Size = 0 Then Return";
if (_customlistview1._getsize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="Dim LastItem As CLVItem = CustomListView1.GetRawL";
_lastitem = _customlistview1._getrawlistitem((int) (_customlistview1._getsize()-1));
RDebugUtils.currentLine=38666243;
 //BA.debugLineNum = 38666243;BA.debugLine="If LastItem.Offset + LastItem.Panel.Height < Cust";
if (_lastitem.Offset+_lastitem.Panel.getHeight()<_customlistview1._asview().getHeight()) { 
RDebugUtils.currentLine=38666245;
 //BA.debugLineNum = 38666245;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"stub\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel((_ba.processBA == null ? _ba : _ba.processBA),"stub");
RDebugUtils.currentLine=38666246;
 //BA.debugLineNum = 38666246;BA.debugLine="p.Color = Color";
_p.setColor(_color);
RDebugUtils.currentLine=38666247;
 //BA.debugLineNum = 38666247;BA.debugLine="Dim Height As Int = CustomListView1.AsView.Heigh";
_height = (int) (_customlistview1._asview().getHeight()-_lastitem.Offset-_lastitem.Panel.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=38666248;
 //BA.debugLineNum = 38666248;BA.debugLine="If xui.IsB4J Then Height = Height + 5";
if (_xui.getIsB4J()) { 
_height = (int) (_height+5);};
RDebugUtils.currentLine=38666249;
 //BA.debugLineNum = 38666249;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_customlistview1._asview().getWidth(),_height);
RDebugUtils.currentLine=38666250;
 //BA.debugLineNum = 38666250;BA.debugLine="CustomListView1.Add(p, \"\")";
_customlistview1._add(_p,(Object)(""));
RDebugUtils.currentLine=38666251;
 //BA.debugLineNum = 38666251;BA.debugLine="CustomListView1.sv.ScrollViewContentHeight = Cus";
_customlistview1._sv.setScrollViewContentHeight((int) (_customlistview1._sv.getScrollViewContentHeight()-_customlistview1._getdividersize()));
 };
RDebugUtils.currentLine=38666253;
 //BA.debugLineNum = 38666253;BA.debugLine="End Sub";
return "";
}
public static String  _setbitmapandfill(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _imageview,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "setbitmapandfill", true))
	 {return ((String) Debug.delegate(null, "setbitmapandfill", new Object[] {_ba,_imageview,_bmp}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Public Sub SetBitmapAndFill (ImageView As B4XView,";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="ImageView.SetBitmap(Bmp)";
_imageview.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="Dim iiv As ImageView = ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iiv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imageview.getObject()));
RDebugUtils.currentLine=38797316;
 //BA.debugLineNum = 38797316;BA.debugLine="iiv.Gravity = Gravity.FILL";
_iiv.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=38797322;
 //BA.debugLineNum = 38797322;BA.debugLine="End Sub";
return "";
}
public static String  _setalpha(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _view,float _level) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "setalpha", true))
	 {return ((String) Debug.delegate(null, "setalpha", new Object[] {_ba,_view,_level}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
float _alpha = 0f;
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Public Sub SetAlpha (View As B4XView, Level As Flo";
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="Dim jo As JavaObject = View";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=38993923;
 //BA.debugLineNum = 38993923;BA.debugLine="Dim alpha As Float = Level";
_alpha = _level;
RDebugUtils.currentLine=38993924;
 //BA.debugLineNum = 38993924;BA.debugLine="jo.RunMethod(\"setAlpha\", Array(alpha))";
_jo.RunMethod("setAlpha",new Object[]{(Object)(_alpha)});
RDebugUtils.currentLine=38993932;
 //BA.debugLineNum = 38993932;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(null, "createlabel", new Object[] {_ba}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Public Sub CreateLabel As B4XView";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(_ba,"");
RDebugUtils.currentLine=38862851;
 //BA.debugLineNum = 38862851;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=38862852;
 //BA.debugLineNum = 38862852;BA.debugLine="End Sub";
return null;
}
public static String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "initialize", true))
	 {return ((String) Debug.delegate(null, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Private Sub Initialize";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="If UtilsInitialized Then Return";
if (_utilsinitialized) { 
if (true) return "";};
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="UtilsInitialized = True";
_utilsinitialized = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=38535177;
 //BA.debugLineNum = 38535177;BA.debugLine="End Sub";
return "";
}
}