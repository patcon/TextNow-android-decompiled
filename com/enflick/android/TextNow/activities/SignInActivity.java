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
import com.enflick.android.TextNow.tasks.GetEsnUserNameTask;
import com.enflick.android.TextNow.tasks.GetGroupsTask;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.SignInTask;
import com.enflick.android.TextNow.tasks.c;
import java.util.Locale;
import textnow.z.u;

public class SignInActivity extends an
  implements View.OnClickListener
{
  private EditText a;
  private EditText b;
  private Button c;
  private TextView d;

  private void g()
  {
    String str1 = this.a.getText().toString().toLowerCase(Locale.ENGLISH).trim();
    String str2 = this.b.getText().toString();
    if (str1.length() == 0)
    {
      b(2131296482);
      return;
    }
    if (str2.length() == 0)
    {
      b(2131296489);
      return;
    }
    a(2131296457, false);
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
      if (!bool)
        new GetGroupsTask().b(this);
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
                v();
              }
              while (c(str1));
              if ("DB_ERROR".equals(str1))
              {
                c(2131296942);
                return;
              }
              c(2131296490);
              return;
              if (localClass != GetUserInfoTask.class)
                break;
              if (!bool)
              {
                new GetNewMessagesTask().b(this);
                return;
              }
              v();
            }
            while (c(str1));
            b(2131296491);
            return;
            if (localClass != GetGroupsTask.class)
              break;
            v();
            if (!bool)
            {
              setResult(-1);
              finish();
              com.enflick.android.TextNow.ads.b.b("sign_in");
              return;
            }
          }
          while (c(str1));
          b(2131296492);
          setResult(-1);
          finish();
          return;
          if (localClass != SignInTask.class)
            break;
          if (!bool)
          {
            new GetUserInfoTask(this.k.b()).b(this);
            return;
          }
          v();
          if (i == 404)
          {
            this.a.requestFocus();
            b(2131296486);
            return;
          }
          if (i == 401)
          {
            this.b.requestFocus();
            this.b.setSelection(0, this.b.length());
            b(2131296489);
            return;
          }
          if ((i == 400) && ("PASSWORD_UNSET".equals(str1)))
          {
            c(2131296493);
            return;
          }
        }
        while (c(str1));
        b(2131296432);
        return;
      }
      while (localClass != GetEsnUserNameTask.class);
      v();
    }
    while (bool);
    String str2 = this.k.b();
    this.a.setText(str2);
    this.b.requestFocus();
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131558974:
      g();
      return;
    case 2131558975:
    }
    startActivity(new Intent(this, ForgotPasswordActivity.class));
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903208);
    setTitle(2131296455);
    d(true);
    this.a = ((EditText)findViewById(2131558971));
    this.a.setInputType(524432);
    this.a.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        textnow.v.b.a(paramAnonymousEditable);
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }
    });
    this.a.setSingleLine(true);
    InputFilter local2 = new InputFilter()
    {
      public final CharSequence filter(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, Spanned paramAnonymousSpanned, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        while (true)
        {
          if (paramAnonymousInt1 < paramAnonymousInt2)
          {
            char c = paramAnonymousCharSequence.charAt(paramAnonymousInt1);
            if ((!textnow.v.b.a(c)) && (c != '.') && (c != '_'))
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
    EditText localEditText = this.a;
    InputFilter[] arrayOfInputFilter = new InputFilter[2];
    arrayOfInputFilter[0] = new InputFilter.LengthFilter(20);
    arrayOfInputFilter[1] = local2;
    localEditText.setFilters(arrayOfInputFilter);
    this.b = ((EditText)findViewById(2131558973));
    this.b.setOnEditorActionListener(new TextView.OnEditorActionListener()
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
    this.c = ((Button)findViewById(2131558974));
    this.c.setOnClickListener(this);
    this.d = ((TextView)findViewById(2131558975));
    this.d.setOnClickListener(this);
    if (textnow.v.b.h(this))
    {
      String str = textnow.v.b.i(this);
      if (!TextUtils.isEmpty(str))
      {
        a(2131296428, false);
        new GetEsnUserNameTask(str).b(this);
      }
    }
  }

  protected void onStart()
  {
    super.onStart();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.SignInActivity
 * JD-Core Version:    0.6.2
 */