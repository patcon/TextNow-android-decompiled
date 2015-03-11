package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;

public class gz
  implements DialogInterface.OnClickListener
{
  private final Fragment FV;
  private final int FW;
  private final Intent mIntent;
  private final Activity og;

  public gz(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    this.og = paramActivity;
    this.FV = null;
    this.mIntent = paramIntent;
    this.FW = paramInt;
  }

  public gz(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    this.og = null;
    this.FV = paramFragment;
    this.mIntent = paramIntent;
    this.FW = paramInt;
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      if ((this.mIntent != null) && (this.FV != null))
        this.FV.startActivityForResult(this.mIntent, this.FW);
      while (true)
      {
        paramDialogInterface.dismiss();
        return;
        if (this.mIntent != null)
          this.og.startActivityForResult(this.mIntent, this.FW);
      }
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gz
 * JD-Core Version:    0.6.2
 */