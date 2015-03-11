package com.mopub.mobileads;

import java.util.Map;

class MraidCommandSetResizeProperties extends MraidCommand
{
  MraidCommandSetResizeProperties(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    this.mView.fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.SET_RESIZE_PROPERTIES, "Unsupported action setResizeProperties.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandSetResizeProperties
 * JD-Core Version:    0.6.2
 */