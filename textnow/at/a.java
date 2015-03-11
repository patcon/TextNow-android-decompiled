package textnow.at;

import java.util.ArrayList;

public abstract class a
  implements Cloneable
{
  int a;
  ArrayList<b> b = null;

  public void a()
  {
  }

  public final void a(int paramInt)
  {
    this.a = paramInt;
  }

  public final void a(b paramb)
  {
    if (this.b == null)
      this.b = new ArrayList();
    this.b.add(paramb);
  }

  public void b()
  {
  }

  public a c()
  {
    a locala;
    try
    {
      locala = (a)super.clone();
      if (this.b != null)
      {
        ArrayList localArrayList = this.b;
        locala.b = new ArrayList();
        int i = localArrayList.size();
        for (int j = 0; j < i; j++)
          locala.b.add(localArrayList.get(j));
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
    return locala;
  }

  public final int d()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.at.a
 * JD-Core Version:    0.6.2
 */