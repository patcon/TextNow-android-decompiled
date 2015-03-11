package com.enflick.android.TextNow.views;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView.OnEditorActionListener;

public class PasswordEditText extends CompoundEditText
{
  public final String f = "";

  public PasswordEditText(Context paramContext)
  {
    super(paramContext);
  }

  public PasswordEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    this.e.setOnEditorActionListener(paramOnEditorActionListener);
  }

  protected final int f()
  {
    return toString().length();
  }

  public final void g()
  {
    boolean bool1 = true;
    boolean bool2;
    if (!a(2131296478))
      if (toString().length() < 8)
      {
        bool2 = bool1;
        String str = getContext().getString(2131296478);
        Object[] arrayOfObject = new Object[bool1];
        arrayOfObject[0] = Integer.valueOf(8 - toString().length());
        a(bool2, String.format(str, arrayOfObject));
        if ((bool2) || (a(toString(), 2131296477, 30)) || (a(toString(), 2131296479, "\\s")))
          break label125;
      }
    while (true)
    {
      if (bool1)
      {
        a(d.c);
        a(false);
      }
      return;
      bool2 = false;
      break;
      label125: bool1 = false;
    }
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.e.setInputType(129);
    this.e.setHint(2131296466);
    this.e.setSingleLine(true);
    EditText localEditText = this.e;
    InputFilter[] arrayOfInputFilter = new InputFilter[1];
    arrayOfInputFilter[0] = new InputFilter.LengthFilter(30);
    localEditText.setFilters(arrayOfInputFilter);
  }

  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    super.onFocusChange(paramView, paramBoolean);
    if (paramBoolean)
    {
      this.e.setTransformationMethod(null);
      if (this.e.getText().length() > 0)
        g();
      if (this.e.getText().length() > 30)
      {
        this.e.setSelection(30, this.e.getText().length());
        return;
      }
      this.e.setSelection(this.e.getText().length());
      return;
    }
    this.e.setTransformationMethod(new PasswordTransformationMethod());
  }

  public String toString()
  {
    return this.e.getText().toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.PasswordEditText
 * JD-Core Version:    0.6.2
 */