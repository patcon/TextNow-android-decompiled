package com.enflick.android.TextNow.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class CompoundEditText extends LinearLayout
  implements View.OnClickListener, View.OnFocusChangeListener
{
  protected int a;
  protected BackgroundColorSpan b;
  protected LayoutInflater c;
  protected RelativeLayout d;
  protected EditText e;
  private ImageView f;
  private ProgressBar g;
  private d h = d.d;
  private boolean i = false;

  public CompoundEditText(Context paramContext)
  {
    super(paramContext);
    h();
  }

  public CompoundEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.c = LayoutInflater.from(paramContext);
    h();
    this.a = getResources().getColor(2131230818);
    this.b = new BackgroundColorSpan(this.a);
  }

  private void h()
  {
    this.c.inflate(2130903104, this);
  }

  public final Editable a()
  {
    return this.e.getEditableText();
  }

  public final void a(d paramd)
  {
    this.h = paramd;
    switch (2.a[paramd.ordinal()])
    {
    default:
      return;
    case 1:
      this.f.setVisibility(0);
      this.g.setVisibility(8);
      return;
    case 2:
      this.f.setVisibility(8);
      this.g.setVisibility(0);
      return;
    case 3:
    case 4:
    }
    this.f.setVisibility(8);
    this.g.setVisibility(8);
  }

  public final void a(String paramString)
  {
    this.e.setText(paramString);
  }

  public final void a(boolean paramBoolean)
  {
    this.i = false;
  }

  protected final void a(boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
    {
      a(d.a);
      Toast.makeText(getContext(), paramString, 0).show();
      return;
    }
    a(d.d);
  }

  protected final boolean a(int paramInt)
  {
    if (f() == 0);
    for (boolean bool = true; ; bool = false)
    {
      String str = getContext().getString(paramInt);
      if (bool)
        this.e.setText("");
      a(bool, str);
      return bool;
    }
  }

  protected final boolean a(String paramString, int paramInt1, int paramInt2)
  {
    boolean bool;
    String str2;
    if (paramString.length() > paramInt2)
    {
      bool = true;
      String str1 = getContext().getString(paramInt1);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramString.length() - paramInt2);
      str2 = String.format(str1, arrayOfObject);
      if (!bool)
        break label127;
      this.e.getEditableText().setSpan(this.b, paramInt2 + f() - paramString.length(), f(), 33);
      this.e.setSelection(20 + f() - paramString.length(), f());
    }
    while (true)
    {
      a(bool, str2);
      return bool;
      bool = false;
      break;
      label127: this.e.getEditableText().removeSpan(this.b);
    }
  }

  protected final boolean a(String paramString1, int paramInt, String paramString2)
  {
    boolean bool = false;
    Matcher localMatcher = Pattern.compile(paramString2, 0).matcher(paramString1);
    String str = getContext().getString(2131296479);
    while (localMatcher.find())
    {
      bool = true;
      this.e.getEditableText().setSpan(new BackgroundColorSpan(this.a), localMatcher.start(), localMatcher.end(), 33);
    }
    a(bool, str);
    return bool;
  }

  public final EditText b()
  {
    return this.e;
  }

  public final boolean c()
  {
    return this.h == d.c;
  }

  public final boolean d()
  {
    return this.h == d.b;
  }

  public final boolean e()
  {
    return this.i;
  }

  protected int f()
  {
    return this.e.getText().toString().trim().length();
  }

  public abstract void g();

  public void onClick(View paramView)
  {
    this.e.requestFocus();
    ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this.e, 0);
  }

  public void onFinishInflate()
  {
    this.d = ((RelativeLayout)findViewById(2131558622));
    this.d.setAddStatesFromChildren(true);
    this.e = ((EditText)this.d.findViewById(2131558623));
    this.e.setOnFocusChangeListener(this);
    this.e.addTextChangedListener(new TextWatcher()
    {
      String a = "";
      int b = -1;
      int c = -1;

      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        if (!this.a.equals(paramAnonymousEditable.toString()))
        {
          CompoundEditText.this.a(d.d);
          CompoundEditText.a(CompoundEditText.this, true);
        }
        if (this.b != -1)
        {
          int i = this.b;
          int j = this.c;
          this.b = -1;
          this.c = -1;
          CompoundEditText.this.e.removeTextChangedListener(this);
          paramAnonymousEditable.replace(i, i + 1, "");
          paramAnonymousEditable.setSpan(new BackgroundColorSpan(CompoundEditText.this.a), i, j - 1, 33);
          CompoundEditText.this.e.addTextChangedListener(this);
        }
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        this.a = paramAnonymousCharSequence.toString();
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        if ((paramAnonymousInt3 == 1) && (paramAnonymousInt2 == 0))
        {
          localSpannable = (Spannable)paramAnonymousCharSequence;
          arrayOfBackgroundColorSpan = (BackgroundColorSpan[])localSpannable.getSpans(paramAnonymousInt1 + 1, paramAnonymousCharSequence.length(), BackgroundColorSpan.class);
          if ((arrayOfBackgroundColorSpan.length > 0) && (localSpannable.getSpanStart(arrayOfBackgroundColorSpan[0]) == paramAnonymousInt1 + 1))
          {
            this.b = localSpannable.getSpanStart(arrayOfBackgroundColorSpan[0]);
            this.c = localSpannable.getSpanEnd(arrayOfBackgroundColorSpan[0]);
          }
        }
        while ((paramAnonymousInt2 == 0) || (paramAnonymousCharSequence.length() != 0))
        {
          Spannable localSpannable;
          BackgroundColorSpan[] arrayOfBackgroundColorSpan;
          return;
        }
        CompoundEditText.this.a(false, null);
      }
    });
    this.f = ((ImageView)this.d.findViewById(2131558624));
    this.g = ((ProgressBar)this.d.findViewById(2131558625));
    setOnClickListener(this);
    this.f.setOnClickListener(this);
  }

  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (!paramBoolean)
      g();
  }

  public String toString()
  {
    return this.e.getText().toString().trim();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.CompoundEditText
 * JD-Core Version:    0.6.2
 */