package com.flurry.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.flurry.android.FlurryFullscreenTakeoverActivity;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdFrame;
import com.flurry.android.impl.ads.avro.protocol.v10.AdSpaceLayout;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressLint({"SetJavaScriptEnabled"})
public class g extends i
  implements DialogInterface.OnKeyListener, ad
{
  private AlertDialog A;
  private List<AdFrame> B;
  private boolean C;
  private Map<String, AdUnit> D;
  private Map<String, e> E;
  private List<String> F;
  private boolean G = false;
  private boolean H = false;
  private boolean I = true;
  String a = null;
  private final String b = g.class.getSimpleName();
  private final String c = "mraid.js";
  private ProgressDialog d;
  private f e;
  private boolean f;
  private WebView g;
  private Button h;
  private int i;
  private boolean j;
  private WebViewClient k;
  private WebChromeClient l;
  private View m;
  private int n;
  private WebChromeClient.CustomViewCallback o;
  private Dialog p;
  private FrameLayout q;
  private int r;
  private Dialog s;
  private FrameLayout t;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y;
  private FlurryFullscreenTakeoverActivity z;

  public g(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdUnit paramAdUnit, int paramInt)
  {
    super(paramContext, paramFlurryAdModule, parame);
    setClickable(true);
    setAdUnit(paramAdUnit);
    setAdFrameIndex(paramInt);
    if ((getContext() instanceof Activity))
      this.i = ((Activity)getContext()).getRequestedOrientation();
    if (getAdUnit() != null)
    {
      this.B = getAdUnit().d();
      this.w = getAdUnit().r().booleanValue();
      if (getAdUnit().e().intValue() == 1);
      for (boolean bool = true; ; bool = false)
      {
        this.C = bool;
        if (this.C)
        {
          this.E = new HashMap();
          this.D = new HashMap();
          this.E.put(parame.b(), parame);
          this.D.put(((AdFrame)paramAdUnit.d().get(0)).g().toString(), paramAdUnit);
        }
        this.F = new LinkedList();
        return;
      }
    }
    eo.a(3, this.b, "adunit is Null");
  }

  private boolean A()
  {
    eo.a(3, "viewAttached", "fViewAttachedToActivity =" + this.G);
    return this.G;
  }

  private void B()
  {
    if ((this.d != null) && (this.d.isShowing()))
    {
      this.d.dismiss();
      this.d = null;
    }
  }

  private String a(List<AdUnit> paramList, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("'{\"adComponents\":[");
    String str1 = this.g.getUrl();
    String str2 = cf.b(str1);
    String str3 = cf.a(str2, str1);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str4 = ((AdFrame)((AdUnit)localIterator.next()).d().get(0)).d().toString();
      if ((!TextUtils.isEmpty(str4)) && (!TextUtils.isEmpty(str3)) && (str3 != str2))
        str4 = str4.replace(str2, str3);
      localStringBuilder.append(fe.e(str4));
      if (localIterator.hasNext())
        localStringBuilder.append(",");
    }
    localStringBuilder.append("]}'");
    return localStringBuilder.toString();
  }

  private List<AdUnit> a(String paramString, int paramInt1, int paramInt2)
  {
    List localList = getPlatformModule().d().a(getAdUnit().b().toString(), paramInt1, paramInt2);
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      AdUnit localAdUnit = (AdUnit)localIterator.next();
      if (localAdUnit.d().size() > 0)
        this.D.put(((AdFrame)localAdUnit.d().get(0)).g().toString(), localAdUnit);
    }
    return localList;
  }

  private void a(int paramInt1, int paramInt2)
  {
    if (!(getContext() instanceof Activity))
      eo.a(3, this.b, "no activity present");
    Activity localActivity;
    do
    {
      return;
      localActivity = (Activity)getContext();
    }
    while (this.s != null);
    eo.a(3, this.b, "expand(" + paramInt1 + "," + paramInt2 + ")");
    if ((this.g != null) && (-1 != indexOfChild(this.g)))
      removeView(this.g);
    this.r = localActivity.getRequestedOrientation();
    if (this.t == null)
    {
      this.t = new FrameLayout(localActivity);
      this.t.setBackgroundColor(-16777216);
      if ((this.g != null) && (this.g.getParent() == null))
        this.t.addView(this.g, new FrameLayout.LayoutParams(-1, -1, 17));
    }
    if (this.s == null)
    {
      this.s = new Dialog(localActivity, 16973834);
      ch.a(this.s.getWindow());
      this.s.setContentView(this.t, new ViewGroup.LayoutParams(-1, -1));
      this.s.setOnDismissListener(new DialogInterface.OnDismissListener()
      {
        public void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          eo.a(3, g.a(g.this), "extendedWebViewDialog.onDismiss()");
          if (g.b(g.this) != null)
            g.b(g.this).loadUrl("javascript:if(window.mraid){window.mraid.close();};");
        }
      });
      this.s.setCancelable(true);
      this.s.show();
    }
    cb.a(localActivity, cb.a(), true);
    getPlatformModule().a(localActivity, getAdUnit().b().toString());
  }

  private void a(Context paramContext)
  {
    if (this.d == null)
      if (paramContext != null)
      {
        this.d = new ProgressDialog(paramContext);
        this.d.setProgressStyle(0);
        this.d.setMessage("Loading...");
        this.d.setCancelable(true);
        this.d.setCanceledOnTouchOutside(false);
        this.d.setOnKeyListener(this);
        this.d.show();
      }
    while (this.d.isShowing())
    {
      return;
      eo.a(3, this.b, "Context is null, cannot create progress dialog.");
      return;
    }
    this.d.show();
  }

  private void a(a parama)
  {
    if ((this.F.contains(parama.c.a)) && (this.g != null))
    {
      this.g.loadUrl("javascript:flurryadapter.callComplete('" + parama.c.a + "');");
      this.F.remove(parama.c.a);
    }
  }

  private void a(a parama, int paramInt)
  {
    e locale2;
    if (!this.C)
      if ((paramInt != getAdFrameIndex()) && (paramInt < this.B.size()))
      {
        AdFrame localAdFrame2 = (AdFrame)getAdUnit().d().get(paramInt);
        locale2 = getPlatformModule().a(localAdFrame2.g().toString());
        String str2 = getCurrentFormat();
        String str3 = localAdFrame2.e().e().toString();
        if (str3.equals(str2))
          break label179;
        if (str3.equals("takeover"))
        {
          getPlatformModule().a(locale2);
          getPlatformModule().a(getAdUnit());
          Intent localIntent = new Intent(do.a().b(), FlurryFullscreenTakeoverActivity.class);
          localIntent.putExtra("frameIndex", paramInt);
          getPlatformModule().a().a(getContext(), localIntent, getAdUnit().b().toString());
        }
      }
    label179: String str1;
    do
    {
      return;
      setAdLog(locale2);
      setAdFrameIndex(paramInt);
      initLayout();
      return;
      str1 = (String)parama.c.b.get("guid");
    }
    while (str1 == null);
    setAdUnit(c(str1));
    this.B = getAdUnit().d();
    AdFrame localAdFrame1 = (AdFrame)getAdUnit().d().get(paramInt);
    e locale1 = getPlatformModule().a(localAdFrame1.g().toString());
    setAdLog(parama.c.d);
    if (e())
    {
      getPlatformModule().a(getAdUnit());
      getPlatformModule().a(locale1);
    }
    setAdLog(locale1);
    setAdFrameIndex(paramInt);
    this.C = false;
    initLayout();
  }

  private void a(final String paramString)
  {
    el localel = new el();
    localel.a(paramString);
    localel.b(new ey());
    localel.a(new el.a()
    {
      public void a(el<Void, String> paramAnonymousel, final String paramAnonymousString)
      {
        int i = paramAnonymousel.e();
        eo.a(3, g.a(g.this), "Prerender: HTTP status code is:" + i + " for url: " + paramString);
        if (paramAnonymousel.c())
        {
          final String str = cf.c(paramString);
          g.this.a("rendered", Collections.emptyMap(), g.this.getAdUnit(), g.this.getAdLog(), g.this.getAdFrameIndex(), 0);
          do.a().a(new ff()
          {
            public void a()
            {
              if (g.b(g.this) != null)
                g.b(g.this).loadDataWithBaseURL(str, paramAnonymousString, "text/html", "utf-8", str);
            }
          });
          return;
        }
        do.a().a(new ff()
        {
          public void a()
          {
            HashMap localHashMap = new HashMap();
            localHashMap.put("errorCode", Integer.toString(b.k.a()));
            g.this.a("renderFailed", localHashMap, g.this.getAdUnit(), g.this.getAdLog(), g.this.getAdFrameIndex(), 0);
          }
        });
      }
    });
    em.a().a(this, localel);
  }

  private void a(String paramString, boolean paramBoolean)
  {
    boolean bool1 = true;
    if (paramString == null)
      return;
    Context localContext = getContext();
    long l1 = getAdUnit().m().longValue();
    boolean bool2 = getAdUnit().q().booleanValue();
    am localam = getPlatformModule().c(((AdFrame)this.B.get(getAdFrameIndex())).g().toString());
    int i1 = localam.a();
    if (this.e == null)
    {
      z localz = new z(localContext, l1, bool2, bool1, paramBoolean);
      localz.setVideoState(localam);
      this.e = new f(localContext, this, getFullScreenTakeover(), localz);
    }
    if (this.z != null)
      this.z.setVideoOrientation();
    try
    {
      eo.a(3, this.b, "Precaching: Getting video from cache: " + paramString);
      File localFile = ap.a().a(paramString);
      if (localFile != null)
      {
        this.e.a(Uri.parse("file://" + localFile.getAbsolutePath()), i1);
        if (!bool1)
        {
          eo.a(3, this.b, "Precaching: Error using cached file. Loading with url: " + paramString);
          this.e.a(Uri.parse(paramString), i1);
        }
        this.e.a();
        this.e.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.e);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        eo.a(3, this.b, "Precaching: Error accessing cached file.", localException);
        bool1 = false;
      }
    }
  }

  private e b(String paramString)
  {
    e locale1;
    if (this.E == null)
      locale1 = null;
    do
    {
      return locale1;
      locale1 = (e)this.E.get(paramString);
    }
    while (locale1 != null);
    e locale2 = getPlatformModule().a(paramString);
    this.E.put(paramString, locale2);
    return locale2;
  }

  private void b(int paramInt1, int paramInt2)
  {
    if (!(getContext() instanceof Activity))
      eo.a(3, this.b, "no activity present");
    Activity localActivity;
    do
    {
      return;
      localActivity = (Activity)getContext();
    }
    while (this.s == null);
    eo.a(3, this.b, "collapse(" + paramInt1 + "," + paramInt2 + ")");
    if ((this.s != null) && (this.s.isShowing()))
    {
      this.s.hide();
      this.s.setOnDismissListener(null);
      this.s.dismiss();
    }
    this.s = null;
    cb.a(localActivity, this.r);
    if (this.t != null)
    {
      if ((this.g != null) && (-1 != this.t.indexOfChild(this.g)))
        this.t.removeView(this.g);
      this.t = null;
    }
    if ((this.g != null) && (this.g.getParent() == null))
      addView(this.g);
    getPlatformModule().b(localActivity, getAdUnit().b().toString());
  }

  private AdUnit c(String paramString)
  {
    if (this.D == null)
      return null;
    return (AdUnit)this.D.get(paramString);
  }

  private boolean h()
  {
    try
    {
      boolean bool = this.j;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void i()
  {
    try
    {
      if (!h())
      {
        k();
        setFlurryJsEnvInitialized(true);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void j()
  {
    try
    {
      setFlurryJsEnvInitialized(false);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void k()
  {
    eo.a(3, this.b, "initializeFlurryJsEnv");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("javascript:(function() {");
    localStringBuilder.append("var Hogan={};(function(Hogan,useArrayBuffer){Hogan.Template=function(renderFunc,text,compiler,options){this.r=renderFunc||this.r;this.c=compiler;this.options=options;this.text=text||\"\";this.buf=useArrayBuffer?[]:\"\"};Hogan.Template.prototype={r:function(context,partials,indent){return\"\"},v:hoganEscape,t:coerceToString,render:function render(context,partials,indent){return this.ri([context],partials||{},indent)},ri:function(context,partials,indent){return this.r(context,partials,indent)},rp:function(name,context,partials,indent){var partial=partials[name];if(!partial){return\"\"}if(this.c&&typeof partial==\"string\"){partial=this.c.compile(partial,this.options)}return partial.ri(context,partials,indent)},rs:function(context,partials,section){var tail=context[context.length-1];if(!isArray(tail)){section(context,partials,this);return}for(var i=0;i<tail.length;i++){context.push(tail[i]);section(context,partials,this);context.pop()}},s:function(val,ctx,partials,inverted,start,end,tags){var pass;if(isArray(val)&&val.length===0){return false}if(typeof val==\"function\"){val=this.ls(val,ctx,partials,inverted,start,end,tags)}pass=(val===\"\")||!!val;if(!inverted&&pass&&ctx){ctx.push((typeof val==\"object\")?val:ctx[ctx.length-1])}return pass},d:function(key,ctx,partials,returnFound){var names=key.split(\".\"),val=this.f(names[0],ctx,partials,returnFound),cx=null;if(key===\".\"&&isArray(ctx[ctx.length-2])){return ctx[ctx.length-1]}for(var i=1;i<names.length;i++){if(val&&typeof val==\"object\"&&names[i] in val){cx=val;val=val[names[i]]}else{val=\"\"}}if(returnFound&&!val){return false}if(!returnFound&&typeof val==\"function\"){ctx.push(cx);val=this.lv(val,ctx,partials);ctx.pop()}return val},f:function(key,ctx,partials,returnFound){var val=false,v=null,found=false;for(var i=ctx.length-1;i>=0;i--){v=ctx[i];if(v&&typeof v==\"object\"&&key in v){val=v[key];found=true;break}}if(!found){return(returnFound)?false:\"\"}if(!returnFound&&typeof val==\"function\"){val=this.lv(val,ctx,partials)}return val},ho:function(val,cx,partials,text,tags){var compiler=this.c;var options=this.options;options.delimiters=tags;var text=val.call(cx,text);text=(text==null)?String(text):text.toString();this.b(compiler.compile(text,options).render(cx,partials));return false},b:(useArrayBuffer)?function(s){this.buf.push(s)}:function(s){this.buf+=s},fl:(useArrayBuffer)?function(){var r=this.buf.join(\"\");this.buf=[];return r}:function(){var r=this.buf;this.buf=\"\";return r},ls:function(val,ctx,partials,inverted,start,end,tags){var cx=ctx[ctx.length-1],t=null;if(!inverted&&this.c&&val.length>0){return this.ho(val,cx,partials,this.text.substring(start,end),tags)}t=val.call(cx);if(typeof t==\"function\"){if(inverted){return true}else{if(this.c){return this.ho(t,cx,partials,this.text.substring(start,end),tags)}}}return t},lv:function(val,ctx,partials){var cx=ctx[ctx.length-1];var result=val.call(cx);if(typeof result==\"function\"){result=coerceToString(result.call(cx));if(this.c&&~result.indexOf(\"{\\u007B\")){return this.c.compile(result,this.options).render(cx,partials)}}return coerceToString(result)}};var rAmp=/&/g,rLt=/</g,rGt=/>/g,rApos=/\\'/g,rQuot=/\\\"/g,hChars=/[&<>\\\"\\']/;function coerceToString(val){return String((val===null||val===undefined)?\"\":val)}function hoganEscape(str){str=coerceToString(str);return hChars.test(str)?str.replace(rAmp,\"&amp;\").replace(rLt,\"&lt;\").replace(rGt,\"&gt;\").replace(rApos,\"&#39;\").replace(rQuot,\"&quot;\"):str}var isArray=Array.isArray||function(a){return Object.prototype.toString.call(a)===\"[object Array]\"}})(typeof exports!==\"undefined\"?exports:Hogan);(function(Hogan){var rIsWhitespace=/\\S/,rQuot=/\\\"/g,rNewline=/\\n/g,rCr=/\\r/g,rSlash=/\\\\/g,tagTypes={\"#\":1,\"^\":2,\"/\":3,\"!\":4,\">\":5,\"<\":6,\"=\":7,_v:8,\"{\":9,\"&\":10};Hogan.scan=function scan(text,delimiters){var len=text.length,IN_TEXT=0,IN_TAG_TYPE=1,IN_TAG=2,state=IN_TEXT,tagType=null,tag=null,buf=\"\",tokens=[],seenTag=false,i=0,lineStart=0,otag=\"{{\",ctag=\"}}\";function addBuf(){if(buf.length>0){tokens.push(new String(buf));buf=\"\"}}function lineIsWhitespace(){var isAllWhitespace=true;for(var j=lineStart;j<tokens.length;j++){isAllWhitespace=(tokens[j].tag&&tagTypes[tokens[j].tag]<tagTypes._v)||(!tokens[j].tag&&tokens[j].match(rIsWhitespace)===null);if(!isAllWhitespace){return false}}return isAllWhitespace}function filterLine(haveSeenTag,noNewLine){addBuf();if(haveSeenTag&&lineIsWhitespace()){for(var j=lineStart,next;j<tokens.length;j++){if(!tokens[j].tag){if((next=tokens[j+1])&&next.tag==\">\"){next.indent=tokens[j].toString()}tokens.splice(j,1)}}}else{if(!noNewLine){tokens.push({tag:\"\\n\"})}}seenTag=false;lineStart=tokens.length}function changeDelimiters(text,index){var close=\"=\"+ctag,closeIndex=text.indexOf(close,index),delimiters=trim(text.substring(text.indexOf(\"=\",index)+1,closeIndex)).split(\" \");otag=delimiters[0];ctag=delimiters[1];return closeIndex+close.length-1}if(delimiters){delimiters=delimiters.split(\" \");otag=delimiters[0];ctag=delimiters[1]}for(i=0;i<len;i++){if(state==IN_TEXT){if(tagChange(otag,text,i)){--i;addBuf();state=IN_TAG_TYPE}else{if(text.charAt(i)==\"\\n\"){filterLine(seenTag)}else{buf+=text.charAt(i)}}}else{if(state==IN_TAG_TYPE){i+=otag.length-1;tag=tagTypes[text.charAt(i+1)];tagType=tag?text.charAt(i+1):\"_v\";if(tagType==\"=\"){i=changeDelimiters(text,i);state=IN_TEXT}else{if(tag){i++}state=IN_TAG}seenTag=i}else{if(tagChange(ctag,text,i)){tokens.push({tag:tagType,n:trim(buf),otag:otag,ctag:ctag,i:(tagType==\"/\")?seenTag-ctag.length:i+otag.length});buf=\"\";i+=ctag.length-1;state=IN_TEXT;if(tagType==\"{\"){if(ctag==\"}}\"){i++}else{cleanTripleStache(tokens[tokens.length-1])}}}else{buf+=text.charAt(i)}}}}filterLine(seenTag,true);return tokens};function cleanTripleStache(token){if(token.n.substr(token.n.length-1)===\"}\"){token.n=token.n.substring(0,token.n.length-1)}}function trim(s){if(s.trim){return s.trim()}return s.replace(/^\\s*|\\s*$/g,\"\")}function tagChange(tag,text,index){if(text.charAt(index)!=tag.charAt(0)){return false}for(var i=1,l=tag.length;i<l;i++){if(text.charAt(index+i)!=tag.charAt(i)){return false}}return true}function buildTree(tokens,kind,stack,customTags){var instructions=[],opener=null,token=null;while(tokens.length>0){token=tokens.shift();if(token.tag==\"#\"||token.tag==\"^\"||isOpener(token,customTags)){stack.push(token);token.nodes=buildTree(tokens,token.tag,stack,customTags);instructions.push(token)}else{if(token.tag==\"/\"){if(stack.length===0){throw new Error(\"Closing tag without opener: /\"+token.n)}opener=stack.pop();if(token.n!=opener.n&&!isCloser(token.n,opener.n,customTags)){throw new Error(\"Nesting error: \"+opener.n+\" vs. \"+token.n)}opener.end=token.i;return instructions}else{instructions.push(token)}}}if(stack.length>0){throw new Error(\"missing closing tag: \"+stack.pop().n)}return instructions}function isOpener(token,tags){for(var i=0,l=tags.length;i<l;i++){if(tags[i].o==token.n){token.tag=\"#\";return true}}}function isCloser(close,open,tags){for(var i=0,l=tags.length;i<l;i++){if(tags[i].c==close&&tags[i].o==open){return true}}}Hogan.generate=function(tree,text,options){var code='var _=this;_.b(i=i||\"\");'+walk(tree)+\"return _.fl();\";if(options.asString){return\"function(c,p,i){\"+code+\";}\"}return new Hogan.Template(new Function(\"c\",\"p\",\"i\",code),text,Hogan,options)};function esc(s){return s.replace(rSlash,\"\\\\\\\\\").replace(rQuot,'\\\\\"').replace(rNewline,\"\\\\n\").replace(rCr,\"\\\\r\")}function chooseMethod(s){return(~s.indexOf(\".\"))?\"d\":\"f\"}function walk(tree){var code=\"\";for(var i=0,l=tree.length;i<l;i++){var tag=tree[i].tag;if(tag==\"#\"){code+=section(tree[i].nodes,tree[i].n,chooseMethod(tree[i].n),tree[i].i,tree[i].end,tree[i].otag+\" \"+tree[i].ctag)}else{if(tag==\"^\"){code+=invertedSection(tree[i].nodes,tree[i].n,chooseMethod(tree[i].n))}else{if(tag==\"<\"||tag==\">\"){code+=partial(tree[i])}else{if(tag==\"{\"||tag==\"&\"){code+=tripleStache(tree[i].n,chooseMethod(tree[i].n))}else{if(tag==\"\\n\"){code+=text('\"\\\\n\"'+(tree.length-1==i?\"\":\" + i\"))}else{if(tag==\"_v\"){code+=variable(tree[i].n,chooseMethod(tree[i].n))}else{if(tag===undefined){code+=text('\"'+esc(tree[i])+'\"')}}}}}}}}return code}function section(nodes,id,method,start,end,tags){return\"if(_.s(_.\"+method+'(\"'+esc(id)+'\",c,p,1),c,p,0,'+start+\",\"+end+',\"'+tags+'\")){_.rs(c,p,function(c,p,_){'+walk(nodes)+\"});c.pop();}\"}function invertedSection(nodes,id,method){return\"if(!_.s(_.\"+method+'(\"'+esc(id)+'\",c,p,1),c,p,1,0,0,\"\")){'+walk(nodes)+\"};\"}function partial(tok){return'_.b(_.rp(\"'+esc(tok.n)+'\",c,p,\"'+(tok.indent||\"\")+'\"));'}function tripleStache(id,method){return\"_.b(_.t(_.\"+method+'(\"'+esc(id)+'\",c,p,0)));'}function variable(id,method){return\"_.b(_.v(_.\"+method+'(\"'+esc(id)+'\",c,p,0)));'}function text(id){return\"_.b(\"+id+\");\"}Hogan.parse=function(tokens,text,options){options=options||{};return buildTree(tokens,\"\",[],options.sectionTags||[])},Hogan.cache={};Hogan.compile=function(text,options){options=options||{};var key=text+\"||\"+!!options.asString;var t=this.cache[key];if(t){return t}t=this.generate(this.parse(this.scan(text,options.delimiters),text,options),text,options);return this.cache[key]=t}})(typeof exports!==\"undefined\"?exports:Hogan);");
    localStringBuilder.append("var flurryBridgeCtor=function(w){var flurryadapter={};flurryadapter.flurryCallQueue=[];flurryadapter.flurryCallInProgress=false;flurryadapter.callComplete=function(cmd){if(this.flurryCallQueue.length==0){this.flurryCallInProgress=false;return}var adapterCall=this.flurryCallQueue.splice(0,1)[0];this.executeNativeCall(adapterCall);return\"OK\"};flurryadapter.executeCall=function(command){var adapterCall=\"flurry://flurrycall?event=\"+command;var value;for(var i=1;i<arguments.length;i+=2){value=arguments[i+1];if(value==null)continue;adapterCall+=\"&\"+arguments[i]+\"=\"+escape(value)}if(this.flurryCallInProgress)this.flurryCallQueue.push(adapterCall);else this.executeNativeCall(adapterCall)};flurryadapter.executeNativeCall=function(adapterCall){if(adapterCall.length==0)return;this.flurryCallInProgress=true;w.location=adapterCall};return flurryadapter};");
    localStringBuilder.append("window.Hogan=Hogan;window.flurryadapter=flurryBridgeCtor(window);");
    localStringBuilder.append("window.flurryAdapterAvailable=true;if(typeof window.FlurryAdapterReady === 'function'){window.FlurryAdapterReady();}");
    localStringBuilder.append("})();");
    if (this.g != null)
      this.g.loadUrl(localStringBuilder.toString());
  }

  private void l()
  {
    eo.a(3, this.b, "activateFlurryJsEnv");
    String str1 = getCurrentContent();
    if ((!this.C) && (str1 != null) && (str1.length() > 0) && (!str1.equals("{}")))
    {
      String str2 = this.g.getUrl();
      String str3 = cf.b(str2);
      String str4 = cf.a(str3, str2);
      if ((!TextUtils.isEmpty(str4)) && (str4 != str3))
      {
        eo.a(3, this.b, "content before {{mustached}} tags replacement = '" + str1 + "'");
        str1 = str1.replace(str3, str4);
        eo.a(3, this.b, "content after {{mustached}} tags replacement = '" + str1 + "'");
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("javascript:");
      localStringBuilder.append("(function(){");
      localStringBuilder.append("if(!window.Hogan){var Hogan={};(function(Hogan,useArrayBuffer){Hogan.Template=function(renderFunc,text,compiler,options){this.r=renderFunc||this.r;this.c=compiler;this.options=options;this.text=text||\"\";this.buf=useArrayBuffer?[]:\"\"};Hogan.Template.prototype={r:function(context,partials,indent){return\"\"},v:hoganEscape,t:coerceToString,render:function render(context,partials,indent){return this.ri([context],partials||{},indent)},ri:function(context,partials,indent){return this.r(context,partials,indent)},rp:function(name,context,partials,indent){var partial=partials[name];if(!partial){return\"\"}if(this.c&&typeof partial==\"string\"){partial=this.c.compile(partial,this.options)}return partial.ri(context,partials,indent)},rs:function(context,partials,section){var tail=context[context.length-1];if(!isArray(tail)){section(context,partials,this);return}for(var i=0;i<tail.length;i++){context.push(tail[i]);section(context,partials,this);context.pop()}},s:function(val,ctx,partials,inverted,start,end,tags){var pass;if(isArray(val)&&val.length===0){return false}if(typeof val==\"function\"){val=this.ls(val,ctx,partials,inverted,start,end,tags)}pass=(val===\"\")||!!val;if(!inverted&&pass&&ctx){ctx.push((typeof val==\"object\")?val:ctx[ctx.length-1])}return pass},d:function(key,ctx,partials,returnFound){var names=key.split(\".\"),val=this.f(names[0],ctx,partials,returnFound),cx=null;if(key===\".\"&&isArray(ctx[ctx.length-2])){return ctx[ctx.length-1]}for(var i=1;i<names.length;i++){if(val&&typeof val==\"object\"&&names[i] in val){cx=val;val=val[names[i]]}else{val=\"\"}}if(returnFound&&!val){return false}if(!returnFound&&typeof val==\"function\"){ctx.push(cx);val=this.lv(val,ctx,partials);ctx.pop()}return val},f:function(key,ctx,partials,returnFound){var val=false,v=null,found=false;for(var i=ctx.length-1;i>=0;i--){v=ctx[i];if(v&&typeof v==\"object\"&&key in v){val=v[key];found=true;break}}if(!found){return(returnFound)?false:\"\"}if(!returnFound&&typeof val==\"function\"){val=this.lv(val,ctx,partials)}return val},ho:function(val,cx,partials,text,tags){var compiler=this.c;var options=this.options;options.delimiters=tags;var text=val.call(cx,text);text=(text==null)?String(text):text.toString();this.b(compiler.compile(text,options).render(cx,partials));return false},b:(useArrayBuffer)?function(s){this.buf.push(s)}:function(s){this.buf+=s},fl:(useArrayBuffer)?function(){var r=this.buf.join(\"\");this.buf=[];return r}:function(){var r=this.buf;this.buf=\"\";return r},ls:function(val,ctx,partials,inverted,start,end,tags){var cx=ctx[ctx.length-1],t=null;if(!inverted&&this.c&&val.length>0){return this.ho(val,cx,partials,this.text.substring(start,end),tags)}t=val.call(cx);if(typeof t==\"function\"){if(inverted){return true}else{if(this.c){return this.ho(t,cx,partials,this.text.substring(start,end),tags)}}}return t},lv:function(val,ctx,partials){var cx=ctx[ctx.length-1];var result=val.call(cx);if(typeof result==\"function\"){result=coerceToString(result.call(cx));if(this.c&&~result.indexOf(\"{\\u007B\")){return this.c.compile(result,this.options).render(cx,partials)}}return coerceToString(result)}};var rAmp=/&/g,rLt=/</g,rGt=/>/g,rApos=/\\'/g,rQuot=/\\\"/g,hChars=/[&<>\\\"\\']/;function coerceToString(val){return String((val===null||val===undefined)?\"\":val)}function hoganEscape(str){str=coerceToString(str);return hChars.test(str)?str.replace(rAmp,\"&amp;\").replace(rLt,\"&lt;\").replace(rGt,\"&gt;\").replace(rApos,\"&#39;\").replace(rQuot,\"&quot;\"):str}var isArray=Array.isArray||function(a){return Object.prototype.toString.call(a)===\"[object Array]\"}})(typeof exports!==\"undefined\"?exports:Hogan);(function(Hogan){var rIsWhitespace=/\\S/,rQuot=/\\\"/g,rNewline=/\\n/g,rCr=/\\r/g,rSlash=/\\\\/g,tagTypes={\"#\":1,\"^\":2,\"/\":3,\"!\":4,\">\":5,\"<\":6,\"=\":7,_v:8,\"{\":9,\"&\":10};Hogan.scan=function scan(text,delimiters){var len=text.length,IN_TEXT=0,IN_TAG_TYPE=1,IN_TAG=2,state=IN_TEXT,tagType=null,tag=null,buf=\"\",tokens=[],seenTag=false,i=0,lineStart=0,otag=\"{{\",ctag=\"}}\";function addBuf(){if(buf.length>0){tokens.push(new String(buf));buf=\"\"}}function lineIsWhitespace(){var isAllWhitespace=true;for(var j=lineStart;j<tokens.length;j++){isAllWhitespace=(tokens[j].tag&&tagTypes[tokens[j].tag]<tagTypes._v)||(!tokens[j].tag&&tokens[j].match(rIsWhitespace)===null);if(!isAllWhitespace){return false}}return isAllWhitespace}function filterLine(haveSeenTag,noNewLine){addBuf();if(haveSeenTag&&lineIsWhitespace()){for(var j=lineStart,next;j<tokens.length;j++){if(!tokens[j].tag){if((next=tokens[j+1])&&next.tag==\">\"){next.indent=tokens[j].toString()}tokens.splice(j,1)}}}else{if(!noNewLine){tokens.push({tag:\"\\n\"})}}seenTag=false;lineStart=tokens.length}function changeDelimiters(text,index){var close=\"=\"+ctag,closeIndex=text.indexOf(close,index),delimiters=trim(text.substring(text.indexOf(\"=\",index)+1,closeIndex)).split(\" \");otag=delimiters[0];ctag=delimiters[1];return closeIndex+close.length-1}if(delimiters){delimiters=delimiters.split(\" \");otag=delimiters[0];ctag=delimiters[1]}for(i=0;i<len;i++){if(state==IN_TEXT){if(tagChange(otag,text,i)){--i;addBuf();state=IN_TAG_TYPE}else{if(text.charAt(i)==\"\\n\"){filterLine(seenTag)}else{buf+=text.charAt(i)}}}else{if(state==IN_TAG_TYPE){i+=otag.length-1;tag=tagTypes[text.charAt(i+1)];tagType=tag?text.charAt(i+1):\"_v\";if(tagType==\"=\"){i=changeDelimiters(text,i);state=IN_TEXT}else{if(tag){i++}state=IN_TAG}seenTag=i}else{if(tagChange(ctag,text,i)){tokens.push({tag:tagType,n:trim(buf),otag:otag,ctag:ctag,i:(tagType==\"/\")?seenTag-ctag.length:i+otag.length});buf=\"\";i+=ctag.length-1;state=IN_TEXT;if(tagType==\"{\"){if(ctag==\"}}\"){i++}else{cleanTripleStache(tokens[tokens.length-1])}}}else{buf+=text.charAt(i)}}}}filterLine(seenTag,true);return tokens};function cleanTripleStache(token){if(token.n.substr(token.n.length-1)===\"}\"){token.n=token.n.substring(0,token.n.length-1)}}function trim(s){if(s.trim){return s.trim()}return s.replace(/^\\s*|\\s*$/g,\"\")}function tagChange(tag,text,index){if(text.charAt(index)!=tag.charAt(0)){return false}for(var i=1,l=tag.length;i<l;i++){if(text.charAt(index+i)!=tag.charAt(i)){return false}}return true}function buildTree(tokens,kind,stack,customTags){var instructions=[],opener=null,token=null;while(tokens.length>0){token=tokens.shift();if(token.tag==\"#\"||token.tag==\"^\"||isOpener(token,customTags)){stack.push(token);token.nodes=buildTree(tokens,token.tag,stack,customTags);instructions.push(token)}else{if(token.tag==\"/\"){if(stack.length===0){throw new Error(\"Closing tag without opener: /\"+token.n)}opener=stack.pop();if(token.n!=opener.n&&!isCloser(token.n,opener.n,customTags)){throw new Error(\"Nesting error: \"+opener.n+\" vs. \"+token.n)}opener.end=token.i;return instructions}else{instructions.push(token)}}}if(stack.length>0){throw new Error(\"missing closing tag: \"+stack.pop().n)}return instructions}function isOpener(token,tags){for(var i=0,l=tags.length;i<l;i++){if(tags[i].o==token.n){token.tag=\"#\";return true}}}function isCloser(close,open,tags){for(var i=0,l=tags.length;i<l;i++){if(tags[i].c==close&&tags[i].o==open){return true}}}Hogan.generate=function(tree,text,options){var code='var _=this;_.b(i=i||\"\");'+walk(tree)+\"return _.fl();\";if(options.asString){return\"function(c,p,i){\"+code+\";}\"}return new Hogan.Template(new Function(\"c\",\"p\",\"i\",code),text,Hogan,options)};function esc(s){return s.replace(rSlash,\"\\\\\\\\\").replace(rQuot,'\\\\\"').replace(rNewline,\"\\\\n\").replace(rCr,\"\\\\r\")}function chooseMethod(s){return(~s.indexOf(\".\"))?\"d\":\"f\"}function walk(tree){var code=\"\";for(var i=0,l=tree.length;i<l;i++){var tag=tree[i].tag;if(tag==\"#\"){code+=section(tree[i].nodes,tree[i].n,chooseMethod(tree[i].n),tree[i].i,tree[i].end,tree[i].otag+\" \"+tree[i].ctag)}else{if(tag==\"^\"){code+=invertedSection(tree[i].nodes,tree[i].n,chooseMethod(tree[i].n))}else{if(tag==\"<\"||tag==\">\"){code+=partial(tree[i])}else{if(tag==\"{\"||tag==\"&\"){code+=tripleStache(tree[i].n,chooseMethod(tree[i].n))}else{if(tag==\"\\n\"){code+=text('\"\\\\n\"'+(tree.length-1==i?\"\":\" + i\"))}else{if(tag==\"_v\"){code+=variable(tree[i].n,chooseMethod(tree[i].n))}else{if(tag===undefined){code+=text('\"'+esc(tree[i])+'\"')}}}}}}}}return code}function section(nodes,id,method,start,end,tags){return\"if(_.s(_.\"+method+'(\"'+esc(id)+'\",c,p,1),c,p,0,'+start+\",\"+end+',\"'+tags+'\")){_.rs(c,p,function(c,p,_){'+walk(nodes)+\"});c.pop();}\"}function invertedSection(nodes,id,method){return\"if(!_.s(_.\"+method+'(\"'+esc(id)+'\",c,p,1),c,p,1,0,0,\"\")){'+walk(nodes)+\"};\"}function partial(tok){return'_.b(_.rp(\"'+esc(tok.n)+'\",c,p,\"'+(tok.indent||\"\")+'\"));'}function tripleStache(id,method){return\"_.b(_.t(_.\"+method+'(\"'+esc(id)+'\",c,p,0)));'}function variable(id,method){return\"_.b(_.v(_.\"+method+'(\"'+esc(id)+'\",c,p,0)));'}function text(id){return\"_.b(\"+id+\");\"}Hogan.parse=function(tokens,text,options){options=options||{};return buildTree(tokens,\"\",[],options.sectionTags||[])},Hogan.cache={};Hogan.compile=function(text,options){options=options||{};var key=text+\"||\"+!!options.asString;var t=this.cache[key];if(t){return t}t=this.generate(this.parse(this.scan(text,options.delimiters),text,options),text,options);return this.cache[key]=t}})(typeof exports!==\"undefined\"?exports:Hogan);window.Hogan=Hogan;}");
      localStringBuilder.append("if(!window.flurryadapter){var flurryBridgeCtor=function(w){var flurryadapter={};flurryadapter.flurryCallQueue=[];flurryadapter.flurryCallInProgress=false;flurryadapter.callComplete=function(cmd){if(this.flurryCallQueue.length==0){this.flurryCallInProgress=false;return}var adapterCall=this.flurryCallQueue.splice(0,1)[0];this.executeNativeCall(adapterCall);return\"OK\"};flurryadapter.executeCall=function(command){var adapterCall=\"flurry://flurrycall?event=\"+command;var value;for(var i=1;i<arguments.length;i+=2){value=arguments[i+1];if(value==null)continue;adapterCall+=\"&\"+arguments[i]+\"=\"+escape(value)}if(this.flurryCallInProgress)this.flurryCallQueue.push(adapterCall);else this.executeNativeCall(adapterCall)};flurryadapter.executeNativeCall=function(adapterCall){if(adapterCall.length==0)return;this.flurryCallInProgress=true;w.location=adapterCall};return flurryadapter};window.flurryadapter=flurryBridgeCtor(window);}");
      localStringBuilder.append("if(!window.flurryAdapterAvailable){window.flurryAdapterAvailable=true;if(typeof window.FlurryAdapterReady === 'function'){window.FlurryAdapterReady();} }");
      String str5 = fe.e(str1);
      localStringBuilder.append("var content='");
      localStringBuilder.append(str5);
      localStringBuilder.append("';var compiled=window.Hogan.compile(document.body.innerHTML);var rendered=compiled.render(JSON.parse(content));document.body.innerHTML=rendered;");
      localStringBuilder.append("})();");
      if (this.g != null)
        this.g.loadUrl(localStringBuilder.toString());
    }
  }

  private boolean m()
  {
    try
    {
      boolean bool = this.y;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void n()
  {
    try
    {
      if (!m())
      {
        p();
        setMraidJsEnvInitialized(true);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void o()
  {
    try
    {
      setMraidJsEnvInitialized(false);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void p()
  {
    eo.a(3, this.b, "initializeMraid");
    if (e());
    for (String str1 = "interstitial"; ; str1 = "inline")
    {
      String str2 = "{useCustomClose:" + false + ",isModal:" + false + ",width:undefined,height:undefined,placementType:\"" + str1 + "\"}";
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("javascript:(function() {");
      localStringBuilder.append("var mraidCtor=function(flurryBridge,initState){var mraid={};var STATES=mraid.STATES={LOADING:\"loading\",UNKNOWN:\"unknown\",DEFAULT:\"default\",EXPANDED:\"expanded\",HIDDEN:\"hidden\"};var EVENTS=mraid.EVENTS={ASSETREADY:\"assetReady\",ASSETREMOVED:\"assetRemoved\",ASSETRETIRED:\"assetRetired\",INFO:\"info\",ERROR:\"error\",ORIENTATIONCHANGE:\"orientationChange\",READY:\"ready\",STATECHANGE:\"stateChange\",VIEWABLECHANGE:\"viewableChange\"};var listeners={};var currentState=STATES.LOADING;var expandProperties={width:initState.width,height:initState.height,isModal:initState.isModal,useCustomClose:false};var collapseProperties={};var placementType=initState.placementType;var disable=false;var closeId=\"flurry-mraid-default-close\";var imgUrl=\"http://flurry.cachefly.net/adSpaceStyles/images/bttn-close-bw.png\";var safeClose=function(){try{if(window.mraid)window.mraid.close();else if(window.flurryadapter)flurryadapter.executeCall(\"adWillClose\");else console.log(\"unable to close\")}catch(error){console.log(\"unable to close: \"+error)}};var makeDefaultClose=function(){var img=document.createElement(\"img\");img.src=imgUrl;img.id=closeId;img.style.position=\"absolute\";img.style.top=\"10px\";img.style.right=\"10px\";img.style.width=\"50px\";img.style.height=\"50px\";img.style.zIndex=1E4;return img};var updateDefaultClose=function(){if(!expandProperties.useCustomClose&&(placementType===\"interstitial\"||currentState===STATES.EXPANDED))addDefaultClose();else removeDefaultClose()};var addDefaultClose=function(){var closeButton=document.getElementById(closeId);if(!closeButton){closeButton=makeDefaultClose();document.body.appendChild(closeButton)}};var removeDefaultClose=function(){var closeButton=document.getElementById(closeId);if(closeButton)document.body.removeChild(closeButton)};var setupDefaultCloseHandler=function(){document.body.addEventListener(\"click\",function(e){e=e||window.event;var target=e.target||e.srcElement;if(target.id===closeId)safeClose()})};var contains=function(value,obj){for(var i in obj)if(obj[i]===value)return true;return false};var stringify=function(obj){if(typeof obj==\"object\")if(obj.push){var out=[];for(var p in obj)if(obj.hasOwnProperty(p))out.push(obj[p]);return\"[\"+out.join(\",\")+\"]\"}else{var out=[];for(var p in obj)if(obj.hasOwnProperty(p))out.push(\"'\"+p+\"':\"+obj[p]);return\"{\"+out.join(\",\")+\"}\"}else return new String(obj)};var broadcastEvent=function(){var args=new Array(arguments.length);for(var i=0;i<arguments.length;i++)args[i]=arguments[i];var event=args.shift();try{if(listeners[event])for(var j=0;j<listeners[event].length;j++)if(typeof listeners[event][j]===\"function\")listeners[event][j].apply(undefined,args);else if(typeof listeners[event][j]===\"string\"&&typeof window[listeners[event][j]]===\"function\")window[listeners[event][j]].apply(undefined,args)}catch(e){console.log(e)}};mraid.disable=function(){removeDefaultClose();disable=true};mraid.addEventListener=function(event,listener){if(disable)return;if(!event||!listener)broadcastEvent(EVENTS.ERROR,\"Both event and listener are required.\",\"addEventListener\");else if(!contains(event,EVENTS))broadcastEvent(EVENTS.ERROR,\"Unknown event: \"+event,\"addEventListener\");else if(!listeners[event])listeners[event]=[listener];else listeners[event].push(listener);flurryBridge.executeCall(\"eventListenerAdded\")};mraid.stateChange=function(newState){if(disable)return;if(currentState===newState)return;broadcastEvent(EVENTS.INFO,\"setting state to \"+stringify(newState));var oldState=currentState;currentState=newState;if(oldState===STATES.LOADING&&newState===STATES.DEFAULT){setupDefaultCloseHandler();updateDefaultClose();broadcastEvent(EVENTS.READY)}else if(oldState===STATES.HIDDEN||newState===STATES.HIDDEN)broadcastEvent(EVENTS.VIEWABLECHANGE);else if(oldState===STATES.DEFAULT&&newState===STATES.EXPANDED)updateDefaultClose();else if(newState===STATES.DEFAULT&&oldState===STATES.EXPANDED)updateDefaultClose();broadcastEvent(EVENTS.STATECHANGE,currentState)};mraid.close=function(){if(disable)return;var state=mraid.getState();if(state===STATES.DEFAULT){mraid.stateChange(STATES.HIDDEN);flurryBridge.executeCall(\"adWillClose\")}else if(state===STATES.EXPANDED){mraid.stateChange(STATES.DEFAULT);flurryBridge.executeCall(\"collapse\")}else console.log(\"close() called in state \"+state)};mraid.expand=function(url){if(disable)return;var state=mraid.getState();if(state!==STATES.DEFAULT){console.log(\"expand() called in state \"+state);return}if(placementType===\"interstitial\"){console.log(\"expand() called for placement type \"+placementType);return}if(url)flurryBridge.executeCall(\"expand\",\"width\",expandProperties.width,\"height\",expandProperties.height,\"url\",url);else flurryBridge.executeCall(\"expand\",\"width\",expandProperties.width,\"height\",expandProperties.height);mraid.stateChange(STATES.EXPANDED)};mraid.setExpandProperties=function(properties){if(disable)return;if(typeof properties.width===\"number\"&&!isNaN(properties.width))expandProperties.width=properties.width;if(typeof properties.height===\"number\"&&!isNaN(properties.height))expandProperties.height=properties.height;if(typeof properties.useCustomClose===\"boolean\"){expandProperties.useCustomClose=properties.useCustomClose;updateDefaultClose()}};mraid.getExpandProperties=function(properties){if(disable)return;var ret={};ret.width=expandProperties.width;ret.height=expandProperties.height;ret.isModal=expandProperties.isModal;ret.useCustomClose=expandProperties.useCustomClose;return ret};mraid.getPlacementType=function(){return placementType};mraid.getVersion=function(){if(disable)return\"\";return\"1.0\"};mraid.getState=function(){if(disable)return\"\";return currentState};mraid.isViewable=function(){if(disable)return false;if(mraid.getState()===\"hidden\")return false;else return true};mraid.open=function(url){if(disable)return;try{flurryBridge.executeCall(\"open\",\"url\",url)}catch(e){console.log(e)}};mraid.playVideo=function(url){if(disable){return;}try{flurryBridge.executeCall(\"playVideo\",\"url\",url);}catch(e){console.log(e);}};mraid.removeEventListener=function(event,listener){if(disable)return;if(!event)broadcastEvent(\"error\",\"Must specify an event.\",\"removeEventListener\");else if(listener&&listeners[event])for(var i=0;i<listeners[event].length;i++){if(listeners[event][i]===listener)listeners[event].splice(i,1)}else if(listeners[event])listeners[event]=[]};mraid.useCustomClose=function(use){if(disable)return;if(typeof use===\"boolean\"){expandProperties.useCustomClose=use;updateDefaultClose()}};return mraid};");
      localStringBuilder.append("window.mraid=mraidCtor(window.flurryadapter," + str2 + ");");
      localStringBuilder.append("})();");
      if (this.g != null)
        this.g.loadUrl(localStringBuilder.toString());
      return;
    }
  }

  private void q()
  {
    eo.a(3, this.b, "activateMraid");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("javascript:");
    localStringBuilder.append("if(window.mraid){window.mraid.stateChange(window.mraid.STATES.DEFAULT);}");
    if (this.g != null)
      this.g.loadUrl(localStringBuilder.toString());
  }

  private void r()
  {
    if (!(getContext() instanceof Activity))
      eo.a(3, this.b, "no activity present");
    Activity localActivity;
    do
    {
      return;
      localActivity = (Activity)getContext();
    }
    while (!e());
    cb.a(localActivity, cb.a(), true);
  }

  private void s()
  {
    if (!(getContext() instanceof Activity));
    Activity localActivity;
    int i1;
    do
    {
      do
      {
        return;
        localActivity = (Activity)getContext();
      }
      while (!e());
      i1 = cb.a(localActivity, getAdUnit().u());
    }
    while (-1 == i1);
    cb.a(localActivity, i1, true);
  }

  private void setFlurryJsEnvInitialized(boolean paramBoolean)
  {
    try
    {
      this.j = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void setMraidJsEnvInitialized(boolean paramBoolean)
  {
    try
    {
      this.y = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private boolean t()
  {
    return this.p != null;
  }

  private void u()
  {
    eo.a(3, this.b, "closing ad");
    if ((e()) || (f()))
    {
      if (!(getContext() instanceof Activity))
        eo.a(3, this.b, "no activity present");
    }
    else
      return;
    ((Activity)getContext()).finish();
  }

  private boolean v()
  {
    return this.s != null;
  }

  private void w()
  {
    this.g.loadUrl("javascript:(function() { document.getElementById('flurry_interstitial_close').style.display = 'none'; })()");
  }

  private void x()
  {
    if ((e()) && (!this.x))
    {
      this.x = true;
      this.h = new Button(getContext());
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(10);
      localLayoutParams.addRule(11);
      float f1 = getResources().getDisplayMetrics().density;
      int i1 = (int)(10.0F * f1);
      localLayoutParams.setMargins(0, i1, i1, 0);
      int i2 = (int)(f1 * 50.0F);
      localLayoutParams.height = i2;
      localLayoutParams.width = i2;
      this.h.setLayoutParams(localLayoutParams);
      this.h.setBackgroundColor(0);
      this.h.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          g.this.a();
        }
      });
      addView(this.h);
    }
  }

  private void y()
  {
    this.g.loadUrl("javascript:if(window.mraid && typeof window.mraid.disable === 'function'){window.mraid.disable();}");
  }

  private void z()
  {
    this.g.loadUrl("javascript:var closeButtonDiv =  document.getElementById('flurry_interstitial_close');if (typeof(element) == 'undefined' || element == null){var newdiv = document.createElement('div');var divIdName = 'flurry_interstitial_close';newdiv.setAttribute('id',divIdName);newdiv.innerHTML = '<a href=\"flurry://flurrycall?event=adWillClose\"><div id=\"rtb_close\"><img src=\"http://cdn.flurry.com/adSpaceStyles.dev/images/bttn-close-bw.png\" alt=\"close advertisement\" /></div></a></div>';document.body.appendChild(newdiv);}");
  }

  public void a()
  {
    a("adWillClose", Collections.emptyMap(), getAdUnit(), getAdLog(), getAdFrameIndex(), 0);
  }

  public void a(a parama, ae paramae, final int paramInt)
  {
    String str1 = parama.a;
    final q localq = parama.c;
    Map localMap = parama.b;
    if (paramInt > 10)
    {
      eo.a(5, this.b, "Maximum depth for event/action loop exceeded when performing action:" + str1 + "," + localMap + ",triggered by:" + localq.a);
      return;
    }
    if (localq.a.equals("clicked"))
    {
      String str7 = (String)localq.b.get("noop");
      if ((str7 != null) && (str7.equals("true")))
      {
        eo.a(4, this.b, "'clicked' event is a noop");
        return;
      }
    }
    eo.a(3, this.b, "performAction(action=" + str1 + ",params=" + parama.b + ",triggering event=" + localq.a + ")");
    int i16;
    String str6;
    int i17;
    if (str1.equals("nextFrame"))
    {
      i16 = 1 + getAdFrameIndex();
      str6 = (String)localMap.get("offset");
      if (str6 != null)
        if (str6.equals("next"))
        {
          i17 = 1 + getAdFrameIndex();
          label259: a(parama, i17);
        }
    }
    while (true)
    {
      while (true)
      {
        a(parama);
        return;
        if (str6.equals("current"))
          break;
        try
        {
          int i18 = Integer.parseInt(str6);
          i17 = i18;
        }
        catch (NumberFormatException localNumberFormatException3)
        {
          eo.a(6, this.b, "caught: " + localNumberFormatException3.getMessage());
        }
      }
      i17 = i16;
      break label259;
      if (str1.equals("closeAd"))
      {
        u();
      }
      else
      {
        if (str1.equals("notifyUser"))
        {
          if (!A())
          {
            eo.a(6, this.b, "View not attached to any window.");
            return;
          }
          AlertDialog.Builder localBuilder = new AlertDialog.Builder(getContext());
          String str3;
          String str4;
          if ((localMap.containsKey("message")) && (localMap.containsKey("confirmDisplay")) && (localMap.containsKey("cancelDisplay")))
          {
            str3 = (String)localMap.get("message");
            str4 = (String)localMap.get("confirmDisplay");
          }
          for (String str5 = (String)localMap.get("cancelDisplay"); ; str5 = "OK")
          {
            localBuilder.setMessage(str3).setCancelable(false).setPositiveButton(str5, new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                HashMap localHashMap = new HashMap();
                localHashMap.put("sourceEvent", localq.a);
                g.this.a("userConfirmed", localHashMap, g.this.getAdUnit(), g.this.getAdLog(), g.this.getAdFrameIndex(), 1 + paramInt);
                paramAnonymousDialogInterface.dismiss();
                if ((g.B(g.this) != null) && (g.this.getCurrentBinding() == 3))
                  g.B(g.this).start();
              }
            }).setNegativeButton(str4, new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                HashMap localHashMap = new HashMap();
                localHashMap.put("sourceEvent", localq.a);
                g.this.a("userCanceled", localHashMap, g.this.getAdUnit(), g.this.getAdLog(), g.this.getAdFrameIndex(), 1 + paramInt);
                paramAnonymousDialogInterface.dismiss();
                if ((g.B(g.this) != null) && (g.this.getCurrentBinding() == 3))
                {
                  g.B(g.this).setCloseConfirmDialogClicked(true);
                  g.B(g.this).start();
                }
              }
            });
            this.A = localBuilder.create();
            if ((this.e != null) && (getCurrentBinding() == 3))
              this.e.pause();
            this.A.show();
            break;
            str3 = "Are you sure?";
            str4 = "Cancel";
          }
        }
        if (!str1.equals("loadAdComponents"))
          break label1020;
        int i13 = 1;
        int i14 = 3;
        if ((localMap.containsKey("min")) && (localMap.containsKey("max")));
        try
        {
          i13 = Integer.parseInt((String)localMap.get("min"));
          int i15 = Integer.parseInt((String)localMap.get("max"));
          i14 = i15;
          if (1 < i13)
            i13--;
          if (1 < i14)
            i14--;
          ArrayList localArrayList = new ArrayList();
          localArrayList.add(getAdUnit());
          localArrayList.addAll(a(getAdUnit().b().toString(), i13, i14));
          if (localArrayList.size() <= 0)
            break label966;
          String str2 = a(localArrayList, getAdUnit().b().toString());
          if (this.g != null)
          {
            this.g.loadUrl("javascript:(function() {var multiadwraps=document.getElementsByClassName('multiAdWrap');if(multiadwraps.length>0){var template=document.getElementsByClassName('multiAdWrap')[0];var compiled=Hogan.compile(template.innerHTML);template.innerHTML='';template.innerHTML=compiled.render(JSON.parse(" + str2 + "));}})();");
            this.g.loadUrl("javascript:flurryadapter.callComplete();");
          }
          Iterator localIterator = localArrayList.iterator();
          while (localIterator.hasNext())
          {
            AdUnit localAdUnit = (AdUnit)localIterator.next();
            HashMap localHashMap3 = new HashMap();
            localHashMap3.put("guid", ((AdFrame)localAdUnit.d().get(0)).g().toString());
            a("rendered", localHashMap3, localAdUnit, b(((AdFrame)localAdUnit.d().get(0)).g().toString()), 0, 0);
          }
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          while (true)
          {
            i13 = 1;
            i14 = 3;
          }
        }
        if ((this.g != null) && (!a(this.g)))
        {
          addView(this.g);
          continue;
          label966: HashMap localHashMap2 = new HashMap();
          localMap.put("errorCode", Integer.toString(b.d.a()));
          a("renderFailed", localHashMap2, getAdUnit(), getAdLog(), getAdFrameIndex(), 0);
        }
      }
    }
    label1020: int i5;
    int i6;
    if (str1.equals("doExpand"))
    {
      i5 = fc.e();
      i6 = fc.f();
      if ((!parama.c.b.containsKey("width")) || (!parama.c.b.containsKey("height")))
        break label1524;
    }
    while (true)
    {
      try
      {
        int i11 = fc.b(Integer.parseInt((String)parama.c.b.get("width")));
        int i12 = fc.b(Integer.parseInt((String)parama.c.b.get("height")));
        i7 = i11;
        i8 = i12;
        eo.a(3, this.b, "expand to width = " + i7 + " height = " + i8);
        if (getHolder() != null)
        {
          a("clicked", Collections.emptyMap(), getAdUnit(), getAdLog(), getAdFrameIndex(), 0);
          a(i7, i8);
        }
        if (!parama.c.b.containsKey("url"))
          break;
        this.a = ((String)parama.c.b.get("url"));
        Intent localIntent = new Intent(do.a().b(), FlurryFullscreenTakeoverActivity.class);
        localIntent.putExtra("url", this.a);
        localIntent.putExtra("is_mraid_ad", true);
        getPlatformModule().a().a(getContext(), localIntent, getAdUnit().b().toString());
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        eo.a(6, this.b, localNumberFormatException1.getMessage());
        int i9 = fc.e();
        int i10 = fc.f();
        i7 = i9;
        i8 = i10;
        continue;
      }
      if (str1.equals("doCollapse"))
      {
        int i1 = getCurrentAdFrame().e().b().intValue();
        int i2 = getCurrentAdFrame().e().c().intValue();
        int i3 = fc.b(i1);
        int i4 = fc.b(i2);
        if (this.a != null)
        {
          this.a = null;
          initLayout();
        }
        if (getHolder() == null)
          break;
        b(i3, i4);
        break;
      }
      if (str1.equals("directOpen"))
      {
        HashMap localHashMap1 = new HashMap();
        localHashMap1.put("noop", "true");
        a("clicked", localHashMap1, getAdUnit(), getAdLog(), getAdFrameIndex(), 0);
      }
      getPlatformModule().a().a(parama, paramae, paramInt);
      break;
      label1524: int i7 = i5;
      int i8 = i6;
    }
  }

  public void a(String paramString, Map<String, String> paramMap, AdUnit paramAdUnit, e parame, int paramInt1, int paramInt2)
  {
    eo.a(3, this.b, "fireEvent(event=" + paramString + ",params=" + paramMap + ")");
    getPlatformModule().a(new q(paramString, paramMap, getContext(), paramAdUnit, parame, paramInt1), this, paramInt2);
  }

  boolean a(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    return (localViewParent != null) && (localViewParent == this);
  }

  @TargetApi(11)
  public void b()
  {
    if ((this.g != null) && (Build.VERSION.SDK_INT >= 11))
    {
      this.f = true;
      this.g.onResume();
    }
    if (this.e != null)
    {
      if ((this.A == null) || (!this.H))
        break label77;
      this.A.show();
      this.H = false;
      eo.a(3, this.b, "Alert dialog in foreground. Do nothing and wait for user input.");
    }
    while (true)
    {
      this.I = true;
      return;
      label77: this.f = true;
      this.e.e();
    }
  }

  @TargetApi(11)
  public void c()
  {
    if ((this.g != null) && (Build.VERSION.SDK_INT >= 11))
      this.g.onPause();
    if (this.e != null)
    {
      if ((this.A != null) && (this.A.isShowing()))
      {
        this.A.dismiss();
        this.H = true;
      }
      this.e.pause();
      this.e.d();
    }
    this.f = false;
    this.I = true;
  }

  public boolean d()
  {
    return (this.A != null) && (this.A.isShowing());
  }

  boolean e()
  {
    return getCurrentFormat().equals("takeover");
  }

  boolean f()
  {
    return getPlatformModule().S() != null;
  }

  boolean g()
  {
    boolean bool = ev.a().c();
    if (!bool)
      eo.a(5, this.b, "There is no network connectivity (ad will not rotate)");
    return (!v()) && (!t()) && (bool);
  }

  AdFrame getCurrentAdFrame()
  {
    return (AdFrame)this.B.get(getAdFrameIndex());
  }

  public int getCurrentBinding()
  {
    return getCurrentAdFrame().b().intValue();
  }

  String getCurrentContent()
  {
    return getCurrentAdFrame().d().toString();
  }

  String getCurrentDisplay()
  {
    return getCurrentAdFrame().c().toString();
  }

  String getCurrentFormat()
  {
    return getCurrentAdFrame().e().e().toString();
  }

  public FlurryFullscreenTakeoverActivity getFullScreenTakeover()
  {
    return this.z;
  }

  l getHolder()
  {
    ViewParent localViewParent = getParent();
    if ((localViewParent instanceof l))
      return (l)localViewParent;
    return null;
  }

  public f getVideoView()
  {
    return this.e;
  }

  public void initLayout()
  {
    eo.a(3, this.b, "initLayout: ad creative layout: {width = " + getCurrentAdFrame().e().b() + ", height = " + getCurrentAdFrame().e().c() + "}");
    Context localContext = getContext();
    removeAllViews();
    setFocusable(true);
    setFocusableInTouchMode(true);
    switch (getCurrentBinding())
    {
    default:
      HashMap localHashMap = new HashMap();
      localHashMap.put("errorCode", Integer.toString(b.f.a()));
      a("renderFailed", localHashMap, getAdUnit(), getAdLog(), getAdFrameIndex(), 0);
      return;
    case 3:
      a(getCurrentDisplay().toString(), false);
      return;
    case 2:
      ci localci = getPlatformModule().b(((AdFrame)this.B.get(getAdFrameIndex())).g().toString());
      if (localci != null)
      {
        boolean bool1 = TextUtils.isEmpty(cf.a(localci.a(cp.b)));
        boolean bool2 = false;
        if (!bool1)
          bool2 = true;
        a(localci.f(), bool2);
        return;
      }
      if (this.g == null)
      {
        this.g = new WebView(localContext);
        this.g.getSettings().setJavaScriptEnabled(true);
        this.g.setVerticalScrollBarEnabled(false);
        this.g.setHorizontalScrollBarEnabled(false);
        this.g.setBackgroundColor(0);
        this.g.clearCache(false);
        this.l = new g.a(this, null);
        this.g.setWebChromeClient(this.l);
        this.k = new g.b(this, null);
        this.g.setWebViewClient(this.k);
      }
      this.g.loadDataWithBaseURL("base://url/", getCurrentDisplay(), "text/html", "utf-8", "base://url/");
      a("rendered", Collections.emptyMap(), getAdUnit(), getAdLog(), getAdFrameIndex(), 0);
      this.g.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
      B();
      if (e())
        a(localContext);
      s();
      return;
    case 1:
    }
    if (this.g == null)
    {
      this.g = new WebView(localContext);
      this.g.getSettings().setJavaScriptEnabled(true);
      this.g.setVerticalScrollBarEnabled(false);
      this.g.setHorizontalScrollBarEnabled(false);
      this.g.setBackgroundColor(0);
      this.g.clearCache(false);
      this.l = new g.a(this, null);
      this.g.setWebChromeClient(this.l);
      this.k = new g.b(this, null);
      this.g.setWebViewClient(this.k);
    }
    if (this.a != null)
      a(this.a);
    while (true)
    {
      this.g.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
      B();
      if (e())
        a(localContext);
      s();
      return;
      if (getAdFrameIndex() == 0)
      {
        String str1 = getPlatformModule().d().b(getAdUnit().b().toString());
        if (str1 == null)
        {
          a(getCurrentDisplay());
        }
        else
        {
          String str2 = cf.c(getCurrentDisplay());
          this.g.loadDataWithBaseURL(str2, str1, "text/html", "utf-8", str2);
          a("rendered", Collections.emptyMap(), getAdUnit(), getAdLog(), getAdFrameIndex(), 0);
        }
      }
      else
      {
        a(getCurrentDisplay());
      }
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.G = true;
  }

  @TargetApi(11)
  public void onDestroy()
  {
    eo.a(3, this.b, "onDestroy");
    if ((getCurrentBinding() == 3) && (this.e != null) && (this.e.isPlaying()))
      this.e.c();
    B();
    if ((this.A != null) && (this.A.isShowing()))
      this.A.dismiss();
    if (this.e != null)
      this.e.f();
    if (this.g != null)
    {
      if ((this.m != null) && (this.l != null))
        this.l.onHideCustomView();
      if (this.s != null)
        b(0, 0);
      removeView(this.g);
      this.g.stopLoading();
      if (Build.VERSION.SDK_INT >= 11)
        this.g.onPause();
      this.g.destroy();
      this.g = null;
    }
    if (e())
      a("adClosed", Collections.emptyMap(), getAdUnit(), getAdLog(), getAdFrameIndex(), 0);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.G = false;
  }

  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    eo.a(3, "listeners", "onkey,keycode=" + paramInt + ",event=" + paramKeyEvent.getAction());
    if ((paramDialogInterface == this.d) && (paramInt == 4) && (paramKeyEvent.getAction() == 1))
    {
      a();
      paramDialogInterface.dismiss();
      return true;
    }
    return false;
  }

  public void setFullScreenTakeover(FlurryFullscreenTakeoverActivity paramFlurryFullscreenTakeoverActivity)
  {
    this.z = paramFlurryFullscreenTakeoverActivity;
  }

  public void setVideoState(am paramam)
  {
    if (this.e != null)
      this.e.setVideoState(paramam);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.g
 * JD-Core Version:    0.6.2
 */