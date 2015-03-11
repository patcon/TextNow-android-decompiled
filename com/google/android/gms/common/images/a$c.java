package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.hk;
import java.lang.ref.WeakReference;

public final class a$c extends a
{
  private WeakReference<ImageManager.OnImageLoadedListener> Ft;

  public a$c(ImageManager.OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri)
  {
    super(paramUri, 0);
    gx.c(paramOnImageLoadedListener);
    this.Ft = new WeakReference(paramOnImageLoadedListener);
  }

  protected final void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (!paramBoolean2)
    {
      ImageManager.OnImageLoadedListener localOnImageLoadedListener = (ImageManager.OnImageLoadedListener)this.Ft.get();
      if (localOnImageLoadedListener != null)
        localOnImageLoadedListener.onImageLoaded(this.Fm.uri, paramDrawable, paramBoolean3);
    }
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c))
      return false;
    if (this == paramObject)
      return true;
    c localc = (c)paramObject;
    ImageManager.OnImageLoadedListener localOnImageLoadedListener1 = (ImageManager.OnImageLoadedListener)this.Ft.get();
    ImageManager.OnImageLoadedListener localOnImageLoadedListener2 = (ImageManager.OnImageLoadedListener)localc.Ft.get();
    return (localOnImageLoadedListener2 != null) && (localOnImageLoadedListener1 != null) && (hk.equal(localOnImageLoadedListener2, localOnImageLoadedListener1)) && (hk.equal(localc.Fm, this.Fm));
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.Fm;
    return hk.hashCode(arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.a.c
 * JD-Core Version:    0.6.2
 */