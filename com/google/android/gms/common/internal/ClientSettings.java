package com.google.android.gms.common.internal;

import android.view.View;
import java.util.Collection;
import java.util.List;

public final class ClientSettings
{
  private final View IL;
  private final ClientSettings.ParcelableClientSettings Ls;

  public ClientSettings(String paramString1, Collection<String> paramCollection, int paramInt, View paramView, String paramString2)
  {
    this.Ls = new ClientSettings.ParcelableClientSettings(paramString1, paramCollection, paramInt, paramString2);
    this.IL = paramView;
  }

  public final String getAccountName()
  {
    return this.Ls.getAccountName();
  }

  public final String getAccountNameOrDefault()
  {
    return this.Ls.getAccountNameOrDefault();
  }

  public final int getGravityForPopups()
  {
    return this.Ls.getGravityForPopups();
  }

  public final ClientSettings.ParcelableClientSettings getParcelableClientSettings()
  {
    return this.Ls;
  }

  public final String getRealClientPackageName()
  {
    return this.Ls.getRealClientPackageName();
  }

  public final List<String> getScopes()
  {
    return this.Ls.getScopes();
  }

  public final String[] getScopesArray()
  {
    return (String[])this.Ls.getScopes().toArray(new String[0]);
  }

  public final View getViewForPopups()
  {
    return this.IL;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ClientSettings
 * JD-Core Version:    0.6.2
 */