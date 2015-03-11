package com.enflick.android.TextNow.activities;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.enflick.android.TextNow.tasks.AssignPhoneNumberTask;
import com.enflick.android.TextNow.tasks.c;
import textnow.u.r;

public class AreaCodeActivity extends ah
{
  private EditText b;
  private Button c;

  public static void a(Activity paramActivity, int paramInt, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramActivity, AreaCodeActivity.class);
    if (paramBoolean)
      localIntent.putExtra("extra_expire_dialog", true);
    paramActivity.startActivityForResult(localIntent, paramInt);
  }

  protected final void a(c paramc)
  {
    super.a(paramc);
    String str;
    if (paramc.getClass() == AssignPhoneNumberTask.class)
    {
      boolean bool = paramc.h();
      paramc.i();
      str = paramc.j();
      r();
      if (bool)
        break label48;
      setResult(-1);
      finish();
    }
    label48: 
    while (c(str))
      return;
    c(2131493025);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903066);
    b(false);
    this.b = ((EditText)findViewById(2131165287));
    this.b.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if (paramAnonymousInt == 6)
        {
          AreaCodeActivity.a(AreaCodeActivity.this);
          return true;
        }
        return false;
      }
    });
    this.c = ((Button)findViewById(2131165288));
    this.c.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AreaCodeActivity.a(AreaCodeActivity.this);
      }
    });
    if (getIntent().getBooleanExtra("extra_expire_dialog", false))
      showDialog(1);
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return super.onCreateDialog(paramInt);
    case 1:
    }
    return new AlertDialog.Builder(this).setTitle(2131493092).setMessage(2131493093).setPositiveButton(2131493020, null).setCancelable(false).create();
  }

  protected void onResume()
  {
    super.onResume();
    if (!TextUtils.isEmpty(new r(this).c()))
    {
      setResult(-1);
      finish();
    }
  }

  protected void onStart()
  {
    super.onStart();
    this.b.requestFocus();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.AreaCodeActivity
 * JD-Core Version:    0.6.2
 */