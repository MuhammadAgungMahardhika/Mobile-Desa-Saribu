package b4a.DesaWisataSaribu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xlisttemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSaribu.b4xlisttemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSaribu.b4xlisttemplate.class).invoke(this, new Object[] {null});
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
public b4a.example3.customlistview _customlistview1 = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public String _selecteditem = "";
public b4a.DesaWisataSaribu.b4xdialog _xdialog = null;
public boolean _allowmultiselection = false;
public int _selectioncolor = 0;
public anywheresoftware.b4a.objects.collections.List _selecteditems = null;
public int _multiselectionminimum = 0;
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
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.DesaWisataSaribu.b4xlisttemplate __ref,b4a.DesaWisataSaribu.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="End Sub";
return null;
}
public void  _show(b4a.DesaWisataSaribu.b4xlisttemplate __ref,b4a.DesaWisataSaribu.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.DesaWisataSaribu.b4xlisttemplate parent,b4a.DesaWisataSaribu.b4xlisttemplate __ref,b4a.DesaWisataSaribu.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4a.DesaWisataSaribu.b4xlisttemplate __ref;
b4a.DesaWisataSaribu.b4xlisttemplate parent;
b4a.DesaWisataSaribu.b4xdialog _dialog;
Object _opt = null;
int _i = 0;
b4a.example3.customlistview._clvitem _item = null;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;
int step8;
int limit8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xlisttemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4a.DesaWisataSaribu.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=31784963;
 //BA.debugLineNum = 31784963;BA.debugLine="For Each opt As Object In Options";
if (true) break;

case 1:
//for
this.state = 4;
group3 = __ref._options /*anywheresoftware.b4a.objects.collections.List*/ ;
index3 = 0;
groupLen3 = group3.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 4;
if (index3 < groupLen3) {
this.state = 3;
_opt = group3.Get(index3);}
if (true) break;

case 13:
//C
this.state = 12;
index3++;
if (true) break;

case 3:
//C
this.state = 13;
RDebugUtils.currentLine=31784964;
 //BA.debugLineNum = 31784964;BA.debugLine="CustomListView1.AddTextItem(opt, opt)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._addtextitem(_opt,_opt);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=31784966;
 //BA.debugLineNum = 31784966;BA.debugLine="If AllowMultiSelection Then";

case 4:
//if
this.state = 11;
if (__ref._allowmultiselection /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=31784967;
 //BA.debugLineNum = 31784967;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xlisttemplate", "show"),(int) (20));
this.state = 14;
return;
case 14:
//C
this.state = 7;
;
RDebugUtils.currentLine=31784968;
 //BA.debugLineNum = 31784968;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
if (true) break;

case 7:
//for
this.state = 10;
step8 = 1;
limit8 = (int) (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if ((step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8)) this.state = 9;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step8)) ;
if (true) break;

case 9:
//C
this.state = 16;
RDebugUtils.currentLine=31784969;
 //BA.debugLineNum = 31784969;BA.debugLine="Dim item As CLVItem = CustomListView1.GetRawLis";
_item = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=31784970;
 //BA.debugLineNum = 31784970;BA.debugLine="SelectItem (item, False)";
__ref._selectitem /*String*/ (null,_item,parent.__c.False);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=31784973;
 //BA.debugLineNum = 31784973;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
parent._xuiviewsutils._addstubtoclvifneeded /*String*/ (ba,__ref._customlistview1 /*b4a.example3.customlistview*/ ,__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor);
RDebugUtils.currentLine=31784974;
 //BA.debugLineNum = 31784974;BA.debugLine="SelectedItem = \"\"";
__ref._selecteditem /*String*/  = "";
RDebugUtils.currentLine=31784976;
 //BA.debugLineNum = 31784976;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(b4a.DesaWisataSaribu.b4xlisttemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.DesaWisataSaribu.b4xlisttemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=31522817;
 //BA.debugLineNum = 31522817;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31522819;
 //BA.debugLineNum = 31522819;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
RDebugUtils.currentLine=31522820;
 //BA.debugLineNum = 31522820;BA.debugLine="Public Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31522821;
 //BA.debugLineNum = 31522821;BA.debugLine="Public SelectedItem As String";
_selecteditem = "";
RDebugUtils.currentLine=31522822;
 //BA.debugLineNum = 31522822;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4a.DesaWisataSaribu.b4xdialog();
RDebugUtils.currentLine=31522823;
 //BA.debugLineNum = 31522823;BA.debugLine="Public AllowMultiSelection As Boolean";
_allowmultiselection = false;
RDebugUtils.currentLine=31522824;
 //BA.debugLineNum = 31522824;BA.debugLine="Public SelectionColor As Int = 0xAA0086FF";
_selectioncolor = ((int)0xaa0086ff);
RDebugUtils.currentLine=31522825;
 //BA.debugLineNum = 31522825;BA.debugLine="Public SelectedItems As List";
_selecteditems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31522826;
 //BA.debugLineNum = 31522826;BA.debugLine="Public MultiSelectionMinimum As Int = 0";
_multiselectionminimum = (int) (0);
RDebugUtils.currentLine=31522827;
 //BA.debugLineNum = 31522827;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(b4a.DesaWisataSaribu.b4xlisttemplate __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", true))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_index,_value}));}
b4a.example3.customlistview._clvitem _item = null;
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="If AllowMultiSelection Then";
if (__ref._allowmultiselection /*boolean*/ ) { 
RDebugUtils.currentLine=31916035;
 //BA.debugLineNum = 31916035;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getrawlistitem(_index);
RDebugUtils.currentLine=31916036;
 //BA.debugLineNum = 31916036;BA.debugLine="SelectItem (Item, True)";
__ref._selectitem /*String*/ (null,_item,__c.True);
 }else {
RDebugUtils.currentLine=31916038;
 //BA.debugLineNum = 31916038;BA.debugLine="SelectedItem = Value";
__ref._selecteditem /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=31916039;
 //BA.debugLineNum = 31916039;BA.debugLine="SelectedItems.Clear";
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=31916040;
 //BA.debugLineNum = 31916040;BA.debugLine="SelectedItems.Add(Value)";
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Add(_value);
RDebugUtils.currentLine=31916041;
 //BA.debugLineNum = 31916041;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*b4a.DesaWisataSaribu.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
 };
RDebugUtils.currentLine=31916043;
 //BA.debugLineNum = 31916043;BA.debugLine="End Sub";
return "";
}
public String  _selectitem(b4a.DesaWisataSaribu.b4xlisttemplate __ref,b4a.example3.customlistview._clvitem _item,boolean _toggle) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "selectitem", true))
	 {return ((String) Debug.delegate(ba, "selectitem", new Object[] {_item,_toggle}));}
int _index = 0;
boolean _selected = false;
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Private Sub SelectItem (Item As CLVItem, Toggle As";
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="Dim index As Int = SelectedItems.IndexOf(Item.Val";
_index = __ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_item.Value);
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="Dim Selected As Boolean = index > -1";
_selected = _index>-1;
RDebugUtils.currentLine=31850499;
 //BA.debugLineNum = 31850499;BA.debugLine="If Toggle Then Selected = Not(Selected)";
if (_toggle) { 
_selected = __c.Not(_selected);};
RDebugUtils.currentLine=31850500;
 //BA.debugLineNum = 31850500;BA.debugLine="If Selected Then";
if (_selected) { 
RDebugUtils.currentLine=31850501;
 //BA.debugLineNum = 31850501;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = Selection";
if (__c.Not(_toggle)) { 
_item.Panel.setColor(__ref._selectioncolor /*int*/ );};
RDebugUtils.currentLine=31850502;
 //BA.debugLineNum = 31850502;BA.debugLine="Item.Color = CustomListView1.DefaultTextBackgrou";
_item.Color = __ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor;
RDebugUtils.currentLine=31850503;
 //BA.debugLineNum = 31850503;BA.debugLine="If index = -1 Then SelectedItems.Add(Item.Value)";
if (_index==-1) { 
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Add(_item.Value);};
 }else {
RDebugUtils.currentLine=31850505;
 //BA.debugLineNum = 31850505;BA.debugLine="Item.Color = SelectionColor";
_item.Color = __ref._selectioncolor /*int*/ ;
RDebugUtils.currentLine=31850506;
 //BA.debugLineNum = 31850506;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = CustomLis";
if (__c.Not(_toggle)) { 
_item.Panel.setColor(__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor);};
RDebugUtils.currentLine=31850507;
 //BA.debugLineNum = 31850507;BA.debugLine="If index > -1 Then SelectedItems.RemoveAt(index)";
if (_index>-1) { 
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);};
 };
RDebugUtils.currentLine=31850509;
 //BA.debugLineNum = 31850509;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
__ref._xdialog /*b4a.DesaWisataSaribu.b4xdialog*/ ._setbuttonstate /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=__ref._multiselectionminimum /*int*/ );
RDebugUtils.currentLine=31850510;
 //BA.debugLineNum = 31850510;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.DesaWisataSaribu.b4xlisttemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListTemplate",ba);
RDebugUtils.currentLine=31588356;
 //BA.debugLineNum = 31588356;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=31588357;
 //BA.debugLineNum = 31588357;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=31588358;
 //BA.debugLineNum = 31588358;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff555555);
RDebugUtils.currentLine=31588359;
 //BA.debugLineNum = 31588359;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=31588364;
 //BA.debugLineNum = 31588364;BA.debugLine="Options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=31588365;
 //BA.debugLineNum = 31588365;BA.debugLine="SelectedItems.Initialize";
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=31588366;
 //BA.debugLineNum = 31588366;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4a.DesaWisataSaribu.b4xlisttemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=31653891;
 //BA.debugLineNum = 31653891;BA.debugLine="End Sub";
return "";
}
}