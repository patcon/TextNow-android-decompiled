package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class jm
  implements SafeParcelable
{
  public static final jn CREATOR = new jn();
  final List<js> Wc;
  private final String Wd;
  private final boolean We;
  final List<jw> Wf;
  private final String Wg;
  final List<String> Wh;
  private final Set<js> Wi;
  private final Set<jw> Wj;
  private final Set<String> Wk;
  final int xM;

  jm(int paramInt, List<js> paramList, String paramString1, boolean paramBoolean, List<jw> paramList1, String paramString2, List<String> paramList2)
  {
    this.xM = paramInt;
    List localList1;
    List localList2;
    if (paramList == null)
    {
      localList1 = Collections.emptyList();
      this.Wc = localList1;
      if (paramString1 == null)
        paramString1 = "";
      this.Wd = paramString1;
      this.We = paramBoolean;
      if (paramList1 != null)
        break label132;
      localList2 = Collections.emptyList();
      label52: this.Wf = localList2;
      if (paramString2 == null)
        paramString2 = "";
      this.Wg = paramString2;
      if (paramList2 != null)
        break label142;
    }
    label132: label142: for (List localList3 = Collections.emptyList(); ; localList3 = Collections.unmodifiableList(paramList2))
    {
      this.Wh = localList3;
      this.Wi = c(this.Wc);
      this.Wj = c(this.Wf);
      this.Wk = c(this.Wh);
      return;
      localList1 = Collections.unmodifiableList(paramList);
      break;
      localList2 = Collections.unmodifiableList(paramList1);
      break label52;
    }
  }

  private static <E> Set<E> c(List<E> paramList)
  {
    if (paramList.isEmpty())
      return Collections.emptySet();
    return Collections.unmodifiableSet(new HashSet(paramList));
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    jm localjm;
    do
    {
      return true;
      if (!(paramObject instanceof jm))
        return false;
      localjm = (jm)paramObject;
    }
    while ((this.Wi.equals(localjm.Wi)) && (this.We == localjm.We) && (this.Wg.equals(localjm.Wg)) && (this.Wj.equals(localjm.Wj)) && (this.Wk.equals(localjm.Wk)));
    return false;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.Wi;
    arrayOfObject[1] = Boolean.valueOf(this.We);
    arrayOfObject[2] = this.Wj;
    arrayOfObject[3] = this.Wg;
    arrayOfObject[4] = this.Wk;
    return hk.hashCode(arrayOfObject);
  }

  @Deprecated
  public final String jg()
  {
    return this.Wd;
  }

  public final boolean jh()
  {
    return this.We;
  }

  public final String ji()
  {
    return this.Wg;
  }

  public final String toString()
  {
    return hk.e(this).a("types", this.Wi).a("placeIds", this.Wk).a("requireOpenNow", Boolean.valueOf(this.We)).a("userAccountName", this.Wg).a("requestedUserDataTypes", this.Wj).toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jn.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jm
 * JD-Core Version:    0.6.2
 */