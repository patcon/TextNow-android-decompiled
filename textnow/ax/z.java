package textnow.ax;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.view.Display;
import android.view.WindowManager;
import com.tremorvideo.sdk.android.videoad.r;

public final class z
  implements af
{
  Context a;

  public z(Context paramContext)
  {
    this.a = paramContext;
  }

  public final int a(int paramInt1, int paramInt2)
  {
    Display localDisplay = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
    int i = localDisplay.getWidth();
    int j = localDisplay.getHeight();
    return (int)Math.min(3.0F, Math.max(1.0F, Math.min(paramInt1 / i, paramInt2 / j)));
  }

  public final Bitmap a(byte[] paramArrayOfByte, final int paramInt)
  {
    if (paramArrayOfByte == null)
      return null;
    if (r.p() < 4)
    {
      BitmapFactory.Options localOptions1 = new BitmapFactory.Options();
      localOptions1.inSampleSize = paramInt;
      return BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, localOptions1);
    }
    a locala = new a(paramInt);
    BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
    localOptions2.inScaled = false;
    localOptions2.inDensity = 0;
    localOptions2.inSampleSize = locala.a;
    localOptions2.inPurgeable = true;
    localOptions2.inInputShareable = true;
    Bitmap localBitmap = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, localOptions2);
    localBitmap.setDensity(0);
    return localBitmap;
  }

  final class a
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.z
 * JD-Core Version:    0.6.2
 */