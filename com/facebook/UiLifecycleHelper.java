package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.m;
import com.facebook.widget.FacebookDialog;
import com.facebook.widget.FacebookDialog.Callback;
import com.facebook.widget.FacebookDialog.PendingCall;
import java.util.UUID;

public class UiLifecycleHelper
{
  private static final String ACTIVITY_NULL_MESSAGE = "activity cannot be null";
  private static final String DIALOG_CALL_BUNDLE_SAVE_KEY = "com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey";
  private final Activity activity;
  private AppEventsLogger appEventsLogger;
  private final m broadcastManager;
  private final Session.StatusCallback callback;
  private FacebookDialog.PendingCall pendingFacebookDialogCall;
  private final BroadcastReceiver receiver;

  public UiLifecycleHelper(Activity paramActivity, Session.StatusCallback paramStatusCallback)
  {
    if (paramActivity == null)
      throw new IllegalArgumentException("activity cannot be null");
    this.activity = paramActivity;
    this.callback = paramStatusCallback;
    this.receiver = new UiLifecycleHelper.ActiveSessionBroadcastReceiver(this, null);
    this.broadcastManager = m.a(paramActivity);
  }

  private void cancelPendingAppCall(FacebookDialog.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      Intent localIntent1 = this.pendingFacebookDialogCall.getRequestIntent();
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("com.facebook.platform.protocol.CALL_ID", localIntent1.getStringExtra("com.facebook.platform.protocol.CALL_ID"));
      localIntent2.putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", localIntent1.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION"));
      localIntent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", localIntent1.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0));
      localIntent2.putExtra("com.facebook.platform.status.ERROR_TYPE", "UnknownError");
      FacebookDialog.handleActivityResult(this.activity, this.pendingFacebookDialogCall, this.pendingFacebookDialogCall.getRequestCode(), localIntent2, paramCallback);
    }
    this.pendingFacebookDialogCall = null;
  }

  private boolean handleFacebookDialogActivityResult(int paramInt1, int paramInt2, Intent paramIntent, FacebookDialog.Callback paramCallback)
  {
    if ((this.pendingFacebookDialogCall == null) || (this.pendingFacebookDialogCall.getRequestCode() != paramInt1))
      return false;
    if (paramIntent == null)
    {
      cancelPendingAppCall(paramCallback);
      return true;
    }
    String str = paramIntent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
    if (str != null);
    while (true)
    {
      try
      {
        UUID localUUID2 = UUID.fromString(str);
        localUUID1 = localUUID2;
        if ((localUUID1 == null) || (!this.pendingFacebookDialogCall.getCallId().equals(localUUID1)))
          break label107;
        FacebookDialog.handleActivityResult(this.activity, this.pendingFacebookDialogCall, paramInt1, paramIntent, paramCallback);
        this.pendingFacebookDialogCall = null;
        return true;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
      }
      UUID localUUID1 = null;
      continue;
      label107: cancelPendingAppCall(paramCallback);
    }
  }

  public AppEventsLogger getAppEventsLogger()
  {
    Session localSession = Session.getActiveSession();
    if (localSession == null)
      return null;
    if ((this.appEventsLogger == null) || (!this.appEventsLogger.isValidForSession(localSession)))
    {
      if (this.appEventsLogger != null)
        AppEventsLogger.onContextStop();
      this.appEventsLogger = AppEventsLogger.newLogger(this.activity, localSession);
    }
    return this.appEventsLogger;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    onActivityResult(paramInt1, paramInt2, paramIntent, null);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent, FacebookDialog.Callback paramCallback)
  {
    Session localSession = Session.getActiveSession();
    if (localSession != null)
      localSession.onActivityResult(this.activity, paramInt1, paramInt2, paramIntent);
    handleFacebookDialogActivityResult(paramInt1, paramInt2, paramIntent, paramCallback);
  }

  public void onCreate(Bundle paramBundle)
  {
    Session localSession = Session.getActiveSession();
    if (localSession == null)
    {
      if (paramBundle != null)
        localSession = Session.restoreSession(this.activity, null, this.callback, paramBundle);
      if (localSession == null)
        localSession = new Session(this.activity);
      Session.setActiveSession(localSession);
    }
    if (paramBundle != null)
      this.pendingFacebookDialogCall = ((FacebookDialog.PendingCall)paramBundle.getParcelable("com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey"));
  }

  public void onDestroy()
  {
  }

  public void onPause()
  {
    this.broadcastManager.a(this.receiver);
    if (this.callback != null)
    {
      Session localSession = Session.getActiveSession();
      if (localSession != null)
        localSession.removeCallback(this.callback);
    }
  }

  public void onResume()
  {
    Session localSession = Session.getActiveSession();
    if (localSession != null)
    {
      if (this.callback != null)
        localSession.addCallback(this.callback);
      if (SessionState.CREATED_TOKEN_LOADED.equals(localSession.getState()))
        localSession.openForRead(null);
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.facebook.sdk.ACTIVE_SESSION_SET");
    localIntentFilter.addAction("com.facebook.sdk.ACTIVE_SESSION_UNSET");
    this.broadcastManager.a(this.receiver, localIntentFilter);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    Session.saveSession(Session.getActiveSession(), paramBundle);
    paramBundle.putParcelable("com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey", this.pendingFacebookDialogCall);
  }

  public void onStop()
  {
    AppEventsLogger.onContextStop();
  }

  public void trackPendingDialogCall(FacebookDialog.PendingCall paramPendingCall)
  {
    if (this.pendingFacebookDialogCall != null)
      cancelPendingAppCall(null);
    this.pendingFacebookDialogCall = paramPendingCall;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.UiLifecycleHelper
 * JD-Core Version:    0.6.2
 */