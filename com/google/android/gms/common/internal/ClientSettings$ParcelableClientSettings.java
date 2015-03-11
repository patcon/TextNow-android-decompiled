package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ClientSettings$ParcelableClientSettings
  implements SafeParcelable
{
  public static final ParcelableClientSettingsCreator CREATOR = new ParcelableClientSettingsCreator();
  private final int BR;
  private final String Dd;
  private final int IK;
  private final String IM;
  private final List<String> Jk = new ArrayList();

  ClientSettings$ParcelableClientSettings(int paramInt1, String paramString1, List<String> paramList, int paramInt2, String paramString2)
  {
    this.BR = paramInt1;
    this.Dd = paramString1;
    this.Jk.addAll(paramList);
    this.IK = paramInt2;
    this.IM = paramString2;
  }

  public ClientSettings$ParcelableClientSettings(String paramString1, Collection<String> paramCollection, int paramInt, String paramString2)
  {
    this(3, paramString1, new ArrayList(paramCollection), paramInt, paramString2);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getAccountName()
  {
    return this.Dd;
  }

  public final String getAccountNameOrDefault()
  {
    if (this.Dd != null)
      return this.Dd;
    return "<<default account>>";
  }

  public final int getGravityForPopups()
  {
    return this.IK;
  }

  public final String getRealClientPackageName()
  {
    return this.IM;
  }

  public final List<String> getScopes()
  {
    return new ArrayList(this.Jk);
  }

  public final int getVersionCode()
  {
    return this.BR;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ParcelableClientSettingsCreator.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ClientSettings.ParcelableClientSettings
 * JD-Core Version:    0.6.2
 */