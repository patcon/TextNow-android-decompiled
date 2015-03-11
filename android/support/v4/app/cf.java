package android.support.v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;

final class cf
{
  static RemoteInput[] a(ch[] paramArrayOfch)
  {
    if (paramArrayOfch == null)
      return null;
    RemoteInput[] arrayOfRemoteInput = new RemoteInput[paramArrayOfch.length];
    for (int i = 0; i < paramArrayOfch.length; i++)
    {
      ch localch = paramArrayOfch[i];
      arrayOfRemoteInput[i] = new RemoteInput.Builder(localch.a()).setLabel(localch.b()).setChoices(localch.c()).setAllowFreeFormInput(localch.d()).addExtras(localch.e()).build();
    }
    return arrayOfRemoteInput;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.cf
 * JD-Core Version:    0.6.2
 */