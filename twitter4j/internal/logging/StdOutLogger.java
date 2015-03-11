package twitter4j.internal.logging;

import java.io.PrintStream;
import java.util.Date;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

final class StdOutLogger extends Logger
{
  private static final boolean DEBUG = ConfigurationContext.getInstance().isDebugEnabled();

  public final void debug(String paramString)
  {
    if (DEBUG)
      System.out.println("[" + new Date() + "]" + paramString);
  }

  public final void debug(String paramString1, String paramString2)
  {
    if (DEBUG)
      debug(paramString1 + paramString2);
  }

  public final void error(String paramString)
  {
    System.out.println("[" + new Date() + "]" + paramString);
  }

  public final void error(String paramString, Throwable paramThrowable)
  {
    System.out.println(paramString);
    paramThrowable.printStackTrace(System.err);
  }

  public final void info(String paramString)
  {
    System.out.println("[" + new Date() + "]" + paramString);
  }

  public final void info(String paramString1, String paramString2)
  {
    info(paramString1 + paramString2);
  }

  public final boolean isDebugEnabled()
  {
    return DEBUG;
  }

  public final boolean isErrorEnabled()
  {
    return true;
  }

  public final boolean isInfoEnabled()
  {
    return true;
  }

  public final boolean isWarnEnabled()
  {
    return true;
  }

  public final void warn(String paramString)
  {
    System.out.println("[" + new Date() + "]" + paramString);
  }

  public final void warn(String paramString1, String paramString2)
  {
    warn(paramString1 + paramString2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.logging.StdOutLogger
 * JD-Core Version:    0.6.2
 */