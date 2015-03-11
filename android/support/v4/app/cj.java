package android.support.v4.app;

import android.os.Bundle;

final class cj
{
  static Bundle[] a(ch[] paramArrayOfch)
  {
    if (paramArrayOfch == null)
      return null;
    Bundle[] arrayOfBundle = new Bundle[paramArrayOfch.length];
    for (int i = 0; i < paramArrayOfch.length; i++)
    {
      ch localch = paramArrayOfch[i];
      Bundle localBundle = new Bundle();
      localBundle.putString("resultKey", localch.a());
      localBundle.putCharSequence("label", localch.b());
      localBundle.putCharSequenceArray("choices", localch.c());
      localBundle.putBoolean("allowFreeFormInput", localch.d());
      localBundle.putBundle("extras", localch.e());
      arrayOfBundle[i] = localBundle;
    }
    return arrayOfBundle;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.cj
 * JD-Core Version:    0.6.2
 */