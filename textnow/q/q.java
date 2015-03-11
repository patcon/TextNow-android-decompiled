package textnow.q;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;

public abstract class q
{
  public static final s a = new r((byte)0);
  public static final s b = new t((byte)0);
  private static q c;

  public static int a()
  {
    return 2130837594;
  }

  public static q a(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    if (c == null)
      c = b(localContext);
    return c;
  }

  public static int b()
  {
    return 2130838032;
  }

  private static q b(Context paramContext)
  {
    try
    {
      u localu = new u(paramContext);
      return localu;
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

  public abstract Bitmap a(Uri paramUri, int paramInt);

  public abstract Bitmap a(String paramString);

  public final void a(ImageView paramImageView, long paramLong)
  {
    a(paramImageView, paramLong, a);
  }

  public abstract void a(ImageView paramImageView, long paramLong, s params);

  public final void a(ImageView paramImageView, Uri paramUri)
  {
    a(paramImageView, paramUri, a);
  }

  public abstract void a(ImageView paramImageView, Uri paramUri, s params);

  public abstract void c();

  public abstract void d();

  public abstract void e();

  public abstract void f();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.q
 * JD-Core Version:    0.6.2
 */