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
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.tasks.GetBillingInfoTask;
import com.enflick.android.TextNow.tasks.UpdateBillingAddressTask;
import textnow.u.q;

public final class c extends ao
{
  private TextView a;
  private TextView b;
  private TextView g;
  private TextView h;
  private AlertDialog i;

  public static c a()
  {
    return new c();
  }

  private void b()
  {
    q localq = new q(this.e);
    String str1 = localq.f();
    String str2 = localq.g();
    String str3 = localq.h();
    String str4 = localq.i();
    String str5 = localq.j();
    String str6 = localq.l();
    String str7 = localq.k();
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
      localTextView2 = this.g;
      localStringBuilder2 = new StringBuilder();
      if (!TextUtils.isEmpty(str4))
        break label198;
    }
    label198: for (String str9 = ""; ; str9 = str4 + ", ")
    {
      localTextView2.setText(str9 + str5 + " " + str7);
      this.h.setText(str6);
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
    this.e.r();
    if (localUpdateBillingAddressTask.h())
      if ("PARAMETER_MISSING".equals(localUpdateBillingAddressTask.j()))
        this.e.c(2131493472);
    while (true)
    {
      return true;
      if ("NOT_FOUND".equals(localUpdateBillingAddressTask.j()))
      {
        this.e.c(2131493473);
      }
      else
      {
        this.e.c(2131493025);
        continue;
        if ((this.i != null) && (this.i.isShowing()))
          this.i.dismiss();
        b();
        this.e.c(2131493476);
      }
    }
  }

  public final String k()
  {
    return "/Billing_Address";
  }

  public final String l()
  {
    return this.e.getString(2131493438);
  }

  public final int m()
  {
    return 2131165540;
  }

  public final boolean n()
  {
    return true;
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903073, null);
    this.a = ((TextView)localView.findViewById(2131165311));
    this.b = ((TextView)localView.findViewById(2131165312));
    this.g = ((TextView)localView.findViewById(2131165313));
    this.h = ((TextView)localView.findViewById(2131165314));
    ((Button)localView.findViewById(2131165315)).setOnClickListener(new View.OnClickListener()
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.c
 * JD-Core Version:    0.6.2
 */