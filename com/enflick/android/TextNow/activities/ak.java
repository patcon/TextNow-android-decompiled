package com.enflick.android.TextNow.activities;

import android.os.Bundle;
import android.view.Window;

public abstract class ak extends ao
{
  protected abstract int g();

  public void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    super.onCreate(paramBundle);
    setContentView(g());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ak
 * JD-Core Version:    0.6.2
 */