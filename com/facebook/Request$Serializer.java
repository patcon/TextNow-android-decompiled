package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.ParcelFileDescriptor;
import com.facebook.internal.Logger;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

class Request$Serializer
  implements Request.KeyValueSerializer
{
  private boolean firstWrite = true;
  private final Logger logger;
  private final OutputStream outputStream;

  public Request$Serializer(OutputStream paramOutputStream, Logger paramLogger)
  {
    this.outputStream = paramOutputStream;
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
    if (this.logger != null)
      this.logger.appendKeyValue("    " + paramString, "<Image>");
  }

  public void writeBytes(String paramString, byte[] paramArrayOfByte)
  {
    writeContentDisposition(paramString, paramString, "content/unknown");
    this.outputStream.write(paramArrayOfByte);
    writeLine("", new Object[0]);
    writeRecordBoundary();
    if (this.logger != null)
    {
      Logger localLogger = this.logger;
      String str = "    " + paramString;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramArrayOfByte.length);
      localLogger.appendKeyValue(str, String.format("<Data: %d>", arrayOfObject));
    }
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
    //   17: aload_0
    //   18: getfield 21	com/facebook/Request$Serializer:outputStream	Ljava/io/OutputStream;
    //   21: instanceof 121
    //   24: ifeq +98 -> 122
    //   27: aload_0
    //   28: getfield 21	com/facebook/Request$Serializer:outputStream	Ljava/io/OutputStream;
    //   31: checkcast 121	com/facebook/ProgressNoopOutputStream
    //   34: aload_2
    //   35: invokevirtual 127	android/os/ParcelFileDescriptor:getStatSize	()J
    //   38: invokevirtual 131	com/facebook/ProgressNoopOutputStream:addProgress	(J)V
    //   41: iconst_0
    //   42: istore 10
    //   44: aload_0
    //   45: ldc 68
    //   47: iconst_0
    //   48: anewarray 4	java/lang/Object
    //   51: invokevirtual 71	com/facebook/Request$Serializer:writeLine	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   54: aload_0
    //   55: invokevirtual 74	com/facebook/Request$Serializer:writeRecordBoundary	()V
    //   58: aload_0
    //   59: getfield 23	com/facebook/Request$Serializer:logger	Lcom/facebook/internal/Logger;
    //   62: ifnull +59 -> 121
    //   65: aload_0
    //   66: getfield 23	com/facebook/Request$Serializer:logger	Lcom/facebook/internal/Logger;
    //   69: astore 12
    //   71: new 76	java/lang/StringBuilder
    //   74: dup
    //   75: invokespecial 77	java/lang/StringBuilder:<init>	()V
    //   78: ldc 79
    //   80: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: aload_1
    //   84: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: astore 13
    //   92: iconst_1
    //   93: anewarray 4	java/lang/Object
    //   96: astore 14
    //   98: aload 14
    //   100: iconst_0
    //   101: iload 10
    //   103: invokestatic 105	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   106: aastore
    //   107: aload 12
    //   109: aload 13
    //   111: ldc 107
    //   113: aload 14
    //   115: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   118: invokevirtual 95	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   121: return
    //   122: new 133	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   125: dup
    //   126: aload_2
    //   127: invokespecial 136	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   130: astore 5
    //   132: new 138	java/io/BufferedInputStream
    //   135: dup
    //   136: aload 5
    //   138: invokespecial 141	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   141: astore 6
    //   143: sipush 8192
    //   146: newarray byte
    //   148: astore 9
    //   150: iconst_0
    //   151: istore 10
    //   153: aload 6
    //   155: aload 9
    //   157: invokevirtual 145	java/io/BufferedInputStream:read	([B)I
    //   160: istore 11
    //   162: iload 11
    //   164: iconst_m1
    //   165: if_icmpeq +25 -> 190
    //   168: aload_0
    //   169: getfield 21	com/facebook/Request$Serializer:outputStream	Ljava/io/OutputStream;
    //   172: aload 9
    //   174: iconst_0
    //   175: iload 11
    //   177: invokevirtual 148	java/io/OutputStream:write	([BII)V
    //   180: iload 10
    //   182: iload 11
    //   184: iadd
    //   185: istore 10
    //   187: goto -34 -> 153
    //   190: aload 6
    //   192: invokevirtual 151	java/io/BufferedInputStream:close	()V
    //   195: aload 5
    //   197: invokevirtual 152	android/os/ParcelFileDescriptor$AutoCloseInputStream:close	()V
    //   200: goto -156 -> 44
    //   203: astore 7
    //   205: aconst_null
    //   206: astore 8
    //   208: aload 8
    //   210: ifnull +8 -> 218
    //   213: aload 8
    //   215: invokevirtual 151	java/io/BufferedInputStream:close	()V
    //   218: aload 4
    //   220: ifnull +8 -> 228
    //   223: aload 4
    //   225: invokevirtual 152	android/os/ParcelFileDescriptor$AutoCloseInputStream:close	()V
    //   228: aload 7
    //   230: athrow
    //   231: astore 7
    //   233: aload 5
    //   235: astore 4
    //   237: aconst_null
    //   238: astore 8
    //   240: goto -32 -> 208
    //   243: astore 7
    //   245: aload 6
    //   247: astore 8
    //   249: aload 5
    //   251: astore 4
    //   253: goto -45 -> 208
    //
    // Exception table:
    //   from	to	target	type
    //   122	132	203	finally
    //   132	143	231	finally
    //   143	150	243	finally
    //   153	162	243	finally
    //   168	180	243	finally
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

  public void writeObject(String paramString, Object paramObject, Request paramRequest)
  {
    if ((this.outputStream instanceof RequestOutputStream))
      ((RequestOutputStream)this.outputStream).setCurrentRequest(paramRequest);
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

  public void writeRequestsAsJson(String paramString, JSONArray paramJSONArray, Collection<Request> paramCollection)
  {
    if (!(this.outputStream instanceof RequestOutputStream))
      writeString(paramString, paramJSONArray.toString());
    do
    {
      return;
      RequestOutputStream localRequestOutputStream = (RequestOutputStream)this.outputStream;
      writeContentDisposition(paramString, null, null);
      write("[", new Object[0]);
      Iterator localIterator = paramCollection.iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        Request localRequest = (Request)localIterator.next();
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        localRequestOutputStream.setCurrentRequest(localRequest);
        if (i > 0)
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = localJSONObject.toString();
          write(",%s", arrayOfObject2);
        }
        while (true)
        {
          i++;
          break;
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = localJSONObject.toString();
          write("%s", arrayOfObject1);
        }
      }
      write("]", new Object[0]);
    }
    while (this.logger == null);
    this.logger.appendKeyValue("    " + paramString, paramJSONArray.toString());
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.Request.Serializer
 * JD-Core Version:    0.6.2
 */