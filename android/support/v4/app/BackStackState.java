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

  public BackStackState(f paramf)
  {
    g localg1 = paramf.b;
    int m = 0;
    while (localg1 != null)
    {
      if (localg1.i != null)
        m += localg1.i.size();
      localg1 = localg1.a;
    }
    this.a = new int[m + 7 * paramf.d];
    if (!paramf.k)
      throw new IllegalStateException("Not on back stack");
    g localg2 = paramf.b;
    int n = 0;
    if (localg2 != null)
    {
      int[] arrayOfInt1 = this.a;
      int i1 = n + 1;
      arrayOfInt1[n] = localg2.c;
      int[] arrayOfInt2 = this.a;
      int i2 = i1 + 1;
      if (localg2.d != null);
      int i7;
      int i9;
      for (int i3 = localg2.d.mIndex; ; i3 = -1)
      {
        arrayOfInt2[i1] = i3;
        int[] arrayOfInt3 = this.a;
        int i4 = i2 + 1;
        arrayOfInt3[i2] = localg2.e;
        int[] arrayOfInt4 = this.a;
        int i5 = i4 + 1;
        arrayOfInt4[i4] = localg2.f;
        int[] arrayOfInt5 = this.a;
        int i6 = i5 + 1;
        arrayOfInt5[i5] = localg2.g;
        int[] arrayOfInt6 = this.a;
        i7 = i6 + 1;
        arrayOfInt6[i6] = localg2.h;
        if (localg2.i == null)
          break label343;
        int i8 = localg2.i.size();
        int[] arrayOfInt8 = this.a;
        i9 = i7 + 1;
        arrayOfInt8[i7] = i8;
        int i10 = 0;
        while (i10 < i8)
        {
          int[] arrayOfInt9 = this.a;
          int i11 = i9 + 1;
          arrayOfInt9[i9] = ((Fragment)localg2.i.get(i10)).mIndex;
          i10++;
          i9 = i11;
        }
      }
      n = i9;
      while (true)
      {
        localg2 = localg2.a;
        break;
        label343: int[] arrayOfInt7 = this.a;
        n = i7 + 1;
        arrayOfInt7[i7] = 0;
      }
    }
    this.b = paramf.i;
    this.c = paramf.j;
    this.d = paramf.m;
    this.e = paramf.o;
    this.f = paramf.p;
    this.g = paramf.q;
    this.h = paramf.r;
    this.i = paramf.s;
    this.j = paramf.t;
    this.k = paramf.u;
  }

  public final f a(o paramo)
  {
    f localf = new f(paramo);
    int m = 0;
    int i8;
    for (int n = 0; n < this.a.length; n = i8)
    {
      g localg = new g();
      int[] arrayOfInt1 = this.a;
      int i1 = n + 1;
      localg.c = arrayOfInt1[n];
      if (o.a)
        new StringBuilder().append("Instantiate ").append(localf).append(" op #").append(m).append(" base fragment #").append(this.a[i1]).toString();
      int[] arrayOfInt2 = this.a;
      int i2 = i1 + 1;
      int i3 = arrayOfInt2[i1];
      if (i3 >= 0);
      for (localg.d = ((Fragment)paramo.f.get(i3)); ; localg.d = null)
      {
        int[] arrayOfInt3 = this.a;
        int i4 = i2 + 1;
        localg.e = arrayOfInt3[i2];
        int[] arrayOfInt4 = this.a;
        int i5 = i4 + 1;
        localg.f = arrayOfInt4[i4];
        int[] arrayOfInt5 = this.a;
        int i6 = i5 + 1;
        localg.g = arrayOfInt5[i5];
        int[] arrayOfInt6 = this.a;
        int i7 = i6 + 1;
        localg.h = arrayOfInt6[i6];
        int[] arrayOfInt7 = this.a;
        i8 = i7 + 1;
        int i9 = arrayOfInt7[i7];
        if (i9 <= 0)
          break;
        localg.i = new ArrayList(i9);
        int i10 = 0;
        while (i10 < i9)
        {
          if (o.a)
            new StringBuilder().append("Instantiate ").append(localf).append(" set remove fragment #").append(this.a[i8]).toString();
          ArrayList localArrayList = paramo.f;
          int[] arrayOfInt8 = this.a;
          int i11 = i8 + 1;
          Fragment localFragment = (Fragment)localArrayList.get(arrayOfInt8[i8]);
          localg.i.add(localFragment);
          i10++;
          i8 = i11;
        }
      }
      localf.a(localg);
      m++;
    }
    localf.i = this.b;
    localf.j = this.c;
    localf.m = this.d;
    localf.o = this.e;
    localf.k = true;
    localf.p = this.f;
    localf.q = this.g;
    localf.r = this.h;
    localf.s = this.i;
    localf.t = this.j;
    localf.u = this.k;
    localf.b(1);
    return localf;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.BackStackState
 * JD-Core Version:    0.6.2
 */