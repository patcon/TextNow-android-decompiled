package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;

public class h
{
  private static final Uri Md = localUri;
  private static final Uri Me = localUri.buildUpon().appendPath("circles").appendPath("find").build();

  static
  {
    Uri localUri = Uri.parse("http://plus.google.com/");
  }

  public static Intent aW(String paramString)
  {
    Uri localUri = Uri.fromParts("package", paramString, null);
    Intent localIntent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
    localIntent.setData(localUri);
    return localIntent;
  }

  private static Uri aX(String paramString)
  {
    return Uri.parse("market://details").buildUpon().appendQueryParameter("id", paramString).build();
  }

  public static Intent aY(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(aX(paramString));
    localIntent.setPackage("com.android.vending");
    localIntent.addFlags(524288);
    return localIntent;
  }

  public static Intent gZ()
  {
    Intent localIntent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
    localIntent.setPackage("com.google.android.wearable.app");
    return localIntent;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.h
 * JD-Core Version:    0.6.2
 */