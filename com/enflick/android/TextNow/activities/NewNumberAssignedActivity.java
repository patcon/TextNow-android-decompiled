package com.enflick.android.TextNow.activities;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import textnow.z.u;

public class NewNumberAssignedActivity extends ak
  implements View.OnClickListener
{
  protected final int g()
  {
    return 2130903174;
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
    case 2131558886:
    case 2131558887:
    }
    while (true)
    {
      finish();
      return;
      setResult(-1);
      com.enflick.android.TextNow.ads.b.b("press_try_number");
      continue;
      setResult(0);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = textnow.v.b.f(new u(this).c());
    ((TextView)findViewById(2131558885)).setText(str);
    findViewById(2131558886).setOnClickListener(this);
    findViewById(2131558887).setOnClickListener(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.NewNumberAssignedActivity
 * JD-Core Version:    0.6.2
 */