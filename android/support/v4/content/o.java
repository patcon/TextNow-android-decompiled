package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

final class o
{
  final IntentFilter a;
  final BroadcastReceiver b;
  boolean c;

  o(IntentFilter paramIntentFilter, BroadcastReceiver paramBroadcastReceiver)
  {
    this.a = paramIntentFilter;
    this.b = paramBroadcastReceiver;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("Receiver{");
    localStringBuilder.append(this.b);
    localStringBuilder.append(" filter=");
    localStringBuilder.append(this.a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.content.o
 * JD-Core Version:    0.6.2
 */