package textnow.p;

public final class j
{
  int a;
  String b;

  public j(int paramInt, String paramString)
  {
    this.a = paramInt;
    if ((paramString == null) || (paramString.trim().length() == 0))
    {
      this.b = d.a(paramInt);
      return;
    }
    this.b = (paramString + " (response: " + d.a(paramInt) + ")");
  }

  public final int a()
  {
    return this.a;
  }

  public final boolean b()
  {
    return this.a == 0;
  }

  public final boolean c()
  {
    return !b();
  }

  public final String toString()
  {
    return "IabResult: " + this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.p.j
 * JD-Core Version:    0.6.2
 */