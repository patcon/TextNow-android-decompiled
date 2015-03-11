package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v4.content.e;

class am
  implements al
{
  public Intent a(Activity paramActivity)
  {
    String str = ak.b(paramActivity);
    if (str == null)
      return null;
    ComponentName localComponentName = new ComponentName(paramActivity, str);
    try
    {
      if (ak.b(paramActivity, localComponentName) == null)
        return e.a(localComponentName);
      Intent localIntent = new Intent().setComponent(localComponentName);
      return localIntent;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      new StringBuilder().append("getParentActivityIntent: bad parentActivityName '").append(str).append("' in manifest").toString();
    }
    return null;
  }

  public String a(Context paramContext, ActivityInfo paramActivityInfo)
  {
    String str;
    if (paramActivityInfo.metaData == null)
      str = null;
    do
    {
      return str;
      str = paramActivityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
      if (str == null)
        return null;
    }
    while (str.charAt(0) != '.');
    return paramContext.getPackageName() + str;
  }

  public boolean a(Activity paramActivity, Intent paramIntent)
  {
    String str = paramActivity.getIntent().getAction();
    return (str != null) && (!str.equals("android.intent.action.MAIN"));
  }

  public void b(Activity paramActivity, Intent paramIntent)
  {
    paramIntent.addFlags(67108864);
    paramActivity.startActivity(paramIntent);
    paramActivity.finish();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.am
 * JD-Core Version:    0.6.2
 */