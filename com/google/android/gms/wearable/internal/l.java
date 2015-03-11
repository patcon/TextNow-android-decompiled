package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class l
  implements DataItem
{
  private byte[] acH;
  private Map<String, DataItemAsset> avv;
  private Uri mUri;

  public l(DataItem paramDataItem)
  {
    this.mUri = paramDataItem.getUri();
    this.acH = paramDataItem.getData();
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramDataItem.getAssets().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localEntry.getKey() != null)
        localHashMap.put(localEntry.getKey(), ((DataItemAsset)localEntry.getValue()).freeze());
    }
    this.avv = Collections.unmodifiableMap(localHashMap);
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

  public DataItem pY()
  {
    return this;
  }

  public DataItem setData(byte[] paramArrayOfByte)
  {
    throw new UnsupportedOperationException();
  }

  public String toString()
  {
    return toString(Log.isLoggable("DataItem", 3));
  }

  public String toString(boolean paramBoolean)
  {
    StringBuilder localStringBuilder1 = new StringBuilder("DataItemEntity[");
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.l
 * JD-Core Version:    0.6.2
 */