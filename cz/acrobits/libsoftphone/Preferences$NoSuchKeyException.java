package cz.acrobits.libsoftphone;

public final class Preferences$NoSuchKeyException extends IllegalStateException
{
  public final String key;

  protected Preferences$NoSuchKeyException(String paramString)
  {
    super("No such preference key: " + paramString);
    this.key = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Preferences.NoSuchKeyException
 * JD-Core Version:    0.6.2
 */