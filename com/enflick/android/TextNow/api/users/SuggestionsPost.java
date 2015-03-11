package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.y.b;
import textnow.y.d;
import textnow.y.g;

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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.SuggestionsPost
 * JD-Core Version:    0.6.2
 */