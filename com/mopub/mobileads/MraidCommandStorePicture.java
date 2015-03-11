package com.mopub.mobileads;

import com.mopub.common.logging.MoPubLog;
import java.util.Map;

class MraidCommandStorePicture extends MraidCommand
{
  public static final String MIME_TYPE_HEADER = "Content-Type";

  public MraidCommandStorePicture(Map<String, String> paramMap, MraidView paramMraidView)
  {
    super(paramMap, paramMraidView);
  }

  void execute()
  {
    String str = getStringFromParamsForKey("uri");
    if ((str != null) && (!str.equals("")))
    {
      this.mView.getDisplayController().showUserDownloadImageAlert(str);
      return;
    }
    this.mView.fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.STORE_PICTURE, "Image can't be stored with null or empty URL");
    MoPubLog.d("Invalid URI for Mraid Store Picture.");
  }

  protected boolean isCommandDependentOnUserClick(MraidView.PlacementType paramPlacementType)
  {
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommandStorePicture
 * JD-Core Version:    0.6.2
 */