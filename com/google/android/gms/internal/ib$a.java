package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ib$a
  implements SafeParcelable
{
  public static final id CREATOR = new id();
  final ArrayList<ib.b> Ho;
  final String className;
  final int versionCode;

  ib$a(int paramInt, String paramString, ArrayList<ib.b> paramArrayList)
  {
    this.versionCode = paramInt;
    this.className = paramString;
    this.Ho = paramArrayList;
  }

  ib$a(String paramString, HashMap<String, hy.a<?, ?>> paramHashMap)
  {
    this.versionCode = 1;
    this.className = paramString;
    this.Ho = a(paramHashMap);
  }

  private static ArrayList<ib.b> a(HashMap<String, hy.a<?, ?>> paramHashMap)
  {
    if (paramHashMap == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new ib.b(str, (hy.a)paramHashMap.get(str)));
    }
    return localArrayList;
  }

  public int describeContents()
  {
    return 0;
  }

  HashMap<String, hy.a<?, ?>> fX()
  {
    HashMap localHashMap = new HashMap();
    int i = this.Ho.size();
    for (int j = 0; j < i; j++)
    {
      ib.b localb = (ib.b)this.Ho.get(j);
      localHashMap.put(localb.eM, localb.Hp);
    }
    return localHashMap;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    id.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ib.a
 * JD-Core Version:    0.6.2
 */