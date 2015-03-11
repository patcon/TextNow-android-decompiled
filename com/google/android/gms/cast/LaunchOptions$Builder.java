package com.google.android.gms.cast;

import com.google.android.gms.internal.ik;
import java.util.Locale;

public final class LaunchOptions$Builder
{
  private LaunchOptions Fd = new LaunchOptions();

  public final LaunchOptions build()
  {
    return this.Fd;
  }

  public final Builder setLocale(Locale paramLocale)
  {
    this.Fd.setLanguage(ik.b(paramLocale));
    return this;
  }

  public final Builder setRelaunchIfRunning(boolean paramBoolean)
  {
    this.Fd.setRelaunchIfRunning(paramBoolean);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.LaunchOptions.Builder
 * JD-Core Version:    0.6.2
 */