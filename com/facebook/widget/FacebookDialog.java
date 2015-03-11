package com.facebook.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeProtocol;
import java.util.EnumSet;
import java.util.Iterator;

public class FacebookDialog
{
  public static final String COMPLETION_GESTURE_CANCEL = "cancel";
  private static final String EXTRA_DIALOG_COMPLETE_KEY = "com.facebook.platform.extra.DID_COMPLETE";
  private static final String EXTRA_DIALOG_COMPLETION_GESTURE_KEY = "com.facebook.platform.extra.COMPLETION_GESTURE";
  private static final String EXTRA_DIALOG_COMPLETION_ID_KEY = "com.facebook.platform.extra.POST_ID";
  private static final int MIN_NATIVE_SHARE_PROTOCOL_VERSION = 20130618;
  private static NativeAppCallAttachmentStore attachmentStore;
  private Activity activity;
  private FacebookDialog.PendingCall appCall;
  private Fragment fragment;
  private FacebookDialog.OnPresentCallback onPresentCallback;

  private FacebookDialog(Activity paramActivity, Fragment paramFragment, FacebookDialog.PendingCall paramPendingCall, FacebookDialog.OnPresentCallback paramOnPresentCallback)
  {
    this.activity = paramActivity;
    this.fragment = paramFragment;
    this.appCall = paramPendingCall;
    this.onPresentCallback = paramOnPresentCallback;
  }

  public static boolean canPresentOpenGraphActionDialog(Context paramContext, FacebookDialog.OpenGraphActionDialogFeature[] paramArrayOfOpenGraphActionDialogFeature)
  {
    return handleCanPresent(paramContext, EnumSet.of(FacebookDialog.OpenGraphActionDialogFeature.OG_ACTION_DIALOG, paramArrayOfOpenGraphActionDialogFeature));
  }

  public static boolean canPresentShareDialog(Context paramContext, FacebookDialog.ShareDialogFeature[] paramArrayOfShareDialogFeature)
  {
    return handleCanPresent(paramContext, EnumSet.of(FacebookDialog.ShareDialogFeature.SHARE_DIALOG, paramArrayOfShareDialogFeature));
  }

  private static NativeAppCallAttachmentStore getAttachmentStore()
  {
    if (attachmentStore == null)
      attachmentStore = new NativeAppCallAttachmentStore();
    return attachmentStore;
  }

  private static int getMinVersionForFeatures(Iterable<? extends FacebookDialog.DialogFeature> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    for (int i = -2147483648; localIterator.hasNext(); i = Math.max(i, ((FacebookDialog.DialogFeature)localIterator.next()).getMinVersion()));
    return i;
  }

  public static String getNativeDialogCompletionGesture(Bundle paramBundle)
  {
    return paramBundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
  }

  public static boolean getNativeDialogDidComplete(Bundle paramBundle)
  {
    return paramBundle.getBoolean("com.facebook.platform.extra.DID_COMPLETE", false);
  }

  public static String getNativeDialogPostId(Bundle paramBundle)
  {
    return paramBundle.getString("com.facebook.platform.extra.POST_ID");
  }

  private static int getProtocolVersionForNativeDialog(Context paramContext, Integer paramInteger)
  {
    return NativeProtocol.getLatestAvailableProtocolVersion(paramContext, paramInteger.intValue());
  }

  public static boolean handleActivityResult(Context paramContext, FacebookDialog.PendingCall paramPendingCall, int paramInt, Intent paramIntent, FacebookDialog.Callback paramCallback)
  {
    if (paramInt != paramPendingCall.getRequestCode())
      return false;
    if (attachmentStore != null)
      attachmentStore.cleanupAttachmentsForCall(paramContext, paramPendingCall.getCallId());
    if (paramCallback != null)
    {
      if (!NativeProtocol.isErrorResult(paramIntent))
        break label57;
      paramCallback.onError(paramPendingCall, NativeProtocol.getErrorFromResult(paramIntent), paramIntent.getExtras());
    }
    while (true)
    {
      return true;
      label57: paramCallback.onComplete(paramPendingCall, paramIntent.getExtras());
    }
  }

  private static boolean handleCanPresent(Context paramContext, Iterable<? extends FacebookDialog.DialogFeature> paramIterable)
  {
    return getProtocolVersionForNativeDialog(paramContext, Integer.valueOf(getMinVersionForFeatures(paramIterable))) != -1;
  }

  public FacebookDialog.PendingCall present()
  {
    if (this.onPresentCallback != null);
    while (true)
    {
      try
      {
        this.onPresentCallback.onPresent(this.activity);
        if (this.fragment != null)
        {
          this.fragment.startActivityForResult(this.appCall.getRequestIntent(), this.appCall.getRequestCode());
          return this.appCall;
        }
      }
      catch (Exception localException)
      {
        throw new FacebookException(localException);
      }
      this.activity.startActivityForResult(this.appCall.getRequestIntent(), this.appCall.getRequestCode());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog
 * JD-Core Version:    0.6.2
 */