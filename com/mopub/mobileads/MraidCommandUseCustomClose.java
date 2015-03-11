package com.mopub.mobileads;

import java.util.Map;

class MraidCommandUseCustomClose extends MraidCommand
{
  MraidCommandUseCustomClose(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    boolean bool = getBooleanFromParamsForKey("shouldUseCustomClose");
    this.mView.getDisplayController().useCustomClose(bool);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandUseCustomClose
 * JD-Core Version:    0.6.2
 */