package com.enflick.android.TextNow.api;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.s.i;
import textnow.t.b;
import textnow.t.d;

@b(a="HEAD")
@d(a="emails/{0}")
public class EmailsHead extends TNHttpCommand
{
  public EmailsHead(Context paramContext)
  {
    super(paramContext);
  }

  public void handleError(i parami)
  {
    if (parami.d() != 404)
      super.handleError(parami);
  }

  public void handleSuccess(i parami)
  {
    super.handleSuccess(parami);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.EmailsHead
 * JD-Core Version:    0.6.2
 */