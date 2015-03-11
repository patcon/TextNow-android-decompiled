package com.google.android.gms.cast;

import com.google.android.gms.internal.gi;
import java.util.Locale;

public final class LaunchOptions$Builder
{
  private LaunchOptions As = new LaunchOptions();

  public final LaunchOptions build()
  {
    return this.As;
  }

  public final Builder setLocale(Locale paramLocale)
  {
    this.As.setLanguage(gi.b(paramLocale));
    return this;
  }

  public final Builder setRelaunchIfRunning(boolean paramBoolean)
  {
    this.As.setRelaunchIfRunning(paramBoolean);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.LaunchOptions.Builder
 * JD-Core Version:    0.6.2
 */