package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.facebook.FacebookException;
import com.facebook.widget.FacebookDialog;
import com.facebook.widget.FacebookDialog.Callback;
import com.facebook.widget.FacebookDialog.PendingCall;
import com.facebook.widget.WebDialog;
import com.facebook.widget.WebDialog.OnCompleteListener;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookWebFallbackDialog extends WebDialog
{
  private static final int OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS = 1500;
  private static final String TAG = FacebookWebFallbackDialog.class.getName();
  private boolean waitingForDialogToClose;

  private FacebookWebFallbackDialog(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext, paramString1);
    setExpectedRedirectUrl(paramString2);
  }

  public static boolean presentWebFallback(Context paramContext, String paramString1, String paramString2, final FacebookDialog.PendingCall paramPendingCall, final FacebookDialog.Callback paramCallback)
  {
    if (Utility.isNullOrEmpty(paramString1))
      return false;
    FacebookWebFallbackDialog localFacebookWebFallbackDialog = new FacebookWebFallbackDialog(paramContext, paramString1, String.format("fb%s://bridge/", new Object[] { paramString2 }));
    localFacebookWebFallbackDialog.setOnCompleteListener(new WebDialog.OnCompleteListener()
    {
      public final void onComplete(Bundle paramAnonymousBundle, FacebookException paramAnonymousFacebookException)
      {
        Intent localIntent = new Intent();
        if (paramAnonymousBundle == null)
          paramAnonymousBundle = new Bundle();
        localIntent.putExtras(paramAnonymousBundle);
        FacebookDialog.handleActivityResult(FacebookWebFallbackDialog.this, paramPendingCall, paramPendingCall.getRequestCode(), localIntent, paramCallback);
      }
    });
    localFacebookWebFallbackDialog.show();
    return true;
  }

  public void dismiss()
  {
    WebView localWebView = getWebView();
    if ((isListenerCalled()) || (localWebView == null) || (!localWebView.isShown()))
      super.dismiss();
    while (this.waitingForDialogToClose)
      return;
    this.waitingForDialogToClose = true;
    localWebView.loadUrl("javascript:" + "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
    new Handler(Looper.getMainLooper()).postDelayed(new Runnable()
    {
      public void run()
      {
        if (!FacebookWebFallbackDialog.this.isListenerCalled())
          FacebookWebFallbackDialog.this.sendCancelToListener();
      }
    }
    , 1500L);
  }

  protected Bundle parseResponseUri(String paramString)
  {
    Bundle localBundle = Utility.parseUrlQueryString(Uri.parse(paramString).getQuery());
    String str1 = localBundle.getString("bridge_args");
    localBundle.remove("bridge_args");
    if (!Utility.isNullOrEmpty(str1));
    try
    {
      localBundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", BundleJSONConverter.convertToBundle(new JSONObject(str1)));
      str2 = localBundle.getString("method_results");
      localBundle.remove("method_results");
      if (!Utility.isNullOrEmpty(str2))
        if (Utility.isNullOrEmpty(str2))
          str2 = "{}";
    }
    catch (JSONException localJSONException2)
    {
      try
      {
        String str2;
        localBundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", BundleJSONConverter.convertToBundle(new JSONObject(str2)));
        localBundle.remove("version");
        localBundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", NativeProtocol.getLatestKnownVersion());
        return localBundle;
        localJSONException2 = localJSONException2;
        Utility.logd(TAG, "Unable to parse bridge_args JSON", localJSONException2);
      }
      catch (JSONException localJSONException1)
      {
        while (true)
          Utility.logd(TAG, "Unable to parse bridge_args JSON", localJSONException1);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FacebookWebFallbackDialog
 * JD-Core Version:    0.6.2
 */