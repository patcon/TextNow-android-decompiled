package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class MetadataBundle
  implements SafeParcelable
{
  public static final Parcelable.Creator<MetadataBundle> CREATOR = new h();
  final Bundle JS;
  final int xM;

  MetadataBundle(int paramInt, Bundle paramBundle)
  {
    this.xM = paramInt;
    this.JS = ((Bundle)hm.f(paramBundle));
    this.JS.setClassLoader(getClass().getClassLoader());
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = this.JS.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str2 = (String)localIterator1.next();
      if (e.aN(str2) == null)
      {
        localArrayList.add(str2);
        new StringBuilder().append("Ignored unknown metadata field in bundle: ").append(str2).toString();
      }
    }
    Iterator localIterator2 = localArrayList.iterator();
    while (localIterator2.hasNext())
    {
      String str1 = (String)localIterator2.next();
      this.JS.remove(str1);
    }
  }

  private MetadataBundle(Bundle paramBundle)
  {
    this(1, paramBundle);
  }

  public static <T> MetadataBundle a(MetadataField<T> paramMetadataField, T paramT)
  {
    MetadataBundle localMetadataBundle = gF();
    localMetadataBundle.b(paramMetadataField, paramT);
    return localMetadataBundle;
  }

  public static MetadataBundle a(MetadataBundle paramMetadataBundle)
  {
    return new MetadataBundle(new Bundle(paramMetadataBundle.JS));
  }

  public static MetadataBundle gF()
  {
    return new MetadataBundle(new Bundle());
  }

  public final <T> T a(MetadataField<T> paramMetadataField)
  {
    return paramMetadataField.e(this.JS);
  }

  public final <T> void b(MetadataField<T> paramMetadataField, T paramT)
  {
    if (e.aN(paramMetadataField.getName()) == null)
      throw new IllegalArgumentException("Unregistered field: " + paramMetadataField.getName());
    paramMetadataField.a(paramT, this.JS);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof MetadataBundle))
      return false;
    MetadataBundle localMetadataBundle = (MetadataBundle)paramObject;
    Set localSet = this.JS.keySet();
    if (!localSet.equals(localMetadataBundle.JS.keySet()))
      return false;
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!hk.equal(this.JS.get(str), localMetadataBundle.JS.get(str)))
        return false;
    }
    return true;
  }

  public final Set<MetadataField<?>> gG()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.JS.keySet().iterator();
    while (localIterator.hasNext())
      localHashSet.add(e.aN((String)localIterator.next()));
    return localHashSet;
  }

  public final int hashCode()
  {
    Iterator localIterator = this.JS.keySet().iterator();
    String str;
    for (int i = 1; localIterator.hasNext(); i = i * 31 + this.JS.get(str).hashCode())
      str = (String)localIterator.next();
    return i;
  }

  public final String toString()
  {
    return "MetadataBundle [values=" + this.JS + "]";
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.MetadataBundle
 * JD-Core Version:    0.6.2
 */