package com.enflick.android.TextNow.views.emoticons;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class EmoticonTable extends LinearLayout
{
  private e a;
  private LayoutInflater b;
  private ImageView c;
  private int d;
  private ArrayList<a> e = new ArrayList();
  private AttributeSet f;

  public EmoticonTable(Context paramContext)
  {
    super(paramContext);
    this.f = null;
    this.b = LayoutInflater.from(paramContext);
    this.b.inflate(2130903117, this);
  }

  public EmoticonTable(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.f = paramAttributeSet;
    this.b = LayoutInflater.from(paramContext);
    this.b.inflate(2130903117, this);
  }

  public final void a(e parame)
  {
    this.a = parame;
  }

  public final void a(ArrayList<a> paramArrayList, int paramInt, boolean paramBoolean)
  {
    setTag(Integer.valueOf(paramInt));
    if (paramBoolean);
    for (int i = 5; ; i = 10)
    {
      this.d = i;
      if (paramArrayList.size() - paramInt * this.d < this.d)
        this.d = (paramArrayList.size() - paramInt * this.d);
      for (int j = 0; j < this.d; j++)
        this.e.add(paramArrayList.get(j + paramInt * i));
    }
    for (int k = 0; ; k++)
    {
      int m;
      int n;
      if (paramBoolean)
      {
        m = 1;
        if (k >= m)
          break;
        findViewWithTag("row" + k);
        n = 0;
        label143: if (n >= 5)
          continue;
        final int i1 = n + k * 5;
        this.c = ((ImageView)findViewWithTag(String.valueOf(i1)));
        this.c.setVisibility(0);
        if (i1 >= this.d)
          break label279;
        this.c.setImageBitmap(BitmapFactory.decodeResource(getContext().getResources(), ((a)this.e.get(i1)).a()));
        this.c.setTag(((a)this.e.get(i1)).b());
        this.c.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            EmoticonTable.b(EmoticonTable.this).a((a)EmoticonTable.a(EmoticonTable.this).get(i1));
          }
        });
      }
      while (true)
      {
        n++;
        break label143;
        m = 2;
        break;
        label279: this.c.setImageResource(2130837859);
        this.c.setFocusable(false);
        this.c.setBackgroundDrawable(null);
        this.c.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
          }
        });
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.emoticons.EmoticonTable
 * JD-Core Version:    0.6.2
 */