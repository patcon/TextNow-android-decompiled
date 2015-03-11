package com.enflick.android.TextNow.activities;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.i;

final class j extends i
{
  public final Dialog onCreateDialog(Bundle paramBundle)
  {
    return new AlertDialog.Builder(getActivity()).setTitle("Choose ESN").setItems(new String[] { "ALREADY_ACTIVE", "NOT_SPRINT_DEVICE", "ESN_NOT_VALID", "NOT_TRANSFERRABLE", "CHARGE_DECLINED", "INVALID_ICCID", "ICCID_MISSING", "DEFAULT" }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        switch (paramAnonymousInt)
        {
        default:
          textnow.v.b.a = null;
          return;
        case 0:
          textnow.v.b.a = "1234504";
          return;
        case 1:
          textnow.v.b.a = "1234515";
          return;
        case 2:
          textnow.v.b.a = "1234535";
          return;
        case 3:
          textnow.v.b.a = "1234532";
          return;
        case 4:
          textnow.v.b.a = "9876541";
          return;
        case 5:
          textnow.v.b.a = "9876542";
          return;
        case 6:
        }
        textnow.v.b.a = "9876543";
      }
    }).create();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.j
 * JD-Core Version:    0.6.2
 */