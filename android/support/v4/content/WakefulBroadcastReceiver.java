package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

public abstract class WakefulBroadcastReceiver extends BroadcastReceiver
{
  private static final SparseArray<PowerManager.WakeLock> a = new SparseArray();
  private static int b = 1;
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.content.WakefulBroadcastReceiver
 * JD-Core Version:    0.6.2
 */