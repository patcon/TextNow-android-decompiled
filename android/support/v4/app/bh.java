package android.support.v4.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.RemoteInput;

final class bh
{
  public static void a(Notification.Builder paramBuilder, bm parambm)
  {
    Notification.Action.Builder localBuilder = new Notification.Action.Builder(parambm.a(), parambm.b(), parambm.c());
    if (parambm.e() != null)
    {
      RemoteInput[] arrayOfRemoteInput = bx.a(parambm.e());
      int i = arrayOfRemoteInput.length;
      for (int j = 0; j < i; j++)
        localBuilder.addRemoteInput(arrayOfRemoteInput[j]);
    }
    if (parambm.d() != null)
      localBuilder.addExtras(parambm.d());
    paramBuilder.addAction(localBuilder.build());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bh
 * JD-Core Version:    0.6.2
 */