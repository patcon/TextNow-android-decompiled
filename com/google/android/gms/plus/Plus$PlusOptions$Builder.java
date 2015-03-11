package com.google.android.gms.plus;

import com.google.android.gms.common.internal.o;
import java.util.HashSet;
import java.util.Set;

public final class Plus$PlusOptions$Builder
{
  String alb;
  final Set<String> alc = new HashSet();

  public final Builder addActivityTypes(String[] paramArrayOfString)
  {
    o.b(paramArrayOfString, "activityTypes may not be null.");
    for (int i = 0; i < paramArrayOfString.length; i++)
      this.alc.add(paramArrayOfString[i]);
    return this;
  }

  public final Plus.PlusOptions build()
  {
    return new Plus.PlusOptions(this, null);
  }

  public final Builder setServerClientId(String paramString)
  {
    this.alb = paramString;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.Plus.PlusOptions.Builder
 * JD-Core Version:    0.6.2
 */