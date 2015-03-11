package com.facebook.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.widget.Button;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.Request;
import com.facebook.Request.GraphUserCallback;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.Session.StatusCallback;
import com.facebook.SessionDefaultAudience;
import com.facebook.SessionLoginBehavior;
import com.facebook.android.R.color;
import com.facebook.android.R.dimen;
import com.facebook.android.R.drawable;
import com.facebook.android.R.string;
import com.facebook.android.R.styleable;
import com.facebook.internal.SessionTracker;
import com.facebook.internal.Utility;
import com.facebook.model.GraphUser;
import java.util.Arrays;
import java.util.List;

public class LoginButton extends Button
{
  private static final String TAG = LoginButton.class.getName();
  private String applicationId = null;
  private boolean confirmLogout;
  private boolean fetchUserInfo;
  private String loginLogoutEventName = "fb_login_view_usage";
  private String loginText;
  private String logoutText;
  private Fragment parentFragment;
  private LoginButton.LoginButtonProperties properties = new LoginButton.LoginButtonProperties();
  private SessionTracker sessionTracker;
  private GraphUser user = null;
  private LoginButton.UserInfoChangedCallback userInfoChangedCallback;
  private Session userInfoSession = null;

  public LoginButton(Context paramContext)
  {
    super(paramContext);
    initializeActiveSessionWithCachedToken(paramContext);
    finishInit();
  }

  public LoginButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (paramAttributeSet.getStyleAttribute() == 0)
    {
      setGravity(17);
      setTextColor(getResources().getColor(R.color.com_facebook_loginview_text_color));
      setTextSize(0, getResources().getDimension(R.dimen.com_facebook_loginview_text_size));
      setTypeface(Typeface.DEFAULT_BOLD);
      if (!isInEditMode())
        break label135;
      setBackgroundColor(getResources().getColor(R.color.com_facebook_blue));
      this.loginText = "Log in with Facebook";
    }
    while (true)
    {
      parseAttributes(paramAttributeSet);
      if (!isInEditMode())
        initializeActiveSessionWithCachedToken(paramContext);
      return;
      label135: setBackgroundResource(R.drawable.com_facebook_button_blue);
      setCompoundDrawablesWithIntrinsicBounds(R.drawable.com_facebook_inverse_icon, 0, 0, 0);
      setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.com_facebook_loginview_compound_drawable_padding));
      setPadding(getResources().getDimensionPixelSize(R.dimen.com_facebook_loginview_padding_left), getResources().getDimensionPixelSize(R.dimen.com_facebook_loginview_padding_top), getResources().getDimensionPixelSize(R.dimen.com_facebook_loginview_padding_right), getResources().getDimensionPixelSize(R.dimen.com_facebook_loginview_padding_bottom));
    }
  }

  public LoginButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    parseAttributes(paramAttributeSet);
    initializeActiveSessionWithCachedToken(paramContext);
  }

  private void fetchUserInfo()
  {
    if (this.fetchUserInfo)
    {
      final Session localSession = this.sessionTracker.getOpenSession();
      if (localSession == null)
        break label57;
      if (localSession != this.userInfoSession)
      {
        Request.executeBatchAsync(new Request[] { Request.newMeRequest(localSession, new Request.GraphUserCallback()
        {
          public void onCompleted(GraphUser paramAnonymousGraphUser, Response paramAnonymousResponse)
          {
            if (localSession == LoginButton.this.sessionTracker.getOpenSession())
            {
              LoginButton.access$402(LoginButton.this, paramAnonymousGraphUser);
              if (LoginButton.this.userInfoChangedCallback != null)
                LoginButton.this.userInfoChangedCallback.onUserInfoFetched(LoginButton.this.user);
            }
            if (paramAnonymousResponse.getError() != null)
              LoginButton.this.handleError(paramAnonymousResponse.getError().getException());
          }
        }) });
        this.userInfoSession = localSession;
      }
    }
    label57: 
    do
    {
      return;
      this.user = null;
    }
    while (this.userInfoChangedCallback == null);
    this.userInfoChangedCallback.onUserInfoFetched(this.user);
  }

  private void finishInit()
  {
    setOnClickListener(new LoginButton.LoginClickListener(this, null));
    setButtonText();
    if (!isInEditMode())
    {
      this.sessionTracker = new SessionTracker(getContext(), new LoginButton.LoginButtonCallback(this, null), null, false);
      fetchUserInfo();
    }
  }

  private boolean initializeActiveSessionWithCachedToken(Context paramContext)
  {
    if (paramContext == null);
    do
    {
      return false;
      Session localSession = Session.getActiveSession();
      if (localSession != null)
        return localSession.isOpened();
    }
    while ((Utility.getMetadataApplicationId(paramContext) == null) || (Session.openActiveSessionFromCache(paramContext) == null));
    return true;
  }

  private void parseAttributes(AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.com_facebook_login_view);
    this.confirmLogout = localTypedArray.getBoolean(0, true);
    this.fetchUserInfo = localTypedArray.getBoolean(1, true);
    this.loginText = localTypedArray.getString(2);
    this.logoutText = localTypedArray.getString(3);
    localTypedArray.recycle();
  }

  private void setButtonText()
  {
    if ((this.sessionTracker != null) && (this.sessionTracker.getOpenSession() != null))
    {
      if (this.logoutText != null);
      for (String str2 = this.logoutText; ; str2 = getResources().getString(R.string.com_facebook_loginview_log_out_button))
      {
        setText(str2);
        return;
      }
    }
    if (this.loginText != null);
    for (String str1 = this.loginText; ; str1 = getResources().getString(R.string.com_facebook_loginview_log_in_button))
    {
      setText(str1);
      return;
    }
  }

  public void clearPermissions()
  {
    this.properties.clearPermissions();
  }

  public SessionDefaultAudience getDefaultAudience()
  {
    return this.properties.getDefaultAudience();
  }

  public SessionLoginBehavior getLoginBehavior()
  {
    return this.properties.getLoginBehavior();
  }

  public LoginButton.OnErrorListener getOnErrorListener()
  {
    return this.properties.getOnErrorListener();
  }

  List<String> getPermissions()
  {
    return this.properties.getPermissions();
  }

  public Session.StatusCallback getSessionStatusCallback()
  {
    return this.properties.getSessionStatusCallback();
  }

  public LoginButton.UserInfoChangedCallback getUserInfoChangedCallback()
  {
    return this.userInfoChangedCallback;
  }

  void handleError(Exception paramException)
  {
    if (LoginButton.LoginButtonProperties.access$1800(this.properties) != null)
    {
      if ((paramException instanceof FacebookException))
        LoginButton.LoginButtonProperties.access$1800(this.properties).onError((FacebookException)paramException);
    }
    else
      return;
    LoginButton.LoginButtonProperties.access$1800(this.properties).onError(new FacebookException(paramException));
  }

  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Session localSession = this.sessionTracker.getSession();
    if (localSession != null)
      return localSession.onActivityResult((Activity)getContext(), paramInt1, paramInt2, paramIntent);
    return false;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if ((this.sessionTracker != null) && (!this.sessionTracker.isTracking()))
    {
      this.sessionTracker.startTracking();
      fetchUserInfo();
      setButtonText();
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.sessionTracker != null)
      this.sessionTracker.stopTracking();
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    finishInit();
  }

  public void setApplicationId(String paramString)
  {
    this.applicationId = paramString;
  }

  public void setDefaultAudience(SessionDefaultAudience paramSessionDefaultAudience)
  {
    this.properties.setDefaultAudience(paramSessionDefaultAudience);
  }

  public void setFragment(Fragment paramFragment)
  {
    this.parentFragment = paramFragment;
  }

  public void setLoginBehavior(SessionLoginBehavior paramSessionLoginBehavior)
  {
    this.properties.setLoginBehavior(paramSessionLoginBehavior);
  }

  void setLoginLogoutEventName(String paramString)
  {
    this.loginLogoutEventName = paramString;
  }

  public void setOnErrorListener(LoginButton.OnErrorListener paramOnErrorListener)
  {
    this.properties.setOnErrorListener(paramOnErrorListener);
  }

  void setProperties(LoginButton.LoginButtonProperties paramLoginButtonProperties)
  {
    this.properties = paramLoginButtonProperties;
  }

  public void setPublishPermissions(List<String> paramList)
  {
    this.properties.setPublishPermissions(paramList, this.sessionTracker.getSession());
  }

  public void setPublishPermissions(String[] paramArrayOfString)
  {
    this.properties.setPublishPermissions(Arrays.asList(paramArrayOfString), this.sessionTracker.getSession());
  }

  public void setReadPermissions(List<String> paramList)
  {
    this.properties.setReadPermissions(paramList, this.sessionTracker.getSession());
  }

  public void setReadPermissions(String[] paramArrayOfString)
  {
    this.properties.setReadPermissions(Arrays.asList(paramArrayOfString), this.sessionTracker.getSession());
  }

  public void setSession(Session paramSession)
  {
    this.sessionTracker.setSession(paramSession);
    fetchUserInfo();
    setButtonText();
  }

  public void setSessionStatusCallback(Session.StatusCallback paramStatusCallback)
  {
    this.properties.setSessionStatusCallback(paramStatusCallback);
  }

  public void setUserInfoChangedCallback(LoginButton.UserInfoChangedCallback paramUserInfoChangedCallback)
  {
    this.userInfoChangedCallback = paramUserInfoChangedCallback;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.widget.LoginButton
 * JD-Core Version:    0.6.2
 */