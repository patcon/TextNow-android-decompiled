package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.ip;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager
{
  private static final Object EX = new Object();
  private static HashSet<Uri> EY = new HashSet();
  private static ImageManager EZ;
  private static ImageManager Fa;
  private final ExecutorService Fb;
  private final ImageManager.b Fc;
  private final gw Fd;
  private final Map<a, ImageManager.ImageReceiver> Fe;
  private final Map<Uri, ImageManager.ImageReceiver> Ff;
  private final Map<Uri, Long> Fg;
  private final Context mContext;
  private final Handler mHandler;

  private ImageManager(Context paramContext, boolean paramBoolean)
  {
    this.mContext = paramContext.getApplicationContext();
    this.mHandler = new Handler(Looper.getMainLooper());
    this.Fb = Executors.newFixedThreadPool(4);
    if (paramBoolean)
    {
      this.Fc = new ImageManager.b(this.mContext);
      if (ip.gf())
        fc();
    }
    while (true)
    {
      this.Fd = new gw();
      this.Fe = new HashMap();
      this.Ff = new HashMap();
      this.Fg = new HashMap();
      return;
      this.Fc = null;
    }
  }

  private Bitmap a(a.a parama)
  {
    if (this.Fc == null)
      return null;
    return (Bitmap)this.Fc.get(parama);
  }

  public static ImageManager a(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (Fa == null)
        Fa = new ImageManager(paramContext, true);
      return Fa;
    }
    if (EZ == null)
      EZ = new ImageManager(paramContext, false);
    return EZ;
  }

  public static ImageManager create(Context paramContext)
  {
    return a(paramContext, false);
  }

  private void fc()
  {
    this.mContext.registerComponentCallbacks(new ImageManager.e(this.Fc));
  }

  public final void a(a parama)
  {
    gx.ay("ImageManager.loadImage() must be called in the main thread");
    new ImageManager.d(this, parama).run();
  }

  public final void loadImage(ImageView paramImageView, int paramInt)
  {
    a(new a.b(paramImageView, paramInt));
  }

  public final void loadImage(ImageView paramImageView, Uri paramUri)
  {
    a(new a.b(paramImageView, paramUri));
  }

  public final void loadImage(ImageView paramImageView, Uri paramUri, int paramInt)
  {
    a.b localb = new a.b(paramImageView, paramUri);
    localb.aj(paramInt);
    a(localb);
  }

  public final void loadImage(ImageManager.OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri)
  {
    a(new a.c(paramOnImageLoadedListener, paramUri));
  }

  public final void loadImage(ImageManager.OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri, int paramInt)
  {
    a.c localc = new a.c(paramOnImageLoadedListener, paramUri);
    localc.aj(paramInt);
    a(localc);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager
 * JD-Core Version:    0.6.2
 */