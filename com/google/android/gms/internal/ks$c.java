package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.people.Person.Image;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ks$c extends hy
  implements SafeParcelable, Person.Image
{
  public static final ky CREATOR = new ky();
  private static final HashMap<String, hy.a<?, ?>> acr;
  private final Set<Integer> acs;
  private String qY;
  private final int xM;

  static
  {
    HashMap localHashMap = new HashMap();
    acr = localHashMap;
    localHashMap.put("url", hy.a.j("url", 2));
  }

  public ks$c()
  {
    this.xM = 1;
    this.acs = new HashSet();
  }

  public ks$c(String paramString)
  {
    this.acs = new HashSet();
    this.xM = 1;
    this.qY = paramString;
    this.acs.add(Integer.valueOf(2));
  }

  ks$c(Set<Integer> paramSet, int paramInt, String paramString)
  {
    this.acs = paramSet;
    this.xM = paramInt;
    this.qY = paramString;
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
    }
    return this.qY;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c))
      return false;
    if (this == paramObject)
      return true;
    c localc = (c)paramObject;
    Iterator localIterator = acr.values().iterator();
    while (localIterator.hasNext())
    {
      hy.a locala = (hy.a)localIterator.next();
      if (a(locala))
      {
        if (localc.a(locala))
        {
          if (!b(locala).equals(localc.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localc.a(locala))
        return false;
    }
    return true;
  }

  public final HashMap<String, hy.a<?, ?>> fG()
  {
    return acr;
  }

  public final String getUrl()
  {
    return this.qY;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final boolean hasUrl()
  {
    return this.acs.contains(Integer.valueOf(2));
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

  public final c kT()
  {
    return this;
  }

  final Set<Integer> kk()
  {
    return this.acs;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ky.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ks.c
 * JD-Core Version:    0.6.2
 */