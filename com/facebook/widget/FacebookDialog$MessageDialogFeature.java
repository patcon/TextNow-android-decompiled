package com.facebook.widget;

public enum FacebookDialog$MessageDialogFeature
  implements FacebookDialog.DialogFeature
{
  private int minVersion;

  static
  {
    MessageDialogFeature[] arrayOfMessageDialogFeature = new MessageDialogFeature[2];
    arrayOfMessageDialogFeature[0] = MESSAGE_DIALOG;
    arrayOfMessageDialogFeature[1] = PHOTOS;
  }

  private FacebookDialog$MessageDialogFeature(int paramInt)
  {
    this.minVersion = paramInt;
  }

  public final String getAction()
  {
    return "com.facebook.platform.action.request.MESSAGE_DIALOG";
  }

  public final int getMinVersion()
  {
    return this.minVersion;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.MessageDialogFeature
 * JD-Core Version:    0.6.2
 */