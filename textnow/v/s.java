package textnow.v;

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
import textnow.x.i;

final class s extends o
  implements Handler.Callback
{
  private static final String[] c = new String[0];
  private static final String[] d = { "_id", "data15" };
  private final Context e;
  private final e<Object, t> f;
  private volatile boolean g = true;
  private final int h;
  private final e<Object, Bitmap> i;
  private final ConcurrentHashMap<ImageView, v> j = new ConcurrentHashMap();
  private final Handler k = new Handler(Looper.getMainLooper(), this);
  private u l;
  private boolean m;
  private boolean n;

  public s(Context paramContext)
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

  private Bitmap a(Object paramObject, boolean paramBoolean)
  {
    t localt = (t)this.f.get(paramObject);
    if ((localt == null) || (localt.a == null))
      return null;
    a(localt, paramBoolean);
    if (localt.c != null)
      this.i.put(paramObject, localt.c);
    Bitmap localBitmap = localt.c;
    localt.c = null;
    return localBitmap;
  }

  private static String a(int paramInt)
  {
    return (paramInt + 1023) / 1024 + "K";
  }

  private void a(ImageView paramImageView, v paramv)
  {
    if (a(paramImageView, paramv, false))
      this.j.remove(paramImageView);
    do
    {
      return;
      this.j.put(paramImageView, paramv);
    }
    while (this.n);
    k();
  }

  private void a(Object paramObject, byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    t localt = new t(paramArrayOfByte);
    localt.b = true;
    if (!paramBoolean1)
      a(localt, paramBoolean2);
    this.f.put(paramObject, localt);
    this.g = false;
  }

  private static void a(t paramt, boolean paramBoolean)
  {
    byte[] arrayOfByte = paramt.a;
    if ((arrayOfByte == null) || (arrayOfByte.length == 0));
    do
    {
      return;
      if (paramt.d == null)
        break;
      paramt.c = ((Bitmap)paramt.d.get());
    }
    while (paramt.c != null);
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, null);
      if ((paramBoolean) && (localBitmap != null))
        localBitmap = f.a(localBitmap, Math.min(localBitmap.getWidth(), localBitmap.getHeight()), 0);
      paramt.c = localBitmap;
      paramt.d = new SoftReference(localBitmap);
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
    }
  }

  private boolean a(ImageView paramImageView, v paramv, boolean paramBoolean)
  {
    if (!paramv.b().equals(paramImageView.getTag()))
    {
      paramv.a(paramImageView);
      return true;
    }
    t localt = (t)this.f.get(paramv.b());
    if (localt == null)
    {
      paramv.a(paramImageView);
      return false;
    }
    if (localt.a == null)
    {
      paramv.a(paramImageView);
      return localt.b;
    }
    Bitmap localBitmap;
    if (localt.d == null)
      localBitmap = null;
    while (localBitmap == null)
      if (localt.a.length < 8192)
      {
        a(localt, paramv.a().a());
        localBitmap = localt.c;
        if (localBitmap == null)
        {
          return false;
          localBitmap = (Bitmap)localt.d.get();
        }
      }
      else
      {
        paramv.a(paramImageView);
        return false;
      }
    z.a(this.e, paramImageView, localBitmap, paramBoolean);
    if (Build.VERSION.SDK_INT >= 12);
    for (int i1 = localBitmap.getByteCount(); ; i1 = localBitmap.getRowBytes() * localBitmap.getHeight())
    {
      if (i1 < this.i.maxSize() / 6)
        this.i.put(paramv.b(), localBitmap);
      localt.c = null;
      return localt.b;
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
      this.l = new u(this, this.e.getContentResolver());
      this.l.start();
    }
  }

  public final Bitmap a(Uri paramUri, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramUri == null);
    Bitmap localBitmap1;
    while (true)
    {
      try
      {
        return BitmapFactory.decodeResource(this.e.getResources(), paramInt);
        if (!paramBoolean1)
        {
          localBitmap1 = a(paramUri, paramBoolean2);
          if (localBitmap1 == null)
            localBitmap1 = k.a(this.e.getContentResolver(), paramUri, paramBoolean1);
          if ((!paramBoolean2) || (localBitmap1 == null))
            break;
          Bitmap localBitmap2 = f.a(localBitmap1, Math.min(localBitmap1.getWidth(), localBitmap1.getHeight()), 0);
          return localBitmap2;
        }
      }
      catch (Throwable localThrowable)
      {
        return null;
      }
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
      Bitmap localBitmap2 = a(paramString, false);
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
                  a(paramString, arrayOfByte, false, false);
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
            a(paramString, null, false, false);
            return null;
          }
          new StringBuilder().append("Cannot download photo ").append(paramString).toString();
          a(paramString, null, false, false);
        }
    }
    catch (Throwable localThrowable)
    {
      localBitmap1 = null;
    }
    return localBitmap1;
  }

  public final void a(ImageView paramImageView, long paramLong, q paramq)
  {
    paramImageView.setTag(Long.valueOf(paramLong));
    if (paramLong == 0L)
    {
      paramq.a(paramImageView);
      this.j.remove(paramImageView);
      return;
    }
    new StringBuilder().append("loadPhoto request: ").append(paramLong).toString();
    a(paramImageView, new v(Long.valueOf(paramLong), w.a, paramq, (byte)0));
  }

  public final void a(ImageView paramImageView, Uri paramUri, q paramq)
  {
    paramImageView.setTag(paramUri);
    if (paramUri == null)
    {
      paramq.a(paramImageView);
      this.j.remove(paramImageView);
      return;
    }
    new StringBuilder().append("loadPhoto request: ").append(paramUri).toString();
    a(paramImageView, new v(paramUri, w.b, paramq, (byte)0));
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
        if (a(localImageView, (v)this.j.get(localImageView), true))
          localIterator1.remove();
      }
      Iterator localIterator2 = this.f.snapshot().values().iterator();
      while (localIterator2.hasNext())
        ((t)localIterator2.next()).c = null;
      if (!this.j.isEmpty())
        k();
    }
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.v.s
 * JD-Core Version:    0.6.2
 */