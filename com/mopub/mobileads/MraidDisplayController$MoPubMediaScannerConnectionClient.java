package com.mopub.mobileads;

import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.net.Uri;

class MraidDisplayController$MoPubMediaScannerConnectionClient
  implements MediaScannerConnection.MediaScannerConnectionClient
{
  private final String mFilename;
  private MediaScannerConnection mMediaScannerConnection;
  private final String mMimeType;

  private MraidDisplayController$MoPubMediaScannerConnectionClient(MraidDisplayController paramMraidDisplayController, String paramString1, String paramString2)
  {
    this.mFilename = paramString1;
    this.mMimeType = paramString2;
  }

  private void setMediaScannerConnection(MediaScannerConnection paramMediaScannerConnection)
  {
    this.mMediaScannerConnection = paramMediaScannerConnection;
  }

  public void onMediaScannerConnected()
  {
    if (this.mMediaScannerConnection != null)
      this.mMediaScannerConnection.scanFile(this.mFilename, this.mMimeType);
  }

  public void onScanCompleted(String paramString, Uri paramUri)
  {
    if (this.mMediaScannerConnection != null)
      this.mMediaScannerConnection.disconnect();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidDisplayController.MoPubMediaScannerConnectionClient
 * JD-Core Version:    0.6.2
 */