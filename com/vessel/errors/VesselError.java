package com.vessel.errors;

public class VesselError extends Throwable
{
  private int a = 0;
  private String b;

  public VesselError(String paramString)
  {
    super(paramString);
  }

  public VesselError(String paramString, int paramInt)
  {
    super(paramString);
    this.a = paramInt;
  }

  public VesselError(String paramString1, String paramString2, int paramInt)
  {
    super(paramString1);
    this.b = paramString2;
    this.a = paramInt;
  }

  public int getErrorCode()
  {
    return this.a;
  }

  public String getErrorType()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.vessel.errors.VesselError
 * JD-Core Version:    0.6.2
 */