package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class Toolbar$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
  };
  public int a;
  public boolean b;

  public Toolbar$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readInt();
    if (paramParcel.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.b = bool;
      return;
    }
  }

  public Toolbar$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.a);
    if (this.b);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.Toolbar.SavedState
 * JD-Core Version:    0.6.2
 */