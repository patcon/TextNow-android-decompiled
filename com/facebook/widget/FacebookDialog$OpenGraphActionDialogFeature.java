package com.facebook.widget;

public enum FacebookDialog$OpenGraphActionDialogFeature
  implements FacebookDialog.DialogFeature
{
  private int minVersion;

  static
  {
    OpenGraphActionDialogFeature[] arrayOfOpenGraphActionDialogFeature = new OpenGraphActionDialogFeature[1];
    arrayOfOpenGraphActionDialogFeature[0] = OG_ACTION_DIALOG;
  }

  private FacebookDialog$OpenGraphActionDialogFeature(int paramInt)
  {
    this.minVersion = paramInt;
  }

  public final String getAction()
  {
    return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
  }

  public final int getMinVersion()
  {
    return this.minVersion;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.OpenGraphActionDialogFeature
 * JD-Core Version:    0.6.2
 */