package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class bb
{
  public static final bc mT = new bc()
  {
    public final void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
    {
    }
  };
  public static final bc mU = new bc()
  {
    public final void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
    {
      String str1 = (String)paramAnonymousMap.get("urls");
      if (TextUtils.isEmpty(str1))
      {
        eu.D("URLs missing in canOpenURLs GMSG.");
        return;
      }
      String[] arrayOfString1 = str1.split(",");
      HashMap localHashMap = new HashMap();
      PackageManager localPackageManager = paramAnonymousex.getContext().getPackageManager();
      int i = arrayOfString1.length;
      int j = 0;
      if (j < i)
      {
        String str2 = arrayOfString1[j];
        String[] arrayOfString2 = str2.split(";", 2);
        String str3 = arrayOfString2[0].trim();
        String str4;
        if (arrayOfString2.length > 1)
        {
          str4 = arrayOfString2[1].trim();
          label108: if (localPackageManager.resolveActivity(new Intent(str4, Uri.parse(str3)), 65536) == null)
            break label161;
        }
        label161: for (boolean bool = true; ; bool = false)
        {
          localHashMap.put(str2, Boolean.valueOf(bool));
          j++;
          break;
          str4 = "android.intent.action.VIEW";
          break label108;
        }
      }
      paramAnonymousex.a("openableURLs", localHashMap);
    }
  };
  public static final bc mV = new bc()
  {
    public final void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
    {
      String str1 = (String)paramAnonymousMap.get("u");
      if (str1 == null)
      {
        eu.D("URL missing from click GMSG.");
        return;
      }
      Uri localUri1 = Uri.parse(str1);
      try
      {
        k localk = paramAnonymousex.cc();
        if ((localk != null) && (localk.b(localUri1)))
        {
          Uri localUri3 = localk.a(localUri1, paramAnonymousex.getContext());
          localUri2 = localUri3;
          String str2 = localUri2.toString();
          new es(paramAnonymousex.getContext(), paramAnonymousex.cd().sw, str2).start();
          return;
        }
      }
      catch (l locall)
      {
        while (true)
        {
          eu.D("Unable to append parameter to URL: " + str1);
          Uri localUri2 = localUri1;
        }
      }
    }
  };
  public static final bc mW = new bc()
  {
    public final void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
    {
      cf localcf = paramAnonymousex.ca();
      if (localcf == null)
      {
        eu.D("A GMSG tried to close something that wasn't an overlay.");
        return;
      }
      localcf.close();
    }
  };
  public static final bc mX = new bc()
  {
    public final void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
    {
      cf localcf = paramAnonymousex.ca();
      if (localcf == null)
      {
        eu.D("A GMSG tried to use a custom close button on something that wasn't an overlay.");
        return;
      }
      localcf.j("1".equals(paramAnonymousMap.get("custom_close")));
    }
  };
  public static final bc mY = new bc()
  {
    public final void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
    {
      String str = (String)paramAnonymousMap.get("u");
      if (str == null)
      {
        eu.D("URL missing from httpTrack GMSG.");
        return;
      }
      new es(paramAnonymousex.getContext(), paramAnonymousex.cd().sw, str).start();
    }
  };
  public static final bc mZ = new bc()
  {
    public final void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
    {
      eu.B("Received log message: " + (String)paramAnonymousMap.get("string"));
    }
  };
  public static final bc na = new bc()
  {
    public final void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
    {
      String str1 = (String)paramAnonymousMap.get("tx");
      String str2 = (String)paramAnonymousMap.get("ty");
      String str3 = (String)paramAnonymousMap.get("td");
      try
      {
        int i = Integer.parseInt(str1);
        int j = Integer.parseInt(str2);
        int k = Integer.parseInt(str3);
        k localk = paramAnonymousex.cc();
        if (localk != null)
          localk.z().a(i, j, k);
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        eu.D("Could not parse touch parameters from gmsg.");
      }
    }
  };
  public static final bc nb = new bh();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bb
 * JD-Core Version:    0.6.2
 */