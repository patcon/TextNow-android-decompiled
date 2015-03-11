package com.mopub.common.util;

import android.os.Build.VERSION;

public enum VersionCode
{
  private int mApiLevel;

  static
  {
    CUR_DEVELOPMENT = new VersionCode("CUR_DEVELOPMENT", 19, 10000);
    VersionCode[] arrayOfVersionCode = new VersionCode[20];
    arrayOfVersionCode[0] = BASE;
    arrayOfVersionCode[1] = BASE_1_1;
    arrayOfVersionCode[2] = CUPCAKE;
    arrayOfVersionCode[3] = DONUT;
    arrayOfVersionCode[4] = ECLAIR;
    arrayOfVersionCode[5] = ECLAIR_0_1;
    arrayOfVersionCode[6] = ECLAIR_MR1;
    arrayOfVersionCode[7] = FROYO;
    arrayOfVersionCode[8] = GINGERBREAD;
    arrayOfVersionCode[9] = GINGERBREAD_MR1;
    arrayOfVersionCode[10] = HONEYCOMB;
    arrayOfVersionCode[11] = HONEYCOMB_MR1;
    arrayOfVersionCode[12] = HONEYCOMB_MR2;
    arrayOfVersionCode[13] = ICE_CREAM_SANDWICH;
    arrayOfVersionCode[14] = ICE_CREAM_SANDWICH_MR1;
    arrayOfVersionCode[15] = JELLY_BEAN;
    arrayOfVersionCode[16] = JELLY_BEAN_MR1;
    arrayOfVersionCode[17] = JELLY_BEAN_MR2;
    arrayOfVersionCode[18] = KITKAT;
    arrayOfVersionCode[19] = CUR_DEVELOPMENT;
  }

  private VersionCode(int paramInt)
  {
    this.mApiLevel = paramInt;
  }

  public static VersionCode currentApiLevel()
  {
    return forApiLevel(Build.VERSION.SDK_INT);
  }

  private static VersionCode forApiLevel(int paramInt)
  {
    for (VersionCode localVersionCode : values())
      if (localVersionCode.getApiLevel() == paramInt)
        return localVersionCode;
    return CUR_DEVELOPMENT;
  }

  public final int getApiLevel()
  {
    return this.mApiLevel;
  }

  public final boolean isAtLeast(VersionCode paramVersionCode)
  {
    return getApiLevel() >= paramVersionCode.getApiLevel();
  }

  public final boolean isAtMost(VersionCode paramVersionCode)
  {
    return getApiLevel() <= paramVersionCode.getApiLevel();
  }

  public final boolean isBelow(VersionCode paramVersionCode)
  {
    return getApiLevel() < paramVersionCode.getApiLevel();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.VersionCode
 * JD-Core Version:    0.6.2
 */