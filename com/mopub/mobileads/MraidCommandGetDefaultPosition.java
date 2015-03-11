package com.mopub.mobileads;

import java.util.Map;

class MraidCommandGetDefaultPosition extends MraidCommand
{
  MraidCommandGetDefaultPosition(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    this.mView.getDisplayController().getDefaultPosition();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandGetDefaultPosition
 * JD-Core Version:    0.6.2
 */