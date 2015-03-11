package com.google.android.gms.wallet;

import java.util.Locale;

public final class Wallet$WalletOptions$Builder
{
  private int atL = 0;
  private int mTheme = 0;

  public final Wallet.WalletOptions build()
  {
    return new Wallet.WalletOptions(this, null);
  }

  public final Builder setEnvironment(int paramInt)
  {
    if ((paramInt == 0) || (paramInt == 2) || (paramInt == 1))
    {
      this.atL = paramInt;
      return this;
    }
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    throw new IllegalArgumentException(String.format(localLocale, "Invalid environment value %d", arrayOfObject));
  }

  public final Builder setTheme(int paramInt)
  {
    if ((paramInt == 0) || (paramInt == 1))
    {
      this.mTheme = paramInt;
      return this;
    }
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    throw new IllegalArgumentException(String.format(localLocale, "Invalid theme value %d", arrayOfObject));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Wallet.WalletOptions.Builder
 * JD-Core Version:    0.6.2
 */