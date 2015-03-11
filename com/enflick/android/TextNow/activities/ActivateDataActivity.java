package com.enflick.android.TextNow.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.i;
import android.support.v4.app.n;
import android.support.v4.app.s;
import android.text.TextUtils;
import com.enflick.android.TextNow.TextNowApp;
import textnow.z.u;

public class ActivateDataActivity extends an
{
  private boolean a = false;
  private av b;

  public final void a(i parami, String paramString)
  {
    parami.show(getSupportFragmentManager(), paramString);
  }

  public final void a(av paramav, boolean paramBoolean)
  {
    this.b = paramav;
    n localn = getSupportFragmentManager();
    while ((paramBoolean) && (localn.c()));
    s locals = localn.a();
    locals.b(2131558513, paramav);
    if (!paramBoolean)
      locals.a(null);
    locals.b();
  }

  protected final void a(com.enflick.android.TextNow.tasks.c paramc)
  {
    super.a(paramc);
    if ((TextUtils.isEmpty(this.k.c())) && (!TextUtils.isEmpty(this.k.m())))
    {
      v();
      AreaCodeActivity.a(this, 20, true);
    }
    while ((this.k.l()) && (!TextUtils.isEmpty(this.k.m())) && (!TextUtils.isEmpty(this.k.c())))
    {
      boolean bool = c(paramc.j());
      if (bool)
        v();
      if (this.b != null)
        this.b.a(paramc, bool);
      return;
    }
    v();
    TextNowApp.b();
    finish();
    WelcomeActivity.a(this);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903065);
    this.a = getIntent().getBooleanExtra("extra_show_eli", false);
    a(textnow.o.c.a(this.a), true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ActivateDataActivity
 * JD-Core Version:    0.6.2
 */