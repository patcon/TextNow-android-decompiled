package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;

public class c
  implements DialogInterface.OnClickListener
{
  private final Fragment Lt;
  private final int Lu;
  private final Intent mIntent;
  private final Activity nr;

  public c(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    this.nr = paramActivity;
    this.Lt = null;
    this.mIntent = paramIntent;
    this.Lu = paramInt;
  }

  public c(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    this.nr = null;
    this.Lt = paramFragment;
    this.mIntent = paramIntent;
    this.Lu = paramInt;
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      if ((this.mIntent != null) && (this.Lt != null))
        this.Lt.startActivityForResult(this.mIntent, this.Lu);
      while (true)
      {
        paramDialogInterface.dismiss();
        return;
        if (this.mIntent != null)
          this.nr.startActivityForResult(this.mIntent, this.Lu);
      }
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.c
 * JD-Core Version:    0.6.2
 */