package com.enflick.android.TextNow.activities.phone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.s;
import android.view.KeyEvent;
import android.view.Window;
import com.enflick.android.TextNow.activities.an;
import com.enflick.android.TextNow.activities.av;
import java.util.Stack;
import textnow.z.f;

public class KeyguardDialerActivity extends an
  implements p
{
  public static boolean a = false;
  private android.support.v4.app.n b;
  private Stack<av> c;

  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, KeyguardDialerActivity.class);
    localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  private void a(Intent paramIntent)
  {
    if ("widget_action_answer".equals(paramIntent.getAction()))
      if ((g() instanceof DialerFragment))
        ((DialerFragment)g()).i();
    while ((!"widget_action_reject".equals(paramIntent.getAction())) || (!(g() instanceof DialerFragment)))
      return;
    ((DialerFragment)g()).j();
  }

  private av g()
  {
    if (this.c.empty())
      return null;
    return (av)this.c.peek();
  }

  protected final void a(Bundle paramBundle)
  {
    if (!a);
    f localf;
    do
    {
      String str;
      do
      {
        do
          return;
        while (paramBundle == null);
        str = paramBundle.getString("callid");
        localf = (f)paramBundle.getSerializable("contact");
      }
      while (localf == null);
      new StringBuilder().append("Showing incoming call dialog for callId ").append(str).append(" and number ").append(localf.a()).toString();
    }
    while (!h.d());
    try
    {
      DialerFragment localDialerFragment = DialerFragment.a(localf, null, true, false, this);
      new StringBuilder().append("Pushing child fragment ").append(localDialerFragment).toString();
      s locals = this.b.a();
      locals.a(4099);
      if (g() != null)
        locals.b(g());
      this.c.push(localDialerFragment);
      locals.b(2131558797, localDialerFragment);
      new StringBuilder().append("commitFragmentTransaction: ").append(locals).toString();
      if ((!x()) && (!locals.c()))
        locals.b();
      new StringBuilder().append("New back stack depth: ").append(this.c.size()).toString();
      supportInvalidateOptionsMenu();
      return;
    }
    catch (n localn)
    {
      localn.printStackTrace();
    }
  }

  public final void b(textnow.z.h paramh)
  {
    finish();
  }

  public void onBackPressed()
  {
    if ((g() != null) && (g().C()))
      return;
    super.onBackPressed();
  }

  public void onCreate(Bundle paramBundle)
  {
    getWindow().addFlags(2621568);
    super.onCreate(paramBundle);
    a = true;
    setContentView(2130903148);
    a(false, true);
    this.b = getSupportFragmentManager();
    this.c = new Stack();
    if (textnow.v.a.a)
      android.support.v4.app.n.a(true);
    a(getIntent());
  }

  public void onDestroy()
  {
    super.onDestroy();
    a = false;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (((paramInt == 25) || (paramInt == 24) || (paramInt == 26)) && ((g() instanceof DialerFragment)))
      ((DialerFragment)g()).h();
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }

  protected void onPause()
  {
    super.onPause();
    try
    {
      h localh = h.a();
      h.c();
      if (h.c(localh.y()))
      {
        w localw = localh.p();
        if (localw != null)
          textnow.aa.a.a(this).a(localw.b(), System.currentTimeMillis() - (SystemClock.uptimeMillis() - localw.j()));
      }
      return;
    }
    catch (n localn)
    {
    }
  }

  protected void onResume()
  {
    super.onResume();
    try
    {
      h localh = h.a();
      h.b();
      localh.C();
      label15: setVolumeControlStream(0);
      return;
    }
    catch (n localn)
    {
      break label15;
    }
  }

  public final void s()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.KeyguardDialerActivity
 * JD-Core Version:    0.6.2
 */