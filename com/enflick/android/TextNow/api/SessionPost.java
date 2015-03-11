package com.enflick.android.TextNow.api;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.y.b;
import textnow.y.d;
import textnow.y.g;

@b(a="POST")
@d(a="sessions")
@g(a="Lcom/enflick/android/TextNow/api/responsemodel/Session;")
public class SessionPost extends TNHttpCommand
{
  public SessionPost(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.SessionPost
 * JD-Core Version:    0.6.2
 */