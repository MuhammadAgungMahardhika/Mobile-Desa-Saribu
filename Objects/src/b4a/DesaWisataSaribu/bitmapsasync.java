package b4a.DesaWisataSaribu;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.*;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bitmapsasync extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.DesaWisataSaribu.bitmapsasync");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSaribu.bitmapsasync.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.JavaObject _jme = null;
public long _maxfilesize = 0L;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
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
public String  _initialize(b4a.DesaWisataSaribu.bitmapsasync __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bitmapsasync";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="jme = Me";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _loadfromfile(b4a.DesaWisataSaribu.bitmapsasync __ref,String _dir,String _filename,int _maxwidth,int _maxheight) throws Exception{
RDebugUtils.currentModule="bitmapsasync";
if (Debug.shouldDelegate(ba, "loadfromfile", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "loadfromfile", new Object[] {_dir,_filename,_maxwidth,_maxheight}));}
ResumableSub_LoadFromFile rsub = new ResumableSub_LoadFromFile(this,__ref,_dir,_filename,_maxwidth,_maxheight);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_LoadFromFile extends BA.ResumableSub {
public ResumableSub_LoadFromFile(b4a.DesaWisataSaribu.bitmapsasync parent,b4a.DesaWisataSaribu.bitmapsasync __ref,String _dir,String _filename,int _maxwidth,int _maxheight) {
this.parent = parent;
this.__ref = __ref;
this._dir = _dir;
this._filename = _filename;
this._maxwidth = _maxwidth;
this._maxheight = _maxheight;
this.__ref = parent;
}
b4a.DesaWisataSaribu.bitmapsasync __ref;
b4a.DesaWisataSaribu.bitmapsasync parent;
String _dir;
String _filename;
int _maxwidth;
int _maxheight;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _res = null;
Object _sf = null;
boolean _success = false;
Object _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="bitmapsasync";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="Dim res As B4XBitmap";
_res = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="If Dir <> File.DirAssets Then";
if (true) break;

case 1:
//if
this.state = 8;
if ((_dir).equals(parent.__c.File.getDirAssets()) == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="If File.Size(Dir, Filename) > MaxFileSize Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent.__c.File.Size(_dir,_filename)>__ref._maxfilesize /*long*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="Log($\"File larger than MaxFileSize $1.0{File.Si";
parent.__c.LogImpl("916187396",("File larger than MaxFileSize "+parent.__c.SmartStringFormatter("1.0",(Object)(parent.__c.File.Size(_dir,_filename)))+""),0);
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="Return res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=16187408;
 //BA.debugLineNum = 16187408;BA.debugLine="Dim sf As Object = jme.RunMethod(\"loadBitmap\", Ar";
_sf = __ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("loadBitmap",new Object[]{(Object)(parent.__c.File.OpenInput(_dir,_filename).getObject()),(Object)(parent.__c.File.OpenInput(_dir,_filename).getObject()),(Object)(_maxwidth),(Object)(_maxheight)});
RDebugUtils.currentLine=16187409;
 //BA.debugLineNum = 16187409;BA.debugLine="Wait For (sf) Bitmap_Loaded (Success As Boolean,";
parent.__c.WaitFor("bitmap_loaded", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bitmapsasync", "loadfromfile"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 9;
_success = (Boolean) result[1];
_bmp = (Object) result[2];
;
RDebugUtils.currentLine=16187414;
 //BA.debugLineNum = 16187414;BA.debugLine="If Success Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_success) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=16187415;
 //BA.debugLineNum = 16187415;BA.debugLine="res = Bmp";
_res = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bmp));
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=16187417;
 //BA.debugLineNum = 16187417;BA.debugLine="Return res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
RDebugUtils.currentLine=16187419;
 //BA.debugLineNum = 16187419;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _loadfromhttpjob(b4a.DesaWisataSaribu.bitmapsasync __ref,b4a.DesaWisataSaribu.httpjob _job,int _maxwidth,int _maxheight) throws Exception{
RDebugUtils.currentModule="bitmapsasync";
if (Debug.shouldDelegate(ba, "loadfromhttpjob", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "loadfromhttpjob", new Object[] {_job,_maxwidth,_maxheight}));}
ResumableSub_LoadFromHttpJob rsub = new ResumableSub_LoadFromHttpJob(this,__ref,_job,_maxwidth,_maxheight);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_LoadFromHttpJob extends BA.ResumableSub {
public ResumableSub_LoadFromHttpJob(b4a.DesaWisataSaribu.bitmapsasync parent,b4a.DesaWisataSaribu.bitmapsasync __ref,b4a.DesaWisataSaribu.httpjob _job,int _maxwidth,int _maxheight) {
this.parent = parent;
this.__ref = __ref;
this._job = _job;
this._maxwidth = _maxwidth;
this._maxheight = _maxheight;
this.__ref = parent;
}
b4a.DesaWisataSaribu.bitmapsasync __ref;
b4a.DesaWisataSaribu.bitmapsasync parent;
b4a.DesaWisataSaribu.httpjob _job;
int _maxwidth;
int _maxheight;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _res = null;
Object _sf = null;
boolean _success = false;
Object _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="bitmapsasync";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="Dim res As B4XBitmap";
_res = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="If Job.Success = False Then Return res";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="If Job.Response.ContentLength >= MaxFileSize Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getContentLength()>=__ref._maxfilesize /*long*/ ) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="Log($\"File larger than MaxFileSize $1.0{Job.Resp";
parent.__c.LogImpl("916121860",("File larger than MaxFileSize "+parent.__c.SmartStringFormatter("1.0",(Object)(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getContentLength()))+""),0);
RDebugUtils.currentLine=16121861;
 //BA.debugLineNum = 16121861;BA.debugLine="Return res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=16121871;
 //BA.debugLineNum = 16121871;BA.debugLine="Dim sf As Object = jme.RunMethod(\"loadBitmap\", Ar";
_sf = __ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("loadBitmap",new Object[]{(Object)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(Object)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(Object)(_maxwidth),(Object)(_maxheight)});
RDebugUtils.currentLine=16121872;
 //BA.debugLineNum = 16121872;BA.debugLine="Wait For (sf) Bitmap_Loaded (Success As Boolean,";
parent.__c.WaitFor("bitmap_loaded", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bitmapsasync", "loadfromhttpjob"), _sf);
this.state = 15;
return;
case 15:
//C
this.state = 11;
_success = (Boolean) result[1];
_bmp = (Object) result[2];
;
RDebugUtils.currentLine=16121877;
 //BA.debugLineNum = 16121877;BA.debugLine="If Success Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_success) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=16121878;
 //BA.debugLineNum = 16121878;BA.debugLine="res = Bmp";
_res = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bmp));
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=16121880;
 //BA.debugLineNum = 16121880;BA.debugLine="Return res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
RDebugUtils.currentLine=16121882;
 //BA.debugLineNum = 16121882;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.DesaWisataSaribu.bitmapsasync __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bitmapsasync";
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="Private jme As JavaObject";
_jme = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=15990790;
 //BA.debugLineNum = 15990790;BA.debugLine="Public MaxFileSize As Long = 3 * 1024 * 1024";
_maxfilesize = (long) (3*1024*1024);
RDebugUtils.currentLine=15990791;
 //BA.debugLineNum = 15990791;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=15990792;
 //BA.debugLineNum = 15990792;BA.debugLine="End Sub";
return "";
}
public Object loadBitmap(final InputStream in1, final InputStream in2, final int MaxWidth, final int MaxHeight) {
	Object sender = new Object();
	BA.runAsync(getBA(), sender, "bitmap_loaded", new Object[] {false, null}, 
		new Callable<Object[]>() {
			public Object[] call() throws Exception {
				try {
				Options o = new Options();
				o.inJustDecodeBounds = true;
				BitmapFactory.decodeStream(in1, null, o);
				float r1 = Math.max(o.outWidth / MaxWidth, o.outHeight / MaxHeight);
				Options o2 = null;
				if (r1 > 1f) {
					o2 = new Options();
					o2.inSampleSize = (int) r1;
				}
				Bitmap bmp = BitmapFactory.decodeStream(in2, null, o2);
				bmp.setDensity(160);
				return new Object[] {true, bmp};
				} catch (Exception e) {
					BA.Log("" + e);
					throw e;
				} finally {
					in1.close();
					in2.close();
				}
			}
		}
	);
	return sender;
}
}