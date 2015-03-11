package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

class q extends ActionBar
{
  final Activity a;
  final a b;
  final android.app.ActionBar c;
  private ArrayList<WeakReference<ActionBarImplICS.OnMenuVisibilityListenerWrapper>> d = new ArrayList();

  public q(Activity paramActivity, a parama)
  {
    this(paramActivity, parama, true);
  }

  q(Activity paramActivity, a parama, boolean paramBoolean)
  {
    this.a = paramActivity;
    this.b = parama;
    this.c = paramActivity.getActionBar();
    if ((paramBoolean) && ((0x4 & a()) != 0))
      c(true);
  }

  public int a()
  {
    return this.c.getDisplayOptions();
  }

  public void a(int paramInt)
  {
    this.c.setTitle(paramInt);
  }

  public void a(CharSequence paramCharSequence)
  {
    this.c.setTitle(paramCharSequence);
  }

  public void a(boolean paramBoolean)
  {
    this.c.setDisplayShowHomeEnabled(paramBoolean);
  }

  public int b()
  {
    return this.c.getHeight();
  }

  public void b(boolean paramBoolean)
  {
    this.c.setDisplayHomeAsUpEnabled(paramBoolean);
  }

  public Context c()
  {
    return this.c.getThemedContext();
  }

  public void c(boolean paramBoolean)
  {
    this.c.setHomeButtonEnabled(paramBoolean);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.q
 * JD-Core Version:    0.6.2
 */