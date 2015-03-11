package cz.acrobits.libsoftphone;

import cz.acrobits.libsoftphone.data.Callee;

public final class Instance$Ringtones
{
  public static native String getAccountCallHandle(String paramString);

  public static native String getAccountMessageHandle(String paramString);

  public static native String getCalleeCallHandle(Callee paramCallee);

  public static String getCalleeCallHandle(String paramString)
  {
    return getCalleeCallHandle(new Callee(paramString));
  }

  public static native String getCalleeMessageHandle(Callee paramCallee);

  public static String getCalleeMessageHandle(String paramString)
  {
    return getCalleeMessageHandle(new Callee(paramString));
  }

  public static native String getDefaultCallHandle();

  public static native String getDefaultMessageHandle();

  public static native String[] getRingtones();

  public static native String getTitle(String paramString);

  public static native String registerRingtone(int paramInt1, Instance.Ringtones.Format paramFormat, String paramString, int paramInt2, int paramInt3);

  public static native boolean save();

  public static void setAccountCallHandle(String paramString, int paramInt)
  {
    setAccountCallHandle(paramString, String.valueOf(paramInt));
  }

  public static native void setAccountCallHandle(String paramString1, String paramString2);

  public static void setAccountMessageHandle(String paramString, int paramInt)
  {
    setAccountMessageHandle(paramString, String.valueOf(paramInt));
  }

  public static native void setAccountMessageHandle(String paramString1, String paramString2);

  public static void setCalleeCallHandle(Callee paramCallee, int paramInt)
  {
    setCalleeCallHandle(paramCallee, String.valueOf(paramInt));
  }

  public static native void setCalleeCallHandle(Callee paramCallee, String paramString);

  public static void setCalleeCallHandle(String paramString, int paramInt)
  {
    setCalleeCallHandle(new Callee(paramString), String.valueOf(paramInt));
  }

  public static void setCalleeCallHandle(String paramString1, String paramString2)
  {
    setCalleeCallHandle(new Callee(paramString1), paramString2);
  }

  public static void setCalleeMessageHandle(Callee paramCallee, int paramInt)
  {
    setCalleeMessageHandle(paramCallee, String.valueOf(paramInt));
  }

  public static native void setCalleeMessageHandle(Callee paramCallee, String paramString);

  public static void setCalleeMessageHandle(String paramString, int paramInt)
  {
    setCalleeMessageHandle(new Callee(paramString), String.valueOf(paramInt));
  }

  public static void setCalleeMessageHandle(String paramString1, String paramString2)
  {
    setCalleeMessageHandle(new Callee(paramString1), paramString2);
  }

  public static void setDefaultCallHandle(int paramInt)
  {
    setDefaultCallHandle(String.valueOf(paramInt));
  }

  public static native void setDefaultCallHandle(String paramString);

  public static void setDefaultMessageHandle(int paramInt)
  {
    setDefaultMessageHandle(String.valueOf(paramInt));
  }

  public static native void setDefaultMessageHandle(String paramString);

  public static native boolean startRingtonePreview(String paramString);

  public static native void stopRingtonePreview();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Instance.Ringtones
 * JD-Core Version:    0.6.2
 */