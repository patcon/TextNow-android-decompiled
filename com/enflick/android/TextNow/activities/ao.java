package com.enflick.android.TextNow.activities;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.m;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import com.enflick.android.TextNow.GCMIntentService;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.pullservice.TNPullService;
import com.enflick.android.TextNow.tasks.c;
import textnow.z.s;
import textnow.z.u;

public abstract class ao extends android.support.v7.app.b
{
  private boolean a = false;
  private boolean b = false;
  private Dialog c;
  protected boolean i = false;
  protected boolean j = true;
  protected u k;
  protected s l;
  protected BroadcastReceiver m = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if ("task_broadcast_intent".equals(paramAnonymousIntent.getAction()))
      {
        localc = (c)paramAnonymousIntent.getSerializableExtra("task");
        localClass = localc.f();
        if ("CERT_ERROR".equals(localc.j()))
          ao.this.b(2131296994);
        if ((ao.this.getClass() == localClass) || (GCMIntentService.class == localClass) || (TNPullService.class == localClass))
        {
          new StringBuilder().append(ao.this.getClass().getSimpleName()).append(" received BROADCAST task:").append(localc).toString();
          ao.this.a(localc);
        }
      }
      while (!"incoming_call".equals(paramAnonymousIntent.getAction()))
      {
        c localc;
        Class localClass;
        return;
        new StringBuilder().append(ao.this.getClass().getSimpleName()).append(" IGNORING BROADCAST task:").append(localc.getClass().getSimpleName()).append(" receiver:").append(localClass.getSimpleName()).toString();
        return;
      }
      ao.this.a(paramAnonymousIntent.getExtras());
    }
  };

  public final void a(int paramInt, boolean paramBoolean)
  {
    a(getString(paramInt), paramBoolean);
  }

  protected void a(Bundle paramBundle)
  {
  }

  protected void a(c paramc)
  {
  }

  public final void a(String paramString)
  {
    Toast.makeText(this, paramString, 0).show();
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    if (isFinishing())
      return;
    Bundle localBundle = new Bundle();
    localBundle.putString("message", paramString);
    localBundle.putBoolean("cancelable", paramBoolean);
    showDialog(-1, localBundle);
  }

  public final void b(int paramInt)
  {
    Toast.makeText(this, paramInt, 0).show();
  }

  public final void b(String paramString)
  {
    Toast.makeText(this, paramString, 1).show();
  }

  public final void c(int paramInt)
  {
    Toast.makeText(this, paramInt, 1).show();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (this.i)
      b().b();
    new StringBuilder().append(getClass().getSimpleName()).append(" on create: register receiver").toString();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("task_broadcast_intent");
    localIntentFilter.addAction("incoming_call");
    m.a(this).a(this.m, localIntentFilter);
    this.k = new u(this);
    this.l = new s(this);
  }

  protected Dialog onCreateDialog(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default:
      return super.onCreateDialog(paramInt, paramBundle);
    case -1:
    }
    if (this.c == null)
    {
      this.c = new Dialog(this);
      this.c.requestWindowFeature(1);
      this.c.setContentView(2130903182);
    }
    return this.c;
  }

  protected void onDestroy()
  {
    this.b = true;
    new StringBuilder().append(getClass().getSimpleName()).append(" on destroy: unregister receiver").toString();
    m.a(this).a(this.m);
    if (getWindow() != null)
      getWindow().setBackgroundDrawable(null);
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) && (("LGE".equalsIgnoreCase(Build.BRAND)) || ("LGE".equalsIgnoreCase(Build.MANUFACTURER))))
      return true;
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) && (("LGE".equalsIgnoreCase(Build.BRAND)) || ("LGE".equalsIgnoreCase(Build.MANUFACTURER))))
    {
      openOptionsMenu();
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  public void onLowMemory()
  {
    super.onLowMemory();
  }

  protected void onPause()
  {
    if (this.j)
      TextNowApp.a(false);
    this.a = false;
    super.onPause();
  }

  protected void onPrepareDialog(int paramInt, Dialog paramDialog, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default:
      super.onPrepareDialog(paramInt, paramDialog, paramBundle);
      return;
    case -1:
    }
    String str = paramBundle.getString("message");
    boolean bool = paramBundle.getBoolean("cancelable");
    TextView localTextView = (TextView)paramDialog.findViewById(2131558907);
    if (str != null)
    {
      localTextView.setVisibility(0);
      localTextView.setText(str);
    }
    while (true)
    {
      paramDialog.setCancelable(bool);
      return;
      localTextView.setVisibility(8);
    }
  }

  protected void onResume()
  {
    if (this.j)
      TextNowApp.a(true);
    this.a = true;
    super.onResume();
  }

  protected void onStart()
  {
    super.onStart();
    com.enflick.android.TextNow.ads.b.a(this);
  }

  protected void onStop()
  {
    super.onStop();
    com.enflick.android.TextNow.ads.b.b(this);
  }

  public final void v()
  {
    if ((this.c != null) && (this.c.isShowing()))
      this.c.dismiss();
  }

  protected final boolean w()
  {
    return this.a;
  }

  public final boolean x()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ao
 * JD-Core Version:    0.6.2
 */