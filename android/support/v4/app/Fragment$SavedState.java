package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Fragment$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
  };
  final Bundle a;

  Fragment$SavedState(Bundle paramBundle)
  {
    this.a = paramBundle;
  }

  Fragment$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    this.a = paramParcel.readBundle();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.Fragment.SavedState
 * JD-Core Version:    0.6.2
 */