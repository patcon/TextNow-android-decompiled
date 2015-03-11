package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class hv
  implements SafeParcelable, hy.b<String, Integer>
{
  public static final hw CREATOR = new hw();
  private final HashMap<String, Integer> GW;
  private final HashMap<Integer, String> GX;
  private final ArrayList<hv.a> GY;
  private final int xM;

  public hv()
  {
    this.xM = 1;
    this.GW = new HashMap();
    this.GX = new HashMap();
    this.GY = null;
  }

  hv(int paramInt, ArrayList<hv.a> paramArrayList)
  {
    this.xM = paramInt;
    this.GW = new HashMap();
    this.GX = new HashMap();
    this.GY = null;
    a(paramArrayList);
  }

  private void a(ArrayList<hv.a> paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      hv.a locala = (hv.a)localIterator.next();
      f(locala.GZ, locala.Ha);
    }
  }

  public final String a(Integer paramInteger)
  {
    String str = (String)this.GX.get(paramInteger);
    if ((str == null) && (this.GW.containsKey("gms_unknown")))
      str = "gms_unknown";
    return str;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final hv f(String paramString, int paramInt)
  {
    this.GW.put(paramString, Integer.valueOf(paramInt));
    this.GX.put(Integer.valueOf(paramInt), paramString);
    return this;
  }

  final ArrayList<hv.a> fD()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.GW.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new hv.a(str, ((Integer)this.GW.get(str)).intValue()));
    }
    return localArrayList;
  }

  public final int fE()
  {
    return 7;
  }

  public final int fF()
  {
    return 0;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    hw.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hv
 * JD-Core Version:    0.6.2
 */