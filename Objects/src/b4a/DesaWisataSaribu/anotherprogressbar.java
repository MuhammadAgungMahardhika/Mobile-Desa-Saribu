package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class anotherprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSaribu.anotherprogressbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSaribu.anotherprogressbar.class).invoke(this, new Object[] {null});
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
public b4a.example.bcpath._bcbrush _busybrush = null;
public int _backgroundcolor = 0;
public int _busyindex = 0;
public b4a.example.bitmapcreator _bc = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _miv = null;
public b4a.example.bcpath._bcbrush _transparentbrush = null;
public boolean _vertical = false;
public float _currentvalue = 0f;
public int _emptycolor = 0;
public b4a.example.bcpath._bcbrush _emptybrush = null;
public int _mvalue = 0;
public Object _tag = null;
public float _valuechangepersecond = 0f;
public int _cornerradius = 0;
public int _brushoffsetdelta = 0;
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
public String  _base_resize(b4a.DesaWisataSaribu.anotherprogressbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }
};
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="bc.Initialize(mBase.Width / xui.Scale, mBase.Heig";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()));
RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="Vertical = mBase.Height > mBase.Width";
__ref._vertical /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()>__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="UpdateGraphics";
__ref._updategraphics /*String*/ (null);
RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="End Sub";
return "";
}
public String  _updategraphics(b4a.DesaWisataSaribu.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "updategraphics", true))
	 {return ((String) Debug.delegate(ba, "updategraphics", null));}
int _width = 0;
b4a.example.bitmapcreator _template = null;
b4a.example.bitmapcreator._argbcolor _bcolor = null;
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Public Sub UpdateGraphics";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="EmptyBrush = bc.CreateBrushFromColor(EmptyColor)";
__ref._emptybrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._emptycolor /*int*/ );
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="TransparentBrush = bc.CreateBrushFromColor(xui.Co";
__ref._transparentbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="Dim Width As Int = 40";
_width = (int) (40);
RDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="Dim Template As BitmapCreator";
_template = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=21954565;
 //BA.debugLineNum = 21954565;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=21954566;
 //BA.debugLineNum = 21954566;BA.debugLine="bc.ColorToARGB(BackgroundColor, bcolor)";
__ref._bc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._backgroundcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=21954567;
 //BA.debugLineNum = 21954567;BA.debugLine="bcolor.r = Min(255, bcolor.r * 1.5)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*1.5));
RDebugUtils.currentLine=21954568;
 //BA.debugLineNum = 21954568;BA.debugLine="bcolor.g = Min(255, bcolor.g * 1.5)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*1.5));
RDebugUtils.currentLine=21954569;
 //BA.debugLineNum = 21954569;BA.debugLine="bcolor.b = Min(255, bcolor.b * 1.5)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*1.5));
RDebugUtils.currentLine=21954570;
 //BA.debugLineNum = 21954570;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=21954571;
 //BA.debugLineNum = 21954571;BA.debugLine="Template.Initialize(mBase.Width / xui.Scale, mBa";
_template._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()+_width));
 }else {
RDebugUtils.currentLine=21954573;
 //BA.debugLineNum = 21954573;BA.debugLine="Template.Initialize(mBase.Height / xui.Scale + W";
_template._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()+_width),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()));
 };
RDebugUtils.currentLine=21954576;
 //BA.debugLineNum = 21954576;BA.debugLine="Template.DrawRect(Template.TargetRect, Background";
_template._drawrect(_template._targetrect,__ref._backgroundcolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=21954577;
 //BA.debugLineNum = 21954577;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=21954578;
 //BA.debugLineNum = 21954578;BA.debugLine="Template.DrawLine(-Width / 2, Width / 2, Templat";
_template._drawline((float) (-_width/(double)2),(float) (_width/(double)2),(float) (_template._mwidth+_width/(double)2),(float) (_template._mheight-_width/(double)2),__ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor),_width);
 }else {
RDebugUtils.currentLine=21954580;
 //BA.debugLineNum = 21954580;BA.debugLine="Template.DrawLine(Width / 2, -Width / 2, Templat";
_template._drawline((float) (_width/(double)2),(float) (-_width/(double)2),(float) (_template._mwidth-_width/(double)2),(float) (_template._mheight+_width/(double)2),__ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor),_width);
 };
RDebugUtils.currentLine=21954582;
 //BA.debugLineNum = 21954582;BA.debugLine="BusyBrush = bc.CreateBrushFromBitmapCreator(Templ";
__ref._busybrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfrombitmapcreator(_template);
RDebugUtils.currentLine=21954583;
 //BA.debugLineNum = 21954583;BA.debugLine="If mValue = 100 Then";
if (__ref._mvalue /*int*/ ==100) { 
RDebugUtils.currentLine=21954584;
 //BA.debugLineNum = 21954584;BA.debugLine="bc.DrawRectRounded(bc.TargetRect, BackgroundColo";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrectrounded(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._backgroundcolor /*int*/ ,__c.True,(int) (0),(int) (15));
 }else {
RDebugUtils.currentLine=21954586;
 //BA.debugLineNum = 21954586;BA.debugLine="bc.DrawRectRounded2(bc.TargetRect, EmptyBrush, T";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrectrounded2(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._emptybrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0),(int) (15));
 };
RDebugUtils.currentLine=21954588;
 //BA.debugLineNum = 21954588;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, mIV)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap(),__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=21954589;
 //BA.debugLineNum = 21954589;BA.debugLine="setVisible(mBase.Visible)";
__ref._setvisible /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible());
RDebugUtils.currentLine=21954590;
 //BA.debugLineNum = 21954590;BA.debugLine="End Sub";
return "";
}
public void  _busyloop(b4a.DesaWisataSaribu.anotherprogressbar __ref) throws Exception{
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "busyloop", true))
	 {Debug.delegate(ba, "busyloop", null); return;}
ResumableSub_BusyLoop rsub = new ResumableSub_BusyLoop(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_BusyLoop extends BA.ResumableSub {
public ResumableSub_BusyLoop(b4a.DesaWisataSaribu.anotherprogressbar parent,b4a.DesaWisataSaribu.anotherprogressbar __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.DesaWisataSaribu.anotherprogressbar __ref;
b4a.DesaWisataSaribu.anotherprogressbar parent;
int _myindex = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
long _lasttime = 0L;
anywheresoftware.b4a.objects.collections.List _tasks = null;
float _delta = 0f;
float _change = 0f;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="anotherprogressbar";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="Dim MyIndex As Int = BusyIndex";
_myindex = __ref._busyindex /*int*/ ;
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight)";
_r.Initialize((float) (0),(float) (0),(float) (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth),(float) (__ref._bc /*b4a.example.bitmapcreator*/ ._mheight));
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="Dim LastTime As Long = DateTime.Now";
_lasttime = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="Do While MyIndex = BusyIndex";
if (true) break;

case 1:
//do while
this.state = 37;
while (_myindex==__ref._busyindex /*int*/ ) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="If Vertical Then";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._vertical /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=21757959;
 //BA.debugLineNum = 21757959;BA.debugLine="BusyBrush.SrcOffsetY = BusyBrush.SrcOffsetY + B";
__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetY = (int) (__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetY+__ref._brushoffsetdelta /*int*/ );
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=21757961;
 //BA.debugLineNum = 21757961;BA.debugLine="BusyBrush.SrcOffsetX = BusyBrush.SrcOffsetX + B";
__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetX = (int) (__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetX+__ref._brushoffsetdelta /*int*/ );
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=21757963;
 //BA.debugLineNum = 21757963;BA.debugLine="Dim tasks As List";
_tasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21757964;
 //BA.debugLineNum = 21757964;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
RDebugUtils.currentLine=21757965;
 //BA.debugLineNum = 21757965;BA.debugLine="tasks.Add(bc.AsyncDrawRect(bc.TargetRect, Transp";
_tasks.Add((Object)(__ref._bc /*b4a.example.bitmapcreator*/ ._asyncdrawrect(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._transparentbrush /*b4a.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0))));
RDebugUtils.currentLine=21757966;
 //BA.debugLineNum = 21757966;BA.debugLine="Dim delta As Float = mValue - CurrentValue";
_delta = (float) (__ref._mvalue /*int*/ -__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=21757967;
 //BA.debugLineNum = 21757967;BA.debugLine="If Abs(delta) <= 1 Then";
if (true) break;

case 10:
//if
this.state = 21;
if (parent.__c.Abs(_delta)<=1) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 21;
RDebugUtils.currentLine=21757968;
 //BA.debugLineNum = 21757968;BA.debugLine="CurrentValue = mValue";
__ref._currentvalue /*float*/  = (float) (__ref._mvalue /*int*/ );
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=21757970;
 //BA.debugLineNum = 21757970;BA.debugLine="Dim change As Float = (DateTime.Now - LastTime)";
_change = (float) ((parent.__c.DateTime.getNow()-_lasttime)/(double)1000*__ref._valuechangepersecond /*float*/ );
RDebugUtils.currentLine=21757971;
 //BA.debugLineNum = 21757971;BA.debugLine="If delta > 0 Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_delta>0) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=21757972;
 //BA.debugLineNum = 21757972;BA.debugLine="CurrentValue = CurrentValue + Min(change, mVal";
__ref._currentvalue /*float*/  = (float) (__ref._currentvalue /*float*/ +parent.__c.Min(_change,__ref._mvalue /*int*/ -__ref._currentvalue /*float*/ ));
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=21757974;
 //BA.debugLineNum = 21757974;BA.debugLine="CurrentValue = CurrentValue - Min(change, Curr";
__ref._currentvalue /*float*/  = (float) (__ref._currentvalue /*float*/ -parent.__c.Min(_change,__ref._currentvalue /*float*/ -__ref._mvalue /*int*/ ));
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=21757977;
 //BA.debugLineNum = 21757977;BA.debugLine="LastTime = DateTime.Now";
_lasttime = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=21757978;
 //BA.debugLineNum = 21757978;BA.debugLine="If CurrentValue < 100 Then";
if (true) break;

case 22:
//if
this.state = 25;
if (__ref._currentvalue /*float*/ <100) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=21757979;
 //BA.debugLineNum = 21757979;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(bc.TargetRect";
_tasks.Add((Object)(__ref._bc /*b4a.example.bitmapcreator*/ ._asyncdrawrectrounded(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._emptybrush /*b4a.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0),__ref._cornerradius /*int*/ )));
 if (true) break;
;
RDebugUtils.currentLine=21757981;
 //BA.debugLineNum = 21757981;BA.debugLine="If Vertical Then";

case 25:
//if
this.state = 30;
if (__ref._vertical /*boolean*/ ) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=21757982;
 //BA.debugLineNum = 21757982;BA.debugLine="r.Bottom = Round(CurrentValue / 100 * bc.mHeigh";
_r.setBottom((float) (parent.__c.Round(__ref._currentvalue /*float*/ /(double)100*__ref._bc /*b4a.example.bitmapcreator*/ ._mheight)));
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=21757984;
 //BA.debugLineNum = 21757984;BA.debugLine="r.Right = Round(CurrentValue / 100 * bc.mWidth)";
_r.setRight((float) (parent.__c.Round(__ref._currentvalue /*float*/ /(double)100*__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth)));
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=21757987;
 //BA.debugLineNum = 21757987;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(r, BusyBrush,";
_tasks.Add((Object)(__ref._bc /*b4a.example.bitmapcreator*/ ._asyncdrawrectrounded(_r,__ref._busybrush /*b4a.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0),__ref._cornerradius /*int*/ )));
RDebugUtils.currentLine=21757988;
 //BA.debugLineNum = 21757988;BA.debugLine="bc.DrawBitmapCreatorsAsync(Me, \"BC\", tasks)";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawbitmapcreatorsasync(parent,"BC",_tasks);
RDebugUtils.currentLine=21757989;
 //BA.debugLineNum = 21757989;BA.debugLine="Wait For BC_BitmapReady (bmp As B4XBitmap)";
parent.__c.WaitFor("bc_bitmapready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "anotherprogressbar", "busyloop"), null);
this.state = 38;
return;
case 38:
//C
this.state = 31;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[1];
;
RDebugUtils.currentLine=21757990;
 //BA.debugLineNum = 21757990;BA.debugLine="If xui.IsB4J Then bmp = bc.Bitmap";
if (true) break;

case 31:
//if
this.state = 36;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_bmp = __ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap();
if (true) break;

case 36:
//C
this.state = 1;
;
RDebugUtils.currentLine=21757991;
 //BA.debugLineNum = 21757991;BA.debugLine="bc.SetBitmapToImageView(bmp, mIV)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(_bmp,__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=21757992;
 //BA.debugLineNum = 21757992;BA.debugLine="Sleep(30)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "anotherprogressbar", "busyloop"),(int) (30));
this.state = 39;
return;
case 39:
//C
this.state = 1;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=21757994;
 //BA.debugLineNum = 21757994;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.DesaWisataSaribu.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="Private BusyBrush As BCBrush";
_busybrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="Private BackgroundColor As Int";
_backgroundcolor = 0;
RDebugUtils.currentLine=21495815;
 //BA.debugLineNum = 21495815;BA.debugLine="Private BusyIndex As Int";
_busyindex = 0;
RDebugUtils.currentLine=21495816;
 //BA.debugLineNum = 21495816;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=21495817;
 //BA.debugLineNum = 21495817;BA.debugLine="Private mIV As B4XView";
_miv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21495818;
 //BA.debugLineNum = 21495818;BA.debugLine="Private TransparentBrush As BCBrush";
_transparentbrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=21495819;
 //BA.debugLineNum = 21495819;BA.debugLine="Private Vertical As Boolean";
_vertical = false;
RDebugUtils.currentLine=21495820;
 //BA.debugLineNum = 21495820;BA.debugLine="Private CurrentValue As Float";
_currentvalue = 0f;
RDebugUtils.currentLine=21495821;
 //BA.debugLineNum = 21495821;BA.debugLine="Public EmptyColor As Int = xui.Color_White";
_emptycolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=21495822;
 //BA.debugLineNum = 21495822;BA.debugLine="Private EmptyBrush As BCBrush";
_emptybrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=21495823;
 //BA.debugLineNum = 21495823;BA.debugLine="Private mValue As Int";
_mvalue = 0;
RDebugUtils.currentLine=21495824;
 //BA.debugLineNum = 21495824;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=21495825;
 //BA.debugLineNum = 21495825;BA.debugLine="Public ValueChangePerSecond As Float = 60";
_valuechangepersecond = (float) (60);
RDebugUtils.currentLine=21495826;
 //BA.debugLineNum = 21495826;BA.debugLine="Public CornerRadius As Int";
_cornerradius = 0;
RDebugUtils.currentLine=21495827;
 //BA.debugLineNum = 21495827;BA.debugLine="Public BrushOffsetDelta As Int = 3";
_brushoffsetdelta = (int) (3);
RDebugUtils.currentLine=21495828;
 //BA.debugLineNum = 21495828;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.DesaWisataSaribu.anotherprogressbar __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="mIV = iv";
__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=21626886;
 //BA.debugLineNum = 21626886;BA.debugLine="mIV.Color = xui.Color_Transparent";
__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=21626887;
 //BA.debugLineNum = 21626887;BA.debugLine="setValue(Props.GetDefault(\"Value\", 100))";
__ref._setvalue /*String*/ (null,(int)(BA.ObjectToNumber(_props.GetDefault((Object)("Value"),(Object)(100)))));
RDebugUtils.currentLine=21626888;
 //BA.debugLineNum = 21626888;BA.debugLine="CurrentValue = mValue";
__ref._currentvalue /*float*/  = (float) (__ref._mvalue /*int*/ );
RDebugUtils.currentLine=21626889;
 //BA.debugLineNum = 21626889;BA.debugLine="mBase.AddView(mIV, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=21626890;
 //BA.debugLineNum = 21626890;BA.debugLine="mBase.AddView(lbl, 0, 0, mBase.Width, mBase.Heigh";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_lbl.getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=21626891;
 //BA.debugLineNum = 21626891;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=21626892;
 //BA.debugLineNum = 21626892;BA.debugLine="BackgroundColor = xui.PaintOrColorToColor(Props.G";
__ref._backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ProgressColor")));
RDebugUtils.currentLine=21626893;
 //BA.debugLineNum = 21626893;BA.debugLine="CornerRadius = Props.GetDefault(\"CornerRadius\", 1";
__ref._cornerradius /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornerRadius"),(Object)(15))));
RDebugUtils.currentLine=21626894;
 //BA.debugLineNum = 21626894;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=21626895;
 //BA.debugLineNum = 21626895;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.DesaWisataSaribu.anotherprogressbar __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Public Sub setValue (v As Int)";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="mValue = Max(0, Min(100, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(0,__c.Min(100,_v)));
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="End Sub";
return "";
}
public int  _getprogresscolor(b4a.DesaWisataSaribu.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "getprogresscolor", true))
	 {return ((Integer) Debug.delegate(ba, "getprogresscolor", null));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Public Sub getProgressColor As Int";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Return BackgroundColor";
if (true) return __ref._backgroundcolor /*int*/ ;
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="End Sub";
return 0;
}
public int  _getvalue(b4a.DesaWisataSaribu.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible(b4a.DesaWisataSaribu.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "getvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="Return mBase.Visible";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible();
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.DesaWisataSaribu.anotherprogressbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="End Sub";
return "";
}
public String  _setprogresscolor(b4a.DesaWisataSaribu.anotherprogressbar __ref,int _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setprogresscolor", true))
	 {return ((String) Debug.delegate(ba, "setprogresscolor", new Object[] {_c}));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Public Sub setProgressColor (c As Int)";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="BackgroundColor = c";
__ref._backgroundcolor /*int*/  = _c;
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="UpdateGraphics";
__ref._updategraphics /*String*/ (null);
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="End Sub";
return "";
}
public String  _setvaluenoanimation(b4a.DesaWisataSaribu.anotherprogressbar __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setvaluenoanimation", true))
	 {return ((String) Debug.delegate(ba, "setvaluenoanimation", new Object[] {_v}));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Public Sub SetValueNoAnimation (v As Int)";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="setValue(v)";
__ref._setvalue /*String*/ (null,_v);
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="CurrentValue = mValue";
__ref._currentvalue /*float*/  = (float) (__ref._mvalue /*int*/ );
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4a.DesaWisataSaribu.anotherprogressbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_b}));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Public Sub setVisible(b As Boolean)";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="BusyIndex = BusyIndex + 1";
__ref._busyindex /*int*/  = (int) (__ref._busyindex /*int*/ +1);
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="If b Then";
if (_b) { 
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="BusyLoop";
__ref._busyloop /*void*/ (null);
 };
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="mBase.Visible = b";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(_b);
RDebugUtils.currentLine=22020102;
 //BA.debugLineNum = 22020102;BA.debugLine="End Sub";
return "";
}
}