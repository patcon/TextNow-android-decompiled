package com.mopub.mobileads;

import java.util.Map;

class MraidCommandClose extends MraidCommand
{
  MraidCommandClose(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    this.mView.getDisplayController().close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandClose
 * JD-Core Version:    0.6.2
 */