package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ey extends WebViewClient
{
  protected final ex lN;
  private final Object ls = new Object();
  private ba mS;
  private bf nc;
  private bd nd;
  private ey.a pN;
  private final HashMap<String, bc> sH = new HashMap();
  private t sI;
  private ci sJ;
  private boolean sK = false;
  private boolean sL;
  private cl sM;

  public ey(ex paramex, boolean paramBoolean)
  {
    this.lN = paramex;
    this.sL = paramBoolean;
  }

  private static boolean d(Uri paramUri)
  {
    String str = paramUri.getScheme();
    return ("http".equalsIgnoreCase(str)) || ("https".equalsIgnoreCase(str));
  }

  private void e(Uri paramUri)
  {
    String str1 = paramUri.getPath();
    bc localbc = (bc)this.sH.get(str1);
    if (localbc != null)
    {
      Map localMap = eo.c(paramUri);
      if (eu.p(2))
      {
        eu.C("Received GMSG: " + str1);
        Iterator localIterator = localMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          eu.C("  " + str2 + ": " + (String)localMap.get(str2));
        }
      }
      localbc.b(this.lN, localMap);
      return;
    }
    eu.C("No GMSG handler found for GMSG: " + paramUri);
  }

  public final void a(ce paramce)
  {
    boolean bool = this.lN.ce();
    t localt;
    ci localci;
    if ((bool) && (!this.lN.V().mf))
    {
      localt = null;
      localci = null;
      if (!bool)
        break label69;
    }
    while (true)
    {
      a(new ch(paramce, localt, localci, this.sM, this.lN.cd()));
      return;
      localt = this.sI;
      break;
      label69: localci = this.sJ;
    }
  }

  protected void a(ch paramch)
  {
    cf.a(this.lN.getContext(), paramch);
  }

  public final void a(ey.a parama)
  {
    this.pN = parama;
  }

  public void a(t paramt, ci paramci, ba paramba, cl paramcl, boolean paramBoolean, bd parambd)
  {
    a("/appEvent", new az(paramba));
    a("/canOpenURLs", bb.mU);
    a("/click", bb.mV);
    a("/close", bb.mW);
    a("/customClose", bb.mX);
    a("/httpTrack", bb.mY);
    a("/log", bb.mZ);
    a("/open", new bg(parambd));
    a("/touch", bb.na);
    a("/video", bb.nb);
    this.sI = paramt;
    this.sJ = paramci;
    this.mS = paramba;
    this.nd = parambd;
    this.sM = paramcl;
    this.sK = paramBoolean;
  }

  public void a(t paramt, ci paramci, ba paramba, cl paramcl, boolean paramBoolean, bd parambd, bf parambf)
  {
    a(paramt, paramci, paramba, paramcl, paramBoolean, parambd);
    a("/setInterstitialProperties", new be(parambf));
    this.nc = parambf;
  }

  public final void a(String paramString, bc parambc)
  {
    this.sH.put(paramString, parambc);
  }

  public final void a(boolean paramBoolean, int paramInt)
  {
    if ((this.lN.ce()) && (!this.lN.V().mf));
    for (t localt = null; ; localt = this.sI)
    {
      a(new ch(localt, this.sJ, this.sM, this.lN, paramBoolean, paramInt, this.lN.cd()));
      return;
    }
  }

  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    boolean bool = this.lN.ce();
    t localt;
    ci localci;
    if ((bool) && (!this.lN.V().mf))
    {
      localt = null;
      localci = null;
      if (!bool)
        break label89;
    }
    while (true)
    {
      a(new ch(localt, localci, this.mS, this.sM, this.lN, paramBoolean, paramInt, paramString, this.lN.cd(), this.nd));
      return;
      localt = this.sI;
      break;
      label89: localci = this.sJ;
    }
  }

  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool = this.lN.ce();
    t localt;
    if ((bool) && (!this.lN.V().mf))
    {
      localt = null;
      if (!bool)
        break label91;
    }
    label91: for (ci localci = null; ; localci = this.sJ)
    {
      a(new ch(localt, localci, this.mS, this.sM, this.lN, paramBoolean, paramInt, paramString1, paramString2, this.lN.cd(), this.nd));
      return;
      localt = this.sI;
      break;
    }
  }

  public final void aS()
  {
    synchronized (this.ls)
    {
      this.sK = false;
      this.sL = true;
      final cf localcf = this.lN.ca();
      if (localcf != null)
      {
        if (!et.bW())
          et.sv.post(new Runnable()
          {
            public void run()
            {
              localcf.aS();
            }
          });
      }
      else
        return;
      localcf.aS();
    }
  }

  public boolean cj()
  {
    synchronized (this.ls)
    {
      boolean bool = this.sL;
      return bool;
    }
  }

  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    eu.C("Loading resource: " + paramString);
    Uri localUri = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(localUri.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(localUri.getHost())))
      e(localUri);
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (this.pN != null)
    {
      this.pN.a(this.lN);
      this.pN = null;
    }
  }

  public final void r(boolean paramBoolean)
  {
    this.sK = paramBoolean;
  }

  public final void reset()
  {
    synchronized (this.ls)
    {
      this.sH.clear();
      this.sI = null;
      this.sJ = null;
      this.pN = null;
      this.mS = null;
      this.sK = false;
      this.sL = false;
      this.nd = null;
      this.sM = null;
      return;
    }
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    eu.C("AdWebView shouldOverrideUrlLoading: " + paramString);
    Object localObject1 = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(((Uri)localObject1).getScheme())) && ("mobileads.google.com".equalsIgnoreCase(((Uri)localObject1).getHost())))
      e((Uri)localObject1);
    while (true)
    {
      return true;
      if ((this.sK) && (paramWebView == this.lN) && (d((Uri)localObject1)))
        return super.shouldOverrideUrlLoading(paramWebView, paramString);
      if (!this.lN.willNotDraw())
        try
        {
          k localk = this.lN.cc();
          if ((localk != null) && (localk.b((Uri)localObject1)))
          {
            Uri localUri = localk.a((Uri)localObject1, this.lN.getContext());
            localObject1 = localUri;
          }
          localObject2 = localObject1;
          a(new ce("android.intent.action.VIEW", localObject2.toString(), null, null, null, null, null));
        }
        catch (l locall)
        {
          while (true)
          {
            eu.D("Unable to append parameter to URL: " + paramString);
            Object localObject2 = localObject1;
          }
        }
      else
        eu.D("AdWebView unable to handle URL: " + paramString);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ey
 * JD-Core Version:    0.6.2
 */