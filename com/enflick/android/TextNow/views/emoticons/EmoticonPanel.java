package com.enflick.android.TextNow.views.emoticons;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import com.enflick.android.TextNow.views.IndicatedViewFlipper;
import com.enflick.android.TextNow.views.PageIndicator;
import java.util.ArrayList;

public class EmoticonPanel extends IndicatedViewFlipper
{
  private Context b;
  private c c;
  private ArrayList<EmoticonTable> d = new ArrayList();
  private ArrayList<a> e;
  private int f = 10;
  private boolean g = false;
  private e h = new e()
  {
    public final void a(a paramAnonymousa)
    {
      EmoticonPanel.a(EmoticonPanel.this).a(paramAnonymousa);
    }
  };

  public EmoticonPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b = paramContext;
    this.e = d.a(paramContext.getApplicationContext()).a();
    setPadding(0, getPaddingTop(), 0, getPaddingBottom());
  }

  public final void a(c paramc)
  {
    this.c = paramc;
  }

  public final void a(boolean paramBoolean)
  {
    int i = 1;
    b(paramBoolean);
    boolean bool;
    if (getContext().getResources().getConfiguration().orientation == 2)
    {
      bool = i;
      this.g = bool;
      if (!this.g)
        break label163;
    }
    int k;
    label163: for (int j = 5; ; j = 10)
    {
      this.f = j;
      k = this.e.size() / this.f;
      if (this.e.size() % this.f != 0)
        k++;
      for (int m = 0; m < k; m++)
      {
        EmoticonTable localEmoticonTable = new EmoticonTable(this.b);
        localEmoticonTable.a(this.e, m, this.g);
        localEmoticonTable.setVisibility(8);
        localEmoticonTable.a(this.h);
        this.d.add(localEmoticonTable);
        b().addView(localEmoticonTable);
      }
      bool = false;
      break;
    }
    if (k > i)
    {
      c().setVisibility(0);
      while (i < k)
      {
        c().c();
        i++;
      }
      c().b(0);
      return;
    }
    c().setVisibility(8);
  }

  public final void d()
  {
    this.d.clear();
    b().removeAllViews();
    ImageView localImageView = (ImageView)c().findViewWithTag("page0");
    c().b();
    c().a(localImageView);
    c().a(0);
    a(a());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.emoticons.EmoticonPanel
 * JD-Core Version:    0.6.2
 */