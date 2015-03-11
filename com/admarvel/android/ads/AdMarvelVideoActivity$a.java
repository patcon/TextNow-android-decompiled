package com.admarvel.android.ads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

class AdMarvelVideoActivity$a
  implements Runnable
{
  private WeakReference<ImageView> b = null;

  public AdMarvelVideoActivity$a(AdMarvelVideoActivity paramAdMarvelVideoActivity, ImageView paramImageView)
  {
    this.b = new WeakReference(paramImageView);
  }

  public void run()
  {
    ImageView localImageView = (ImageView)this.b.get();
    if ((localImageView != null) && (localImageView.getDrawable() != null))
    {
      localImageView.getDrawable().setAlpha(25);
      if ((AdMarvelVideoActivity.e(this.a) != null) && (AdMarvelVideoActivity.e(this.a).c()))
        AdMarvelVideoActivity.e(this.a).b();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity.a
 * JD-Core Version:    0.6.2
 */