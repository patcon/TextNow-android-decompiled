package textnow.ax;

import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ab
{
  private List<ac> a;

  public static boolean a(ad paramad)
  {
    boolean bool = true;
    switch (1.a[paramad.ordinal()])
    {
    default:
      bool = false;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    return bool;
  }

  public final int a()
  {
    return this.a.size();
  }

  public final ac a(int paramInt)
  {
    return (ac)this.a.get(paramInt);
  }

  public final ac a(ae paramae)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      ac localac = (ac)localIterator.next();
      if (localac.b() == paramae)
        return localac;
    }
    return null;
  }

  public final void a(y paramy, int paramInt)
  {
    int i = paramy.a.readUnsignedByte();
    this.a = new ArrayList(i);
    int j = 0;
    if (j < i)
    {
      int k = paramy.a();
      ae localae = ae.values()[paramy.a.readUnsignedByte()];
      ad localad1 = ad.values()[paramy.a.readUnsignedByte()];
      String str = null;
      if (paramInt > 1)
        str = paramy.c();
      Object localObject;
      if (localad1 == ad.b)
        localObject = new Integer(paramy.a.readUnsignedByte());
      while (true)
      {
        this.a.add(new ac(this, localae, localad1, localObject, k, str));
        j++;
        break;
        if (a(localad1))
        {
          localObject = new Integer(paramy.a.readUnsignedByte());
        }
        else if (localad1 == ad.c)
        {
          localObject = new int[2];
          localObject[0] = paramy.a.readUnsignedByte();
          localObject[1] = paramy.a();
        }
        else if ((localad1 == ad.i) && (paramInt > 2))
        {
          localObject = new Integer(paramy.a.readUnsignedByte());
        }
        else if ((localad1 == ad.Q) && (paramInt >= 5))
        {
          localObject = paramy.c();
        }
        else if (localad1 != ad.R)
        {
          ad localad2 = ad.S;
          localObject = null;
          if (localad1 != localad2);
        }
        else
        {
          localObject = null;
          if (paramInt >= 5)
            localObject = new Integer(paramy.a());
        }
      }
    }
  }

  public final boolean b()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      if (((ac)localIterator.next()).c() == ad.u)
        return true;
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.ab
 * JD-Core Version:    0.6.2
 */