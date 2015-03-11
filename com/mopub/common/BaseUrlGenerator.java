package com.mopub.common;

import android.net.Uri;
import com.mopub.common.util.Strings;

public abstract class BaseUrlGenerator
{
  private static final String IFA_PREFIX = "ifa:";
  private static final String SHA_PREFIX = "sha:";
  private boolean mFirstParam;
  private StringBuilder mStringBuilder;

  private String getParamDelimiter()
  {
    if (this.mFirstParam)
    {
      this.mFirstParam = false;
      return "?";
    }
    return "&";
  }

  protected void addParam(String paramString1, String paramString2)
  {
    if ((paramString2 == null) || (Strings.isEmpty(paramString2)))
      return;
    this.mStringBuilder.append(getParamDelimiter());
    this.mStringBuilder.append(paramString1);
    this.mStringBuilder.append("=");
    this.mStringBuilder.append(Uri.encode(paramString2));
  }

  public abstract String generateUrlString(String paramString);

  protected String getFinalUrlString()
  {
    return this.mStringBuilder.toString();
  }

  protected void initUrlString(String paramString1, String paramString2)
  {
    this.mStringBuilder = new StringBuilder("http://" + paramString1 + paramString2);
    this.mFirstParam = true;
  }

  protected void setApiVersion(String paramString)
  {
    addParam("v", paramString);
  }

  protected void setAppVersion(String paramString)
  {
    addParam("av", paramString);
  }

  protected void setDeviceInfo(String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
      return;
    for (int i = 0; i < -1 + paramArrayOfString.length; i++)
      localStringBuilder.append(paramArrayOfString[i]).append(",");
    localStringBuilder.append(paramArrayOfString[(-1 + paramArrayOfString.length)]);
    addParam("dn", localStringBuilder.toString());
  }

  protected void setDoNotTrack(boolean paramBoolean)
  {
    if (paramBoolean)
      addParam("dnt", "1");
  }

  protected void setExternalStoragePermission(boolean paramBoolean)
  {
    if (paramBoolean);
    for (String str = "1"; ; str = "0")
    {
      addParam("android_perms_ext_storage", str);
      return;
    }
  }

  protected void setUdid(String paramString)
  {
    addParam("udid", paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.BaseUrlGenerator
 * JD-Core Version:    0.6.2
 */