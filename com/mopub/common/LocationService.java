package com.mopub.common;

public class LocationService
{
  // ERROR //
  public static android.location.Location getLastKnownLocation(android.content.Context paramContext, int paramInt, MoPub.LocationAwareness paramLocationAwareness)
  {
    // Byte code:
    //   0: aload_2
    //   1: getstatic 20	com/mopub/common/MoPub$LocationAwareness:DISABLED	Lcom/mopub/common/MoPub$LocationAwareness;
    //   4: if_acmpne +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_0
    //   10: ldc 22
    //   12: invokevirtual 28	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   15: checkcast 30	android/location/LocationManager
    //   18: astore_3
    //   19: aload_3
    //   20: ldc 32
    //   22: invokevirtual 35	android/location/LocationManager:getLastKnownLocation	(Ljava/lang/String;)Landroid/location/Location;
    //   25: astore 11
    //   27: aload 11
    //   29: astore 5
    //   31: aload_3
    //   32: ldc 37
    //   34: invokevirtual 35	android/location/LocationManager:getLastKnownLocation	(Ljava/lang/String;)Landroid/location/Location;
    //   37: astore 9
    //   39: aload 9
    //   41: astore 7
    //   43: aload 5
    //   45: ifnonnull +8 -> 53
    //   48: aload 7
    //   50: ifnull -43 -> 7
    //   53: aload 5
    //   55: ifnull +133 -> 188
    //   58: aload 7
    //   60: ifnull +128 -> 188
    //   63: aload 5
    //   65: invokevirtual 43	android/location/Location:getTime	()J
    //   68: aload 7
    //   70: invokevirtual 43	android/location/Location:getTime	()J
    //   73: lcmp
    //   74: ifle +107 -> 181
    //   77: aload_2
    //   78: getstatic 46	com/mopub/common/MoPub$LocationAwareness:TRUNCATED	Lcom/mopub/common/MoPub$LocationAwareness;
    //   81: if_acmpne +45 -> 126
    //   84: aload 5
    //   86: aload 5
    //   88: invokevirtual 50	android/location/Location:getLatitude	()D
    //   91: invokestatic 56	java/math/BigDecimal:valueOf	(D)Ljava/math/BigDecimal;
    //   94: iload_1
    //   95: iconst_5
    //   96: invokevirtual 60	java/math/BigDecimal:setScale	(II)Ljava/math/BigDecimal;
    //   99: invokevirtual 63	java/math/BigDecimal:doubleValue	()D
    //   102: invokevirtual 67	android/location/Location:setLatitude	(D)V
    //   105: aload 5
    //   107: aload 5
    //   109: invokevirtual 70	android/location/Location:getLongitude	()D
    //   112: invokestatic 56	java/math/BigDecimal:valueOf	(D)Ljava/math/BigDecimal;
    //   115: iload_1
    //   116: iconst_5
    //   117: invokevirtual 60	java/math/BigDecimal:setScale	(II)Ljava/math/BigDecimal;
    //   120: invokevirtual 63	java/math/BigDecimal:doubleValue	()D
    //   123: invokevirtual 73	android/location/Location:setLongitude	(D)V
    //   126: aload 5
    //   128: areturn
    //   129: astore 10
    //   131: ldc 75
    //   133: invokestatic 81	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   136: aconst_null
    //   137: astore 5
    //   139: goto -108 -> 31
    //   142: astore 4
    //   144: ldc 83
    //   146: invokestatic 81	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   149: aconst_null
    //   150: astore 5
    //   152: goto -121 -> 31
    //   155: astore 8
    //   157: ldc 85
    //   159: invokestatic 81	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   162: aconst_null
    //   163: astore 7
    //   165: goto -122 -> 43
    //   168: astore 6
    //   170: ldc 87
    //   172: invokestatic 81	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   175: aconst_null
    //   176: astore 7
    //   178: goto -135 -> 43
    //   181: aload 7
    //   183: astore 5
    //   185: goto -108 -> 77
    //   188: aload 5
    //   190: ifnonnull -113 -> 77
    //   193: aload 7
    //   195: astore 5
    //   197: goto -120 -> 77
    //
    // Exception table:
    //   from	to	target	type
    //   19	27	129	java/lang/SecurityException
    //   19	27	142	java/lang/IllegalArgumentException
    //   31	39	155	java/lang/SecurityException
    //   31	39	168	java/lang/IllegalArgumentException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.LocationService
 * JD-Core Version:    0.6.2
 */