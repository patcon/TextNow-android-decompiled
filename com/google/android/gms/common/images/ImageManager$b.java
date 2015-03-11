package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import com.google.android.gms.internal.hq;
import com.google.android.gms.internal.ip;

final class ImageManager$b extends hq<a.a, Bitmap>
{
  public ImageManager$b(Context paramContext)
  {
    super(D(paramContext));
  }

  private static int D(Context paramContext)
  {
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    int i;
    if ((0x100000 & paramContext.getApplicationInfo().flags) != 0)
    {
      i = 1;
      if ((i == 0) || (!ip.gc()))
        break label55;
    }
    label55: for (int j = ImageManager.a.a(localActivityManager); ; j = localActivityManager.getMemoryClass())
    {
      return (int)(0.33F * (j * 1048576));
      i = 0;
      break;
    }
  }

  protected final int a(a.a parama, Bitmap paramBitmap)
  {
    return paramBitmap.getHeight() * paramBitmap.getRowBytes();
  }

  protected final void a(boolean paramBoolean, a.a parama, Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    super.entryRemoved(paramBoolean, parama, paramBitmap1, paramBitmap2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.b
 * JD-Core Version:    0.6.2
 */