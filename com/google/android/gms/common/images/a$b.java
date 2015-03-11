package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.iw;
import com.google.android.gms.internal.iy;
import java.lang.ref.WeakReference;

public final class a$b extends a
{
  private WeakReference<ImageView> KO;

  public a$b(ImageView paramImageView, int paramInt)
  {
    super(null, paramInt);
    com.google.android.gms.common.internal.a.f(paramImageView);
    this.KO = new WeakReference(paramImageView);
  }

  public a$b(ImageView paramImageView, Uri paramUri)
  {
    super(paramUri, 0);
    com.google.android.gms.common.internal.a.f(paramImageView);
    this.KO = new WeakReference(paramImageView);
  }

  private void a(ImageView paramImageView, Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((!paramBoolean2) && (!paramBoolean3));
    for (int i = 1; (i != 0) && ((paramImageView instanceof iy)); i = 0)
    {
      int k = ((iy)paramImageView).gM();
      if ((this.KJ == 0) || (k != this.KJ))
        break;
      return;
    }
    boolean bool = b(paramBoolean1, paramBoolean2);
    if (bool);
    for (Object localObject = a(paramImageView.getDrawable(), paramDrawable); ; localObject = paramDrawable)
    {
      paramImageView.setImageDrawable((Drawable)localObject);
      iy localiy;
      Uri localUri;
      if ((paramImageView instanceof iy))
      {
        localiy = (iy)paramImageView;
        if (!paramBoolean3)
          break label157;
        localUri = this.KH.uri;
        label115: localiy.g(localUri);
        if (i == 0)
          break label163;
      }
      label157: label163: for (int j = this.KJ; ; j = 0)
      {
        localiy.ay(j);
        if (!bool)
          break;
        ((iw)localObject).startTransition(250);
        return;
        localUri = null;
        break label115;
      }
    }
  }

  protected final void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    ImageView localImageView = (ImageView)this.KO.get();
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
    ImageView localImageView1 = (ImageView)this.KO.get();
    ImageView localImageView2 = (ImageView)localb.KO.get();
    return (localImageView2 != null) && (localImageView1 != null) && (n.equal(localImageView2, localImageView1));
  }

  public final int hashCode()
  {
    return 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.a.b
 * JD-Core Version:    0.6.2
 */