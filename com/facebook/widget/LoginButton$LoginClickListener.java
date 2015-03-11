package com.facebook.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.AppEventsLogger;
import com.facebook.Session;
import com.facebook.Session.Builder;
import com.facebook.Session.OpenRequest;
import com.facebook.SessionState;
import com.facebook.android.R.string;
import com.facebook.internal.SessionAuthorizationType;
import com.facebook.internal.SessionTracker;
import com.facebook.model.GraphUser;

class LoginButton$LoginClickListener
  implements View.OnClickListener
{
  private LoginButton$LoginClickListener(LoginButton paramLoginButton)
  {
  }

  public void onClick(View paramView)
  {
    Context localContext = this.this$0.getContext();
    final Session localSession1 = LoginButton.access$300(this.this$0).getOpenSession();
    String str3;
    if (localSession1 != null)
      if (LoginButton.access$600(this.this$0))
      {
        String str1 = this.this$0.getResources().getString(R.string.com_facebook_loginview_log_out_action);
        String str2 = this.this$0.getResources().getString(R.string.com_facebook_loginview_cancel_action);
        if ((LoginButton.access$400(this.this$0) != null) && (LoginButton.access$400(this.this$0).getName() != null))
        {
          String str4 = this.this$0.getResources().getString(R.string.com_facebook_loginview_logged_in_as);
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = LoginButton.access$400(this.this$0).getName();
          str3 = String.format(str4, arrayOfObject);
          AlertDialog.Builder localBuilder = new AlertDialog.Builder(localContext);
          localBuilder.setMessage(str3).setCancelable(true).setPositiveButton(str1, new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              localSession1.closeAndClearTokenInformation();
            }
          }).setNegativeButton(str2, null);
          localBuilder.create().show();
        }
      }
    label212: label484: label488: 
    while (true)
    {
      AppEventsLogger localAppEventsLogger = AppEventsLogger.newLogger(this.this$0.getContext());
      Bundle localBundle = new Bundle();
      int i;
      Session localSession2;
      Session.OpenRequest localOpenRequest;
      if (localSession1 != null)
      {
        i = 0;
        localBundle.putInt("logging_in", i);
        localAppEventsLogger.logSdkEvent(LoginButton.access$1400(this.this$0), null, localBundle);
        return;
        str3 = this.this$0.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
        break;
        localSession1.closeAndClearTokenInformation();
        continue;
        localSession2 = LoginButton.access$300(this.this$0).getSession();
        if ((localSession2 == null) || (localSession2.getState().isClosed()))
        {
          LoginButton.access$300(this.this$0).setSession(null);
          localSession2 = new Session.Builder(localContext).setApplicationId(LoginButton.access$700(this.this$0)).build();
          Session.setActiveSession(localSession2);
        }
        if (localSession2.isOpened())
          continue;
        if (LoginButton.access$800(this.this$0) != null)
          localOpenRequest = new Session.OpenRequest(LoginButton.access$800(this.this$0));
      }
      while (true)
      {
        if (localOpenRequest == null)
          break label488;
        localOpenRequest.setDefaultAudience(LoginButton.LoginButtonProperties.access$1000(LoginButton.access$900(this.this$0)));
        localOpenRequest.setPermissions(LoginButton.LoginButtonProperties.access$1100(LoginButton.access$900(this.this$0)));
        localOpenRequest.setLoginBehavior(LoginButton.LoginButtonProperties.access$1200(LoginButton.access$900(this.this$0)));
        if (SessionAuthorizationType.PUBLISH.equals(LoginButton.LoginButtonProperties.access$1300(LoginButton.access$900(this.this$0))))
        {
          localSession2.openForPublish(localOpenRequest);
          break;
          if (!(localContext instanceof Activity))
            break label484;
          localOpenRequest = new Session.OpenRequest((Activity)localContext);
          continue;
        }
        localSession2.openForRead(localOpenRequest);
        break;
        i = 1;
        break label212;
        localOpenRequest = null;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.widget.LoginButton.LoginClickListener
 * JD-Core Version:    0.6.2
 */