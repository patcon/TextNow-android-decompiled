package com.enflick.android.TextNow.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView.Tokenizer;
import android.widget.TextView;
import java.util.Locale;
import textnow.v.b;
import textnow.v.y;
import textnow.v.z;
import textnow.z.f;

public class RecipientField extends ExtendedEditText
{
  private TextView a;
  private TextWatcher b;
  private EditText c;
  private i d;

  public RecipientField(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }

  public RecipientField(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }

  public RecipientField(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    this.c = this;
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        int i = RecipientField.a(RecipientField.this).getSelectionStart();
        ClickableSpan[] arrayOfClickableSpan = (ClickableSpan[])RecipientField.a(RecipientField.this).getText().getSpans(i, i, ClickableSpan.class);
        if (arrayOfClickableSpan.length != 0)
          arrayOfClickableSpan[(-1 + arrayOfClickableSpan.length)].onClick(paramAnonymousView);
      }
    });
    if (!isInEditMode())
    {
      this.a = new TextView(paramContext);
      this.a.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      this.a.setGravity(17);
      this.a.setTextSize(2, 14.0F);
      this.a.setTextColor(paramContext.getResources().getColor(2131230803));
      int j = y.b(paramContext, 2130772068);
      Drawable localDrawable = paramContext.getResources().getDrawable(2130837568);
      localDrawable.mutate().setColorFilter(j, PorterDuff.Mode.MULTIPLY);
      this.a.setBackgroundDrawable(localDrawable);
      this.a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130837921, 0);
      this.a.setCompoundDrawablePadding(z.a(paramContext, 4));
    }
    int i = z.b(paramContext);
    if (i < 400)
    {
      setMaxLines(1);
      return;
    }
    if (i < 800)
    {
      setMaxLines(2);
      return;
    }
    setMaxLines(3);
  }

  public final i a()
  {
    return this.d;
  }

  public final void a(TextWatcher paramTextWatcher)
  {
    if (this.b != null)
      removeTextChangedListener(this.b);
    this.b = paramTextWatcher;
    addTextChangedListener(this.b);
  }

  public final void a(MultiAutoCompleteTextView.Tokenizer paramTokenizer)
  {
    int i = 3;
    Editable localEditable = getText();
    int j = getSelectionEnd();
    String str1 = TextUtils.substring(localEditable, paramTokenizer.findTokenStart(getText(), j), j);
    String str2;
    if (str1.length() > 0)
    {
      if (!str1.contains("@"))
        break label111;
      if (!str1.toLowerCase(Locale.US).endsWith("@textnow.me"))
        break label104;
      str2 = str1.substring(0, str1.indexOf("@"));
      i = 1;
    }
    while (true)
    {
      a(new f(str2, i, str1, null, true), paramTokenizer);
      return;
      label104: str2 = str1;
      continue;
      label111: if (b.b(str1.charAt(0)))
      {
        str2 = str1 + "@textnow.me";
      }
      else
      {
        i = 2;
        str2 = str1;
      }
    }
  }

  public final void a(i parami)
  {
    this.d = parami;
  }

  public final void a(f paramf, MultiAutoCompleteTextView.Tokenizer paramTokenizer)
  {
    removeTextChangedListener(this.b);
    Editable localEditable = getEditableText();
    String str = paramf.g();
    if (str.length() >= 20)
      str = str.substring(0, 20) + "...";
    int i = getSelectionEnd();
    int j = paramTokenizer.findTokenStart(getText(), i);
    localEditable.replace(j, i, str);
    int k = getSelectionEnd();
    this.a.setText(str);
    TextView localTextView = this.a;
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    localTextView.measure(m, m);
    localTextView.layout(0, 0, localTextView.getMeasuredWidth(), localTextView.getMeasuredHeight());
    Canvas localCanvas = new Canvas(Bitmap.createBitmap(localTextView.getMeasuredWidth(), localTextView.getMeasuredHeight(), Bitmap.Config.ARGB_8888));
    localCanvas.translate(-localTextView.getScrollX(), -localTextView.getScrollY());
    localTextView.draw(localCanvas);
    localTextView.setDrawingCacheEnabled(true);
    Bitmap localBitmap = localTextView.getDrawingCache().copy(Bitmap.Config.ARGB_8888, true);
    localTextView.destroyDrawingCache();
    BitmapDrawable localBitmapDrawable = new BitmapDrawable(getResources(), localBitmap);
    localBitmapDrawable.setBounds(0, 0, localBitmapDrawable.getIntrinsicWidth(), localBitmapDrawable.getIntrinsicHeight());
    localEditable.setSpan(new k(localBitmapDrawable, paramf, 0), j, k, 33);
    localEditable.setSpan(new j(), j, k, 33);
    localEditable.insert(k, " ");
    addTextChangedListener(this.b);
    if (this.d != null)
      this.d.a(((k[])localEditable.getSpans(0, localEditable.length(), k.class)).length, false);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
    }
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.RecipientField
 * JD-Core Version:    0.6.2
 */