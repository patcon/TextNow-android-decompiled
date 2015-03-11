package com.facebook.widget;

import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.Session;
import com.facebook.internal.Validate;

class WebDialog$BuilderBase<CONCRETE extends BuilderBase<?>>
{
  private String action;
  private String applicationId;
  private Context context;
  private WebDialog.OnCompleteListener listener;
  private Bundle parameters;
  private Session session;
  private int theme = 16973840;

  protected WebDialog$BuilderBase(Context paramContext, Session paramSession, String paramString, Bundle paramBundle)
  {
    Validate.notNull(paramSession, "session");
    if (!paramSession.isOpened())
      throw new FacebookException("Attempted to use a Session that was not open.");
    this.session = paramSession;
    finishInit(paramContext, paramString, paramBundle);
  }

  protected WebDialog$BuilderBase(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    Validate.notNullOrEmpty(paramString1, "applicationId");
    this.applicationId = paramString1;
    finishInit(paramContext, paramString2, paramBundle);
  }

  private void finishInit(Context paramContext, String paramString, Bundle paramBundle)
  {
    this.context = paramContext;
    this.action = paramString;
    if (paramBundle != null)
    {
      this.parameters = paramBundle;
      return;
    }
    this.parameters = new Bundle();
  }

  public WebDialog build()
  {
    if ((this.session != null) && (this.session.isOpened()))
    {
      this.parameters.putString("app_id", this.session.getApplicationId());
      this.parameters.putString("access_token", this.session.getAccessToken());
    }
    while (true)
    {
      if (!this.parameters.containsKey("redirect_uri"))
        this.parameters.putString("redirect_uri", "fbconnect://success");
      return new WebDialog(this.context, this.action, this.parameters, this.theme, this.listener);
      this.parameters.putString("app_id", this.applicationId);
    }
  }

  protected String getApplicationId()
  {
    return this.applicationId;
  }

  protected Context getContext()
  {
    return this.context;
  }

  protected WebDialog.OnCompleteListener getListener()
  {
    return this.listener;
  }

  protected Bundle getParameters()
  {
    return this.parameters;
  }

  protected int getTheme()
  {
    return this.theme;
  }

  public CONCRETE setOnCompleteListener(WebDialog.OnCompleteListener paramOnCompleteListener)
  {
    this.listener = paramOnCompleteListener;
    return this;
  }

  public CONCRETE setTheme(int paramInt)
  {
    this.theme = paramInt;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.widget.WebDialog.BuilderBase
 * JD-Core Version:    0.6.2
 */