package com.enflick.android.TextNow.views;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import com.enflick.android.TextNow.tasks.CheckUsernameAvailabilityTask;
import textnow.q.b;

public class UserNameEditText extends CompoundEditText
{
  public final String f = "[^\\Q!'- \\E]+";
  private boolean g = false;

  public UserNameEditText(Context paramContext)
  {
    super(paramContext);
  }

  public UserNameEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public final void g()
  {
    boolean bool1 = true;
    int i;
    boolean bool2;
    if (!a(2131493075))
    {
      String str1 = toString();
      if ((str1.length() > 0) && (b.b(str1.charAt(0))))
      {
        i = bool1;
        String str2 = getContext().getString(2131493076);
        if (i != 0)
          break label135;
        bool2 = bool1;
        label56: a(bool2, str2);
        if ((i == 0) || (a(toString(), 2131493077, 20)))
          break label141;
        label84: if ((!bool1) || ((this.g) && (!e())))
          break label146;
        a(c.b);
        new CheckUsernameAvailabilityTask(toString()).b(getContext());
      }
    }
    label135: label141: label146: 
    while ((!bool1) || (!this.g))
    {
      return;
      i = 0;
      break;
      bool2 = false;
      break label56;
      bool1 = false;
      break label84;
    }
    a(c.c);
    a(false);
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.e.setHint(2131493058);
    this.e.setInputType(1);
    this.e.setInputType(524432);
    this.e.addTextChangedListener(new TextWatcher()
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
    this.e.setSingleLine(true);
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
    EditText localEditText = this.e;
    InputFilter[] arrayOfInputFilter = new InputFilter[2];
    arrayOfInputFilter[0] = new InputFilter.LengthFilter(20);
    arrayOfInputFilter[1] = local2;
    localEditText.setFilters(arrayOfInputFilter);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.UserNameEditText
 * JD-Core Version:    0.6.2
 */