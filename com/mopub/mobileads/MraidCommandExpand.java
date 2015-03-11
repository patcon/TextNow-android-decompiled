package com.mopub.mobileads;

import java.util.Map;

class MraidCommandExpand extends MraidCommand
{
  MraidCommandExpand(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    int i = getIntFromParamsForKey("w");
    int j = getIntFromParamsForKey("h");
    String str = getStringFromParamsForKey("url");
    boolean bool1 = getBooleanFromParamsForKey("shouldUseCustomClose");
    boolean bool2 = getBooleanFromParamsForKey("lockOrientation");
    if (i <= 0)
      i = this.mView.getDisplayController().mScreenWidth;
    if (j <= 0)
      j = this.mView.getDisplayController().mScreenHeight;
    this.mView.getDisplayController().expand(str, i, j, bool1, bool2);
  }

  protected boolean isCommandDependentOnUserClick(MraidView.PlacementType paramPlacementType)
  {
    switch (1.$SwitchMap$com$mopub$mobileads$MraidView$PlacementType[paramPlacementType.ordinal()])
    {
    default:
      return super.isCommandDependentOnUserClick(paramPlacementType);
    case 1:
      return true;
    case 2:
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandExpand
 * JD-Core Version:    0.6.2
 */