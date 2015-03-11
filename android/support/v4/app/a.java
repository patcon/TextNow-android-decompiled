package android.support.v4.app;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.m;
import android.view.MenuItem;
import android.view.View;

@Deprecated
public class a
  implements m
{
  private static final b a = new c((byte)0);
  private final Activity b;
  private final f c;
  private final DrawerLayout d;
  private boolean e = true;
  private boolean f;
  private Drawable g;
  private Drawable h;
  private h i;
  private final int j;
  private final int k;
  private final int l;
  private Object m;

  static
  {
    int n = Build.VERSION.SDK_INT;
    if (n >= 18)
    {
      a = new e((byte)0);
      return;
    }
    if (n >= 11)
    {
      a = new d((byte)0);
      return;
    }
  }

  public a(Activity paramActivity, DrawerLayout paramDrawerLayout, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  private a(Activity paramActivity, DrawerLayout paramDrawerLayout, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramActivity;
    h localh;
    if ((paramActivity instanceof g))
    {
      this.c = ((g)paramActivity).a();
      this.d = paramDrawerLayout;
      this.j = paramInt1;
      this.k = paramInt2;
      this.l = paramInt3;
      this.g = c();
      this.h = android.support.v4.content.c.a(paramActivity, paramInt1);
      this.i = new h(this, this.h, (byte)0);
      localh = this.i;
      if (!paramBoolean)
        break label122;
    }
    label122: for (float f1 = 0.3333333F; ; f1 = 0.0F)
    {
      localh.b(f1);
      return;
      this.c = null;
      break;
    }
  }

  private void a(int paramInt)
  {
    if (this.c != null)
      return;
    this.m = a.a(this.m, this.b, paramInt);
  }

  private void a(Drawable paramDrawable, int paramInt)
  {
    if (this.c != null)
    {
      this.c.a(paramDrawable);
      return;
    }
    this.m = a.a(this.m, this.b, paramDrawable, paramInt);
  }

  private Drawable c()
  {
    if (this.c != null)
      return this.c.a();
    return a.a(this.b);
  }

  public final void a()
  {
    h localh;
    if (this.d.e(8388611))
    {
      this.i.a(1.0F);
      if (this.e)
      {
        localh = this.i;
        if (!this.d.e(8388611))
          break label67;
      }
    }
    label67: for (int n = this.l; ; n = this.k)
    {
      a(localh, n);
      return;
      this.i.a(0.0F);
      break;
    }
  }

  public final void a(float paramFloat)
  {
    float f1 = this.i.a();
    if (paramFloat > 0.5F);
    for (float f2 = Math.max(f1, 2.0F * Math.max(0.0F, paramFloat - 0.5F)); ; f2 = Math.min(f1, paramFloat * 2.0F))
    {
      this.i.a(f2);
      return;
    }
  }

  public void a(View paramView)
  {
    this.i.a(1.0F);
    if (this.e)
      a(this.l);
  }

  public final void a(boolean paramBoolean)
  {
    int n;
    if (paramBoolean != this.e)
    {
      if (!paramBoolean)
        break label54;
      h localh = this.i;
      if (!this.d.e(8388611))
        break label46;
      n = this.l;
      a(localh, n);
    }
    while (true)
    {
      this.e = paramBoolean;
      return;
      label46: n = this.k;
      break;
      label54: a(this.g, 0);
    }
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem != null) && (paramMenuItem.getItemId() == 16908332) && (this.e))
    {
      if (this.d.f(8388611))
        this.d.d(8388611);
      while (true)
      {
        return true;
        this.d.c(8388611);
      }
    }
    return false;
  }

  public final void b()
  {
    if (!this.f)
      this.g = c();
    this.h = android.support.v4.content.c.a(this.b, this.j);
    a();
  }

  public void b(View paramView)
  {
    this.i.a(0.0F);
    if (this.e)
      a(this.k);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.a
 * JD-Core Version:    0.6.2
 */