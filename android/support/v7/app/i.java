package android.support.v7.app;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class i
  implements android.support.v4.widget.p
{
  private final j a;
  private final DrawerLayout b;
  private m c;
  private Drawable d;
  private boolean e = true;
  private boolean f;
  private final int g;
  private final int h;

  public i(Activity paramActivity, DrawerLayout paramDrawerLayout, int paramInt1, int paramInt2)
  {
    this(paramActivity, null, paramDrawerLayout, null, paramInt1, paramInt2);
  }

  private <T extends Drawable,  extends m> i(Activity paramActivity, Toolbar paramToolbar, DrawerLayout paramDrawerLayout, T paramT, int paramInt1, int paramInt2)
  {
    if ((paramActivity instanceof k))
      this.a = ((k)paramActivity).a();
    while (true)
    {
      this.b = paramDrawerLayout;
      this.g = paramInt1;
      this.h = paramInt2;
      this.c = new l(paramActivity, this.a.b());
      this.d = d();
      return;
      if ((paramActivity instanceof q))
        this.a = ((q)paramActivity).e();
      else if (Build.VERSION.SDK_INT >= 18)
        this.a = new p(paramActivity, (byte)0);
      else if (Build.VERSION.SDK_INT >= 11)
        this.a = new o(paramActivity, (byte)0);
      else
        this.a = new n(paramActivity);
    }
  }

  private void a(int paramInt)
  {
    this.a.a(paramInt);
  }

  private void a(Drawable paramDrawable, int paramInt)
  {
    this.a.a(paramDrawable, paramInt);
  }

  private void c()
  {
    if (this.b.f(8388611))
    {
      this.b.d(8388611);
      return;
    }
    this.b.c(8388611);
  }

  private Drawable d()
  {
    return this.a.a();
  }

  public final void a()
  {
    Drawable localDrawable;
    if (this.b.e(8388611))
    {
      this.c.a(1.0F);
      if (this.e)
      {
        localDrawable = (Drawable)this.c;
        if (!this.b.e(8388611))
          break label74;
      }
    }
    label74: for (int i = this.h; ; i = this.g)
    {
      a(localDrawable, i);
      return;
      this.c.a(0.0F);
      break;
    }
  }

  public final void a(float paramFloat)
  {
    this.c.a(Math.min(1.0F, Math.max(0.0F, paramFloat)));
  }

  public void a(View paramView)
  {
    this.c.a(1.0F);
    if (this.e)
      a(this.h);
  }

  public final void a(boolean paramBoolean)
  {
    int i;
    if (paramBoolean != this.e)
    {
      if (!paramBoolean)
        break label57;
      Drawable localDrawable = (Drawable)this.c;
      if (!this.b.e(8388611))
        break label49;
      i = this.h;
      a(localDrawable, i);
    }
    while (true)
    {
      this.e = paramBoolean;
      return;
      label49: i = this.g;
      break;
      label57: a(this.d, 0);
    }
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem != null) && (paramMenuItem.getItemId() == 16908332) && (this.e))
    {
      c();
      return true;
    }
    return false;
  }

  public final void b()
  {
    if (!this.f)
      this.d = d();
    a();
  }

  public void b(View paramView)
  {
    this.c.a(0.0F);
    if (this.e)
      a(this.g);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.i
 * JD-Core Version:    0.6.2
 */