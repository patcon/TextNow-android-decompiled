package android.support.v4.app;

import android.app.Notification.Action;
import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Parcelable;
import java.util.ArrayList;

final class bd
{
  private static Notification.Action a(bi parambi)
  {
    Notification.Action.Builder localBuilder = new Notification.Action.Builder(parambi.a(), parambi.b(), parambi.c()).addExtras(parambi.d());
    ch[] arrayOfch = parambi.e();
    if (arrayOfch != null)
    {
      RemoteInput[] arrayOfRemoteInput = cf.a(arrayOfch);
      int i = arrayOfRemoteInput.length;
      for (int j = 0; j < i; j++)
        localBuilder.addRemoteInput(arrayOfRemoteInput[j]);
    }
    return localBuilder.build();
  }

  public static ArrayList<Parcelable> a(bi[] paramArrayOfbi)
  {
    Object localObject;
    if (paramArrayOfbi == null)
      localObject = null;
    while (true)
    {
      return localObject;
      localObject = new ArrayList(paramArrayOfbi.length);
      int i = paramArrayOfbi.length;
      for (int j = 0; j < i; j++)
        ((ArrayList)localObject).add(a(paramArrayOfbi[j]));
    }
  }

  public static void a(Notification.Builder paramBuilder, bi parambi)
  {
    Notification.Action.Builder localBuilder = new Notification.Action.Builder(parambi.a(), parambi.b(), parambi.c());
    if (parambi.e() != null)
    {
      RemoteInput[] arrayOfRemoteInput = cf.a(parambi.e());
      int i = arrayOfRemoteInput.length;
      for (int j = 0; j < i; j++)
        localBuilder.addRemoteInput(arrayOfRemoteInput[j]);
    }
    if (parambi.d() != null)
      localBuilder.addExtras(parambi.d());
    paramBuilder.addAction(localBuilder.build());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bd
 * JD-Core Version:    0.6.2
 */