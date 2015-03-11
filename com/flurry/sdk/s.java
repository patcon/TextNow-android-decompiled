package com.flurry.sdk;

import android.util.Pair;
import android.widget.Toast;
import com.flurry.android.impl.ads.avro.protocol.v10.SdkLogRequest;
import com.flurry.android.impl.ads.avro.protocol.v10.SdkLogResponse;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public class s extends de
{
  private final w a = new w();

  public s()
  {
    this(null);
  }

  public s(de.a parama)
  {
    super("Ads", s.class.getSimpleName());
    this.g = "AnalyticsData_";
    a(parama);
  }

  protected Pair<String, byte[]> a(byte[] paramArrayOfByte)
  {
    int i = 0;
    byte[] arrayOfByte1 = new byte[4];
    byte[] arrayOfByte2 = new byte[-4 + paramArrayOfByte.length];
    int j = 0;
    if (j < paramArrayOfByte.length)
    {
      if (j < 4)
        arrayOfByte1[j] = paramArrayOfByte[j];
      while (true)
      {
        j++;
        break;
        arrayOfByte2[(j - 4)] = paramArrayOfByte[j];
      }
    }
    int k = ByteBuffer.wrap(arrayOfByte1).getInt();
    byte[] arrayOfByte3 = new byte[k];
    byte[] arrayOfByte4 = new byte[arrayOfByte2.length - k];
    if (i < arrayOfByte2.length)
    {
      if (i < k)
        arrayOfByte3[i] = arrayOfByte2[i];
      while (true)
      {
        i++;
        break;
        arrayOfByte4[(i - k)] = arrayOfByte2[i];
      }
    }
    return new Pair(new String(arrayOfByte3), arrayOfByte4);
  }

  public SdkLogResponse a(SdkLogRequest paramSdkLogRequest, String paramString1, String paramString2, String paramString3)
  {
    byte[] arrayOfByte = v.a(paramSdkLogRequest, SdkLogRequest.class);
    if (arrayOfByte != null)
      b(a(arrayOfByte, paramString1), paramString2, paramString3);
    SdkLogResponse localSdkLogResponse = new SdkLogResponse();
    localSdkLogResponse.a("success");
    return localSdkLogResponse;
  }

  protected void a(byte[] paramArrayOfByte, final String paramString1, final String paramString2)
  {
    try
    {
      Pair localPair = a(paramArrayOfByte);
      String str = (String)localPair.first;
      byte[] arrayOfByte = (byte[])localPair.second;
      eo.a(4, this.d, "FlurryAdLogsManager: start upload data " + arrayOfByte + " with id = " + paramString1 + " to " + str);
      this.a.a(this, str, arrayOfByte, SdkLogResponse.class, new w.a()
      {
        public void a(int paramAnonymousInt, SdkLogResponse paramAnonymousSdkLogResponse)
        {
          if ((paramAnonymousSdkLogResponse != null) && (paramAnonymousSdkLogResponse.b().toString().equals("success")))
          {
            eo.a(5, s.a(s.this), "FlurryAdLogsManager: ad report " + paramString1 + " sent. HTTP response: " + paramAnonymousInt);
            if ((eo.c() <= 3) && (eo.d()))
              do.a().a(new Runnable()
              {
                public void run()
                {
                  Toast.makeText(do.a().b(), "Ad log report sent", 0).show();
                }
              });
            s.a(s.this, paramString1, paramString2, paramAnonymousInt);
            s.b(s.this);
            return;
          }
          if (paramAnonymousSdkLogResponse != null)
          {
            Iterator localIterator = paramAnonymousSdkLogResponse.c().iterator();
            while (localIterator.hasNext())
            {
              CharSequence localCharSequence = (CharSequence)localIterator.next();
              eo.a(6, s.c(s.this), localCharSequence.toString());
            }
          }
          s.a(s.this, paramString1, paramString2);
        }
      });
      return;
    }
    catch (Exception localException)
    {
      eo.a(6, this.d, "Internal ERROR! Report is corrupt!");
      c(paramString1, paramString2);
    }
  }

  protected byte[] a(byte[] paramArrayOfByte, String paramString)
  {
    byte[] arrayOfByte1 = paramString.getBytes();
    int i = arrayOfByte1.length;
    byte[] arrayOfByte2 = ByteBuffer.allocate(4).putInt(i).array();
    byte[] arrayOfByte3 = new byte[arrayOfByte2.length + arrayOfByte1.length + paramArrayOfByte.length];
    int j = 0;
    if (j < arrayOfByte3.length)
    {
      if (j < arrayOfByte2.length)
        arrayOfByte3[j] = arrayOfByte2[j];
      while (true)
      {
        j++;
        break;
        if ((j >= arrayOfByte2.length) && (j < arrayOfByte1.length + arrayOfByte2.length))
          arrayOfByte3[j] = arrayOfByte1[(j - 4)];
        else
          arrayOfByte3[j] = paramArrayOfByte[(j - 4 - arrayOfByte1.length)];
      }
    }
    return arrayOfByte3;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.s
 * JD-Core Version:    0.6.2
 */