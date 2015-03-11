package com.enflick.android.TextNow.activities;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.enflick.android.TextNow.tasks.SendPasswordResetEmailTask;
import com.enflick.android.TextNow.tasks.c;

public class ForgotPasswordActivity extends an
{
  private EditText a;
  private Button b;
  private String c = "";

  protected final void a(c paramc)
  {
    super.a(paramc);
    int i;
    String str;
    if (paramc.getClass() == SendPasswordResetEmailTask.class)
    {
      boolean bool = paramc.h();
      i = paramc.i();
      str = paramc.j();
      v();
      if (bool)
        break label44;
      showDialog(1);
    }
    label44: 
    do
    {
      return;
      if (i == 400)
      {
        b(2131296503);
        return;
      }
    }
    while (c(str));
    b(2131296432);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903134);
    d(true);
    this.a = ((EditText)findViewById(2131558748));
    this.b = ((Button)findViewById(2131558749));
    this.b.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        ForgotPasswordActivity.a(ForgotPasswordActivity.this);
      }
    });
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return super.onCreateDialog(paramInt);
    case 1:
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ("\n" + this.c);
    return localBuilder.setMessage(getString(2131296502, arrayOfObject)).setPositiveButton(2131296427, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        ForgotPasswordActivity.this.finish();
      }
    }).create();
  }

  protected void onStart()
  {
    super.onStart();
    this.a.requestFocus();
    ((InputMethodManager)getSystemService("input_method")).showSoftInput(this.a, 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ForgotPasswordActivity
 * JD-Core Version:    0.6.2
 */