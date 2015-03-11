package com.enflick.android.TextNow.views.emoticons;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class f
  implements TextWatcher
{
  d a;
  EditText b;
  int c;
  int d;
  int e;

  public f(d paramd, EditText paramEditText)
  {
    this.b = paramEditText;
    this.a = paramd;
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (paramEditable.length() != 0)
    {
      if ((!Character.isWhitespace(paramEditable.charAt(Math.max(-1 + this.b.getSelectionStart(), 0)))) || (this.e != 1))
        break label88;
      this.a.a(paramEditable, this.b.getTextSize(), Math.max(0, -4 + this.b.getSelectionStart()), Math.min(paramEditable.length(), this.b.getSelectionStart()));
    }
    label88: 
    while (this.e <= 1)
      return;
    this.a.a(paramEditable, this.b.getTextSize(), Math.max(0, this.b.getSelectionEnd() - this.e), Math.min(paramEditable.length(), this.b.getSelectionEnd()));
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.c = paramInt2;
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.d = paramInt3;
    this.e = (this.d - this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.emoticons.f
 * JD-Core Version:    0.6.2
 */