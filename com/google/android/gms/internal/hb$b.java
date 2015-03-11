package com.google.android.gms.internal;

import java.util.ArrayList;

public abstract class hb$b<TListener>
{
  private boolean Gj;
  private TListener mListener;

  public hb$b(TListener paramTListener)
  {
    Object localObject;
    this.mListener = localObject;
    this.Gj = false;
  }

  protected abstract void d(TListener paramTListener);

  protected abstract void fu();

  // ERROR //
  public void fv()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 21	com/google/android/gms/internal/hb$b:mListener	Ljava/lang/Object;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield 23	com/google/android/gms/internal/hb$b:Gj	Z
    //   11: ifeq +28 -> 39
    //   14: new 31	java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial 32	java/lang/StringBuilder:<init>	()V
    //   21: ldc 34
    //   23: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: aload_0
    //   27: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   30: ldc 43
    //   32: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: pop
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_2
    //   42: ifnull +36 -> 78
    //   45: aload_0
    //   46: aload_2
    //   47: invokevirtual 49	com/google/android/gms/internal/hb$b:d	(Ljava/lang/Object;)V
    //   50: aload_0
    //   51: monitorenter
    //   52: aload_0
    //   53: iconst_1
    //   54: putfield 23	com/google/android/gms/internal/hb$b:Gj	Z
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_0
    //   60: invokevirtual 52	com/google/android/gms/internal/hb$b:unregister	()V
    //   63: return
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    //   69: astore 4
    //   71: aload_0
    //   72: invokevirtual 54	com/google/android/gms/internal/hb$b:fu	()V
    //   75: aload 4
    //   77: athrow
    //   78: aload_0
    //   79: invokevirtual 54	com/google/android/gms/internal/hb$b:fu	()V
    //   82: goto -32 -> 50
    //   85: astore_3
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_3
    //   89: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   2	39	64	finally
    //   39	41	64	finally
    //   45	50	69	java/lang/RuntimeException
    //   52	59	85	finally
  }

  public void fw()
  {
    try
    {
      this.mListener = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void unregister()
  {
    fw();
    synchronized (hb.b(this.Gi))
    {
      hb.b(this.Gi).remove(this);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hb.b
 * JD-Core Version:    0.6.2
 */