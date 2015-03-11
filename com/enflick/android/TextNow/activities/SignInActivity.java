package com.enflick.android.TextNow.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.tasks.GetEsnUserNameTask;
import com.enflick.android.TextNow.tasks.GetGroupsTask;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.SignInTask;
import com.enflick.android.TextNow.tasks.c;
import java.util.Locale;
import textnow.q.b;
import textnow.u.r;

public class SignInActivity extends ah
  implements View.OnClickListener
{
  private EditText b;
  private EditText c;
  private Button d;
  private TextView e;

  private void g()
  {
    String str1 = this.b.getText().toString().toLowerCase(Locale.ENGLISH).trim();
    String str2 = this.c.getText().toString();
    if (str1.length() == 0)
    {
      c(2131493075);
      return;
    }
    if (str2.length() == 0)
    {
      c(2131493082);
      return;
    }
    a(2131493050, false);
    new SignInTask(str1, str2).b(this);
  }

  protected final void a(c paramc)
  {
    super.a(paramc);
    Class localClass = paramc.getClass();
    boolean bool = paramc.h();
    int i = paramc.i();
    String str1 = paramc.j();
    if (localClass == GetNewMessagesTask.class)
      if (bool);
    label49: 
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
              new GetGroupsTask().b(this);
              break label49;
              break label49;
              break label49;
              do
                return;
              while (c(str1));
              c(2131493083);
              return;
              if (localClass != GetUserInfoTask.class)
                break;
              if (!bool)
              {
                new GetNewMessagesTask().b(this);
                return;
              }
              r();
            }
            while (c(str1));
            c(2131493084);
            return;
            if (localClass != GetGroupsTask.class)
              break;
            r();
            if (!bool)
            {
              setResult(-1);
              finish();
              a.b("sign_in");
              return;
            }
          }
          while (c(str1));
          c(2131493085);
          setResult(-1);
          finish();
          return;
          if (localClass != SignInTask.class)
            break;
          if (!bool)
          {
            new GetUserInfoTask(this.h.b()).b(this);
            return;
          }
          r();
          if (i == 404)
          {
            this.b.requestFocus();
            c(2131493079);
            return;
          }
          if (i == 401)
          {
            this.c.requestFocus();
            this.c.setSelection(0, this.c.length());
            c(2131493082);
            return;
          }
          if ((i == 400) && ("PASSWORD_UNSET".equals(str1)))
          {
            d(2131493086);
            return;
          }
        }
        while (c(str1));
        c(2131493025);
        return;
      }
      while (localClass != GetEsnUserNameTask.class);
      r();
    }
    while (bool);
    String str2 = this.h.b();
    this.b.setText(str2);
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165672:
      g();
      return;
    case 2131165673:
    }
    startActivity(new Intent(this, ForgotPasswordActivity.class));
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903190);
    setTitle(2131493048);
    b(true);
    this.b = ((EditText)findViewById(2131165669));
    this.b.setInputType(524432);
    this.b.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        b.a(paramAnonymousEditable);
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }
    });
    this.b.setSingleLine(true);
    InputFilter local2 = new InputFilter()
    {
      public final CharSequence filter(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, Spanned paramAnonymousSpanned, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        while (true)
        {
          if (paramAnonymousInt1 < paramAnonymousInt2)
          {
            char c = paramAnonymousCharSequence.charAt(paramAnonymousInt1);
            if ((!b.a(c)) && (c != '.') && (c != '_'))
              paramAnonymousCharSequence = "";
          }
          else
          {
            return paramAnonymousCharSequence;
          }
          paramAnonymousInt1++;
        }
      }
    };
    EditText localEditText = this.b;
    InputFilter[] arrayOfInputFilter = new InputFilter[2];
    arrayOfInputFilter[0] = new InputFilter.LengthFilter(20);
    arrayOfInputFilter[1] = local2;
    localEditText.setFilters(arrayOfInputFilter);
    this.c = ((EditText)findViewById(2131165671));
    this.c.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if (paramAnonymousInt == 6)
        {
          SignInActivity.a(SignInActivity.this);
          return true;
        }
        return false;
      }
    });
    this.d = ((Button)findViewById(2131165672));
    this.d.setOnClickListener(this);
    this.e = ((TextView)findViewById(2131165673));
    this.e.setOnClickListener(this);
    if (b.i(this))
    {
      String str = b.j(this);
      if (!TextUtils.isEmpty(str))
      {
        a(2131493021, false);
        new GetEsnUserNameTask(str).b(this);
      }
    }
  }

  protected void onStart()
  {
    super.onStart();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.SignInActivity
 * JD-Core Version:    0.6.2
 */