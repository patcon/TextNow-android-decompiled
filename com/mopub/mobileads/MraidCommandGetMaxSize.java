package com.mopub.mobileads;

import java.util.Map;

class MraidCommandGetMaxSize extends MraidCommand
{
  MraidCommandGetMaxSize(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    this.mView.getDisplayController().getMaxSize();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandGetMaxSize
 * JD-Core Version:    0.6.2
 */