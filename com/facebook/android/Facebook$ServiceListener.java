package com.facebook.android;

import android.os.Bundle;

public abstract interface Facebook$ServiceListener
{
  public abstract void onComplete(Bundle paramBundle);

  public abstract void onError(Error paramError);

  public abstract void onFacebookError(FacebookError paramFacebookError);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.android.Facebook.ServiceListener
 * JD-Core Version:    0.6.2
 */