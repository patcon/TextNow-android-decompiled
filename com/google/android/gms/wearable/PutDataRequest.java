package com.google.android.gms.wearable;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class PutDataRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<PutDataRequest> CREATOR = new e();
  public static final String WEAR_URI_SCHEME = "wear";
  private static final Random auZ = new SecureRandom();
  final int BR;
  private byte[] acH;
  private final Bundle ava;
  private final Uri mUri;

  private PutDataRequest(int paramInt, Uri paramUri)
  {
    this(paramInt, paramUri, new Bundle(), null);
  }

  PutDataRequest(int paramInt, Uri paramUri, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this.BR = paramInt;
    this.mUri = paramUri;
    this.ava = paramBundle;
    this.ava.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
    this.acH = paramArrayOfByte;
  }

  public static PutDataRequest create(String paramString)
  {
    return k(dg(paramString));
  }

  public static PutDataRequest createFromDataItem(DataItem paramDataItem)
  {
    PutDataRequest localPutDataRequest = k(paramDataItem.getUri());
    Iterator localIterator = paramDataItem.getAssets().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((DataItemAsset)localEntry.getValue()).getId() == null)
        throw new IllegalStateException("Cannot create an asset for a put request without a digest: " + (String)localEntry.getKey());
      localPutDataRequest.putAsset((String)localEntry.getKey(), Asset.createFromRef(((DataItemAsset)localEntry.getValue()).getId()));
    }
    localPutDataRequest.setData(paramDataItem.getData());
    return localPutDataRequest;
  }

  public static PutDataRequest createWithAutoAppendedId(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    if (!paramString.endsWith("/"))
      localStringBuilder.append("/");
    localStringBuilder.append("PN").append(auZ.nextLong());
    return new PutDataRequest(1, dg(localStringBuilder.toString()));
  }

  private static Uri dg(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("An empty path was supplied.");
    if (!paramString.startsWith("/"))
      throw new IllegalArgumentException("A path must start with a single / .");
    if (paramString.startsWith("//"))
      throw new IllegalArgumentException("A path must start with a single / .");
    return new Uri.Builder().scheme("wear").path(paramString).build();
  }

  public static PutDataRequest k(Uri paramUri)
  {
    return new PutDataRequest(1, paramUri);
  }

  public int describeContents()
  {
    return 0;
  }

  public Asset getAsset(String paramString)
  {
    return (Asset)this.ava.getParcelable(paramString);
  }

  public Map<String, Asset> getAssets()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.ava.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, (Asset)this.ava.getParcelable(str));
    }
    return Collections.unmodifiableMap(localHashMap);
  }

  public byte[] getData()
  {
    return this.acH;
  }

  public Uri getUri()
  {
    return this.mUri;
  }

  public boolean hasAsset(String paramString)
  {
    return this.ava.containsKey(paramString);
  }

  public Bundle pT()
  {
    return this.ava;
  }

  public PutDataRequest putAsset(String paramString, Asset paramAsset)
  {
    o.i(paramString);
    o.i(paramAsset);
    this.ava.putParcelable(paramString, paramAsset);
    return this;
  }

  public PutDataRequest removeAsset(String paramString)
  {
    this.ava.remove(paramString);
    return this;
  }

  public PutDataRequest setData(byte[] paramArrayOfByte)
  {
    this.acH = paramArrayOfByte;
    return this;
  }

  public String toString()
  {
    return toString(Log.isLoggable("DataMap", 3));
  }

  public String toString(boolean paramBoolean)
  {
    StringBuilder localStringBuilder1 = new StringBuilder("PutDataRequest[");
    StringBuilder localStringBuilder2 = new StringBuilder().append("dataSz=");
    if (this.acH == null);
    for (Object localObject = "null"; ; localObject = Integer.valueOf(this.acH.length))
    {
      localStringBuilder1.append(localObject);
      localStringBuilder1.append(", numAssets=" + this.ava.size());
      localStringBuilder1.append(", uri=" + this.mUri);
      if (paramBoolean)
        break;
      localStringBuilder1.append("]");
      return localStringBuilder1.toString();
    }
    localStringBuilder1.append("]\n  assets: ");
    Iterator localIterator = this.ava.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localStringBuilder1.append("\n    " + str + ": " + this.ava.getParcelable(str));
    }
    localStringBuilder1.append("\n  ]");
    return localStringBuilder1.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.PutDataRequest
 * JD-Core Version:    0.6.2
 */