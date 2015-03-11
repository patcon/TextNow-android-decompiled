package com.facebook;

import android.os.Bundle;

final class TestSession$TestTokenCachingStrategy extends TokenCachingStrategy
{
  private Bundle bundle;

  public final void clear()
  {
    this.bundle = null;
  }

  public final Bundle load()
  {
    return this.bundle;
  }

  public final void save(Bundle paramBundle)
  {
    this.bundle = paramBundle;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.TestSession.TestTokenCachingStrategy
 * JD-Core Version:    0.6.2
 */