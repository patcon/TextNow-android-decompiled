package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class a
  implements SafeParcelable
{
  public static final Parcelable.Creator<a> CREATOR = new b();
  final int AT;
  ParcelFileDescriptor Ew;
  private Bitmap Ex;
  private boolean Ey;
  private File Ez;
  final int xM;

  a(int paramInt1, ParcelFileDescriptor paramParcelFileDescriptor, int paramInt2)
  {
    this.xM = paramInt1;
    this.Ew = paramParcelFileDescriptor;
    this.AT = paramInt2;
    this.Ex = null;
    this.Ey = false;
  }

  public a(Bitmap paramBitmap)
  {
    this.xM = 1;
    this.Ew = null;
    this.AT = 0;
    this.Ex = paramBitmap;
    this.Ey = true;
  }

  private void a(Closeable paramCloseable)
  {
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  // ERROR //
  private java.io.FileOutputStream eT()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 57	com/google/android/gms/common/data/a:Ez	Ljava/io/File;
    //   4: ifnonnull +13 -> 17
    //   7: new 59	java/lang/IllegalStateException
    //   10: dup
    //   11: ldc 61
    //   13: invokespecial 64	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   16: athrow
    //   17: ldc 66
    //   19: ldc 68
    //   21: aload_0
    //   22: getfield 57	com/google/android/gms/common/data/a:Ez	Ljava/io/File;
    //   25: invokestatic 74	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   28: astore_2
    //   29: new 76	java/io/FileOutputStream
    //   32: dup
    //   33: aload_2
    //   34: invokespecial 79	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   37: astore_3
    //   38: aload_0
    //   39: aload_2
    //   40: ldc 80
    //   42: invokestatic 86	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   45: putfield 35	com/google/android/gms/common/data/a:Ew	Landroid/os/ParcelFileDescriptor;
    //   48: aload_2
    //   49: invokevirtual 90	java/io/File:delete	()Z
    //   52: pop
    //   53: aload_3
    //   54: areturn
    //   55: astore_1
    //   56: new 59	java/lang/IllegalStateException
    //   59: dup
    //   60: ldc 92
    //   62: aload_1
    //   63: invokespecial 95	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   66: athrow
    //   67: astore 4
    //   69: new 59	java/lang/IllegalStateException
    //   72: dup
    //   73: ldc 97
    //   75: invokespecial 64	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   78: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   17	29	55	java/io/IOException
    //   29	48	67	java/io/FileNotFoundException
  }

  public void a(File paramFile)
  {
    if (paramFile == null)
      throw new NullPointerException("Cannot set null temp directory");
    this.Ez = paramFile;
  }

  public int describeContents()
  {
    return 0;
  }

  public Bitmap eS()
  {
    DataInputStream localDataInputStream;
    if (!this.Ey)
      localDataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.Ew));
    try
    {
      byte[] arrayOfByte = new byte[localDataInputStream.readInt()];
      int i = localDataInputStream.readInt();
      int j = localDataInputStream.readInt();
      Bitmap.Config localConfig = Bitmap.Config.valueOf(localDataInputStream.readUTF());
      localDataInputStream.read(arrayOfByte);
      a(localDataInputStream);
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      Bitmap localBitmap = Bitmap.createBitmap(i, j, localConfig);
      localBitmap.copyPixelsFromBuffer(localByteBuffer);
      this.Ex = localBitmap;
      this.Ey = true;
      return this.Ex;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException("Could not read from parcel file descriptor", localIOException);
    }
    finally
    {
      a(localDataInputStream);
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Bitmap localBitmap;
    byte[] arrayOfByte;
    DataOutputStream localDataOutputStream;
    if (this.Ew == null)
    {
      localBitmap = this.Ex;
      ByteBuffer localByteBuffer = ByteBuffer.allocate(localBitmap.getRowBytes() * localBitmap.getHeight());
      localBitmap.copyPixelsToBuffer(localByteBuffer);
      arrayOfByte = localByteBuffer.array();
      localDataOutputStream = new DataOutputStream(eT());
    }
    try
    {
      localDataOutputStream.writeInt(arrayOfByte.length);
      localDataOutputStream.writeInt(localBitmap.getWidth());
      localDataOutputStream.writeInt(localBitmap.getHeight());
      localDataOutputStream.writeUTF(localBitmap.getConfig().toString());
      localDataOutputStream.write(arrayOfByte);
      a(localDataOutputStream);
      b.a(this, paramParcel, paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException("Could not write into unlinked file", localIOException);
    }
    finally
    {
      a(localDataOutputStream);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.a
 * JD-Core Version:    0.6.2
 */