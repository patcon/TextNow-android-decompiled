package cz.acrobits.libsoftphone;

public final class SDK$UnsupportedFeatureException extends UnsupportedOperationException
{
  public String feature;

  public SDK$UnsupportedFeatureException(String paramString)
  {
    super("This requires Softphone SDK feature " + paramString + " which is not provided with your SDK version");
    this.feature = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.SDK.UnsupportedFeatureException
 * JD-Core Version:    0.6.2
 */