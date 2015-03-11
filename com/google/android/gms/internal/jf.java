package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class jf
  implements SafeParcelable, ji.b<String, Integer>
{
  public static final jg CREATOR = new jg();
  private final int BR;
  private final HashMap<String, Integer> Mt;
  private final HashMap<Integer, String> Mu;
  private final ArrayList<jf.a> Mv;

  public jf()
  {
    this.BR = 1;
    this.Mt = new HashMap();
    this.Mu = new HashMap();
    this.Mv = null;
  }

  jf(int paramInt, ArrayList<jf.a> paramArrayList)
  {
    this.BR = paramInt;
    this.Mt = new HashMap();
    this.Mu = new HashMap();
    this.Mv = null;
    b(paramArrayList);
  }

  private void b(ArrayList<jf.a> paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      jf.a locala = (jf.a)localIterator.next();
      h(locala.Mw, locala.Mx);
    }
  }

  public final String a(Integer paramInteger)
  {
    String str = (String)this.Mu.get(paramInteger);
    if ((str == null) && (this.Mt.containsKey("gms_unknown")))
      str = "gms_unknown";
    return str;
  }

  public final int describeContents()
  {
    return 0;
  }

  final int getVersionCode()
  {
    return this.BR;
  }

  public final jf h(String paramString, int paramInt)
  {
    this.Mt.put(paramString, Integer.valueOf(paramInt));
    this.Mu.put(Integer.valueOf(paramInt), paramString);
    return this;
  }

  final ArrayList<jf.a> hc()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.Mt.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new jf.a(str, ((Integer)this.Mt.get(str)).intValue()));
    }
    return localArrayList;
  }

  public final int hd()
  {
    return 7;
  }

  public final int he()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jg.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jf
 * JD-Core Version:    0.6.2
 */