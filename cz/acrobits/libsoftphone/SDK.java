package cz.acrobits.libsoftphone;

public final class SDK
{
  public static final boolean debug = isDebug();
  public static final SDK.Feature[] features = getFeatures();
  public static final String version = getVersion();

  protected static native SDK.Feature[] getFeatures();

  protected static native String getVersion();

  protected static native boolean isDebug();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.SDK
 * JD-Core Version:    0.6.2
 */