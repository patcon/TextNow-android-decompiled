package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.pc;
import com.google.android.gms.internal.pc.a;
import com.google.android.gms.internal.pn;
import java.util.List;

public class PutDataMapRequest
{
  private final DataMap auX;
  private final PutDataRequest auY;

  private PutDataMapRequest(PutDataRequest paramPutDataRequest, DataMap paramDataMap)
  {
    this.auY = paramPutDataRequest;
    this.auX = new DataMap();
    if (paramDataMap != null)
      this.auX.putAll(paramDataMap);
  }

  public static PutDataMapRequest create(String paramString)
  {
    return new PutDataMapRequest(PutDataRequest.create(paramString), null);
  }

  public static PutDataMapRequest createFromDataMapItem(DataMapItem paramDataMapItem)
  {
    return new PutDataMapRequest(PutDataRequest.k(paramDataMapItem.getUri()), paramDataMapItem.getDataMap());
  }

  public static PutDataMapRequest createWithAutoAppendedId(String paramString)
  {
    return new PutDataMapRequest(PutDataRequest.createWithAutoAppendedId(paramString), null);
  }

  public PutDataRequest asPutDataRequest()
  {
    pc.a locala = pc.a(this.auX);
    this.auY.setData(pn.f(locala.awb));
    int i = locala.awc.size();
    for (int j = 0; j < i; j++)
    {
      String str = Integer.toString(j);
      Asset localAsset = (Asset)locala.awc.get(j);
      if (str == null)
        throw new IllegalStateException("asset key cannot be null: " + localAsset);
      if (localAsset == null)
        throw new IllegalStateException("asset cannot be null: key=" + str);
      if (Log.isLoggable("DataMap", 3))
        new StringBuilder().append("asPutDataRequest: adding asset: ").append(str).append(" ").append(localAsset).toString();
      this.auY.putAsset(str, localAsset);
    }
    return this.auY;
  }

  public DataMap getDataMap()
  {
    return this.auX;
  }

  public Uri getUri()
  {
    return this.auY.getUri();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.PutDataMapRequest
 * JD-Core Version:    0.6.2
 */