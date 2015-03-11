package com.mologiq.analytics;

import java.util.regex.Pattern;

class FileUtils
{
  private static final Pattern a = Pattern.compile("[\\w%+,./=_-]+");

  static native int setPermissions(String paramString, int paramInt1, int paramInt2, int paramInt3);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.FileUtils
 * JD-Core Version:    0.6.2
 */