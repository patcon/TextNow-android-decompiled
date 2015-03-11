package com.facebook.widget;

public enum FacebookDialog$OpenGraphMessageDialogFeature
  implements FacebookDialog.DialogFeature
{
  private int minVersion;

  static
  {
    OpenGraphMessageDialogFeature[] arrayOfOpenGraphMessageDialogFeature = new OpenGraphMessageDialogFeature[1];
    arrayOfOpenGraphMessageDialogFeature[0] = OG_MESSAGE_DIALOG;
  }

  private FacebookDialog$OpenGraphMessageDialogFeature(int paramInt)
  {
    this.minVersion = paramInt;
  }

  public final String getAction()
  {
    return "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
  }

  public final int getMinVersion()
  {
    return this.minVersion;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.OpenGraphMessageDialogFeature
 * JD-Core Version:    0.6.2
 */