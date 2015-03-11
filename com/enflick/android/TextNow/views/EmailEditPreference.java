package com.enflick.android.TextNow.views;

import android.content.Context;
import android.util.AttributeSet;
import textnow.u.r;

public class EmailEditPreference extends EmailEditText
{
  public EmailEditPreference(Context paramContext)
  {
    super(paramContext);
  }

  public EmailEditPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void g()
  {
    if (h())
    {
      if ((!a(2131493069)) && (!a(toString(), 2131493067, 256)) && (b(2131493068)));
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
        {
          a(c.c);
          a(false);
        }
        return;
      }
    }
    a(c.c);
    a(false);
  }

  public final boolean h()
  {
    return !new r(getContext()).e().equalsIgnoreCase(toString());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.EmailEditPreference
 * JD-Core Version:    0.6.2
 */