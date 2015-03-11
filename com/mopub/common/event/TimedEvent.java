package com.mopub.common.event;

import com.mopub.common.ClientMetadata;
import java.util.concurrent.TimeUnit;

public class TimedEvent extends BaseEvent
{
  public static final int SC_NOT_RELEVANT = 0;
  public static final int SC_NO_RESPONSE = -1;
  private long mDurationMillis;
  private int mHttpStatusCode;
  private final TimedEvent.Listener mListener;
  private final long mStartTimeNanos = System.nanoTime();
  private TimedEvent.State mState = TimedEvent.State.WAITING;

  TimedEvent(BaseEvent.Type paramType, String paramString, ClientMetadata paramClientMetadata, TimedEvent.Listener paramListener)
  {
    super(paramType, paramString, paramClientMetadata);
    this.mListener = paramListener;
  }

  public void cancel()
  {
    try
    {
      if (this.mState == TimedEvent.State.WAITING)
      {
        this.mState = TimedEvent.State.CANCELLED;
        if (this.mListener != null)
          this.mListener.onCancelled(this);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long getDurationMillis()
  {
    try
    {
      long l = this.mDurationMillis;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int getHttpStatusCode()
  {
    try
    {
      int i = this.mHttpStatusCode;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void stop(int paramInt)
  {
    try
    {
      if (this.mState == TimedEvent.State.WAITING)
      {
        this.mState = TimedEvent.State.STOPPED;
        this.mHttpStatusCode = paramInt;
        long l = System.nanoTime();
        this.mDurationMillis = TimeUnit.MILLISECONDS.convert(l - this.mStartTimeNanos, TimeUnit.NANOSECONDS);
        if (this.mListener != null)
          this.mListener.onStopped(this);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.event.TimedEvent
 * JD-Core Version:    0.6.2
 */