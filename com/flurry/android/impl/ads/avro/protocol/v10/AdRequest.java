package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.fn;
import com.flurry.sdk.fn.q;
import com.flurry.sdk.gv;
import com.flurry.sdk.gw;
import java.util.List;
import java.util.Map;

public class AdRequest extends gw
  implements gv
{
  public static final fn SCHEMA$ = new fn.q().a("{\"type\":\"record\",\"name\":\"AdRequest\",\"namespace\":\"com.flurry.android.impl.ads.avro.protocol.v10\",\"fields\":[{\"name\":\"apiKey\",\"type\":\"string\"},{\"name\":\"agentVersion\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"adSpaceName\",\"type\":\"string\"},{\"name\":\"sessionId\",\"type\":\"long\"},{\"name\":\"adReportedIds\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AdReportedId\",\"fields\":[{\"name\":\"type\",\"type\":\"int\"},{\"name\":\"id\",\"type\":\"bytes\"}]}}},{\"name\":\"location\",\"type\":{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"lat\",\"type\":\"float\",\"default\":0.0},{\"name\":\"lon\",\"type\":\"float\",\"default\":0.0}]},\"default\":\"null\"},{\"name\":\"testDevice\",\"type\":\"boolean\",\"default\":false},{\"name\":\"bindings\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"adViewContainer\",\"type\":{\"type\":\"record\",\"name\":\"AdViewContainer\",\"fields\":[{\"name\":\"viewWidth\",\"type\":\"int\",\"default\":0},{\"name\":\"viewHeight\",\"type\":\"int\",\"default\":0},{\"name\":\"screenWidth\",\"type\":\"int\",\"default\":0},{\"name\":\"screenHeight\",\"type\":\"int\",\"default\":0},{\"name\":\"density\",\"type\":\"float\",\"default\":1.0},{\"name\":\"screenOrientation\",\"type\":{\"type\":\"enum\",\"name\":\"ScreenOrientationType\",\"symbols\":[\"PORTRAIT\",\"LANDSCAPE\",\"UNKNOWN\"]},\"default\":\"UNKNOWN\"}]},\"default\":\"null\"},{\"name\":\"locale\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"timezone\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"osVersion\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"devicePlatform\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"testAds\",\"type\":{\"type\":\"record\",\"name\":\"TestAds\",\"fields\":[{\"name\":\"adspacePlacement\",\"type\":\"int\",\"default\":0}]},\"default\":\"null\"},{\"name\":\"keywords\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"default\":[]},{\"name\":\"refresh\",\"type\":\"boolean\",\"default\":false},{\"name\":\"canDoSKAppStore\",\"type\":\"boolean\",\"default\":false},{\"name\":\"networkStatus\",\"type\":\"int\",\"default\":1},{\"name\":\"frequencyCapInfos\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FrequencyCapInfo\",\"fields\":[{\"name\":\"idHash\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"serveTime\",\"type\":\"long\"},{\"name\":\"expirationTime\",\"type\":\"long\"},{\"name\":\"views\",\"type\":\"int\"},{\"name\":\"newCap\",\"type\":\"int\"},{\"name\":\"previousCap\",\"type\":\"int\"},{\"name\":\"previousCapType\",\"type\":\"int\"}]}}},{\"name\":\"adTrackingEnabled\",\"type\":\"boolean\"},{\"name\":\"preferredLanguage\",\"type\":\"string\"},{\"name\":\"bcat\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"userAgent\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"targetingOverride\",\"type\":{\"type\":\"record\",\"name\":\"TargetingOverride\",\"fields\":[{\"name\":\"ageRange\",\"type\":\"int\",\"default\":-2},{\"name\":\"gender\",\"type\":\"int\",\"default\":-2},{\"name\":\"personas\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"default\":[]}]},\"default\":[]},{\"name\":\"sendConfiguration\",\"type\":\"boolean\",\"default\":false},{\"name\":\"origins\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"default\":[]},{\"name\":\"renderTime\",\"type\":\"boolean\",\"default\":false},{\"name\":\"clientSideRtbPayload\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"default\":[]}]}");

  @Deprecated
  public boolean A;

  @Deprecated
  public Map<CharSequence, CharSequence> B;

  @Deprecated
  public CharSequence a;

  @Deprecated
  public CharSequence b;

  @Deprecated
  public CharSequence c;

  @Deprecated
  public long d;

  @Deprecated
  public List<AdReportedId> e;

  @Deprecated
  public Location f;

  @Deprecated
  public boolean g;

  @Deprecated
  public List<Integer> h;

  @Deprecated
  public AdViewContainer i;

  @Deprecated
  public CharSequence j;

  @Deprecated
  public CharSequence k;

  @Deprecated
  public CharSequence l;

  @Deprecated
  public CharSequence m;

  @Deprecated
  public TestAds n;

  @Deprecated
  public Map<CharSequence, CharSequence> o;

  @Deprecated
  public boolean p;

  @Deprecated
  public boolean q;

  @Deprecated
  public int r;

  @Deprecated
  public List<FrequencyCapInfo> s;

  @Deprecated
  public boolean t;

  @Deprecated
  public CharSequence u;

  @Deprecated
  public List<CharSequence> v;

  @Deprecated
  public CharSequence w;

  @Deprecated
  public TargetingOverride x;

  @Deprecated
  public boolean y;

  @Deprecated
  public List<CharSequence> z;

  public static AdRequest.Builder b()
  {
    return new AdRequest.Builder(null);
  }

  public fn a()
  {
    return SCHEMA$;
  }

  public Object a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new fk("Bad index");
    case 0:
      return this.a;
    case 1:
      return this.b;
    case 2:
      return this.c;
    case 3:
      return Long.valueOf(this.d);
    case 4:
      return this.e;
    case 5:
      return this.f;
    case 6:
      return Boolean.valueOf(this.g);
    case 7:
      return this.h;
    case 8:
      return this.i;
    case 9:
      return this.j;
    case 10:
      return this.k;
    case 11:
      return this.l;
    case 12:
      return this.m;
    case 13:
      return this.n;
    case 14:
      return this.o;
    case 15:
      return Boolean.valueOf(this.p);
    case 16:
      return Boolean.valueOf(this.q);
    case 17:
      return Integer.valueOf(this.r);
    case 18:
      return this.s;
    case 19:
      return Boolean.valueOf(this.t);
    case 20:
      return this.u;
    case 21:
      return this.v;
    case 22:
      return this.w;
    case 23:
      return this.x;
    case 24:
      return Boolean.valueOf(this.y);
    case 25:
      return this.z;
    case 26:
      return Boolean.valueOf(this.A);
    case 27:
    }
    return this.B;
  }

  public void a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default:
      throw new fk("Bad index");
    case 0:
      this.a = ((CharSequence)paramObject);
      return;
    case 1:
      this.b = ((CharSequence)paramObject);
      return;
    case 2:
      this.c = ((CharSequence)paramObject);
      return;
    case 3:
      this.d = ((Long)paramObject).longValue();
      return;
    case 4:
      this.e = ((List)paramObject);
      return;
    case 5:
      this.f = ((Location)paramObject);
      return;
    case 6:
      this.g = ((Boolean)paramObject).booleanValue();
      return;
    case 7:
      this.h = ((List)paramObject);
      return;
    case 8:
      this.i = ((AdViewContainer)paramObject);
      return;
    case 9:
      this.j = ((CharSequence)paramObject);
      return;
    case 10:
      this.k = ((CharSequence)paramObject);
      return;
    case 11:
      this.l = ((CharSequence)paramObject);
      return;
    case 12:
      this.m = ((CharSequence)paramObject);
      return;
    case 13:
      this.n = ((TestAds)paramObject);
      return;
    case 14:
      this.o = ((Map)paramObject);
      return;
    case 15:
      this.p = ((Boolean)paramObject).booleanValue();
      return;
    case 16:
      this.q = ((Boolean)paramObject).booleanValue();
      return;
    case 17:
      this.r = ((Integer)paramObject).intValue();
      return;
    case 18:
      this.s = ((List)paramObject);
      return;
    case 19:
      this.t = ((Boolean)paramObject).booleanValue();
      return;
    case 20:
      this.u = ((CharSequence)paramObject);
      return;
    case 21:
      this.v = ((List)paramObject);
      return;
    case 22:
      this.w = ((CharSequence)paramObject);
      return;
    case 23:
      this.x = ((TargetingOverride)paramObject);
      return;
    case 24:
      this.y = ((Boolean)paramObject).booleanValue();
      return;
    case 25:
      this.z = ((List)paramObject);
      return;
    case 26:
      this.A = ((Boolean)paramObject).booleanValue();
      return;
    case 27:
    }
    this.B = ((Map)paramObject);
  }

  public void a(TestAds paramTestAds)
  {
    this.n = paramTestAds;
  }

  public void a(Boolean paramBoolean)
  {
    this.p = paramBoolean.booleanValue();
  }

  public void a(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
  }

  public void a(Map<CharSequence, CharSequence> paramMap)
  {
    this.o = paramMap;
  }

  public void b(Map<CharSequence, CharSequence> paramMap)
  {
    this.B = paramMap;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.AdRequest
 * JD-Core Version:    0.6.2
 */