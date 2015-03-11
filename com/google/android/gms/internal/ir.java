package com.google.android.gms.internal;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.j;
import java.util.Arrays;
import java.util.Collections;

public class ir extends j<AppVisibleCustomProperties>
{
  public ir(int paramInt)
  {
    super("customFileProperties", Collections.emptyList(), Arrays.asList(new String[] { "customPropertiesExtra" }), paramInt);
  }

  protected AppVisibleCustomProperties j(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    return (AppVisibleCustomProperties)paramDataHolder.eU().getSparseParcelableArray("customPropertiesExtra").get(paramInt1, AppVisibleCustomProperties.JN);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ir
 * JD-Core Version:    0.6.2
 */