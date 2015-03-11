package com.facebook;

public enum SessionDefaultAudience
{
  private final String nativeProtocolAudience;

  static
  {
    FRIENDS = new SessionDefaultAudience("FRIENDS", 2, "ALL_FRIENDS");
    EVERYONE = new SessionDefaultAudience("EVERYONE", 3, "EVERYONE");
    SessionDefaultAudience[] arrayOfSessionDefaultAudience = new SessionDefaultAudience[4];
    arrayOfSessionDefaultAudience[0] = NONE;
    arrayOfSessionDefaultAudience[1] = ONLY_ME;
    arrayOfSessionDefaultAudience[2] = FRIENDS;
    arrayOfSessionDefaultAudience[3] = EVERYONE;
  }

  private SessionDefaultAudience(String paramString)
  {
    this.nativeProtocolAudience = paramString;
  }

  final String getNativeProtocolAudience()
  {
    return this.nativeProtocolAudience;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.SessionDefaultAudience
 * JD-Core Version:    0.6.2
 */