package com.mopub.common.logging;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

final class MoPubLog$MoPubLogHandler extends Handler
{
  private static final Map<Level, Integer> LEVEL_TO_LOG;

  static
  {
    HashMap localHashMap = new HashMap(7);
    LEVEL_TO_LOG = localHashMap;
    localHashMap.put(Level.FINEST, Integer.valueOf(2));
    LEVEL_TO_LOG.put(Level.FINER, Integer.valueOf(2));
    LEVEL_TO_LOG.put(Level.FINE, Integer.valueOf(2));
    LEVEL_TO_LOG.put(Level.CONFIG, Integer.valueOf(3));
    LEVEL_TO_LOG.put(Level.INFO, Integer.valueOf(4));
    LEVEL_TO_LOG.put(Level.WARNING, Integer.valueOf(5));
    LEVEL_TO_LOG.put(Level.SEVERE, Integer.valueOf(6));
  }

  public final void close()
  {
  }

  public final void flush()
  {
  }

  public final void publish(LogRecord paramLogRecord)
  {
    if (isLoggable(paramLogRecord))
      if (!LEVEL_TO_LOG.containsKey(paramLogRecord.getLevel()))
        break label108;
    label108: for (int i = ((Integer)LEVEL_TO_LOG.get(paramLogRecord.getLevel())).intValue(); ; i = 2)
    {
      String str = paramLogRecord.getMessage() + "\n";
      Throwable localThrowable = paramLogRecord.getThrown();
      if (localThrowable != null)
        str = str + Log.getStackTraceString(localThrowable);
      Log.println(i, "MoPub", str);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.logging.MoPubLog.MoPubLogHandler
 * JD-Core Version:    0.6.2
 */