package com.enflick.android.TextNow.activities.phone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.ac;
import android.support.v4.app.y;
import android.view.KeyEvent;
import android.view.Window;
import com.enflick.android.TextNow.activities.ah;
import com.enflick.android.TextNow.activities.ao;
import java.util.Stack;
import textnow.q.a;
import textnow.q.o;
import textnow.u.f;

public class KeyguardDialerActivity extends ah
  implements l
{
  public static boolean b = false;
  private y c;
  private Stack<ao> d;

  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, KeyguardDialerActivity.class);
    localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  private ao g()
  {
    if (this.d.empty())
      return null;
    return (ao)this.d.peek();
  }

  protected final void a(Bundle paramBundle)
  {
    if (!b);
    textnow.u.d locald;
    do
    {
      String str;
      do
      {
        do
          return;
        while (paramBundle == null);
        str = paramBundle.getString("callid");
        locald = (textnow.u.d)paramBundle.getSerializable("contact");
      }
      while (locald == null);
      new StringBuilder().append("Showing incoming call dialog for callId ").append(str).append(" and number ").append(locald.a()).toString();
    }
    while (!d.d());
    try
    {
      DialerFragment localDialerFragment = DialerFragment.a(locald, null, true, false, this);
      new StringBuilder().append("Pushing child fragment ").append(localDialerFragment).toString();
      ac localac = this.c.a();
      localac.a(4099);
      if (g() != null)
        localac.b(g());
      this.d.push(localDialerFragment);
      localac.a(16908290, localDialerFragment);
      new StringBuilder().append("commitFragmentTransaction: ").append(localac).toString();
      if ((!u()) && (!localac.c()))
        localac.b();
      new StringBuilder().append("New back stack depth: ").append(this.d.size()).toString();
      supportInvalidateOptionsMenu();
      return;
    }
    catch (j localj)
    {
      localj.printStackTrace();
    }
  }

  public final void b(f paramf)
  {
    finish();
  }

  public void onBackPressed()
  {
    if ((g() != null) && (g().B()))
      return;
    super.onBackPressed();
  }

  public void onCreate(Bundle paramBundle)
  {
    getWindow().addFlags(2621568);
    super.onCreate(paramBundle);
    b = true;
    a(false, true);
    this.c = getSupportFragmentManager();
    this.d = new Stack();
    if (a.a)
      y.a(true);
  }

  public void onDestroy()
  {
    super.onDestroy();
    b = false;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (((paramInt == 25) || (paramInt == 24) || (paramInt == 26)) && ((g() instanceof DialerFragment)))
      ((DialerFragment)g()).g();
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
    try
    {
      d locald = d.a();
      d.c();
      if (d.c(locald.y()))
      {
        s locals = locald.p();
        if (locals != null)
          o.a(this).a(locals.b(), System.currentTimeMillis() - (SystemClock.uptimeMillis() - locals.j()));
      }
      return;
    }
    catch (j localj)
    {
    }
  }

  protected void onResume()
  {
    super.onResume();
    try
    {
      d locald = d.a();
      d.b();
      locald.C();
      label15: setVolumeControlStream(2);
      return;
    }
    catch (j localj)
    {
      break label15;
    }
  }

  public final void t()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.KeyguardDialerActivity
 * JD-Core Version:    0.6.2
 */