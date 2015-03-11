package cz.acrobits.libsoftphone;

public final class Preferences$TooLateToOverrideDefaultKeyValueException extends IllegalStateException
{
  public final String key;

  protected Preferences$TooLateToOverrideDefaultKeyValueException(String paramString)
  {
    super("Too late to override the default value of a preference key: " + paramString);
    this.key = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Preferences.TooLateToOverrideDefaultKeyValueException
 * JD-Core Version:    0.6.2
 */