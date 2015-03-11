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
import com.enflick.android.TextNow.ads.b;
import com.enflick.android.TextNow.tasks.UpdateUserInfoTask;
import java.util.HashMap;
import textnow.z.u;

public class SignaturePreference extends SettingsDialogPreference
  implements c
{
  private EditText c;

  public SignaturePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void c()
  {
    String str = this.b.s();
    if (TextUtils.isEmpty(str))
    {
      setSummary(2131296646);
      return;
    }
    setSummary(str);
  }

  private boolean d()
  {
    int i;
    if (!this.b.s().equals(this.c.getText().toString().trim()))
      i = 1;
    while (i != 0)
    {
      String str1 = this.c.getText().toString().trim();
      if (str1.getBytes().length > 60)
      {
        this.a.b(2131296647);
        return false;
        i = 0;
      }
      else
      {
        if (TextUtils.isEmpty(str1));
        for (String str2 = "empty"; ; str2 = "not_empty")
        {
          b.a("change_signature", "action", str2);
          b(true);
          HashMap localHashMap = new HashMap();
          localHashMap.put("userinfo_signature", str1);
          new UpdateUserInfoTask(localHashMap).b(this.a);
          return false;
        }
      }
    }
    return true;
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
      c();
    if (b())
    {
      b(false);
      if (paramBoolean)
        onActivityDestroy();
    }
  }

  protected final boolean a()
  {
    return d();
  }

  protected View onCreateDialogView()
  {
    View localView = super.onCreateDialogView();
    this.c = ((EditText)localView.findViewById(2131558967));
    this.c.setSelectAllOnFocus(true);
    this.c.setText(this.b.s());
    this.c.setImeOptions(6);
    this.c.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if (paramAnonymousInt == 6)
        {
          if (SignaturePreference.a(SignaturePreference.this))
            SignaturePreference.this.onActivityDestroy();
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
    c();
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.SignaturePreference
 * JD-Core Version:    0.6.2
 */