package com.mopub.common.logging;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MoPubLog
{
  private static final Logger LOGGER = Logger.getLogger("com.mopub");
  private static final String LOGTAG = "MoPub";
  private static final MoPubLog.MoPubLogHandler LOG_HANDLER = new MoPubLog.MoPubLogHandler(null);

  static
  {
    LogManager.getLogManager().addLogger(LOGGER);
    LOGGER.addHandler(LOG_HANDLER);
    LOGGER.setLevel(Level.FINE);
  }

  public static void c(String paramString)
  {
    c(paramString, null);
  }

  public static void c(String paramString, Throwable paramThrowable)
  {
    LOGGER.log(Level.FINEST, paramString, paramThrowable);
  }

  public static void d(String paramString)
  {
    d(paramString, null);
  }

  public static void d(String paramString, Throwable paramThrowable)
  {
    LOGGER.log(Level.CONFIG, paramString, paramThrowable);
  }

  public static void e(String paramString)
  {
    e(paramString, null);
  }

  public static void e(String paramString, Throwable paramThrowable)
  {
    LOGGER.log(Level.SEVERE, paramString, paramThrowable);
  }

  public static void i(String paramString)
  {
    i(paramString, null);
  }

  public static void i(String paramString, Throwable paramThrowable)
  {
    LOGGER.log(Level.INFO, paramString, paramThrowable);
  }

  public static void v(String paramString)
  {
    v(paramString, null);
  }

  public static void v(String paramString, Throwable paramThrowable)
  {
    LOGGER.log(Level.FINE, paramString, paramThrowable);
  }

  public static void w(String paramString)
  {
    w(paramString, null);
  }

  public static void w(String paramString, Throwable paramThrowable)
  {
    LOGGER.log(Level.WARNING, paramString, paramThrowable);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.logging.MoPubLog
 * JD-Core Version:    0.6.2
 */