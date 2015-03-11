package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.t.b;
import textnow.t.d;
import textnow.t.g;

@b(a="DELETE")
@d(a="users/{0}/messages/{1}")
@g(a="Ljava/lang/String;")
public class MessagesDelete extends TNHttpCommand
{
  public MessagesDelete(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.MessagesDelete
 * JD-Core Version:    0.6.2
 */