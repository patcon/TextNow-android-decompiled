package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public abstract class h
  implements g
{
  protected MotionEvent jO;
  protected DisplayMetrics jP;
  protected m jQ;
  private n jR;

  protected h(Context paramContext, m paramm, n paramn)
  {
    this.jQ = paramm;
    this.jR = paramn;
    try
    {
      this.jP = paramContext.getResources().getDisplayMetrics();
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      this.jP = new DisplayMetrics();
      this.jP.density = 1.0F;
    }
  }

  private String a(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      try
      {
        t();
        if (paramBoolean1)
          e(paramContext);
        while (true)
        {
          arrayOfByte = u();
          if (arrayOfByte.length != 0)
            break label74;
          String str2 = Integer.toString(5);
          return str2;
          if (!paramBoolean2)
            break;
          d(paramContext);
        }
      }
      finally
      {
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      byte[] arrayOfByte;
      while (true)
      {
        return Integer.toString(7);
        c(paramContext);
      }
      String str1 = a(arrayOfByte, paramString);
      return str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      label74: return Integer.toString(7);
    }
    catch (IOException localIOException)
    {
    }
    return Integer.toString(3);
  }

  private void t()
  {
    this.jR.reset();
  }

  private byte[] u()
  {
    return this.jR.A();
  }

  public String a(Context paramContext)
  {
    return a(paramContext, null, false, false);
  }

  public String a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, true, false);
  }

  String a(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte.length > 239)
    {
      t();
      a(20, 1L);
      paramArrayOfByte = u();
    }
    byte[] arrayOfByte5;
    if (paramArrayOfByte.length < 239)
    {
      arrayOfByte5 = new byte[239 - paramArrayOfByte.length];
      new SecureRandom().nextBytes(arrayOfByte5);
    }
    for (byte[] arrayOfByte1 = ByteBuffer.allocate(240).put((byte)paramArrayOfByte.length).put(paramArrayOfByte).put(arrayOfByte5).array(); ; arrayOfByte1 = ByteBuffer.allocate(240).put((byte)paramArrayOfByte.length).put(paramArrayOfByte).array())
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(arrayOfByte1);
      byte[] arrayOfByte2 = localMessageDigest.digest();
      byte[] arrayOfByte3 = ByteBuffer.allocate(256).put(arrayOfByte2).put(arrayOfByte1).array();
      byte[] arrayOfByte4 = new byte[256];
      new f().a(arrayOfByte3, arrayOfByte4);
      if ((paramString != null) && (paramString.length() > 0))
        a(paramString, arrayOfByte4);
      return this.jQ.a(arrayOfByte4, true);
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.jO != null)
      this.jO.recycle();
    this.jO = MotionEvent.obtain(0L, paramInt3, 1, paramInt1 * this.jP.density, paramInt2 * this.jP.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
  }

  protected void a(int paramInt, long paramLong)
  {
    this.jR.b(paramInt, paramLong);
  }

  protected void a(int paramInt, String paramString)
  {
    this.jR.b(paramInt, paramString);
  }

  public void a(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 1)
    {
      if (this.jO != null)
        this.jO.recycle();
      this.jO = MotionEvent.obtain(paramMotionEvent);
    }
  }

  void a(String paramString, byte[] paramArrayOfByte)
  {
    if (paramString.length() > 32)
      paramString = paramString.substring(0, 32);
    new lx(paramString.getBytes("UTF-8")).o(paramArrayOfByte);
  }

  public String b(Context paramContext)
  {
    return a(paramContext, null, false, true);
  }

  protected abstract void c(Context paramContext);

  protected abstract void d(Context paramContext);

  protected abstract void e(Context paramContext);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.h
 * JD-Core Version:    0.6.2
 */