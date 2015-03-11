package com.enflick.android.TextNow.activities;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.tasks.c;
import textnow.q.o;
import textnow.u.r;
import textnow.u.s;

public abstract class ao extends Fragment
{
  protected r c;
  protected s d;
  protected MainActivity e;
  protected IBinder f;

  public boolean B()
  {
    return false;
  }

  public final void C()
  {
    if (this.f == null)
      this.f = x();
    if (this.f != null)
    {
      ((InputMethodManager)this.e.getSystemService("input_method")).hideSoftInputFromWindow(this.f, 0);
      if (this.e != null)
        this.e.a(true);
    }
  }

  protected abstract boolean a(c paramc, boolean paramBoolean);

  protected abstract String k();

  protected abstract String l();

  public int m()
  {
    return -1;
  }

  protected abstract boolean n();

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((getActivity() instanceof MainActivity))
      this.e = ((MainActivity)getActivity());
    this.c = new r(getActivity());
    this.d = new s(getActivity());
    if (!TextUtils.isEmpty(k()))
      a.b(k());
  }

  public void onResume()
  {
    super.onResume();
    if (this.e != null)
    {
      this.e.t();
      if (this.e.B())
        this.e.C();
    }
    o.a(getActivity()).a();
  }

  protected IBinder x()
  {
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ao
 * JD-Core Version:    0.6.2
 */