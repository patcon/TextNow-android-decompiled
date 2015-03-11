package com.google.android.gms.drive.metadata;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;

public abstract class b<T> extends a<Collection<T>>
{
  protected b(String paramString, Collection<String> paramCollection1, Collection<String> paramCollection2, int paramInt)
  {
    super(paramString, paramCollection1, paramCollection2, paramInt);
  }

  protected Collection<T> d(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    throw new UnsupportedOperationException("Cannot read collections from a dataHolder.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.b
 * JD-Core Version:    0.6.2
 */