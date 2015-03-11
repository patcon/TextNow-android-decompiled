package textnow.p;

final class m
  implements Comparable<m>
{
  public int a;
  public long b;
  public String c;
  public String d;
  public String e;
  public long f;

  public m(int paramInt, long paramLong1, String paramString1, String paramString2, String paramString3, long paramLong2)
  {
    this.a = paramInt;
    this.b = paramLong1;
    if (paramString1 == null)
      paramString1 = "";
    this.c = paramString1;
    if (paramString2 == null)
      paramString2 = "";
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramLong2;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.m
 * JD-Core Version:    0.6.2
 */