package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.gx;
import java.util.List;
import java.util.Map;

public class AdRequest$Builder extends gx<AdRequest>
{
  private boolean A;
  private Map<CharSequence, CharSequence> B;
  private CharSequence a;
  private CharSequence b;
  private CharSequence c;
  private long d;
  private List<AdReportedId> e;
  private Location f;
  private boolean g;
  private List<Integer> h;
  private AdViewContainer i;
  private CharSequence j;
  private CharSequence k;
  private CharSequence l;
  private CharSequence m;
  private TestAds n;
  private Map<CharSequence, CharSequence> o;
  private boolean p;
  private boolean q;
  private int r;
  private List<FrequencyCapInfo> s;
  private boolean t;
  private CharSequence u;
  private List<CharSequence> v;
  private CharSequence w;
  private TargetingOverride x;
  private boolean y;
  private List<CharSequence> z;

  private AdRequest$Builder()
  {
    super(AdRequest.SCHEMA$);
  }

  public Builder a(int paramInt)
  {
    a(b()[17], Integer.valueOf(paramInt));
    this.r = paramInt;
    c()[17] = 1;
    return this;
  }

  public Builder a(long paramLong)
  {
    a(b()[3], Long.valueOf(paramLong));
    this.d = paramLong;
    c()[3] = 1;
    return this;
  }

  public Builder a(AdViewContainer paramAdViewContainer)
  {
    a(b()[8], paramAdViewContainer);
    this.i = paramAdViewContainer;
    c()[8] = 1;
    return this;
  }

  public Builder a(Location paramLocation)
  {
    a(b()[5], paramLocation);
    this.f = paramLocation;
    c()[5] = 1;
    return this;
  }

  public Builder a(CharSequence paramCharSequence)
  {
    a(b()[0], paramCharSequence);
    this.a = paramCharSequence;
    c()[0] = 1;
    return this;
  }

  public Builder a(List<AdReportedId> paramList)
  {
    a(b()[4], paramList);
    this.e = paramList;
    c()[4] = 1;
    return this;
  }

  public Builder a(boolean paramBoolean)
  {
    a(b()[6], Boolean.valueOf(paramBoolean));
    this.g = paramBoolean;
    c()[6] = 1;
    return this;
  }

  public AdRequest a()
  {
    label42: label63: label84: label105: label236: label368: label1009: 
    try
    {
      AdRequest localAdRequest = new AdRequest();
      CharSequence localCharSequence1;
      CharSequence localCharSequence2;
      CharSequence localCharSequence3;
      long l1;
      List localList1;
      Location localLocation;
      label126: boolean bool1;
      List localList2;
      AdViewContainer localAdViewContainer;
      CharSequence localCharSequence4;
      CharSequence localCharSequence5;
      CharSequence localCharSequence6;
      CharSequence localCharSequence7;
      TestAds localTestAds;
      Map localMap1;
      boolean bool2;
      boolean bool3;
      int i1;
      List localList3;
      boolean bool4;
      CharSequence localCharSequence8;
      List localList4;
      CharSequence localCharSequence9;
      label500: TargetingOverride localTargetingOverride;
      boolean bool5;
      List localList5;
      boolean bool6;
      if (c()[0] != 0)
      {
        localCharSequence1 = this.a;
        localAdRequest.a = localCharSequence1;
        if (c()[1] == 0)
          break label635;
        localCharSequence2 = this.b;
        localAdRequest.b = localCharSequence2;
        if (c()[2] == 0)
          break label653;
        localCharSequence3 = this.c;
        localAdRequest.c = localCharSequence3;
        if (c()[3] == 0)
          break label671;
        l1 = this.d;
        localAdRequest.d = l1;
        if (c()[4] == 0)
          break label692;
        localList1 = this.e;
        localAdRequest.e = localList1;
        if (c()[5] == 0)
          break label710;
        localLocation = this.f;
        localAdRequest.f = localLocation;
        if (c()[6] == 0)
          break label728;
        bool1 = this.g;
        localAdRequest.g = bool1;
        if (c()[7] == 0)
          break label750;
        localList2 = this.h;
        localAdRequest.h = localList2;
        if (c()[8] == 0)
          break label769;
        localAdViewContainer = this.i;
        localAdRequest.i = localAdViewContainer;
        if (c()[9] == 0)
          break label788;
        localCharSequence4 = this.j;
        localAdRequest.j = localCharSequence4;
        if (c()[10] == 0)
          break label807;
        localCharSequence5 = this.k;
        localAdRequest.k = localCharSequence5;
        if (c()[11] == 0)
          break label826;
        localCharSequence6 = this.l;
        localAdRequest.l = localCharSequence6;
        if (c()[12] == 0)
          break label845;
        localCharSequence7 = this.m;
        localAdRequest.m = localCharSequence7;
        if (c()[13] == 0)
          break label864;
        localTestAds = this.n;
        localAdRequest.n = localTestAds;
        if (c()[14] == 0)
          break label883;
        localMap1 = this.o;
        localAdRequest.o = localMap1;
        if (c()[15] == 0)
          break label902;
        bool2 = this.p;
        localAdRequest.p = bool2;
        if (c()[16] == 0)
          break label924;
        bool3 = this.q;
        localAdRequest.q = bool3;
        if (c()[17] == 0)
          break label946;
        i1 = this.r;
        localAdRequest.r = i1;
        if (c()[18] == 0)
          break label968;
        localList3 = this.s;
        localAdRequest.s = localList3;
        if (c()[19] == 0)
          break label987;
        bool4 = this.t;
        localAdRequest.t = bool4;
        if (c()[20] == 0)
          break label1009;
        localCharSequence8 = this.u;
        localAdRequest.u = localCharSequence8;
        if (c()[21] == 0)
          break label1028;
        localList4 = this.v;
        localAdRequest.v = localList4;
        if (c()[22] == 0)
          break label1047;
        localCharSequence9 = this.w;
        localAdRequest.w = localCharSequence9;
        if (c()[23] == 0)
          break label1066;
        localTargetingOverride = this.x;
        localAdRequest.x = localTargetingOverride;
        if (c()[24] == 0)
          break label1085;
        bool5 = this.y;
        localAdRequest.y = bool5;
        if (c()[25] == 0)
          break label1107;
        localList5 = this.z;
        localAdRequest.z = localList5;
        if (c()[26] == 0)
          break label1126;
        bool6 = this.A;
        localAdRequest.A = bool6;
        if (c()[27] == 0)
          break label1148;
      }
      label635: label1148: for (Map localMap2 = this.B; ; localMap2 = (Map)a(b()[27]))
      {
        localAdRequest.B = localMap2;
        return localAdRequest;
        localCharSequence1 = (CharSequence)a(b()[0]);
        break;
        localCharSequence2 = (CharSequence)a(b()[1]);
        break label42;
        localCharSequence3 = (CharSequence)a(b()[2]);
        break label63;
        l1 = ((Long)a(b()[3])).longValue();
        break label84;
        localList1 = (List)a(b()[4]);
        break label105;
        localLocation = (Location)a(b()[5]);
        break label126;
        bool1 = ((Boolean)a(b()[6])).booleanValue();
        break label148;
        localList2 = (List)a(b()[7]);
        break label170;
        localAdViewContainer = (AdViewContainer)a(b()[8]);
        break label192;
        localCharSequence4 = (CharSequence)a(b()[9]);
        break label214;
        localCharSequence5 = (CharSequence)a(b()[10]);
        break label236;
        localCharSequence6 = (CharSequence)a(b()[11]);
        break label258;
        localCharSequence7 = (CharSequence)a(b()[12]);
        break label280;
        localTestAds = (TestAds)a(b()[13]);
        break label302;
        localMap1 = (Map)a(b()[14]);
        break label324;
        bool2 = ((Boolean)a(b()[15])).booleanValue();
        break label346;
        bool3 = ((Boolean)a(b()[16])).booleanValue();
        break label368;
        i1 = ((Integer)a(b()[17])).intValue();
        break label390;
        localList3 = (List)a(b()[18]);
        break label412;
        bool4 = ((Boolean)a(b()[19])).booleanValue();
        break label434;
        localCharSequence8 = (CharSequence)a(b()[20]);
        break label456;
        localList4 = (List)a(b()[21]);
        break label478;
        localCharSequence9 = (CharSequence)a(b()[22]);
        break label500;
        localTargetingOverride = (TargetingOverride)a(b()[23]);
        break label522;
        bool5 = ((Boolean)a(b()[24])).booleanValue();
        break label544;
        localList5 = (List)a(b()[25]);
        break label566;
        bool6 = ((Boolean)a(b()[26])).booleanValue();
        break label588;
      }
    }
    catch (Exception localException)
    {
      label883: throw new fk(localException);
    }
  }

  public Builder b(CharSequence paramCharSequence)
  {
    a(b()[1], paramCharSequence);
    this.b = paramCharSequence;
    c()[1] = 1;
    return this;
  }

  public Builder b(List<Integer> paramList)
  {
    a(b()[7], paramList);
    this.h = paramList;
    c()[7] = 1;
    return this;
  }

  public Builder b(boolean paramBoolean)
  {
    a(b()[16], Boolean.valueOf(paramBoolean));
    this.q = paramBoolean;
    c()[16] = 1;
    return this;
  }

  public Builder c(CharSequence paramCharSequence)
  {
    a(b()[2], paramCharSequence);
    this.c = paramCharSequence;
    c()[2] = 1;
    return this;
  }

  public Builder c(List<FrequencyCapInfo> paramList)
  {
    a(b()[18], paramList);
    this.s = paramList;
    c()[18] = 1;
    return this;
  }

  public Builder c(boolean paramBoolean)
  {
    a(b()[19], Boolean.valueOf(paramBoolean));
    this.t = paramBoolean;
    c()[19] = 1;
    return this;
  }

  public Builder d(CharSequence paramCharSequence)
  {
    a(b()[9], paramCharSequence);
    this.j = paramCharSequence;
    c()[9] = 1;
    return this;
  }

  public Builder d(List<CharSequence> paramList)
  {
    a(b()[21], paramList);
    this.v = paramList;
    c()[21] = 1;
    return this;
  }

  public Builder d(boolean paramBoolean)
  {
    a(b()[24], Boolean.valueOf(paramBoolean));
    this.y = paramBoolean;
    c()[24] = 1;
    return this;
  }

  public Builder e(CharSequence paramCharSequence)
  {
    a(b()[10], paramCharSequence);
    this.k = paramCharSequence;
    c()[10] = 1;
    return this;
  }

  public Builder e(List<CharSequence> paramList)
  {
    a(b()[25], paramList);
    this.z = paramList;
    c()[25] = 1;
    return this;
  }

  public Builder e(boolean paramBoolean)
  {
    a(b()[26], Boolean.valueOf(paramBoolean));
    this.A = paramBoolean;
    c()[26] = 1;
    return this;
  }

  public Builder f(CharSequence paramCharSequence)
  {
    a(b()[11], paramCharSequence);
    this.l = paramCharSequence;
    c()[11] = 1;
    return this;
  }

  public Builder g(CharSequence paramCharSequence)
  {
    a(b()[12], paramCharSequence);
    this.m = paramCharSequence;
    c()[12] = 1;
    return this;
  }

  public Builder h(CharSequence paramCharSequence)
  {
    a(b()[20], paramCharSequence);
    this.u = paramCharSequence;
    c()[20] = 1;
    return this;
  }

  public Builder i(CharSequence paramCharSequence)
  {
    a(b()[22], paramCharSequence);
    this.w = paramCharSequence;
    c()[22] = 1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.AdRequest.Builder
 * JD-Core Version:    0.6.2
 */