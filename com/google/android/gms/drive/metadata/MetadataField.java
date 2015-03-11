package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;

public abstract interface MetadataField<T>
{
  public abstract T a(DataHolder paramDataHolder, int paramInt1, int paramInt2);

  public abstract void a(DataHolder paramDataHolder, MetadataBundle paramMetadataBundle, int paramInt1, int paramInt2);

  public abstract void a(T paramT, Bundle paramBundle);

  public abstract T e(Bundle paramBundle);

  public abstract Collection<String> gC();

  public abstract String getName();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.MetadataField
 * JD-Core Version:    0.6.2
 */