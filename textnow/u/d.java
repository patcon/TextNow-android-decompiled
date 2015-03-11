package textnow.u;

import android.content.Context;
import android.text.TextUtils;
import com.enflick.android.TextNow.activities.phone.t;
import java.io.Serializable;
import java.util.Set;
import textnow.q.b;
import textnow.q.k;

public final class d
  implements Serializable
{
  private String a;
  private String b;
  private int c;
  private String d;
  private boolean e;

  public d(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    this(paramString1, paramInt, paramString2, paramString3, false);
  }

  public d(String paramString1, int paramInt, String paramString2, String paramString3, boolean paramBoolean)
  {
    this.c = paramInt;
    if (this.c == 2);
    for (String str = b.a(paramString1, true); ; str = paramString1.toLowerCase())
    {
      this.b = str;
      this.d = paramString2;
      this.a = paramString3;
      this.e = paramBoolean;
      return;
    }
  }

  public static e a(Context paramContext, Set<String> paramSet, String paramString, int paramInt)
  {
    if (TextUtils.isEmpty(paramString));
    do
    {
      String str1;
      do
      {
        String str2;
        do
        {
          int i;
          do
          {
            String str3;
            do
            {
              return null;
              if (paramInt != 2)
                break;
              str3 = t.a(paramContext, paramSet, paramString);
            }
            while (str3 == null);
            return new e(str3, 2);
            if (paramInt != 3)
              break;
            if (paramSet.contains(paramString))
              return new e(paramString, 3);
            i = paramString.indexOf("@textnow.me");
          }
          while (i <= 0);
          str2 = paramString.substring(0, i);
        }
        while (!paramSet.contains(str2));
        return new e(str2, 1);
        if (paramInt != 1)
          break;
        if (paramSet.contains(paramString))
          return new e(paramString, 1);
        str1 = paramString + "@textnow.me";
      }
      while (!paramSet.contains(str1));
      return new e(str1, 3);
    }
    while ((paramInt != 5) || (!paramSet.contains(paramString)));
    return new e(paramString, 5);
  }

  public static boolean a(String paramString, int paramInt)
  {
    return ((paramInt == 2) && (!k.a(paramString))) || (paramInt == 1) || ((paramInt == 3) && (paramString.endsWith("@textnow.me")));
  }

  public static int d(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return -1;
    if (paramString.contains("@"))
      return 3;
    if (b.b(paramString.charAt(0)))
      return 1;
    return 2;
  }

  public final String a()
  {
    return this.b;
  }

  public final void a(int paramInt)
  {
    this.c = paramInt;
  }

  public final void a(String paramString)
  {
    this.b = paramString;
  }

  public final int b()
  {
    return this.c;
  }

  public final void b(String paramString)
  {
    this.d = paramString;
  }

  public final String c()
  {
    return this.d;
  }

  public final void c(String paramString)
  {
    this.a = paramString;
  }

  public final String d()
  {
    return this.a;
  }

  public final boolean e()
  {
    return this.e;
  }

  public final boolean f()
  {
    return (this.c == 1) || (this.b.contains("@textnow.me"));
  }

  public final String g()
  {
    if (!TextUtils.isEmpty(this.d))
      return this.d;
    if (this.c == 2)
    {
      if (k.a(this.b))
        return "Unknown Number";
      return b.f(this.b);
    }
    return this.b;
  }

  public final boolean h()
  {
    return (TextUtils.isEmpty(this.d)) && (!k.a(this.b));
  }

  public final boolean i()
  {
    return (TextUtils.isEmpty(this.a)) || ("NON_CONTACT".equals(this.a));
  }

  public final boolean j()
  {
    return a(this.b, this.c);
  }

  public final String toString()
  {
    return getClass().getName() + "[" + "mContactValue " + this.b + ", " + "mContactType " + this.c + ", " + "mContactUriStr " + this.a + ", " + "mContactName " + this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.u.d
 * JD-Core Version:    0.6.2
 */