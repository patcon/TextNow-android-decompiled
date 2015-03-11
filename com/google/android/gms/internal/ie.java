package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ie extends hy
  implements SafeParcelable
{
  public static final if CREATOR = new if();
  private final ib Hj;
  private final Parcel Hq;
  private final int Hr;
  private int Hs;
  private int Ht;
  private final String mClassName;
  private final int xM;

  ie(int paramInt, Parcel paramParcel, ib paramib)
  {
    this.xM = paramInt;
    this.Hq = ((Parcel)hm.f(paramParcel));
    this.Hr = 2;
    this.Hj = paramib;
    if (this.Hj == null);
    for (this.mClassName = null; ; this.mClassName = this.Hj.fW())
    {
      this.Hs = 2;
      return;
    }
  }

  private ie(SafeParcelable paramSafeParcelable, ib paramib, String paramString)
  {
    this.xM = 1;
    this.Hq = Parcel.obtain();
    paramSafeParcelable.writeToParcel(this.Hq, 0);
    this.Hr = 1;
    this.Hj = ((ib)hm.f(paramib));
    this.mClassName = ((String)hm.f(paramString));
    this.Hs = 2;
  }

  public static <T extends hy,  extends SafeParcelable> ie a(T paramT)
  {
    String str = paramT.getClass().getCanonicalName();
    ib localib = b(paramT);
    return new ie((SafeParcelable)paramT, localib, str);
  }

  private static void a(ib paramib, hy paramhy)
  {
    Class localClass1 = paramhy.getClass();
    if (!paramib.b(localClass1))
    {
      HashMap localHashMap = paramhy.fG();
      paramib.a(localClass1, paramhy.fG());
      Iterator localIterator = localHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        hy.a locala = (hy.a)localHashMap.get((String)localIterator.next());
        Class localClass2 = locala.fO();
        if (localClass2 != null)
          try
          {
            a(paramib, (hy)localClass2.newInstance());
          }
          catch (InstantiationException localInstantiationException)
          {
            throw new IllegalStateException("Could not instantiate an object of type " + locala.fO().getCanonicalName(), localInstantiationException);
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            throw new IllegalStateException("Could not access object of type " + locala.fO().getCanonicalName(), localIllegalAccessException);
          }
      }
    }
  }

  private void a(StringBuilder paramStringBuilder, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown type = " + paramInt);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
      paramStringBuilder.append(paramObject);
      return;
    case 7:
      paramStringBuilder.append("\"").append(in.aK(paramObject.toString())).append("\"");
      return;
    case 8:
      paramStringBuilder.append("\"").append(ih.d((byte[])paramObject)).append("\"");
      return;
    case 9:
      paramStringBuilder.append("\"").append(ih.e((byte[])paramObject));
      paramStringBuilder.append("\"");
      return;
    case 10:
      io.a(paramStringBuilder, (HashMap)paramObject);
      return;
    case 11:
    }
    throw new IllegalArgumentException("Method does not accept concrete type.");
  }

  private void a(StringBuilder paramStringBuilder, hy.a<?, ?> parama, Parcel paramParcel, int paramInt)
  {
    switch (parama.fF())
    {
    default:
      throw new IllegalArgumentException("Unknown field out type = " + parama.fF());
    case 0:
      b(paramStringBuilder, parama, a(parama, Integer.valueOf(a.g(paramParcel, paramInt))));
      return;
    case 1:
      b(paramStringBuilder, parama, a(parama, a.k(paramParcel, paramInt)));
      return;
    case 2:
      b(paramStringBuilder, parama, a(parama, Long.valueOf(a.i(paramParcel, paramInt))));
      return;
    case 3:
      b(paramStringBuilder, parama, a(parama, Float.valueOf(a.l(paramParcel, paramInt))));
      return;
    case 4:
      b(paramStringBuilder, parama, a(parama, Double.valueOf(a.m(paramParcel, paramInt))));
      return;
    case 5:
      b(paramStringBuilder, parama, a(parama, a.n(paramParcel, paramInt)));
      return;
    case 6:
      b(paramStringBuilder, parama, a(parama, Boolean.valueOf(a.c(paramParcel, paramInt))));
      return;
    case 7:
      b(paramStringBuilder, parama, a(parama, a.o(paramParcel, paramInt)));
      return;
    case 8:
    case 9:
      b(paramStringBuilder, parama, a(parama, a.r(paramParcel, paramInt)));
      return;
    case 10:
      b(paramStringBuilder, parama, a(parama, d(a.q(paramParcel, paramInt))));
      return;
    case 11:
    }
    throw new IllegalArgumentException("Method does not accept concrete type.");
  }

  private void a(StringBuilder paramStringBuilder, String paramString, hy.a<?, ?> parama, Parcel paramParcel, int paramInt)
  {
    paramStringBuilder.append("\"").append(paramString).append("\":");
    if (parama.fQ())
    {
      a(paramStringBuilder, parama, paramParcel, paramInt);
      return;
    }
    b(paramStringBuilder, parama, paramParcel, paramInt);
  }

  private void a(StringBuilder paramStringBuilder, HashMap<String, hy.a<?, ?>> paramHashMap, Parcel paramParcel)
  {
    HashMap localHashMap = b(paramHashMap);
    paramStringBuilder.append('{');
    int i = a.B(paramParcel);
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.A(paramParcel);
      Map.Entry localEntry = (Map.Entry)localHashMap.get(Integer.valueOf(a.ar(k)));
      if (localEntry != null)
      {
        if (j != 0)
          paramStringBuilder.append(",");
        a(paramStringBuilder, (String)localEntry.getKey(), (hy.a)localEntry.getValue(), paramParcel, k);
        j = 1;
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    paramStringBuilder.append('}');
  }

  private static ib b(hy paramhy)
  {
    ib localib = new ib(paramhy.getClass());
    a(localib, paramhy);
    localib.fU();
    localib.fT();
    return localib;
  }

  private static HashMap<Integer, Map.Entry<String, hy.a<?, ?>>> b(HashMap<String, hy.a<?, ?>> paramHashMap)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put(Integer.valueOf(((hy.a)localEntry.getValue()).fN()), localEntry);
    }
    return localHashMap;
  }

  private void b(StringBuilder paramStringBuilder, hy.a<?, ?> parama, Parcel paramParcel, int paramInt)
  {
    if (parama.fL())
    {
      paramStringBuilder.append("[");
      switch (parama.fF())
      {
      default:
        throw new IllegalStateException("Unknown field type out.");
      case 0:
        ig.a(paramStringBuilder, a.u(paramParcel, paramInt));
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      }
      while (true)
      {
        paramStringBuilder.append("]");
        return;
        ig.a(paramStringBuilder, a.w(paramParcel, paramInt));
        continue;
        ig.a(paramStringBuilder, a.v(paramParcel, paramInt));
        continue;
        ig.a(paramStringBuilder, a.x(paramParcel, paramInt));
        continue;
        ig.a(paramStringBuilder, a.y(paramParcel, paramInt));
        continue;
        ig.a(paramStringBuilder, a.z(paramParcel, paramInt));
        continue;
        ig.a(paramStringBuilder, a.t(paramParcel, paramInt));
        continue;
        ig.a(paramStringBuilder, a.A(paramParcel, paramInt));
        continue;
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
        Parcel[] arrayOfParcel = a.D(paramParcel, paramInt);
        int j = arrayOfParcel.length;
        for (int k = 0; k < j; k++)
        {
          if (k > 0)
            paramStringBuilder.append(",");
          arrayOfParcel[k].setDataPosition(0);
          a(paramStringBuilder, parama.fS(), arrayOfParcel[k]);
        }
      }
    }
    switch (parama.fF())
    {
    default:
      throw new IllegalStateException("Unknown field type out");
    case 0:
      paramStringBuilder.append(a.g(paramParcel, paramInt));
      return;
    case 1:
      paramStringBuilder.append(a.k(paramParcel, paramInt));
      return;
    case 2:
      paramStringBuilder.append(a.i(paramParcel, paramInt));
      return;
    case 3:
      paramStringBuilder.append(a.l(paramParcel, paramInt));
      return;
    case 4:
      paramStringBuilder.append(a.m(paramParcel, paramInt));
      return;
    case 5:
      paramStringBuilder.append(a.n(paramParcel, paramInt));
      return;
    case 6:
      paramStringBuilder.append(a.c(paramParcel, paramInt));
      return;
    case 7:
      String str2 = a.o(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(in.aK(str2)).append("\"");
      return;
    case 8:
      byte[] arrayOfByte2 = a.r(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(ih.d(arrayOfByte2)).append("\"");
      return;
    case 9:
      byte[] arrayOfByte1 = a.r(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(ih.e(arrayOfByte1));
      paramStringBuilder.append("\"");
      return;
    case 10:
      Bundle localBundle = a.q(paramParcel, paramInt);
      Set localSet = localBundle.keySet();
      localSet.size();
      paramStringBuilder.append("{");
      Iterator localIterator = localSet.iterator();
      for (int i = 1; localIterator.hasNext(); i = 0)
      {
        String str1 = (String)localIterator.next();
        if (i == 0)
          paramStringBuilder.append(",");
        paramStringBuilder.append("\"").append(str1).append("\"");
        paramStringBuilder.append(":");
        paramStringBuilder.append("\"").append(in.aK(localBundle.getString(str1))).append("\"");
      }
      paramStringBuilder.append("}");
      return;
    case 11:
    }
    Parcel localParcel = a.C(paramParcel, paramInt);
    localParcel.setDataPosition(0);
    a(paramStringBuilder, parama.fS(), localParcel);
  }

  private void b(StringBuilder paramStringBuilder, hy.a<?, ?> parama, Object paramObject)
  {
    if (parama.fK())
    {
      b(paramStringBuilder, parama, (ArrayList)paramObject);
      return;
    }
    a(paramStringBuilder, parama.fE(), paramObject);
  }

  private void b(StringBuilder paramStringBuilder, hy.a<?, ?> parama, ArrayList<?> paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      if (j != 0)
        paramStringBuilder.append(",");
      a(paramStringBuilder, parama.fE(), paramArrayList.get(j));
    }
    paramStringBuilder.append("]");
  }

  public static HashMap<String, String> d(Bundle paramBundle)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramBundle.getString(str));
    }
    return localHashMap;
  }

  protected Object aF(String paramString)
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }

  protected boolean aG(String paramString)
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }

  public int describeContents()
  {
    return 0;
  }

  public HashMap<String, hy.a<?, ?>> fG()
  {
    if (this.Hj == null)
      return null;
    return this.Hj.aJ(this.mClassName);
  }

  public Parcel fY()
  {
    switch (this.Hs)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      return this.Hq;
      this.Ht = b.C(this.Hq);
      b.G(this.Hq, this.Ht);
      this.Hs = 2;
    }
  }

  ib fZ()
  {
    switch (this.Hr)
    {
    default:
      throw new IllegalStateException("Invalid creation type: " + this.Hr);
    case 0:
      return null;
    case 1:
      return this.Hj;
    case 2:
    }
    return this.Hj;
  }

  public int getVersionCode()
  {
    return this.xM;
  }

  public String toString()
  {
    hm.b(this.Hj, "Cannot convert to JSON on client side.");
    Parcel localParcel = fY();
    localParcel.setDataPosition(0);
    StringBuilder localStringBuilder = new StringBuilder(100);
    a(localStringBuilder, this.Hj.aJ(this.mClassName), localParcel);
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ie
 * JD-Core Version:    0.6.2
 */