package textnow.p;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.content.j;
import android.support.v4.view.ak;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import textnow.z.e;

public final class i extends ak
  implements aa<Cursor>
{
  private String[] a;
  private Context b;
  private ListView c;
  private ListView d;
  private g e;
  private g f;

  public i(Context paramContext, ListView paramListView1, ListView paramListView2)
  {
    this.b = paramContext;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramContext.getString(2131296989);
    arrayOfString[1] = paramContext.getString(2131296990);
    this.a = arrayOfString;
    this.e = new g(paramContext);
    this.f = new g(paramContext);
    this.c = paramListView1;
    this.c.setAdapter(this.e);
    this.c.setDividerHeight(0);
    this.c.setDivider(null);
    this.c.setOnItemClickListener(this.e);
    this.d = paramListView2;
    this.d.setAdapter(this.f);
    this.d.setDividerHeight(0);
    this.d.setDivider(null);
    this.d.setOnItemClickListener(this.f);
  }

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramInt == 0)
    {
      paramViewGroup.addView(this.c, 0);
      return this.c;
    }
    paramViewGroup.addView(this.d, 0);
    return this.d;
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup.removeView((View)paramObject);
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }

  public final int b()
  {
    return 2;
  }

  public final CharSequence b(int paramInt)
  {
    return this.a[paramInt];
  }

  public final j<Cursor> onCreateLoader(int paramInt, Bundle paramBundle)
  {
    int i = 1;
    Context localContext = this.b;
    if (paramInt == i);
    while (true)
    {
      return e.a(localContext, null, i);
      i = 0;
    }
  }

  public final void onLoaderReset(j<Cursor> paramj)
  {
    switch (paramj.getId())
    {
    default:
      return;
    case 0:
      this.e.b(null);
      return;
    case 1:
    }
    this.f.b(null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.i
 * JD-Core Version:    0.6.2
 */