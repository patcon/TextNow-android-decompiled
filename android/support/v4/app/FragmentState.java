package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentState
  implements Parcelable
{
  public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator()
  {
  };
  final String a;
  final int b;
  final boolean c;
  final int d;
  final int e;
  final String f;
  final boolean g;
  final boolean h;
  final Bundle i;
  Bundle j;
  Fragment k;

  public FragmentState(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readInt();
    boolean bool2;
    boolean bool3;
    if (paramParcel.readInt() != 0)
    {
      bool2 = bool1;
      this.c = bool2;
      this.d = paramParcel.readInt();
      this.e = paramParcel.readInt();
      this.f = paramParcel.readString();
      if (paramParcel.readInt() == 0)
        break label110;
      bool3 = bool1;
      label70: this.g = bool3;
      if (paramParcel.readInt() == 0)
        break label116;
    }
    while (true)
    {
      this.h = bool1;
      this.i = paramParcel.readBundle();
      this.j = paramParcel.readBundle();
      return;
      bool2 = false;
      break;
      label110: bool3 = false;
      break label70;
      label116: bool1 = false;
    }
  }

  public FragmentState(Fragment paramFragment)
  {
    this.a = paramFragment.getClass().getName();
    this.b = paramFragment.mIndex;
    this.c = paramFragment.mFromLayout;
    this.d = paramFragment.mFragmentId;
    this.e = paramFragment.mContainerId;
    this.f = paramFragment.mTag;
    this.g = paramFragment.mRetainInstance;
    this.h = paramFragment.mDetached;
    this.i = paramFragment.mArguments;
  }

  public final Fragment a(v paramv, Fragment paramFragment)
  {
    if (this.k != null)
      return this.k;
    if (this.i != null)
      this.i.setClassLoader(paramv.getClassLoader());
    this.k = Fragment.instantiate(paramv, this.a, this.i);
    if (this.j != null)
    {
      this.j.setClassLoader(paramv.getClassLoader());
      this.k.mSavedFragmentState = this.j;
    }
    this.k.setIndex(this.b, paramFragment);
    this.k.mFromLayout = this.c;
    this.k.mRestored = true;
    this.k.mFragmentId = this.d;
    this.k.mContainerId = this.e;
    this.k.mTag = this.f;
    this.k.mRetainInstance = this.g;
    this.k.mDetached = this.h;
    this.k.mFragmentManager = paramv.mFragments;
    if (z.a)
      new StringBuilder().append("Instantiated fragment ").append(this.k).toString();
    return this.k;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = 1;
    paramParcel.writeString(this.a);
    paramParcel.writeInt(this.b);
    int n;
    int i1;
    if (this.c)
    {
      n = m;
      paramParcel.writeInt(n);
      paramParcel.writeInt(this.d);
      paramParcel.writeInt(this.e);
      paramParcel.writeString(this.f);
      if (!this.g)
        break label109;
      i1 = m;
      label68: paramParcel.writeInt(i1);
      if (!this.h)
        break label115;
    }
    while (true)
    {
      paramParcel.writeInt(m);
      paramParcel.writeBundle(this.i);
      paramParcel.writeBundle(this.j);
      return;
      n = 0;
      break;
      label109: i1 = 0;
      break label68;
      label115: m = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentState
 * JD-Core Version:    0.6.2
 */