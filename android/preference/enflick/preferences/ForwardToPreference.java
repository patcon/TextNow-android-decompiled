package android.preference.enflick.preferences;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.tasks.CallForwardingEnableTask;
import textnow.v.b;
import textnow.z.u;

public class ForwardToPreference extends SettingsDialogPreference
  implements c
{
  private EditText c;

  public ForwardToPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private boolean c()
  {
    int i;
    if (!this.b.O().equals(this.c.getText().toString().trim()))
      i = 1;
    while (i != 0)
      if (!b.a(this.c.getText().toString().trim()))
      {
        this.a.b(2131296547);
        return false;
        i = 0;
      }
      else
      {
        b(true);
        new CallForwardingEnableTask(this.b.b(), this.c.getText().toString().trim()).b(getContext());
        return false;
      }
    return true;
  }

  public final void a(boolean paramBoolean)
  {
    if (b())
    {
      b(false);
      if (paramBoolean)
        onActivityDestroy();
    }
  }

  protected final boolean a()
  {
    return c();
  }

  protected View onCreateDialogView()
  {
    View localView = super.onCreateDialogView();
    this.c = ((EditText)localView.findViewById(2131558958));
    this.c.setSelectAllOnFocus(true);
    this.c.setText(this.b.O());
    this.c.setImeOptions(6);
    this.c.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if (paramAnonymousInt == 6)
        {
          if (ForwardToPreference.a(ForwardToPreference.this))
            ForwardToPreference.this.onActivityDestroy();
          return true;
        }
        return false;
      }
    });
    return localView;
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    String str = this.b.O();
    if (TextUtils.isEmpty(str))
    {
      setSummary(2131296686);
      return localView;
    }
    setSummary(str);
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.ForwardToPreference
 * JD-Core Version:    0.6.2
 */