package twitter4j.internal.logging;

import org.apache.log4j.Level;

final class Log4JLogger extends Logger
{
  private final org.apache.log4j.Logger LOGGER;

  Log4JLogger(org.apache.log4j.Logger paramLogger)
  {
    this.LOGGER = paramLogger;
  }

  public final void debug(String paramString)
  {
    this.LOGGER.debug(paramString);
  }

  public final void debug(String paramString1, String paramString2)
  {
    debug(paramString1 + paramString2);
  }

  public final void error(String paramString)
  {
    this.LOGGER.error(paramString);
  }

  public final void error(String paramString, Throwable paramThrowable)
  {
    this.LOGGER.error(paramString, paramThrowable);
  }

  public final void info(String paramString)
  {
    this.LOGGER.info(paramString);
  }

  public final void info(String paramString1, String paramString2)
  {
    info(paramString1 + paramString2);
  }

  public final boolean isDebugEnabled()
  {
    return this.LOGGER.isDebugEnabled();
  }

  public final boolean isErrorEnabled()
  {
    return this.LOGGER.isEnabledFor(Level.WARN);
  }

  public final boolean isInfoEnabled()
  {
    return this.LOGGER.isInfoEnabled();
  }

  public final boolean isWarnEnabled()
  {
    return this.LOGGER.isEnabledFor(Level.WARN);
  }

  public final void warn(String paramString)
  {
    this.LOGGER.warn(paramString);
  }

  public final void warn(String paramString1, String paramString2)
  {
    warn(paramString1 + paramString2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.logging.Log4JLogger
 * JD-Core Version:    0.6.2
 */