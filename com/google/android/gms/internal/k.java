package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.MotionEvent;

public class k
{
  private String kg = "googleads.g.doubleclick.net";
  private String kh = "/pagead/ads";
  private String ki = "ad.doubleclick.net";
  private String[] kj = { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" };
  private g kk;

  public k(g paramg)
  {
    this.kk = paramg;
  }

  private Uri a(Uri paramUri, Context paramContext, String paramString, boolean paramBoolean)
  {
    boolean bool;
    try
    {
      bool = a(paramUri);
      if (bool)
      {
        if (!paramUri.toString().contains("dc_ms="))
          break label65;
        throw new l("Parameter already exists: dc_ms");
      }
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      throw new l("Provided Uri is not in a valid state");
    }
    if (paramUri.getQueryParameter("ms") != null)
      throw new l("Query parameter already exists: ms");
    label65: if (paramBoolean);
    for (String str = this.kk.a(paramContext, paramString); bool; str = this.kk.a(paramContext))
      return b(paramUri, "dc_ms", str);
    Uri localUri = a(paramUri, "ms", str);
    return localUri;
  }

  private Uri a(Uri paramUri, String paramString1, String paramString2)
  {
    String str = paramUri.toString();
    int i = str.indexOf("&adurl");
    if (i == -1)
      i = str.indexOf("?adurl");
    if (i != -1)
      return Uri.parse(str.substring(0, i + 1) + paramString1 + "=" + paramString2 + "&" + str.substring(i + 1));
    return paramUri.buildUpon().appendQueryParameter(paramString1, paramString2).build();
  }

  private Uri b(Uri paramUri, String paramString1, String paramString2)
  {
    String str1 = paramUri.toString();
    int i = str1.indexOf(";adurl");
    if (i != -1)
      return Uri.parse(str1.substring(0, i + 1) + paramString1 + "=" + paramString2 + ";" + str1.substring(i + 1));
    String str2 = paramUri.getEncodedPath();
    int j = str1.indexOf(str2);
    return Uri.parse(str1.substring(0, j + str2.length()) + ";" + paramString1 + "=" + paramString2 + ";" + str1.substring(j + str2.length()));
  }

  public Uri a(Uri paramUri, Context paramContext)
  {
    try
    {
      Uri localUri = a(paramUri, paramContext, paramUri.getQueryParameter("ai"), true);
      return localUri;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
    }
    throw new l("Provided Uri is not in a valid state");
  }

  public void a(MotionEvent paramMotionEvent)
  {
    this.kk.a(paramMotionEvent);
  }

  public boolean a(Uri paramUri)
  {
    if (paramUri == null)
      throw new NullPointerException();
    try
    {
      boolean bool = paramUri.getHost().equals(this.ki);
      return bool;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  public boolean b(Uri paramUri)
  {
    if (paramUri == null)
      throw new NullPointerException();
    try
    {
      String str = paramUri.getHost();
      String[] arrayOfString = this.kj;
      int i = arrayOfString.length;
      for (int j = 0; ; j++)
      {
        boolean bool1 = false;
        if (j < i)
        {
          boolean bool2 = str.endsWith(arrayOfString[j]);
          if (bool2)
            bool1 = true;
        }
        else
        {
          return bool1;
        }
      }
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  public g z()
  {
    return this.kk;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.k
 * JD-Core Version:    0.6.2
 */