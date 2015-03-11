package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class jm
  implements SafeParcelable
{
  public static final jn CREATOR = new jn();
  private final int BR;
  private final HashMap<String, HashMap<String, ji.a<?, ?>>> MI;
  private final ArrayList<jm.a> MJ;
  private final String MK;

  jm(int paramInt, ArrayList<jm.a> paramArrayList, String paramString)
  {
    this.BR = paramInt;
    this.MJ = null;
    this.MI = c(paramArrayList);
    this.MK = ((String)o.i(paramString));
    hs();
  }

  public jm(Class<? extends ji> paramClass)
  {
    this.BR = 1;
    this.MJ = null;
    this.MI = new HashMap();
    this.MK = paramClass.getCanonicalName();
  }

  private static HashMap<String, HashMap<String, ji.a<?, ?>>> c(ArrayList<jm.a> paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      jm.a locala = (jm.a)paramArrayList.get(j);
      localHashMap.put(locala.className, locala.hw());
    }
    return localHashMap;
  }

  public void a(Class<? extends ji> paramClass, HashMap<String, ji.a<?, ?>> paramHashMap)
  {
    this.MI.put(paramClass.getCanonicalName(), paramHashMap);
  }

  public boolean b(Class<? extends ji> paramClass)
  {
    return this.MI.containsKey(paramClass.getCanonicalName());
  }

  public HashMap<String, ji.a<?, ?>> be(String paramString)
  {
    return (HashMap)this.MI.get(paramString);
  }

  public int describeContents()
  {
    return 0;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public void hs()
  {
    Iterator localIterator1 = this.MI.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str = (String)localIterator1.next();
      HashMap localHashMap = (HashMap)this.MI.get(str);
      Iterator localIterator2 = localHashMap.keySet().iterator();
      while (localIterator2.hasNext())
        ((ji.a)localHashMap.get((String)localIterator2.next())).a(this);
    }
  }

  public void ht()
  {
    Iterator localIterator1 = this.MI.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      HashMap localHashMap1 = (HashMap)this.MI.get(str1);
      HashMap localHashMap2 = new HashMap();
      Iterator localIterator2 = localHashMap1.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        localHashMap2.put(str2, ((ji.a)localHashMap1.get(str2)).hi());
      }
      this.MI.put(str1, localHashMap2);
    }
  }

  ArrayList<jm.a> hu()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.MI.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new jm.a(str, (HashMap)this.MI.get(str)));
    }
    return localArrayList;
  }

  public String hv()
  {
    return this.MK;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = this.MI.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      localStringBuilder.append(str1).append(":\n");
      HashMap localHashMap = (HashMap)this.MI.get(str1);
      Iterator localIterator2 = localHashMap.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        localStringBuilder.append("  ").append(str2).append(": ");
        localStringBuilder.append(localHashMap.get(str2));
      }
    }
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jn.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jm
 * JD-Core Version:    0.6.2
 */