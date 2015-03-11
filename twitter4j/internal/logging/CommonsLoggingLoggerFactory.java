package twitter4j.internal.logging;

import org.apache.commons.logging.LogFactory;

final class CommonsLoggingLoggerFactory extends LoggerFactory
{
  public final Logger getLogger(Class paramClass)
  {
    return new CommonsLoggingLogger(LogFactory.getLog(paramClass));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.logging.CommonsLoggingLoggerFactory
 * JD-Core Version:    0.6.2
 */