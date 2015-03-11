package com.enflick.android.TextNow.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.text.TextUtils;
import android.util.AttributeSet;
import textnow.v.y;
import textnow.v.z;

public class AvatarView extends CircularImageView
{
  protected Paint a;
  private final String b = "AvatarView";
  private String c = "#";
  private boolean d = false;

  public AvatarView(Context paramContext)
  {
    super(paramContext);
    if (!isInEditMode())
      a(paramContext);
  }

  public AvatarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (!isInEditMode())
      a(paramContext);
  }

  private void a(Context paramContext)
  {
    this.a = new Paint();
    this.a.setTextSize(z.a(paramContext, 20));
    this.a.setTextAlign(Paint.Align.CENTER);
    this.a.setAntiAlias(true);
    this.a.setColor(y.b(paramContext, 2130772279));
  }

  public final void a(String paramString)
  {
    int i = 1;
    if (TextUtils.isEmpty(paramString))
      this.c = "#";
    while (true)
    {
      invalidate();
      return;
      if (paramString.length() == i)
      {
        this.c = paramString.toUpperCase();
      }
      else
      {
        if (!TextUtils.isEmpty(paramString))
        {
          char c1 = paramString.charAt(0);
          if ((paramString.contains("@")) || ((c1 != '+') && (c1 != '(') && (!Character.isDigit(c1))));
        }
        while (true)
        {
          if (i == 0)
            break label102;
          this.c = "#";
          break;
          i = 0;
        }
        label102: String str1 = "";
        for (String str2 : paramString.split(" "))
          if (!TextUtils.isEmpty(str2))
            str1 = str1 + str2.charAt(0);
        if (str1.length() > 2)
          str1 = str1.substring(0, 2);
        this.c = str1.toUpperCase();
      }
    }
  }

  public final void a(boolean paramBoolean, int paramInt)
  {
    this.d = paramBoolean;
    if (this.d)
    {
      this.a.setColor(-1);
      a(y.b(getContext(), 2130772068));
      this.c = ("" + paramInt);
      return;
    }
    this.a.setColor(y.b(getContext(), 2130772279));
    a(y.b(getContext(), 2130772245));
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (getDrawable() == null)
    {
      int i = getWidth() / 2;
      int j = (int)(getHeight() / 2 - (this.a.descent() + this.a.ascent()) / 2.0F);
      paramCanvas.drawText("" + this.c, i, j, this.a);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.AvatarView
 * JD-Core Version:    0.6.2
 */