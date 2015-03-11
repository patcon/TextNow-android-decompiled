package com.mopub.common.event;

import android.os.HandlerThread;
import com.mopub.common.ClientMetadata;
import com.mopub.common.VisibleForTesting;
import java.util.ArrayList;

public class MoPubEvents
{
  private static volatile MoPubEvents.EventDispatcher sEventDispatcher;

  public static void event(BaseEvent.Type paramType, String paramString)
  {
    MoPubEvents.EventDispatcher.access$100(getDispatcher(), new Event(paramType, paramString, ClientMetadata.getInstance()));
  }

  private static MoPubEvents.EventDispatcher getDispatcher()
  {
    MoPubEvents.EventDispatcher localEventDispatcher = sEventDispatcher;
    if (localEventDispatcher == null);
    try
    {
      localEventDispatcher = sEventDispatcher;
      if (localEventDispatcher == null)
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(new MoPubEvents.NoopEventRecorder(null));
        localEventDispatcher = new MoPubEvents.EventDispatcher(localArrayList, new HandlerThread("mopub_event_queue"));
        sEventDispatcher = localEventDispatcher;
      }
      return localEventDispatcher;
    }
    finally
    {
    }
  }

  @VisibleForTesting
  public static void setEventDispatcher(MoPubEvents.EventDispatcher paramEventDispatcher)
  {
    sEventDispatcher = paramEventDispatcher;
  }

  public static TimedEvent timedEvent(BaseEvent.Type paramType, String paramString)
  {
    MoPubEvents.EventDispatcher localEventDispatcher = getDispatcher();
    return new TimedEvent(paramType, paramString, ClientMetadata.getInstance(), localEventDispatcher);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.event.MoPubEvents
 * JD-Core Version:    0.6.2
 */