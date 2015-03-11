package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ks$a extends hy
  implements SafeParcelable, Person.AgeRange
{
  public static final ku CREATOR = new ku();
  private static final HashMap<String, hy.a<?, ?>> acr;
  private final Set<Integer> acs;
  private int adJ;
  private int adK;
  private final int xM;

  static
  {
    HashMap localHashMap = new HashMap();
    acr = localHashMap;
    localHashMap.put("max", hy.a.g("max", 2));
    acr.put("min", hy.a.g("min", 3));
  }

  public ks$a()
  {
    this.xM = 1;
    this.acs = new HashSet();
  }

  ks$a(Set<Integer> paramSet, int paramInt1, int paramInt2, int paramInt3)
  {
    this.acs = paramSet;
    this.xM = paramInt1;
    this.adJ = paramInt2;
    this.adK = paramInt3;
  }

  protected final boolean a(hy.a parama)
  {
    return this.acs.contains(Integer.valueOf(parama.fN()));
  }

  protected final Object aF(String paramString)
  {
    return null;
  }

  protected final boolean aG(String paramString)
  {
    return false;
  }

  protected final Object b(hy.a parama)
  {
    switch (parama.fN())
    {
    default:
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.fN());
    case 2:
      return Integer.valueOf(this.adJ);
    case 3:
    }
    return Integer.valueOf(this.adK);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a))
      return false;
    if (this == paramObject)
      return true;
    a locala = (a)paramObject;
    Iterator localIterator = acr.values().iterator();
    while (localIterator.hasNext())
    {
      hy.a locala1 = (hy.a)localIterator.next();
      if (a(locala1))
      {
        if (locala.a(locala1))
        {
          if (!b(locala1).equals(locala.b(locala1)))
            return false;
        }
        else
          return false;
      }
      else if (locala.a(locala1))
        return false;
    }
    return true;
  }

  public final HashMap<String, hy.a<?, ?>> fG()
  {
    return acr;
  }

  public final int getMax()
  {
    return this.adJ;
  }

  public final int getMin()
  {
    return this.adK;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final boolean hasMax()
  {
    return this.acs.contains(Integer.valueOf(2));
  }

  public final boolean hasMin()
  {
    return this.acs.contains(Integer.valueOf(3));
  }

  public final int hashCode()
  {
    Iterator localIterator = acr.values().iterator();
    int i = 0;
    hy.a locala;
    if (localIterator.hasNext())
    {
      locala = (hy.a)localIterator.next();
      if (!a(locala))
        break label66;
    }
    label66: for (int j = i + locala.fN() + b(locala).hashCode(); ; j = i)
    {
      i = j;
      break;
      return i;
    }
  }

  public final boolean isDataValid()
  {
    return true;
  }

  public final a kN()
  {
    return this;
  }

  final Set<Integer> kk()
  {
    return this.acs;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ku.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ks.a
 * JD-Core Version:    0.6.2
 */