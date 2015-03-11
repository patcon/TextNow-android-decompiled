package android.support.v7.app;

import android.annotation.TargetApi;
import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.support.v7.internal.widget.z;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.View;
import textnow.k.c;
import textnow.k.d;
import textnow.l.a;

@TargetApi(11)
final class h extends ActionBarActivityDelegateBase
  implements z
{
  private NativeActionModeAwareLayout k;

  h(b paramb)
  {
    super(paramb);
  }

  public final ActionMode a(View paramView, ActionMode.Callback paramCallback)
  {
    a locala = a(new d(paramView.getContext(), paramCallback));
    if (locala != null)
      return new c(this.a, locala);
    return null;
  }

  final boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }

  final void m()
  {
    this.k = ((NativeActionModeAwareLayout)this.a.findViewById(16908290));
    if (this.k != null)
      this.k.a(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.h
 * JD-Core Version:    0.6.2
 */