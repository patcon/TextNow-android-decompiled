package android.preference.enflick.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.enflick.android.TextNow.ads.b;
import com.enflick.android.TextNow.tasks.UpdateUserInfoTask;
import com.enflick.android.TextNow.views.EmailEditPreference;
import com.enflick.android.TextNow.views.d;
import java.util.HashMap;
import java.util.Locale;
import textnow.z.u;

public class EmailPreference extends SettingsDialogPreference
  implements c
{
  private EmailEditPreference c;

  public EmailPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b = new u(paramContext);
  }

  private boolean c()
  {
    if (this.c.h())
    {
      this.c.g();
      if (this.c.c())
      {
        b(true);
        HashMap localHashMap = new HashMap();
        localHashMap.put("userinfo_email", this.c.toString().toLowerCase(Locale.ENGLISH));
        new UpdateUserInfoTask(localHashMap).b(this.a);
      }
      return false;
    }
    return true;
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
      setSummary(this.b.e());
    if (b())
    {
      b(false);
      if (paramBoolean)
        onActivityDestroy();
    }
  }

  protected final boolean a()
  {
    b.b("change_email");
    return c();
  }

  protected View onCreateDialogView()
  {
    View localView = super.onCreateDialogView();
    this.c = ((EmailEditPreference)localView.findViewById(2131558957));
    this.c.b().setSelectAllOnFocus(true);
    this.c.b().setText(this.b.e());
    this.c.b().setImeOptions(6);
    this.c.b().setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if (paramAnonymousInt == 6)
        {
          if (EmailPreference.a(EmailPreference.this))
            EmailPreference.this.onActivityDestroy();
          return true;
        }
        return false;
      }
    });
    this.c.a(d.c);
    return localView;
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    setSummary(this.b.e());
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.EmailPreference
 * JD-Core Version:    0.6.2
 */