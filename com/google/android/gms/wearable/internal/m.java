package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class m
  implements SafeParcelable, DataItem
{
  public static final Parcelable.Creator<m> CREATOR = new n();
  final int BR;
  private byte[] acH;
  private final Map<String, DataItemAsset> avv;
  private final Uri mUri;

  m(int paramInt, Uri paramUri, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this.BR = paramInt;
    this.mUri = paramUri;
    HashMap localHashMap = new HashMap();
    paramBundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, (DataItemAssetParcelable)paramBundle.getParcelable(str));
    }
    this.avv = localHashMap;
    this.acH = paramArrayOfByte;
  }

  public int describeContents()
  {
    return 0;
  }

  public Map<String, DataItemAsset> getAssets()
  {
    return this.avv;
  }

  public byte[] getData()
  {
    return this.acH;
  }

  public Uri getUri()
  {
    return this.mUri;
  }

  public boolean isDataValid()
  {
    return true;
  }

  public m m(byte[] paramArrayOfByte)
  {
    this.acH = paramArrayOfByte;
    return this;
  }

  public Bundle pT()
  {
    Bundle localBundle = new Bundle();
    localBundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
    Iterator localIterator = this.avv.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localBundle.putParcelable((String)localEntry.getKey(), new DataItemAssetParcelable((DataItemAsset)localEntry.getValue()));
    }
    return localBundle;
  }

  public m pZ()
  {
    return this;
  }

  public String toString()
  {
    return toString(Log.isLoggable("DataItem", 3));
  }

  public String toString(boolean paramBoolean)
  {
    StringBuilder localStringBuilder1 = new StringBuilder("DataItemParcelable[");
    localStringBuilder1.append("@");
    localStringBuilder1.append(Integer.toHexString(hashCode()));
    StringBuilder localStringBuilder2 = new StringBuilder().append(",dataSz=");
    if (this.acH == null);
    for (Object localObject = "null"; ; localObject = Integer.valueOf(this.acH.length))
    {
      localStringBuilder1.append(localObject);
      localStringBuilder1.append(", numAssets=" + this.avv.size());
      localStringBuilder1.append(", uri=" + this.mUri);
      if (paramBoolean)
        break;
      localStringBuilder1.append("]");
      return localStringBuilder1.toString();
    }
    localStringBuilder1.append("]\n  assets: ");
    Iterator localIterator = this.avv.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localStringBuilder1.append("\n    " + str + ": " + this.avv.get(str));
    }
    localStringBuilder1.append("\n  ]");
    return localStringBuilder1.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    n.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.m
 * JD-Core Version:    0.6.2
 */