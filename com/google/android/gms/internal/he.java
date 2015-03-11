package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;

public class he
{
  private static final Uri GG = localUri;
  private static final Uri GH = localUri.buildUpon().appendPath("circles").appendPath("find").build();

  static
  {
    Uri localUri = Uri.parse("http://plus.google.com/");
  }

  public static Intent aB(String paramString)
  {
    Uri localUri = Uri.fromParts("package", paramString, null);
    Intent localIntent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
    localIntent.setData(localUri);
    return localIntent;
  }

  private static Uri aC(String paramString)
  {
    return Uri.parse("market://details").buildUpon().appendQueryParameter("id", paramString).build();
  }

  public static Intent aD(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(aC(paramString));
    localIntent.setPackage("com.android.vending");
    localIntent.addFlags(524288);
    return localIntent;
  }

  public static Intent fA()
  {
    return new Intent("android.settings.DATE_SETTINGS");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.he
 * JD-Core Version:    0.6.2
 */