package textnow.az;

import android.widget.RelativeLayout.LayoutParams;
import com.tremorvideo.sdk.android.videoad.bc;
import com.tremorvideo.sdk.android.videoad.dn;

public final class d
  implements c
{
  private dn a;
  private e b;
  private String c;

  public d(dn paramdn, e parame, String paramString)
  {
    this.a = paramdn;
    this.b = parame;
    this.c = paramString;
  }

  public final void a()
  {
    this.a.n();
  }

  public final void a(float paramFloat)
  {
    if (this.b != null)
      this.b.a(paramFloat);
  }

  public final void a(RelativeLayout.LayoutParams paramLayoutParams)
  {
    this.a.a(paramLayoutParams);
  }

  public final void a(bc parambc, String paramString)
  {
    this.a.a(parambc, paramString);
  }

  public final void a(String paramString)
  {
    this.a.b(paramString);
  }

  // ERROR //
  public final void a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 21	textnow/az/d:b	Ltextnow/az/e;
    //   4: invokevirtual 48	textnow/az/e:clearView	()V
    //   7: new 50	org/json/JSONObject
    //   10: dup
    //   11: aload_2
    //   12: invokespecial 52	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   15: astore_3
    //   16: aload_3
    //   17: ldc 54
    //   19: aload_0
    //   20: getfield 23	textnow/az/d:c	Ljava/lang/String;
    //   23: invokevirtual 58	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   26: pop
    //   27: aload_0
    //   28: getfield 21	textnow/az/d:b	Ltextnow/az/e;
    //   31: aload_1
    //   32: aload_3
    //   33: invokevirtual 61	textnow/az/e:a	(Ljava/lang/String;Lorg/json/JSONObject;)V
    //   36: return
    //   37: astore 6
    //   39: aconst_null
    //   40: astore_3
    //   41: aload 6
    //   43: astore 4
    //   45: aload 4
    //   47: invokestatic 66	com/tremorvideo/sdk/android/videoad/r:a	(Ljava/lang/Throwable;)V
    //   50: goto -23 -> 27
    //   53: astore 4
    //   55: goto -10 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   7	16	37	java/lang/Exception
    //   16	27	53	java/lang/Exception
  }

  public final void b()
  {
    this.a.o();
  }

  public final void c()
  {
    if (this.b != null)
    {
      this.b.destroy();
      this.b = null;
      System.gc();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.az.d
 * JD-Core Version:    0.6.2
 */