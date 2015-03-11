package com.mopub.mobileads;

import java.util.Map;

class MraidCommandFactory
{
  protected static MraidCommandFactory instance = new MraidCommandFactory();

  public static MraidCommand create(String paramString, Map<String, String> paramMap, MraidView paramMraidView)
  {
    return instance.internalCreate(paramString, paramMap, paramMraidView);
  }

  @Deprecated
  public static void setInstance(MraidCommandFactory paramMraidCommandFactory)
  {
    instance = paramMraidCommandFactory;
  }

  protected MraidCommand internalCreate(String paramString, Map<String, String> paramMap, MraidView paramMraidView)
  {
    MraidCommandFactory.MraidJavascriptCommand localMraidJavascriptCommand = MraidCommandFactory.MraidJavascriptCommand.access$000(paramString);
    switch (1.$SwitchMap$com$mopub$mobileads$MraidCommandFactory$MraidJavascriptCommand[localMraidJavascriptCommand.ordinal()])
    {
    case 15:
    default:
      return null;
    case 1:
      return new MraidCommandClose(paramMap, paramMraidView);
    case 2:
      return new MraidCommandExpand(paramMap, paramMraidView);
    case 3:
      return new MraidCommandUseCustomClose(paramMap, paramMraidView);
    case 4:
      return new MraidCommandOpen(paramMap, paramMraidView);
    case 5:
      return new MraidCommandResize(paramMap, paramMraidView);
    case 6:
      return new MraidCommandGetResizeProperties(paramMap, paramMraidView);
    case 7:
      return new MraidCommandSetResizeProperties(paramMap, paramMraidView);
    case 8:
      return new MraidCommandPlayVideo(paramMap, paramMraidView);
    case 9:
      return new MraidCommandStorePicture(paramMap, paramMraidView);
    case 10:
      return new MraidCommandGetCurrentPosition(paramMap, paramMraidView);
    case 11:
      return new MraidCommandGetDefaultPosition(paramMap, paramMraidView);
    case 12:
      return new MraidCommandGetMaxSize(paramMap, paramMraidView);
    case 13:
      return new MraidCommandGetScreenSize(paramMap, paramMraidView);
    case 14:
    }
    return new MraidCommandCreateCalendarEvent(paramMap, paramMraidView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandFactory
 * JD-Core Version:    0.6.2
 */