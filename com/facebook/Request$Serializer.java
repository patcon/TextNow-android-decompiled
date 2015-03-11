package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.ParcelFileDescriptor;
import com.facebook.internal.Logger;
import java.io.BufferedOutputStream;

class Request$Serializer
  implements Request.KeyValueSerializer
{
  private boolean firstWrite = true;
  private final Logger logger;
  private final BufferedOutputStream outputStream;

  public Request$Serializer(BufferedOutputStream paramBufferedOutputStream, Logger paramLogger)
  {
    this.outputStream = paramBufferedOutputStream;
    this.logger = paramLogger;
  }

  public void write(String paramString, Object[] paramArrayOfObject)
  {
    if (this.firstWrite)
    {
      this.outputStream.write("--".getBytes());
      this.outputStream.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
      this.outputStream.write("\r\n".getBytes());
      this.firstWrite = false;
    }
    this.outputStream.write(String.format(paramString, paramArrayOfObject).getBytes());
  }

  public void writeBitmap(String paramString, Bitmap paramBitmap)
  {
    writeContentDisposition(paramString, paramString, "image/png");
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, this.outputStream);
    writeLine("", new Object[0]);
    writeRecordBoundary();
    this.logger.appendKeyValue("    " + paramString, "<Image>");
  }

  public void writeBytes(String paramString, byte[] paramArrayOfByte)
  {
    writeContentDisposition(paramString, paramString, "content/unknown");
    this.outputStream.write(paramArrayOfByte);
    writeLine("", new Object[0]);
    writeRecordBoundary();
    Logger localLogger = this.logger;
    String str = "    " + paramString;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramArrayOfByte.length);
    localLogger.appendKeyValue(str, String.format("<Data: %d>", arrayOfObject));
  }

  public void writeContentDisposition(String paramString1, String paramString2, String paramString3)
  {
    write("Content-Disposition: form-data; name=\"%s\"", new Object[] { paramString1 });
    if (paramString2 != null)
      write("; filename=\"%s\"", new Object[] { paramString2 });
    writeLine("", new Object[0]);
    if (paramString3 != null)
      writeLine("%s: %s", new Object[] { "Content-Type", paramString3 });
    writeLine("", new Object[0]);
  }

  // ERROR //
  public void writeFile(String paramString1, ParcelFileDescriptor paramParcelFileDescriptor, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_3
    //   4: ifnonnull +6 -> 10
    //   7: ldc 99
    //   9: astore_3
    //   10: aload_0
    //   11: aload_1
    //   12: aload_1
    //   13: aload_3
    //   14: invokevirtual 54	com/facebook/Request$Serializer:writeContentDisposition	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   17: new 121	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   20: dup
    //   21: aload_2
    //   22: invokespecial 124	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   25: astore 5
    //   27: new 126	java/io/BufferedInputStream
    //   30: dup
    //   31: aload 5
    //   33: invokespecial 129	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   36: astore 6
    //   38: sipush 8192
    //   41: newarray byte
    //   43: astore 8
    //   45: iconst_0
    //   46: istore 9
    //   48: aload 6
    //   50: aload 8
    //   52: invokevirtual 133	java/io/BufferedInputStream:read	([B)I
    //   55: istore 10
    //   57: iload 10
    //   59: iconst_m1
    //   60: if_icmpeq +25 -> 85
    //   63: aload_0
    //   64: getfield 21	com/facebook/Request$Serializer:outputStream	Ljava/io/BufferedOutputStream;
    //   67: aload 8
    //   69: iconst_0
    //   70: iload 10
    //   72: invokevirtual 136	java/io/BufferedOutputStream:write	([BII)V
    //   75: iload 9
    //   77: iload 10
    //   79: iadd
    //   80: istore 9
    //   82: goto -34 -> 48
    //   85: aload 6
    //   87: invokevirtual 139	java/io/BufferedInputStream:close	()V
    //   90: aload 5
    //   92: invokevirtual 140	android/os/ParcelFileDescriptor$AutoCloseInputStream:close	()V
    //   95: aload_0
    //   96: ldc 68
    //   98: iconst_0
    //   99: anewarray 4	java/lang/Object
    //   102: invokevirtual 71	com/facebook/Request$Serializer:writeLine	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: aload_0
    //   106: invokevirtual 74	com/facebook/Request$Serializer:writeRecordBoundary	()V
    //   109: aload_0
    //   110: getfield 23	com/facebook/Request$Serializer:logger	Lcom/facebook/internal/Logger;
    //   113: astore 11
    //   115: new 76	java/lang/StringBuilder
    //   118: dup
    //   119: invokespecial 77	java/lang/StringBuilder:<init>	()V
    //   122: ldc 79
    //   124: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: aload_1
    //   128: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: astore 12
    //   136: iconst_1
    //   137: anewarray 4	java/lang/Object
    //   140: astore 13
    //   142: aload 13
    //   144: iconst_0
    //   145: iload 9
    //   147: invokestatic 105	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   150: aastore
    //   151: aload 11
    //   153: aload 12
    //   155: ldc 107
    //   157: aload 13
    //   159: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   162: invokevirtual 95	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   165: return
    //   166: astore 7
    //   168: aconst_null
    //   169: astore 6
    //   171: aload 6
    //   173: ifnull +8 -> 181
    //   176: aload 6
    //   178: invokevirtual 139	java/io/BufferedInputStream:close	()V
    //   181: aload 4
    //   183: ifnull +8 -> 191
    //   186: aload 4
    //   188: invokevirtual 140	android/os/ParcelFileDescriptor$AutoCloseInputStream:close	()V
    //   191: aload 7
    //   193: athrow
    //   194: astore 7
    //   196: aload 5
    //   198: astore 4
    //   200: aconst_null
    //   201: astore 6
    //   203: goto -32 -> 171
    //   206: astore 7
    //   208: aload 5
    //   210: astore 4
    //   212: goto -41 -> 171
    //
    // Exception table:
    //   from	to	target	type
    //   17	27	166	finally
    //   27	38	194	finally
    //   38	45	206	finally
    //   48	57	206	finally
    //   63	75	206	finally
  }

  public void writeFile(String paramString, Request.ParcelFileDescriptorWithMimeType paramParcelFileDescriptorWithMimeType)
  {
    writeFile(paramString, paramParcelFileDescriptorWithMimeType.getFileDescriptor(), paramParcelFileDescriptorWithMimeType.getMimeType());
  }

  public void writeLine(String paramString, Object[] paramArrayOfObject)
  {
    write(paramString, paramArrayOfObject);
    write("\r\n", new Object[0]);
  }

  public void writeObject(String paramString, Object paramObject)
  {
    if (Request.access$100(paramObject))
    {
      writeString(paramString, Request.access$200(paramObject));
      return;
    }
    if ((paramObject instanceof Bitmap))
    {
      writeBitmap(paramString, (Bitmap)paramObject);
      return;
    }
    if ((paramObject instanceof byte[]))
    {
      writeBytes(paramString, (byte[])paramObject);
      return;
    }
    if ((paramObject instanceof ParcelFileDescriptor))
    {
      writeFile(paramString, (ParcelFileDescriptor)paramObject, null);
      return;
    }
    if ((paramObject instanceof Request.ParcelFileDescriptorWithMimeType))
    {
      writeFile(paramString, (Request.ParcelFileDescriptorWithMimeType)paramObject);
      return;
    }
    throw new IllegalArgumentException("value is not a supported type: String, Bitmap, byte[]");
  }

  public void writeRecordBoundary()
  {
    writeLine("--%s", new Object[] { "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" });
  }

  public void writeString(String paramString1, String paramString2)
  {
    writeContentDisposition(paramString1, null, null);
    writeLine("%s", new Object[] { paramString2 });
    writeRecordBoundary();
    if (this.logger != null)
      this.logger.appendKeyValue("    " + paramString1, paramString2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.Request.Serializer
 * JD-Core Version:    0.6.2
 */