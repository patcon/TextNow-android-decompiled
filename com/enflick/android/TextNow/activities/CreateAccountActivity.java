package com.enflick.android.TextNow.activities;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.tasks.CheckEmailAvailabilityTask;
import com.enflick.android.TextNow.tasks.CheckUsernameAvailabilityTask;
import com.enflick.android.TextNow.tasks.CreateAccountTask;
import com.enflick.android.TextNow.views.EmailEditText;
import com.enflick.android.TextNow.views.PasswordEditText;
import com.enflick.android.TextNow.views.UserNameEditText;
import java.util.Locale;

public class CreateAccountActivity extends ah
  implements View.OnClickListener
{
  private TextView b;
  private EditText c;
  private EditText d;
  private EditText e;
  private EmailEditText f;
  private PasswordEditText l;
  private Spinner m;
  private UserNameEditText n;
  private Button o;
  private boolean p = false;
  private boolean q = false;

  private void g()
  {
    if (TextUtils.isEmpty(this.d.getText().toString()))
    {
      c(2131493080);
      return;
    }
    if (TextUtils.isEmpty(this.e.getText().toString()))
    {
      c(2131493081);
      return;
    }
    this.f.g();
    if (!this.f.c())
    {
      if (this.f.d())
      {
        this.q = true;
        a(2131493054, false);
        return;
      }
      r();
      return;
    }
    this.n.g();
    if (!this.n.c())
    {
      if (this.n.d())
      {
        this.q = true;
        a(2131493054, false);
        return;
      }
      r();
      return;
    }
    this.l.g();
    if (!this.l.c())
    {
      r();
      return;
    }
    a(2131493054, false);
    try
    {
      String str = this.c.getText().toString().trim();
      boolean bool = TextUtils.isDigitsOnly(str);
      int k = 0;
      if (bool)
      {
        int i1 = Integer.valueOf(str).intValue();
        k = i1;
      }
      i = k;
      int j = this.m.getSelectedItemPosition();
      new CreateAccountTask(this.n.toString().toLowerCase(Locale.ENGLISH), this.f.toString(), this.l.toString(), this.d.getText().toString().trim(), this.e.getText().toString().trim(), i, j).b(this);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        int i = 0;
    }
  }

  protected final void a(com.enflick.android.TextNow.tasks.c paramc)
  {
    super.a(paramc);
    Class localClass = paramc.getClass();
    boolean bool = paramc.h();
    int i = paramc.i();
    String str = paramc.j();
    if (localClass == CheckUsernameAvailabilityTask.class)
      if (!bool)
      {
        r();
        this.q = false;
        this.n.a(com.enflick.android.TextNow.views.c.a);
        this.n.b(false);
        c(2131493074);
      }
    label333: 
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  return;
                  if (i != 404)
                    break;
                  this.n.a(com.enflick.android.TextNow.views.c.c);
                  this.n.b(true);
                  this.n.a(false);
                }
                while (!this.q);
                this.q = false;
                g();
                return;
                r();
                this.q = false;
                this.n.a(com.enflick.android.TextNow.views.c.a);
                this.n.b(false);
                if (i == 400)
                {
                  c(2131493078);
                  return;
                }
              }
              while (c(str));
              c(2131493025);
              return;
              if (localClass != CheckEmailAvailabilityTask.class)
                break label333;
              if (!bool)
              {
                r();
                this.q = false;
                this.f.a(com.enflick.android.TextNow.views.c.a);
                this.f.b(false);
                c(2131493073);
                return;
              }
              if (i != 404)
                break;
              this.f.a(com.enflick.android.TextNow.views.c.c);
              this.f.b(true);
              this.f.a(false);
            }
            while (!this.q);
            this.q = false;
            g();
            return;
            r();
            this.q = false;
            this.f.a(com.enflick.android.TextNow.views.c.a);
            this.f.b(false);
            if (i == 400)
            {
              c(2131493068);
              return;
            }
          }
          while (c(str));
          c(2131493025);
          return;
        }
        while (localClass != CreateAccountTask.class);
        r();
        if (!bool)
        {
          setResult(-1);
          finish();
          a.b("create_account");
          return;
        }
        if (i != 400)
          break;
        if ("EMAIL_ADDRESS_IN_USE".equals(str))
        {
          this.f.a(com.enflick.android.TextNow.views.c.a);
          this.f.b(false);
          c(2131493073);
          return;
        }
      }
      while (("FACEBOOK_ID_IN_USE".equals(str)) || ("FACEBOOK_VERIFY_FAILED".equals(str)));
      c(2131493025);
      return;
    }
    while (c(str));
    c(2131493025);
  }

  public void onClick(View paramView)
  {
    g();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903098);
    setTitle(2131493051);
    b(true);
    this.b = ((TextView)findViewById(2131165390));
    this.d = ((EditText)findViewById(2131165383));
    this.e = ((EditText)findViewById(2131165384));
    this.f = ((EmailEditText)findViewById(2131165385));
    this.c = ((EditText)findViewById(2131165386));
    this.m = ((Spinner)findViewById(2131165387));
    this.m.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
    {
      public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        if ((paramAnonymousInt == 0) && (paramAnonymousAdapterView != null) && (paramAnonymousAdapterView.getChildAt(0) != null))
          ((TextView)paramAnonymousAdapterView.getChildAt(0)).setTextColor(CreateAccountActivity.this.getResources().getColor(2131296308));
      }

      public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
      {
      }
    });
    this.n = ((UserNameEditText)findViewById(2131165388));
    this.l = ((PasswordEditText)findViewById(2131165389));
    this.l.a(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if (paramAnonymousInt == 5)
        {
          CreateAccountActivity.a(CreateAccountActivity.this);
          return true;
        }
        return false;
      }
    });
    this.o = ((Button)findViewById(2131165391));
    this.o.setOnClickListener(this);
    String str1 = getString(2131493098);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.o.getText().toString();
    String str2 = String.format(str1, arrayOfObject);
    this.b.setText(Html.fromHtml(str2));
    this.b.setMovementMethod(LinkMovementMethod.getInstance());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.CreateAccountActivity
 * JD-Core Version:    0.6.2
 */