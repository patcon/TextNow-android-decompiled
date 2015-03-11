package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator<WalletFragmentOptions> CREATOR = new b();
  private int Hy;
  private WalletFragmentStyle akC;
  private int akb;
  private int mTheme;
  final int xM;

  private WalletFragmentOptions()
  {
    this.xM = 1;
  }

  WalletFragmentOptions(int paramInt1, int paramInt2, int paramInt3, WalletFragmentStyle paramWalletFragmentStyle, int paramInt4)
  {
    this.xM = paramInt1;
    this.akb = paramInt2;
    this.mTheme = paramInt3;
    this.akC = paramWalletFragmentStyle;
    this.Hy = paramInt4;
  }

  public static WalletFragmentOptions a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.WalletFragmentOptions);
    int i = localTypedArray.getInt(0, 0);
    int j = localTypedArray.getInt(1, 1);
    int k = localTypedArray.getResourceId(2, 0);
    int m = localTypedArray.getInt(3, 1);
    localTypedArray.recycle();
    WalletFragmentOptions localWalletFragmentOptions = new WalletFragmentOptions();
    localWalletFragmentOptions.mTheme = i;
    localWalletFragmentOptions.akb = j;
    localWalletFragmentOptions.akC = new WalletFragmentStyle().setStyleResourceId(k);
    localWalletFragmentOptions.akC.Q(paramContext);
    localWalletFragmentOptions.Hy = m;
    return localWalletFragmentOptions;
  }

  public static WalletFragmentOptions.Builder newBuilder()
  {
    WalletFragmentOptions localWalletFragmentOptions = new WalletFragmentOptions();
    localWalletFragmentOptions.getClass();
    return new WalletFragmentOptions.Builder(localWalletFragmentOptions, null);
  }

  public final void Q(Context paramContext)
  {
    if (this.akC != null)
      this.akC.Q(paramContext);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final int getEnvironment()
  {
    return this.akb;
  }

  public final WalletFragmentStyle getFragmentStyle()
  {
    return this.akC;
  }

  public final int getMode()
  {
    return this.Hy;
  }

  public final int getTheme()
  {
    return this.mTheme;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentOptions
 * JD-Core Version:    0.6.2
 */