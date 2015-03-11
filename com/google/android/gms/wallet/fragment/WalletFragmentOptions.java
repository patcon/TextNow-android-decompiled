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
  final int BR;
  private int MV;
  private int atL;
  private WalletFragmentStyle aum;
  private int mTheme;

  private WalletFragmentOptions()
  {
    this.BR = 1;
  }

  WalletFragmentOptions(int paramInt1, int paramInt2, int paramInt3, WalletFragmentStyle paramWalletFragmentStyle, int paramInt4)
  {
    this.BR = paramInt1;
    this.atL = paramInt2;
    this.mTheme = paramInt3;
    this.aum = paramWalletFragmentStyle;
    this.MV = paramInt4;
  }

  public static WalletFragmentOptions a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.WalletFragmentOptions);
    int i = localTypedArray.getInt(R.styleable.WalletFragmentOptions_appTheme, 0);
    int j = localTypedArray.getInt(R.styleable.WalletFragmentOptions_environment, 1);
    int k = localTypedArray.getResourceId(R.styleable.WalletFragmentOptions_fragmentStyle, 0);
    int m = localTypedArray.getInt(R.styleable.WalletFragmentOptions_fragmentMode, 1);
    localTypedArray.recycle();
    WalletFragmentOptions localWalletFragmentOptions = new WalletFragmentOptions();
    localWalletFragmentOptions.mTheme = i;
    localWalletFragmentOptions.atL = j;
    localWalletFragmentOptions.aum = new WalletFragmentStyle().setStyleResourceId(k);
    localWalletFragmentOptions.aum.aa(paramContext);
    localWalletFragmentOptions.MV = m;
    return localWalletFragmentOptions;
  }

  public static WalletFragmentOptions.Builder newBuilder()
  {
    WalletFragmentOptions localWalletFragmentOptions = new WalletFragmentOptions();
    localWalletFragmentOptions.getClass();
    return new WalletFragmentOptions.Builder(localWalletFragmentOptions, null);
  }

  public final void aa(Context paramContext)
  {
    if (this.aum != null)
      this.aum.aa(paramContext);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final int getEnvironment()
  {
    return this.atL;
  }

  public final WalletFragmentStyle getFragmentStyle()
  {
    return this.aum;
  }

  public final int getMode()
  {
    return this.MV;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentOptions
 * JD-Core Version:    0.6.2
 */