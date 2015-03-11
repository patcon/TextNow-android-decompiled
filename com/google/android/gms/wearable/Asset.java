package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hk;

public class Asset
  implements SafeParcelable
{
  public static final Parcelable.Creator<Asset> CREATOR = new a();
  private byte[] TF;
  private String alg;
  public ParcelFileDescriptor alh;
  public Uri uri;
  final int xM;

  Asset(int paramInt, byte[] paramArrayOfByte, String paramString, ParcelFileDescriptor paramParcelFileDescriptor, Uri paramUri)
  {
    this.xM = paramInt;
    this.TF = paramArrayOfByte;
    this.alg = paramString;
    this.alh = paramParcelFileDescriptor;
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
    while ((hk.equal(this.TF, localAsset.TF)) && (hk.equal(this.alg, localAsset.alg)) && (hk.equal(this.alh, localAsset.alh)) && (hk.equal(this.uri, localAsset.uri)));
    return false;
  }

  public byte[] getData()
  {
    return this.TF;
  }

  public String getDigest()
  {
    return this.alg;
  }

  public ParcelFileDescriptor getFd()
  {
    return this.alh;
  }

  public Uri getUri()
  {
    return this.uri;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.TF;
    arrayOfObject[1] = this.alg;
    arrayOfObject[2] = this.alh;
    arrayOfObject[3] = this.uri;
    return hk.hashCode(arrayOfObject);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Asset[@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (this.alg == null)
      localStringBuilder.append(", nodigest");
    while (true)
    {
      if (this.TF != null)
      {
        localStringBuilder.append(", size=");
        localStringBuilder.append(this.TF.length);
      }
      if (this.alh != null)
      {
        localStringBuilder.append(", fd=");
        localStringBuilder.append(this.alh);
      }
      if (this.uri != null)
      {
        localStringBuilder.append(", uri=");
        localStringBuilder.append(this.uri);
      }
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(", ");
      localStringBuilder.append(this.alg);
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt | 0x1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.Asset
 * JD-Core Version:    0.6.2
 */