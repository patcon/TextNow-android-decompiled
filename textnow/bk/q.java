package textnow.bk;

final class q
{
  private final String a;
  private final by b;
  private r c;
  private ay d = ay.a;
  private final as e;
  private p f;

  public q(String paramString, by paramby, as paramas)
  {
    this.a = paramString;
    if (paramby == null)
    {
      this.b = new by();
      if (paramas != null)
        break label72;
    }
    label72: for (this.e = new as(); ; this.e = paramas)
    {
      if (!a(this.a))
        break label80;
      this.c = r.b;
      return;
      this.b = paramby;
      break;
    }
    label80: this.c = r.a;
  }

  private static boolean a(String paramString)
  {
    int i;
    if (paramString != null)
    {
      i = "file:".length();
      if (paramString.length() >= i);
    }
    else
    {
      return false;
    }
    for (int j = 0; ; j++)
    {
      if (j >= i)
        break label47;
      if (paramString.charAt(j) != "file:".charAt(j))
        break;
    }
    label47: return true;
  }

  public final String a()
  {
    return this.a;
  }

  final void a(ay paramay)
  {
    this.d = paramay;
  }

  public final as b()
  {
    return this.e;
  }

  public final by c()
  {
    return this.b;
  }

  final ay d()
  {
    return this.d;
  }

  public final p e()
  {
    return this.f;
  }

  public final boolean f()
  {
    return this.c == r.b;
  }

  public final boolean g()
  {
    switch (1.a[this.d.ordinal()])
    {
    default:
      return false;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.q
 * JD-Core Version:    0.6.2
 */