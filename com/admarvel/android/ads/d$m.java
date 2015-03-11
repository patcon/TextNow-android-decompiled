package com.admarvel.android.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewParent;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

class d$m
  implements Runnable
{
  private final WeakReference<d> b;

  public d$m(d paramd1, d paramd2)
  {
    this.b = new WeakReference(paramd2);
  }

  public void run()
  {
    if (this.b == null);
    final d locald;
    do
    {
      return;
      locald = (d)this.b.get();
    }
    while ((locald == null) || (locald.b()));
    if ((d.k(locald).get()) || (d.l(locald).get()))
      if ((locald.j != null) && (locald.k))
      {
        locald.e(locald.j + "(" + false + ")");
        locald.k = false;
        if (d.k(locald).get())
          locald.m = true;
      }
    while ((!d.m(locald).get()) || (locald.j == null))
    {
      locald.h();
      new Handler(Looper.getMainLooper()).post(new Runnable()
      {
        public void run()
        {
          locald.stopLoading();
          if (Version.getAndroidSDKVersion() >= 11)
          {
            aa.b(locald);
            return;
          }
          ab.b(locald);
        }
      });
      return;
    }
    int[] arrayOfInt = { -1, -1 };
    locald.getLocationInWindow(arrayOfInt);
    int i;
    label202: int j;
    if (this.a.getHeight() > 0)
    {
      i = this.a.getHeight() / 2;
      ViewParent localViewParent = locald.getParent();
      if (!(localViewParent instanceof m))
        break label394;
      m localm = (m)localViewParent;
      if (localm == null)
        break label394;
      if ((localm.v == -2147483648) || (localm.v <= 0))
        break label382;
      j = localm.v;
    }
    while (true)
    {
      label253: if ((i + (arrayOfInt[1] - j) >= 0) && (i + arrayOfInt[1] < r.h(this.a.getContext())));
      for (int k = 1; ; k = 0)
      {
        if ((locald.j == null) || (!locald.k) || (k == 0))
          break label392;
        String str = locald.j + "(" + false + ")";
        Logging.log("javascript:" + str);
        locald.e(str);
        locald.k = false;
        break;
        i = 0;
        break label202;
        label382: j = 0;
        break label253;
      }
      label392: break;
      label394: j = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.d.m
 * JD-Core Version:    0.6.2
 */