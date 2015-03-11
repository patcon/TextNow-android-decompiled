package com.mopub.nativeads;

public enum RequestParameters$NativeAdAsset
{
  private final String mAssetName;

  static
  {
    TEXT = new NativeAdAsset("TEXT", 1, "text");
    ICON_IMAGE = new NativeAdAsset("ICON_IMAGE", 2, "iconimage");
    MAIN_IMAGE = new NativeAdAsset("MAIN_IMAGE", 3, "mainimage");
    CALL_TO_ACTION_TEXT = new NativeAdAsset("CALL_TO_ACTION_TEXT", 4, "ctatext");
    STAR_RATING = new NativeAdAsset("STAR_RATING", 5, "starrating");
    NativeAdAsset[] arrayOfNativeAdAsset = new NativeAdAsset[6];
    arrayOfNativeAdAsset[0] = TITLE;
    arrayOfNativeAdAsset[1] = TEXT;
    arrayOfNativeAdAsset[2] = ICON_IMAGE;
    arrayOfNativeAdAsset[3] = MAIN_IMAGE;
    arrayOfNativeAdAsset[4] = CALL_TO_ACTION_TEXT;
    arrayOfNativeAdAsset[5] = STAR_RATING;
  }

  private RequestParameters$NativeAdAsset(String paramString)
  {
    this.mAssetName = paramString;
  }

  public final String toString()
  {
    return this.mAssetName;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.RequestParameters.NativeAdAsset
 * JD-Core Version:    0.6.2
 */