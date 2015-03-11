package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class gy$a
  implements SafeParcelable
{
  public static final hl CREATOR = new hl();
  private final int DI;
  private final String DK;
  private final List<String> Ef = new ArrayList();
  private final int xM;
  private final String yQ;

  gy$a(int paramInt1, String paramString1, List<String> paramList, int paramInt2, String paramString2)
  {
    this.xM = paramInt1;
    this.yQ = paramString1;
    this.Ef.addAll(paramList);
    this.DI = paramInt2;
    this.DK = paramString2;
  }

  public gy$a(String paramString1, Collection<String> paramCollection, int paramInt, String paramString2)
  {
    this(3, paramString1, new ArrayList(paramCollection), paramInt, paramString2);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String fj()
  {
    if (this.yQ != null)
      return this.yQ;
    return "<<default account>>";
  }

  public final int fk()
  {
    return this.DI;
  }

  public final List<String> fl()
  {
    return new ArrayList(this.Ef);
  }

  public final String fn()
  {
    return this.DK;
  }

  public final String getAccountName()
  {
    return this.yQ;
  }

  public final int getVersionCode()
  {
    return this.xM;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    hl.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gy.a
 * JD-Core Version:    0.6.2
 */