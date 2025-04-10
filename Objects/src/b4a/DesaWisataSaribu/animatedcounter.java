package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class animatedcounter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSaribu.animatedcounter");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSaribu.animatedcounter.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _imageviews = null;
public int _mdigits = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltemplate = null;
public anywheresoftware.b4a.objects.collections.List _mvalue = null;
public int _digitheight = 0;
public int _digitwidth = 0;
public int _mduration = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _fade = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xfadeiv = null;
public Object _tag = null;
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
public String  _base_resize(b4a.DesaWisataSaribu.animatedcounter __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _columns = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
int _left = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="xfadeIv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._xfadeiv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=19791875;
 //BA.debugLineNum = 19791875;BA.debugLine="xfadeIv.SetBitmap(fade.Resize(Width, Height, Fals";
__ref._xfadeiv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._fade /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_width),(int) (_height),__c.False).getObject()));
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="DigitHeight = Height";
__ref._digitheight /*int*/  = (int) (_height);
RDebugUtils.currentLine=19791877;
 //BA.debugLineNum = 19791877;BA.debugLine="Dim Columns As Int = mdigits";
_columns = __ref._mdigits /*int*/ ;
RDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="DigitWidth = Width / Columns";
__ref._digitwidth /*int*/  = (int) (_width/(double)_columns);
RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="Dim bmp As B4XBitmap = CreateBitmap(lblTemplate)";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,__ref._lbltemplate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=19791880;
 //BA.debugLineNum = 19791880;BA.debugLine="Dim left As Int = Width";
_left = (int) (_width);
RDebugUtils.currentLine=19791881;
 //BA.debugLineNum = 19791881;BA.debugLine="For i = 0 To ImageViews.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=19791882;
 //BA.debugLineNum = 19791882;BA.debugLine="Dim iv As B4XView = ImageViews.Get(i)";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_iv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=19791884;
 //BA.debugLineNum = 19791884;BA.debugLine="left = left - DigitWidth";
_left = (int) (_left-__ref._digitwidth /*int*/ );
RDebugUtils.currentLine=19791885;
 //BA.debugLineNum = 19791885;BA.debugLine="iv.SetLayoutAnimated(0, left, TopFromValue(i), D";
_iv.SetLayoutAnimated((int) (0),_left,__ref._topfromvalue /*int*/ (null,_i),__ref._digitwidth /*int*/ ,(int) (__ref._digitheight /*int*/ *10));
RDebugUtils.currentLine=19791886;
 //BA.debugLineNum = 19791886;BA.debugLine="iv.SetBitmap(bmp)";
_iv.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=19791888;
 //BA.debugLineNum = 19791888;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createbitmap(b4a.DesaWisataSaribu.animatedcounter __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "createbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createbitmap", new Object[] {_lbl}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _res = null;
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Private Sub CreateBitmap (lbl As B4XView) As B4XBi";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, DigitWidth, DigitHei";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._digitwidth /*int*/ ,(int) (__ref._digitheight /*int*/ *10));
RDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(_p);
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(\"5\", lbl.Font)";
_r = _cvs.MeasureText("5",_lbl.getFont());
RDebugUtils.currentLine=19922950;
 //BA.debugLineNum = 19922950;BA.debugLine="Dim BaseLine As Int = DigitHeight / 2 - r.Height";
_baseline = (int) (__ref._digitheight /*int*/ /(double)2-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=19922951;
 //BA.debugLineNum = 19922951;BA.debugLine="For i = 0 To 9";
{
final int step7 = 1;
final int limit7 = (int) (9);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=19922952;
 //BA.debugLineNum = 19922952;BA.debugLine="cvs.DrawText(i, DigitWidth / 2, i * DigitHeight";
_cvs.DrawText(ba,BA.NumberToString(_i),(float) (__ref._digitwidth /*int*/ /(double)2),(float) (_i*__ref._digitheight /*int*/ +_baseline),_lbl.getFont(),_lbl.getTextColor(),BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
RDebugUtils.currentLine=19922954;
 //BA.debugLineNum = 19922954;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
RDebugUtils.currentLine=19922955;
 //BA.debugLineNum = 19922955;BA.debugLine="Dim res As B4XBitmap = cvs.CreateBitmap";
_res = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_res = _cvs.CreateBitmap();
RDebugUtils.currentLine=19922956;
 //BA.debugLineNum = 19922956;BA.debugLine="cvs.Release";
_cvs.Release();
RDebugUtils.currentLine=19922957;
 //BA.debugLineNum = 19922957;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=19922958;
 //BA.debugLineNum = 19922958;BA.debugLine="End Sub";
return null;
}
public int  _topfromvalue(b4a.DesaWisataSaribu.animatedcounter __ref,int _digit) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "topfromvalue", true))
	 {return ((Integer) Debug.delegate(ba, "topfromvalue", new Object[] {_digit}));}
int _d = 0;
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Private Sub TopFromValue (Digit As Int) As Int";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Dim d As Int = mValue.Get(Digit)";
_d = (int)(BA.ObjectToNumber(__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_digit)));
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="Return -d * DigitHeight";
if (true) return (int) (-_d*__ref._digitheight /*int*/ );
RDebugUtils.currentLine=19857411;
 //BA.debugLineNum = 19857411;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.DesaWisataSaribu.animatedcounter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="Private ImageViews As List";
_imageviews = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="Private mdigits As Int";
_mdigits = 0;
RDebugUtils.currentLine=19529735;
 //BA.debugLineNum = 19529735;BA.debugLine="Private lblTemplate As B4XView";
_lbltemplate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="Private mValue As List";
_mvalue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19529737;
 //BA.debugLineNum = 19529737;BA.debugLine="Private DigitHeight, DigitWidth As Int";
_digitheight = 0;
_digitwidth = 0;
RDebugUtils.currentLine=19529738;
 //BA.debugLineNum = 19529738;BA.debugLine="Private mDuration As Int";
_mduration = 0;
RDebugUtils.currentLine=19529739;
 //BA.debugLineNum = 19529739;BA.debugLine="Private fade As B4XBitmap";
_fade = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=19529740;
 //BA.debugLineNum = 19529740;BA.debugLine="Private xfadeIv As B4XView";
_xfadeiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19529741;
 //BA.debugLineNum = 19529741;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=19529743;
 //BA.debugLineNum = 19529743;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createfadebitmap(b4a.DesaWisataSaribu.animatedcounter __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "createfadebitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createfadebitmap", new Object[] {_clr}));}
b4a.example.bitmapcreator _bc = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _tclr = 0;
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Private Sub CreateFadeBitmap (clr As Int) As B4XBi";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="bc.Initialize(200, 50)";
_bc._initialize(ba,(int) (200),(int) (50));
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight / 3)";
_r.Initialize((float) (0),(float) (0),(float) (_bc._mwidth),(float) (_bc._mheight/(double)3));
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="Dim tclr As Int = Bit.And(0x00ffffff, clr)";
_tclr = __c.Bit.And(((int)0x00ffffff),_clr);
RDebugUtils.currentLine=19726342;
 //BA.debugLineNum = 19726342;BA.debugLine="bc.FillGradient(Array As Int(clr, tclr), r, \"TOP_";
_bc._fillgradient(new int[]{_clr,_tclr},_r,"TOP_BOTTOM");
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="r.Top = bc.mHeight * 2 / 3";
_r.setTop((float) (_bc._mheight*2/(double)3));
RDebugUtils.currentLine=19726344;
 //BA.debugLineNum = 19726344;BA.debugLine="r.Bottom = bc.mHeight";
_r.setBottom((float) (_bc._mheight));
RDebugUtils.currentLine=19726345;
 //BA.debugLineNum = 19726345;BA.debugLine="bc.FillGradient(Array As Int(clr, tclr), r, \"BOTT";
_bc._fillgradient(new int[]{_clr,_tclr},_r,"BOTTOM_TOP");
RDebugUtils.currentLine=19726346;
 //BA.debugLineNum = 19726346;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
RDebugUtils.currentLine=19726347;
 //BA.debugLineNum = 19726347;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(b4a.DesaWisataSaribu.animatedcounter __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
int _i = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.ImageViewWrapper _fadeiv = null;
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\") 'needed";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="mdigits = Props.Get(\"Digits\")";
__ref._mdigits /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Digits"))));
RDebugUtils.currentLine=19660806;
 //BA.debugLineNum = 19660806;BA.debugLine="mDuration = Props.Get(\"Duration\")";
__ref._mduration /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Duration"))));
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="lblTemplate = lbl";
__ref._lbltemplate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=19660808;
 //BA.debugLineNum = 19660808;BA.debugLine="fade = CreateFadeBitmap(xui.PaintOrColorToColor(P";
__ref._fade /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createfadebitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("FadeColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White))));
RDebugUtils.currentLine=19660809;
 //BA.debugLineNum = 19660809;BA.debugLine="For i = 0 To mdigits - 1";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mdigits /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=19660810;
 //BA.debugLineNum = 19660810;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=19660811;
 //BA.debugLineNum = 19660811;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=19660812;
 //BA.debugLineNum = 19660812;BA.debugLine="ImageViews.Add(iv)";
__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_iv.getObject()));
RDebugUtils.currentLine=19660813;
 //BA.debugLineNum = 19660813;BA.debugLine="mBase.GetView(0).AddView(iv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).AddView((android.view.View)(_iv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 }
};
RDebugUtils.currentLine=19660815;
 //BA.debugLineNum = 19660815;BA.debugLine="Dim fadeIv As ImageView";
_fadeiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=19660816;
 //BA.debugLineNum = 19660816;BA.debugLine="fadeIv.Initialize(\"\")";
_fadeiv.Initialize(ba,"");
RDebugUtils.currentLine=19660817;
 //BA.debugLineNum = 19660817;BA.debugLine="xfadeIv = fadeIv";
__ref._xfadeiv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_fadeiv.getObject()));
RDebugUtils.currentLine=19660818;
 //BA.debugLineNum = 19660818;BA.debugLine="mBase.GetView(0).AddView(fadeIv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).AddView((android.view.View)(_fadeiv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=19660819;
 //BA.debugLineNum = 19660819;BA.debugLine="setValue(0)";
__ref._setvalue /*String*/ (null,(int) (0));
RDebugUtils.currentLine=19660820;
 //BA.debugLineNum = 19660820;BA.debugLine="If xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=19660821;
 //BA.debugLineNum = 19660821;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=19660822;
 //BA.debugLineNum = 19660822;BA.debugLine="setValue(getValue)";
__ref._setvalue /*String*/ (null,__ref._getvalue /*int*/ (null));
 };
RDebugUtils.currentLine=19660824;
 //BA.debugLineNum = 19660824;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.DesaWisataSaribu.animatedcounter __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Public Sub setValue(v As Int)";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="mValue.Clear";
__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="For i = 0 To mdigits - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mdigits /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="mValue.Add(v Mod 10)";
__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_v%10));
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="v = v / 10";
_v = (int) (_v/(double)10);
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="Dim iv As B4XView = ImageViews.Get(i)";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_iv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="iv.SetLayoutAnimated(mDuration, iv.Left, TopFrom";
_iv.SetLayoutAnimated(__ref._mduration /*int*/ ,_iv.getLeft(),__ref._topfromvalue /*int*/ (null,_i),(int) (__c.Max(1,_iv.getWidth())),(int) (__c.Max(1,_iv.getHeight())));
 }
};
RDebugUtils.currentLine=19988489;
 //BA.debugLineNum = 19988489;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(b4a.DesaWisataSaribu.animatedcounter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
int _res = 0;
int _i = 0;
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="For i = 0 To mValue.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="res = res + mValue.Get(i) * Power(10, i)";
_res = (int) (_res+(double)(BA.ObjectToNumber(__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))*__c.Power(10,_i));
 }
};
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=20054022;
 //BA.debugLineNum = 20054022;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.DesaWisataSaribu.animatedcounter __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="ImageViews.Initialize";
__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="mValue.Initialize";
__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=19595269;
 //BA.debugLineNum = 19595269;BA.debugLine="End Sub";
return "";
}
}