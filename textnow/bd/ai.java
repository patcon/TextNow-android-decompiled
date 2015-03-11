package textnow.bd;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build.VERSION;

final class ai
  implements am, an, h
{
  private static ai a;
  private al b;
  private av c;
  private aw d;
  private f e;

  private ai(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 12);
    for (this.c = new bx(); ; this.c = new e())
    {
      this.b = new y(paramContext, this);
      this.d = new ao(this.b, this);
      this.e = new f(this);
      return;
    }
  }

  public static ai a(Context paramContext)
  {
    try
    {
      if (a == null)
        a = new ai(paramContext.getApplicationContext());
      ai localai = a;
      return localai;
    }
    finally
    {
    }
  }

  public final ay a(p paramp, ak paramak)
  {
    String str1 = paramp.a();
    String str2 = paramp.a();
    if ((str2 == null) || (str2.length() == 0))
      throw new IllegalArgumentException("Null URI passed into the image system.");
    if (paramak == null)
      throw new IllegalArgumentException("The ImageCacherListener must not be null.");
    if (paramp.c() == null)
      throw new IllegalArgumentException("The ScalingInfo must not be null.");
    if (!paramp.g())
    {
      int i = c(paramp);
      if ((this.b.a(paramp)) && (i != -1))
      {
        s locals = new s(str1, i, paramp.b().j);
        Bitmap localBitmap = this.c.a(locals);
        if (localBitmap != null)
          return new ay(localBitmap, ba.a, az.b);
      }
    }
    new aj(this, paramp, paramak).execute(new Void[0]);
    return new ay(null, null, az.a);
  }

  public final bo a(p paramp)
  {
    return this.d.a(paramp);
  }

  public final bo a(p paramp, s params, ba paramba)
  {
    return this.b.a(paramp, params, paramba);
  }

  public final void a()
  {
    this.c.a();
  }

  public final void a(String paramString)
  {
    this.e.b(paramString);
  }

  public final void a(String paramString1, String paramString2)
  {
    this.e.b(paramString1, paramString2);
  }

  public final void a(final ak paramak)
  {
    new AsyncTask()
    {
    }
    .execute(new Void[0]);
  }

  public final void a(s params, Bitmap paramBitmap, ba paramba)
  {
    this.c.a(paramBitmap, params);
    this.e.a(paramBitmap, paramba, params);
  }

  public final void a(s params, String paramString)
  {
    this.e.a(params, paramString);
  }

  public final bo b(p paramp)
  {
    return this.b.c(paramp);
  }

  public final void b(String paramString)
  {
    this.e.a(paramString);
  }

  public final void b(String paramString1, String paramString2)
  {
    this.e.a(paramString1, paramString2);
  }

  public final int c(p paramp)
  {
    bw localbw = paramp.c();
    if (localbw.a != null)
      return localbw.a.intValue();
    return this.b.b(paramp);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.ai
 * JD-Core Version:    0.6.2
 */