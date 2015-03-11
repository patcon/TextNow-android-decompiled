package com.google.android.gms.plus;

import com.google.android.gms.internal.hm;
import java.util.HashSet;
import java.util.Set;

public final class Plus$PlusOptions$Builder
{
  String abr;
  final Set<String> abs = new HashSet();

  public final Builder addActivityTypes(String[] paramArrayOfString)
  {
    hm.b(paramArrayOfString, "activityTypes may not be null.");
    for (int i = 0; i < paramArrayOfString.length; i++)
      this.abs.add(paramArrayOfString[i]);
    return this;
  }

  public final Plus.PlusOptions build()
  {
    return new Plus.PlusOptions(this, null);
  }

  public final Builder setServerClientId(String paramString)
  {
    this.abr = paramString;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.Plus.PlusOptions.Builder
 * JD-Core Version:    0.6.2
 */