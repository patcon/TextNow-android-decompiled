package com.google.android.gms.wearable;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.io.InputStream;

public abstract interface DataApi$GetFdForAssetResult extends Releasable, Result
{
  public abstract ParcelFileDescriptor getFd();

  public abstract InputStream getInputStream();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataApi.GetFdForAssetResult
 * JD-Core Version:    0.6.2
 */