package com.flurry.sdk;

import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ag
{
  private static final String a = ag.class.getSimpleName();
  private final FlurryAdModule b;

  public ag(FlurryAdModule paramFlurryAdModule)
  {
    this.b = paramFlurryAdModule;
  }

  private boolean a(String paramString1, String paramString2)
  {
    return paramString2.equals("%{" + paramString1 + "}");
  }

  public String a(e parame, AdUnit paramAdUnit, a parama, String paramString1, String paramString2)
  {
    String str1;
    if (a("fids", paramString2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator1 = dn.a().l().entrySet().iterator();
      int i = 1;
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry1 = (Map.Entry)localIterator1.next();
        if (i == 0)
          localStringBuilder.append(",");
        localStringBuilder.append(((dr)localEntry1.getKey()).d).append(":");
        if (((dr)localEntry1.getKey()).e)
        {
          localStringBuilder.append(new String(((ByteBuffer)localEntry1.getValue()).array()));
          i = 0;
        }
        else
        {
          localStringBuilder.append(fe.a(((ByteBuffer)localEntry1.getValue()).array()));
          i = 0;
        }
      }
      eo.a(3, a, "Replacing param fids with: " + localStringBuilder.toString());
      str1 = paramString1.replace(paramString2, fe.b(localStringBuilder.toString()));
    }
    String str2;
    do
    {
      return str1;
      if (a("sid", paramString2))
      {
        String str9 = String.valueOf(this.b.h());
        eo.a(3, a, "Replacing param sid with: " + str9);
        return paramString1.replace(paramString2, fe.b(str9));
      }
      if (a("lid", paramString2))
      {
        String str8 = String.valueOf(parame.a());
        eo.a(3, a, "Replacing param lid with: " + str8);
        return paramString1.replace(paramString2, fe.b(str8));
      }
      if (a("guid", paramString2))
      {
        String str7 = parame.b();
        eo.a(3, a, "Replacing param guid with: " + str7);
        return paramString1.replace(paramString2, fe.b(str7));
      }
      if (a("ats", paramString2))
      {
        String str6 = String.valueOf(System.currentTimeMillis());
        eo.a(3, a, "Replacing param ats with: " + str6);
        return paramString1.replace(paramString2, fe.b(str6));
      }
      if (a("apik", paramString2))
      {
        String str5 = this.b.j();
        eo.a(3, a, "Replacing param apik with: " + str5);
        return paramString1.replace(paramString2, fe.b(str5));
      }
      if (a("hid", paramString2))
      {
        String str4 = paramAdUnit.b().toString();
        eo.a(3, a, "Replacing param hid with: " + str4);
        return paramString1.replace(paramString2, fe.b(str4));
      }
      if (a("eso", paramString2))
      {
        String str3 = Long.toString(System.currentTimeMillis() - this.b.h());
        eo.a(3, a, "Replacing param eso with: " + str3);
        return paramString1.replace(paramString2, fe.b(str3));
      }
      if (!a("uc", paramString2))
        break;
      Iterator localIterator2 = this.b.B().entrySet().iterator();
      Map.Entry localEntry2;
      for (str2 = ""; localIterator2.hasNext(); str2 = str2 + "c_" + fe.b((String)localEntry2.getKey()) + "=" + fe.b((String)localEntry2.getValue()) + "&")
        localEntry2 = (Map.Entry)localIterator2.next();
      eo.a(3, a, "Replacing param uc with: " + str2);
      str1 = paramString1.replace(paramString2, str2);
    }
    while ((!str2.equals("")) || (str1.length() <= 0));
    return str1.substring(0, -1 + str1.length());
    eo.a(3, a, "Unknown param: " + paramString2);
    return paramString1.replace(paramString2, "");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ag
 * JD-Core Version:    0.6.2
 */