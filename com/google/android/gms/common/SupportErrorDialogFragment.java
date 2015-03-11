package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.i;
import android.support.v4.app.n;
import com.google.android.gms.common.internal.o;

public class SupportErrorDialogFragment extends i
{
  private DialogInterface.OnCancelListener HG = null;
  private Dialog mDialog = null;

  public static SupportErrorDialogFragment newInstance(Dialog paramDialog)
  {
    return newInstance(paramDialog, null);
  }

  public static SupportErrorDialogFragment newInstance(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    SupportErrorDialogFragment localSupportErrorDialogFragment = new SupportErrorDialogFragment();
    Dialog localDialog = (Dialog)o.b(paramDialog, "Cannot display null dialog");
    localDialog.setOnCancelListener(null);
    localDialog.setOnDismissListener(null);
    localSupportErrorDialogFragment.mDialog = localDialog;
    if (paramOnCancelListener != null)
      localSupportErrorDialogFragment.HG = paramOnCancelListener;
    return localSupportErrorDialogFragment;
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.HG != null)
      this.HG.onCancel(paramDialogInterface);
  }

  public Dialog onCreateDialog(Bundle paramBundle)
  {
    if (this.mDialog == null)
      setShowsDialog(false);
    return this.mDialog;
  }

  public void show(n paramn, String paramString)
  {
    super.show(paramn, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.SupportErrorDialogFragment
 * JD-Core Version:    0.6.2
 */