package textnow.bd;

final class n
{
  private final int a;
  private final bp[] b;

  public n(bp[] paramArrayOfbp)
  {
    this.a = paramArrayOfbp.length;
    this.b = new bp[this.a];
    for (int i = 0; i < this.a; i++)
    {
      if (paramArrayOfbp[i] == null)
        throw new IllegalArgumentException("The accessor provided at index " + i + " is null!");
      this.b[i] = paramArrayOfbp[i];
    }
  }

  public final bo a()
  {
    int i = 0;
    try
    {
      bo localbo;
      if (i < this.a)
      {
        boolean bool;
        do
        {
          localbo = this.b[i].a();
          if (localbo == null)
            break;
          bool = localbo.e();
        }
        while (bool);
      }
      while (true)
      {
        return localbo;
        i++;
        break;
        localbo = null;
      }
    }
    finally
    {
    }
  }

  public final void a(bo parambo)
  {
    try
    {
      int i = parambo.a();
      this.b[i].a(parambo);
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
        bo localbo2 = this.b[i].c();
        localbo1 = localbo2;
        if (localbo1 != null)
          return localbo1;
        i++;
      }
      bo localbo1 = null;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.n
 * JD-Core Version:    0.6.2
 */