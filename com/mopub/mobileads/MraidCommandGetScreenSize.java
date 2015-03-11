package com.mopub.mobileads;

import java.util.Map;

class MraidCommandGetScreenSize extends MraidCommand
{
  MraidCommandGetScreenSize(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    this.mView.getDisplayController().getScreenSize();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandGetScreenSize
 * JD-Core Version:    0.6.2
 */