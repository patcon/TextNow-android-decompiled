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
import com.enflick.android.TextNow.ads.b;
import com.enflick.android.TextNow.tasks.CheckEmailAvailabilityTask;
import com.enflick.android.TextNow.tasks.CheckUsernameAvailabilityTask;
import com.enflick.android.TextNow.tasks.CreateAccountTask;
import com.enflick.android.TextNow.tasks.c;
import com.enflick.android.TextNow.views.EmailEditText;
import com.enflick.android.TextNow.views.PasswordEditText;
import com.enflick.android.TextNow.views.UserNameEditText;
import com.enflick.android.TextNow.views.d;
import java.util.Locale;

public class CreateAccountActivity extends an
  implements View.OnClickListener
{
  private TextView a;
  private EditText b;
  private EditText c;
  private EditText d;
  private EmailEditText e;
  private PasswordEditText f;
  private Spinner o;
  private UserNameEditText p;
  private Button q;
  private boolean r = false;
  private boolean s = false;

  private void g()
  {
    if (TextUtils.isEmpty(this.c.getText().toString()))
    {
      b(2131296487);
      return;
    }
    if (TextUtils.isEmpty(this.d.getText().toString()))
    {
      b(2131296488);
      return;
    }
    this.e.g();
    if (!this.e.c())
    {
      if (this.e.d())
      {
        this.s = true;
        a(2131296461, false);
        return;
      }
      v();
      return;
    }
    this.p.g();
    if (!this.p.c())
    {
      if (this.p.d())
      {
        this.s = true;
        a(2131296461, false);
        return;
      }
      v();
      return;
    }
    this.f.g();
    if (!this.f.c())
    {
      v();
      return;
    }
    a(2131296461, false);
    try
    {
      String str = this.b.getText().toString().trim();
      boolean bool = TextUtils.isDigitsOnly(str);
      int k = 0;
      if (bool)
      {
        int m = Integer.valueOf(str).intValue();
        k = m;
      }
      i = k;
      int j = this.o.getSelectedItemPosition();
      new CreateAccountTask(this.p.toString().toLowerCase(Locale.ENGLISH), this.e.toString(), this.f.toString(), this.c.getText().toString().trim(), this.d.getText().toString().trim(), i, j).b(this);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        int i = 0;
    }
  }

  protected final void a(c paramc)
  {
    super.a(paramc);
    Class localClass = paramc.getClass();
    boolean bool = paramc.h();
    int i = paramc.i();
    String str = paramc.j();
    if (localClass == CheckUsernameAvailabilityTask.class)
      if (!bool)
      {
        v();
        this.s = false;
        this.p.a(d.a);
        this.p.b(false);
        b(2131296481);
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
                  this.p.a(d.c);
                  this.p.b(true);
                  this.p.a(false);
                }
                while (!this.s);
                this.s = false;
                g();
                return;
                v();
                this.s = false;
                this.p.a(d.a);
                this.p.b(false);
                if (i == 400)
                {
                  b(2131296485);
                  return;
                }
              }
              while (c(str));
              b(2131296432);
              return;
              if (localClass != CheckEmailAvailabilityTask.class)
                break label333;
              if (!bool)
              {
                v();
                this.s = false;
                this.e.a(d.a);
                this.e.b(false);
                b(2131296480);
                return;
              }
              if (i != 404)
                break;
              this.e.a(d.c);
              this.e.b(true);
              this.e.a(false);
            }
            while (!this.s);
            this.s = false;
            g();
            return;
            v();
            this.s = false;
            this.e.a(d.a);
            this.e.b(false);
            if (i == 400)
            {
              b(2131296475);
              return;
            }
          }
          while (c(str));
          b(2131296432);
          return;
        }
        while (localClass != CreateAccountTask.class);
        v();
        if (!bool)
        {
          setResult(-1);
          finish();
          b.b("create_account");
          return;
        }
        if (i != 400)
          break;
        if ("EMAIL_ADDRESS_IN_USE".equals(str))
        {
          this.e.a(d.a);
          this.e.b(false);
          b(2131296480);
          return;
        }
      }
      while (("FACEBOOK_ID_IN_USE".equals(str)) || ("FACEBOOK_VERIFY_FAILED".equals(str)));
      b(2131296432);
      return;
    }
    while (c(str));
    b(2131296432);
  }

  public void onClick(View paramView)
  {
    g();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903110);
    setTitle(2131296458);
    d(true);
    this.a = ((TextView)findViewById(2131558656));
    this.c = ((EditText)findViewById(2131558649));
    this.d = ((EditText)findViewById(2131558650));
    this.e = ((EmailEditText)findViewById(2131558651));
    this.b = ((EditText)findViewById(2131558652));
    this.o = ((Spinner)findViewById(2131558653));
    this.o.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
    {
      public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        if ((paramAnonymousInt == 0) && (paramAnonymousAdapterView != null) && (paramAnonymousAdapterView.getChildAt(0) != null))
          ((TextView)paramAnonymousAdapterView.getChildAt(0)).setTextColor(CreateAccountActivity.this.getResources().getColor(2131230828));
      }

      public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
      {
      }
    });
    this.p = ((UserNameEditText)findViewById(2131558654));
    this.f = ((PasswordEditText)findViewById(2131558655));
    this.f.a(new TextView.OnEditorActionListener()
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
    this.q = ((Button)findViewById(2131558657));
    this.q.setOnClickListener(this);
    String str1 = getString(2131296505);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.q.getText().toString();
    String str2 = String.format(str1, arrayOfObject);
    this.a.setText(Html.fromHtml(str2));
    this.a.setMovementMethod(LinkMovementMethod.getInstance());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.CreateAccountActivity
 * JD-Core Version:    0.6.2
 */