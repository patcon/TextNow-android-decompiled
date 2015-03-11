package com.mopub.mobileads;

 enum MraidCommandFactory$MraidJavascriptCommand
{
  private String mCommand;

  static
  {
    OPEN = new MraidJavascriptCommand("OPEN", 3, "open");
    RESIZE = new MraidJavascriptCommand("RESIZE", 4, "resize");
    GET_RESIZE_PROPERTIES = new MraidJavascriptCommand("GET_RESIZE_PROPERTIES", 5, "getResizeProperties");
    SET_RESIZE_PROPERTIES = new MraidJavascriptCommand("SET_RESIZE_PROPERTIES", 6, "setResizeProperties");
    PLAY_VIDEO = new MraidJavascriptCommand("PLAY_VIDEO", 7, "playVideo");
    STORE_PICTURE = new MraidJavascriptCommand("STORE_PICTURE", 8, "storePicture");
    GET_CURRENT_POSITION = new MraidJavascriptCommand("GET_CURRENT_POSITION", 9, "getCurrentPosition");
    GET_DEFAULT_POSITION = new MraidJavascriptCommand("GET_DEFAULT_POSITION", 10, "getDefaultPosition");
    GET_MAX_SIZE = new MraidJavascriptCommand("GET_MAX_SIZE", 11, "getMaxSize");
    GET_SCREEN_SIZE = new MraidJavascriptCommand("GET_SCREEN_SIZE", 12, "getScreenSize");
    CREATE_CALENDAR_EVENT = new MraidJavascriptCommand("CREATE_CALENDAR_EVENT", 13, "createCalendarEvent");
    UNSPECIFIED = new MraidJavascriptCommand("UNSPECIFIED", 14, "");
    MraidJavascriptCommand[] arrayOfMraidJavascriptCommand = new MraidJavascriptCommand[15];
    arrayOfMraidJavascriptCommand[0] = CLOSE;
    arrayOfMraidJavascriptCommand[1] = EXPAND;
    arrayOfMraidJavascriptCommand[2] = USECUSTOMCLOSE;
    arrayOfMraidJavascriptCommand[3] = OPEN;
    arrayOfMraidJavascriptCommand[4] = RESIZE;
    arrayOfMraidJavascriptCommand[5] = GET_RESIZE_PROPERTIES;
    arrayOfMraidJavascriptCommand[6] = SET_RESIZE_PROPERTIES;
    arrayOfMraidJavascriptCommand[7] = PLAY_VIDEO;
    arrayOfMraidJavascriptCommand[8] = STORE_PICTURE;
    arrayOfMraidJavascriptCommand[9] = GET_CURRENT_POSITION;
    arrayOfMraidJavascriptCommand[10] = GET_DEFAULT_POSITION;
    arrayOfMraidJavascriptCommand[11] = GET_MAX_SIZE;
    arrayOfMraidJavascriptCommand[12] = GET_SCREEN_SIZE;
    arrayOfMraidJavascriptCommand[13] = CREATE_CALENDAR_EVENT;
    arrayOfMraidJavascriptCommand[14] = UNSPECIFIED;
  }

  private MraidCommandFactory$MraidJavascriptCommand(String paramString)
  {
    this.mCommand = paramString;
  }

  private static MraidJavascriptCommand fromString(String paramString)
  {
    for (MraidJavascriptCommand localMraidJavascriptCommand : values())
      if (localMraidJavascriptCommand.mCommand.equals(paramString))
        return localMraidJavascriptCommand;
    return UNSPECIFIED;
  }

  final String getCommand()
  {
    return this.mCommand;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandFactory.MraidJavascriptCommand
 * JD-Core Version:    0.6.2
 */