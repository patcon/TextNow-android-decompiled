package com.enflick.android.TextNow.activities.account;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.tasks.GetBillingInfoTask;
import com.enflick.android.TextNow.tasks.UpdateBillingAddressTask;
import textnow.z.s;

public final class c extends av
{
  private TextView a;
  private TextView b;
  private TextView f;
  private TextView g;
  private AlertDialog h;

  public static c a()
  {
    return new c();
  }

  private void b()
  {
    s locals = new s(this.d);
    String str1 = locals.h();
    String str2 = locals.i();
    String str3 = locals.j();
    String str4 = locals.k();
    String str5 = locals.l();
    String str6 = locals.n();
    String str7 = locals.m();
    this.a.setText(str1);
    TextView localTextView1 = this.b;
    StringBuilder localStringBuilder1 = new StringBuilder().append(str2);
    String str8;
    TextView localTextView2;
    StringBuilder localStringBuilder2;
    if (!TextUtils.isEmpty(str3))
    {
      str8 = "\n" + str3;
      localTextView1.setText(str8);
      localTextView2 = this.f;
      localStringBuilder2 = new StringBuilder();
      if (!TextUtils.isEmpty(str4))
        break label198;
    }
    label198: for (String str9 = ""; ; str9 = str4 + ", ")
    {
      localTextView2.setText(str9 + str5 + " " + str7);
      this.g.setText(str6);
      return;
      str8 = "";
      break;
    }
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramc.getClass() == GetBillingInfoTask.class))
      b();
    while (paramc.getClass() != UpdateBillingAddressTask.class)
      return false;
    UpdateBillingAddressTask localUpdateBillingAddressTask = (UpdateBillingAddressTask)paramc;
    this.d.v();
    if (localUpdateBillingAddressTask.h())
      if ("PARAMETER_MISSING".equals(localUpdateBillingAddressTask.j()))
        this.d.b(2131296846);
    while (true)
    {
      return true;
      if ("NOT_FOUND".equals(localUpdateBillingAddressTask.j()))
      {
        this.d.b(2131296847);
      }
      else
      {
        this.d.b(2131296432);
        continue;
        if ((this.h != null) && (this.h.isShowing()))
          this.h.dismiss();
        b();
        this.d.b(2131296850);
      }
    }
  }

  public final String l()
  {
    return "/Billing_Address";
  }

  public final String m()
  {
    return this.d.getString(2131296829);
  }

  public final int n()
  {
    return 2131558831;
  }

  public final boolean o()
  {
    return true;
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903077, null);
    this.a = ((TextView)localView.findViewById(2131558545));
    this.b = ((TextView)localView.findViewById(2131558546));
    this.f = ((TextView)localView.findViewById(2131558547));
    this.g = ((TextView)localView.findViewById(2131558548));
    ((Button)localView.findViewById(2131558549)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        c.a(c.this, c.a(c.this));
      }
    });
    return localView;
  }

  public final void onResume()
  {
    super.onResume();
    b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.c
 * JD-Core Version:    0.6.2
 */