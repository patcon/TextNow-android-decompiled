package com.mopub.mobileads;

abstract class MraidProperty
{
  private String sanitize(String paramString)
  {
    if (paramString != null)
      return paramString.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "");
    return "";
  }

  public abstract String toJsonPair();

  public String toString()
  {
    return sanitize(toJsonPair());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidProperty
 * JD-Core Version:    0.6.2
 */