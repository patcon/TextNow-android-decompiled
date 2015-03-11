package android.support.v7.app;

import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.support.v7.internal.widget.y;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import textnow.g.f;

final class o extends m
  implements y
{
  final NativeActionModeAwareLayout e;
  private ActionMode f;

  public o(d paramd, a parama)
  {
    super(paramd, parama);
    this.e = ((NativeActionModeAwareLayout)paramd.findViewById(f.e));
    if (this.e != null)
      this.e.a(this);
  }

  public final ActionMode.Callback a(ActionMode.Callback paramCallback)
  {
    return new p(this, paramCallback);
  }

  final boolean g()
  {
    return (this.f == null) && (super.g());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.o
 * JD-Core Version:    0.6.2
 */