package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.nz;

public abstract interface b extends IInterface
{
  public abstract void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2);

  public abstract void a(int paramInt, Bundle paramBundle, ParcelFileDescriptor paramParcelFileDescriptor);

  public abstract void a(int paramInt, Bundle paramBundle, jp paramjp);

  public abstract void a(int paramInt, nz paramnz);

  public abstract void a(DataHolder paramDataHolder, String paramString);

  public abstract void a(DataHolder paramDataHolder, String paramString1, String paramString2);

  public abstract void aB(Status paramStatus);

  public abstract void ce(String paramString);

  public abstract void cf(String paramString);

  public abstract void h(int paramInt, Bundle paramBundle);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.b
 * JD-Core Version:    0.6.2
 */