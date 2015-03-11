package com.enflick.android.TextNow.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import textnow.q.b;
import textnow.u.r;
import textnow.u.s;

public class ShowNewUserDialogActivity extends Activity
{
  private ShowNewUserDialogActivity a = this;
  private boolean b = false;

  @SuppressLint({"NewApi"})
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    s locals = new s(this);
    if ((locals.a()) || (locals.e()))
      return;
    AlertDialog.Builder localBuilder;
    if (Build.VERSION.SDK_INT >= 11)
    {
      localBuilder = new AlertDialog.Builder(this, 2);
      locals.a(false);
      locals.n();
      localBuilder.setTitle(2131493387).setIcon(2130838031).setCancelable(false).setPositiveButton(2131493020, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          Intent localIntent = new Intent(ShowNewUserDialogActivity.a(ShowNewUserDialogActivity.this), WelcomeActivity.class);
          localIntent.addFlags(268435456);
          if (ShowNewUserDialogActivity.b(ShowNewUserDialogActivity.this))
            localIntent.setAction("action_create_account");
          ShowNewUserDialogActivity.this.startActivity(localIntent);
          ShowNewUserDialogActivity.a(ShowNewUserDialogActivity.this).finish();
        }
      }).setNegativeButton(2131493036, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          ShowNewUserDialogActivity.a(ShowNewUserDialogActivity.this).finish();
        }
      });
      if (!locals.d())
        break label191;
      String str1 = new r(this).c();
      if (str1 == null)
        break label181;
      String str2 = getResources().getString(2131493391);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = b.f(str1);
      localBuilder.setMessage(String.format(str2, arrayOfObject));
    }
    while (true)
    {
      localBuilder.create().show();
      return;
      localBuilder = new AlertDialog.Builder(this);
      break;
      label181: localBuilder.setMessage(2131493392);
      continue;
      label191: if (locals.c())
      {
        localBuilder.setMessage(2131493390);
      }
      else if (locals.b())
      {
        localBuilder.setMessage(2131493389);
        this.b = true;
      }
      else
      {
        localBuilder.setMessage(2131493388);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ShowNewUserDialogActivity
 * JD-Core Version:    0.6.2
 */