package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ks$b$b extends hy
  implements SafeParcelable, Person.Cover.CoverPhoto
{
  public static final kx CREATOR = new kx();
  private static final HashMap<String, hy.a<?, ?>> acr;
  private final Set<Integer> acs;
  private int ku;
  private int kv;
  private String qY;
  private final int xM;

  static
  {
    HashMap localHashMap = new HashMap();
    acr = localHashMap;
    localHashMap.put("height", hy.a.g("height", 2));
    acr.put("url", hy.a.j("url", 3));
    acr.put("width", hy.a.g("width", 4));
  }

  public ks$b$b()
  {
    this.xM = 1;
    this.acs = new HashSet();
  }

  ks$b$b(Set<Integer> paramSet, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    this.acs = paramSet;
    this.xM = paramInt1;
    this.kv = paramInt2;
    this.qY = paramString;
    this.ku = paramInt3;
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
      return Integer.valueOf(this.kv);
    case 3:
      return this.qY;
    case 4:
    }
    return Integer.valueOf(this.ku);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b))
      return false;
    if (this == paramObject)
      return true;
    b localb = (b)paramObject;
    Iterator localIterator = acr.values().iterator();
    while (localIterator.hasNext())
    {
      hy.a locala = (hy.a)localIterator.next();
      if (a(locala))
      {
        if (localb.a(locala))
        {
          if (!b(locala).equals(localb.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localb.a(locala))
        return false;
    }
    return true;
  }

  public final HashMap<String, hy.a<?, ?>> fG()
  {
    return acr;
  }

  public final int getHeight()
  {
    return this.kv;
  }

  public final String getUrl()
  {
    return this.qY;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final int getWidth()
  {
    return this.ku;
  }

  public final boolean hasHeight()
  {
    return this.acs.contains(Integer.valueOf(2));
  }

  public final boolean hasUrl()
  {
    return this.acs.contains(Integer.valueOf(3));
  }

  public final boolean hasWidth()
  {
    return this.acs.contains(Integer.valueOf(4));
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

  public final b kS()
  {
    return this;
  }

  final Set<Integer> kk()
  {
    return this.acs;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kx.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ks.b.b
 * JD-Core Version:    0.6.2
 */