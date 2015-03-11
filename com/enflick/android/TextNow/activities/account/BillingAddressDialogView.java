package com.enflick.android.TextNow.activities.account;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.enflick.android.TextNow.tasks.UpdateBillingAddressTask;
import java.util.ArrayList;
import java.util.Arrays;
import textnow.z.s;
import textnow.z.u;

public class BillingAddressDialogView extends LinearLayout
{
  private EditText a;
  private Spinner b;
  private EditText c;
  private EditText d;
  private EditText e;
  private EditText f;
  private EditText g;
  private Spinner h;

  public BillingAddressDialogView(Context paramContext)
  {
    super(paramContext);
  }

  public BillingAddressDialogView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public BillingAddressDialogView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private String a()
  {
    if (this.e.getVisibility() == 0)
      return this.e.getText().toString().trim();
    return this.h.getSelectedItem().toString();
  }

  private static String a(EditText paramEditText)
  {
    return paramEditText.getText().toString().trim();
  }

  private void a(String paramString1, String paramString2)
  {
    if ((paramString1.equalsIgnoreCase("US")) || (paramString1.equalsIgnoreCase("United States")) || (paramString1.equalsIgnoreCase("USA")))
    {
      a(getResources().getStringArray(2131623956), paramString2);
      this.h.setVisibility(0);
      this.e.setVisibility(8);
    }
    do
    {
      return;
      if (paramString1.equalsIgnoreCase("Canada"))
      {
        a(getResources().getStringArray(2131623957), paramString2);
        this.h.setVisibility(0);
        this.e.setVisibility(8);
        return;
      }
      this.h.setVisibility(8);
      this.e.setVisibility(0);
    }
    while (TextUtils.isEmpty(paramString2));
    this.e.setText(paramString2);
  }

  private void a(String[] paramArrayOfString, String paramString)
  {
    int i = 0;
    int j;
    int k;
    if (TextUtils.isEmpty(paramString))
    {
      j = 0;
      if (TextUtils.isEmpty(paramString))
        break label135;
      k = 0;
      label22: if (k < paramArrayOfString.length)
      {
        if (!paramArrayOfString[k].equalsIgnoreCase(paramString))
          break label129;
        j = k;
      }
      if (j >= 0)
        break label135;
      ArrayList localArrayList = new ArrayList(Arrays.asList(paramArrayOfString));
      localArrayList.add(0, paramString);
      paramArrayOfString = (String[])localArrayList.toArray(new String[0]);
    }
    while (true)
    {
      ArrayAdapter localArrayAdapter = new ArrayAdapter(getContext(), 17367048, paramArrayOfString);
      localArrayAdapter.setDropDownViewResource(17367049);
      this.h.setAdapter(localArrayAdapter);
      this.h.setSelection(i);
      return;
      j = -1;
      break;
      label129: k++;
      break label22;
      label135: i = j;
    }
  }

  private static String b(EditText paramEditText)
  {
    String str = paramEditText.getText().toString().trim();
    if (TextUtils.isEmpty(str))
      str = null;
    return str;
  }

  public final int a(Activity paramActivity)
  {
    int i = new d(null, null, null, null, a(this.a), a(this.c), a(this.d), a(this.f), a(), a(this.g), this.b.getSelectedItem().toString()).b();
    if (i > 0)
      return i;
    new UpdateBillingAddressTask(new u(getContext()).b(), a(this.a), a(this.c), a(this.d), a(this.f), a(), a(this.g), this.b.getSelectedItem().toString()).b(paramActivity);
    return 0;
  }

  public final d a(d paramd)
  {
    paramd.setName(b(this.a));
    paramd.setAddressLine1(b(this.c));
    paramd.setAddressLine2(b(this.d));
    paramd.setAddressCity(b(this.f));
    if (!TextUtils.isEmpty(a()));
    for (String str = a(); ; str = null)
    {
      paramd.setAddressState(str);
      paramd.setAddressZip(b(this.g));
      paramd.setAddressCountry(this.b.getSelectedItem().toString());
      return paramd;
    }
  }

  protected void onFinishInflate()
  {
    int i = 0;
    super.onFinishInflate();
    b localb = new b(this, (byte)0);
    this.a = ((EditText)findViewById(2131558716));
    this.a.setOnFocusChangeListener(localb);
    this.c = ((EditText)findViewById(2131558720));
    this.c.setOnFocusChangeListener(localb);
    this.d = ((EditText)findViewById(2131558721));
    this.d.setOnFocusChangeListener(localb);
    this.f = ((EditText)findViewById(2131558722));
    this.f.setOnFocusChangeListener(localb);
    this.e = ((EditText)findViewById(2131558719));
    this.e.setOnFocusChangeListener(localb);
    this.g = ((EditText)findViewById(2131558723));
    this.g.setOnFocusChangeListener(localb);
    this.b = ((Spinner)findViewById(2131558717));
    this.b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
    {
      public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        BillingAddressDialogView.a(BillingAddressDialogView.this, (String)BillingAddressDialogView.a(BillingAddressDialogView.this).getItemAtPosition(paramAnonymousInt), null);
      }

      public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
      {
        BillingAddressDialogView.a(BillingAddressDialogView.this, null, null);
      }
    });
    this.h = ((Spinner)findViewById(2131558718));
    s locals = new s(getContext());
    String str1 = locals.h();
    String str2 = locals.i();
    String str3 = locals.j();
    String str4 = locals.k();
    String str5 = locals.l();
    String str6 = locals.n();
    String str7 = locals.m();
    if (!TextUtils.isEmpty(str1))
      this.a.setText(str1);
    if (!TextUtils.isEmpty(str2))
      this.c.setText(str2);
    if (!TextUtils.isEmpty(str3))
      this.d.setText(str3);
    if (!TextUtils.isEmpty(str4))
      this.f.setText(str4);
    if (!TextUtils.isEmpty(str7))
      this.g.setText(str7);
    String[] arrayOfString1 = getResources().getStringArray(2131623955);
    int j;
    int k;
    label357: ArrayList localArrayList;
    if (TextUtils.isEmpty(str6))
    {
      j = 103;
      if (TextUtils.isEmpty(str6))
        break label493;
      k = 0;
      if (k < arrayOfString1.length)
      {
        if (!arrayOfString1[k].equalsIgnoreCase(str6))
          break label487;
        j = k;
      }
      if (j >= 0)
        break label493;
      localArrayList = new ArrayList(Arrays.asList(arrayOfString1));
      localArrayList.add(0, str6);
    }
    for (String[] arrayOfString2 = (String[])localArrayList.toArray(new String[0]); ; arrayOfString2 = arrayOfString1)
    {
      ArrayAdapter localArrayAdapter = new ArrayAdapter(getContext(), 17367048, arrayOfString2);
      localArrayAdapter.setDropDownViewResource(17367049);
      this.b.setAdapter(localArrayAdapter);
      this.b.setSelection(i);
      a((String)this.b.getSelectedItem(), str5);
      return;
      j = -1;
      break;
      label487: k++;
      break label357;
      label493: i = j;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.BillingAddressDialogView
 * JD-Core Version:    0.6.2
 */