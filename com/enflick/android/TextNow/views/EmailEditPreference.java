package com.enflick.android.TextNow.views;

import android.content.Context;
import android.util.AttributeSet;
import textnow.z.u;

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
      if ((!a(2131296476)) && (!a(toString(), 2131296474, 256)) && (b(2131296475)));
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
        {
          a(d.c);
          a(false);
        }
        return;
      }
    }
    a(d.c);
    a(false);
  }

  public final boolean h()
  {
    return !new u(getContext()).e().equalsIgnoreCase(toString());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.EmailEditPreference
 * JD-Core Version:    0.6.2
 */