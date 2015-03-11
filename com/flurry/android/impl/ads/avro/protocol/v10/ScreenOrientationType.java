package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fn;
import com.flurry.sdk.fn.q;

public enum ScreenOrientationType
{
  public static final fn SCHEMA$ = new fn.q().a("{\"type\":\"enum\",\"name\":\"ScreenOrientationType\",\"namespace\":\"com.flurry.android.impl.ads.avro.protocol.v10\",\"symbols\":[\"PORTRAIT\",\"LANDSCAPE\",\"UNKNOWN\"]}");

  static
  {
    ScreenOrientationType[] arrayOfScreenOrientationType = new ScreenOrientationType[3];
    arrayOfScreenOrientationType[0] = a;
    arrayOfScreenOrientationType[1] = b;
    arrayOfScreenOrientationType[2] = c;
    d = arrayOfScreenOrientationType;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.ScreenOrientationType
 * JD-Core Version:    0.6.2
 */