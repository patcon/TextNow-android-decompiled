package twitter4j.internal.logging;

final class SLF4JLoggerFactory extends LoggerFactory
{
  public final Logger getLogger(Class paramClass)
  {
    return new SLF4JLogger(org.slf4j.LoggerFactory.getLogger(paramClass));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.logging.SLF4JLoggerFactory
 * JD-Core Version:    0.6.2
 */