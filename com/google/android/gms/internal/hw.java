package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

public abstract interface hw extends IInterface
{
  public abstract void a(Status paramStatus);

  public abstract void a(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor);

  public abstract void a(Status paramStatus, boolean paramBoolean);

  public abstract void a(hm.b paramb);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hw
 * JD-Core Version:    0.6.2
 */