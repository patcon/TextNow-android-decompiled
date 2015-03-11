package android.support.v7.internal.view.menu;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ListAdapter;
import textnow.g.k;

public final class l
  implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, w
{
  g a;
  private i b;
  private AlertDialog c;
  private w d;

  public l(i parami)
  {
    this.b = parami;
  }

  public final void a(IBinder paramIBinder)
  {
    i locali = this.b;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(locali.d());
    this.a = new g(textnow.g.i.j, k.b);
    this.a.a(this);
    this.b.a(this.a);
    localBuilder.setAdapter(this.a.a(), this);
    View localView = locali.p();
    if (localView != null)
      localBuilder.setCustomTitle(localView);
    while (true)
    {
      localBuilder.setOnKeyListener(this);
      this.c = localBuilder.create();
      this.c.setOnDismissListener(this);
      WindowManager.LayoutParams localLayoutParams = this.c.getWindow().getAttributes();
      localLayoutParams.type = 1003;
      localLayoutParams.flags = (0x20000 | localLayoutParams.flags);
      this.c.show();
      return;
      localBuilder.setIcon(locali.o()).setTitle(locali.n());
    }
  }

  public final void a(i parami, boolean paramBoolean)
  {
    if (((paramBoolean) || (parami == this.b)) && (this.c != null))
      this.c.dismiss();
    if (this.d != null)
      this.d.a(parami, paramBoolean);
  }

  public final boolean a(i parami)
  {
    if (this.d != null)
      return this.d.a(parami);
    return false;
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.a((m)this.a.a().getItem(paramInt), 0);
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    this.a.a(this.b, true);
  }

  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) || (paramInt == 4))
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        Window localWindow2 = this.c.getWindow();
        if (localWindow2 != null)
        {
          View localView2 = localWindow2.getDecorView();
          if (localView2 != null)
          {
            KeyEvent.DispatcherState localDispatcherState2 = localView2.getKeyDispatcherState();
            if (localDispatcherState2 != null)
            {
              localDispatcherState2.startTracking(paramKeyEvent, this);
              return true;
            }
          }
        }
      }
      else if ((paramKeyEvent.getAction() == 1) && (!paramKeyEvent.isCanceled()))
      {
        Window localWindow1 = this.c.getWindow();
        if (localWindow1 != null)
        {
          View localView1 = localWindow1.getDecorView();
          if (localView1 != null)
          {
            KeyEvent.DispatcherState localDispatcherState1 = localView1.getKeyDispatcherState();
            if ((localDispatcherState1 != null) && (localDispatcherState1.isTracking(paramKeyEvent)))
            {
              this.b.a(true);
              paramDialogInterface.dismiss();
              return true;
            }
          }
        }
      }
    return this.b.performShortcut(paramInt, paramKeyEvent, 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.l
 * JD-Core Version:    0.6.2
 */