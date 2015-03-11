package com.facebook;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class AppEventsLogger$PersistedEvents
{
  static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
  private static Object staticLock = new Object();
  private Context context;
  private HashMap<AppEventsLogger.AccessTokenAppIdPair, List<AppEventsLogger.AppEvent>> persistedEvents = new HashMap();

  private AppEventsLogger$PersistedEvents(Context paramContext)
  {
    this.context = paramContext;
  }

  public static void persistEvents(Context paramContext, AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair, AppEventsLogger.SessionEventsState paramSessionEventsState)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(paramAccessTokenAppIdPair, paramSessionEventsState);
    persistEvents(paramContext, localHashMap);
  }

  public static void persistEvents(Context paramContext, Map<AppEventsLogger.AccessTokenAppIdPair, AppEventsLogger.SessionEventsState> paramMap)
  {
    PersistedEvents localPersistedEvents;
    synchronized (staticLock)
    {
      localPersistedEvents = readAndClearStore(paramContext);
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        List localList = ((AppEventsLogger.SessionEventsState)localEntry.getValue()).getEventsToPersist();
        if (localList.size() != 0)
          localPersistedEvents.addEvents((AppEventsLogger.AccessTokenAppIdPair)localEntry.getKey(), localList);
      }
    }
    localPersistedEvents.write();
  }

  public static PersistedEvents readAndClearStore(Context paramContext)
  {
    synchronized (staticLock)
    {
      PersistedEvents localPersistedEvents = new PersistedEvents(paramContext);
      localPersistedEvents.readAndClearStore();
      return localPersistedEvents;
    }
  }

  // ERROR //
  private void readAndClearStore()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 104	java/io/ObjectInputStream
    //   5: dup
    //   6: new 106	java/io/BufferedInputStream
    //   9: dup
    //   10: aload_0
    //   11: getfield 30	com/facebook/AppEventsLogger$PersistedEvents:context	Landroid/content/Context;
    //   14: ldc 8
    //   16: invokevirtual 112	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   19: invokespecial 115	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   22: invokespecial 116	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   25: astore_2
    //   26: aload_2
    //   27: invokevirtual 119	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   30: checkcast 25	java/util/HashMap
    //   33: astore 8
    //   35: aload_0
    //   36: getfield 30	com/facebook/AppEventsLogger$PersistedEvents:context	Landroid/content/Context;
    //   39: ldc 8
    //   41: invokevirtual 123	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   44: invokevirtual 128	java/io/File:delete	()Z
    //   47: pop
    //   48: aload_0
    //   49: aload 8
    //   51: putfield 28	com/facebook/AppEventsLogger$PersistedEvents:persistedEvents	Ljava/util/HashMap;
    //   54: aload_2
    //   55: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   58: return
    //   59: astore 12
    //   61: aload_1
    //   62: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   65: return
    //   66: astore 11
    //   68: aconst_null
    //   69: astore_2
    //   70: aload 11
    //   72: astore 4
    //   74: invokestatic 140	com/facebook/AppEventsLogger:access$1300	()Ljava/lang/String;
    //   77: pop
    //   78: new 142	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   85: ldc 145
    //   87: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: aload 4
    //   92: invokevirtual 152	java/lang/Exception:toString	()Ljava/lang/String;
    //   95: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: pop
    //   102: aload_2
    //   103: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   106: return
    //   107: astore 10
    //   109: aconst_null
    //   110: astore_2
    //   111: aload 10
    //   113: astore 5
    //   115: aload_2
    //   116: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   119: aload 5
    //   121: athrow
    //   122: astore 5
    //   124: goto -9 -> 115
    //   127: astore 4
    //   129: goto -55 -> 74
    //   132: astore_3
    //   133: aload_2
    //   134: astore_1
    //   135: goto -74 -> 61
    //
    // Exception table:
    //   from	to	target	type
    //   2	26	59	java/io/FileNotFoundException
    //   2	26	66	java/lang/Exception
    //   2	26	107	finally
    //   26	54	122	finally
    //   74	102	122	finally
    //   26	54	127	java/lang/Exception
    //   26	54	132	java/io/FileNotFoundException
  }

  // ERROR //
  private void write()
  {
    // Byte code:
    //   0: new 155	java/io/ObjectOutputStream
    //   3: dup
    //   4: new 157	java/io/BufferedOutputStream
    //   7: dup
    //   8: aload_0
    //   9: getfield 30	com/facebook/AppEventsLogger$PersistedEvents:context	Landroid/content/Context;
    //   12: ldc 8
    //   14: iconst_0
    //   15: invokevirtual 161	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   18: invokespecial 164	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   21: invokespecial 165	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   24: astore_1
    //   25: aload_1
    //   26: aload_0
    //   27: getfield 28	com/facebook/AppEventsLogger$PersistedEvents:persistedEvents	Ljava/util/HashMap;
    //   30: invokevirtual 169	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   33: aload_1
    //   34: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   37: return
    //   38: astore_2
    //   39: aconst_null
    //   40: astore_1
    //   41: invokestatic 140	com/facebook/AppEventsLogger:access$1300	()Ljava/lang/String;
    //   44: pop
    //   45: new 142	java/lang/StringBuilder
    //   48: dup
    //   49: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   52: ldc 145
    //   54: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: aload_2
    //   58: invokevirtual 152	java/lang/Exception:toString	()Ljava/lang/String;
    //   61: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: pop
    //   68: aload_1
    //   69: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   72: return
    //   73: astore_3
    //   74: aconst_null
    //   75: astore_1
    //   76: aload_1
    //   77: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   80: aload_3
    //   81: athrow
    //   82: astore_3
    //   83: goto -7 -> 76
    //   86: astore_2
    //   87: goto -46 -> 41
    //
    // Exception table:
    //   from	to	target	type
    //   0	25	38	java/lang/Exception
    //   0	25	73	finally
    //   25	33	82	finally
    //   41	68	82	finally
    //   25	33	86	java/lang/Exception
  }

  public void addEvents(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair, List<AppEventsLogger.AppEvent> paramList)
  {
    if (!this.persistedEvents.containsKey(paramAccessTokenAppIdPair))
      this.persistedEvents.put(paramAccessTokenAppIdPair, new ArrayList());
    ((List)this.persistedEvents.get(paramAccessTokenAppIdPair)).addAll(paramList);
  }

  public List<AppEventsLogger.AppEvent> getEvents(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    return (List)this.persistedEvents.get(paramAccessTokenAppIdPair);
  }

  public Set<AppEventsLogger.AccessTokenAppIdPair> keySet()
  {
    return this.persistedEvents.keySet();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.PersistedEvents
 * JD-Core Version:    0.6.2
 */