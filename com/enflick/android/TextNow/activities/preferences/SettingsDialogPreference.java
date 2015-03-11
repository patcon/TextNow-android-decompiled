package com.enflick.android.TextNow.activities.preferences;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.enflick.android.TextNow.activities.MainActivity;
import textnow.u.r;

public abstract class SettingsDialogPreference extends DialogPreference
{
  protected MainActivity a;
  protected r b;
  private boolean c = false;
  private Dialog d;

  public SettingsDialogPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = ((MainActivity)paramContext);
    this.b = new r(this.a);
    setPersistent(false);
  }

  protected abstract boolean a();

  public final void b(boolean paramBoolean)
  {
    this.c = paramBoolean;
    if (paramBoolean)
    {
      this.a.a(this.a.getString(2131493022), false);
      return;
    }
    this.a.r();
  }

  public final boolean b()
  {
    return this.c;
  }

  public void onActivityDestroy()
  {
    if ((this.d == null) || (!this.d.isShowing()))
      return;
    this.d.dismiss();
  }

  protected View onCreateDialogView()
  {
    if (getDialogLayoutResource() == 0)
      return null;
    return LayoutInflater.from(getContext()).inflate(getDialogLayoutResource(), null);
  }

  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.d = null;
  }

  protected void showDialog(Bundle paramBundle)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getContext()).setTitle(getDialogTitle()).setIcon(getDialogIcon()).setPositiveButton(getPositiveButtonText(), null).setNegativeButton(getNegativeButtonText(), null);
    View localView = onCreateDialogView();
    if (localView != null)
    {
      onBindDialogView(localView);
      localBuilder.setView(localView);
    }
    onPrepareDialogBuilder(localBuilder);
    AlertDialog localAlertDialog = localBuilder.create();
    this.d = localAlertDialog;
    DialogInterface.OnShowListener local1 = new DialogInterface.OnShowListener()
    {
      public final void onShow(final DialogInterface paramAnonymousDialogInterface)
      {
        ((AlertDialog)paramAnonymousDialogInterface).getButton(-1).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymous2View)
          {
            if (SettingsDialogPreference.this.a())
              paramAnonymousDialogInterface.dismiss();
          }
        });
      }
    };
    localAlertDialog.setOnDismissListener(this);
    localAlertDialog.setOnShowListener(local1);
    localAlertDialog.show();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.SettingsDialogPreference
 * JD-Core Version:    0.6.2
 */