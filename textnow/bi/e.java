package textnow.bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

public final class e
{
  private SharedPreferences a;
  private SharedPreferences.Editor b;
  private SharedPreferences c;
  private SharedPreferences.Editor d;

  public static e a()
  {
    return f.a;
  }

  public static void a(SharedPreferences.Editor paramEditor)
  {
    if (b().booleanValue())
    {
      paramEditor.apply();
      return;
    }
    paramEditor.commit();
  }

  private static Boolean b()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 9);
      for (boolean bool = true; ; bool = false)
      {
        Boolean localBoolean = Boolean.valueOf(bool);
        return localBoolean;
      }
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
    }
    return Boolean.valueOf(false);
  }

  public final String a(Context paramContext)
  {
    if (paramContext == null);
    do
    {
      return null;
      this.a = paramContext.getSharedPreferences("net.hockeyapp.android.prefs_feedback_token", 0);
    }
    while (this.a == null);
    return this.a.getString("net.hockeyapp.android.prefs_key_feedback_token", null);
  }

  public final void a(Context paramContext, String paramString)
  {
    if (paramContext != null)
    {
      this.a = paramContext.getSharedPreferences("net.hockeyapp.android.prefs_feedback_token", 0);
      if (this.a != null)
      {
        this.b = this.a.edit();
        this.b.putString("net.hockeyapp.android.prefs_key_feedback_token", paramString);
        a(this.b);
      }
    }
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    if (paramContext != null)
    {
      this.c = paramContext.getSharedPreferences("net.hockeyapp.android.prefs_name_email", 0);
      if (this.c != null)
      {
        this.d = this.c.edit();
        if ((paramString1 != null) && (paramString2 != null) && (paramString3 != null))
          break label69;
        this.d.putString("net.hockeyapp.android.prefs_key_name_email", null);
      }
    }
    while (true)
    {
      a(this.d);
      return;
      label69: this.d.putString("net.hockeyapp.android.prefs_key_name_email", String.format("%s|%s|%s", new Object[] { paramString1, paramString2, paramString3 }));
    }
  }

  public final String b(Context paramContext)
  {
    if (paramContext == null);
    do
    {
      return null;
      this.c = paramContext.getSharedPreferences("net.hockeyapp.android.prefs_name_email", 0);
    }
    while (this.c == null);
    return this.c.getString("net.hockeyapp.android.prefs_key_name_email", null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bi.e
 * JD-Core Version:    0.6.2
 */