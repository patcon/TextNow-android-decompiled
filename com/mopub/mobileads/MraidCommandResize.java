package com.mopub.mobileads;

import java.util.Map;

class MraidCommandResize extends MraidCommand
{
  MraidCommandResize(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    this.mView.fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.RESIZE, "Unsupported action resize.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandResize
 * JD-Core Version:    0.6.2
 */