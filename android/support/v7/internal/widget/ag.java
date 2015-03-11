package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListAdapter;

final class ag
  implements DialogInterface.OnClickListener, aj
{
  private AlertDialog b;
  private ListAdapter c;
  private CharSequence d;

  private ag(SpinnerCompat paramSpinnerCompat)
  {
  }

  public final void a()
  {
    if (this.b != null)
    {
      this.b.dismiss();
      this.b = null;
    }
  }

  public final void a(ListAdapter paramListAdapter)
  {
    this.c = paramListAdapter;
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
  }

  public final boolean b()
  {
    if (this.b != null)
      return this.b.isShowing();
    return false;
  }

  public final void c()
  {
    if (this.c == null)
      return;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a.getContext());
    if (this.d != null)
      localBuilder.setTitle(this.d);
    this.b = localBuilder.setSingleChoiceItems(this.c, this.a.d(), this).create();
    this.b.show();
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a(paramInt);
    if (this.a.s != null)
      this.a.a(null, paramInt, this.c.getItemId(paramInt));
    a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ag
 * JD-Core Version:    0.6.2
 */