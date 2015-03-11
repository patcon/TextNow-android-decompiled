package com.facebook.widget;

import android.app.Activity;
import java.util.EnumSet;

public class FacebookDialog$ShareDialogBuilder extends FacebookDialog.ShareDialogBuilderBase<ShareDialogBuilder>
{
  public FacebookDialog$ShareDialogBuilder(Activity paramActivity)
  {
    super(paramActivity);
  }

  protected EnumSet<? extends FacebookDialog.DialogFeature> getDialogFeatures()
  {
    return EnumSet.of(FacebookDialog.ShareDialogFeature.SHARE_DIALOG);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.ShareDialogBuilder
 * JD-Core Version:    0.6.2
 */