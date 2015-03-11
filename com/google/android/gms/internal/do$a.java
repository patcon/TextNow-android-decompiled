package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.view.View.MeasureSpec;
import android.webkit.WebView;

public final class do$a extends AsyncTask<Void, Void, Boolean>
{
  private final WebView pQ;
  private Bitmap pR;

  public do$a(do paramdo, WebView paramWebView)
  {
    this.pQ = paramWebView;
  }

  protected final Boolean a(Void[] paramArrayOfVoid)
  {
    while (true)
    {
      int k;
      int n;
      try
      {
        int i = this.pR.getWidth();
        int j = this.pR.getHeight();
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
          if (this.pR.getPixel(k, n) != 0)
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
    do.c(this.pS);
    if ((paramBoolean.booleanValue()) || (this.pS.bq()) || (do.d(this.pS) <= 0L))
    {
      this.pS.pP = paramBoolean.booleanValue();
      do.e(this.pS).a(this.pS.lN);
    }
    while (do.d(this.pS) <= 0L)
      return;
    if (eu.p(2))
      eu.z("Ad not detected, scheduling another run.");
    do.g(this.pS).postDelayed(this.pS, do.f(this.pS));
  }

  protected final void onPreExecute()
  {
    try
    {
      this.pR = Bitmap.createBitmap(do.a(this.pS), do.b(this.pS), Bitmap.Config.ARGB_8888);
      this.pQ.setVisibility(0);
      this.pQ.measure(View.MeasureSpec.makeMeasureSpec(do.a(this.pS), 0), View.MeasureSpec.makeMeasureSpec(do.b(this.pS), 0));
      this.pQ.layout(0, 0, do.a(this.pS), do.b(this.pS));
      Canvas localCanvas = new Canvas(this.pR);
      this.pQ.draw(localCanvas);
      this.pQ.invalidate();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.do.a
 * JD-Core Version:    0.6.2
 */