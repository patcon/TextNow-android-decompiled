package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class nz$b$b extends jj
  implements Person.Cover.CoverPhoto
{
  public static final oe CREATOR = new oe();
  private static final HashMap<String, ji.a<?, ?>> amb;
  final int BR;
  final Set<Integer> amc;
  int lf;
  int lg;
  String uR;

  static
  {
    HashMap localHashMap = new HashMap();
    amb = localHashMap;
    localHashMap.put("height", ji.a.i("height", 2));
    amb.put("url", ji.a.l("url", 3));
    amb.put("width", ji.a.i("width", 4));
  }

  public nz$b$b()
  {
    this.BR = 1;
    this.amc = new HashSet();
  }

  nz$b$b(Set<Integer> paramSet, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    this.amc = paramSet;
    this.BR = paramInt1;
    this.lg = paramInt2;
    this.uR = paramString;
    this.lf = paramInt3;
  }

  protected final boolean a(ji.a parama)
  {
    return this.amc.contains(Integer.valueOf(parama.hm()));
  }

  protected final Object b(ji.a parama)
  {
    switch (parama.hm())
    {
    default:
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
    case 2:
      return Integer.valueOf(this.lg);
    case 3:
      return this.uR;
    case 4:
    }
    return Integer.valueOf(this.lf);
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
    Iterator localIterator = amb.values().iterator();
    while (localIterator.hasNext())
    {
      ji.a locala = (ji.a)localIterator.next();
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

  public final int getHeight()
  {
    return this.lg;
  }

  public final String getUrl()
  {
    return this.uR;
  }

  public final int getWidth()
  {
    return this.lf;
  }

  public final boolean hasHeight()
  {
    return this.amc.contains(Integer.valueOf(2));
  }

  public final boolean hasUrl()
  {
    return this.amc.contains(Integer.valueOf(3));
  }

  public final boolean hasWidth()
  {
    return this.amc.contains(Integer.valueOf(4));
  }

  public final int hashCode()
  {
    Iterator localIterator = amb.values().iterator();
    int i = 0;
    ji.a locala;
    if (localIterator.hasNext())
    {
      locala = (ji.a)localIterator.next();
      if (!a(locala))
        break label66;
    }
    label66: for (int j = i + locala.hm() + b(locala).hashCode(); ; j = i)
    {
      i = j;
      break;
      return i;
    }
  }

  public final HashMap<String, ji.a<?, ?>> hf()
  {
    return amb;
  }

  public final boolean isDataValid()
  {
    return true;
  }

  public final b ny()
  {
    return this;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oe.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nz.b.b
 * JD-Core Version:    0.6.2
 */