package textnow.bk;

final class n
{
  private final int a;
  private final br[] b;

  public n(br[] paramArrayOfbr)
  {
    this.a = paramArrayOfbr.length;
    this.b = new br[this.a];
    for (int i = 0; i < this.a; i++)
    {
      if (paramArrayOfbr[i] == null)
        throw new IllegalArgumentException("The accessor provided at index " + i + " is null!");
      this.b[i] = paramArrayOfbr[i];
    }
  }

  public final bq a()
  {
    int i = 0;
    try
    {
      bq localbq;
      if (i < this.a)
      {
        boolean bool;
        do
        {
          localbq = this.b[i].a();
          if (localbq == null)
            break;
          bool = localbq.e();
        }
        while (bool);
      }
      while (true)
      {
        return localbq;
        i++;
        break;
        localbq = null;
      }
    }
    finally
    {
    }
  }

  public final void a(bq parambq)
  {
    try
    {
      int i = parambq.a();
      this.b[i].a(parambq);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int b()
  {
    int i = 0;
    int j = 0;
    try
    {
      while (i < this.a)
      {
        int k = this.b[i].b();
        j += k;
        i++;
      }
      return j;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Runnable c()
  {
    int i = 0;
    try
    {
      while (i < this.a)
      {
        bq localbq2 = this.b[i].c();
        localbq1 = localbq2;
        if (localbq1 != null)
          return localbq1;
        i++;
      }
      bq localbq1 = null;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.n
 * JD-Core Version:    0.6.2
 */