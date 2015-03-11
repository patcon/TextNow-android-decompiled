package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

public final class cy
{
  public static int a(Bundle paramBundle)
  {
    Object localObject = paramBundle.get("RESPONSE_CODE");
    if (localObject == null)
    {
      eu.D("Bundle with null response code, assuming OK (known issue)");
      return 0;
    }
    if ((localObject instanceof Integer))
      return ((Integer)localObject).intValue();
    if ((localObject instanceof Long))
      return (int)((Long)localObject).longValue();
    eu.D("Unexpected type for intent response code. " + localObject.getClass().getName());
    return 5;
  }

  public static int c(Intent paramIntent)
  {
    Object localObject = paramIntent.getExtras().get("RESPONSE_CODE");
    if (localObject == null)
    {
      eu.D("Intent with no response code, assuming OK (known issue)");
      return 0;
    }
    if ((localObject instanceof Integer))
      return ((Integer)localObject).intValue();
    if ((localObject instanceof Long))
      return (int)((Long)localObject).longValue();
    eu.D("Unexpected type for intent response code. " + localObject.getClass().getName());
    return 5;
  }

  public static String d(Intent paramIntent)
  {
    if (paramIntent == null)
      return null;
    return paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
  }

  public static String e(Intent paramIntent)
  {
    if (paramIntent == null)
      return null;
    return paramIntent.getStringExtra("INAPP_DATA_SIGNATURE");
  }

  public static String p(String paramString)
  {
    if (paramString == null)
      return null;
    try
    {
      String str = new JSONObject(paramString).getString("developerPayload");
      return str;
    }
    catch (JSONException localJSONException)
    {
      eu.D("Fail to parse purchase data");
    }
    return null;
  }

  public static String q(String paramString)
  {
    if (paramString == null)
      return null;
    try
    {
      String str = new JSONObject(paramString).getString("purchaseToken");
      return str;
    }
    catch (JSONException localJSONException)
    {
      eu.D("Fail to parse purchase data");
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cy
 * JD-Core Version:    0.6.2
 */