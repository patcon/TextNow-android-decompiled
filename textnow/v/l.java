package textnow.v;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookAuthorizationException;
import com.facebook.HttpMethod;
import com.facebook.Request;
import com.facebook.Request.Callback;
import com.facebook.RequestAsyncTask;
import com.facebook.Session;
import com.facebook.Session.Builder;
import com.facebook.Session.NewPermissionsRequest;
import com.facebook.Session.OpenRequest;
import com.facebook.Session.StatusCallback;
import com.facebook.SessionDefaultAudience;
import com.facebook.SessionLoginBehavior;
import com.facebook.SessionState;
import com.facebook.internal.SessionTracker;
import com.facebook.internal.Utility;
import com.facebook.model.GraphUser;
import java.util.Arrays;
import java.util.List;

public final class l
{
  public static GraphUser a;
  public static String b;
  private static Session.StatusCallback c;

  public static void a(final Activity paramActivity, Session.StatusCallback paramStatusCallback, List<String> paramList, boolean paramBoolean)
  {
    SessionTracker localSessionTracker = new SessionTracker(paramActivity, new Session.StatusCallback()
    {
      public final void call(Session paramAnonymousSession, SessionState paramAnonymousSessionState, Exception paramAnonymousException)
      {
      }
    }
    , null, false);
    String str = Utility.getMetadataApplicationId(paramActivity);
    Session localSession = localSessionTracker.getSession();
    if ((localSession != null) && (localSession.getState() == SessionState.OPENING))
      localSession.close();
    int i;
    if (localSession != null)
    {
      boolean bool = localSession.getState().isClosed();
      i = 0;
      if (!bool);
    }
    else
    {
      localSessionTracker.setSession(null);
      localSession = new Session.Builder(paramActivity).setApplicationId(str).build();
      Session.setActiveSession(localSession);
      i = 1;
    }
    if (!localSession.isOpened())
    {
      Session.OpenRequest localOpenRequest = new Session.OpenRequest(paramActivity);
      localOpenRequest.setDefaultAudience(SessionDefaultAudience.FRIENDS);
      localOpenRequest.setPermissions(paramList);
      localOpenRequest.setLoginBehavior(SessionLoginBehavior.SSO_WITH_FALLBACK);
      if (paramBoolean)
      {
        if (i == 0)
        {
          if (c != null)
            localSession.removeCallback(c);
          localSession.addCallback(paramStatusCallback);
          c = paramStatusCallback;
          localSession.openForPublish(localOpenRequest);
          return;
        }
        localSession.addCallback(new Session.StatusCallback()
        {
          public final void call(Session paramAnonymousSession, SessionState paramAnonymousSessionState, Exception paramAnonymousException)
          {
            if (paramAnonymousSessionState.isOpened())
            {
              paramAnonymousSession.removeCallback(this);
              paramAnonymousSession.addCallback(l.this);
              paramAnonymousSession.requestNewPublishPermissions(new Session.NewPermissionsRequest(paramActivity, Arrays.asList(new String[] { "publish_actions" })));
            }
          }
        });
        localSession.openForRead(new Session.OpenRequest(paramActivity));
        return;
      }
      if (c != null)
        localSession.removeCallback(c);
      localSession.addCallback(paramStatusCallback);
      c = paramStatusCallback;
      localSession.openForRead(localOpenRequest);
      return;
    }
    paramStatusCallback.call(Session.getActiveSession(), Session.getActiveSession().getState(), null);
  }

  public static void a(Activity paramActivity, final String paramString1, final String paramString2, final String paramString3, final String paramString4, final Request.Callback paramCallback)
  {
    Session.StatusCallback local3 = new Session.StatusCallback()
    {
      public final void call(Session paramAnonymousSession, SessionState paramAnonymousSessionState, Exception paramAnonymousException)
      {
        if (paramAnonymousException != null)
        {
          paramAnonymousException.toString();
          Session.getActiveSession().closeAndClearTokenInformation();
          if ((paramAnonymousException instanceof FacebookAuthorizationException))
            l.a(l.this, paramString1, paramString2, paramString3, paramString4, paramCallback);
        }
        while (!paramAnonymousSession.isOpened())
        {
          return;
          paramCallback.onCompleted(null);
          return;
        }
        l.a(paramString1, paramString2, paramString3, paramString4, paramCallback);
      }
    };
    if ((Session.getActiveSession() == null) || (!Session.getActiveSession().isOpened()))
    {
      a(paramActivity, local3, Arrays.asList(new String[] { "publish_actions" }), true);
      return;
    }
    if (!Session.getActiveSession().getPermissions().contains("publish_actions"))
    {
      Session localSession = Session.getActiveSession();
      if (c != null)
        localSession.removeCallback(c);
      localSession.addCallback(local3);
      c = local3;
      Session.getActiveSession().requestNewPublishPermissions(new Session.NewPermissionsRequest(paramActivity, Arrays.asList(new String[] { "publish_actions" })));
      return;
    }
    a(paramString1, paramString2, paramString3, paramString4, paramCallback);
  }

  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, Request.Callback paramCallback)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("message", paramString1);
    localBundle.putString("link", paramString2);
    localBundle.putString("name", paramString3);
    localBundle.putString("description", paramString4);
    new RequestAsyncTask(new Request[] { new Request(Session.getActiveSession(), "me/feed", localBundle, HttpMethod.POST, paramCallback) }).execute(new Void[0]);
  }

  public static boolean a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((Session.getActiveSession() != null) && (paramIntent != null))
      return Session.getActiveSession().onActivityResult(paramActivity, paramInt1, paramInt2, paramIntent);
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.v.l
 * JD-Core Version:    0.6.2
 */