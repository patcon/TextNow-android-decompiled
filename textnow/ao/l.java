package textnow.ao;

final class l<K, V>
{
  private p<K, V> a;

  public final p<K, V> a()
  {
    p localp1 = this.a;
    if (localp1 == null)
      return null;
    Object localObject1 = localp1.a;
    localp1.a = null;
    p localp2;
    for (Object localObject2 = localp1.c; localObject2 != null; localObject2 = localp2)
    {
      ((p)localObject2).a = ((p)localObject1);
      localp2 = ((p)localObject2).b;
      localObject1 = localObject2;
    }
    this.a = ((p)localObject1);
    return localp1;
  }

  final void a(p<K, V> paramp)
  {
    Object localObject1 = null;
    p localp;
    for (Object localObject2 = paramp; localObject2 != null; localObject2 = localp)
    {
      ((p)localObject2).a = localObject1;
      localp = ((p)localObject2).b;
      localObject1 = localObject2;
    }
    this.a = localObject1;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ao.l
 * JD-Core Version:    0.6.2
 */