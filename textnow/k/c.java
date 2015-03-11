package textnow.k;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v7.internal.view.menu.z;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import textnow.l.a;

@TargetApi(11)
public final class c extends ActionMode
{
  final MenuInflater a;
  final a b;

  public c(Context paramContext, a parama)
  {
    this.b = parama;
    this.a = new e(paramContext);
  }

  public final void finish()
  {
    this.b.b();
  }

  public final View getCustomView()
  {
    return this.b.h();
  }

  public final Menu getMenu()
  {
    return z.a(this.b.a());
  }

  public final MenuInflater getMenuInflater()
  {
    return this.a;
  }

  public final CharSequence getSubtitle()
  {
    return this.b.f();
  }

  public final Object getTag()
  {
    return this.b.i();
  }

  public final CharSequence getTitle()
  {
    return this.b.e();
  }

  public final boolean getTitleOptionalHint()
  {
    return this.b.j();
  }

  public final void invalidate()
  {
    this.b.c();
  }

  public final boolean isTitleOptional()
  {
    return this.b.g();
  }

  public final void setCustomView(View paramView)
  {
    this.b.a(paramView);
  }

  public final void setSubtitle(int paramInt)
  {
    this.b.b(paramInt);
  }

  public final void setSubtitle(CharSequence paramCharSequence)
  {
    this.b.a(paramCharSequence);
  }

  public final void setTag(Object paramObject)
  {
    this.b.a(paramObject);
  }

  public final void setTitle(int paramInt)
  {
    this.b.a(paramInt);
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    this.b.b(paramCharSequence);
  }

  public final void setTitleOptionalHint(boolean paramBoolean)
  {
    this.b.a(paramBoolean);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.k.c
 * JD-Core Version:    0.6.2
 */