package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ex extends WebView
  implements DownloadListener
{
  private final WindowManager lC;
  private final Object ls = new Object();
  private al nF;
  private final ev nG;
  private final k pA;
  private final ey sA;
  private final ex.a sB;
  private cf sC;
  private boolean sD;
  private boolean sE;
  private boolean sF;

  private ex(ex.a parama, al paramal, boolean paramBoolean1, boolean paramBoolean2, k paramk, ev paramev)
  {
    super(parama);
    this.sB = parama;
    this.nF = paramal;
    this.sD = paramBoolean1;
    this.pA = paramk;
    this.nG = paramev;
    this.lC = ((WindowManager)getContext().getSystemService("window"));
    setBackgroundColor(0);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setSavePassword(false);
    localWebSettings.setSupportMultipleWindows(true);
    localWebSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    eo.a(parama, paramev.sw, localWebSettings);
    if (Build.VERSION.SDK_INT >= 17)
    {
      er.a(getContext(), localWebSettings);
      setDownloadListener(this);
      if (Build.VERSION.SDK_INT < 11)
        break label202;
      this.sA = new fa(this, paramBoolean2);
      label149: setWebViewClient(this.sA);
      if (Build.VERSION.SDK_INT < 14)
        break label219;
      setWebChromeClient(new fb(this));
    }
    while (true)
    {
      cg();
      return;
      if (Build.VERSION.SDK_INT < 11)
        break;
      eq.a(getContext(), localWebSettings);
      break;
      label202: this.sA = new ey(this, paramBoolean2);
      break label149;
      label219: if (Build.VERSION.SDK_INT >= 11)
        setWebChromeClient(new ez(this));
    }
  }

  public static ex a(Context paramContext, al paramal, boolean paramBoolean1, boolean paramBoolean2, k paramk, ev paramev)
  {
    return new ex(new ex.a(paramContext), paramal, paramBoolean1, paramBoolean2, paramk, paramev);
  }

  private void cg()
  {
    while (true)
    {
      synchronized (this.ls)
      {
        if ((this.sD) || (this.nF.mf))
        {
          if (Build.VERSION.SDK_INT < 14)
          {
            eu.z("Disabling hardware acceleration on an overlay.");
            ch();
            return;
          }
          eu.z("Enabling hardware acceleration on an overlay.");
          ci();
        }
      }
      if (Build.VERSION.SDK_INT < 18)
      {
        eu.z("Disabling hardware acceleration on an AdView.");
        ch();
      }
      else
      {
        eu.z("Enabling hardware acceleration on an AdView.");
        ci();
      }
    }
  }

  private void ch()
  {
    synchronized (this.ls)
    {
      if ((!this.sE) && (Build.VERSION.SDK_INT >= 11))
        eq.d(this);
      this.sE = true;
      return;
    }
  }

  private void ci()
  {
    synchronized (this.ls)
    {
      if ((this.sE) && (Build.VERSION.SDK_INT >= 11))
        eq.e(this);
      this.sE = false;
      return;
    }
  }

  protected void E(String paramString)
  {
    synchronized (this.ls)
    {
      if (!isDestroyed())
      {
        loadUrl(paramString);
        return;
      }
      eu.D("The webview is destroyed. Ignoring action.");
    }
  }

  public al V()
  {
    synchronized (this.ls)
    {
      al localal = this.nF;
      return localal;
    }
  }

  public void a(Context paramContext, al paramal)
  {
    synchronized (this.ls)
    {
      this.sB.setBaseContext(paramContext);
      this.sC = null;
      this.nF = paramal;
      this.sD = false;
      eo.b(this);
      loadUrl("about:blank");
      this.sA.reset();
      return;
    }
  }

  public void a(al paramal)
  {
    synchronized (this.ls)
    {
      this.nF = paramal;
      requestLayout();
      return;
    }
  }

  public void a(cf paramcf)
  {
    synchronized (this.ls)
    {
      this.sC = paramcf;
      return;
    }
  }

  public void a(String paramString, Map<String, ?> paramMap)
  {
    try
    {
      JSONObject localJSONObject = eo.o(paramMap);
      b(paramString, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      eu.D("Could not convert parameters to JSON.");
    }
  }

  public void a(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
      paramJSONObject = new JSONObject();
    String str = paramJSONObject.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("javascript:" + paramString + "(");
    localStringBuilder.append(str);
    localStringBuilder.append(");");
    E(localStringBuilder.toString());
  }

  public void b(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
      paramJSONObject = new JSONObject();
    String str = paramJSONObject.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("javascript:AFMA_ReceiveMessage('");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    localStringBuilder.append(",");
    localStringBuilder.append(str);
    localStringBuilder.append(");");
    eu.C("Dispatching AFMA event: " + localStringBuilder);
    E(localStringBuilder.toString());
  }

  public void bX()
  {
    if (!cb().cj())
      return;
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    Display localDisplay = this.lC.getDefaultDisplay();
    localDisplay.getMetrics(localDisplayMetrics);
    int i = eo.p(getContext());
    float f = 160.0F / localDisplayMetrics.densityDpi;
    int j = (int)(f * localDisplayMetrics.widthPixels);
    int k = (int)(f * (localDisplayMetrics.heightPixels - i));
    try
    {
      b("onScreenInfoChanged", new JSONObject().put("width", j).put("height", k).put("density", localDisplayMetrics.density).put("rotation", localDisplay.getRotation()));
      return;
    }
    catch (JSONException localJSONException)
    {
      eu.b("Error occured while obtaining screen information.", localJSONException);
    }
  }

  public void bY()
  {
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.nG.sw);
    a("onhide", localHashMap);
  }

  public void bZ()
  {
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.nG.sw);
    a("onshow", localHashMap);
  }

  public cf ca()
  {
    synchronized (this.ls)
    {
      cf localcf = this.sC;
      return localcf;
    }
  }

  public ey cb()
  {
    return this.sA;
  }

  public k cc()
  {
    return this.pA;
  }

  public ev cd()
  {
    return this.nG;
  }

  public boolean ce()
  {
    synchronized (this.ls)
    {
      boolean bool = this.sD;
      return bool;
    }
  }

  public Context cf()
  {
    return this.sB.cf();
  }

  public void destroy()
  {
    synchronized (this.ls)
    {
      super.destroy();
      this.sF = true;
      return;
    }
  }

  public boolean isDestroyed()
  {
    synchronized (this.ls)
    {
      boolean bool = this.sF;
      return bool;
    }
  }

  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.parse(paramString1), paramString4);
      getContext().startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      eu.z("Couldn't find an Activity to view url/mimetype: " + paramString1 + " / " + paramString4);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int n;
    for (int i = 2147483647; ; i = n)
    {
      int m;
      label284: 
      do
      {
        int k;
        while (true)
        {
          synchronized (this.ls)
          {
            if ((isInEditMode()) || (this.sD))
            {
              super.onMeasure(paramInt1, paramInt2);
              return;
            }
            int j = View.MeasureSpec.getMode(paramInt1);
            k = View.MeasureSpec.getSize(paramInt1);
            m = View.MeasureSpec.getMode(paramInt2);
            n = View.MeasureSpec.getSize(paramInt2);
            if (j == -2147483648)
              break label284;
            if (j != 1073741824)
              break;
            break label284;
            if ((this.nF.widthPixels > i1) || (this.nF.heightPixels > i))
            {
              float f = this.sB.getResources().getDisplayMetrics().density;
              eu.D("Not enough space to show ad. Needs " + (int)(this.nF.widthPixels / f) + "x" + (int)(this.nF.heightPixels / f) + " dp, but only has " + (int)(k / f) + "x" + (int)(n / f) + " dp.");
              if (getVisibility() != 8)
                setVisibility(4);
              setMeasuredDimension(0, 0);
              return;
            }
          }
          if (getVisibility() != 8)
            setVisibility(0);
          setMeasuredDimension(this.nF.widthPixels, this.nF.heightPixels);
        }
        int i1 = i;
        continue;
        i1 = k;
      }
      while ((m != -2147483648) && (m != 1073741824));
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.pA != null)
      this.pA.a(paramMotionEvent);
    return super.onTouchEvent(paramMotionEvent);
  }

  public void q(boolean paramBoolean)
  {
    synchronized (this.ls)
    {
      this.sD = paramBoolean;
      cg();
      return;
    }
  }

  public void setContext(Context paramContext)
  {
    this.sB.setBaseContext(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ex
 * JD-Core Version:    0.6.2
 */