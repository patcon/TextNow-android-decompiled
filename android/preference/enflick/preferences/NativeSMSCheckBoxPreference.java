package android.preference.enflick.preferences;

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
import textnow.v.z;
import textnow.z.u;

public class NativeSMSCheckBoxPreference extends CheckBoxPreference
{
  protected MainActivity a;
  protected u b;

  public NativeSMSCheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b = new u(paramContext);
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
      localBuilder.setMessage(2131296639).setCancelable(false).setPositiveButton(2131296427, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          NativeSMSCheckBoxPreference.this.getPreferenceManager().findPreference("userinfo_unified_import").setEnabled(true);
          z.a(NativeSMSCheckBoxPreference.this.a);
        }
      }).setNegativeButton(2131296425, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          NativeSMSCheckBoxPreference.this.getPreferenceManager().findPreference("userinfo_unified_import").setEnabled(false);
          NativeSMSCheckBoxPreference.this.persistBoolean(false);
          NativeSMSCheckBoxPreference.this.setChecked(false);
        }
      });
      AlertDialog localAlertDialog = localBuilder.create();
      localAlertDialog.setTitle(2131296674);
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
      this.b.B();
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.NativeSMSCheckBoxPreference
 * JD-Core Version:    0.6.2
 */