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
import com.enflick.android.TextNow.tasks.AssignPhoneNumberTask;
import com.enflick.android.TextNow.tasks.CheckUsernameAvailabilityTask;
import com.enflick.android.TextNow.tasks.FacebookCreateTask;
import com.enflick.android.TextNow.tasks.c;
import com.enflick.android.TextNow.views.UserNameEditText;
import com.enflick.android.TextNow.views.d;
import java.util.Locale;
import textnow.v.l;

public class AreaCodeUsernameActivity extends an
{
  private EditText a;
  private UserNameEditText b;
  private Button c;
  private boolean d = false;

  public static void a(Activity paramActivity, int paramInt)
  {
    paramActivity.startActivityForResult(new Intent(paramActivity, AreaCodeUsernameActivity.class), 3);
  }

  private void g()
  {
    this.b.g();
    if (!this.b.c())
    {
      if (this.b.d())
      {
        this.d = true;
        a(2131296461, false);
        return;
      }
      v();
      return;
    }
    if (textnow.v.b.c(this.a.getText().toString().trim()))
    {
      a(2131296428, false);
      new FacebookCreateTask(this.b.toString().toLowerCase(Locale.ENGLISH)).b(this);
      return;
    }
    b(2131296498);
  }

  protected final void a(c paramc)
  {
    super.a(paramc);
    String str3;
    if (paramc.getClass() == AssignPhoneNumberTask.class)
    {
      boolean bool3 = paramc.h();
      paramc.i();
      str3 = paramc.j();
      v();
      if (!bool3)
      {
        setResult(-1);
        finish();
        com.enflick.android.TextNow.ads.b.b("create_fb_account");
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
            b(2131296432);
            return;
            if (paramc.getClass() != CheckUsernameAvailabilityTask.class)
              break label242;
            boolean bool2 = paramc.h();
            i = paramc.i();
            str2 = paramc.j();
            v();
            if (!bool2)
            {
              this.d = false;
              this.b.a(d.a);
              this.b.b(false);
              b(2131296481);
              return;
            }
            if (i != 404)
              break;
            this.b.a(d.c);
            this.b.b(true);
            this.b.a(false);
          }
          while (!this.d);
          this.d = false;
          g();
          return;
          this.d = false;
          this.b.a(d.a);
          this.b.b(false);
          if (i == 400)
          {
            b(2131296485);
            return;
          }
        }
        while (c(str2));
        b(2131296432);
        return;
      }
      while (paramc.getClass() != FacebookCreateTask.class);
      boolean bool1 = paramc.h();
      paramc.i();
      str1 = paramc.j();
      if (!bool1)
      {
        new AssignPhoneNumberTask(this.a.getText().toString().trim()).b(this);
        return;
      }
      v();
    }
    while (c(str1));
    if ("NO_EMAIL".equals(str1))
    {
      b(2131296995);
      return;
    }
    b(2131296432);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903071);
    d(true);
    setTitle(2131296454);
    this.b = ((UserNameEditText)findViewById(2131558525));
    this.b.a(l.b);
    this.a = ((EditText)findViewById(2131558523));
    this.a.setOnEditorActionListener(new TextView.OnEditorActionListener()
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
    this.c = ((Button)findViewById(2131558524));
    this.c.setOnClickListener(new View.OnClickListener()
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
    this.b.requestFocus();
    ((InputMethodManager)getSystemService("input_method")).showSoftInput(this.a, 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.AreaCodeUsernameActivity
 * JD-Core Version:    0.6.2
 */