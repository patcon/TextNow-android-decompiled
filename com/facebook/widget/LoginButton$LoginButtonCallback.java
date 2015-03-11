package com.facebook.widget;

import com.facebook.Session;
import com.facebook.Session.StatusCallback;
import com.facebook.SessionState;

class LoginButton$LoginButtonCallback
  implements Session.StatusCallback
{
  private LoginButton$LoginButtonCallback(LoginButton paramLoginButton)
  {
  }

  public void call(Session paramSession, SessionState paramSessionState, Exception paramException)
  {
    LoginButton.access$1700(this.this$0);
    LoginButton.access$1800(this.this$0);
    if (LoginButton.LoginButtonProperties.access$1900(LoginButton.access$1000(this.this$0)) != null)
      LoginButton.LoginButtonProperties.access$1900(LoginButton.access$1000(this.this$0)).call(paramSession, paramSessionState, paramException);
    while (paramException == null)
      return;
    this.this$0.handleError(paramException);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.LoginButton.LoginButtonCallback
 * JD-Core Version:    0.6.2
 */