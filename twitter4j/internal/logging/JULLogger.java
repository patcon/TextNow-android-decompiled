package twitter4j.internal.logging;

import java.util.logging.Level;

final class JULLogger extends Logger
{
  private final java.util.logging.Logger LOGGER;

  JULLogger(java.util.logging.Logger paramLogger)
  {
    this.LOGGER = paramLogger;
  }

  public final void debug(String paramString)
  {
    this.LOGGER.fine(paramString);
  }

  public final void debug(String paramString1, String paramString2)
  {
    this.LOGGER.fine(paramString1 + paramString2);
  }

  public final void error(String paramString)
  {
    this.LOGGER.severe(paramString);
  }

  public final void error(String paramString, Throwable paramThrowable)
  {
    this.LOGGER.severe(paramString + paramThrowable.getMessage());
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
    return this.LOGGER.isLoggable(Level.FINE);
  }

  public final boolean isErrorEnabled()
  {
    return this.LOGGER.isLoggable(Level.SEVERE);
  }

  public final boolean isInfoEnabled()
  {
    return this.LOGGER.isLoggable(Level.INFO);
  }

  public final boolean isWarnEnabled()
  {
    return this.LOGGER.isLoggable(Level.WARNING);
  }

  public final void warn(String paramString)
  {
    this.LOGGER.warning(paramString);
  }

  public final void warn(String paramString1, String paramString2)
  {
    this.LOGGER.warning(paramString1 + paramString2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.logging.JULLogger
 * JD-Core Version:    0.6.2
 */