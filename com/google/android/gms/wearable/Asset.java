package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Asset
  implements SafeParcelable
{
  public static final Parcelable.Creator<Asset> CREATOR = new a();
  final int BR;
  private byte[] acH;
  private String auQ;
  public ParcelFileDescriptor auR;
  public Uri uri;

  Asset(int paramInt, byte[] paramArrayOfByte, String paramString, ParcelFileDescriptor paramParcelFileDescriptor, Uri paramUri)
  {
    this.BR = paramInt;
    this.acH = paramArrayOfByte;
    this.auQ = paramString;
    this.auR = paramParcelFileDescriptor;
    this.uri = paramUri;
  }

  public static Asset createFromBytes(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      throw new IllegalArgumentException("Asset data cannot be null");
    return new Asset(1, paramArrayOfByte, null, null, null);
  }

  public static Asset createFromFd(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    if (paramParcelFileDescriptor == null)
      throw new IllegalArgumentException("Asset fd cannot be null");
    return new Asset(1, null, null, paramParcelFileDescriptor, null);
  }

  public static Asset createFromRef(String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Asset digest cannot be null");
    return new Asset(1, null, paramString, null, null);
  }

  public static Asset createFromUri(Uri paramUri)
  {
    if (paramUri == null)
      throw new IllegalArgumentException("Asset uri cannot be null");
    return new Asset(1, null, null, null, paramUri);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    Asset localAsset;
    do
    {
      return true;
      if (!(paramObject instanceof Asset))
        return false;
      localAsset = (Asset)paramObject;
    }
    while ((n.equal(this.acH, localAsset.acH)) && (n.equal(this.auQ, localAsset.auQ)) && (n.equal(this.auR, localAsset.auR)) && (n.equal(this.uri, localAsset.uri)));
    return false;
  }

  public byte[] getData()
  {
    return this.acH;
  }

  public String getDigest()
  {
    return this.auQ;
  }

  public ParcelFileDescriptor getFd()
  {
    return this.auR;
  }

  public Uri getUri()
  {
    return this.uri;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.acH;
    arrayOfObject[1] = this.auQ;
    arrayOfObject[2] = this.auR;
    arrayOfObject[3] = this.uri;
    return n.hashCode(arrayOfObject);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Asset[@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (this.auQ == null)
      localStringBuilder.append(", nodigest");
    while (true)
    {
      if (this.acH != null)
      {
        localStringBuilder.append(", size=");
        localStringBuilder.append(this.acH.length);
      }
      if (this.auR != null)
      {
        localStringBuilder.append(", fd=");
        localStringBuilder.append(this.auR);
      }
      if (this.uri != null)
      {
        localStringBuilder.append(", uri=");
        localStringBuilder.append(this.uri);
      }
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(", ");
      localStringBuilder.append(this.auQ);
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt | 0x1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.Asset
 * JD-Core Version:    0.6.2
 */