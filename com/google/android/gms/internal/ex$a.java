package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

class ex$a extends MutableContextWrapper
{
  private Context lz;
  private Activity sG;

  public ex$a(Context paramContext)
  {
    super(paramContext);
    setBaseContext(paramContext);
  }

  public Context cf()
  {
    return this.sG;
  }

  public void setBaseContext(Context paramContext)
  {
    this.lz = paramContext.getApplicationContext();
    if ((paramContext instanceof Activity));
    for (Activity localActivity = (Activity)paramContext; ; localActivity = null)
    {
      this.sG = localActivity;
      super.setBaseContext(this.lz);
      return;
    }
  }

  public void startActivity(Intent paramIntent)
  {
    if (this.sG != null)
    {
      this.sG.startActivity(paramIntent);
      return;
    }
    paramIntent.setFlags(268435456);
    this.lz.startActivity(paramIntent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ex.a
 * JD-Core Version:    0.6.2
 */