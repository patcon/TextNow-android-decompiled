package android.support.v4.app;

import android.os.Bundle;

final class cb
{
  static Bundle[] a(bz[] paramArrayOfbz)
  {
    if (paramArrayOfbz == null)
      return null;
    Bundle[] arrayOfBundle = new Bundle[paramArrayOfbz.length];
    for (int i = 0; i < paramArrayOfbz.length; i++)
    {
      bz localbz = paramArrayOfbz[i];
      Bundle localBundle = new Bundle();
      localBundle.putString("resultKey", localbz.a());
      localBundle.putCharSequence("label", localbz.b());
      localBundle.putCharSequenceArray("choices", localbz.c());
      localBundle.putBoolean("allowFreeFormInput", localbz.d());
      localBundle.putBundle("extras", localbz.e());
      arrayOfBundle[i] = localBundle;
    }
    return arrayOfBundle;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.cb
 * JD-Core Version:    0.6.2
 */