package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class LinearLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
  };
  int a;
  int b;
  boolean c;

  public LinearLayoutManager$SavedState()
  {
  }

  LinearLayoutManager$SavedState(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    if (paramParcel.readInt() == i);
    while (true)
    {
      this.c = i;
      return;
      i = 0;
    }
  }

  public LinearLayoutManager$SavedState(SavedState paramSavedState)
  {
    this.a = paramSavedState.a;
    this.b = paramSavedState.b;
    this.c = paramSavedState.c;
  }

  final boolean a()
  {
    return this.a >= 0;
  }

  final void b()
  {
    this.a = -1;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    if (this.c);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.LinearLayoutManager.SavedState
 * JD-Core Version:    0.6.2
 */