package com.facebook.widget;

import com.facebook.internal.LikeActionController;
import com.facebook.internal.LikeActionController.CreationCallback;

class LikeView$LikeActionControllerCreationCallback
  implements LikeActionController.CreationCallback
{
  private boolean isCancelled;

  private LikeView$LikeActionControllerCreationCallback(LikeView paramLikeView)
  {
  }

  public void cancel()
  {
    this.isCancelled = true;
  }

  public void onComplete(LikeActionController paramLikeActionController)
  {
    if (this.isCancelled)
      return;
    LikeView.access$1000(this.this$0, paramLikeActionController);
    LikeView.access$700(this.this$0);
    LikeView.access$1102(this.this$0, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.LikeView.LikeActionControllerCreationCallback
 * JD-Core Version:    0.6.2
 */