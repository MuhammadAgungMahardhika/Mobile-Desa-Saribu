package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSaribu.b4xdialog");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSaribu.b4xdialog.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _buttonsheight = 0;
public int _titlebarheight = 0;
public int _buttonwidth = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public int _backgroundcolor = 0;
public int _overlaycolor = 0;
public int _bordercolor = 0;
public int _bordercornersradius = 0;
public int _borderwidth = 0;
public int _buttonscolor = 0;
public int _buttonstextcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _blurimageview = null;
public boolean _blurbackground = false;
public int _blurreducescale = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public Object _title = null;
public int _titlebarcolor = 0;
public int _titlebartextcolor = 0;
public int _bodytextcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _titlebar = null;
public boolean _putattop = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _titlebarfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _buttonsfont = null;
public int _buttonstextcolordisabled = 0;
public int _visibleanimationduration = 0;
public int[] _buttonsorder = null;
public anywheresoftware.b4a.objects.collections.Map _buttonsstate = null;
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
public String  _initialize(b4a.DesaWisataSaribu.b4xdialog __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="BlurBackground = False";
__ref._blurbackground /*boolean*/  = __c.False;
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="If xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=26542083;
 //BA.debugLineNum = 26542083;BA.debugLine="BlurReduceScale = 3";
__ref._blurreducescale /*int*/  = (int) (3);
 }else 
{RDebugUtils.currentLine=26542084;
 //BA.debugLineNum = 26542084;BA.debugLine="Else If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=26542085;
 //BA.debugLineNum = 26542085;BA.debugLine="BlurReduceScale = 1";
__ref._blurreducescale /*int*/  = (int) (1);
 }else 
{RDebugUtils.currentLine=26542086;
 //BA.debugLineNum = 26542086;BA.debugLine="Else if xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=26542087;
 //BA.debugLineNum = 26542087;BA.debugLine="BlurReduceScale = 3";
__ref._blurreducescale /*int*/  = (int) (3);
 }}}
;
RDebugUtils.currentLine=26542089;
 //BA.debugLineNum = 26542089;BA.debugLine="mParent = Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=26542095;
 //BA.debugLineNum = 26542095;BA.debugLine="TitleBarFont = xui.CreateDefaultBoldFont(16)";
__ref._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=26542096;
 //BA.debugLineNum = 26542096;BA.debugLine="ButtonsFont = xui.CreateDefaultBoldFont(15)";
__ref._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (15));
RDebugUtils.currentLine=26542097;
 //BA.debugLineNum = 26542097;BA.debugLine="TitleBarTextColor = xui.Color_White";
__ref._titlebartextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=26542098;
 //BA.debugLineNum = 26542098;BA.debugLine="ButtonsState.Initialize";
__ref._buttonsstate /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=26542099;
 //BA.debugLineNum = 26542099;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _showtemplate(b4a.DesaWisataSaribu.b4xdialog __ref,Object _dialogtemplate,Object _yes,Object _no,Object _cancel) throws Exception{
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "showtemplate", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "showtemplate", new Object[] {_dialogtemplate,_yes,_no,_cancel}));}
ResumableSub_ShowTemplate rsub = new ResumableSub_ShowTemplate(this,__ref,_dialogtemplate,_yes,_no,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowTemplate extends BA.ResumableSub {
public ResumableSub_ShowTemplate(b4a.DesaWisataSaribu.b4xdialog parent,b4a.DesaWisataSaribu.b4xdialog __ref,Object _dialogtemplate,Object _yes,Object _no,Object _cancel) {
this.parent = parent;
this.__ref = __ref;
this._dialogtemplate = _dialogtemplate;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
this.__ref = parent;
}
b4a.DesaWisataSaribu.b4xdialog __ref;
b4a.DesaWisataSaribu.b4xdialog parent;
Object _dialogtemplate;
Object _yes;
Object _no;
Object _cancel;
anywheresoftware.b4a.objects.B4XViewWrapper _content = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="Dim content As B4XView = CallSub2(DialogTemplate,";
_content = new anywheresoftware.b4a.objects.B4XViewWrapper();
_content = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.CallSubDebug2(ba,_dialogtemplate,"GetPanel",parent)));
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="CallSub2(DialogTemplate, \"Show\", Me)";
parent.__c.CallSubDebug2(ba,_dialogtemplate,"Show",parent);
RDebugUtils.currentLine=26607619;
 //BA.debugLineNum = 26607619;BA.debugLine="Wait For (ShowCustom(content , Yes, No, Cancel))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdialog", "showtemplate"), __ref._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_content,_yes,_no,_cancel));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=26607620;
 //BA.debugLineNum = 26607620;BA.debugLine="CallSub2(DialogTemplate, \"DialogClosed\", Result)";
parent.__c.CallSubDebug2(ba,_dialogtemplate,"DialogClosed",(Object)(_result));
RDebugUtils.currentLine=26607621;
 //BA.debugLineNum = 26607621;BA.debugLine="PutAtTop = False";
__ref._putattop /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=26607622;
 //BA.debugLineNum = 26607622;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=26607623;
 //BA.debugLineNum = 26607623;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _close(b4a.DesaWisataSaribu.b4xdialog __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "close", true))
	 {return ((Boolean) Debug.delegate(ba, "close", new Object[] {_result}));}
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Public Sub Close (Result As Int) As Boolean";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="If getVisible Then";
if (__ref._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="CallSubDelayed2(Me, \"CloseMessage\", Result)";
__c.CallSubDelayed2(ba,this,"CloseMessage",(Object)(_result));
RDebugUtils.currentLine=27131907;
 //BA.debugLineNum = 27131907;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=27131909;
 //BA.debugLineNum = 27131909;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=27131910;
 //BA.debugLineNum = 27131910;BA.debugLine="End Sub";
return false;
}
public String  _background_click(b4a.DesaWisataSaribu.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "background_click", true))
	 {return ((String) Debug.delegate(ba, "background_click", null));}
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Private Sub Background_Click";
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="End Sub";
return "";
}
public String  _background_touch(b4a.DesaWisataSaribu.b4xdialog __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "background_touch", true))
	 {return ((String) Debug.delegate(ba, "background_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Private Sub Background_Touch (Action As Int, X As";
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="End Sub";
return "";
}
public b4a.example.bitmapcreator  _blur(b4a.DesaWisataSaribu.b4xdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "blur", true))
	 {return ((b4a.example.bitmapcreator) Debug.delegate(ba, "blur", new Object[] {_bmp}));}
b4a.example.bitmapcreator _bc = null;
int _reducescale = 0;
int _count = 0;
b4a.example.bitmapcreator._argbcolor[] _clrs = null;
b4a.example.bitmapcreator._argbcolor _temp = null;
int _m = 0;
int _steps = 0;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As BitmapCreat";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="Dim ReduceScale As Int = BlurReduceScale";
_reducescale = __ref._blurreducescale /*int*/ ;
RDebugUtils.currentLine=27459587;
 //BA.debugLineNum = 27459587;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scale";
_bc._initialize(ba,(int) (_bmp.getWidth()/(double)_reducescale/(double)_bmp.getScale()),(int) (_bmp.getHeight()/(double)_reducescale/(double)_bmp.getScale()));
RDebugUtils.currentLine=27459588;
 //BA.debugLineNum = 27459588;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
_bc._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=27459589;
 //BA.debugLineNum = 27459589;BA.debugLine="Dim count As Int = 2";
_count = (int) (2);
RDebugUtils.currentLine=27459590;
 //BA.debugLineNum = 27459590;BA.debugLine="Dim clrs(3) As ARGBColor";
_clrs = new b4a.example.bitmapcreator._argbcolor[(int) (3)];
{
int d0 = _clrs.length;
for (int i0 = 0;i0 < d0;i0++) {
_clrs[i0] = new b4a.example.bitmapcreator._argbcolor();
}
}
;
RDebugUtils.currentLine=27459591;
 //BA.debugLineNum = 27459591;BA.debugLine="Dim temp As ARGBColor";
_temp = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=27459592;
 //BA.debugLineNum = 27459592;BA.debugLine="Dim m As Int";
_m = 0;
RDebugUtils.currentLine=27459593;
 //BA.debugLineNum = 27459593;BA.debugLine="For steps = 1 To count";
{
final int step9 = 1;
final int limit9 = _count;
_steps = (int) (1) ;
for (;_steps <= limit9 ;_steps = _steps + step9 ) {
RDebugUtils.currentLine=27459594;
 //BA.debugLineNum = 27459594;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step10 = 1;
final int limit10 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit10 ;_y = _y + step10 ) {
RDebugUtils.currentLine=27459595;
 //BA.debugLineNum = 27459595;BA.debugLine="For x = 0 To 2";
{
final int step11 = 1;
final int limit11 = (int) (2);
_x = (int) (0) ;
for (;_x <= limit11 ;_x = _x + step11 ) {
RDebugUtils.currentLine=27459596;
 //BA.debugLineNum = 27459596;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
_bc._getargb(_x,_y,_clrs[_x]);
 }
};
RDebugUtils.currentLine=27459598;
 //BA.debugLineNum = 27459598;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
__ref._setavg /*String*/ (null,_bc,(int) (1),_y,_clrs,_temp);
RDebugUtils.currentLine=27459599;
 //BA.debugLineNum = 27459599;BA.debugLine="m = 0";
_m = (int) (0);
RDebugUtils.currentLine=27459600;
 //BA.debugLineNum = 27459600;BA.debugLine="For x = 2 To bc.mWidth - 2";
{
final int step16 = 1;
final int limit16 = (int) (_bc._mwidth-2);
_x = (int) (2) ;
for (;_x <= limit16 ;_x = _x + step16 ) {
RDebugUtils.currentLine=27459601;
 //BA.debugLineNum = 27459601;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
_bc._getargb((int) (_x+1),_y,_clrs[_m]);
RDebugUtils.currentLine=27459602;
 //BA.debugLineNum = 27459602;BA.debugLine="m = (m + 1) Mod 3";
_m = (int) ((_m+1)%3);
RDebugUtils.currentLine=27459603;
 //BA.debugLineNum = 27459603;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
__ref._setavg /*String*/ (null,_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
RDebugUtils.currentLine=27459606;
 //BA.debugLineNum = 27459606;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step22 = 1;
final int limit22 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit22 ;_x = _x + step22 ) {
RDebugUtils.currentLine=27459607;
 //BA.debugLineNum = 27459607;BA.debugLine="For y = 0 To 2";
{
final int step23 = 1;
final int limit23 = (int) (2);
_y = (int) (0) ;
for (;_y <= limit23 ;_y = _y + step23 ) {
RDebugUtils.currentLine=27459608;
 //BA.debugLineNum = 27459608;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
_bc._getargb(_x,_y,_clrs[_y]);
 }
};
RDebugUtils.currentLine=27459610;
 //BA.debugLineNum = 27459610;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
__ref._setavg /*String*/ (null,_bc,_x,(int) (1),_clrs,_temp);
RDebugUtils.currentLine=27459611;
 //BA.debugLineNum = 27459611;BA.debugLine="m = 0";
_m = (int) (0);
RDebugUtils.currentLine=27459612;
 //BA.debugLineNum = 27459612;BA.debugLine="For y = 2 To bc.mHeight - 2";
{
final int step28 = 1;
final int limit28 = (int) (_bc._mheight-2);
_y = (int) (2) ;
for (;_y <= limit28 ;_y = _y + step28 ) {
RDebugUtils.currentLine=27459613;
 //BA.debugLineNum = 27459613;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
_bc._getargb(_x,(int) (_y+1),_clrs[_m]);
RDebugUtils.currentLine=27459614;
 //BA.debugLineNum = 27459614;BA.debugLine="m = (m + 1) Mod 3";
_m = (int) ((_m+1)%3);
RDebugUtils.currentLine=27459615;
 //BA.debugLineNum = 27459615;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
__ref._setavg /*String*/ (null,_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 }
};
RDebugUtils.currentLine=27459619;
 //BA.debugLineNum = 27459619;BA.debugLine="Return bc";
if (true) return _bc;
RDebugUtils.currentLine=27459620;
 //BA.debugLineNum = 27459620;BA.debugLine="End Sub";
return null;
}
public String  _setavg(b4a.DesaWisataSaribu.b4xdialog __ref,b4a.example.bitmapcreator _bc,int _x,int _y,b4a.example.bitmapcreator._argbcolor[] _clrs,b4a.example.bitmapcreator._argbcolor _temp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "setavg", true))
	 {return ((String) Debug.delegate(ba, "setavg", new Object[] {_bc,_x,_y,_clrs,_temp}));}
b4a.example.bitmapcreator._argbcolor _c = null;
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="temp.Initialize";
_temp.Initialize();
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="For Each c As ARGBColor In clrs";
{
final b4a.example.bitmapcreator._argbcolor[] group2 = _clrs;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = group2[index2];
RDebugUtils.currentLine=27525123;
 //BA.debugLineNum = 27525123;BA.debugLine="temp.r = temp.r + c.r";
_temp.r = (int) (_temp.r+_c.r);
RDebugUtils.currentLine=27525124;
 //BA.debugLineNum = 27525124;BA.debugLine="temp.g = temp.g + c.g";
_temp.g = (int) (_temp.g+_c.g);
RDebugUtils.currentLine=27525125;
 //BA.debugLineNum = 27525125;BA.debugLine="temp.b = temp.b + c.b";
_temp.b = (int) (_temp.b+_c.b);
 }
};
RDebugUtils.currentLine=27525127;
 //BA.debugLineNum = 27525127;BA.debugLine="temp.a = 255";
_temp.a = (int) (255);
RDebugUtils.currentLine=27525128;
 //BA.debugLineNum = 27525128;BA.debugLine="temp.r = temp.r / 3";
_temp.r = (int) (_temp.r/(double)3);
RDebugUtils.currentLine=27525129;
 //BA.debugLineNum = 27525129;BA.debugLine="temp.g = temp.g / 3";
_temp.g = (int) (_temp.g/(double)3);
RDebugUtils.currentLine=27525130;
 //BA.debugLineNum = 27525130;BA.debugLine="temp.b = temp.b / 3";
_temp.b = (int) (_temp.b/(double)3);
RDebugUtils.currentLine=27525131;
 //BA.debugLineNum = 27525131;BA.debugLine="bc.SetARGB(x, y, temp)";
_bc._setargb(_x,_y,_temp);
RDebugUtils.currentLine=27525132;
 //BA.debugLineNum = 27525132;BA.debugLine="End Sub";
return "";
}
public String  _button_click(b4a.DesaWisataSaribu.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "button_click", true))
	 {return ((String) Debug.delegate(ba, "button_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Private Sub Button_Click";
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="Dim b As B4XView = Sender";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="If ButtonsState.GetDefault(b.Tag, True) = False T";
if ((__ref._buttonsstate /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault(_b.getTag(),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=27066371;
 //BA.debugLineNum = 27066371;BA.debugLine="Close(b.Tag)";
__ref._close /*boolean*/ (null,(int)(BA.ObjectToNumber(_b.getTag())));
RDebugUtils.currentLine=27066372;
 //BA.debugLineNum = 27066372;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.DesaWisataSaribu.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="Public ButtonsHeight As Int = 40dip";
_buttonsheight = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=26476547;
 //BA.debugLineNum = 26476547;BA.debugLine="Public TitleBarHeight As Int = 30dip";
_titlebarheight = __c.DipToCurrent((int) (30));
RDebugUtils.currentLine=26476548;
 //BA.debugLineNum = 26476548;BA.debugLine="Private ButtonWidth As Int = 80dip";
_buttonwidth = __c.DipToCurrent((int) (80));
RDebugUtils.currentLine=26476549;
 //BA.debugLineNum = 26476549;BA.debugLine="Public Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26476550;
 //BA.debugLineNum = 26476550;BA.debugLine="Public BackgroundColor As Int = 0xFF555555 'base";
_backgroundcolor = ((int)0xff555555);
RDebugUtils.currentLine=26476551;
 //BA.debugLineNum = 26476551;BA.debugLine="Public OverlayColor As Int = 0xaa000000";
_overlaycolor = ((int)0xaa000000);
RDebugUtils.currentLine=26476552;
 //BA.debugLineNum = 26476552;BA.debugLine="Public BorderColor As Int = 0xff000000";
_bordercolor = ((int)0xff000000);
RDebugUtils.currentLine=26476553;
 //BA.debugLineNum = 26476553;BA.debugLine="Public BorderCornersRadius As Int = 2dip";
_bordercornersradius = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=26476554;
 //BA.debugLineNum = 26476554;BA.debugLine="Public BorderWidth As Int = 2dip";
_borderwidth = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=26476555;
 //BA.debugLineNum = 26476555;BA.debugLine="Public ButtonsColor As Int = 0xFF555555";
_buttonscolor = ((int)0xff555555);
RDebugUtils.currentLine=26476556;
 //BA.debugLineNum = 26476556;BA.debugLine="Public ButtonsTextColor As Int = 0xFF89D5FF";
_buttonstextcolor = ((int)0xff89d5ff);
RDebugUtils.currentLine=26476557;
 //BA.debugLineNum = 26476557;BA.debugLine="Private Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26476558;
 //BA.debugLineNum = 26476558;BA.debugLine="Private BlurImageView As B4XView";
_blurimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26476559;
 //BA.debugLineNum = 26476559;BA.debugLine="Public BlurBackground As Boolean";
_blurbackground = false;
RDebugUtils.currentLine=26476560;
 //BA.debugLineNum = 26476560;BA.debugLine="Private BlurReduceScale As Int";
_blurreducescale = 0;
RDebugUtils.currentLine=26476561;
 //BA.debugLineNum = 26476561;BA.debugLine="Public mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26476562;
 //BA.debugLineNum = 26476562;BA.debugLine="Public Title As Object = \"\"";
_title = (Object)("");
RDebugUtils.currentLine=26476563;
 //BA.debugLineNum = 26476563;BA.debugLine="Public TitleBarColor As Int = 0xFF0083B8";
_titlebarcolor = ((int)0xff0083b8);
RDebugUtils.currentLine=26476564;
 //BA.debugLineNum = 26476564;BA.debugLine="Public TitleBarTextColor As Int";
_titlebartextcolor = 0;
RDebugUtils.currentLine=26476565;
 //BA.debugLineNum = 26476565;BA.debugLine="Public BodyTextColor As Int = xui.Color_White";
_bodytextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=26476566;
 //BA.debugLineNum = 26476566;BA.debugLine="Public TitleBar As B4XView";
_titlebar = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26476567;
 //BA.debugLineNum = 26476567;BA.debugLine="Public PutAtTop As Boolean";
_putattop = false;
RDebugUtils.currentLine=26476568;
 //BA.debugLineNum = 26476568;BA.debugLine="Public TitleBarFont As B4XFont";
_titlebarfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=26476569;
 //BA.debugLineNum = 26476569;BA.debugLine="Public ButtonsFont As B4XFont";
_buttonsfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=26476570;
 //BA.debugLineNum = 26476570;BA.debugLine="Public ButtonsTextColorDisabled As Int = 0xFF8080";
_buttonstextcolordisabled = ((int)0xff808080);
RDebugUtils.currentLine=26476571;
 //BA.debugLineNum = 26476571;BA.debugLine="Public VisibleAnimationDuration As Int = 100";
_visibleanimationduration = (int) (100);
RDebugUtils.currentLine=26476572;
 //BA.debugLineNum = 26476572;BA.debugLine="Public ButtonsOrder() As Int = Array As Int(xui.D";
_buttonsorder = new int[]{__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel};
RDebugUtils.currentLine=26476573;
 //BA.debugLineNum = 26476573;BA.debugLine="Public ButtonsState As Map";
_buttonsstate = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=26476574;
 //BA.debugLineNum = 26476574;BA.debugLine="End Sub";
return "";
}
public boolean  _getvisible(b4a.DesaWisataSaribu.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "getvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="Return Background.IsInitialized And Background.Pa";
if (true) return __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized();
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="End Sub";
return false;
}
public String  _createbutton(b4a.DesaWisataSaribu.b4xdialog __ref,Object _text,int _code) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "createbutton", true))
	 {return ((String) Debug.delegate(ba, "createbutton", new Object[] {_text,_code}));}
anywheresoftware.b4a.objects.LabelWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbtn = null;
int _numberofbuttons = 0;
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Private Sub CreateButton (Text As Object, Code As";
RDebugUtils.currentLine=26869761;
 //BA.debugLineNum = 26869761;BA.debugLine="If Text = \"\" Then Return";
if ((_text).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=26869765;
 //BA.debugLineNum = 26869765;BA.debugLine="Dim btn As Label";
_btn = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26869767;
 //BA.debugLineNum = 26869767;BA.debugLine="btn.Initialize(\"Button\")";
_btn.Initialize(ba,"Button");
RDebugUtils.currentLine=26869768;
 //BA.debugLineNum = 26869768;BA.debugLine="Dim xbtn As B4XView = btn";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()));
RDebugUtils.currentLine=26869769;
 //BA.debugLineNum = 26869769;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xbtn, Tex";
_xuiviewsutils._settextorcsbuildertolabel /*String*/ (ba,_xbtn,_text);
RDebugUtils.currentLine=26869770;
 //BA.debugLineNum = 26869770;BA.debugLine="xbtn.Tag = Code";
_xbtn.setTag((Object)(_code));
RDebugUtils.currentLine=26869771;
 //BA.debugLineNum = 26869771;BA.debugLine="xbtn.SetColorAndBorder(ButtonsColor, 0dip, Border";
_xbtn.SetColorAndBorder(__ref._buttonscolor /*int*/ ,__c.DipToCurrent((int) (0)),__ref._bordercolor /*int*/ ,__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=26869772;
 //BA.debugLineNum = 26869772;BA.debugLine="xbtn.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xbtn.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=26869773;
 //BA.debugLineNum = 26869773;BA.debugLine="xbtn.TextColor = ButtonsTextColor";
_xbtn.setTextColor(__ref._buttonstextcolor /*int*/ );
RDebugUtils.currentLine=26869774;
 //BA.debugLineNum = 26869774;BA.debugLine="xbtn.Font = ButtonsFont";
_xbtn.setFont(__ref._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=26869775;
 //BA.debugLineNum = 26869775;BA.debugLine="Dim numberOfButtons As Int = Base.NumberOfViews '";
_numberofbuttons = __ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews();
RDebugUtils.currentLine=26869776;
 //BA.debugLineNum = 26869776;BA.debugLine="Base.AddView(xbtn, Base.Width - 4dip - numberOfBu";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xbtn.getObject()),(int) (__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (4))-_numberofbuttons*(__ref._buttonwidth /*int*/ +__c.DipToCurrent((int) (5)))-__ref._buttonwidth /*int*/ ),(int) (__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._buttonsheight /*int*/ -__c.DipToCurrent((int) (4))),__ref._buttonwidth /*int*/ ,__ref._buttonsheight /*int*/ );
RDebugUtils.currentLine=26869778;
 //BA.debugLineNum = 26869778;BA.debugLine="If Code = xui.DialogResponse_Cancel Then xbtn.Req";
if (_code==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel) { 
_xbtn.RequestFocus();};
RDebugUtils.currentLine=26869779;
 //BA.debugLineNum = 26869779;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbutton(b4a.DesaWisataSaribu.b4xdialog __ref,int _resultcode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "getbutton", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbutton", new Object[] {_resultcode}));}
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Public Sub GetButton (ResultCode As Int) As B4XVie";
RDebugUtils.currentLine=26935297;
 //BA.debugLineNum = 26935297;BA.debugLine="For Each b As B4XView In Base.GetAllViewsRecursiv";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="If b.Tag = ResultCode Then Return b 'ignore";
if ((_b.getTag()).equals((Object)(_resultcode))) { 
if (true) return _b;};
 }
};
RDebugUtils.currentLine=26935300;
 //BA.debugLineNum = 26935300;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null));
RDebugUtils.currentLine=26935301;
 //BA.debugLineNum = 26935301;BA.debugLine="End Sub";
return null;
}
public String  _internaladdstubtoclvifneeded(b4a.DesaWisataSaribu.b4xdialog __ref,b4a.example3.customlistview _customlistview1,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "internaladdstubtoclvifneeded", true))
	 {return ((String) Debug.delegate(ba, "internaladdstubtoclvifneeded", new Object[] {_customlistview1,_color}));}
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Public Sub InternalAddStubToCLVIfNeeded(CustomList";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
_xuiviewsutils._addstubtoclvifneeded /*String*/ (ba,_customlistview1,_color);
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="End Sub";
return "";
}
public String  _internalsettextorcsbuildertolabel(b4a.DesaWisataSaribu.b4xdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "internalsettextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "internalsettextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Public Sub InternalSetTextOrCSBuilderToLabel(xlbl";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xlbl, Tex";
_xuiviewsutils._settextorcsbuildertolabel /*String*/ (ba,_xlbl,_text);
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4a.DesaWisataSaribu.b4xdialog __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
int _top = 0;
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Public Sub Resize (Width As Int, Height As Int)";
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="Dim Top As Int = Round(Background.Height / 2 - Ba";
_top = (int) (__c.Round(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=27328515;
 //BA.debugLineNum = 27328515;BA.debugLine="If PutAtTop Then Top = 20dip";
if (__ref._putattop /*boolean*/ ) { 
_top = __c.DipToCurrent((int) (20));};
RDebugUtils.currentLine=27328516;
 //BA.debugLineNum = 27328516;BA.debugLine="Background.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=27328517;
 //BA.debugLineNum = 27328517;BA.debugLine="Base.SetLayoutAnimated(200, Round(Background.Widt";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (200),(int) (__c.Round(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2)),_top,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=27328518;
 //BA.debugLineNum = 27328518;BA.debugLine="If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=27328519;
 //BA.debugLineNum = 27328519;BA.debugLine="UpdateBlur";
__ref._updateblur /*String*/ (null);
 };
RDebugUtils.currentLine=27328521;
 //BA.debugLineNum = 27328521;BA.debugLine="End Sub";
return "";
}
public String  _updateblur(b4a.DesaWisataSaribu.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "updateblur", true))
	 {return ((String) Debug.delegate(ba, "updateblur", null));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _source = null;
b4a.example.bitmapcreator _blurred = null;
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Private Sub UpdateBlur";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="If BlurBackground = False Then Return";
if (__ref._blurbackground /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="Background.Visible = False";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=27394051;
 //BA.debugLineNum = 27394051;BA.debugLine="Dim source As B4XBitmap = Background.Parent.Snaps";
_source = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_source = __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().Snapshot();
RDebugUtils.currentLine=27394052;
 //BA.debugLineNum = 27394052;BA.debugLine="If source.Width > Background.Width Or source.Heig";
if (_source.getWidth()>__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth() || _source.getHeight()>__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=27394053;
 //BA.debugLineNum = 27394053;BA.debugLine="source = source.Crop(0, 0, Background.Width, Bac";
_source = _source.Crop((int) (0),(int) (0),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=27394055;
 //BA.debugLineNum = 27394055;BA.debugLine="Background.Visible = True";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=27394056;
 //BA.debugLineNum = 27394056;BA.debugLine="BlurImageView.SetLayoutAnimated(0, 0, 0, Backgrou";
__ref._blurimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=27394057;
 //BA.debugLineNum = 27394057;BA.debugLine="Dim blurred As BitmapCreator = Blur(source)";
_blurred = __ref._blur /*b4a.example.bitmapcreator*/ (null,_source);
RDebugUtils.currentLine=27394058;
 //BA.debugLineNum = 27394058;BA.debugLine="blurred.SetBitmapToImageView(blurred.Bitmap, Blur";
_blurred._setbitmaptoimageview(_blurred._getbitmap(),__ref._blurimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=27394059;
 //BA.debugLineNum = 27394059;BA.debugLine="End Sub";
return "";
}
public String  _setbuttonstate(b4a.DesaWisataSaribu.b4xdialog __ref,int _resultcode,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "setbuttonstate", true))
	 {return ((String) Debug.delegate(ba, "setbuttonstate", new Object[] {_resultcode,_enabled}));}
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Public Sub SetButtonState (ResultCode As Int, Enab";
RDebugUtils.currentLine=27000833;
 //BA.debugLineNum = 27000833;BA.debugLine="Dim b As B4XView = GetButton(ResultCode)";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b = __ref._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_resultcode);
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="If b.IsInitialized Then";
if (_b.IsInitialized()) { 
RDebugUtils.currentLine=27000835;
 //BA.debugLineNum = 27000835;BA.debugLine="b.Enabled = Enabled";
_b.setEnabled(_enabled);
RDebugUtils.currentLine=27000836;
 //BA.debugLineNum = 27000836;BA.debugLine="If Enabled Then b.TextColor = ButtonsTextColor E";
if (_enabled) { 
_b.setTextColor(__ref._buttonstextcolor /*int*/ );}
else {
_b.setTextColor(__ref._buttonstextcolordisabled /*int*/ );};
RDebugUtils.currentLine=27000837;
 //BA.debugLineNum = 27000837;BA.debugLine="ButtonsState.Put(ResultCode, Enabled)";
__ref._buttonsstate /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_resultcode),(Object)(_enabled));
 };
RDebugUtils.currentLine=27000839;
 //BA.debugLineNum = 27000839;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _show(b4a.DesaWisataSaribu.b4xdialog __ref,Object _text,Object _yes,Object _no,Object _cancel) throws Exception{
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "show", new Object[] {_text,_yes,_no,_cancel}));}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_text,_yes,_no,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.DesaWisataSaribu.b4xdialog parent,b4a.DesaWisataSaribu.b4xdialog __ref,Object _text,Object _yes,Object _no,Object _cancel) {
this.parent = parent;
this.__ref = __ref;
this._text = _text;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
this.__ref = parent;
}
b4a.DesaWisataSaribu.b4xdialog __ref;
b4a.DesaWisataSaribu.b4xdialog parent;
Object _text;
Object _yes;
Object _no;
Object _cancel;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=26673155;
 //BA.debugLineNum = 26673155;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 300dip, 100dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=26673156;
 //BA.debugLineNum = 26673156;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26673157;
 //BA.debugLineNum = 26673157;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=26673161;
 //BA.debugLineNum = 26673161;BA.debugLine="lbl.SingleLine = False";
_lbl.setSingleLine(parent.__c.False);
RDebugUtils.currentLine=26673165;
 //BA.debugLineNum = 26673165;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=26673166;
 //BA.debugLineNum = 26673166;BA.debugLine="p.AddView(xlbl, 5dip, 0, p.Width - 10dip, p.Heigh";
_p.AddView((android.view.View)(_xlbl.getObject()),parent.__c.DipToCurrent((int) (5)),(int) (0),(int) (_p.getWidth()-parent.__c.DipToCurrent((int) (10))),_p.getHeight());
RDebugUtils.currentLine=26673167;
 //BA.debugLineNum = 26673167;BA.debugLine="xlbl.TextColor = BodyTextColor";
_xlbl.setTextColor(__ref._bodytextcolor /*int*/ );
RDebugUtils.currentLine=26673168;
 //BA.debugLineNum = 26673168;BA.debugLine="xlbl.Font = TitleBarFont";
_xlbl.setFont(__ref._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=26673169;
 //BA.debugLineNum = 26673169;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xlbl, Tex";
parent._xuiviewsutils._settextorcsbuildertolabel /*String*/ (ba,_xlbl,_text);
RDebugUtils.currentLine=26673170;
 //BA.debugLineNum = 26673170;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
_xlbl.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=26673171;
 //BA.debugLineNum = 26673171;BA.debugLine="Wait For (ShowCustom(p, Yes, No, Cancel)) Complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdialog", "show"), __ref._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,_yes,_no,_cancel));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=26673172;
 //BA.debugLineNum = 26673172;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=26673173;
 //BA.debugLineNum = 26673173;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _showcustom(b4a.DesaWisataSaribu.b4xdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _content,Object _yes,Object _no,Object _cancel) throws Exception{
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "showcustom", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "showcustom", new Object[] {_content,_yes,_no,_cancel}));}
ResumableSub_ShowCustom rsub = new ResumableSub_ShowCustom(this,__ref,_content,_yes,_no,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowCustom extends BA.ResumableSub {
public ResumableSub_ShowCustom(b4a.DesaWisataSaribu.b4xdialog parent,b4a.DesaWisataSaribu.b4xdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _content,Object _yes,Object _no,Object _cancel) {
this.parent = parent;
this.__ref = __ref;
this._content = _content;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
this.__ref = parent;
}
b4a.DesaWisataSaribu.b4xdialog __ref;
b4a.DesaWisataSaribu.b4xdialog parent;
anywheresoftware.b4a.objects.B4XViewWrapper _content;
Object _yes;
Object _no;
Object _cancel;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
boolean _includetitle = false;
int _temptitlebarheight = 0;
int _height = 0;
int _width = 0;
int _top = 0;
boolean _removetitle = false;
int _i = 0;
int _btype = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
int _result = 0;
anywheresoftware.b4a.BA.IterableList group1;
int index1;
int groupLen1;
int step46;
int limit46;
anywheresoftware.b4a.BA.IterableList group74;
int index74;
int groupLen74;
anywheresoftware.b4a.BA.IterableList group78;
int index78;
int groupLen78;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="For Each v As B4XView In mParent.GetAllViewsRecur";
if (true) break;

case 1:
//for
this.state = 8;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group1 = __ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index1 = 0;
groupLen1 = group1.getSize();
this.state = 60;
if (true) break;

case 60:
//C
this.state = 8;
if (index1 < groupLen1) {
this.state = 3;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));}
if (true) break;

case 61:
//C
this.state = 60;
index1++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="If v.Tag <> Null And v.Tag = \"b4xdialog_backgrou";
if (true) break;

case 4:
//if
this.state = 7;
if (_v.getTag()!= null && (_v.getTag()).equals((Object)("b4xdialog_background"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=26738691;
 //BA.debugLineNum = 26738691;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=26738692;
 //BA.debugLineNum = 26738692;BA.debugLine="Exit";
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 61;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=26738695;
 //BA.debugLineNum = 26738695;BA.debugLine="ButtonsState.Clear";
__ref._buttonsstate /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=26738696;
 //BA.debugLineNum = 26738696;BA.debugLine="Dim Background As B4XView = xui.CreatePanel(\"back";
parent._background = new anywheresoftware.b4a.objects.B4XViewWrapper();
parent._background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=26738697;
 //BA.debugLineNum = 26738697;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("b4xdialog_background"));
RDebugUtils.currentLine=26738698;
 //BA.debugLineNum = 26738698;BA.debugLine="If BlurBackground Then";
if (true) break;

case 9:
//if
this.state = 14;
if (__ref._blurbackground /*boolean*/ ) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=26738699;
 //BA.debugLineNum = 26738699;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=26738700;
 //BA.debugLineNum = 26738700;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=26738701;
 //BA.debugLineNum = 26738701;BA.debugLine="BlurImageView = iv";
__ref._blurimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=26738702;
 //BA.debugLineNum = 26738702;BA.debugLine="Background.AddView(BlurImageView, 0, 0, Backgrou";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._blurimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=26738703;
 //BA.debugLineNum = 26738703;BA.debugLine="Background.Color = xui.Color_Transparent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=26738705;
 //BA.debugLineNum = 26738705;BA.debugLine="Background.Color = OverlayColor";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._overlaycolor /*int*/ );
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=26738708;
 //BA.debugLineNum = 26738708;BA.debugLine="Dim p As Panel = Background";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=26738709;
 //BA.debugLineNum = 26738709;BA.debugLine="p.Elevation = 4dip";
_p.setElevation((float) (parent.__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=26738711;
 //BA.debugLineNum = 26738711;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=26738712;
 //BA.debugLineNum = 26738712;BA.debugLine="UpdateBlur";
__ref._updateblur /*String*/ (null);
RDebugUtils.currentLine=26738713;
 //BA.debugLineNum = 26738713;BA.debugLine="Base = xui.CreatePanel(\"\")";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=26738714;
 //BA.debugLineNum = 26738714;BA.debugLine="Base.SetColorAndBorder(BackgroundColor, BorderWid";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._backgroundcolor /*int*/ ,__ref._borderwidth /*int*/ ,__ref._bordercolor /*int*/ ,__ref._bordercornersradius /*int*/ );
RDebugUtils.currentLine=26738715;
 //BA.debugLineNum = 26738715;BA.debugLine="Base.RequestFocus";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=26738716;
 //BA.debugLineNum = 26738716;BA.debugLine="Dim IncludeTitle As Boolean = Title <> \"\"";
_includetitle = (__ref._title /*Object*/ ).equals((Object)("")) == false;
RDebugUtils.currentLine=26738717;
 //BA.debugLineNum = 26738717;BA.debugLine="Dim TempTitleBarHeight As Int = 0";
_temptitlebarheight = (int) (0);
RDebugUtils.currentLine=26738718;
 //BA.debugLineNum = 26738718;BA.debugLine="If IncludeTitle Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_includetitle) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=26738719;
 //BA.debugLineNum = 26738719;BA.debugLine="TempTitleBarHeight = TitleBarHeight";
_temptitlebarheight = __ref._titlebarheight /*int*/ ;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=26738721;
 //BA.debugLineNum = 26738721;BA.debugLine="Dim height As Int = Content.Height + ButtonsHeigh";
_height = (int) (_content.getHeight()+__ref._buttonsheight /*int*/ +parent.__c.DipToCurrent((int) (3))+parent.__c.DipToCurrent((int) (3))+_temptitlebarheight);
RDebugUtils.currentLine=26738722;
 //BA.debugLineNum = 26738722;BA.debugLine="Dim width As Int = Content.Width + 4dip";
_width = (int) (_content.getWidth()+parent.__c.DipToCurrent((int) (4)));
RDebugUtils.currentLine=26738723;
 //BA.debugLineNum = 26738723;BA.debugLine="Dim Top As Int = Round(Background.Height / 2 - he";
_top = (int) (parent.__c.Round(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_height/(double)2));
RDebugUtils.currentLine=26738724;
 //BA.debugLineNum = 26738724;BA.debugLine="Dim RemoveTitle As Boolean";
_removetitle = false;
RDebugUtils.currentLine=26738725;
 //BA.debugLineNum = 26738725;BA.debugLine="If PutAtTop Then";
if (true) break;

case 19:
//if
this.state = 28;
if (__ref._putattop /*boolean*/ ) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=26738726;
 //BA.debugLineNum = 26738726;BA.debugLine="Top = 20dip";
_top = parent.__c.DipToCurrent((int) (20));
RDebugUtils.currentLine=26738727;
 //BA.debugLineNum = 26738727;BA.debugLine="If Background.Height - Top - height < 200dip The";
if (true) break;

case 22:
//if
this.state = 27;
if (__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_top-_height<parent.__c.DipToCurrent((int) (200))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
_removetitle = parent.__c.True;
if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
;
RDebugUtils.currentLine=26738729;
 //BA.debugLineNum = 26738729;BA.debugLine="If RemoveTitle Or Background.Height < height Then";

case 28:
//if
this.state = 31;
if (_removetitle || __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()<_height) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=26738730;
 //BA.debugLineNum = 26738730;BA.debugLine="Top = 1dip";
_top = parent.__c.DipToCurrent((int) (1));
RDebugUtils.currentLine=26738731;
 //BA.debugLineNum = 26738731;BA.debugLine="IncludeTitle = False";
_includetitle = parent.__c.False;
RDebugUtils.currentLine=26738732;
 //BA.debugLineNum = 26738732;BA.debugLine="height = height - TempTitleBarHeight - 3dip";
_height = (int) (_height-_temptitlebarheight-parent.__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=26738733;
 //BA.debugLineNum = 26738733;BA.debugLine="TempTitleBarHeight = 0";
_temptitlebarheight = (int) (0);
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=26738735;
 //BA.debugLineNum = 26738735;BA.debugLine="Background.AddView(Base, Round(Background.Width /";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (parent.__c.Round(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-_width/(double)2)),_top,(int) (parent.__c.Round(_width)),(int) (parent.__c.Round(_height)));
RDebugUtils.currentLine=26738737;
 //BA.debugLineNum = 26738737;BA.debugLine="For i = ButtonsOrder.Length - 1 To 0 Step - 1";
if (true) break;

case 32:
//for
this.state = 43;
step46 = -1;
limit46 = (int) (0);
_i = (int) (__ref._buttonsorder /*int[]*/ .length-1) ;
this.state = 62;
if (true) break;

case 62:
//C
this.state = 43;
if ((step46 > 0 && _i <= limit46) || (step46 < 0 && _i >= limit46)) this.state = 34;
if (true) break;

case 63:
//C
this.state = 62;
_i = ((int)(0 + _i + step46)) ;
if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=26738738;
 //BA.debugLineNum = 26738738;BA.debugLine="Dim btype As Int = ButtonsOrder(i)";
_btype = __ref._buttonsorder /*int[]*/ [_i];
RDebugUtils.currentLine=26738739;
 //BA.debugLineNum = 26738739;BA.debugLine="Select btype";
if (true) break;

case 35:
//select
this.state = 42;
switch (BA.switchObjectToInt(_btype,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive)) {
case 0: {
this.state = 37;
if (true) break;
}
case 1: {
this.state = 39;
if (true) break;
}
case 2: {
this.state = 41;
if (true) break;
}
}
if (true) break;

case 37:
//C
this.state = 42;
RDebugUtils.currentLine=26738741;
 //BA.debugLineNum = 26738741;BA.debugLine="CreateButton(Cancel, btype)";
__ref._createbutton /*String*/ (null,_cancel,_btype);
 if (true) break;

case 39:
//C
this.state = 42;
RDebugUtils.currentLine=26738743;
 //BA.debugLineNum = 26738743;BA.debugLine="CreateButton(No, btype)";
__ref._createbutton /*String*/ (null,_no,_btype);
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=26738745;
 //BA.debugLineNum = 26738745;BA.debugLine="CreateButton(Yes, btype)";
__ref._createbutton /*String*/ (null,_yes,_btype);
 if (true) break;

case 42:
//C
this.state = 63;
;
 if (true) break;
if (true) break;

case 43:
//C
this.state = 44;
;
RDebugUtils.currentLine=26738748;
 //BA.debugLineNum = 26738748;BA.debugLine="Base.Visible = False";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=26738749;
 //BA.debugLineNum = 26738749;BA.debugLine="If IncludeTitle Then";
if (true) break;

case 44:
//if
this.state = 47;
if (_includetitle) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=26738750;
 //BA.debugLineNum = 26738750;BA.debugLine="TitleBar = xui.CreatePanel(\"TitleBar\")";
__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TitleBar");
RDebugUtils.currentLine=26738751;
 //BA.debugLineNum = 26738751;BA.debugLine="TitleBar.Color = TitleBarColor";
__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._titlebarcolor /*int*/ );
RDebugUtils.currentLine=26738752;
 //BA.debugLineNum = 26738752;BA.debugLine="Base.AddView(TitleBar, 2dip, 2dip, Content.Width";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),parent.__c.DipToCurrent((int) (2)),parent.__c.DipToCurrent((int) (2)),_content.getWidth(),_temptitlebarheight);
RDebugUtils.currentLine=26738753;
 //BA.debugLineNum = 26738753;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26738754;
 //BA.debugLineNum = 26738754;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=26738755;
 //BA.debugLineNum = 26738755;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=26738756;
 //BA.debugLineNum = 26738756;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xlbl, Ti";
parent._xuiviewsutils._settextorcsbuildertolabel /*String*/ (ba,_xlbl,__ref._title /*Object*/ );
RDebugUtils.currentLine=26738757;
 //BA.debugLineNum = 26738757;BA.debugLine="xlbl.TextColor = TitleBarTextColor";
_xlbl.setTextColor(__ref._titlebartextcolor /*int*/ );
RDebugUtils.currentLine=26738758;
 //BA.debugLineNum = 26738758;BA.debugLine="xlbl.Font = TitleBarFont";
_xlbl.setFont(__ref._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=26738759;
 //BA.debugLineNum = 26738759;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=26738760;
 //BA.debugLineNum = 26738760;BA.debugLine="TitleBar.AddView(xlbl, 0, 0, TitleBar.Width, Tit";
__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl.getObject()),(int) (0),(int) (0),__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=26738762;
 //BA.debugLineNum = 26738762;BA.debugLine="Content.RemoveViewFromParent";
_content.RemoveViewFromParent();
RDebugUtils.currentLine=26738763;
 //BA.debugLineNum = 26738763;BA.debugLine="Base.AddView(Content, 2dip, 2dip + TempTitleBarHe";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_content.getObject()),parent.__c.DipToCurrent((int) (2)),(int) (parent.__c.DipToCurrent((int) (2))+_temptitlebarheight),_content.getWidth(),_content.getHeight());
RDebugUtils.currentLine=26738764;
 //BA.debugLineNum = 26738764;BA.debugLine="Base.SetVisibleAnimated(VisibleAnimationDuration,";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(__ref._visibleanimationduration /*int*/ ,parent.__c.True);
RDebugUtils.currentLine=26738765;
 //BA.debugLineNum = 26738765;BA.debugLine="For Each v As B4XView In Background.GetAllViewsRe";
if (true) break;

case 48:
//for
this.state = 51;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group74 = __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index74 = 0;
groupLen74 = group74.getSize();
this.state = 64;
if (true) break;

case 64:
//C
this.state = 51;
if (index74 < groupLen74) {
this.state = 50;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group74.Get(index74)));}
if (true) break;

case 65:
//C
this.state = 64;
index74++;
if (true) break;

case 50:
//C
this.state = 65;
RDebugUtils.currentLine=26738766;
 //BA.debugLineNum = 26738766;BA.debugLine="v.Enabled = True";
_v.setEnabled(parent.__c.True);
 if (true) break;
if (true) break;

case 51:
//C
this.state = 52;
;
RDebugUtils.currentLine=26738768;
 //BA.debugLineNum = 26738768;BA.debugLine="Wait For CloseMessage (Result As Int)";
parent.__c.WaitFor("closemessage", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdialog", "showcustom"), null);
this.state = 66;
return;
case 66:
//C
this.state = 52;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=26738769;
 //BA.debugLineNum = 26738769;BA.debugLine="For Each v As B4XView In Background.GetAllViewsRe";
if (true) break;

case 52:
//for
this.state = 55;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group78 = __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index78 = 0;
groupLen78 = group78.getSize();
this.state = 67;
if (true) break;

case 67:
//C
this.state = 55;
if (index78 < groupLen78) {
this.state = 54;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group78.Get(index78)));}
if (true) break;

case 68:
//C
this.state = 67;
index78++;
if (true) break;

case 54:
//C
this.state = 68;
RDebugUtils.currentLine=26738770;
 //BA.debugLineNum = 26738770;BA.debugLine="v.Enabled = False";
_v.setEnabled(parent.__c.False);
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
;
RDebugUtils.currentLine=26738772;
 //BA.debugLineNum = 26738772;BA.debugLine="Base.SetVisibleAnimated(VisibleAnimationDuration,";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(__ref._visibleanimationduration /*int*/ ,parent.__c.False);
RDebugUtils.currentLine=26738773;
 //BA.debugLineNum = 26738773;BA.debugLine="If VisibleAnimationDuration > 0 Then";
if (true) break;

case 56:
//if
this.state = 59;
if (__ref._visibleanimationduration /*int*/ >0) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=26738774;
 //BA.debugLineNum = 26738774;BA.debugLine="Sleep(VisibleAnimationDuration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdialog", "showcustom"),__ref._visibleanimationduration /*int*/ );
this.state = 69;
return;
case 69:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = -1;
;
RDebugUtils.currentLine=26738776;
 //BA.debugLineNum = 26738776;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=26738777;
 //BA.debugLineNum = 26738777;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=26738778;
 //BA.debugLineNum = 26738778;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _stub_click(b4a.DesaWisataSaribu.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "stub_click", true))
	 {return ((String) Debug.delegate(ba, "stub_click", null));}
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Private Sub Stub_Click";
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="End Sub";
return "";
}
}