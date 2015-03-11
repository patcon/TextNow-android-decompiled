package com.enflick.android.TextNow.activities.preferences;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.enflick.android.TextNow.activities.MainActivity;
import textnow.q.ad;
import textnow.u.r;

public class NativeSMSCheckBoxPreference extends CheckBoxPreference
{
  protected MainActivity a;
  protected r b;

  public NativeSMSCheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b = new r(paramContext);
    this.a = ((MainActivity)paramContext);
  }

  protected boolean getPersistedBoolean(boolean paramBoolean)
  {
    if (!shouldPersist())
      return paramBoolean;
    return this.b.i(getKey()).booleanValue();
  }

  protected void onClick()
  {
    if (!isChecked())
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
      localBuilder.setMessage(2131493230).setCancelable(false).setPositiveButton(2131493020, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          NativeSMSCheckBoxPreference.this.getPreferenceManager().findPreference("userinfo_unified_import").setEnabled(true);
          ad.a(NativeSMSCheckBoxPreference.this.a);
        }
      }).setNegativeButton(2131493019, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          NativeSMSCheckBoxPreference.this.getPreferenceManager().findPreference("userinfo_unified_import").setEnabled(false);
          NativeSMSCheckBoxPreference.this.persistBoolean(false);
          NativeSMSCheckBoxPreference.this.setChecked(false);
        }
      });
      AlertDialog localAlertDialog = localBuilder.create();
      localAlertDialog.setTitle(2131493265);
      localAlertDialog.show();
    }
    while (true)
    {
      super.onClick();
      return;
      getPreferenceManager().findPreference("userinfo_unified_import").setEnabled(false);
    }
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    return super.onCreateView(paramViewGroup);
  }

  protected boolean persistBoolean(boolean paramBoolean)
  {
    if (shouldPersist())
    {
      boolean bool = false;
      if (!paramBoolean)
        bool = true;
      if (paramBoolean == getPersistedBoolean(bool))
        return true;
      this.b.a(getKey(), paramBoolean);
      if (!paramBoolean)
        this.b.d(-1L);
      this.b.n();
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.NativeSMSCheckBoxPreference
 * JD-Core Version:    0.6.2
 */