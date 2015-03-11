package textnow.l;

import android.view.Menu;
import android.view.View;

public abstract class a
{
  private Object a;
  private boolean b;

  public abstract Menu a();

  public abstract void a(int paramInt);

  public abstract void a(View paramView);

  public abstract void a(CharSequence paramCharSequence);

  public final void a(Object paramObject)
  {
    this.a = paramObject;
  }

  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public abstract void b();

  public abstract void b(int paramInt);

  public abstract void b(CharSequence paramCharSequence);

  public abstract void c();

  public abstract CharSequence e();

  public abstract CharSequence f();

  public boolean g()
  {
    return false;
  }

  public abstract View h();

  public final Object i()
  {
    return this.a;
  }

  public final boolean j()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.l.a
 * JD-Core Version:    0.6.2
 */