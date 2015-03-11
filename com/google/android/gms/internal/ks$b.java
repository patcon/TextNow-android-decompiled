package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ks$b extends hy
  implements SafeParcelable, Person.Cover
{
  public static final kv CREATOR = new kv();
  private static final HashMap<String, hy.a<?, ?>> acr;
  private final Set<Integer> acs;
  private ks.b.a adL;
  private ks.b.b adM;
  private int adN;
  private final int xM;

  static
  {
    HashMap localHashMap = new HashMap();
    acr = localHashMap;
    localHashMap.put("coverInfo", hy.a.a("coverInfo", 2, ks.b.a.class));
    acr.put("coverPhoto", hy.a.a("coverPhoto", 3, ks.b.b.class));
    acr.put("layout", hy.a.a("layout", 4, new hv().f("banner", 0), false));
  }

  public ks$b()
  {
    this.xM = 1;
    this.acs = new HashSet();
  }

  ks$b(Set<Integer> paramSet, int paramInt1, ks.b.a parama, ks.b.b paramb, int paramInt2)
  {
    this.acs = paramSet;
    this.xM = paramInt1;
    this.adL = parama;
    this.adM = paramb;
    this.adN = paramInt2;
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
      return this.adL;
    case 3:
      return this.adM;
    case 4:
    }
    return Integer.valueOf(this.adN);
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

  public final Person.Cover.CoverInfo getCoverInfo()
  {
    return this.adL;
  }

  public final Person.Cover.CoverPhoto getCoverPhoto()
  {
    return this.adM;
  }

  public final int getLayout()
  {
    return this.adN;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final boolean hasCoverInfo()
  {
    return this.acs.contains(Integer.valueOf(2));
  }

  public final boolean hasCoverPhoto()
  {
    return this.acs.contains(Integer.valueOf(3));
  }

  public final boolean hasLayout()
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

  final ks.b.a kO()
  {
    return this.adL;
  }

  final ks.b.b kP()
  {
    return this.adM;
  }

  public final b kQ()
  {
    return this;
  }

  final Set<Integer> kk()
  {
    return this.acs;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kv.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ks.b
 * JD-Core Version:    0.6.2
 */