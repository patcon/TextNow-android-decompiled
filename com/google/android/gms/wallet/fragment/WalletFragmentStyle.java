package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.R.style;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentStyle
  implements SafeParcelable
{
  public static final Parcelable.Creator<WalletFragmentStyle> CREATOR = new c();
  Bundle akE;
  int akF;
  final int xM;

  public WalletFragmentStyle()
  {
    this.xM = 1;
    this.akE = new Bundle();
  }

  WalletFragmentStyle(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    this.xM = paramInt1;
    this.akE = paramBundle;
    this.akF = paramInt2;
  }

  private void a(TypedArray paramTypedArray, int paramInt, String paramString)
  {
    if (this.akE.containsKey(paramString));
    TypedValue localTypedValue;
    do
    {
      return;
      localTypedValue = paramTypedArray.peekValue(paramInt);
    }
    while (localTypedValue == null);
    this.akE.putLong(paramString, Dimension.a(localTypedValue));
  }

  private void a(TypedArray paramTypedArray, int paramInt, String paramString1, String paramString2)
  {
    if ((this.akE.containsKey(paramString1)) || (this.akE.containsKey(paramString2)));
    TypedValue localTypedValue;
    do
    {
      return;
      localTypedValue = paramTypedArray.peekValue(paramInt);
    }
    while (localTypedValue == null);
    if ((localTypedValue.type >= 28) && (localTypedValue.type <= 31))
    {
      this.akE.putInt(paramString1, localTypedValue.data);
      return;
    }
    this.akE.putInt(paramString2, localTypedValue.resourceId);
  }

  private void b(TypedArray paramTypedArray, int paramInt, String paramString)
  {
    if (this.akE.containsKey(paramString));
    TypedValue localTypedValue;
    do
    {
      return;
      localTypedValue = paramTypedArray.peekValue(paramInt);
    }
    while (localTypedValue == null);
    this.akE.putInt(paramString, localTypedValue.data);
  }

  public final void Q(Context paramContext)
  {
    if (this.akF <= 0);
    for (int i = R.style.WalletFragmentDefaultStyle; ; i = this.akF)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(i, R.styleable.WalletFragmentStyle);
      a(localTypedArray, 1, "buyButtonWidth");
      a(localTypedArray, 0, "buyButtonHeight");
      b(localTypedArray, 2, "buyButtonText");
      b(localTypedArray, 3, "buyButtonAppearance");
      b(localTypedArray, 4, "maskedWalletDetailsTextAppearance");
      b(localTypedArray, 5, "maskedWalletDetailsHeaderTextAppearance");
      a(localTypedArray, 6, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
      b(localTypedArray, 7, "maskedWalletDetailsButtonTextAppearance");
      a(localTypedArray, 8, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
      b(localTypedArray, 9, "maskedWalletDetailsLogoTextColor");
      b(localTypedArray, 10, "maskedWalletDetailsLogoImageType");
      localTypedArray.recycle();
      return;
    }
  }

  public final int a(String paramString, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    if (this.akE.containsKey(paramString))
      paramInt = Dimension.a(this.akE.getLong(paramString), paramDisplayMetrics);
    return paramInt;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final WalletFragmentStyle setBuyButtonAppearance(int paramInt)
  {
    this.akE.putInt("buyButtonAppearance", paramInt);
    return this;
  }

  public final WalletFragmentStyle setBuyButtonHeight(int paramInt)
  {
    this.akE.putLong("buyButtonHeight", Dimension.dM(paramInt));
    return this;
  }

  public final WalletFragmentStyle setBuyButtonHeight(int paramInt, float paramFloat)
  {
    this.akE.putLong("buyButtonHeight", Dimension.a(paramInt, paramFloat));
    return this;
  }

  public final WalletFragmentStyle setBuyButtonText(int paramInt)
  {
    this.akE.putInt("buyButtonText", paramInt);
    return this;
  }

  public final WalletFragmentStyle setBuyButtonWidth(int paramInt)
  {
    this.akE.putLong("buyButtonWidth", Dimension.dM(paramInt));
    return this;
  }

  public final WalletFragmentStyle setBuyButtonWidth(int paramInt, float paramFloat)
  {
    this.akE.putLong("buyButtonWidth", Dimension.a(paramInt, paramFloat));
    return this;
  }

  public final WalletFragmentStyle setMaskedWalletDetailsBackgroundColor(int paramInt)
  {
    this.akE.remove("maskedWalletDetailsBackgroundResource");
    this.akE.putInt("maskedWalletDetailsBackgroundColor", paramInt);
    return this;
  }

  public final WalletFragmentStyle setMaskedWalletDetailsBackgroundResource(int paramInt)
  {
    this.akE.remove("maskedWalletDetailsBackgroundColor");
    this.akE.putInt("maskedWalletDetailsBackgroundResource", paramInt);
    return this;
  }

  public final WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundColor(int paramInt)
  {
    this.akE.remove("maskedWalletDetailsButtonBackgroundResource");
    this.akE.putInt("maskedWalletDetailsButtonBackgroundColor", paramInt);
    return this;
  }

  public final WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundResource(int paramInt)
  {
    this.akE.remove("maskedWalletDetailsButtonBackgroundColor");
    this.akE.putInt("maskedWalletDetailsButtonBackgroundResource", paramInt);
    return this;
  }

  public final WalletFragmentStyle setMaskedWalletDetailsButtonTextAppearance(int paramInt)
  {
    this.akE.putInt("maskedWalletDetailsButtonTextAppearance", paramInt);
    return this;
  }

  public final WalletFragmentStyle setMaskedWalletDetailsHeaderTextAppearance(int paramInt)
  {
    this.akE.putInt("maskedWalletDetailsHeaderTextAppearance", paramInt);
    return this;
  }

  public final WalletFragmentStyle setMaskedWalletDetailsLogoImageType(int paramInt)
  {
    this.akE.putInt("maskedWalletDetailsLogoImageType", paramInt);
    return this;
  }

  public final WalletFragmentStyle setMaskedWalletDetailsLogoTextColor(int paramInt)
  {
    this.akE.putInt("maskedWalletDetailsLogoTextColor", paramInt);
    return this;
  }

  public final WalletFragmentStyle setMaskedWalletDetailsTextAppearance(int paramInt)
  {
    this.akE.putInt("maskedWalletDetailsTextAppearance", paramInt);
    return this;
  }

  public final WalletFragmentStyle setStyleResourceId(int paramInt)
  {
    this.akF = paramInt;
    return this;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentStyle
 * JD-Core Version:    0.6.2
 */