package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.v;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.kd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class MetadataBundle
  implements SafeParcelable
{
  public static final Parcelable.Creator<MetadataBundle> CREATOR = new h();
  final int BR;
  final Bundle PL;

  MetadataBundle(int paramInt, Bundle paramBundle)
  {
    this.BR = paramInt;
    this.PL = ((Bundle)o.i(paramBundle));
    this.PL.setClassLoader(getClass().getClassLoader());
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = this.PL.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str2 = (String)localIterator1.next();
      if (e.bj(str2) == null)
      {
        localArrayList.add(str2);
        v.p("MetadataBundle", "Ignored unknown metadata field in bundle: " + str2);
      }
    }
    Iterator localIterator2 = localArrayList.iterator();
    while (localIterator2.hasNext())
    {
      String str1 = (String)localIterator2.next();
      this.PL.remove(str1);
    }
  }

  private MetadataBundle(Bundle paramBundle)
  {
    this(1, paramBundle);
  }

  public static <T> MetadataBundle a(MetadataField<T> paramMetadataField, T paramT)
  {
    MetadataBundle localMetadataBundle = io();
    localMetadataBundle.b(paramMetadataField, paramT);
    return localMetadataBundle;
  }

  public static MetadataBundle a(MetadataBundle paramMetadataBundle)
  {
    return new MetadataBundle(new Bundle(paramMetadataBundle.PL));
  }

  public static MetadataBundle io()
  {
    return new MetadataBundle(new Bundle());
  }

  public final <T> T a(MetadataField<T> paramMetadataField)
  {
    return paramMetadataField.f(this.PL);
  }

  public final <T> void b(MetadataField<T> paramMetadataField, T paramT)
  {
    if (e.bj(paramMetadataField.getName()) == null)
      throw new IllegalArgumentException("Unregistered field: " + paramMetadataField.getName());
    paramMetadataField.a(paramT, this.PL);
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
    Set localSet = this.PL.keySet();
    if (!localSet.equals(localMetadataBundle.PL.keySet()))
      return false;
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!n.equal(this.PL.get(str), localMetadataBundle.PL.get(str)))
        return false;
    }
    return true;
  }

  public final int hashCode()
  {
    Iterator localIterator = this.PL.keySet().iterator();
    String str;
    for (int i = 1; localIterator.hasNext(); i = i * 31 + this.PL.get(str).hashCode())
      str = (String)localIterator.next();
    return i;
  }

  public final Set<MetadataField<?>> ip()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.PL.keySet().iterator();
    while (localIterator.hasNext())
      localHashSet.add(e.bj((String)localIterator.next()));
    return localHashSet;
  }

  public final void setContext(Context paramContext)
  {
    a locala = (a)a(kd.Ql);
    if (locala != null)
      locala.a(paramContext.getCacheDir());
  }

  public final String toString()
  {
    return "MetadataBundle [values=" + this.PL + "]";
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.MetadataBundle
 * JD-Core Version:    0.6.2
 */