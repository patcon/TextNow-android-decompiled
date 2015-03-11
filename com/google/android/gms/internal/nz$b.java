package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class nz$b extends jj
  implements Person.Cover
{
  public static final oc CREATOR = new oc();
  private static final HashMap<String, ji.a<?, ?>> amb;
  final int BR;
  final Set<Integer> amc;
  nz.b.a anv;
  nz.b.b anw;
  int anx;

  static
  {
    HashMap localHashMap = new HashMap();
    amb = localHashMap;
    localHashMap.put("coverInfo", ji.a.a("coverInfo", 2, nz.b.a.class));
    amb.put("coverPhoto", ji.a.a("coverPhoto", 3, nz.b.b.class));
    amb.put("layout", ji.a.a("layout", 4, new jf().h("banner", 0), false));
  }

  public nz$b()
  {
    this.BR = 1;
    this.amc = new HashSet();
  }

  nz$b(Set<Integer> paramSet, int paramInt1, nz.b.a parama, nz.b.b paramb, int paramInt2)
  {
    this.amc = paramSet;
    this.BR = paramInt1;
    this.anv = parama;
    this.anw = paramb;
    this.anx = paramInt2;
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
      return this.anv;
    case 3:
      return this.anw;
    case 4:
    }
    return Integer.valueOf(this.anx);
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

  public final Person.Cover.CoverInfo getCoverInfo()
  {
    return this.anv;
  }

  public final Person.Cover.CoverPhoto getCoverPhoto()
  {
    return this.anw;
  }

  public final int getLayout()
  {
    return this.anx;
  }

  public final boolean hasCoverInfo()
  {
    return this.amc.contains(Integer.valueOf(2));
  }

  public final boolean hasCoverPhoto()
  {
    return this.amc.contains(Integer.valueOf(3));
  }

  public final boolean hasLayout()
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

  public final b nw()
  {
    return this;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oc.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nz.b
 * JD-Core Version:    0.6.2
 */