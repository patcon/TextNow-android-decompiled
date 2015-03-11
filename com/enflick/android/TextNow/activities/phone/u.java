package com.enflick.android.TextNow.activities.phone;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.enflick.android.TextNow.activities.an;
import java.util.HashMap;
import textnow.ae.a;
import textnow.v.b;

final class u
  implements TextWatcher
{
  private String b;

  private u(DialerFragment paramDialerFragment)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    boolean bool = true;
    String str1 = paramEditable.toString();
    if ("*#*111*#*".equals(str1))
    {
      paramEditable.clear();
      DialerFragment.a(this.a).b(2131296783);
      DialerFragment.a(this.a, bool);
      DialerFragment.a(this.a, new a(DialerFragment.a(this.a), DialerFragment.b(this.a)));
    }
    Intent localIntent1;
    if (b.h(DialerFragment.a(this.a)))
    {
      if (!"##1111".equals(str1))
        break label229;
      localIntent1 = new Intent();
      localIntent1.setComponent(new ComponentName("com.android.contacts", "com.android.contacts.activities.DialtactsActivity"));
    }
    while (true)
    {
      try
      {
        this.a.startActivity(localIntent1);
        if (bool)
          paramEditable.clear();
        if ((DialerFragment.c(this.a)) && (DialerFragment.d(this.a).getVisibility() == 0))
        {
          DialerFragment.b(this.a, false);
          DialerFragment.e(this.a);
        }
        if (!str1.equals(this.b))
        {
          this.b = str1;
          String str2 = b.b(str1);
          if (str2 != null)
            DialerFragment.a(this.a, new String(str2));
        }
        return;
      }
      catch (Exception localException)
      {
        bool = false;
        continue;
      }
      label229: if (DialerFragment.p().containsKey(str1))
      {
        String str3 = (String)DialerFragment.p().get(str1);
        paramEditable.clear();
        Intent localIntent2 = new Intent("android.provider.Telephony.SECRET_CODE", Uri.parse(str3));
        localIntent2.setFlags(48);
        localIntent2.setComponent(new ComponentName("com.android.hiddenmenu", "com.android.hiddenmenu.HiddenmenuBroadcastReceiver"));
        DialerFragment.a(this.a).sendBroadcast(localIntent2);
      }
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.u
 * JD-Core Version:    0.6.2
 */