package com.mopub.mobileads;

import java.util.Map;

abstract class MraidCommand
{
  protected static final String URI_KEY = "uri";
  protected Map<String, String> mParams;
  protected MraidView mView;

  MraidCommand(Map<String, String> paramMap, MraidView paramMraidView)
  {
    this.mParams = paramMap;
    this.mView = paramMraidView;
  }

  abstract void execute();

  protected boolean getBooleanFromParamsForKey(String paramString)
  {
    return "true".equals(this.mParams.get(paramString));
  }

  protected float getFloatFromParamsForKey(String paramString)
  {
    if ((String)this.mParams.get(paramString) == null)
      return 0.0F;
    try
    {
      float f = Float.parseFloat(paramString);
      return f;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 0.0F;
  }

  protected int getIntFromParamsForKey(String paramString)
  {
    String str = (String)this.mParams.get(paramString);
    if (str == null)
      return -1;
    try
    {
      int i = Integer.parseInt(str, 10);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return -1;
  }

  protected String getStringFromParamsForKey(String paramString)
  {
    return (String)this.mParams.get(paramString);
  }

  protected boolean isCommandDependentOnUserClick(MraidView.PlacementType paramPlacementType)
  {
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidCommand
 * JD-Core Version:    0.6.2
 */