package com.enflick.android.TextNow.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.enflick.android.TextNow.views.emoticons.EmoticonPanel;

public class AttachmentsPanel extends LinearLayout
  implements View.OnClickListener
{
  private View a;
  private View b;
  private EmoticonPanel c;
  private b d;

  public AttachmentsPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (!isInEditMode())
      LayoutInflater.from(paramContext).inflate(2130903074, this);
  }

  public final void a()
  {
    if (this.c != null)
      this.c.d();
  }

  public final void a(b paramb)
  {
    this.d = paramb;
    this.c.a(this.d);
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131558526:
      this.d.a(0);
      return;
    case 2131558527:
    }
    this.d.a(1);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (!isInEditMode())
    {
      this.a = findViewById(2131558526);
      this.b = findViewById(2131558527);
      this.a.setOnClickListener(this);
      this.b.setOnClickListener(this);
      this.c = ((EmoticonPanel)findViewById(2131558528));
      this.c.a(true);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.AttachmentsPanel
 * JD-Core Version:    0.6.2
 */