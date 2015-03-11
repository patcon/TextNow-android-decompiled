package twitter4j.internal.logging;

final class StdOutLoggerFactory extends LoggerFactory
{
  private static final Logger SINGLETON = new StdOutLogger();

  public final Logger getLogger(Class paramClass)
  {
    return SINGLETON;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.logging.StdOutLoggerFactory
 * JD-Core Version:    0.6.2
 */