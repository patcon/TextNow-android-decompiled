package com.facebook.widget;

import android.app.Activity;
import com.facebook.model.OpenGraphAction;
import java.util.EnumSet;

public class FacebookDialog$OpenGraphActionDialogBuilder extends FacebookDialog.OpenGraphDialogBuilderBase<OpenGraphActionDialogBuilder>
{
  public FacebookDialog$OpenGraphActionDialogBuilder(Activity paramActivity, OpenGraphAction paramOpenGraphAction, String paramString)
  {
    super(paramActivity, paramOpenGraphAction, paramString);
  }

  @Deprecated
  public FacebookDialog$OpenGraphActionDialogBuilder(Activity paramActivity, OpenGraphAction paramOpenGraphAction, String paramString1, String paramString2)
  {
    super(paramActivity, paramOpenGraphAction, paramString1, paramString2);
  }

  protected EnumSet<? extends FacebookDialog.DialogFeature> getDialogFeatures()
  {
    return EnumSet.of(FacebookDialog.OpenGraphActionDialogFeature.OG_ACTION_DIALOG);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.OpenGraphActionDialogBuilder
 * JD-Core Version:    0.6.2
 */