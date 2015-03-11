package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class SlidingPaneLayout$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
  };
  boolean a;

  private SlidingPaneLayout$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    if (paramParcel.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.a = bool;
      return;
    }
  }

  SlidingPaneLayout$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    if (this.a);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout.SavedState
 * JD-Core Version:    0.6.2
 */