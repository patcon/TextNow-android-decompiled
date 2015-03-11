package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;

public final class f
  implements DataApi
{
  private PendingResult<Status> a(GoogleApiClient paramGoogleApiClient, final DataApi.DataListener paramDataListener, final IntentFilter[] paramArrayOfIntentFilter)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.a(this, paramDataListener, paramArrayOfIntentFilter);
      }

      public Status d(Status paramAnonymousStatus)
      {
        return new Status(13);
      }
    });
  }

  private void a(Asset paramAsset)
  {
    if (paramAsset == null)
      throw new IllegalArgumentException("asset is null");
    if (paramAsset.getDigest() == null)
      throw new IllegalArgumentException("invalid asset");
    if (paramAsset.getData() != null)
      throw new IllegalArgumentException("invalid asset");
  }

  public final PendingResult<Status> addListener(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener)
  {
    return a(paramGoogleApiClient, paramDataListener, null);
  }

  public final PendingResult<DataApi.DeleteDataItemsResult> deleteDataItems(GoogleApiClient paramGoogleApiClient, final Uri paramUri)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.c(this, paramUri);
      }

      protected DataApi.DeleteDataItemsResult aH(Status paramAnonymousStatus)
      {
        return new f.b(paramAnonymousStatus, 0);
      }
    });
  }

  public final PendingResult<DataApi.DataItemResult> getDataItem(GoogleApiClient paramGoogleApiClient, final Uri paramUri)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.a(this, paramUri);
      }

      protected DataApi.DataItemResult aF(Status paramAnonymousStatus)
      {
        return new f.a(paramAnonymousStatus, null);
      }
    });
  }

  public final PendingResult<DataItemBuffer> getDataItems(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.o(this);
      }

      protected DataItemBuffer aG(Status paramAnonymousStatus)
      {
        return new DataItemBuffer(DataHolder.as(paramAnonymousStatus.getStatusCode()));
      }
    });
  }

  public final PendingResult<DataItemBuffer> getDataItems(GoogleApiClient paramGoogleApiClient, final Uri paramUri)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.b(this, paramUri);
      }

      protected DataItemBuffer aG(Status paramAnonymousStatus)
      {
        return new DataItemBuffer(DataHolder.as(paramAnonymousStatus.getStatusCode()));
      }
    });
  }

  public final PendingResult<DataApi.GetFdForAssetResult> getFdForAsset(GoogleApiClient paramGoogleApiClient, final Asset paramAsset)
  {
    a(paramAsset);
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.a(this, paramAsset);
      }

      protected DataApi.GetFdForAssetResult aI(Status paramAnonymousStatus)
      {
        return new f.c(paramAnonymousStatus, null);
      }
    });
  }

  public final PendingResult<DataApi.GetFdForAssetResult> getFdForAsset(GoogleApiClient paramGoogleApiClient, final DataItemAsset paramDataItemAsset)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.a(this, paramDataItemAsset);
      }

      protected DataApi.GetFdForAssetResult aI(Status paramAnonymousStatus)
      {
        return new f.c(paramAnonymousStatus, null);
      }
    });
  }

  public final PendingResult<DataApi.DataItemResult> putDataItem(GoogleApiClient paramGoogleApiClient, final PutDataRequest paramPutDataRequest)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.a(this, paramPutDataRequest);
      }

      public DataApi.DataItemResult aF(Status paramAnonymousStatus)
      {
        return new f.a(paramAnonymousStatus, null);
      }
    });
  }

  public final PendingResult<Status> removeListener(GoogleApiClient paramGoogleApiClient, final DataApi.DataListener paramDataListener)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.a(this, paramDataListener);
      }

      public Status d(Status paramAnonymousStatus)
      {
        return new Status(13);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.f
 * JD-Core Version:    0.6.2
 */