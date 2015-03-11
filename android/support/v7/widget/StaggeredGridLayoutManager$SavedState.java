package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

class StaggeredGridLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
  };
  int a;
  int b;
  int c;
  int[] d;
  int e;
  int[] f;
  List<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> g;
  boolean h;
  boolean i;
  boolean j;

  public StaggeredGridLayoutManager$SavedState()
  {
  }

  StaggeredGridLayoutManager$SavedState(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    if (this.c > 0)
    {
      this.d = new int[this.c];
      paramParcel.readIntArray(this.d);
    }
    this.e = paramParcel.readInt();
    if (this.e > 0)
    {
      this.f = new int[this.e];
      paramParcel.readIntArray(this.f);
    }
    int m;
    int n;
    if (paramParcel.readInt() == k)
    {
      m = k;
      this.h = m;
      if (paramParcel.readInt() != k)
        break label152;
      n = k;
      label114: this.i = n;
      if (paramParcel.readInt() != k)
        break label158;
    }
    while (true)
    {
      this.j = k;
      this.g = paramParcel.readArrayList(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class.getClassLoader());
      return;
      m = 0;
      break;
      label152: n = 0;
      break label114;
      label158: k = 0;
    }
  }

  public StaggeredGridLayoutManager$SavedState(SavedState paramSavedState)
  {
    this.c = paramSavedState.c;
    this.a = paramSavedState.a;
    this.b = paramSavedState.b;
    this.d = paramSavedState.d;
    this.e = paramSavedState.e;
    this.f = paramSavedState.f;
    this.h = paramSavedState.h;
    this.i = paramSavedState.i;
    this.j = paramSavedState.j;
    this.g = paramSavedState.g;
  }

  final void a()
  {
    this.d = null;
    this.c = 0;
    this.e = 0;
    this.f = null;
    this.g = null;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int k = 1;
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    if (this.c > 0)
      paramParcel.writeIntArray(this.d);
    paramParcel.writeInt(this.e);
    if (this.e > 0)
      paramParcel.writeIntArray(this.f);
    int m;
    int n;
    if (this.h)
    {
      m = k;
      paramParcel.writeInt(m);
      if (!this.i)
        break label123;
      n = k;
      label90: paramParcel.writeInt(n);
      if (!this.j)
        break label129;
    }
    while (true)
    {
      paramParcel.writeInt(k);
      paramParcel.writeList(this.g);
      return;
      m = 0;
      break;
      label123: n = 0;
      break label90;
      label129: k = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager.SavedState
 * JD-Core Version:    0.6.2
 */