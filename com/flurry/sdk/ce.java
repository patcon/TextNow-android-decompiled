package com.flurry.sdk;

import android.text.TextUtils;
import java.io.File;

public class ce
{
  public static File a(String paramString)
  {
    return new File(fd.b(true).getPath() + File.separator + ".fcaches" + File.separator + paramString);
  }

  public static File b(String paramString)
  {
    return new File(fd.a(true).getPath() + File.separator + ".fcaches" + File.separator + paramString);
  }

  public static String c(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(fe.g(paramString));
    return String.format("%016x", arrayOfObject).trim();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ce
 * JD-Core Version:    0.6.2
 */