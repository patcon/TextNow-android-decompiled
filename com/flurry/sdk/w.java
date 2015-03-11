package com.flurry.sdk;

import java.util.List;

public class w
{
  private static final String a = w.class.getSimpleName();

  int a(byte[] paramArrayOfByte)
  {
    ed localed = new ed();
    localed.update(paramArrayOfByte);
    return localed.b();
  }

  public <A extends gw, B extends gw> void a(Object paramObject, String paramString, A paramA, Class<A> paramClass, Class<B> paramClass1, w.a<B> parama)
  {
    a(paramObject, paramString, v.a(paramA, paramClass), paramClass1, parama);
  }

  public <B extends gw> void a(Object paramObject, final String paramString, byte[] paramArrayOfByte, final Class<B> paramClass, final w.a<B> parama)
  {
    el localel = new el();
    localel.a(paramString);
    localel.a(en.a.c);
    localel.a("Content-Type", "avro/binary");
    localel.a("Accept", "avro/binary");
    localel.a("FM-Checksum", Integer.toString(a(paramArrayOfByte)));
    localel.a(new ew());
    localel.b(new ew());
    localel.a(paramArrayOfByte);
    localel.a(new el.a()
    {
      public void a(el<byte[], byte[]> paramAnonymousel, byte[] paramAnonymousArrayOfByte)
      {
        int i = paramAnonymousel.e();
        if ((paramAnonymousel.c()) && (paramAnonymousArrayOfByte != null) && (paramAnonymousArrayOfByte.length > 0))
        {
          List localList = paramAnonymousel.b("FM-Checksum");
          if ((localList != null) && (localList.size() > 0) && (Integer.toString(w.this.a(paramAnonymousArrayOfByte)).equals(localList.get(0))))
          {
            eo.a(4, w.a(), "Request successful, decoding");
            try
            {
              gw localgw2 = v.a(paramAnonymousArrayOfByte, paramClass);
              localgw1 = localgw2;
              parama.a(i, localgw1);
              return;
            }
            catch (Throwable localThrowable)
            {
              while (true)
              {
                eo.a(6, w.a(), "Error decoding response", localThrowable);
                gw localgw1 = null;
              }
            }
          }
          eo.a(6, w.a(), "Response was received, but checksum failed.");
        }
        while (true)
        {
          parama.a(i, null);
          return;
          eo.a(6, w.a(), "Request to url = " + paramString + " failed.");
        }
      }
    });
    em.a().a(paramObject, localel);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.w
 * JD-Core Version:    0.6.2
 */