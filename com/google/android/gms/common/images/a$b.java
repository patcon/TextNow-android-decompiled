package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.internal.gt;
import com.google.android.gms.internal.gv;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.hk;
import java.lang.ref.WeakReference;

public final class a$b extends a
{
  private WeakReference<ImageView> Fs;

  public a$b(ImageView paramImageView, int paramInt)
  {
    super(null, paramInt);
    gx.c(paramImageView);
    this.Fs = new WeakReference(paramImageView);
  }

  public a$b(ImageView paramImageView, Uri paramUri)
  {
    super(paramUri, 0);
    gx.c(paramImageView);
    this.Fs = new WeakReference(paramImageView);
  }

  private void a(ImageView paramImageView, Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((!paramBoolean2) && (!paramBoolean3));
    for (int i = 1; (i != 0) && ((paramImageView instanceof gv)); i = 0)
    {
      int k = ((gv)paramImageView).fi();
      if ((this.Fo == 0) || (k != this.Fo))
        break;
      return;
    }
    boolean bool = b(paramBoolean1, paramBoolean2);
    if (bool);
    for (Object localObject = a(paramImageView.getDrawable(), paramDrawable); ; localObject = paramDrawable)
    {
      paramImageView.setImageDrawable((Drawable)localObject);
      gv localgv;
      Uri localUri;
      if ((paramImageView instanceof gv))
      {
        localgv = (gv)paramImageView;
        if (!paramBoolean3)
          break label157;
        localUri = this.Fm.uri;
        label115: localgv.g(localUri);
        if (i == 0)
          break label163;
      }
      label157: label163: for (int j = this.Fo; ; j = 0)
      {
        localgv.al(j);
        if (!bool)
          break;
        ((gt)localObject).startTransition(250);
        return;
        localUri = null;
        break label115;
      }
    }
  }

  protected final void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    ImageView localImageView = (ImageView)this.Fs.get();
    if (localImageView != null)
      a(localImageView, paramDrawable, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b))
      return false;
    if (this == paramObject)
      return true;
    b localb = (b)paramObject;
    ImageView localImageView1 = (ImageView)this.Fs.get();
    ImageView localImageView2 = (ImageView)localb.Fs.get();
    return (localImageView2 != null) && (localImageView1 != null) && (hk.equal(localImageView2, localImageView1));
  }

  public final int hashCode()
  {
    return 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.a.b
 * JD-Core Version:    0.6.2
 */