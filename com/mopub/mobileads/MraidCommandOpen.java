package com.mopub.mobileads;

import java.util.Map;

class MraidCommandOpen extends MraidCommand
{
  MraidCommandOpen(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    String str = getStringFromParamsForKey("url");
    if (str == null)
    {
      this.mView.fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.OPEN, "Url can not be null.");
      return;
    }
    this.mView.getBrowserController().open(str);
  }

  protected boolean isCommandDependentOnUserClick(MraidView.PlacementType paramPlacementType)
  {
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandOpen
 * JD-Core Version:    0.6.2
 */