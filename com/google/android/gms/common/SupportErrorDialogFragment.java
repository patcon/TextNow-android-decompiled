package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.t;
import android.support.v4.app.y;
import com.google.android.gms.internal.hm;

public class SupportErrorDialogFragment extends t
{
  private DialogInterface.OnCancelListener CU = null;
  private Dialog mDialog = null;

  public static SupportErrorDialogFragment newInstance(Dialog paramDialog)
  {
    return newInstance(paramDialog, null);
  }

  public static SupportErrorDialogFragment newInstance(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    SupportErrorDialogFragment localSupportErrorDialogFragment = new SupportErrorDialogFragment();
    Dialog localDialog = (Dialog)hm.b(paramDialog, "Cannot display null dialog");
    localDialog.setOnCancelListener(null);
    localDialog.setOnDismissListener(null);
    localSupportErrorDialogFragment.mDialog = localDialog;
    if (paramOnCancelListener != null)
      localSupportErrorDialogFragment.CU = paramOnCancelListener;
    return localSupportErrorDialogFragment;
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.CU != null)
      this.CU.onCancel(paramDialogInterface);
  }

  public Dialog onCreateDialog(Bundle paramBundle)
  {
    if (this.mDialog == null)
      setShowsDialog(false);
    return this.mDialog;
  }

  public void show(y paramy, String paramString)
  {
    super.show(paramy, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.SupportErrorDialogFragment
 * JD-Core Version:    0.6.2
 */