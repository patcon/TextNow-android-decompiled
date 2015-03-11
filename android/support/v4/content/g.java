package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

class g
  implements f
{
  public Intent a(ComponentName paramComponentName)
  {
    Intent localIntent = new Intent("android.intent.action.MAIN");
    localIntent.setComponent(paramComponentName);
    localIntent.addCategory("android.intent.category.LAUNCHER");
    return localIntent;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.content.g
 * JD-Core Version:    0.6.2
 */