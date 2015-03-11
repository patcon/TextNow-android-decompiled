package com.google.android.gms.fitness;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.fitness.data.Session;

public class SessionsApi$ViewIntentBuilder
{
  private String Ss;
  private Session St;
  private boolean Su = false;
  private final Context mContext;

  public SessionsApi$ViewIntentBuilder(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private Intent i(Intent paramIntent)
  {
    if (this.Ss == null);
    Intent localIntent;
    ResolveInfo localResolveInfo;
    do
    {
      return paramIntent;
      localIntent = new Intent(paramIntent).setPackage(this.Ss);
      localResolveInfo = this.mContext.getPackageManager().resolveActivity(localIntent, 0);
    }
    while (localResolveInfo == null);
    String str = localResolveInfo.activityInfo.name;
    localIntent.setComponent(new ComponentName(this.Ss, str));
    return localIntent;
  }

  public Intent build()
  {
    if (this.St != null);
    for (boolean bool = true; ; bool = false)
    {
      o.a(bool, "Session must be set");
      Intent localIntent = new Intent("vnd.google.fitness.VIEW");
      localIntent.setType(Session.getMimeType(this.St.getActivity()));
      c.a(this.St, localIntent, "vnd.google.fitness.session");
      if (!this.Su)
        this.Ss = this.St.getAppPackageName();
      return i(localIntent);
    }
  }

  public ViewIntentBuilder setPreferredApplication(String paramString)
  {
    this.Ss = paramString;
    this.Su = true;
    return this;
  }

  public ViewIntentBuilder setSession(Session paramSession)
  {
    this.St = paramSession;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.SessionsApi.ViewIntentBuilder
 * JD-Core Version:    0.6.2
 */