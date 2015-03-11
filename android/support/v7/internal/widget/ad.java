package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListAdapter;

final class ad
  implements DialogInterface.OnClickListener, ag
{
  private AlertDialog b;
  private ListAdapter c;
  private CharSequence d;

  private ad(ac paramac)
  {
  }

  public final void a(ListAdapter paramListAdapter)
  {
    this.c = paramListAdapter;
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
  }

  public final void c()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a.getContext());
    if (this.d != null)
      localBuilder.setTitle(this.d);
    this.b = localBuilder.setSingleChoiceItems(this.c, this.a.d(), this).show();
  }

  public final void d()
  {
    this.b.dismiss();
    this.b = null;
  }

  public final boolean f()
  {
    if (this.b != null)
      return this.b.isShowing();
    return false;
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a(paramInt);
    if (this.a.t != null)
      this.a.a(null, paramInt, this.c.getItemId(paramInt));
    d();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ad
 * JD-Core Version:    0.6.2
 */