package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.t.b;
import textnow.t.d;
import textnow.t.g;

@b(a="POST")
@d(a="users/suggestions")
@g(a="Lcom/enflick/android/TextNow/api/responsemodel/Suggestion;")
public class SuggestionsPost extends TNHttpCommand
{
  public SuggestionsPost(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.SuggestionsPost
 * JD-Core Version:    0.6.2
 */