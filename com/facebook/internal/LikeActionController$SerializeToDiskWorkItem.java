package com.facebook.internal;

class LikeActionController$SerializeToDiskWorkItem
  implements Runnable
{
  private String cacheKey;
  private String controllerJson;

  LikeActionController$SerializeToDiskWorkItem(String paramString1, String paramString2)
  {
    this.cacheKey = paramString1;
    this.controllerJson = paramString2;
  }

  public void run()
  {
    LikeActionController.access$2800(this.cacheKey, this.controllerJson);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.LikeActionController.SerializeToDiskWorkItem
 * JD-Core Version:    0.6.2
 */