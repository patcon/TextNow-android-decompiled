package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.view.View.MeasureSpec;
import android.webkit.WebView;

public final class fc$a extends AsyncTask<Void, Void, Boolean>
{
  private final WebView tj;
  private Bitmap tk;

  public fc$a(fc paramfc, WebView paramWebView)
  {
    this.tj = paramWebView;
  }

  protected final Boolean a(Void[] paramArrayOfVoid)
  {
    while (true)
    {
      int k;
      int n;
      try
      {
        int i = this.tk.getWidth();
        int j = this.tk.getHeight();
        Object localObject2;
        if ((i == 0) || (j == 0))
        {
          Boolean localBoolean1 = Boolean.valueOf(false);
          localObject2 = localBoolean1;
          return localObject2;
        }
        k = 0;
        int m = 0;
        if (k < i)
        {
          n = 0;
          if (n >= j)
            break label139;
          if (this.tk.getPixel(k, n) != 0)
            m++;
        }
        else
        {
          if (m / (i * j / 100.0D) > 0.1D)
          {
            bool = true;
            Boolean localBoolean2 = Boolean.valueOf(bool);
            localObject2 = localBoolean2;
            continue;
          }
          boolean bool = false;
          continue;
        }
      }
      finally
      {
      }
      n += 10;
      continue;
      label139: k += 10;
    }
  }

  protected final void a(Boolean paramBoolean)
  {
    fc.c(this.tl);
    if ((paramBoolean.booleanValue()) || (this.tl.cA()) || (fc.d(this.tl) <= 0L))
    {
      this.tl.ti = paramBoolean.booleanValue();
      fc.e(this.tl).a(this.tl.md);
    }
    while (fc.d(this.tl) <= 0L)
      return;
    if (gs.u(2))
      gs.S("Ad not detected, scheduling another run.");
    fc.g(this.tl).postDelayed(this.tl, fc.f(this.tl));
  }

  protected final void onPreExecute()
  {
    try
    {
      this.tk = Bitmap.createBitmap(fc.a(this.tl), fc.b(this.tl), Bitmap.Config.ARGB_8888);
      this.tj.setVisibility(0);
      this.tj.measure(View.MeasureSpec.makeMeasureSpec(fc.a(this.tl), 0), View.MeasureSpec.makeMeasureSpec(fc.b(this.tl), 0));
      this.tj.layout(0, 0, fc.a(this.tl), fc.b(this.tl));
      Canvas localCanvas = new Canvas(this.tk);
      this.tj.draw(localCanvas);
      this.tj.invalidate();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fc.a
 * JD-Core Version:    0.6.2
 */