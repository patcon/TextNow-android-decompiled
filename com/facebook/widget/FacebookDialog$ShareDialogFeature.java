package com.facebook.widget;

public enum FacebookDialog$ShareDialogFeature
  implements FacebookDialog.DialogFeature
{
  private int minVersion;

  static
  {
    ShareDialogFeature[] arrayOfShareDialogFeature = new ShareDialogFeature[1];
    arrayOfShareDialogFeature[0] = SHARE_DIALOG;
  }

  private FacebookDialog$ShareDialogFeature(int paramInt)
  {
    this.minVersion = paramInt;
  }

  public final int getMinVersion()
  {
    return this.minVersion;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.ShareDialogFeature
 * JD-Core Version:    0.6.2
 */