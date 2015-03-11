package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.admarvel.android.util.Logging;
import java.net.URISyntaxException;

class t
{
  static boolean a(String paramString, Context paramContext)
  {
    boolean bool = true;
    if ((paramContext == null) || (paramString == null))
      bool = false;
    while (true)
    {
      return bool;
      try
      {
        Intent localIntent1 = Intent.parseUri(paramString, 1);
        if (paramContext.getPackageManager().resolveActivity(localIntent1, 0) != null)
          break label222;
        String str = localIntent1.getPackage();
        if (str != null)
        {
          Logging.log(" going for market in shouldOverrideUrlLoading on internalwebview " + str);
          Intent localIntent2 = new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pname:" + str));
          localIntent2.addFlags(268435456);
          localIntent2.addCategory("android.intent.category.BROWSABLE");
          if (ab.a(paramContext, localIntent2))
            paramContext.startActivity(localIntent2);
          if ((paramContext == null) || (!(paramContext instanceof Activity)))
            continue;
          Activity localActivity = (Activity)paramContext;
          if ((localActivity == null) || (!(localActivity instanceof AdMarvelActivity)))
            continue;
          AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)localActivity;
          if (localAdMarvelActivity == null)
            continue;
          localAdMarvelActivity.g();
          return bool;
        }
      }
      catch (URISyntaxException localURISyntaxException)
      {
        Logging.log("Bad URI " + paramString + ": " + localURISyntaxException.getMessage());
        return false;
      }
    }
    return false;
    label222: return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.t
 * JD-Core Version:    0.6.2
 */