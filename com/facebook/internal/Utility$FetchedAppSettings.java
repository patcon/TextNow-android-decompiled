package com.facebook.internal;

import java.util.Map;

public class Utility$FetchedAppSettings
{
  private Map<String, Map<String, Utility.DialogFeatureConfig>> dialogConfigMap;
  private String nuxContent;
  private boolean nuxEnabled;
  private boolean supportsAttribution;
  private boolean supportsImplicitLogging;

  private Utility$FetchedAppSettings(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, Map<String, Map<String, Utility.DialogFeatureConfig>> paramMap)
  {
    this.supportsAttribution = paramBoolean1;
    this.supportsImplicitLogging = paramBoolean2;
    this.nuxContent = paramString;
    this.nuxEnabled = paramBoolean3;
    this.dialogConfigMap = paramMap;
  }

  public Map<String, Map<String, Utility.DialogFeatureConfig>> getDialogConfigurations()
  {
    return this.dialogConfigMap;
  }

  public String getNuxContent()
  {
    return this.nuxContent;
  }

  public boolean getNuxEnabled()
  {
    return this.nuxEnabled;
  }

  public boolean supportsAttribution()
  {
    return this.supportsAttribution;
  }

  public boolean supportsImplicitLogging()
  {
    return this.supportsImplicitLogging;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.Utility.FetchedAppSettings
 * JD-Core Version:    0.6.2
 */