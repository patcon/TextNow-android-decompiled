package com.facebook.internal;

import com.facebook.Settings;
import java.util.Collection;

public final class ServerProtocol
{
  public static final String BATCHED_REST_METHOD_URL_BASE = "method/";
  private static final String DIALOG_AUTHORITY_FORMAT = "m.%s";
  public static final String DIALOG_PARAM_ACCESS_TOKEN = "access_token";
  public static final String DIALOG_PARAM_APP_ID = "app_id";
  public static final String DIALOG_PARAM_CLIENT_ID = "client_id";
  public static final String DIALOG_PARAM_DISPLAY = "display";
  public static final String DIALOG_PARAM_E2E = "e2e";
  public static final String DIALOG_PARAM_REDIRECT_URI = "redirect_uri";
  public static final String DIALOG_PARAM_SCOPE = "scope";
  public static final String DIALOG_PARAM_TYPE = "type";
  public static final String DIALOG_PATH = "dialog/";
  private static final String GRAPH_URL_FORMAT = "https://graph.%s";
  private static final String REST_URL_FORMAT = "https://api.%s/method";
  public static final Collection<String> errorsProxyAuthDisabled = Utility.unmodifiableCollection(new String[] { "service_disabled", "AndroidAuthKillSwitchException" });
  public static final Collection<String> errorsUserCanceled = Utility.unmodifiableCollection(new String[] { "access_denied", "OAuthAccessDeniedException" });

  public static final String getDialogAuthority()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Settings.getFacebookDomain();
    return String.format("m.%s", arrayOfObject);
  }

  public static final String getGraphUrlBase()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Settings.getFacebookDomain();
    return String.format("https://graph.%s", arrayOfObject);
  }

  public static final String getRestUrlBase()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Settings.getFacebookDomain();
    return String.format("https://api.%s/method", arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.internal.ServerProtocol
 * JD-Core Version:    0.6.2
 */