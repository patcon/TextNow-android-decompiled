package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.people.Person.Organizations;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class nz$f extends jj
  implements Person.Organizations
{
  public static final oh CREATOR = new oh();
  private static final HashMap<String, ji.a<?, ?>> amb;
  final int BR;
  int FD;
  String Nw;
  String Tr;
  String amP;
  final Set<Integer> amc;
  String amz;
  String anE;
  String anF;
  boolean anG;
  String mName;

  static
  {
    HashMap localHashMap = new HashMap();
    amb = localHashMap;
    localHashMap.put("department", ji.a.l("department", 2));
    amb.put("description", ji.a.l("description", 3));
    amb.put("endDate", ji.a.l("endDate", 4));
    amb.put("location", ji.a.l("location", 5));
    amb.put("name", ji.a.l("name", 6));
    amb.put("primary", ji.a.k("primary", 7));
    amb.put("startDate", ji.a.l("startDate", 8));
    amb.put("title", ji.a.l("title", 9));
    amb.put("type", ji.a.a("type", 10, new jf().h("work", 0).h("school", 1), false));
  }

  public nz$f()
  {
    this.BR = 1;
    this.amc = new HashSet();
  }

  nz$f(Set<Integer> paramSet, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, String paramString6, String paramString7, int paramInt2)
  {
    this.amc = paramSet;
    this.BR = paramInt1;
    this.anE = paramString1;
    this.Tr = paramString2;
    this.amz = paramString3;
    this.anF = paramString4;
    this.mName = paramString5;
    this.anG = paramBoolean;
    this.amP = paramString6;
    this.Nw = paramString7;
    this.FD = paramInt2;
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
      return this.anE;
    case 3:
      return this.Tr;
    case 4:
      return this.amz;
    case 5:
      return this.anF;
    case 6:
      return this.mName;
    case 7:
      return Boolean.valueOf(this.anG);
    case 8:
      return this.amP;
    case 9:
      return this.Nw;
    case 10:
    }
    return Integer.valueOf(this.FD);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof f))
      return false;
    if (this == paramObject)
      return true;
    f localf = (f)paramObject;
    Iterator localIterator = amb.values().iterator();
    while (localIterator.hasNext())
    {
      ji.a locala = (ji.a)localIterator.next();
      if (a(locala))
      {
        if (localf.a(locala))
        {
          if (!b(locala).equals(localf.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localf.a(locala))
        return false;
    }
    return true;
  }

  public final String getDepartment()
  {
    return this.anE;
  }

  public final String getDescription()
  {
    return this.Tr;
  }

  public final String getEndDate()
  {
    return this.amz;
  }

  public final String getLocation()
  {
    return this.anF;
  }

  public final String getName()
  {
    return this.mName;
  }

  public final String getStartDate()
  {
    return this.amP;
  }

  public final String getTitle()
  {
    return this.Nw;
  }

  public final int getType()
  {
    return this.FD;
  }

  public final boolean hasDepartment()
  {
    return this.amc.contains(Integer.valueOf(2));
  }

  public final boolean hasDescription()
  {
    return this.amc.contains(Integer.valueOf(3));
  }

  public final boolean hasEndDate()
  {
    return this.amc.contains(Integer.valueOf(4));
  }

  public final boolean hasLocation()
  {
    return this.amc.contains(Integer.valueOf(5));
  }

  public final boolean hasName()
  {
    return this.amc.contains(Integer.valueOf(6));
  }

  public final boolean hasPrimary()
  {
    return this.amc.contains(Integer.valueOf(7));
  }

  public final boolean hasStartDate()
  {
    return this.amc.contains(Integer.valueOf(8));
  }

  public final boolean hasTitle()
  {
    return this.amc.contains(Integer.valueOf(9));
  }

  public final boolean hasType()
  {
    return this.amc.contains(Integer.valueOf(10));
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

  public final boolean isPrimary()
  {
    return this.anG;
  }

  public final f nB()
  {
    return this;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oh.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nz.f
 * JD-Core Version:    0.6.2
 */