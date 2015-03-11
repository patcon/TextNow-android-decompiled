package com.mopub.mobileads;

import java.util.Map;

class MraidCommandCreateCalendarEvent extends MraidCommand
{
  MraidCommandCreateCalendarEvent(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    this.mView.getDisplayController().createCalendarEvent(this.mParams);
  }

  protected boolean isCommandDependentOnUserClick(MraidView.PlacementType paramPlacementType)
  {
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandCreateCalendarEvent
 * JD-Core Version:    0.6.2
 */