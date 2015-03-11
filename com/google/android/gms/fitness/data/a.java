package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kw;

public final class a
  implements SafeParcelable
{
  public static final Parcelable.Creator<a> CREATOR = new b();
  public static final a Sw = new a("com.google.android.gms", String.valueOf(6171000), null);
  private final int BR;
  private final String BZ;
  private final String Sx;
  private final String Sy;

  a(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.BR = paramInt;
    this.BZ = ((String)o.i(paramString1));
    this.Sx = "";
    this.Sy = paramString3;
  }

  public a(String paramString1, String paramString2, String paramString3)
  {
    this(1, paramString1, "", paramString3);
  }

  private boolean a(a parama)
  {
    return (this.BZ.equals(parama.BZ)) && (n.equal(this.Sx, parama.Sx)) && (n.equal(this.Sy, parama.Sy));
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof a)) && (a((a)paramObject)));
  }

  public final String getPackageName()
  {
    return this.BZ;
  }

  public final String getVersion()
  {
    return this.Sx;
  }

  final int getVersionCode()
  {
    return this.BR;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.BZ;
    arrayOfObject[1] = this.Sx;
    arrayOfObject[2] = this.Sy;
    return n.hashCode(arrayOfObject);
  }

  final a iA()
  {
    return new a(kw.bt(this.BZ), kw.bt(this.Sx), kw.bt(this.Sy));
  }

  public final String iz()
  {
    return this.Sy;
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.BZ;
    arrayOfObject[1] = this.Sx;
    arrayOfObject[2] = this.Sy;
    return String.format("Application{%s:%s:%s}", arrayOfObject);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.a
 * JD-Core Version:    0.6.2
 */