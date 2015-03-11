package textnow.q;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.ImageView;
import com.enflick.android.TextNow.api.common.TNDownloadCommand;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import textnow.e.e;
import textnow.s.i;

final class u extends q
  implements Handler.Callback
{
  private static final String[] c = new String[0];
  private static final String[] d = { "_id", "data15" };
  private final Context e;
  private final e<Object, v> f;
  private volatile boolean g = true;
  private final int h;
  private final e<Object, Bitmap> i;
  private final ConcurrentHashMap<ImageView, x> j = new ConcurrentHashMap();
  private final Handler k = new Handler(Looper.getMainLooper(), this);
  private w l;
  private boolean m;
  private boolean n;

  public u(Context paramContext)
  {
    this.e = paramContext;
    long l1 = j();
    new StringBuilder().append("Avail mem: ").append(l1).toString();
    if (l1 >= 671088640L);
    for (float f1 = 1.0F; ; f1 = 0.5F)
    {
      this.i = new e((int)(1769472.0F * f1))
      {
      };
      int i1 = (int)(2000000.0F * f1);
      this.f = new e(i1)
      {
      };
      this.h = ((int)(0.75D * i1));
      new StringBuilder().append("Cache adj: ").append(f1).toString();
      if (a.a)
        new StringBuilder().append("Cache size: ").append(a(this.f.maxSize())).append(" + ").append(a(this.i.maxSize())).toString();
      return;
    }
  }

  private Bitmap a(Object paramObject)
  {
    v localv = (v)this.f.get(paramObject);
    if ((localv == null) || (localv.a == null))
      return null;
    a(localv);
    if (localv.c != null)
      this.i.put(paramObject, localv.c);
    Bitmap localBitmap = localv.c;
    localv.c = null;
    return localBitmap;
  }

  private static String a(int paramInt)
  {
    return (paramInt + 1023) / 1024 + "K";
  }

  private void a(ImageView paramImageView, x paramx)
  {
    if (a(paramImageView, paramx, false))
      this.j.remove(paramImageView);
    do
    {
      return;
      this.j.put(paramImageView, paramx);
    }
    while (this.n);
    k();
  }

  private void a(Object paramObject, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    v localv = new v(paramArrayOfByte);
    localv.b = true;
    if (!paramBoolean)
      a(localv);
    this.f.put(paramObject, localv);
    this.g = false;
  }

  private static void a(v paramv)
  {
    byte[] arrayOfByte = paramv.a;
    if ((arrayOfByte == null) || (arrayOfByte.length == 0));
    do
    {
      return;
      if (paramv.d == null)
        break;
      paramv.c = ((Bitmap)paramv.d.get());
    }
    while (paramv.c != null);
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, null);
      paramv.c = localBitmap;
      paramv.d = new SoftReference(localBitmap);
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
    }
  }

  private boolean a(ImageView paramImageView, x paramx, boolean paramBoolean)
  {
    if (!paramx.b().equals(paramImageView.getTag()))
    {
      paramx.a(paramImageView);
      return true;
    }
    v localv = (v)this.f.get(paramx.b());
    if (localv == null)
    {
      paramx.a(paramImageView);
      return false;
    }
    if (localv.a == null)
    {
      paramx.a(paramImageView);
      return localv.b;
    }
    Bitmap localBitmap;
    if (localv.d == null)
      localBitmap = null;
    while (localBitmap == null)
      if (localv.a.length < 8192)
      {
        a(localv);
        localBitmap = localv.c;
        if (localBitmap == null)
        {
          return false;
          localBitmap = (Bitmap)localv.d.get();
        }
      }
      else
      {
        paramx.a(paramImageView);
        return false;
      }
    ad.a(this.e, paramImageView, localBitmap, paramBoolean);
    if (Build.VERSION.SDK_INT >= 11);
    for (int i1 = localBitmap.getByteCount(); ; i1 = localBitmap.getRowBytes() * localBitmap.getHeight())
    {
      if (i1 < this.i.maxSize() / 6)
        this.i.put(paramx.b(), localBitmap);
      localv.c = null;
      return localv.b;
    }
  }

  private static long j()
  {
    long l1 = 0L;
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
      l1 = 1024L * Long.valueOf(localBufferedReader.readLine().split("\\s+")[1]).longValue();
      localBufferedReader.close();
      return l1;
    }
    catch (Exception localException)
    {
    }
    return l1;
  }

  private void k()
  {
    if (!this.m)
    {
      this.m = true;
      this.k.sendEmptyMessage(1);
    }
  }

  private void l()
  {
    if (this.l == null)
    {
      this.l = new w(this, this.e.getContentResolver());
      this.l.start();
    }
  }

  public final Bitmap a(Uri paramUri, int paramInt)
  {
    if (paramUri == null);
    Bitmap localBitmap1;
    try
    {
      return BitmapFactory.decodeResource(this.e.getResources(), paramInt);
      localBitmap1 = a(paramUri);
      if (localBitmap1 == null)
      {
        Bitmap localBitmap2 = k.c(this.e.getContentResolver(), paramUri);
        return localBitmap2;
      }
    }
    catch (Throwable localThrowable)
    {
      localBitmap1 = null;
    }
    return localBitmap1;
  }

  public final Bitmap a(String paramString)
  {
    Bitmap localBitmap1;
    try
    {
      if (TextUtils.isEmpty(paramString))
        return null;
      Bitmap localBitmap2 = a(paramString);
      localBitmap1 = localBitmap2;
      if (localBitmap1 == null)
        while (true)
        {
          try
          {
            new StringBuilder().append("Downloading ").append(paramString).toString();
            i locali = new TNDownloadCommand(this.e, paramString).a();
            if (locali.d() == 200)
            {
              InputStream localInputStream = (InputStream)locali.b();
              if (localInputStream != null)
              {
                ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
                try
                {
                  n.a(localInputStream, localByteArrayOutputStream);
                  localInputStream.close();
                  byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
                  a(paramString, arrayOfByte, false);
                  return BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
                }
                finally
                {
                  localInputStream.close();
                }
              }
            }
          }
          catch (Exception localException)
          {
            new StringBuilder().append("Cannot download photo ").append(paramString).toString();
            a(paramString, null, false);
            return null;
          }
          new StringBuilder().append("Cannot download photo ").append(paramString).toString();
          a(paramString, null, false);
        }
    }
    catch (Throwable localThrowable)
    {
      localBitmap1 = null;
    }
    return localBitmap1;
  }

  public final void a(ImageView paramImageView, long paramLong, s params)
  {
    paramImageView.setTag(Long.valueOf(paramLong));
    if (paramLong == 0L)
    {
      params.a(paramImageView);
      this.j.remove(paramImageView);
      return;
    }
    new StringBuilder().append("loadPhoto request: ").append(paramLong).toString();
    a(paramImageView, new x(Long.valueOf(paramLong), y.a, params, (byte)0));
  }

  public final void a(ImageView paramImageView, Uri paramUri, s params)
  {
    paramImageView.setTag(paramUri);
    if (paramUri == null)
    {
      params.a(paramImageView);
      this.j.remove(paramImageView);
      return;
    }
    new StringBuilder().append("loadPhoto request: ").append(paramUri).toString();
    a(paramImageView, new x(paramUri, y.b, params, (byte)0));
  }

  public final void c()
  {
    this.n = true;
  }

  public final void d()
  {
    this.n = false;
    if (!this.j.isEmpty())
      k();
  }

  public final void e()
  {
    this.j.clear();
    this.f.evictAll();
    this.i.evictAll();
  }

  public final void f()
  {
    l();
    this.l.a();
  }

  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return false;
    case 1:
      this.m = false;
      if (!this.n)
      {
        l();
        this.l.b();
      }
      return true;
    case 2:
    }
    if (!this.n)
    {
      Iterator localIterator1 = this.j.keySet().iterator();
      while (localIterator1.hasNext())
      {
        ImageView localImageView = (ImageView)localIterator1.next();
        if (a(localImageView, (x)this.j.get(localImageView), true))
          localIterator1.remove();
      }
      Iterator localIterator2 = this.f.snapshot().values().iterator();
      while (localIterator2.hasNext())
        ((v)localIterator2.next()).c = null;
      if (!this.j.isEmpty())
        k();
    }
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.u
 * JD-Core Version:    0.6.2
 */