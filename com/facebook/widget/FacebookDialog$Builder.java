package com.facebook.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;

abstract class FacebookDialog$Builder<CONCRETE extends Builder<?>>
{
  protected final Activity activity;
  protected final FacebookDialog.PendingCall appCall;
  protected final String applicationId;
  protected String applicationName;
  protected Fragment fragment;

  FacebookDialog$Builder(Activity paramActivity)
  {
    Validate.notNull(paramActivity, "activity");
    this.activity = paramActivity;
    this.applicationId = Utility.getMetadataApplicationId(paramActivity);
    this.appCall = new FacebookDialog.PendingCall(64207);
  }

  public FacebookDialog build()
  {
    validate();
    Bundle localBundle = new Bundle();
    putExtra(localBundle, "com.facebook.platform.extra.APPLICATION_ID", this.applicationId);
    putExtra(localBundle, "com.facebook.platform.extra.APPLICATION_NAME", this.applicationName);
    Intent localIntent = handleBuild(localBundle);
    if (localIntent == null)
      throw new FacebookException("Unable to create Intent; this likely means the Facebook app is not installed.");
    FacebookDialog.PendingCall.access$100(this.appCall, localIntent);
    return new FacebookDialog(this.activity, this.fragment, this.appCall, getOnPresentCallback(), null);
  }

  public boolean canPresent()
  {
    return handleCanPresent();
  }

  FacebookDialog.OnPresentCallback getOnPresentCallback()
  {
    return null;
  }

  abstract Intent handleBuild(Bundle paramBundle);

  boolean handleCanPresent()
  {
    return FacebookDialog.access$300(this.activity, Integer.valueOf(20130618)) != -1;
  }

  void putExtra(Bundle paramBundle, String paramString1, String paramString2)
  {
    if (paramString2 != null)
      paramBundle.putString(paramString1, paramString2);
  }

  public CONCRETE setApplicationName(String paramString)
  {
    this.applicationName = paramString;
    return this;
  }

  public CONCRETE setFragment(Fragment paramFragment)
  {
    this.fragment = paramFragment;
    return this;
  }

  public CONCRETE setRequestCode(int paramInt)
  {
    FacebookDialog.PendingCall.access$000(this.appCall, paramInt);
    return this;
  }

  void validate()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.Builder
 * JD-Core Version:    0.6.2
 */