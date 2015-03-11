package android.support.v4.view;

import android.content.Context;
import android.view.View;

public abstract class j
{
  private final Context a;
  private k b;
  private l c;

  public final Context a()
  {
    return this.a;
  }

  public final void a(k paramk)
  {
    this.b = paramk;
  }

  public final void a(l paraml)
  {
    if ((this.c != null) && (paraml != null))
      new StringBuilder().append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ").append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?").toString();
    this.c = paraml;
  }

  public final void a(boolean paramBoolean)
  {
    if (this.b != null)
      this.b.a(paramBoolean);
  }

  public abstract View b();

  public final void c()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.j
 * JD-Core Version:    0.6.2
 */