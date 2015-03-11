package com.google.android.gms.common;

public final class GooglePlayServicesNotAvailableException extends Exception
{
  public final int errorCode;

  public GooglePlayServicesNotAvailableException(int paramInt)
  {
    this.errorCode = paramInt;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GooglePlayServicesNotAvailableException
 * JD-Core Version:    0.6.2
 */