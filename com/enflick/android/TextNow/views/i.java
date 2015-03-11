package com.enflick.android.TextNow.views;

import android.text.Editable;
import android.text.Selection;
import android.text.style.ClickableSpan;
import android.view.View;

public class i extends ClickableSpan
{
  public void onClick(View paramView)
  {
    if ((paramView instanceof RecipientField))
    {
      Editable localEditable = ((RecipientField)paramView).getEditableText();
      int i = localEditable.getSpanStart(this);
      for (int j = localEditable.getSpanEnd(this); (j < localEditable.length()) && (localEditable.charAt(j) == ' '); j++);
      localEditable.replace(i, j, "");
      Selection.setSelection(localEditable, localEditable.length());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.i
 * JD-Core Version:    0.6.2
 */