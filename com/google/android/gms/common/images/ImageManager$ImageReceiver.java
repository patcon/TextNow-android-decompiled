package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

final class ImageManager$ImageReceiver extends ResultReceiver
{
  private final ArrayList<a> KC;
  private final Uri mUri;

  ImageManager$ImageReceiver(ImageManager paramImageManager, Uri paramUri)
  {
    super(new Handler(Looper.getMainLooper()));
    this.mUri = paramUri;
    this.KC = new ArrayList();
  }

  public final void b(a parama)
  {
    com.google.android.gms.common.internal.a.aT("ImageReceiver.addImageRequest() must be called in the main thread");
    this.KC.add(parama);
  }

  public final void c(a parama)
  {
    com.google.android.gms.common.internal.a.aT("ImageReceiver.removeImageRequest() must be called in the main thread");
    this.KC.remove(parama);
  }

  public final void gJ()
  {
    Intent localIntent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
    localIntent.putExtra("com.google.android.gms.extras.uri", this.mUri);
    localIntent.putExtra("com.google.android.gms.extras.resultReceiver", this);
    localIntent.putExtra("com.google.android.gms.extras.priority", 3);
    ImageManager.b(this.KD).sendBroadcast(localIntent);
  }

  public final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    ParcelFileDescriptor localParcelFileDescriptor = (ParcelFileDescriptor)paramBundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
    ImageManager.f(this.KD).execute(new ImageManager.c(this.KD, this.mUri, localParcelFileDescriptor));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.ImageReceiver
 * JD-Core Version:    0.6.2
 */