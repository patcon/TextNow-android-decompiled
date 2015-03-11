package com.enflick.android.TextNow.api;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.t.b;
import textnow.t.d;
import textnow.t.g;

@b(a="POST")
@d(a="sessions/facebook")
@g(a="Lcom/enflick/android/TextNow/api/responsemodel/Session;")
public class FacebookSessionPost extends TNHttpCommand
{
  public FacebookSessionPost(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.FacebookSessionPost
 * JD-Core Version:    0.6.2
 */