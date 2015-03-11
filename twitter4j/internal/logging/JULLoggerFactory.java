package twitter4j.internal.logging;

final class JULLoggerFactory extends LoggerFactory
{
  public final Logger getLogger(Class paramClass)
  {
    return new JULLogger(java.util.logging.Logger.getLogger(paramClass.getName()));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.logging.JULLoggerFactory
 * JD-Core Version:    0.6.2
 */