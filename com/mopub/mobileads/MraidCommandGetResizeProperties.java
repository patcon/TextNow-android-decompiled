package com.mopub.mobileads;

import java.util.Map;

class MraidCommandGetResizeProperties extends MraidCommand
{
  MraidCommandGetResizeProperties(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    this.mView.fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.GET_RESIZE_PROPERTIES, "Unsupported action getResizeProperties.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandGetResizeProperties
 * JD-Core Version:    0.6.2
 */