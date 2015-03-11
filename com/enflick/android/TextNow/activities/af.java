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
import com.enflick.android.TextNow.views.i;
import com.enflick.android.TextNow.views.j;
import com.enflick.android.TextNow.views.k;
import textnow.p.l;

public final class af
  implements TextWatcher
{
  int a = -1;
  private RecipientField b;
  private MultiAutoCompleteTextView.Tokenizer c;
  private l d;
  private ListView e;
  private String f;

  public af(ListView paramListView, RecipientField paramRecipientField, MultiAutoCompleteTextView.Tokenizer paramTokenizer, l paraml)
  {
    this.b = paramRecipientField;
    this.c = paramTokenizer;
    this.d = paraml;
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
    k[] arrayOfk = (k[])localEditable.getSpans(0, localEditable.length(), k.class);
    int i3;
    int i4;
    if (arrayOfk.length > 0)
    {
      int i1 = arrayOfk.length;
      int i2 = 0;
      for (i3 = 0; i2 < i1; i3 = i4)
      {
        i4 = localEditable.getSpanEnd(arrayOfk[i2]);
        if (i4 <= i3)
          break label340;
        i2++;
      }
    }
    for (String str2 = str1.substring(i3); ; str2 = str1)
    {
      if ((str2.length() == 0) && (arrayOfk.length > 0))
      {
        j[] arrayOfj = (j[])localEditable.getSpans(0, localEditable.length(), j.class);
        if (arrayOfj.length > 0)
          arrayOfj[(-1 + arrayOfj.length)].onClick(this.b);
      }
      for (boolean bool = i; ; bool = false)
      {
        this.f = str2.trim();
        i locali;
        int n;
        if (this.b.a() != null)
        {
          locali = this.b.a();
          int j = arrayOfk.length;
          if (!bool)
            break label300;
          int k = i;
          n = j - k;
          if (this.f.length() <= 0)
            break label306;
        }
        while (true)
        {
          locali.a(n, i);
          if (this.f.length() != 0)
            break label311;
          this.e.setVisibility(4);
          return;
          label300: int m = 0;
          break;
          label306: i = 0;
        }
        label311: this.d.getFilter().filter(this.f, new Filter.FilterListener()
        {
          public final void onFilterComplete(int paramAnonymousInt)
          {
            if (!TextUtils.isEmpty(af.a(af.this)))
            {
              af.b(af.this).setVisibility(0);
              return;
            }
            af.b(af.this).setVisibility(4);
          }
        });
        return;
      }
      label340: i4 = i3;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.af
 * JD-Core Version:    0.6.2
 */