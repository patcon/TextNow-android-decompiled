package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.kc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager
{
  private static final Object Ks = new Object();
  private static HashSet<Uri> Kt = new HashSet();
  private static ImageManager Ku;
  private static ImageManager Kv;
  private final Map<Uri, ImageManager.ImageReceiver> KA;
  private final Map<Uri, Long> KB;
  private final ExecutorService Kw;
  private final ImageManager.b Kx;
  private final iz Ky;
  private final Map<a, ImageManager.ImageReceiver> Kz;
  private final Context mContext;
  private final Handler mHandler;

  private ImageManager(Context paramContext, boolean paramBoolean)
  {
    this.mContext = paramContext.getApplicationContext();
    this.mHandler = new Handler(Looper.getMainLooper());
    this.Kw = Executors.newFixedThreadPool(4);
    if (paramBoolean)
    {
      this.Kx = new ImageManager.b(this.mContext);
      if (kc.hE())
        gG();
    }
    while (true)
    {
      this.Ky = new iz();
      this.Kz = new HashMap();
      this.KA = new HashMap();
      this.KB = new HashMap();
      return;
      this.Kx = null;
    }
  }

  private Bitmap a(a.a parama)
  {
    if (this.Kx == null)
      return null;
    return (Bitmap)this.Kx.get(parama);
  }

  public static ImageManager c(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (Kv == null)
        Kv = new ImageManager(paramContext, true);
      return Kv;
    }
    if (Ku == null)
      Ku = new ImageManager(paramContext, false);
    return Ku;
  }

  public static ImageManager create(Context paramContext)
  {
    return c(paramContext, false);
  }

  private void gG()
  {
    this.mContext.registerComponentCallbacks(new ImageManager.e(this.Kx));
  }

  public final void a(a parama)
  {
    com.google.android.gms.common.internal.a.aT("ImageManager.loadImage() must be called in the main thread");
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
    localb.aw(paramInt);
    a(localb);
  }

  public final void loadImage(ImageManager.OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri)
  {
    a(new a.c(paramOnImageLoadedListener, paramUri));
  }

  public final void loadImage(ImageManager.OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri, int paramInt)
  {
    a.c localc = new a.c(paramOnImageLoadedListener, paramUri);
    localc.aw(paramInt);
    a(localc);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager
 * JD-Core Version:    0.6.2
 */