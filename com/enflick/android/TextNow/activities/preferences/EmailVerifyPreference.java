package com.enflick.android.TextNow.activities.preferences;

import android.content.Context;
import android.content.res.Resources;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.flurry.android.FlurryAgent;
import textnow.u.r;

public class EmailVerifyPreference extends Preference
{
  private r a;
  private TextView b = null;
  private TextView c = null;
  private View d;
  private MainActivity e;

  public EmailVerifyPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new r(paramContext);
    this.e = ((MainActivity)paramContext);
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    this.d = super.onCreateView(paramViewGroup);
    boolean bool = this.a.f();
    this.b = ((TextView)this.d.findViewById(2131165667));
    this.c = ((TextView)this.d.findViewById(2131165668));
    if (bool)
    {
      this.b.setText(2131493204);
      this.b.setTextColor(this.e.getResources().getColor(2131296310));
      this.c.setVisibility(8);
      this.d.setClickable(false);
    }
    while (true)
    {
      return this.d;
      this.b.setText(2131493205);
      this.b.setTextColor(-65536);
      this.c.setText(2131493206);
      this.d.setClickable(true);
      this.d.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          EmailVerifyPreference.a(EmailVerifyPreference.this).setClickable(false);
          FlurryAgent.logEvent("resend_verify");
          EmailVerifyPreference.b(EmailVerifyPreference.this);
        }
      });
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.EmailVerifyPreference
 * JD-Core Version:    0.6.2
 */