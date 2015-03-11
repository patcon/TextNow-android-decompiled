package textnow.am;

import java.util.ArrayList;

public abstract class a
  implements Cloneable
{
  ArrayList<b> a = null;

  public void a()
  {
  }

  public final void a(b paramb)
  {
    if (this.a == null)
      this.a = new ArrayList();
    this.a.add(paramb);
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
      if (this.a != null)
      {
        ArrayList localArrayList = this.a;
        locala.a = new ArrayList();
        int i = localArrayList.size();
        for (int j = 0; j < i; j++)
          locala.a.add(localArrayList.get(j));
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
    return locala;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.am.a
 * JD-Core Version:    0.6.2
 */