package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.gt;
import com.google.android.gms.internal.gu;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gw.a;
import com.google.android.gms.internal.gx;

public abstract class a
{
  final a.a Fm;
  protected int Fn = 0;
  protected int Fo = 0;
  private boolean Fp = true;
  private boolean Fq = false;
  protected int Fr;

  public a(Uri paramUri, int paramInt)
  {
    this.Fm = new a.a(paramUri);
    this.Fo = paramInt;
  }

  private Drawable a(Context paramContext, gw paramgw, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    if (this.Fr > 0)
    {
      gw.a locala = new gw.a(paramInt, this.Fr);
      Drawable localDrawable = (Drawable)paramgw.get(locala);
      if (localDrawable == null)
      {
        localDrawable = localResources.getDrawable(paramInt);
        if ((0x1 & this.Fr) != 0)
          localDrawable = a(localResources, localDrawable);
        paramgw.put(locala, localDrawable);
      }
      return localDrawable;
    }
    return localResources.getDrawable(paramInt);
  }

  protected Drawable a(Resources paramResources, Drawable paramDrawable)
  {
    return gu.a(paramResources, paramDrawable);
  }

  protected gt a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    if (paramDrawable1 != null)
      if (!(paramDrawable1 instanceof gt));
    for (paramDrawable1 = ((gt)paramDrawable1).fg(); ; paramDrawable1 = null)
      return new gt(paramDrawable1, paramDrawable2);
  }

  void a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    gx.c(paramBitmap);
    if ((0x1 & this.Fr) != 0)
      paramBitmap = gu.a(paramBitmap);
    a(new BitmapDrawable(paramContext.getResources(), paramBitmap), paramBoolean, false, true);
  }

  void a(Context paramContext, gw paramgw)
  {
    int i = this.Fn;
    Drawable localDrawable = null;
    if (i != 0)
      localDrawable = a(paramContext, paramgw, this.Fn);
    a(localDrawable, false, true, false);
  }

  void a(Context paramContext, gw paramgw, boolean paramBoolean)
  {
    int i = this.Fo;
    Drawable localDrawable = null;
    if (i != 0)
      localDrawable = a(paramContext, paramgw, this.Fo);
    a(localDrawable, paramBoolean, false, false);
  }

  protected abstract void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);

  public void aj(int paramInt)
  {
    this.Fo = paramInt;
  }

  protected boolean b(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (this.Fp) && (!paramBoolean2) && ((!paramBoolean1) || (this.Fq));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.a
 * JD-Core Version:    0.6.2
 */