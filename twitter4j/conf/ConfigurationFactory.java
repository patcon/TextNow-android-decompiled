package twitter4j.conf;

public abstract interface ConfigurationFactory
{
  public abstract void dispose();

  public abstract Configuration getInstance();

  public abstract Configuration getInstance(String paramString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.conf.ConfigurationFactory
 * JD-Core Version:    0.6.2
 */