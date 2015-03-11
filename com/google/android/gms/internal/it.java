package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.j;
import java.util.Arrays;

public class it extends j<DriveId>
{
  public static final it KB = new it();

  private it()
  {
    super("driveId", Arrays.asList(new String[] { "sqlId", "resourceId" }), Arrays.asList(new String[] { "dbInstanceId" }), 4100000);
  }

  protected DriveId k(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    long l = paramDataHolder.eU().getLong("dbInstanceId");
    String str = paramDataHolder.c("resourceId", paramInt1, paramInt2);
    if ((str != null) && (str.startsWith("generated-android-")))
      str = null;
    return new DriveId(str, Long.valueOf(paramDataHolder.a("sqlId", paramInt1, paramInt2)).longValue(), l);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.it
 * JD-Core Version:    0.6.2
 */