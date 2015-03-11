package com.mopub.nativeads;

import com.mopub.common.DownloadTask;
import com.mopub.common.DownloadTask.DownloadTaskListener;
import com.mopub.common.VisibleForTesting;

@VisibleForTesting
class ServerPositioningSource$DownloadTaskProvider
{
  DownloadTask get(DownloadTask.DownloadTaskListener paramDownloadTaskListener)
  {
    return new DownloadTask(paramDownloadTaskListener);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ServerPositioningSource.DownloadTaskProvider
 * JD-Core Version:    0.6.2
 */