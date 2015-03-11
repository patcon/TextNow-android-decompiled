package com.mopub.common.event;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import com.mopub.common.VisibleForTesting;
import java.util.Iterator;

@VisibleForTesting
public class MoPubEvents$EventDispatcher
  implements TimedEvent.Listener
{
  private final Iterable<EventRecorder> mEventRecorders;

  @VisibleForTesting
  Handler.Callback mHandlerCallback;
  private final HandlerThread mHandlerThread;
  private final Handler mMessageHandler;

  @VisibleForTesting
  MoPubEvents$EventDispatcher(Iterable<EventRecorder> paramIterable, HandlerThread paramHandlerThread)
  {
    this.mEventRecorders = paramIterable;
    this.mHandlerCallback = new Handler.Callback()
    {
      public boolean handleMessage(Message paramAnonymousMessage)
      {
        if ((paramAnonymousMessage.obj instanceof TimedEvent))
        {
          TimedEvent localTimedEvent = (TimedEvent)paramAnonymousMessage.obj;
          Iterator localIterator2 = MoPubEvents.EventDispatcher.this.mEventRecorders.iterator();
          while (localIterator2.hasNext())
            ((EventRecorder)localIterator2.next()).recordTimedEvent(localTimedEvent);
        }
        if ((paramAnonymousMessage.obj instanceof Event))
        {
          Event localEvent = (Event)paramAnonymousMessage.obj;
          Iterator localIterator1 = MoPubEvents.EventDispatcher.this.mEventRecorders.iterator();
          while (localIterator1.hasNext())
            ((EventRecorder)localIterator1.next()).recordEvent(localEvent);
        }
        return true;
      }
    };
    this.mHandlerThread = paramHandlerThread;
    this.mHandlerThread.start();
    this.mMessageHandler = new Handler(this.mHandlerThread.getLooper(), this.mHandlerCallback);
  }

  private void sendEventToHandlerThread(BaseEvent paramBaseEvent)
  {
    Message.obtain(this.mMessageHandler, 0, paramBaseEvent).sendToTarget();
  }

  public void onCancelled(TimedEvent paramTimedEvent)
  {
  }

  public void onStopped(TimedEvent paramTimedEvent)
  {
    sendEventToHandlerThread(paramTimedEvent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.event.MoPubEvents.EventDispatcher
 * JD-Core Version:    0.6.2
 */