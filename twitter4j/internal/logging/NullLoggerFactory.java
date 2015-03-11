package twitter4j.internal.logging;

final class NullLoggerFactory extends LoggerFactory
{
  private static final Logger SINGLETON = new NullLogger();

  public final Logger getLogger(Class paramClass)
  {
    return SINGLETON;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.logging.NullLoggerFactory
 * JD-Core Version:    0.6.2
 */