package textnow.v;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.text.TextUtils;
import android.util.Pair;
import com.enflick.android.TextNow.TextNowApp;
import java.io.IOException;

public final class f
{
  public static int a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return 0;
    if (paramString.startsWith("file://"))
      paramString = paramString.substring(7);
    try
    {
      int i = new ExifInterface(paramString).getAttributeInt("Orientation", 0);
      return i;
    }
    catch (IOException localIOException)
    {
    }
    return 0;
  }

  // ERROR //
  public static Bitmap a(android.content.ContentResolver paramContentResolver, android.net.Uri paramUri, int paramInt)
  {
    // Byte code:
    //   0: new 45	android/graphics/BitmapFactory$Options
    //   3: dup
    //   4: invokespecial 48	android/graphics/BitmapFactory$Options:<init>	()V
    //   7: astore_3
    //   8: aload_3
    //   9: iconst_1
    //   10: putfield 52	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   13: aload_0
    //   14: aload_1
    //   15: invokevirtual 58	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   18: aconst_null
    //   19: aload_3
    //   20: invokestatic 64	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   23: pop
    //   24: aload_3
    //   25: iload_2
    //   26: invokestatic 67	textnow/v/f:a	(Landroid/graphics/BitmapFactory$Options;I)Landroid/util/Pair;
    //   29: astore 6
    //   31: aload 6
    //   33: ifnonnull +5 -> 38
    //   36: aconst_null
    //   37: areturn
    //   38: aload_0
    //   39: aload_1
    //   40: invokevirtual 58	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   43: aconst_null
    //   44: aload_3
    //   45: invokestatic 64	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   48: astore 8
    //   50: aload 8
    //   52: ifnull +53 -> 105
    //   55: aload 8
    //   57: aload 6
    //   59: getfield 73	android/util/Pair:first	Ljava/lang/Object;
    //   62: checkcast 75	java/lang/Integer
    //   65: invokevirtual 79	java/lang/Integer:intValue	()I
    //   68: aload 6
    //   70: getfield 82	android/util/Pair:second	Ljava/lang/Object;
    //   73: checkcast 75	java/lang/Integer
    //   76: invokevirtual 79	java/lang/Integer:intValue	()I
    //   79: iconst_0
    //   80: invokestatic 85	textnow/v/f:a	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   83: astore 12
    //   85: aload 12
    //   87: areturn
    //   88: astore 7
    //   90: aconst_null
    //   91: areturn
    //   92: astore 11
    //   94: aload 8
    //   96: areturn
    //   97: astore 9
    //   99: aload 9
    //   101: invokestatic 91	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   104: pop
    //   105: aload 8
    //   107: areturn
    //   108: astore 4
    //   110: aconst_null
    //   111: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   38	50	88	java/lang/OutOfMemoryError
    //   55	85	92	java/lang/OutOfMemoryError
    //   55	85	97	java/lang/Exception
    //   0	31	108	java/lang/Exception
    //   38	50	108	java/lang/Exception
    //   99	105	108	java/lang/Exception
  }

  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt1, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    if ((paramBitmap.getWidth() != paramInt1) || (paramBitmap.getHeight() != paramInt1))
      paramBitmap = Bitmap.createScaledBitmap(paramBitmap, paramInt1, paramInt1, false);
    Paint localPaint = new Paint();
    Rect localRect = new Rect(0, 0, paramInt1, paramInt1);
    localPaint.setAntiAlias(true);
    localPaint.setFilterBitmap(true);
    localPaint.setDither(true);
    localCanvas.drawARGB(0, 0, 0, 0);
    localPaint.setColor(Color.parseColor("#ffffff"));
    localCanvas.drawCircle(paramInt1 / 2.0F, paramInt1 / 2.0F, paramInt1 / 2.0F, localPaint);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    localCanvas.drawBitmap(paramBitmap, localRect, localRect, localPaint);
    if (paramInt2 > 0)
    {
      localPaint.setStyle(Paint.Style.STROKE);
      localPaint.setStrokeWidth(z.a(TextNowApp.a().getApplicationContext(), paramInt2));
      localCanvas.drawCircle(paramInt1 / 2.0F, paramInt1 / 2.0F, paramInt1 / 2.0F, localPaint);
    }
    return localBitmap;
  }

  private static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBitmap == null)
      return null;
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f = Math.min(paramInt1 / i, paramInt2 / j);
    return Bitmap.createScaledBitmap(paramBitmap, Math.max(1, (int)(f * i)), Math.max(1, (int)(f * j)), false);
  }

  // ERROR //
  public static Bitmap a(String paramString, int paramInt)
  {
    // Byte code:
    //   0: new 45	android/graphics/BitmapFactory$Options
    //   3: dup
    //   4: invokespecial 48	android/graphics/BitmapFactory$Options:<init>	()V
    //   7: astore_2
    //   8: aload_2
    //   9: iconst_1
    //   10: putfield 52	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   13: aload_0
    //   14: aload_2
    //   15: invokestatic 216	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   18: pop
    //   19: aload_2
    //   20: iload_1
    //   21: invokestatic 67	textnow/v/f:a	(Landroid/graphics/BitmapFactory$Options;I)Landroid/util/Pair;
    //   24: astore 4
    //   26: aload 4
    //   28: ifnonnull +5 -> 33
    //   31: aconst_null
    //   32: areturn
    //   33: aload_0
    //   34: aload_2
    //   35: invokestatic 216	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   38: astore 7
    //   40: aload 7
    //   42: ifnull +77 -> 119
    //   45: aload 7
    //   47: aload 4
    //   49: getfield 73	android/util/Pair:first	Ljava/lang/Object;
    //   52: checkcast 75	java/lang/Integer
    //   55: invokevirtual 79	java/lang/Integer:intValue	()I
    //   58: aload 4
    //   60: getfield 82	android/util/Pair:second	Ljava/lang/Object;
    //   63: checkcast 75	java/lang/Integer
    //   66: invokevirtual 79	java/lang/Integer:intValue	()I
    //   69: iconst_0
    //   70: invokestatic 85	textnow/v/f:a	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   73: astore 11
    //   75: aload 11
    //   77: areturn
    //   78: astore 5
    //   80: new 218	java/lang/StringBuilder
    //   83: dup
    //   84: invokespecial 219	java/lang/StringBuilder:<init>	()V
    //   87: ldc 221
    //   89: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: aload 5
    //   94: invokestatic 91	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   97: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 229	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: pop
    //   104: aconst_null
    //   105: areturn
    //   106: astore 10
    //   108: aload 7
    //   110: areturn
    //   111: astore 8
    //   113: aload 8
    //   115: invokestatic 91	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   118: pop
    //   119: aload 7
    //   121: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   33	40	78	java/lang/OutOfMemoryError
    //   45	75	106	java/lang/OutOfMemoryError
    //   45	75	111	java/lang/Exception
  }

  public static Bitmap a(String paramString, Bitmap paramBitmap)
  {
    int i = a(paramString);
    Matrix localMatrix = new Matrix();
    switch (i)
    {
    case 4:
    case 5:
    case 7:
    default:
    case 6:
    case 3:
    case 8:
    }
    while (true)
    {
      return paramBitmap;
      localMatrix.postRotate(90.0F);
      try
      {
        while (true)
        {
          Bitmap localBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
          if (localBitmap == paramBitmap)
            break;
          paramBitmap.recycle();
          return localBitmap;
          localMatrix.postRotate(180.0F);
          continue;
          localMatrix.postRotate(270.0F);
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
      }
    }
    return paramBitmap;
  }

  // ERROR //
  public static Bitmap a(byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: new 45	android/graphics/BitmapFactory$Options
    //   3: dup
    //   4: invokespecial 48	android/graphics/BitmapFactory$Options:<init>	()V
    //   7: astore_2
    //   8: aload_2
    //   9: iconst_1
    //   10: putfield 52	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   13: aload_0
    //   14: checkcast 251	[B
    //   17: iconst_0
    //   18: aload_0
    //   19: checkcast 251	[B
    //   22: arraylength
    //   23: aload_2
    //   24: invokestatic 255	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   27: pop
    //   28: aload_2
    //   29: sipush 1024
    //   32: invokestatic 67	textnow/v/f:a	(Landroid/graphics/BitmapFactory$Options;I)Landroid/util/Pair;
    //   35: astore 4
    //   37: aload 4
    //   39: ifnonnull +5 -> 44
    //   42: aconst_null
    //   43: areturn
    //   44: aload_0
    //   45: checkcast 251	[B
    //   48: iconst_0
    //   49: aload_0
    //   50: checkcast 251	[B
    //   53: arraylength
    //   54: aload_2
    //   55: invokestatic 255	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   58: astore 6
    //   60: aload 6
    //   62: ifnull +53 -> 115
    //   65: aload 6
    //   67: aload 4
    //   69: getfield 73	android/util/Pair:first	Ljava/lang/Object;
    //   72: checkcast 75	java/lang/Integer
    //   75: invokevirtual 79	java/lang/Integer:intValue	()I
    //   78: aload 4
    //   80: getfield 82	android/util/Pair:second	Ljava/lang/Object;
    //   83: checkcast 75	java/lang/Integer
    //   86: invokevirtual 79	java/lang/Integer:intValue	()I
    //   89: iconst_0
    //   90: invokestatic 85	textnow/v/f:a	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   93: astore 10
    //   95: aload 10
    //   97: areturn
    //   98: astore 5
    //   100: aconst_null
    //   101: areturn
    //   102: astore 9
    //   104: aload 6
    //   106: areturn
    //   107: astore 7
    //   109: aload 7
    //   111: invokestatic 91	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   114: pop
    //   115: aload 6
    //   117: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   44	60	98	java/lang/OutOfMemoryError
    //   65	95	102	java/lang/OutOfMemoryError
    //   65	95	107	java/lang/Exception
  }

  private static Pair<Integer, Integer> a(BitmapFactory.Options paramOptions, int paramInt)
  {
    int i = paramOptions.outWidth;
    int j = paramOptions.outHeight;
    if ((i == 0) || (j == 0))
      return null;
    if (i > paramInt)
    {
      j = Math.max(1, (int)(paramInt / i * j));
      i = paramInt;
    }
    if (j > paramInt);
    for (int k = Math.max(1, (int)(paramInt / j * i)); ; k = i)
    {
      paramOptions.inJustDecodeBounds = false;
      paramOptions.inSampleSize = Math.max(paramOptions.outWidth / k, paramOptions.outHeight / paramInt);
      paramOptions.inTempStorage = new byte[16384];
      paramOptions.inPurgeable = true;
      paramOptions.inInputShareable = true;
      return new Pair(Integer.valueOf(k), Integer.valueOf(paramInt));
      paramInt = j;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.v.f
 * JD-Core Version:    0.6.2
 */