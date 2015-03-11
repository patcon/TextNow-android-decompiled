package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@ez
public class gv$a extends MutableContextWrapper
{
  private Context mD;
  private Activity wO;

  public gv$a(Context paramContext)
  {
    super(paramContext);
    setBaseContext(paramContext);
  }

  public Context dz()
  {
    return this.wO;
  }

  public void setBaseContext(Context paramContext)
  {
    this.mD = paramContext.getApplicationContext();
    if ((paramContext instanceof Activity));
    for (Activity localActivity = (Activity)paramContext; ; localActivity = null)
    {
      this.wO = localActivity;
      super.setBaseContext(this.mD);
      return;
    }
  }

  public void startActivity(Intent paramIntent)
  {
    if (this.wO != null)
    {
      this.wO.startActivity(paramIntent);
      return;
    }
    paramIntent.setFlags(268435456);
    this.mD.startActivity(paramIntent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gv.a
 * JD-Core Version:    0.6.2
 */