package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.iw;
import com.google.android.gms.internal.ix;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.iz.a;

public abstract class a
{
  final a.a KH;
  protected int KI = 0;
  protected int KJ = 0;
  protected ImageManager.OnImageLoadedListener KK;
  private boolean KL = true;
  private boolean KM = false;
  protected int KN;

  public a(Uri paramUri, int paramInt)
  {
    this.KH = new a.a(paramUri);
    this.KJ = paramInt;
  }

  private Drawable a(Context paramContext, iz paramiz, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    if (this.KN > 0)
    {
      iz.a locala = new iz.a(paramInt, this.KN);
      Drawable localDrawable = (Drawable)paramiz.get(locala);
      if (localDrawable == null)
      {
        localDrawable = localResources.getDrawable(paramInt);
        if ((0x1 & this.KN) != 0)
          localDrawable = a(localResources, localDrawable);
        paramiz.put(locala, localDrawable);
      }
      return localDrawable;
    }
    return localResources.getDrawable(paramInt);
  }

  protected Drawable a(Resources paramResources, Drawable paramDrawable)
  {
    return ix.a(paramResources, paramDrawable);
  }

  protected iw a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    if (paramDrawable1 != null)
      if (!(paramDrawable1 instanceof iw));
    for (paramDrawable1 = ((iw)paramDrawable1).gK(); ; paramDrawable1 = null)
      return new iw(paramDrawable1, paramDrawable2);
  }

  void a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    com.google.android.gms.common.internal.a.f(paramBitmap);
    if ((0x1 & this.KN) != 0)
      paramBitmap = ix.a(paramBitmap);
    BitmapDrawable localBitmapDrawable = new BitmapDrawable(paramContext.getResources(), paramBitmap);
    if (this.KK != null)
      this.KK.onImageLoaded(this.KH.uri, localBitmapDrawable, true);
    a(localBitmapDrawable, paramBoolean, false, true);
  }

  void a(Context paramContext, iz paramiz)
  {
    int i = this.KI;
    Drawable localDrawable = null;
    if (i != 0)
      localDrawable = a(paramContext, paramiz, this.KI);
    a(localDrawable, false, true, false);
  }

  void a(Context paramContext, iz paramiz, boolean paramBoolean)
  {
    int i = this.KJ;
    Drawable localDrawable = null;
    if (i != 0)
      localDrawable = a(paramContext, paramiz, this.KJ);
    if (this.KK != null)
      this.KK.onImageLoaded(this.KH.uri, localDrawable, false);
    a(localDrawable, paramBoolean, false, false);
  }

  protected abstract void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);

  public void aw(int paramInt)
  {
    this.KJ = paramInt;
  }

  protected boolean b(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (this.KL) && (!paramBoolean2) && ((!paramBoolean1) || (this.KM));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.a
 * JD-Core Version:    0.6.2
 */