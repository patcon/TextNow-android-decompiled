package com.enflick.android.TextNow.activities;

import android.text.Editable;
import android.text.Editable.Factory;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Filter;
import android.widget.Filter.FilterListener;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView.Tokenizer;
import com.enflick.android.TextNow.views.RecipientField;
import com.enflick.android.TextNow.views.h;
import com.enflick.android.TextNow.views.i;
import com.enflick.android.TextNow.views.j;
import textnow.k.g;

public final class z
  implements TextWatcher
{
  int a = -1;
  private RecipientField b;
  private MultiAutoCompleteTextView.Tokenizer c;
  private g d;
  private ListView e;
  private String f;

  public z(ListView paramListView, RecipientField paramRecipientField, MultiAutoCompleteTextView.Tokenizer paramTokenizer, g paramg)
  {
    this.b = paramRecipientField;
    this.c = paramTokenizer;
    this.d = paramg;
    this.e = paramListView;
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    int i = 1;
    if (this.a >= 0)
    {
      int i5 = this.a;
      this.a = -1;
      paramEditable.replace(i5, i5 + 1, "");
      this.b.a(this.c);
    }
    Editable localEditable = Editable.Factory.getInstance().newEditable(this.b.getText());
    String str1 = this.b.getText().toString();
    j[] arrayOfj = (j[])localEditable.getSpans(0, localEditable.length(), j.class);
    int i3;
    int i4;
    if (arrayOfj.length > 0)
    {
      int i1 = arrayOfj.length;
      int i2 = 0;
      for (i3 = 0; i2 < i1; i3 = i4)
      {
        i4 = localEditable.getSpanEnd(arrayOfj[i2]);
        if (i4 <= i3)
          break label341;
        i2++;
      }
    }
    for (String str2 = str1.substring(i3); ; str2 = str1)
    {
      if ((str2.length() == 0) && (arrayOfj.length > 0))
      {
        i[] arrayOfi = (i[])localEditable.getSpans(0, localEditable.length(), i.class);
        if (arrayOfi.length > 0)
          arrayOfi[(-1 + arrayOfi.length)].onClick(this.b);
      }
      for (int j = i; ; j = 0)
      {
        this.f = str2.trim();
        h localh;
        int m;
        int n;
        if (this.b.a() != null)
        {
          localh = this.b.a();
          int k = arrayOfj.length;
          if (j == 0)
            break label301;
          m = i;
          n = k - m;
          if (this.f.length() <= 0)
            break label307;
        }
        while (true)
        {
          localh.b(n + i);
          if (this.f.length() != 0)
            break label312;
          this.e.setVisibility(4);
          return;
          label301: m = 0;
          break;
          label307: i = 0;
        }
        label312: this.d.getFilter().filter(this.f, new Filter.FilterListener()
        {
          public final void onFilterComplete(int paramAnonymousInt)
          {
            if (!TextUtils.isEmpty(z.a(z.this)))
            {
              z.b(z.this).setVisibility(0);
              return;
            }
            z.b(z.this).setVisibility(4);
          }
        });
        return;
      }
      label341: i4 = i3;
      break;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 > 0);
    while (true)
    {
      if (paramInt3 > 0)
      {
        int i = paramCharSequence.charAt(-1 + (paramInt1 + paramInt3));
        if ((i == 32) || (i == 44))
          this.a = (-1 + (paramInt1 + paramInt3));
      }
      else
      {
        return;
      }
      paramInt3--;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.z
 * JD-Core Version:    0.6.2
 */