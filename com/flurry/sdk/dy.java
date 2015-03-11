package com.flurry.sdk;

import android.content.Context;
import android.os.Looper;
import android.telephony.TelephonyManager;
import java.util.Arrays;

public class dy
{
  private static final String a = dy.class.getSimpleName();
  private static byte[] b;

  public static byte[] a()
  {
    try
    {
      if (Looper.getMainLooper().getThread() == Thread.currentThread())
        throw new IllegalStateException("Must be called from a background thread!");
    }
    finally
    {
    }
    byte[] arrayOfByte;
    if (b != null)
      arrayOfByte = b;
    while (true)
    {
      return arrayOfByte;
      if (do.a().b().checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") != 0)
      {
        arrayOfByte = null;
      }
      else
      {
        b();
        arrayOfByte = b;
      }
    }
  }

  private static void b()
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)do.a().b().getSystemService("phone");
    if (localTelephonyManager == null);
    String str;
    do
    {
      return;
      str = localTelephonyManager.getDeviceId();
    }
    while ((str == null) || (str.trim().length() <= 0));
    byte[] arrayOfByte;
    try
    {
      arrayOfByte = fe.d(str);
      if ((arrayOfByte != null) && (arrayOfByte.length == 20))
      {
        b = arrayOfByte;
        return;
      }
    }
    catch (Exception localException)
    {
      eo.a(6, a, "Exception in generateHashedImei()");
      return;
    }
    eo.a(6, a, "sha1 is not " + 20 + " bytes long: " + Arrays.toString(arrayOfByte));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.dy
 * JD-Core Version:    0.6.2
 */