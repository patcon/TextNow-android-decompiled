package cz.acrobits.ali;

import android.os.Handler;

public class PointerHolder$Stalker
  implements Runnable
{
  public long mPointer = 0L;

  public void enqueue()
  {
    AndroidUtil.handler.post(this);
  }

  public native void release();

  public void run()
  {
    release();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.ali.PointerHolder.Stalker
 * JD-Core Version:    0.6.2
 */