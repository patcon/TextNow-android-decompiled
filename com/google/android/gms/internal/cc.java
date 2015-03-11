package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public final class cc
{
  public static boolean a(Context paramContext, ce paramce, cl paramcl)
  {
    if (paramce == null)
    {
      eu.D("No intent data for launcher overlay.");
      return false;
    }
    Intent localIntent = new Intent();
    if (TextUtils.isEmpty(paramce.ob))
    {
      eu.D("Open GMSG did not contain a URL.");
      return false;
    }
    if (!TextUtils.isEmpty(paramce.mimeType))
      localIntent.setDataAndType(Uri.parse(paramce.ob), paramce.mimeType);
    String[] arrayOfString;
    while (true)
    {
      localIntent.setAction("android.intent.action.VIEW");
      if (!TextUtils.isEmpty(paramce.packageName))
        localIntent.setPackage(paramce.packageName);
      if (TextUtils.isEmpty(paramce.oc))
        break label172;
      arrayOfString = paramce.oc.split("/", 2);
      if (arrayOfString.length >= 2)
        break;
      eu.D("Could not parse component name from open GMSG: " + paramce.oc);
      return false;
      localIntent.setData(Uri.parse(paramce.ob));
    }
    localIntent.setClassName(arrayOfString[0], arrayOfString[1]);
    try
    {
      label172: eu.C("Launching an intent: " + localIntent);
      paramContext.startActivity(localIntent);
      paramcl.Y();
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      eu.D(localActivityNotFoundException.getMessage());
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cc
 * JD-Core Version:    0.6.2
 */