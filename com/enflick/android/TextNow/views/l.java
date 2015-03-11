package com.enflick.android.TextNow.views;

import android.text.Spannable;
import android.text.Spanned;
import android.widget.MultiAutoCompleteTextView.Tokenizer;

public final class l
  implements MultiAutoCompleteTextView.Tokenizer
{
  public final int findTokenEnd(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    if ((paramCharSequence instanceof Spanned))
    {
      Spanned localSpanned = (Spanned)paramCharSequence;
      for (int j = paramInt; j < i; j++)
        if (((k[])localSpanned.getSpans(j, j + 1, k.class)).length > 0)
          return j;
    }
    return i;
  }

  public final int findTokenStart(CharSequence paramCharSequence, int paramInt)
  {
    int j;
    int i;
    if ((paramCharSequence instanceof Spannable))
    {
      Spannable localSpannable = (Spannable)paramCharSequence;
      j = paramInt;
      while ((j > 0) && (((k[])localSpannable.getSpans(j - 1, j, k.class)).length == 0))
      {
        j--;
        continue;
        while ((i < paramInt) && (paramCharSequence.charAt(i) == ' '))
          i++;
      }
    }
    while (true)
      if ((i > 0) && (paramCharSequence.charAt(i - 1) != ' '))
      {
        i--;
      }
      else
      {
        return i;
        i = j;
        break;
        i = paramInt;
      }
  }

  public final CharSequence terminateToken(CharSequence paramCharSequence)
  {
    return paramCharSequence;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.l
 * JD-Core Version:    0.6.2
 */