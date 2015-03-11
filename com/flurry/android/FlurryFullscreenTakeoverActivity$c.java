package com.flurry.android;

import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.sdk.cf;
import com.flurry.sdk.n;
import com.flurry.sdk.n.f;
import com.flurry.sdk.r;

final class FlurryFullscreenTakeoverActivity$c
  implements n.f
{
  private int b = 0;

  public FlurryFullscreenTakeoverActivity$c(FlurryFullscreenTakeoverActivity paramFlurryFullscreenTakeoverActivity, int paramInt)
  {
    this.b = paramInt;
  }

  public final boolean a(final n paramn, String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    if (FlurryFullscreenTakeoverActivity.a(this.a, paramString))
    {
      FlurryFullscreenTakeoverActivity.a(this.a, paramBoolean);
      FlurryFullscreenTakeoverActivity.b(this.a, false);
      FlurryFullscreenTakeoverActivity.a(this.a, paramString, this.b);
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return bool;
              if (!cf.d(paramString))
                break;
              if (!paramBoolean)
                paramBoolean = FlurryFullscreenTakeoverActivity.a(this.a, paramString, paramn.getUrl());
              FlurryAdModule.getInstance().a().a(this.a, paramString, FlurryFullscreenTakeoverActivity.a(this.a));
            }
            while (!paramBoolean);
            paramn.post(new Runnable()
            {
              public void run()
              {
                if (paramn.a())
                {
                  paramn.c();
                  return;
                }
                FlurryFullscreenTakeoverActivity.c.this.a.finish();
              }
            });
            return bool;
            if (!cf.e(paramString))
              break;
            bool = FlurryAdModule.getInstance().a().b(this.a, paramString, FlurryFullscreenTakeoverActivity.a(this.a));
          }
          while (!bool);
          if (!paramBoolean)
            paramBoolean = FlurryFullscreenTakeoverActivity.a(this.a, paramString, paramn.getUrl());
        }
        while (!paramBoolean);
        paramn.post(new Runnable()
        {
          public void run()
          {
            if (paramn.a())
            {
              paramn.c();
              return;
            }
            FlurryFullscreenTakeoverActivity.c.this.a.finish();
          }
        });
        return bool;
        bool = FlurryAdModule.getInstance().a().c(this.a, paramString, FlurryFullscreenTakeoverActivity.a(this.a));
      }
      while (!bool);
      if (!paramBoolean)
        paramBoolean = FlurryFullscreenTakeoverActivity.a(this.a, paramString, paramn.getUrl());
    }
    while (!paramBoolean);
    paramn.post(new Runnable()
    {
      public void run()
      {
        if (paramn.a())
        {
          paramn.c();
          return;
        }
        FlurryFullscreenTakeoverActivity.c.this.a.finish();
      }
    });
    return bool;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.android.FlurryFullscreenTakeoverActivity.c
 * JD-Core Version:    0.6.2
 */