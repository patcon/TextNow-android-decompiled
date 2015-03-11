package textnow.v;

import android.content.pm.ApplicationInfo;
import com.enflick.android.TextNow.TextNowApp;

public final class a
{
  public static boolean a = false;
  public static final boolean b;
  public static final boolean c;
  public static final String d;

  static
  {
    boolean bool1;
    if ((0x2 & TextNowApp.a().getApplicationInfo().flags) != 0)
    {
      bool1 = true;
      a = bool1;
      boolean bool2 = "default".equalsIgnoreCase("amazon");
      boolean bool3 = false;
      if (bool2)
        bool3 = true;
      b = bool3;
      new StringBuilder().append("Setting IS_AMAZON_BUILD to: ").append(b).toString();
      c = true;
      if (!bool1)
        break label89;
    }
    label89: for (String str = "pk_test_MgVVfzaXX8dR1nfIJs9on5dO"; ; str = "pk_live_wVuDm7SIg4xEMcoNpGL24A2z")
    {
      d = str;
      return;
      bool1 = false;
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.v.a
 * JD-Core Version:    0.6.2
 */