package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import java.io.IOException;
import java.io.InputStream;

public class f$c
  implements DataApi.GetFdForAssetResult
{
  private final Status CM;
  private volatile InputStream XX;
  private volatile ParcelFileDescriptor avu;
  private volatile boolean mClosed = false;

  public f$c(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.CM = paramStatus;
    this.avu = paramParcelFileDescriptor;
  }

  public ParcelFileDescriptor getFd()
  {
    if (this.mClosed)
      throw new IllegalStateException("Cannot access the file descriptor after release().");
    return this.avu;
  }

  public InputStream getInputStream()
  {
    if (this.mClosed)
      throw new IllegalStateException("Cannot access the input stream after release().");
    if (this.avu == null)
      return null;
    if (this.XX == null)
      this.XX = new ParcelFileDescriptor.AutoCloseInputStream(this.avu);
    return this.XX;
  }

  public Status getStatus()
  {
    return this.CM;
  }

  public void release()
  {
    if (this.avu == null)
      return;
    if (this.mClosed)
      throw new IllegalStateException("releasing an already released result.");
    try
    {
      if (this.XX != null)
        this.XX.close();
      while (true)
      {
        this.mClosed = true;
        this.avu = null;
        this.XX = null;
        return;
        this.avu.close();
      }
    }
    catch (IOException localIOException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.f.c
 * JD-Core Version:    0.6.2
 */