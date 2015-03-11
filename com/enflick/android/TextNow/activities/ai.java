package com.enflick.android.TextNow.activities;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.m;
import android.support.v7.app.d;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import com.enflick.android.TextNow.GCMIntentService;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.pullservice.TNPullService;
import com.enflick.android.TextNow.tasks.c;
import com.vessel.VesselAB;
import textnow.u.r;
import textnow.u.s;

public abstract class ai extends d
{
  private boolean b = false;
  private boolean c = false;
  private Dialog d;
  protected r h;
  protected s i;
  protected BroadcastReceiver j = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if ("task_broadcast_intent".equals(paramAnonymousIntent.getAction()))
      {
        localc = (c)paramAnonymousIntent.getSerializableExtra("task");
        localClass = localc.f();
        if ((ai.this.getClass() == localClass) || (GCMIntentService.class == localClass) || (TNPullService.class == localClass))
        {
          new StringBuilder().append(ai.this.getClass().getSimpleName()).append(" received BROADCAST task:").append(localc).toString();
          ai.this.a(localc);
        }
      }
      while (!"incoming_call".equals(paramAnonymousIntent.getAction()))
      {
        c localc;
        Class localClass;
        return;
        new StringBuilder().append(ai.this.getClass().getSimpleName()).append(" IGNORING BROADCAST task:").append(localc.getClass().getSimpleName()).append(" receiver:").append(localClass.getSimpleName()).toString();
        return;
      }
      ai.this.a(paramAnonymousIntent.getExtras());
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
    Bundle localBundle = new Bundle();
    localBundle.putString("message", paramString);
    localBundle.putBoolean("cancelable", paramBoolean);
    showDialog(-1, localBundle);
  }

  public final void b(String paramString)
  {
    Toast.makeText(this, paramString, 1).show();
  }

  public final void c(int paramInt)
  {
    Toast.makeText(this, paramInt, 0).show();
  }

  public final void d(int paramInt)
  {
    Toast.makeText(this, paramInt, 1).show();
  }

  public void onBackPressed()
  {
    try
    {
      VesselAB.onPause(this);
      label4: super.onBackPressed();
      return;
    }
    catch (Exception localException)
    {
      break label4;
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    new StringBuilder().append(getClass().getSimpleName()).append(" on create: register receiver").toString();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("task_broadcast_intent");
    localIntentFilter.addAction("incoming_call");
    m.a(this).a(this.j, localIntentFilter);
    this.h = new r(this);
    this.i = new s(this);
  }

  protected Dialog onCreateDialog(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default:
      return super.onCreateDialog(paramInt, paramBundle);
    case -1:
    }
    if (this.d == null)
    {
      this.d = new Dialog(this);
      this.d.requestWindowFeature(1);
      this.d.setContentView(2130903164);
    }
    return this.d;
  }

  protected void onDestroy()
  {
    this.c = true;
    new StringBuilder().append(getClass().getSimpleName()).append(" on destroy: unregister receiver").toString();
    m.a(this).a(this.j);
    if (getWindow() != null)
      getWindow().setBackgroundDrawable(null);
    super.onDestroy();
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    m.a(this).a(this.j);
  }

  protected void onPause()
  {
    TextNowApp.a(false);
    try
    {
      VesselAB.onPause(this);
      label8: this.b = false;
      super.onPause();
      return;
    }
    catch (Exception localException)
    {
      break label8;
    }
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
    TextView localTextView = (TextView)paramDialog.findViewById(2131165605);
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
    TextNowApp.a(true);
    try
    {
      VesselAB.onResume(this);
      label8: this.b = true;
      super.onResume();
      return;
    }
    catch (Exception localException)
    {
      break label8;
    }
  }

  protected void onStart()
  {
    super.onStart();
    a.a(this);
  }

  protected void onStop()
  {
    super.onStop();
    a.b(this);
  }

  public final void r()
  {
    if ((this.d != null) && (this.d.isShowing()))
      this.d.dismiss();
  }

  protected final boolean s()
  {
    return this.b;
  }

  public final boolean u()
  {
    return this.c;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ai
 * JD-Core Version:    0.6.2
 */