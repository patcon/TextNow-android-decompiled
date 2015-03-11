package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ac
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private static final long lG = TimeUnit.MILLISECONDS.toNanos(100L);
  private final ae lA;
  private boolean lB;
  private final WindowManager lC;
  private final PowerManager lD;
  private final KeyguardManager lE;
  private ad lF;
  private boolean lH = false;
  private long lI = -9223372036854775808L;
  private boolean lJ;
  private BroadcastReceiver lK;
  private HashSet<z> lL = new HashSet();
  private boolean lj = false;
  private final Object ls = new Object();
  private final WeakReference<ef> lv;
  private WeakReference<ViewTreeObserver> lw;
  private final WeakReference<View> lx;
  private final aa ly;
  private final Context lz;

  public ac(al paramal, ef paramef)
  {
    this(paramal, paramef, paramef.oy.cd(), paramef.oy, new af(paramef.oy.getContext(), paramef.oy.cd()));
  }

  public ac(al paramal, ef paramef, ev paramev, View paramView, ae paramae)
  {
    this.lv = new WeakReference(paramef);
    this.lx = new WeakReference(paramView);
    this.lw = new WeakReference(null);
    this.lJ = true;
    this.ly = new aa(Integer.toString(paramef.hashCode()), paramev, paramal.me, paramef.ry);
    this.lA = paramae;
    this.lC = ((WindowManager)paramView.getContext().getSystemService("window"));
    this.lD = ((PowerManager)paramView.getContext().getApplicationContext().getSystemService("power"));
    this.lE = ((KeyguardManager)paramView.getContext().getSystemService("keyguard"));
    this.lz = paramView.getContext().getApplicationContext();
    a(paramae);
    this.lA.a(new ae.a()
    {
      public void aE()
      {
        ac.b(ac.this, true);
        ac.this.e(false);
        ac.this.av();
      }
    });
    b(this.lA);
    eu.B("Tracking ad unit: " + this.ly.au());
  }

  protected final int a(int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    float f = paramDisplayMetrics.density;
    return (int)(paramInt / f);
  }

  public final void a(ad paramad)
  {
    synchronized (this.ls)
    {
      this.lF = paramad;
      return;
    }
  }

  protected final void a(ae paramae)
  {
    paramae.d("http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.html");
  }

  protected final void a(ex paramex, Map<String, String> paramMap)
  {
    e(false);
  }

  public final void a(z paramz)
  {
    this.lL.add(paramz);
  }

  protected final void a(JSONObject paramJSONObject)
  {
    JSONArray localJSONArray = new JSONArray();
    JSONObject localJSONObject = new JSONObject();
    localJSONArray.put(paramJSONObject);
    localJSONObject.put("units", localJSONArray);
    this.lA.a("AFMA_updateActiveView", localJSONObject);
  }

  protected final boolean a(View paramView, boolean paramBoolean)
  {
    return (paramView.getVisibility() == 0) && (paramBoolean) && (paramView.isShown()) && (this.lD.isScreenOn()) && (!this.lE.inKeyguardRestrictedInputMode());
  }

  protected final void aA()
  {
    View localView = (View)this.lx.get();
    if (localView == null);
    ViewTreeObserver localViewTreeObserver1;
    ViewTreeObserver localViewTreeObserver2;
    do
    {
      return;
      localViewTreeObserver1 = (ViewTreeObserver)this.lw.get();
      localViewTreeObserver2 = localView.getViewTreeObserver();
    }
    while (localViewTreeObserver2 == localViewTreeObserver1);
    this.lw = new WeakReference(localViewTreeObserver2);
    localViewTreeObserver2.addOnScrollChangedListener(this);
    localViewTreeObserver2.addOnGlobalLayoutListener(this);
  }

  protected final void aB()
  {
    ViewTreeObserver localViewTreeObserver = (ViewTreeObserver)this.lw.get();
    if ((localViewTreeObserver == null) || (!localViewTreeObserver.isAlive()))
      return;
    localViewTreeObserver.removeOnScrollChangedListener(this);
    localViewTreeObserver.removeGlobalOnLayoutListener(this);
  }

  protected final JSONObject aC()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("afmaVersion", this.ly.as()).put("activeViewJSON", this.ly.at()).put("timestamp", TimeUnit.NANOSECONDS.toMillis(System.nanoTime())).put("adFormat", this.ly.ar()).put("hashCode", this.ly.au());
    return localJSONObject;
  }

  protected final JSONObject aD()
  {
    JSONObject localJSONObject = aC();
    localJSONObject.put("doneReasonCode", "u");
    return localJSONObject;
  }

  protected final void av()
  {
    synchronized (this.ls)
    {
      if (this.lK != null)
        return;
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      this.lK = new BroadcastReceiver()
      {
        public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          ac.this.e(false);
        }
      };
      this.lz.registerReceiver(this.lK, localIntentFilter);
      return;
    }
  }

  protected final void aw()
  {
    synchronized (this.ls)
    {
      if (this.lK != null)
      {
        this.lz.unregisterReceiver(this.lK);
        this.lK = null;
      }
      return;
    }
  }

  public final void ax()
  {
    synchronized (this.ls)
    {
      if (this.lJ)
      {
        aB();
        aw();
      }
      try
      {
        a(aD());
        this.lJ = false;
        ay();
        eu.B("Untracked ad unit: " + this.ly.au());
        return;
      }
      catch (JSONException localJSONException)
      {
        while (true)
          eu.b("JSON Failure while processing active view data.", localJSONException);
      }
    }
  }

  protected final void ay()
  {
    if (this.lF != null)
      this.lF.a(this);
  }

  public final boolean az()
  {
    synchronized (this.ls)
    {
      boolean bool = this.lJ;
      return bool;
    }
  }

  protected final void b(ae paramae)
  {
    paramae.a("/updateActiveView", new bc()
    {
      public void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
      {
        ac.this.a(paramAnonymousex, paramAnonymousMap);
      }
    });
    paramae.a("/activeViewPingSent", new bc()
    {
      public void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
      {
        if ((paramAnonymousMap.containsKey("pingType")) && ("unloadPing".equals(paramAnonymousMap.get("pingType"))))
        {
          ac.this.c(ac.b(ac.this));
          eu.B("Unregistered GMSG handlers for: " + ac.c(ac.this).au());
        }
      }
    });
    paramae.a("/visibilityChanged", new bc()
    {
      public void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
      {
        if (!paramAnonymousMap.containsKey("isVisible"))
          return;
        if (("1".equals(paramAnonymousMap.get("isVisible"))) || ("true".equals(paramAnonymousMap.get("isVisible"))));
        for (boolean bool = true; ; bool = false)
        {
          Boolean localBoolean = Boolean.valueOf(bool);
          ac.this.d(localBoolean.booleanValue());
          return;
        }
      }
    });
    paramae.a("/viewabilityChanged", bb.mT);
  }

  protected final JSONObject c(View paramView)
  {
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    paramView.getLocationOnScreen(arrayOfInt1);
    paramView.getLocationInWindow(arrayOfInt2);
    JSONObject localJSONObject = aC();
    DisplayMetrics localDisplayMetrics = paramView.getContext().getResources().getDisplayMetrics();
    Rect localRect1 = new Rect();
    localRect1.left = arrayOfInt1[0];
    localRect1.top = arrayOfInt1[1];
    localRect1.right = (localRect1.left + paramView.getWidth());
    localRect1.bottom = (localRect1.top + paramView.getHeight());
    Rect localRect2 = new Rect();
    localRect2.right = this.lC.getDefaultDisplay().getWidth();
    localRect2.bottom = this.lC.getDefaultDisplay().getHeight();
    Rect localRect3 = new Rect();
    boolean bool = paramView.getGlobalVisibleRect(localRect3, null);
    Rect localRect4 = new Rect();
    paramView.getLocalVisibleRect(localRect4);
    localJSONObject.put("viewBox", new JSONObject().put("top", a(localRect2.top, localDisplayMetrics)).put("bottom", a(localRect2.bottom, localDisplayMetrics)).put("left", a(localRect2.left, localDisplayMetrics)).put("right", a(localRect2.right, localDisplayMetrics))).put("adBox", new JSONObject().put("top", a(localRect1.top, localDisplayMetrics)).put("bottom", a(localRect1.bottom, localDisplayMetrics)).put("left", a(localRect1.left, localDisplayMetrics)).put("right", a(localRect1.right, localDisplayMetrics))).put("globalVisibleBox", new JSONObject().put("top", a(localRect3.top, localDisplayMetrics)).put("bottom", a(localRect3.bottom, localDisplayMetrics)).put("left", a(localRect3.left, localDisplayMetrics)).put("right", a(localRect3.right, localDisplayMetrics))).put("localVisibleBox", new JSONObject().put("top", a(localRect4.top, localDisplayMetrics)).put("bottom", a(localRect4.bottom, localDisplayMetrics)).put("left", a(localRect4.left, localDisplayMetrics)).put("right", a(localRect4.right, localDisplayMetrics))).put("screenDensity", localDisplayMetrics.density).put("isVisible", a(paramView, bool)).put("isStopped", this.lH).put("isPaused", this.lj);
    return localJSONObject;
  }

  protected final void c(ae paramae)
  {
    paramae.e("/viewabilityChanged");
    paramae.e("/visibilityChanged");
    paramae.e("/activeViewPingSent");
    paramae.e("/updateActiveView");
  }

  protected final void d(boolean paramBoolean)
  {
    Iterator localIterator = this.lL.iterator();
    while (localIterator.hasNext())
      ((z)localIterator.next()).a(this, paramBoolean);
  }

  protected final void e(boolean paramBoolean)
  {
    long l;
    synchronized (this.ls)
    {
      if ((!this.lB) || (!this.lJ))
        return;
      l = System.nanoTime();
      if ((paramBoolean) && (this.lI + lG > l))
        return;
    }
    this.lI = l;
    ef localef = (ef)this.lv.get();
    View localView = (View)this.lx.get();
    if (localView != null)
      if (localef == null)
        break label150;
    while (true)
    {
      int i;
      if (i != 0)
      {
        ax();
        return;
        i = 0;
      }
      else
      {
        try
        {
          a(c(localView));
          aA();
          ay();
          return;
        }
        catch (JSONException localJSONException)
        {
          while (true)
            eu.b("Active view update failed.", localJSONException);
        }
        label150: i = 1;
      }
    }
  }

  public final void onGlobalLayout()
  {
    e(false);
  }

  public final void onScrollChanged()
  {
    e(true);
  }

  public final void pause()
  {
    synchronized (this.ls)
    {
      this.lj = true;
      e(false);
      this.lA.pause();
      return;
    }
  }

  public final void resume()
  {
    synchronized (this.ls)
    {
      this.lA.resume();
      this.lj = false;
      e(false);
      return;
    }
  }

  public final void stop()
  {
    synchronized (this.ls)
    {
      this.lH = true;
      e(false);
      this.lA.pause();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ac
 * JD-Core Version:    0.6.2
 */