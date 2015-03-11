package android.support.v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;

final class bx
{
  static RemoteInput[] a(bz[] paramArrayOfbz)
  {
    if (paramArrayOfbz == null)
      return null;
    RemoteInput[] arrayOfRemoteInput = new RemoteInput[paramArrayOfbz.length];
    for (int i = 0; i < paramArrayOfbz.length; i++)
    {
      bz localbz = paramArrayOfbz[i];
      arrayOfRemoteInput[i] = new RemoteInput.Builder(localbz.a()).setLabel(localbz.b()).setChoices(localbz.c()).setAllowFreeFormInput(localbz.d()).addExtras(localbz.e()).build();
    }
    return arrayOfRemoteInput;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bx
 * JD-Core Version:    0.6.2
 */