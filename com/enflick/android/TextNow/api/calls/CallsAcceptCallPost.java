package com.enflick.android.TextNow.api.calls;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.t.b;
import textnow.t.d;

@b(a="POST")
@d(a="calls/{0}/acceptCall")
public class CallsAcceptCallPost extends TNHttpCommand
{
  public CallsAcceptCallPost(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.calls.CallsAcceptCallPost
 * JD-Core Version:    0.6.2
 */