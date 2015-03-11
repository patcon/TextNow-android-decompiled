package com.admarvel.android.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import com.admarvel.android.util.Logging;
import java.net.URL;

class AdMarvelVideoActivity$c extends AsyncTask<String, Void, Bitmap>
{
  ImageView a;

  public AdMarvelVideoActivity$c(AdMarvelVideoActivity paramAdMarvelVideoActivity, ImageView paramImageView)
  {
    this.a = paramImageView;
  }

  protected Bitmap a(String[] paramArrayOfString)
  {
    String str = paramArrayOfString[0];
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeStream(new URL(str).openStream());
      return localBitmap;
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
    }
    return null;
  }

  protected void a(Bitmap paramBitmap)
  {
    this.a.setImageBitmap(paramBitmap);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity.c
 * JD-Core Version:    0.6.2
 */