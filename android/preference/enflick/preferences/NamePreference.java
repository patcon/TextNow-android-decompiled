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
import android.widget.Toast;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.ads.b;
import com.enflick.android.TextNow.tasks.UpdateUserInfoTask;
import java.util.HashMap;
import textnow.z.u;

public class NamePreference extends SettingsDialogPreference
  implements c
{
  private EditText c;
  private EditText d;

  public NamePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private boolean c()
  {
    if ((d()) && (TextUtils.isEmpty(this.c.getText().toString().trim())))
    {
      Toast.makeText(getContext(), 2131296487, 0).show();
      return false;
    }
    if ((e()) && (TextUtils.isEmpty(this.d.getText().toString().trim())))
    {
      Toast.makeText(getContext(), 2131296488, 0).show();
      return false;
    }
    if ((d()) || (e()));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        b(true);
        HashMap localHashMap = new HashMap();
        localHashMap.put("userinfo_firstname", this.c.getText().toString().trim());
        localHashMap.put("userinfo_lastname", this.d.getText().toString().trim());
        new UpdateUserInfoTask(localHashMap).a(getContext(), MainActivity.class);
        return false;
      }
      return true;
    }
  }

  private boolean d()
  {
    return !this.b.g().equals(this.c.toString().trim());
  }

  private boolean e()
  {
    return !this.b.h().equals(this.d.toString().trim());
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
      setSummary(this.b.g() + " " + this.b.h());
    if (b())
    {
      b(false);
      if (paramBoolean)
        onActivityDestroy();
    }
  }

  protected final boolean a()
  {
    b.b("change_name");
    return c();
  }

  protected View onCreateDialogView()
  {
    View localView = super.onCreateDialogView();
    this.c = ((EditText)localView.findViewById(2131558960));
    this.c.setText(this.b.g());
    this.c.setImeOptions(5);
    this.d = ((EditText)localView.findViewById(2131558961));
    this.d.setText(this.b.h());
    this.d.setImeOptions(6);
    this.d.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if (paramAnonymousInt == 6)
        {
          if (NamePreference.a(NamePreference.this))
            NamePreference.this.onActivityDestroy();
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
    setSummary(this.b.g() + " " + this.b.h());
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.NamePreference
 * JD-Core Version:    0.6.2
 */