package com.enflick.android.TextNow.views;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
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
  private View c;
  private View d;
  private EmoticonPanel e;
  private b f;

  public AttachmentsPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (!isInEditMode())
      LayoutInflater.from(paramContext).inflate(2130903070, this);
  }

  public final void a()
  {
    if (this.e != null)
      this.e.d();
  }

  public final void a(b paramb)
  {
    this.f = paramb;
    this.e.a(this.f);
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165290:
      this.f.a(0);
      return;
    case 2131165291:
      this.f.a(1);
      return;
    case 2131165292:
      String[] arrayOfString = new String[2];
      arrayOfString[0] = getResources().getString(2131493151);
      arrayOfString[1] = getResources().getString(2131493152);
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(getContext());
      localBuilder.setItems(arrayOfString, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          switch (paramAnonymousInt)
          {
          default:
            return;
          case 0:
            AttachmentsPanel.a(AttachmentsPanel.this).a(0);
            return;
          case 1:
          }
          AttachmentsPanel.a(AttachmentsPanel.this).a(1);
        }
      }).setTitle(getResources().getString(2131493150));
      localBuilder.create().show();
      return;
    case 2131165293:
    }
    this.f.a(2);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (!isInEditMode())
    {
      this.a = findViewById(2131165290);
      this.b = findViewById(2131165291);
      this.d = findViewById(2131165293);
      this.c = findViewById(2131165292);
      this.a.setOnClickListener(this);
      this.b.setOnClickListener(this);
      this.d.setOnClickListener(this);
      this.c.setOnClickListener(this);
      this.d.setVisibility(8);
      this.c.setVisibility(8);
      this.e = ((EmoticonPanel)findViewById(2131165294));
      this.e.a(true);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.AttachmentsPanel
 * JD-Core Version:    0.6.2
 */