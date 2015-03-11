package android.preference.enflick.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.tasks.ImportSMSTask;
import textnow.z.u;

public class ImportSMSPreference extends SelectablePreference
{
  protected u a;
  protected MainActivity b;

  public ImportSMSPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new u(paramContext);
    this.b = ((MainActivity)paramContext);
    setEnabled(this.a.S());
  }

  protected void onClick()
  {
    super.onClick();
    if (this.a.S())
    {
      new ImportSMSTask().a(getContext(), MainActivity.class);
      this.b.h(false);
      this.b.g(true);
    }
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    return super.onCreateView(paramViewGroup);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.ImportSMSPreference
 * JD-Core Version:    0.6.2
 */