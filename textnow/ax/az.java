package textnow.ax;

public final class az extends f
{
  public az(ao paramao)
  {
    super(paramao);
  }

  private static String a(long paramLong, int paramInt)
  {
    float f = (float)paramLong / 1000.0F;
    if (f < 0.1D)
      return "0";
    return Integer.toString(paramInt + (int)Math.ceil(f));
  }

  protected final String a(as paramas, g paramg, long paramLong)
  {
    if (this.b != null)
      return this.b;
    e locale = this.i.e();
    ba localba = (ba)paramg;
    String str1 = locale.a(localba.a);
    String str2 = locale.a(localba.x);
    String str3 = "##";
    bb localbb = bb.values()[localba.y];
    ak localak = paramas.b;
    if (localbb == bb.d)
    {
      this.i.b();
      str3 = a(paramLong, localba.z);
    }
    while (true)
    {
      return str1 + str3 + str2;
      if (localbb == bb.c)
      {
        long l = this.i.b() - paramLong;
        this.i.b();
        str3 = a(l, localba.z);
      }
      else if (localbb == bb.a)
      {
        if (localak != null)
        {
          int k = localak.e();
          int m = localak.d();
          if ((k != -1) && (m != -1))
            str3 = a(k - m, localba.z);
          else
            str3 = a(0L, localba.z);
        }
      }
      else if ((localbb == bb.b) && (localak != null))
      {
        int i = localak.e();
        int j = localak.d();
        if ((i != -1) && (j != -1))
          str3 = a(j, localba.z);
        else
          str3 = a(0L, localba.z);
      }
    }
  }

  public final void a(as paramas, long paramLong)
  {
    super.a(paramas, paramLong);
  }

  protected final g c()
  {
    return new ba(this, (byte)0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.az
 * JD-Core Version:    0.6.2
 */