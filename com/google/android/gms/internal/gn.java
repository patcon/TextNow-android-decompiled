package com.google.android.gms.internal;

import android.text.TextUtils;

public class gn
{
  private static boolean Cl = false;
  private boolean Cm;
  private boolean Cn;
  private String Co;
  private final String mTag;

  public gn(String paramString)
  {
    this(paramString, es());
  }

  public gn(String paramString, boolean paramBoolean)
  {
    this.mTag = paramString;
    this.Cm = paramBoolean;
    this.Cn = false;
  }

  private String e(String paramString, Object[] paramArrayOfObject)
  {
    String str = String.format(paramString, paramArrayOfObject);
    if (!TextUtils.isEmpty(this.Co))
      str = this.Co + str;
    return str;
  }

  public static boolean es()
  {
    return Cl;
  }

  public void a(String paramString, Object[] paramArrayOfObject)
  {
    if (er())
      e(paramString, paramArrayOfObject);
  }

  public void a(Throwable paramThrowable, String paramString, Object[] paramArrayOfObject)
  {
    if ((eq()) || (Cl))
      e(paramString, paramArrayOfObject);
  }

  public void ap(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    for (String str = null; ; str = String.format("[%s] ", new Object[] { paramString }))
    {
      this.Co = str;
      return;
    }
  }

  public void b(String paramString, Object[] paramArrayOfObject)
  {
    if ((eq()) || (Cl))
      e(paramString, paramArrayOfObject);
  }

  public void c(String paramString, Object[] paramArrayOfObject)
  {
    e(paramString, paramArrayOfObject);
  }

  public void d(String paramString, Object[] paramArrayOfObject)
  {
    e(paramString, paramArrayOfObject);
  }

  public boolean eq()
  {
    return this.Cm;
  }

  public boolean er()
  {
    return this.Cn;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gn
 * JD-Core Version:    0.6.2
 */