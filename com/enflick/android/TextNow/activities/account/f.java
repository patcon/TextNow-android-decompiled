package com.enflick.android.TextNow.activities.account;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import textnow.q.ad;

final class f
  implements TextWatcher
{
  private f(CreditCardNumberEditText paramCreditCardNumberEditText)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str1 = paramEditable.toString();
    CreditCardNumberEditText.a(this.a, new d(str1, Integer.valueOf(0), Integer.valueOf(0), ""));
    i locali = CreditCardNumberEditText.a(this.a).a();
    if (CreditCardNumberEditText.b(this.a) != locali)
    {
      CreditCardNumberEditText.b(this.a);
      CreditCardNumberEditText.a(this.a, locali);
      if (CreditCardNumberEditText.c(this.a) != null)
        CreditCardNumberEditText.c(this.a).a(locali);
    }
    if (locali != null)
    {
      String str2 = locali.b(d.a(str1));
      String str3 = locali.a(str2);
      if (!str3.equals(str1))
        paramEditable.replace(0, paramEditable.length(), str3);
      CreditCardNumberEditText.a(this.a).setNumber(str2);
      if (str2.length() == locali.j)
        break label187;
      this.a.setTextColor(CreditCardNumberEditText.d(this.a));
    }
    label187: 
    do
    {
      return;
      if (!CreditCardNumberEditText.a(this.a).validateNumber())
      {
        this.a.setTextColor(this.a.getResources().getColor(2131296297));
        ad.a(this.a);
        return;
      }
    }
    while (CreditCardNumberEditText.e(this.a) == null);
    CreditCardNumberEditText.e(this.a).b();
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.f
 * JD-Core Version:    0.6.2
 */