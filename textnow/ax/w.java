package textnow.ax;

import android.graphics.Bitmap;
import com.tremorvideo.sdk.android.videoad.r;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipFile;

public final class w
{
  public List<Bitmap> a;
  private int b;

  private Bitmap a(ZipFile paramZipFile, af paramaf, String paramString)
  {
    try
    {
      InputStream localInputStream = paramZipFile.getInputStream(paramZipFile.getEntry(paramString));
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[16384];
      while (true)
      {
        int i = localInputStream.read(arrayOfByte, 0, arrayOfByte.length);
        if (i == -1)
          break;
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      Bitmap localBitmap = paramaf.a(localByteArrayOutputStream.toByteArray(), this.b);
      return localBitmap;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final int a()
  {
    return this.b;
  }

  public final Bitmap a(int paramInt)
  {
    return (Bitmap)this.a.get(paramInt);
  }

  public final void a(ZipFile paramZipFile, af paramaf, int paramInt, y paramy)
  {
    try
    {
      this.b = paramInt;
      int i = paramy.a.readUnsignedByte();
      this.a = new ArrayList(i);
      for (int j = 0; j < i; j++)
      {
        int k = paramy.a.readUnsignedByte();
        StringBuilder localStringBuilder = new StringBuilder(k);
        for (int m = 0; m < k; m++)
          localStringBuilder.append((char)paramy.a.readUnsignedByte());
        this.a.add(a(paramZipFile, paramaf, localStringBuilder.toString()));
        r.a();
      }
    }
    catch (Exception localException)
    {
      r.a(localException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.w
 * JD-Core Version:    0.6.2
 */