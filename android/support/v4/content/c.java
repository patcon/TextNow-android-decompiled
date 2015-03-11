package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;

public class c
{
  public static final Drawable a(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21)
      return paramContext.getDrawable(paramInt);
    return paramContext.getResources().getDrawable(paramInt);
  }

  public static boolean a(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 16)
    {
      paramContext.startActivities(paramArrayOfIntent, paramBundle);
      return true;
    }
    if (i >= 11)
    {
      paramContext.startActivities(paramArrayOfIntent);
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.content.c
 * JD-Core Version:    0.6.2
 */