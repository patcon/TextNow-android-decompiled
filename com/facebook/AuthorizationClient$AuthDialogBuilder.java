package com.facebook;

import android.content.Context;
import android.os.Bundle;
import com.facebook.widget.WebDialog;
import com.facebook.widget.WebDialog.Builder;

class AuthorizationClient$AuthDialogBuilder extends WebDialog.Builder
{
  private static final String OAUTH_DIALOG = "oauth";
  static final String REDIRECT_URI = "fbconnect://success";
  private String e2e;

  public AuthorizationClient$AuthDialogBuilder(Context paramContext, String paramString, Bundle paramBundle)
  {
    super(paramContext, paramString, "oauth", paramBundle);
  }

  public WebDialog build()
  {
    Bundle localBundle = getParameters();
    localBundle.putString("redirect_uri", "fbconnect://success");
    localBundle.putString("client_id", getApplicationId());
    localBundle.putString("e2e", this.e2e);
    return new WebDialog(getContext(), "oauth", localBundle, getTheme(), getListener());
  }

  public AuthDialogBuilder setE2E(String paramString)
  {
    this.e2e = paramString;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.AuthDialogBuilder
 * JD-Core Version:    0.6.2
 */