package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.List;

public final class UserAddressRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<UserAddressRequest> CREATOR = new a();
  private final int BR;
  List<CountrySpecification> adK;

  UserAddressRequest()
  {
    this.BR = 1;
  }

  UserAddressRequest(int paramInt, List<CountrySpecification> paramList)
  {
    this.BR = paramInt;
    this.adK = paramList;
  }

  public static UserAddressRequest.Builder newBuilder()
  {
    UserAddressRequest localUserAddressRequest = new UserAddressRequest();
    localUserAddressRequest.getClass();
    return new UserAddressRequest.Builder(localUserAddressRequest, null);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final int getVersionCode()
  {
    return this.BR;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.identity.intents.UserAddressRequest
 * JD-Core Version:    0.6.2
 */