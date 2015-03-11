package com.enflick.android.TextNow.activities.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.tasks.UpdateUserInfoPasswordTask;
import textnow.u.r;

public class PasswordPreference extends SettingsDialogPreference
  implements c
{
  private EditText c;
  private EditText d;
  private EditText e;
  private r f;

  public PasswordPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private boolean c()
  {
    int i;
    int k;
    label79: int n;
    label155: int i1;
    if ((this.c.getText().toString().length() == 0) && (this.f.K()))
    {
      Toast.makeText(getContext(), 2131493212, 0).show();
      i = 0;
      if (i == 0)
        break label279;
      if (this.d.getText().toString().length() >= 8)
        break label261;
      Toast.makeText(getContext(), 2131493071, 0).show();
      k = 1;
      if (k != 0)
        break label279;
      int m = -30 + this.d.getText().toString().length();
      if (m <= 0)
        break label267;
      MainActivity localMainActivity1 = this.a;
      MainActivity localMainActivity2 = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(m);
      Toast.makeText(localMainActivity1, localMainActivity2.getString(2131493070, arrayOfObject), 0).show();
      n = 1;
      if (n != 0)
        break label279;
      if (this.d.getText().toString().equals(this.e.getText().toString()))
        break label273;
      Toast.makeText(getContext(), 2131493211, 0).show();
      i1 = 0;
      label202: if (i1 == 0)
        break label279;
    }
    label261: label267: label273: label279: for (int j = 1; ; j = 0)
    {
      if (j != 0)
      {
        b(true);
        if (this.f.K())
          break label284;
        new UpdateUserInfoPasswordTask(null, this.d.getText().toString()).b(this.a);
      }
      return false;
      i = 1;
      break;
      k = 0;
      break label79;
      n = 0;
      break label155;
      i1 = 1;
      break label202;
    }
    label284: new UpdateUserInfoPasswordTask(this.c.getText().toString(), this.d.getText().toString()).b(this.a);
    return false;
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
    a.b("change_password");
    return c();
  }

  protected View onCreateDialogView()
  {
    View localView = super.onCreateDialogView();
    this.c = ((EditText)localView.findViewById(2131165662));
    this.c.setImeOptions(5);
    this.d = ((EditText)localView.findViewById(2131165663));
    this.d.setImeOptions(5);
    this.f = new r(getContext());
    if (!this.f.K())
    {
      this.c.setVisibility(8);
      localView.findViewById(2131165661).setVisibility(8);
      this.d.requestFocus();
    }
    this.e = ((EditText)localView.findViewById(2131165664));
    this.e.setImeOptions(6);
    this.e.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if (paramAnonymousInt == 6)
        {
          if (PasswordPreference.a(PasswordPreference.this))
            PasswordPreference.this.onActivityDestroy();
          return true;
        }
        return false;
      }
    });
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.PasswordPreference
 * JD-Core Version:    0.6.2
 */