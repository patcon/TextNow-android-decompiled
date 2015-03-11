package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator()
  {
  };
  final int[] a;
  final int b;
  final int c;
  final String d;
  final int e;
  final int f;
  final CharSequence g;
  final int h;
  final CharSequence i;
  final ArrayList<String> j;
  final ArrayList<String> k;

  public BackStackState(Parcel paramParcel)
  {
    this.a = paramParcel.createIntArray();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.h = paramParcel.readInt();
    this.i = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.j = paramParcel.createStringArrayList();
    this.k = paramParcel.createStringArrayList();
  }

  public BackStackState(q paramq)
  {
    r localr1 = paramq.b;
    int m = 0;
    while (localr1 != null)
    {
      if (localr1.i != null)
        m += localr1.i.size();
      localr1 = localr1.a;
    }
    this.a = new int[m + 7 * paramq.d];
    if (!paramq.k)
      throw new IllegalStateException("Not on back stack");
    r localr2 = paramq.b;
    int n = 0;
    if (localr2 != null)
    {
      int[] arrayOfInt1 = this.a;
      int i1 = n + 1;
      arrayOfInt1[n] = localr2.c;
      int[] arrayOfInt2 = this.a;
      int i2 = i1 + 1;
      if (localr2.d != null);
      int i7;
      int i9;
      for (int i3 = localr2.d.mIndex; ; i3 = -1)
      {
        arrayOfInt2[i1] = i3;
        int[] arrayOfInt3 = this.a;
        int i4 = i2 + 1;
        arrayOfInt3[i2] = localr2.e;
        int[] arrayOfInt4 = this.a;
        int i5 = i4 + 1;
        arrayOfInt4[i4] = localr2.f;
        int[] arrayOfInt5 = this.a;
        int i6 = i5 + 1;
        arrayOfInt5[i5] = localr2.g;
        int[] arrayOfInt6 = this.a;
        i7 = i6 + 1;
        arrayOfInt6[i6] = localr2.h;
        if (localr2.i == null)
          break label343;
        int i8 = localr2.i.size();
        int[] arrayOfInt8 = this.a;
        i9 = i7 + 1;
        arrayOfInt8[i7] = i8;
        int i10 = 0;
        while (i10 < i8)
        {
          int[] arrayOfInt9 = this.a;
          int i11 = i9 + 1;
          arrayOfInt9[i9] = ((Fragment)localr2.i.get(i10)).mIndex;
          i10++;
          i9 = i11;
        }
      }
      n = i9;
      while (true)
      {
        localr2 = localr2.a;
        break;
        label343: int[] arrayOfInt7 = this.a;
        n = i7 + 1;
        arrayOfInt7[i7] = 0;
      }
    }
    this.b = paramq.i;
    this.c = paramq.j;
    this.d = paramq.m;
    this.e = paramq.o;
    this.f = paramq.p;
    this.g = paramq.q;
    this.h = paramq.r;
    this.i = paramq.s;
    this.j = paramq.t;
    this.k = paramq.u;
  }

  public final q a(z paramz)
  {
    q localq = new q(paramz);
    int m = 0;
    int i8;
    for (int n = 0; n < this.a.length; n = i8)
    {
      r localr = new r();
      int[] arrayOfInt1 = this.a;
      int i1 = n + 1;
      localr.c = arrayOfInt1[n];
      if (z.a)
        new StringBuilder().append("Instantiate ").append(localq).append(" op #").append(m).append(" base fragment #").append(this.a[i1]).toString();
      int[] arrayOfInt2 = this.a;
      int i2 = i1 + 1;
      int i3 = arrayOfInt2[i1];
      if (i3 >= 0);
      for (localr.d = ((Fragment)paramz.f.get(i3)); ; localr.d = null)
      {
        int[] arrayOfInt3 = this.a;
        int i4 = i2 + 1;
        localr.e = arrayOfInt3[i2];
        int[] arrayOfInt4 = this.a;
        int i5 = i4 + 1;
        localr.f = arrayOfInt4[i4];
        int[] arrayOfInt5 = this.a;
        int i6 = i5 + 1;
        localr.g = arrayOfInt5[i5];
        int[] arrayOfInt6 = this.a;
        int i7 = i6 + 1;
        localr.h = arrayOfInt6[i6];
        int[] arrayOfInt7 = this.a;
        i8 = i7 + 1;
        int i9 = arrayOfInt7[i7];
        if (i9 <= 0)
          break;
        localr.i = new ArrayList(i9);
        int i10 = 0;
        while (i10 < i9)
        {
          if (z.a)
            new StringBuilder().append("Instantiate ").append(localq).append(" set remove fragment #").append(this.a[i8]).toString();
          ArrayList localArrayList = paramz.f;
          int[] arrayOfInt8 = this.a;
          int i11 = i8 + 1;
          Fragment localFragment = (Fragment)localArrayList.get(arrayOfInt8[i8]);
          localr.i.add(localFragment);
          i10++;
          i8 = i11;
        }
      }
      localq.a(localr);
      m++;
    }
    localq.i = this.b;
    localq.j = this.c;
    localq.m = this.d;
    localq.o = this.e;
    localq.k = true;
    localq.p = this.f;
    localq.q = this.g;
    localq.r = this.h;
    localq.s = this.i;
    localq.t = this.j;
    localq.u = this.k;
    localq.b(1);
    return localq;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    TextUtils.writeToParcel(this.g, paramParcel, 0);
    paramParcel.writeInt(this.h);
    TextUtils.writeToParcel(this.i, paramParcel, 0);
    paramParcel.writeStringList(this.j);
    paramParcel.writeStringList(this.k);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.BackStackState
 * JD-Core Version:    0.6.2
 */