package com.mopub.mobileads;

import java.util.Map;

class MraidCommandGetCurrentPosition extends MraidCommand
{
  MraidCommandGetCurrentPosition(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    this.mView.getDisplayController().getCurrentPosition();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandGetCurrentPosition
 * JD-Core Version:    0.6.2
 */