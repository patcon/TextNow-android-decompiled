package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.internal.gx;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

final class ImageManager$ImageReceiver extends ResultReceiver
{
  private final ArrayList<a> Fh;
  private final Uri mUri;

  ImageManager$ImageReceiver(ImageManager paramImageManager, Uri paramUri)
  {
    super(new Handler(Looper.getMainLooper()));
    this.mUri = paramUri;
    this.Fh = new ArrayList();
  }

  public final void b(a parama)
  {
    gx.ay("ImageReceiver.addImageRequest() must be called in the main thread");
    this.Fh.add(parama);
  }

  public final void c(a parama)
  {
    gx.ay("ImageReceiver.removeImageRequest() must be called in the main thread");
    this.Fh.remove(parama);
  }

  public final void ff()
  {
    Intent localIntent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
    localIntent.putExtra("com.google.android.gms.extras.uri", this.mUri);
    localIntent.putExtra("com.google.android.gms.extras.resultReceiver", this);
    localIntent.putExtra("com.google.android.gms.extras.priority", 3);
    ImageManager.b(this.Fi).sendBroadcast(localIntent);
  }

  public final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    ParcelFileDescriptor localParcelFileDescriptor = (ParcelFileDescriptor)paramBundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
    ImageManager.f(this.Fi).execute(new ImageManager.c(this.Fi, this.mUri, localParcelFileDescriptor));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.ImageReceiver
 * JD-Core Version:    0.6.2
 */