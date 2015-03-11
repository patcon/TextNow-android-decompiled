package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class kp extends hy
  implements SafeParcelable, Moment
{
  public static final kq CREATOR = new kq();
  private static final HashMap<String, hy.a<?, ?>> acr;
  private final Set<Integer> acs;
  private String adf;
  private kn adn;
  private kn ado;
  private String qX;
  private String xG;
  private final int xM;

  static
  {
    HashMap localHashMap = new HashMap();
    acr = localHashMap;
    localHashMap.put("id", hy.a.j("id", 2));
    acr.put("result", hy.a.a("result", 4, kn.class));
    acr.put("startDate", hy.a.j("startDate", 5));
    acr.put("target", hy.a.a("target", 6, kn.class));
    acr.put("type", hy.a.j("type", 7));
  }

  public kp()
  {
    this.xM = 1;
    this.acs = new HashSet();
  }

  kp(Set<Integer> paramSet, int paramInt, String paramString1, kn paramkn1, String paramString2, kn paramkn2, String paramString3)
  {
    this.acs = paramSet;
    this.xM = paramInt;
    this.xG = paramString1;
    this.adn = paramkn1;
    this.adf = paramString2;
    this.ado = paramkn2;
    this.qX = paramString3;
  }

  public kp(Set<Integer> paramSet, String paramString1, kn paramkn1, String paramString2, kn paramkn2, String paramString3)
  {
    this.acs = paramSet;
    this.xM = 1;
    this.xG = paramString1;
    this.adn = paramkn1;
    this.adf = paramString2;
    this.ado = paramkn2;
    this.qX = paramString3;
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
    case 3:
    default:
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.fN());
    case 2:
      return this.xG;
    case 4:
      return this.adn;
    case 5:
      return this.adf;
    case 6:
      return this.ado;
    case 7:
    }
    return this.qX;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof kp))
      return false;
    if (this == paramObject)
      return true;
    kp localkp = (kp)paramObject;
    Iterator localIterator = acr.values().iterator();
    while (localIterator.hasNext())
    {
      hy.a locala = (hy.a)localIterator.next();
      if (a(locala))
      {
        if (localkp.a(locala))
        {
          if (!b(locala).equals(localkp.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localkp.a(locala))
        return false;
    }
    return true;
  }

  public final HashMap<String, hy.a<?, ?>> fG()
  {
    return acr;
  }

  public final String getId()
  {
    return this.xG;
  }

  public final ItemScope getResult()
  {
    return this.adn;
  }

  public final String getStartDate()
  {
    return this.adf;
  }

  public final ItemScope getTarget()
  {
    return this.ado;
  }

  public final String getType()
  {
    return this.qX;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final boolean hasId()
  {
    return this.acs.contains(Integer.valueOf(2));
  }

  public final boolean hasResult()
  {
    return this.acs.contains(Integer.valueOf(4));
  }

  public final boolean hasStartDate()
  {
    return this.acs.contains(Integer.valueOf(5));
  }

  public final boolean hasTarget()
  {
    return this.acs.contains(Integer.valueOf(6));
  }

  public final boolean hasType()
  {
    return this.acs.contains(Integer.valueOf(7));
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

  final kn kB()
  {
    return this.adn;
  }

  final kn kC()
  {
    return this.ado;
  }

  public final kp kD()
  {
    return this;
  }

  final Set<Integer> kk()
  {
    return this.acs;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kq.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kp
 * JD-Core Version:    0.6.2
 */