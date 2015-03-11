package com.enflick.android.TextNow.views;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;
import textnow.q.b;

public class LinkifiedTextView extends TextView
{
  public LinkifiedTextView(Context paramContext)
  {
    super(paramContext);
  }

  public LinkifiedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public LinkifiedTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      Editable localEditable;
      do
      {
        Log.getStackTraceString(localArrayIndexOutOfBoundsException);
        localEditable = getEditableText();
      }
      while (localEditable == null);
      localEditable.clearSpans();
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    CharSequence localCharSequence = getText();
    if ((localCharSequence instanceof Spanned))
    {
      Spannable localSpannable = (Spannable)localCharSequence;
      int i = paramMotionEvent.getAction();
      if ((i == 1) || (i == 0))
      {
        int j = (int)paramMotionEvent.getX();
        int k = (int)paramMotionEvent.getY();
        int m = j - getTotalPaddingLeft();
        int n = k - getTotalPaddingTop();
        int i1 = m + getScrollX();
        int i2 = n + getScrollY();
        Layout localLayout = getLayout();
        int i3 = localLayout.getOffsetForHorizontal(localLayout.getLineForVertical(i2), i1);
        ClickableSpan[] arrayOfClickableSpan = (ClickableSpan[])localSpannable.getSpans(i3, i3, ClickableSpan.class);
        if (arrayOfClickableSpan.length != 0)
        {
          if (i == 1);
          while (true)
          {
            Context localContext;
            try
            {
              arrayOfClickableSpan[0].onClick(this);
              return true;
            }
            catch (ActivityNotFoundException localActivityNotFoundException)
            {
              localContext = getContext();
              new StringBuilder().append("No activity could respond to this intent: ").append(localCharSequence.toString()).toString();
              if (!b.a(localCharSequence.toString()));
            }
            for (String str = localContext.getResources().getString(2131493161); ; str = localContext.getResources().getString(2131493025))
            {
              Toast.makeText(localContext, str, 0).show();
              break;
            }
            if (i == 0)
              Selection.setSelection(localSpannable, localSpannable.getSpanStart(arrayOfClickableSpan[0]), localSpannable.getSpanEnd(arrayOfClickableSpan[0]));
          }
        }
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.LinkifiedTextView
 * JD-Core Version:    0.6.2
 */