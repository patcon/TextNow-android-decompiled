package com.enflick.android.TextNow.activities;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import com.enflick.android.TextNow.ads.b;
import com.enflick.android.TextNow.tasks.c;
import java.lang.reflect.Field;
import textnow.aa.a;
import textnow.z.u;

public abstract class av extends Fragment
{
  private static final Field a;
  protected u c;
  protected MainActivity d;
  protected IBinder e;

  static
  {
    Field localField = null;
    try
    {
      localField = Fragment.class.getDeclaredField("mChildFragmentManager");
      localField.setAccessible(true);
      label15: a = localField;
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label15;
    }
  }

  public String A()
  {
    return null;
  }

  public boolean C()
  {
    return false;
  }

  protected abstract boolean a(c paramc, boolean paramBoolean);

  public void e()
  {
    if (this.e == null)
      this.e = y();
    if ((this.e != null) && (this.d != null))
    {
      ((InputMethodManager)this.d.getSystemService("input_method")).hideSoftInputFromWindow(this.e, 0);
      this.d.e(true);
    }
  }

  protected abstract String l();

  protected abstract String m();

  public int n()
  {
    return -1;
  }

  protected abstract boolean o();

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (this.d != null)
      this.d.r();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((getActivity() instanceof MainActivity))
      this.d = ((MainActivity)getActivity());
    this.c = new u(getActivity());
    if (!TextUtils.isEmpty(l()))
      b.b(l());
  }

  public void onDetach()
  {
    super.onDetach();
    if (a != null);
    try
    {
      a.set(this, null);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public void onResume()
  {
    super.onResume();
    if (this.d != null)
    {
      this.d.s();
      if (this.d.H())
        new Handler().post(new Runnable()
        {
          public final void run()
          {
            av.this.d.I();
          }
        });
    }
    a.a(getActivity()).a();
  }

  protected IBinder y()
  {
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.av
 * JD-Core Version:    0.6.2
 */