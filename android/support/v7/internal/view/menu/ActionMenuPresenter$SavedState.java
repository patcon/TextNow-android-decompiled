package android.support.v7.internal.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class ActionMenuPresenter$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
  };
  public int a;

  ActionMenuPresenter$SavedState()
  {
  }

  ActionMenuPresenter$SavedState(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ActionMenuPresenter.SavedState
 * JD-Core Version:    0.6.2
 */