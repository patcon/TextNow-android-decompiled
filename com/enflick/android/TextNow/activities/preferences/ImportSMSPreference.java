package com.enflick.android.TextNow.activities.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.tasks.ImportSMSTask;
import textnow.u.r;

public class ImportSMSPreference extends SelectablePreference
{
  protected r a;
  protected MainActivity b;

  public ImportSMSPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new r(paramContext);
    this.b = ((MainActivity)paramContext);
    setEnabled(this.a.Q());
  }

  protected void onClick()
  {
    super.onClick();
    if (this.a.Q())
    {
      new ImportSMSTask().a(getContext(), MainActivity.class);
      this.b.e(false);
      this.b.d(true);
    }
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    return super.onCreateView(paramViewGroup);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.ImportSMSPreference
 * JD-Core Version:    0.6.2
 */