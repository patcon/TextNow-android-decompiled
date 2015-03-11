package com.facebook.internal;

import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONObject;

public class Utility$DialogFeatureConfig
{
  private String dialogName;
  private Uri fallbackUrl;
  private String featureName;
  private int[] featureVersionSpec;

  private Utility$DialogFeatureConfig(String paramString1, String paramString2, Uri paramUri, int[] paramArrayOfInt)
  {
    this.dialogName = paramString1;
    this.featureName = paramString2;
    this.fallbackUrl = paramUri;
    this.featureVersionSpec = paramArrayOfInt;
  }

  private static DialogFeatureConfig parseDialogConfig(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("name");
    if (Utility.isNullOrEmpty(str1));
    String str2;
    String str3;
    do
    {
      String[] arrayOfString;
      do
      {
        return null;
        arrayOfString = str1.split("\\|");
      }
      while (arrayOfString.length != 2);
      str2 = arrayOfString[0];
      str3 = arrayOfString[1];
    }
    while ((Utility.isNullOrEmpty(str2)) || (Utility.isNullOrEmpty(str3)));
    String str4 = paramJSONObject.optString("url");
    boolean bool = Utility.isNullOrEmpty(str4);
    Uri localUri = null;
    if (!bool)
      localUri = Uri.parse(str4);
    return new DialogFeatureConfig(str2, str3, localUri, parseVersionSpec(paramJSONObject.optJSONArray("versions")));
  }

  private static int[] parseVersionSpec(JSONArray paramJSONArray)
  {
    Object localObject = null;
    if (paramJSONArray != null)
    {
      int i = paramJSONArray.length();
      int[] arrayOfInt = new int[i];
      int j = 0;
      while (true)
        if (j < i)
        {
          int k = paramJSONArray.optInt(j, -1);
          String str;
          if (k == -1)
          {
            str = paramJSONArray.optString(j);
            if (Utility.isNullOrEmpty(str));
          }
          try
          {
            int m = Integer.parseInt(str);
            k = m;
            arrayOfInt[j] = k;
            j++;
          }
          catch (NumberFormatException localNumberFormatException)
          {
            while (true)
            {
              Utility.logd("FacebookSDK", localNumberFormatException);
              k = -1;
            }
          }
        }
      localObject = arrayOfInt;
    }
    return localObject;
  }

  public String getDialogName()
  {
    return this.dialogName;
  }

  public Uri getFallbackUrl()
  {
    return this.fallbackUrl;
  }

  public String getFeatureName()
  {
    return this.featureName;
  }

  public int[] getVersionSpec()
  {
    return this.featureVersionSpec;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.Utility.DialogFeatureConfig
 * JD-Core Version:    0.6.2
 */