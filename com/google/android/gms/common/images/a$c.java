package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.n;
import java.lang.ref.WeakReference;

public final class a$c extends a
{
  private WeakReference<ImageManager.OnImageLoadedListener> KP;

  public a$c(ImageManager.OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri)
  {
    super(paramUri, 0);
    com.google.android.gms.common.internal.a.f(paramOnImageLoadedListener);
    this.KP = new WeakReference(paramOnImageLoadedListener);
  }

  protected final void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (!paramBoolean2)
    {
      ImageManager.OnImageLoadedListener localOnImageLoadedListener = (ImageManager.OnImageLoadedListener)this.KP.get();
      if (localOnImageLoadedListener != null)
        localOnImageLoadedListener.onImageLoaded(this.KH.uri, paramDrawable, paramBoolean3);
    }
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c))
      return false;
    if (this == paramObject)
      return true;
    c localc = (c)paramObject;
    ImageManager.OnImageLoadedListener localOnImageLoadedListener1 = (ImageManager.OnImageLoadedListener)this.KP.get();
    ImageManager.OnImageLoadedListener localOnImageLoadedListener2 = (ImageManager.OnImageLoadedListener)localc.KP.get();
    return (localOnImageLoadedListener2 != null) && (localOnImageLoadedListener1 != null) && (n.equal(localOnImageLoadedListener2, localOnImageLoadedListener1)) && (n.equal(localc.KH, this.KH));
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.KH;
    return n.hashCode(arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.a.c
 * JD-Core Version:    0.6.2
 */