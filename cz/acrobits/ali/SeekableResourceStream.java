package cz.acrobits.ali;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.InputStream;

public class SeekableResourceStream extends InputStream
{
  private static final int MARK_CONSTANT = 2147483647;
  public static final int SEEK_CUR = 2;
  public static final int SEEK_END = 3;
  public static final int SEEK_SET = 1;
  private InputStream mInputStream;

  public SeekableResourceStream(InputStream paramInputStream)
  {
    if (!paramInputStream.markSupported())
      throw new RuntimeException("InputStream must support mark()");
    paramInputStream.mark(2147483647);
    paramInputStream.reset();
    this.mInputStream = paramInputStream;
  }

  public static SeekableResourceStream getInstance(int paramInt)
  {
    return new SeekableResourceStream(AndroidUtil.getContext().getResources().openRawResource(paramInt));
  }

  public static SeekableResourceStream getInstance(String paramString)
  {
    return new SeekableResourceStream(AndroidUtil.getContext().getAssets().open(paramString));
  }

  public int available()
  {
    return this.mInputStream.available();
  }

  public void close()
  {
    this.mInputStream.close();
  }

  public int read()
  {
    return this.mInputStream.read();
  }

  public int read(byte[] paramArrayOfByte)
  {
    return this.mInputStream.read(paramArrayOfByte);
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return this.mInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
  }

  public void seek(long paramLong, int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new RuntimeException("Bad 'whence' parameter of seek: " + paramInt);
    case 1:
      this.mInputStream.reset();
      this.mInputStream.mark(2147483647);
      this.mInputStream.skip(paramLong);
      return;
    case 2:
      if (paramLong >= 0L)
        while (paramLong > 0L)
          paramLong -= this.mInputStream.skip(paramLong);
      throw new RuntimeException("Backward seek from SEEK_CUR not supported");
    case 3:
    }
    throw new RuntimeException("Seek from SEEK_END not supported");
  }

  public long skip(long paramLong)
  {
    return this.mInputStream.skip(paramLong);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.ali.SeekableResourceStream
 * JD-Core Version:    0.6.2
 */