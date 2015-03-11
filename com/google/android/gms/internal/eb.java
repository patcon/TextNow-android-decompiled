package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class eb
{
  private final List<String> qS;
  private final List<String> qT;
  private final String qU;
  private final String qV;
  private final String qW;
  private final String qX;
  private final String qY;
  private final boolean qZ;
  private final int ra;

  public eb(Map<String, String> paramMap)
  {
    this.qY = ((String)paramMap.get("url"));
    this.qV = ((String)paramMap.get("base_uri"));
    this.qW = ((String)paramMap.get("post_parameters"));
    this.qZ = parseBoolean((String)paramMap.get("drt_include"));
    this.qU = ((String)paramMap.get("activation_overlay_url"));
    this.qT = t((String)paramMap.get("check_packages"));
    this.ra = parseInt((String)paramMap.get("request_id"));
    this.qX = ((String)paramMap.get("type"));
    this.qS = t((String)paramMap.get("errors"));
  }

  private static boolean parseBoolean(String paramString)
  {
    return (paramString != null) && ((paramString.equals("1")) || (paramString.equals("true")));
  }

  private int parseInt(String paramString)
  {
    if (paramString == null)
      return 0;
    return Integer.parseInt(paramString);
  }

  private List<String> t(String paramString)
  {
    if (paramString == null)
      return null;
    return Arrays.asList(paramString.split(","));
  }

  public boolean bA()
  {
    return this.qZ;
  }

  public List<String> by()
  {
    return this.qS;
  }

  public String bz()
  {
    return this.qW;
  }

  public String getType()
  {
    return this.qX;
  }

  public String getUrl()
  {
    return this.qY;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eb
 * JD-Core Version:    0.6.2
 */