package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.ParcelFileDescriptor;

final class ImageManager$c
  implements Runnable
{
  private final ParcelFileDescriptor Fj;
  private final Uri mUri;

  public ImageManager$c(ImageManager paramImageManager, Uri paramUri, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.mUri = paramUri;
    this.Fj = paramParcelFileDescriptor;
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 32
    //   2: invokestatic 38	com/google/android/gms/internal/gx:az	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: getfield 23	com/google/android/gms/common/images/ImageManager$c:Fj	Landroid/os/ParcelFileDescriptor;
    //   9: astore_1
    //   10: aconst_null
    //   11: astore_2
    //   12: iconst_0
    //   13: istore_3
    //   14: aload_1
    //   15: ifnull +25 -> 40
    //   18: aload_0
    //   19: getfield 23	com/google/android/gms/common/images/ImageManager$c:Fj	Landroid/os/ParcelFileDescriptor;
    //   22: invokevirtual 44	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   25: invokestatic 50	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;
    //   28: astore 11
    //   30: aload 11
    //   32: astore_2
    //   33: aload_0
    //   34: getfield 23	com/google/android/gms/common/images/ImageManager$c:Fj	Landroid/os/ParcelFileDescriptor;
    //   37: invokevirtual 53	android/os/ParcelFileDescriptor:close	()V
    //   40: new 55	java/util/concurrent/CountDownLatch
    //   43: dup
    //   44: iconst_1
    //   45: invokespecial 58	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   48: astore 4
    //   50: aload_0
    //   51: getfield 16	com/google/android/gms/common/images/ImageManager$c:Fi	Lcom/google/android/gms/common/images/ImageManager;
    //   54: invokestatic 64	com/google/android/gms/common/images/ImageManager:g	(Lcom/google/android/gms/common/images/ImageManager;)Landroid/os/Handler;
    //   57: new 66	com/google/android/gms/common/images/ImageManager$f
    //   60: dup
    //   61: aload_0
    //   62: getfield 16	com/google/android/gms/common/images/ImageManager$c:Fi	Lcom/google/android/gms/common/images/ImageManager;
    //   65: aload_0
    //   66: getfield 21	com/google/android/gms/common/images/ImageManager$c:mUri	Landroid/net/Uri;
    //   69: aload_2
    //   70: iload_3
    //   71: aload 4
    //   73: invokespecial 69	com/google/android/gms/common/images/ImageManager$f:<init>	(Lcom/google/android/gms/common/images/ImageManager;Landroid/net/Uri;Landroid/graphics/Bitmap;ZLjava/util/concurrent/CountDownLatch;)V
    //   76: invokevirtual 75	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   79: pop
    //   80: aload 4
    //   82: invokevirtual 78	java/util/concurrent/CountDownLatch:await	()V
    //   85: return
    //   86: astore 8
    //   88: new 80	java/lang/StringBuilder
    //   91: dup
    //   92: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   95: ldc 83
    //   97: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: aload_0
    //   101: getfield 21	com/google/android/gms/common/images/ImageManager$c:mUri	Landroid/net/Uri;
    //   104: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   107: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: pop
    //   111: iconst_1
    //   112: istore_3
    //   113: aconst_null
    //   114: astore_2
    //   115: goto -82 -> 33
    //   118: astore 6
    //   120: new 80	java/lang/StringBuilder
    //   123: dup
    //   124: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   127: ldc 96
    //   129: invokevirtual 87	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: aload_0
    //   133: getfield 21	com/google/android/gms/common/images/ImageManager$c:mUri	Landroid/net/Uri;
    //   136: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   139: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   142: pop
    //   143: return
    //   144: astore 10
    //   146: goto -106 -> 40
    //
    // Exception table:
    //   from	to	target	type
    //   18	30	86	java/lang/OutOfMemoryError
    //   80	85	118	java/lang/InterruptedException
    //   33	40	144	java/io/IOException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.c
 * JD-Core Version:    0.6.2
 */