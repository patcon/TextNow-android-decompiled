package textnow.be;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;

public abstract class at
{
  public float c;
  public float d;
  protected t e = new t(this);
  protected ab f;
  protected int g;
  protected List<ag> h;
  protected ao i;
  protected boolean j;
  protected boolean k;
  protected int l = 0;
  protected boolean m = true;
  protected av n = av.a;
  protected int o = 0;
  protected boolean p = false;

  public at(ao paramao)
  {
    this.i = paramao;
    this.f = new ab();
  }

  protected final RectF a(as paramas, long paramLong, RectF paramRectF)
  {
    if (this.e.e[0] != null)
    {
      u localu4 = this.e.e[0];
      paramRectF.left = t.a(localu4.a(this.i).c(paramas, paramLong), localu4.b).x;
    }
    if (this.e.e[1] != null)
    {
      u localu3 = this.e.e[1];
      PointF localPointF2 = t.a(localu3.a(this.i).c(paramas, paramLong), localu3.b);
      paramRectF.right = (paramRectF.left + localPointF2.x - paramRectF.left);
    }
    if (this.e.e[2] != null)
    {
      u localu2 = this.e.e[2];
      paramRectF.top = t.a(localu2.a(this.i).c(paramas, paramLong), localu2.b).y;
    }
    if (this.e.e[3] != null)
    {
      u localu1 = this.e.e[3];
      PointF localPointF1 = t.a(localu1.a(this.i).c(paramas, paramLong), localu1.b);
      paramRectF.bottom = (paramRectF.top + localPointF1.y - paramRectF.top);
    }
    return paramRectF;
  }

  public final ac a(ae paramae)
  {
    return this.f.a(paramae);
  }

  public ac a(boolean paramBoolean)
  {
    if (paramBoolean)
      return this.f.a(ae.e);
    return null;
  }

  protected final au a(long paramLong)
  {
    au localau = new au(this);
    Iterator localIterator = this.h.iterator();
    long l1 = -9223372036854775808L;
    long l2 = 9223372036854775807L;
    ag localag;
    if (localIterator.hasNext())
    {
      localag = (ag)localIterator.next();
      if ((localag.a() <= paramLong) && (localag.a() >= l1))
      {
        localau.a = localag;
        l1 = localag.a();
      }
      if ((localag.a() < paramLong) || (localag.a() > l2))
        break label210;
      localau.b = localag;
    }
    label210: for (long l3 = localag.a(); ; l3 = l2)
    {
      l2 = l3;
      break;
      if (localau.b == null)
        localau.b = localau.a;
      if ((localau.a != null) && (localau.b != null))
      {
        float f1 = (float)(localau.b.a() - localau.a.a());
        if (f1 == 0.0F);
        for (localau.c = 0.0F; ; localau.c = ((float)(paramLong - localau.a.a()) / f1))
          return localau;
      }
      return null;
    }
  }

  public void a()
  {
  }

  public void a(aj paramaj, long paramLong)
  {
  }

  public void a(as paramas, long paramLong)
  {
  }

  // ERROR //
  public void a(y paramy)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual 159	textnow/be/y:a	()I
    //   7: putfield 161	textnow/be/at:g	I
    //   10: aload_0
    //   11: getfield 56	textnow/be/at:i	Ltextnow/be/ao;
    //   14: invokevirtual 166	textnow/be/ao:e	()Ltextnow/be/e;
    //   17: invokevirtual 170	textnow/be/e:g	()I
    //   20: iconst_1
    //   21: if_icmple +18 -> 39
    //   24: aload_0
    //   25: invokestatic 174	textnow/be/av:values	()[Ltextnow/be/av;
    //   28: aload_1
    //   29: getfield 177	textnow/be/y:a	Ljava/io/DataInputStream;
    //   32: invokevirtual 182	java/io/DataInputStream:readUnsignedByte	()I
    //   35: aaload
    //   36: putfield 50	textnow/be/at:n	Ltextnow/be/av;
    //   39: aload_0
    //   40: getfield 56	textnow/be/at:i	Ltextnow/be/ao;
    //   43: invokevirtual 166	textnow/be/ao:e	()Ltextnow/be/e;
    //   46: invokevirtual 170	textnow/be/e:g	()I
    //   49: iconst_2
    //   50: if_icmple +26 -> 76
    //   53: aload_0
    //   54: aload_1
    //   55: invokevirtual 159	textnow/be/y:a	()I
    //   58: putfield 52	textnow/be/at:o	I
    //   61: iconst_1
    //   62: aload_0
    //   63: getfield 52	textnow/be/at:o	I
    //   66: iand
    //   67: iconst_1
    //   68: if_icmpne +166 -> 234
    //   71: aload_0
    //   72: iconst_1
    //   73: putfield 54	textnow/be/at:p	Z
    //   76: aload_0
    //   77: getfield 39	textnow/be/at:e	Ltextnow/be/t;
    //   80: astore 4
    //   82: aload 4
    //   84: aload_1
    //   85: getfield 177	textnow/be/y:a	Ljava/io/DataInputStream;
    //   88: invokevirtual 182	java/io/DataInputStream:readUnsignedByte	()I
    //   91: putfield 184	textnow/be/t:d	I
    //   94: aload 4
    //   96: invokestatic 189	textnow/be/v:values	()[Ltextnow/be/v;
    //   99: aload_1
    //   100: getfield 177	textnow/be/y:a	Ljava/io/DataInputStream;
    //   103: invokevirtual 182	java/io/DataInputStream:readUnsignedByte	()I
    //   106: aaload
    //   107: putfield 191	textnow/be/t:a	Ltextnow/be/v;
    //   110: aload 4
    //   112: invokestatic 189	textnow/be/v:values	()[Ltextnow/be/v;
    //   115: aload_1
    //   116: getfield 177	textnow/be/y:a	Ljava/io/DataInputStream;
    //   119: invokevirtual 182	java/io/DataInputStream:readUnsignedByte	()I
    //   122: aaload
    //   123: putfield 192	textnow/be/t:b	Ltextnow/be/v;
    //   126: aload 4
    //   128: iconst_4
    //   129: anewarray 67	textnow/be/u
    //   132: putfield 65	textnow/be/t:e	[Ltextnow/be/u;
    //   135: aload 4
    //   137: getfield 195	textnow/be/t:c	Ltextnow/be/at;
    //   140: getfield 56	textnow/be/at:i	Ltextnow/be/ao;
    //   143: invokevirtual 166	textnow/be/ao:e	()Ltextnow/be/e;
    //   146: invokevirtual 170	textnow/be/e:g	()I
    //   149: iconst_1
    //   150: if_icmple +92 -> 242
    //   153: iconst_0
    //   154: istore 9
    //   156: iload 9
    //   158: iconst_4
    //   159: if_icmpge +83 -> 242
    //   162: aload_1
    //   163: getfield 177	textnow/be/y:a	Ljava/io/DataInputStream;
    //   166: invokevirtual 182	java/io/DataInputStream:readUnsignedByte	()I
    //   169: iconst_1
    //   170: if_icmpne +58 -> 228
    //   173: aload 4
    //   175: getfield 65	textnow/be/t:e	[Ltextnow/be/u;
    //   178: iload 9
    //   180: new 67	textnow/be/u
    //   183: dup
    //   184: aload 4
    //   186: invokespecial 198	textnow/be/u:<init>	(Ltextnow/be/t;)V
    //   189: aastore
    //   190: aload 4
    //   192: getfield 65	textnow/be/t:e	[Ltextnow/be/u;
    //   195: iload 9
    //   197: aaload
    //   198: astore 10
    //   200: aload 10
    //   202: aload_1
    //   203: getfield 177	textnow/be/y:a	Ljava/io/DataInputStream;
    //   206: invokevirtual 182	java/io/DataInputStream:readUnsignedByte	()I
    //   209: putfield 200	textnow/be/u:a	I
    //   212: aload 10
    //   214: invokestatic 189	textnow/be/v:values	()[Ltextnow/be/v;
    //   217: aload_1
    //   218: getfield 177	textnow/be/y:a	Ljava/io/DataInputStream;
    //   221: invokevirtual 182	java/io/DataInputStream:readUnsignedByte	()I
    //   224: aaload
    //   225: putfield 77	textnow/be/u:b	Ltextnow/be/v;
    //   228: iinc 9 1
    //   231: goto -75 -> 156
    //   234: aload_0
    //   235: iconst_0
    //   236: putfield 54	textnow/be/at:p	Z
    //   239: goto -163 -> 76
    //   242: aload_0
    //   243: getfield 61	textnow/be/at:f	Ltextnow/be/ab;
    //   246: aload_1
    //   247: aload_0
    //   248: getfield 56	textnow/be/at:i	Ltextnow/be/ao;
    //   251: invokevirtual 166	textnow/be/ao:e	()Ltextnow/be/e;
    //   254: invokevirtual 170	textnow/be/e:g	()I
    //   257: invokevirtual 203	textnow/be/ab:a	(Ltextnow/be/y;I)V
    //   260: aload_1
    //   261: getfield 177	textnow/be/y:a	Ljava/io/DataInputStream;
    //   264: invokevirtual 182	java/io/DataInputStream:readUnsignedByte	()I
    //   267: istore 6
    //   269: aload_0
    //   270: new 205	java/util/ArrayList
    //   273: dup
    //   274: iload 6
    //   276: invokespecial 208	java/util/ArrayList:<init>	(I)V
    //   279: putfield 117	textnow/be/at:h	Ljava/util/List;
    //   282: iload_2
    //   283: iload 6
    //   285: if_icmpge +33 -> 318
    //   288: aload_0
    //   289: invokevirtual 211	textnow/be/at:d	()Ltextnow/be/ag;
    //   292: astore 7
    //   294: aload 7
    //   296: aload_1
    //   297: invokevirtual 213	textnow/be/ag:a	(Ltextnow/be/y;)V
    //   300: aload_0
    //   301: getfield 117	textnow/be/at:h	Ljava/util/List;
    //   304: aload 7
    //   306: invokeinterface 217 2 0
    //   311: pop
    //   312: iinc 2 1
    //   315: goto -33 -> 282
    //   318: aload_0
    //   319: getfield 61	textnow/be/at:f	Ltextnow/be/ab;
    //   322: getstatic 219	textnow/be/ae:d	Ltextnow/be/ae;
    //   325: invokevirtual 105	textnow/be/ab:a	(Ltextnow/be/ae;)Ltextnow/be/ac;
    //   328: ifnull +27 -> 355
    //   331: aload_0
    //   332: iconst_1
    //   333: putfield 221	textnow/be/at:j	Z
    //   336: aload_0
    //   337: getfield 61	textnow/be/at:f	Ltextnow/be/ab;
    //   340: getstatic 223	textnow/be/ae:k	Ltextnow/be/ae;
    //   343: invokevirtual 105	textnow/be/ab:a	(Ltextnow/be/ae;)Ltextnow/be/ac;
    //   346: ifnull +17 -> 363
    //   349: aload_0
    //   350: iconst_1
    //   351: putfield 225	textnow/be/at:k	Z
    //   354: return
    //   355: aload_0
    //   356: iconst_0
    //   357: putfield 221	textnow/be/at:j	Z
    //   360: goto -24 -> 336
    //   363: aload_0
    //   364: iconst_0
    //   365: putfield 225	textnow/be/at:k	Z
    //   368: return
    //   369: astore_3
    //   370: return
    //   371: astore 5
    //   373: goto -131 -> 242
    //
    // Exception table:
    //   from	to	target	type
    //   2	39	369	java/lang/Exception
    //   39	76	369	java/lang/Exception
    //   76	82	369	java/lang/Exception
    //   234	239	369	java/lang/Exception
    //   242	282	369	java/lang/Exception
    //   288	312	369	java/lang/Exception
    //   318	336	369	java/lang/Exception
    //   336	354	369	java/lang/Exception
    //   355	360	369	java/lang/Exception
    //   363	368	369	java/lang/Exception
    //   82	153	371	java/lang/Exception
    //   162	228	371	java/lang/Exception
  }

  public boolean a(int paramInt)
  {
    return false;
  }

  public ac b(boolean paramBoolean)
  {
    return this.f.a(ae.j);
  }

  protected ah b(as paramas, long paramLong)
  {
    return ah.h;
  }

  public void b()
  {
    this.c = 0.0F;
    this.d = 0.0F;
  }

  public ac c(boolean paramBoolean)
  {
    return this.f.a(ae.k);
  }

  public final ah c(as paramas, long paramLong)
  {
    ah localah = b(paramas, paramLong);
    localah.a += this.c;
    localah.b += this.d;
    return localah;
  }

  protected abstract ag d();

  protected final boolean d(boolean paramBoolean)
  {
    if (this.l == -1)
      paramBoolean = false;
    while (this.l != 1)
      return paramBoolean;
    return true;
  }

  public final boolean e()
  {
    return this.f.b();
  }

  public final int f()
  {
    return this.g;
  }

  public final ab g()
  {
    return this.f;
  }

  public final ao h()
  {
    return this.i;
  }

  public boolean i()
  {
    return this.j;
  }

  public final boolean j()
  {
    return this.k;
  }

  public ac k()
  {
    return this.f.a(ae.d);
  }

  public final boolean l()
  {
    return (!this.p) || (this.i.e().b);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.be.at
 * JD-Core Version:    0.6.2
 */