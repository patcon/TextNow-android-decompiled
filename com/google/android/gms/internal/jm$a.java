package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class jm$a
  implements SafeParcelable
{
  public static final jo CREATOR = new jo();
  final ArrayList<jm.b> ML;
  final String className;
  final int versionCode;

  jm$a(int paramInt, String paramString, ArrayList<jm.b> paramArrayList)
  {
    this.versionCode = paramInt;
    this.className = paramString;
    this.ML = paramArrayList;
  }

  jm$a(String paramString, HashMap<String, ji.a<?, ?>> paramHashMap)
  {
    this.versionCode = 1;
    this.className = paramString;
    this.ML = a(paramHashMap);
  }

  private static ArrayList<jm.b> a(HashMap<String, ji.a<?, ?>> paramHashMap)
  {
    if (paramHashMap == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new jm.b(str, (ji.a)paramHashMap.get(str)));
    }
    return localArrayList;
  }

  public int describeContents()
  {
    return 0;
  }

  HashMap<String, ji.a<?, ?>> hw()
  {
    HashMap localHashMap = new HashMap();
    int i = this.ML.size();
    for (int j = 0; j < i; j++)
    {
      jm.b localb = (jm.b)this.ML.get(j);
      localHashMap.put(localb.fv, localb.MM);
    }
    return localHashMap;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jo.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jm.a
 * JD-Core Version:    0.6.2
 */