package com.facebook;

public enum SessionState
{
  private final SessionState.Category category;

  static
  {
    OPENED = new SessionState("OPENED", 3, SessionState.Category.OPENED_CATEGORY);
    OPENED_TOKEN_UPDATED = new SessionState("OPENED_TOKEN_UPDATED", 4, SessionState.Category.OPENED_CATEGORY);
    CLOSED_LOGIN_FAILED = new SessionState("CLOSED_LOGIN_FAILED", 5, SessionState.Category.CLOSED_CATEGORY);
    CLOSED = new SessionState("CLOSED", 6, SessionState.Category.CLOSED_CATEGORY);
    SessionState[] arrayOfSessionState = new SessionState[7];
    arrayOfSessionState[0] = CREATED;
    arrayOfSessionState[1] = CREATED_TOKEN_LOADED;
    arrayOfSessionState[2] = OPENING;
    arrayOfSessionState[3] = OPENED;
    arrayOfSessionState[4] = OPENED_TOKEN_UPDATED;
    arrayOfSessionState[5] = CLOSED_LOGIN_FAILED;
    arrayOfSessionState[6] = CLOSED;
  }

  private SessionState(SessionState.Category paramCategory)
  {
    this.category = paramCategory;
  }

  public final boolean isClosed()
  {
    return this.category == SessionState.Category.CLOSED_CATEGORY;
  }

  public final boolean isOpened()
  {
    return this.category == SessionState.Category.OPENED_CATEGORY;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.SessionState
 * JD-Core Version:    0.6.2
 */