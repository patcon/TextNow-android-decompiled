package textnow.bp;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class h
{
  private static String a = "versionInfo";

  public static String a(Context paramContext)
  {
    if (paramContext != null)
      return paramContext.getSharedPreferences("HockeyApp", 0).getString(a, "[]");
    return "[]";
  }

  public static void a(Context paramContext, String paramString)
  {
    if (paramContext != null)
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("HockeyApp", 0).edit();
      localEditor.putString(a, paramString);
      e.a(localEditor);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bp.h
 * JD-Core Version:    0.6.2
 */