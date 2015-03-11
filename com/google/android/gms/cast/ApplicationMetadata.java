package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.hk;
import java.util.ArrayList;
import java.util.List;

public final class ApplicationMetadata
  implements SafeParcelable
{
  public static final Parcelable.Creator<ApplicationMetadata> CREATOR = new a();
  String mName;
  private final int xM;
  String zP;
  List<WebImage> zQ;
  List<String> zR;
  String zS;
  Uri zT;

  private ApplicationMetadata()
  {
    this.xM = 1;
    this.zQ = new ArrayList();
    this.zR = new ArrayList();
  }

  ApplicationMetadata(int paramInt, String paramString1, String paramString2, List<WebImage> paramList, List<String> paramList1, String paramString3, Uri paramUri)
  {
    this.xM = paramInt;
    this.zP = paramString1;
    this.mName = paramString2;
    this.zQ = paramList;
    this.zR = paramList1;
    this.zS = paramString3;
    this.zT = paramUri;
  }

  public final boolean areNamespacesSupported(List<String> paramList)
  {
    return (this.zR != null) && (this.zR.containsAll(paramList));
  }

  public final Uri dX()
  {
    return this.zT;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ApplicationMetadata localApplicationMetadata;
    do
    {
      return true;
      if (!(paramObject instanceof ApplicationMetadata))
        return false;
      localApplicationMetadata = (ApplicationMetadata)paramObject;
    }
    while ((gi.a(this.zP, localApplicationMetadata.zP)) && (gi.a(this.zQ, localApplicationMetadata.zQ)) && (gi.a(this.mName, localApplicationMetadata.mName)) && (gi.a(this.zR, localApplicationMetadata.zR)) && (gi.a(this.zS, localApplicationMetadata.zS)) && (gi.a(this.zT, localApplicationMetadata.zT)));
    return false;
  }

  public final String getApplicationId()
  {
    return this.zP;
  }

  public final List<WebImage> getImages()
  {
    return this.zQ;
  }

  public final String getName()
  {
    return this.mName;
  }

  public final String getSenderAppIdentifier()
  {
    return this.zS;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.xM);
    arrayOfObject[1] = this.zP;
    arrayOfObject[2] = this.mName;
    arrayOfObject[3] = this.zQ;
    arrayOfObject[4] = this.zR;
    arrayOfObject[5] = this.zS;
    arrayOfObject[6] = this.zT;
    return hk.hashCode(arrayOfObject);
  }

  public final boolean isNamespaceSupported(String paramString)
  {
    return (this.zR != null) && (this.zR.contains(paramString));
  }

  public final String toString()
  {
    return this.mName;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.ApplicationMetadata
 * JD-Core Version:    0.6.2
 */