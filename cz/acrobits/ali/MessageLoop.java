package cz.acrobits.ali;

import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;

public final class MessageLoop
  implements Runnable
{
  public static final String TAG = "MessageLoop";
  private long mTime = 9223372036854775807L;
  private final PowerManager.WakeLock mWakeLock = ((PowerManager)AndroidUtil.getApplicationContext().getSystemService("power")).newWakeLock(1, "MessageLoop");

  private native void handleMessages();

  private void pause()
  {
    if (!this.mWakeLock.isHeld())
      return;
    AndroidUtil.log("MessageLoop", "Pausing...");
    AndroidUtil.handler.removeCallbacks(this);
    this.mWakeLock.release();
  }

  private void resume()
  {
    if (this.mWakeLock.isHeld());
    do
    {
      return;
      AndroidUtil.log("MessageLoop", "Resuming...");
      this.mWakeLock.acquire();
    }
    while (this.mTime >= 9223372036854775807L);
    AndroidUtil.handler.postAtTime(this, this.mTime);
  }

  private void schedule(long paramLong)
  {
    long l = paramLong + SystemClock.uptimeMillis();
    if (l > this.mTime);
    do
    {
      return;
      this.mTime = l;
    }
    while (!this.mWakeLock.isHeld());
    AndroidUtil.handler.removeCallbacks(this);
    AndroidUtil.handler.postAtTime(this, this.mTime);
  }

  public final boolean isDue()
  {
    return this.mTime <= SystemClock.uptimeMillis();
  }

  public final void run()
  {
    this.mTime = 9223372036854775807L;
    handleMessages();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.ali.MessageLoop
 * JD-Core Version:    0.6.2
 */