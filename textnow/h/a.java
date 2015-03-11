package textnow.h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import textnow.g.c;
import textnow.g.d;
import textnow.g.e;
import textnow.g.g;
import textnow.g.k;

public final class a
{
  private Context a;

  private a(Context paramContext)
  {
    this.a = paramContext;
  }

  public static a a(Context paramContext)
  {
    return new a(paramContext);
  }

  public final int a()
  {
    return this.a.getResources().getInteger(g.a);
  }

  public final int b()
  {
    return this.a.getResources().getDisplayMetrics().widthPixels / 2;
  }

  public final boolean c()
  {
    return this.a.getResources().getBoolean(d.a);
  }

  public final int d()
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(null, k.a, c.b, 0);
    int i = localTypedArray.getLayoutDimension(1, 0);
    Resources localResources = this.a.getResources();
    if (!c())
      i = Math.min(i, localResources.getDimensionPixelSize(e.a));
    localTypedArray.recycle();
    return i;
  }

  public final boolean e()
  {
    return this.a.getApplicationInfo().targetSdkVersion < 14;
  }

  public final int f()
  {
    return this.a.getResources().getDimensionPixelSize(e.b);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.h.a
 * JD-Core Version:    0.6.2
 */