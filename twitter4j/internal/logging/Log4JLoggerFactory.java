package twitter4j.internal.logging;

final class Log4JLoggerFactory extends LoggerFactory
{
  public final Logger getLogger(Class paramClass)
  {
    return new Log4JLogger(org.apache.log4j.Logger.getLogger(paramClass));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.logging.Log4JLoggerFactory
 * JD-Core Version:    0.6.2
 */