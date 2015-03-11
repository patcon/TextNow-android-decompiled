package com.enflick.android.TextNow.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.tasks.AssignPhoneNumberTask;
import com.enflick.android.TextNow.tasks.CheckUsernameAvailabilityTask;
import com.enflick.android.TextNow.tasks.FacebookCreateTask;
import com.enflick.android.TextNow.views.UserNameEditText;
import java.util.Locale;
import textnow.q.b;
import textnow.q.l;

public class AreaCodeUsernameActivity extends ah
{
  private EditText b;
  private UserNameEditText c;
  private Button d;
  private boolean e = false;

  public static void a(Activity paramActivity, int paramInt)
  {
    paramActivity.startActivityForResult(new Intent(paramActivity, AreaCodeUsernameActivity.class), 3);
  }

  private void g()
  {
    this.c.g();
    if (!this.c.c())
    {
      if (this.c.d())
      {
        this.e = true;
        a(2131493054, false);
        return;
      }
      r();
      return;
    }
    if (b.c(this.b.getText().toString().trim()))
    {
      a(2131493021, false);
      new FacebookCreateTask(this.c.toString().toLowerCase(Locale.ENGLISH)).b(this);
      return;
    }
    c(2131493091);
  }

  protected final void a(com.enflick.android.TextNow.tasks.c paramc)
  {
    super.a(paramc);
    String str3;
    if (paramc.getClass() == AssignPhoneNumberTask.class)
    {
      boolean bool3 = paramc.h();
      paramc.i();
      str3 = paramc.j();
      r();
      if (!bool3)
      {
        setResult(-1);
        finish();
        a.b("create_fb_account");
      }
    }
    label54: label242: String str1;
    do
    {
      do
      {
        String str2;
        do
        {
          int i;
          do
          {
            break label54;
            break label54;
            do
              return;
            while (c(str3));
            c(2131493025);
            return;
            if (paramc.getClass() != CheckUsernameAvailabilityTask.class)
              break label242;
            boolean bool2 = paramc.h();
            i = paramc.i();
            str2 = paramc.j();
            r();
            if (!bool2)
            {
              this.e = false;
              this.c.a(com.enflick.android.TextNow.views.c.a);
              this.c.b(false);
              c(2131493074);
              return;
            }
            if (i != 404)
              break;
            this.c.a(com.enflick.android.TextNow.views.c.c);
            this.c.b(true);
            this.c.a(false);
          }
          while (!this.e);
          this.e = false;
          g();
          return;
          this.e = false;
          this.c.a(com.enflick.android.TextNow.views.c.a);
          this.c.b(false);
          if (i == 400)
          {
            c(2131493078);
            return;
          }
        }
        while (c(str2));
        c(2131493025);
        return;
      }
      while (paramc.getClass() != FacebookCreateTask.class);
      boolean bool1 = paramc.h();
      paramc.i();
      str1 = paramc.j();
      if (!bool1)
      {
        new AssignPhoneNumberTask(this.b.getText().toString().trim()).b(this);
        return;
      }
      r();
    }
    while (c(str1));
    c(2131493025);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903067);
    b(true);
    setTitle(2131493047);
    this.c = ((UserNameEditText)findViewById(2131165289));
    this.c.a(l.b);
    this.b = ((EditText)findViewById(2131165287));
    this.b.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if (paramAnonymousInt == 6)
        {
          AreaCodeUsernameActivity.a(AreaCodeUsernameActivity.this);
          return true;
        }
        return false;
      }
    });
    this.d = ((Button)findViewById(2131165288));
    this.d.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AreaCodeUsernameActivity.a(AreaCodeUsernameActivity.this);
      }
    });
  }

  protected void onStart()
  {
    super.onStart();
    this.c.requestFocus();
    ((InputMethodManager)getSystemService("input_method")).showSoftInput(this.b, 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.AreaCodeUsernameActivity
 * JD-Core Version:    0.6.2
 */