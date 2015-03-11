package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.y.b;
import textnow.y.d;

@b(a="PUT")
@d(a="users/{0}/phone/voice/forward")
public class UsersPhoneVoiceForwardPut extends TNHttpCommand
{
  public UsersPhoneVoiceForwardPut(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.UsersPhoneVoiceForwardPut
 * JD-Core Version:    0.6.2
 */