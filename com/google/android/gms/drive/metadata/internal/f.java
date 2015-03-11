package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.a;

public class f extends a<Integer>
{
  public f(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }

  protected void a(Bundle paramBundle, Integer paramInteger)
  {
    paramBundle.putInt(getName(), paramInteger.intValue());
  }

  protected Integer g(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    return Integer.valueOf(paramDataHolder.b(getName(), paramInt1, paramInt2));
  }

  protected Integer j(Bundle paramBundle)
  {
    return Integer.valueOf(paramBundle.getInt(getName()));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.f
 * JD-Core Version:    0.6.2
 */