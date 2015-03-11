package twitter4j.internal.logging;

final class SLF4JLogger extends Logger
{
  private final org.slf4j.Logger LOGGER;

  SLF4JLogger(org.slf4j.Logger paramLogger)
  {
    this.LOGGER = paramLogger;
  }

  public final void debug(String paramString)
  {
    this.LOGGER.debug(paramString);
  }

  public final void debug(String paramString1, String paramString2)
  {
    this.LOGGER.debug(paramString1 + paramString2);
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
    this.LOGGER.info(paramString1 + paramString2);
  }

  public final boolean isDebugEnabled()
  {
    return this.LOGGER.isDebugEnabled();
  }

  public final boolean isErrorEnabled()
  {
    return this.LOGGER.isErrorEnabled();
  }

  public final boolean isInfoEnabled()
  {
    return this.LOGGER.isInfoEnabled();
  }

  public final boolean isWarnEnabled()
  {
    return this.LOGGER.isWarnEnabled();
  }

  public final void warn(String paramString)
  {
    this.LOGGER.warn(paramString);
  }

  public final void warn(String paramString1, String paramString2)
  {
    this.LOGGER.warn(paramString1 + paramString2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.logging.SLF4JLogger
 * JD-Core Version:    0.6.2
 */