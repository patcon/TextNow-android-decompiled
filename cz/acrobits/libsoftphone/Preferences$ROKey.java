package cz.acrobits.libsoftphone;

public class Preferences$ROKey<Type>
{
  public final String name;

  public Preferences$ROKey(Preferences paramPreferences, String paramString)
  {
    this.name = paramString;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof ROKey))
      return this.name.equals(((ROKey)paramObject).name);
    return false;
  }

  public native Type get();

  protected Preferences getOwner()
  {
    return this.this$0;
  }

  public native void overrideDefault(Type paramType);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Preferences.ROKey
 * JD-Core Version:    0.6.2
 */