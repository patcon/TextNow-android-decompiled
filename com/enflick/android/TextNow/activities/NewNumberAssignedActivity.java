package com.enflick.android.TextNow.activities;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.enflick.android.TextNow.ads.a;
import textnow.q.b;
import textnow.u.r;

public class NewNumberAssignedActivity extends ae
  implements View.OnClickListener
{
  protected final int g()
  {
    return 2130903158;
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
    case 2131165590:
    case 2131165591:
    }
    while (true)
    {
      finish();
      return;
      setResult(-1);
      a.b("press_try_number");
      continue;
      setResult(0);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = b.f(new r(this).c());
    ((TextView)findViewById(2131165589)).setText(str);
    findViewById(2131165590).setOnClickListener(this);
    findViewById(2131165591).setOnClickListener(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.NewNumberAssignedActivity
 * JD-Core Version:    0.6.2
 */