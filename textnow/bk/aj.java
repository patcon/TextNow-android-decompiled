package textnow.bk;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build.VERSION;

final class aj
  implements an, ao, h
{
  private static aj a;
  private am b;
  private aw c;
  private ax d;
  private f e;

  private aj(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 12);
    for (this.c = new bz(); ; this.c = new e())
    {
      this.b = new z(paramContext, this);
      this.d = new ap(this.b, this);
      this.e = new f(this);
      return;
    }
  }

  public static aj a(Context paramContext)
  {
    try
    {
      if (a == null)
        a = new aj(paramContext.getApplicationContext());
      aj localaj = a;
      return localaj;
    }
    finally
    {
    }
  }

  public final az a(q paramq, al paramal)
  {
    String str1 = paramq.a();
    String str2 = paramq.a();
    if ((str2 == null) || (str2.length() == 0))
      throw new IllegalArgumentException("Null URI passed into the image system.");
    if (paramal == null)
      throw new IllegalArgumentException("The ImageCacherListener must not be null.");
    if (paramq.c() == null)
      throw new IllegalArgumentException("The ScalingInfo must not be null.");
    if (!paramq.g())
    {
      int i = c(paramq);
      if ((this.b.a(paramq)) && (i != -1))
      {
        t localt = new t(str1, i, paramq.b().j);
        Bitmap localBitmap = this.c.a(localt);
        if (localBitmap != null)
          return new az(localBitmap, bb.a, ba.b);
      }
    }
    new ak(this, paramq, paramal).execute(new Void[0]);
    return new az(null, null, ba.a);
  }

  public final bq a(q paramq)
  {
    return this.d.a(paramq);
  }

  public final bq a(q paramq, t paramt, bb parambb)
  {
    return this.b.a(paramq, paramt, parambb);
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

  public final void a(final al paramal)
  {
    new AsyncTask()
    {
    }
    .execute(new Void[0]);
  }

  public final void a(t paramt, Bitmap paramBitmap, bb parambb)
  {
    this.c.a(paramBitmap, paramt);
    this.e.a(paramBitmap, parambb, paramt);
  }

  public final void a(t paramt, String paramString)
  {
    this.e.a(paramt, paramString);
  }

  public final bq b(q paramq)
  {
    return this.b.c(paramq);
  }

  public final void b(String paramString)
  {
    this.e.a(paramString);
  }

  public final void b(String paramString1, String paramString2)
  {
    this.e.a(paramString1, paramString2);
  }

  public final int c(q paramq)
  {
    by localby = paramq.c();
    if (localby.a != null)
      return localby.a.intValue();
    return this.b.b(paramq);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.aj
 * JD-Core Version:    0.6.2
 */