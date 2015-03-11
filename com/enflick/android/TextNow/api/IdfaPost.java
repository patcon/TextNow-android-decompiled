package com.enflick.android.TextNow.api;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.t.b;
import textnow.t.d;

@b(a="POST")
@d(a="metrics/idfa")
public class IdfaPost extends TNHttpCommand
{
  public IdfaPost(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.IdfaPost
 * JD-Core Version:    0.6.2
 */