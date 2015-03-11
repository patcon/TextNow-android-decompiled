package com.facebook.widget;

public enum FacebookDialog$ShareDialogFeature
  implements FacebookDialog.DialogFeature
{
  private int minVersion;

  static
  {
    PHOTOS = new ShareDialogFeature("PHOTOS", 1, 20140204);
    ShareDialogFeature[] arrayOfShareDialogFeature = new ShareDialogFeature[2];
    arrayOfShareDialogFeature[0] = SHARE_DIALOG;
    arrayOfShareDialogFeature[1] = PHOTOS;
  }

  private FacebookDialog$ShareDialogFeature(int paramInt)
  {
    this.minVersion = paramInt;
  }

  public final String getAction()
  {
    return "com.facebook.platform.action.request.FEED_DIALOG";
  }

  public final int getMinVersion()
  {
    return this.minVersion;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.ShareDialogFeature
 * JD-Core Version:    0.6.2
 */