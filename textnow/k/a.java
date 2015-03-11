package textnow.k;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.bi;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import textnow.g.b;
import textnow.g.c;
import textnow.g.e;
import textnow.g.h;
import textnow.g.l;

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
    return this.a.getResources().getInteger(h.a);
  }

  public final boolean b()
  {
    if (Build.VERSION.SDK_INT >= 19);
    while (!bi.b(ViewConfiguration.get(this.a)))
      return true;
    return false;
  }

  public final int c()
  {
    return this.a.getResources().getDisplayMetrics().widthPixels / 2;
  }

  public final boolean d()
  {
    if (this.a.getApplicationInfo().targetSdkVersion >= 16)
      return this.a.getResources().getBoolean(c.a);
    return this.a.getResources().getBoolean(c.b);
  }

  public final int e()
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(null, l.a, b.c, 0);
    int i = localTypedArray.getLayoutDimension(l.l, 0);
    Resources localResources = this.a.getResources();
    if (!d())
      i = Math.min(i, localResources.getDimensionPixelSize(e.a));
    localTypedArray.recycle();
    return i;
  }

  public final boolean f()
  {
    return this.a.getApplicationInfo().targetSdkVersion < 14;
  }

  public final int g()
  {
    return this.a.getResources().getDimensionPixelSize(e.b);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.k.a
 * JD-Core Version:    0.6.2
 */