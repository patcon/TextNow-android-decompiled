package com.facebook.internal;

import android.content.Context;

class LikeActionController$CreateLikeActionControllerWorkItem
  implements Runnable
{
  private LikeActionController.CreationCallback callback;
  private Context context;
  private String objectId;

  LikeActionController$CreateLikeActionControllerWorkItem(Context paramContext, String paramString, LikeActionController.CreationCallback paramCreationCallback)
  {
    this.context = paramContext;
    this.objectId = paramString;
    this.callback = paramCreationCallback;
  }

  public void run()
  {
    LikeActionController.access$2900(this.context, this.objectId, this.callback);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.LikeActionController.CreateLikeActionControllerWorkItem
 * JD-Core Version:    0.6.2
 */