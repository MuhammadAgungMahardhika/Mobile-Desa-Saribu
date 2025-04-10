package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xtimedtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSaribu.b4xtimedtemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSaribu.b4xtimedtemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4a.DesaWisataSaribu.anotherprogressbar _anotherprogressbar1 = null;
public Object _mtemplate = null;
public int _timeoutmilliseconds = 0;
public int _index = 0;
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
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.DesaWisataSaribu.b4xtimedtemplate __ref,b4a.DesaWisataSaribu.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtimedtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
anywheresoftware.b4a.objects.B4XViewWrapper _innerpanel = null;
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=36896769;
 //BA.debugLineNum = 36896769;BA.debugLine="If mBase.NumberOfViews = 0 Then";
if (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="Dim InnerPanel As B4XView = CallSub2(mTemplate,";
_innerpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_innerpanel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.CallSubDebug2(ba,__ref._mtemplate /*Object*/ ,"GetPanel",(Object)(_dialog))));
RDebugUtils.currentLine=36896771;
 //BA.debugLineNum = 36896771;BA.debugLine="If InnerPanel.Parent.IsInitialized Then InnerPan";
if (_innerpanel.getParent().IsInitialized()) { 
_innerpanel.RemoveViewFromParent();};
RDebugUtils.currentLine=36896772;
 //BA.debugLineNum = 36896772;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, InnerPanel.Widt";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_innerpanel.getWidth(),(int) (_innerpanel.getHeight()+__c.DipToCurrent((int) (19))));
RDebugUtils.currentLine=36896773;
 //BA.debugLineNum = 36896773;BA.debugLine="mBase.LoadLayout(\"TimedDialogTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("TimedDialogTemplate",ba);
RDebugUtils.currentLine=36896774;
 //BA.debugLineNum = 36896774;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=36896775;
 //BA.debugLineNum = 36896775;BA.debugLine="mBase.AddView(InnerPanel, 0, 19dip, InnerPanel.W";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_innerpanel.getObject()),(int) (0),__c.DipToCurrent((int) (19)),_innerpanel.getWidth(),_innerpanel.getHeight());
 };
RDebugUtils.currentLine=36896777;
 //BA.debugLineNum = 36896777;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=36896778;
 //BA.debugLineNum = 36896778;BA.debugLine="End Sub";
return null;
}
public void  _show(b4a.DesaWisataSaribu.b4xtimedtemplate __ref,b4a.DesaWisataSaribu.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xtimedtemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.DesaWisataSaribu.b4xtimedtemplate parent,b4a.DesaWisataSaribu.b4xtimedtemplate __ref,b4a.DesaWisataSaribu.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4a.DesaWisataSaribu.b4xtimedtemplate __ref;
b4a.DesaWisataSaribu.b4xtimedtemplate parent;
b4a.DesaWisataSaribu.b4xdialog _dialog;
int _myindex = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtimedtemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=36962305;
 //BA.debugLineNum = 36962305;BA.debugLine="CallSub2(mTemplate, \"Show\", Dialog)";
parent.__c.CallSubDebug2(ba,__ref._mtemplate /*Object*/ ,"Show",(Object)(_dialog));
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="AnotherProgressBar1.SetValueNoAnimation(0)";
__ref._anotherprogressbar1 /*b4a.DesaWisataSaribu.anotherprogressbar*/ ._setvaluenoanimation /*String*/ (null,(int) (0));
RDebugUtils.currentLine=36962307;
 //BA.debugLineNum = 36962307;BA.debugLine="AnotherProgressBar1.ValueChangePerSecond = 100 /";
__ref._anotherprogressbar1 /*b4a.DesaWisataSaribu.anotherprogressbar*/ ._valuechangepersecond /*float*/  = (float) (100/(double)(__ref._timeoutmilliseconds /*int*/ /(double)1000));
RDebugUtils.currentLine=36962308;
 //BA.debugLineNum = 36962308;BA.debugLine="AnotherProgressBar1.Value = 100";
__ref._anotherprogressbar1 /*b4a.DesaWisataSaribu.anotherprogressbar*/ ._setvalue /*int*/ (null,(int) (100));
RDebugUtils.currentLine=36962309;
 //BA.debugLineNum = 36962309;BA.debugLine="Index = Index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=36962310;
 //BA.debugLineNum = 36962310;BA.debugLine="Dim MyIndex As Int = Index";
_myindex = __ref._index /*int*/ ;
RDebugUtils.currentLine=36962311;
 //BA.debugLineNum = 36962311;BA.debugLine="Sleep(TimeoutMilliseconds)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtimedtemplate", "show"),__ref._timeoutmilliseconds /*int*/ );
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=36962312;
 //BA.debugLineNum = 36962312;BA.debugLine="If MyIndex = Index Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_myindex==__ref._index /*int*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=36962313;
 //BA.debugLineNum = 36962313;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
_dialog._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=36962315;
 //BA.debugLineNum = 36962315;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(b4a.DesaWisataSaribu.b4xtimedtemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtimedtemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Private Sub DialogClosed(Result As Int)";
RDebugUtils.currentLine=37027841;
 //BA.debugLineNum = 37027841;BA.debugLine="Index = Index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="CallSub2(mTemplate, \"DialogClosed\", Result)";
__c.CallSubDebug2(ba,__ref._mtemplate /*Object*/ ,"DialogClosed",(Object)(_result));
RDebugUtils.currentLine=37027843;
 //BA.debugLineNum = 37027843;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.DesaWisataSaribu.b4xtimedtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtimedtemplate";
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=36765697;
 //BA.debugLineNum = 36765697;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36765699;
 //BA.debugLineNum = 36765699;BA.debugLine="Private AnotherProgressBar1 As AnotherProgressBar";
_anotherprogressbar1 = new b4a.DesaWisataSaribu.anotherprogressbar();
RDebugUtils.currentLine=36765700;
 //BA.debugLineNum = 36765700;BA.debugLine="Private mTemplate As Object";
_mtemplate = new Object();
RDebugUtils.currentLine=36765701;
 //BA.debugLineNum = 36765701;BA.debugLine="Public TimeoutMilliseconds As Int = 10000";
_timeoutmilliseconds = (int) (10000);
RDebugUtils.currentLine=36765702;
 //BA.debugLineNum = 36765702;BA.debugLine="Private Index As Int";
_index = 0;
RDebugUtils.currentLine=36765703;
 //BA.debugLineNum = 36765703;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.DesaWisataSaribu.b4xtimedtemplate __ref,anywheresoftware.b4a.BA _ba,Object _innertemplate) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xtimedtemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_innertemplate}));}
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Public Sub Initialize (InnerTemplate As Object)";
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="mTemplate = InnerTemplate";
__ref._mtemplate /*Object*/  = _innertemplate;
RDebugUtils.currentLine=36831236;
 //BA.debugLineNum = 36831236;BA.debugLine="End Sub";
return "";
}
}