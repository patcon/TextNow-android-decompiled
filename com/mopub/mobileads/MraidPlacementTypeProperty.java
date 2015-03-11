package com.mopub.mobileads;

class MraidPlacementTypeProperty extends MraidProperty
{
  private final MraidView.PlacementType mPlacementType;

  MraidPlacementTypeProperty(MraidView.PlacementType paramPlacementType)
  {
    this.mPlacementType = paramPlacementType;
  }

  public static MraidPlacementTypeProperty createWithType(MraidView.PlacementType paramPlacementType)
  {
    return new MraidPlacementTypeProperty(paramPlacementType);
  }

  public String toJsonPair()
  {
    return "placementType: '" + this.mPlacementType.toString().toLowerCase() + "'";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidPlacementTypeProperty
 * JD-Core Version:    0.6.2
 */