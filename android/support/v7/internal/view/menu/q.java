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
import textnow.g.h;
import textnow.g.j;

public class q
  implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, ab
{
  private n a;
  l b;
  private AlertDialog c;
  private ab d;

  public q(n paramn)
  {
    this.a = paramn;
  }

  public final void a()
  {
    if (this.c != null)
      this.c.dismiss();
  }

  public final void a(IBinder paramIBinder)
  {
    n localn = this.a;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localn.d());
    this.b = new l(h.n, j.b);
    this.b.a(this);
    this.a.a(this.b);
    localBuilder.setAdapter(this.b.a(), this);
    View localView = localn.p();
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
      localBuilder.setIcon(localn.o()).setTitle(localn.n());
    }
  }

  public final void a(n paramn, boolean paramBoolean)
  {
    if ((paramBoolean) || (paramn == this.a))
      a();
    if (this.d != null)
      this.d.a(paramn, paramBoolean);
  }

  public final boolean b(n paramn)
  {
    if (this.d != null)
      return this.d.b(paramn);
    return false;
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a((r)this.b.a().getItem(paramInt), 0);
  }

  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.b.a(this.a, true);
  }

  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
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
              this.a.a(true);
              paramDialogInterface.dismiss();
              return true;
            }
          }
        }
      }
    return this.a.performShortcut(paramInt, paramKeyEvent, 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.q
 * JD-Core Version:    0.6.2
 */