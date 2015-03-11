package textnow.v;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;

public abstract class o
{
  public static final q a = new p((byte)0);
  public static final q b = new r((byte)0);
  private static o c;

  public static int a()
  {
    return 2130837558;
  }

  public static o a(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    if (c == null)
      c = b(localContext);
    return c;
  }

  public static int b()
  {
    return 2130837994;
  }

  private static o b(Context paramContext)
  {
    try
    {
      s locals = new s(paramContext);
      return locals;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void g()
  {
    if (c != null)
      c.e();
  }

  public abstract Bitmap a(Uri paramUri, int paramInt, boolean paramBoolean1, boolean paramBoolean2);

  public abstract Bitmap a(String paramString);

  public final void a(ImageView paramImageView, long paramLong)
  {
    a(paramImageView, paramLong, a);
  }

  public abstract void a(ImageView paramImageView, long paramLong, q paramq);

  public final void a(ImageView paramImageView, Uri paramUri)
  {
    a(paramImageView, paramUri, a);
  }

  public abstract void a(ImageView paramImageView, Uri paramUri, q paramq);

  public abstract void c();

  public abstract void d();

  public abstract void e();

  public abstract void f();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.v.o
 * JD-Core Version:    0.6.2
 */