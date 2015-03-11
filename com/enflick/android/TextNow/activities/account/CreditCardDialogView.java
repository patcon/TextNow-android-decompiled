package com.enflick.android.TextNow.activities.account;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreditCardDialogView extends ScrollView
  implements g, h
{
  private Map<i, ImageView> a = new HashMap();
  private LinearLayout b;
  private ImageView c;
  private ImageView d;
  private ImageView e;
  private ImageView f;
  private ImageView g;
  private ImageView h;
  private CreditCardNumberEditText i;
  private EditText j;
  private EditText k;
  private EditText l;
  private BillingAddressDialogView m;

  public CreditCardDialogView(Context paramContext)
  {
    super(paramContext);
  }

  public CreditCardDialogView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CreditCardDialogView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final d a()
  {
    String str1 = this.j.getText().toString();
    String str2 = this.k.getText().toString();
    int n;
    int i1;
    if (TextUtils.isEmpty(str1))
    {
      n = 0;
      boolean bool = TextUtils.isEmpty(str2);
      i1 = 0;
      if (!bool)
        break label111;
    }
    d locald;
    while (true)
    {
      locald = new d(this.i.getText().toString(), Integer.valueOf(n), Integer.valueOf(i1), this.l.getText().toString());
      if (this.m.getVisibility() != 0)
        break label120;
      return this.m.a(locald);
      n = Integer.parseInt(str1);
      break;
      label111: i1 = Integer.parseInt(str2);
    }
    label120: return locald;
  }

  public final void a(i parami)
  {
    if (parami == i.g)
    {
      Iterator localIterator2 = this.a.values().iterator();
      while (localIterator2.hasNext())
        ((ImageView)localIterator2.next()).setVisibility(0);
    }
    ImageView localImageView1 = (ImageView)this.a.get(parami);
    Iterator localIterator1 = this.a.values().iterator();
    if (localIterator1.hasNext())
    {
      ImageView localImageView2 = (ImageView)localIterator1.next();
      if (localImageView2 == localImageView1);
      for (int n = 0; ; n = 8)
      {
        localImageView2.setVisibility(n);
        break;
      }
    }
  }

  public final void b()
  {
    this.b.setVisibility(0);
    this.j.requestFocus();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((LinearLayout)findViewById(2131165465));
    this.c = ((ImageView)findViewById(2131165457));
    this.d = ((ImageView)findViewById(2131165458));
    this.e = ((ImageView)findViewById(2131165459));
    this.f = ((ImageView)findViewById(2131165460));
    this.g = ((ImageView)findViewById(2131165461));
    this.h = ((ImageView)findViewById(2131165462));
    this.i = ((CreditCardNumberEditText)findViewById(2131165463));
    this.j = ((EditText)findViewById(2131165466));
    this.k = ((EditText)findViewById(2131165467));
    this.l = ((EditText)findViewById(2131165468));
    this.m = ((BillingAddressDialogView)findViewById(2131165310));
    this.a.put(i.d, this.c);
    this.a.put(i.c, this.d);
    this.a.put(i.b, this.e);
    this.a.put(i.a, this.f);
    this.a.put(i.f, this.g);
    this.a.put(i.e, this.h);
    this.i.a(this);
    this.i.a(this);
    this.j.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        String str = paramAnonymousEditable.toString();
        if (TextUtils.isEmpty(str))
          CreditCardDialogView.a(CreditCardDialogView.this).requestFocus();
        while (str.length() != 2)
          return;
        CreditCardDialogView.b(CreditCardDialogView.this).requestFocus();
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }
    });
    this.k.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        String str = paramAnonymousEditable.toString();
        if (TextUtils.isEmpty(str))
          CreditCardDialogView.c(CreditCardDialogView.this).requestFocus();
        while (str.length() != 2)
          return;
        CreditCardDialogView.d(CreditCardDialogView.this).requestFocus();
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }
    });
    this.l.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        String str = paramAnonymousEditable.toString();
        if (TextUtils.isEmpty(str))
          CreditCardDialogView.b(CreditCardDialogView.this).requestFocus();
        d locald;
        do
        {
          do
          {
            return;
            locald = CreditCardDialogView.a(CreditCardDialogView.this).a();
          }
          while (locald == null);
          locald.setCVC(str);
        }
        while (!locald.validateCVC());
        CreditCardDialogView.e(CreditCardDialogView.this).setVisibility(0);
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }
    });
    this.m.setVisibility(8);
    this.b.setVisibility(8);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.CreditCardDialogView
 * JD-Core Version:    0.6.2
 */