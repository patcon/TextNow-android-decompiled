package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import textnow.d.a;
import textnow.d.c;

public class ViewPager$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = a.a(new c()
  {
  });
  int a;
  Parcelable b;
  ClassLoader c;

  ViewPager$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel);
    if (paramClassLoader == null)
      paramClassLoader = getClass().getClassLoader();
    this.a = paramParcel.readInt();
    this.b = paramParcel.readParcelable(paramClassLoader);
    this.c = paramClassLoader;
  }

  public ViewPager$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.a);
    paramParcel.writeParcelable(this.b, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager.SavedState
 * JD-Core Version:    0.6.2
 */