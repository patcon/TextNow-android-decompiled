package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class f extends BaseAdapter
  implements j, Filterable
{
  protected boolean a;
  protected boolean b;
  protected Cursor c;
  protected Context d;
  protected int e;
  protected g f;
  protected DataSetObserver g;
  protected i h;
  protected FilterQueryProvider i;

  public f(Context paramContext, Cursor paramCursor, int paramInt)
  {
    a(paramContext, paramCursor, paramInt);
  }

  public f(Context paramContext, Cursor paramCursor, boolean paramBoolean)
  {
    a(paramContext, paramCursor, 1);
  }

  private void a(Context paramContext, Cursor paramCursor, int paramInt)
  {
    int j = 1;
    label25: int k;
    if ((paramInt & 0x1) == j)
    {
      paramInt |= 2;
      this.b = j;
      if (paramCursor == null)
        break label142;
      this.c = paramCursor;
      this.a = j;
      this.d = paramContext;
      if (j == 0)
        break label148;
      k = paramCursor.getColumnIndexOrThrow("_id");
      label56: this.e = k;
      if ((paramInt & 0x2) != 2)
        break label154;
      this.f = new g(this);
    }
    for (this.g = new h(this, (byte)0); ; this.g = null)
    {
      if (j != 0)
      {
        if (this.f != null)
          paramCursor.registerContentObserver(this.f);
        if (this.g != null)
          paramCursor.registerDataSetObserver(this.g);
      }
      return;
      this.b = false;
      break;
      label142: j = 0;
      break label25;
      label148: k = -1;
      break label56;
      label154: this.f = null;
    }
  }

  public final Cursor a()
  {
    return this.c;
  }

  public Cursor a(CharSequence paramCharSequence)
  {
    if (this.i != null)
      return this.i.runQuery(paramCharSequence);
    return this.c;
  }

  public abstract View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);

  public void a(Cursor paramCursor)
  {
    Cursor localCursor = b(paramCursor);
    if (localCursor != null)
      localCursor.close();
  }

  public abstract void a(View paramView, Context paramContext, Cursor paramCursor);

  public final void a(FilterQueryProvider paramFilterQueryProvider)
  {
    this.i = paramFilterQueryProvider;
  }

  public Cursor b(Cursor paramCursor)
  {
    if (paramCursor == this.c)
      return null;
    Cursor localCursor = this.c;
    if (localCursor != null)
    {
      if (this.f != null)
        localCursor.unregisterContentObserver(this.f);
      if (this.g != null)
        localCursor.unregisterDataSetObserver(this.g);
    }
    this.c = paramCursor;
    if (paramCursor != null)
    {
      if (this.f != null)
        paramCursor.registerContentObserver(this.f);
      if (this.g != null)
        paramCursor.registerDataSetObserver(this.g);
      this.e = paramCursor.getColumnIndexOrThrow("_id");
      this.a = true;
      notifyDataSetChanged();
      return localCursor;
    }
    this.e = -1;
    this.a = false;
    notifyDataSetInvalidated();
    return localCursor;
  }

  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return a(paramContext, paramCursor, paramViewGroup);
  }

  protected final void b()
  {
    if ((this.b) && (this.c != null) && (!this.c.isClosed()))
      this.a = this.c.requery();
  }

  public CharSequence c(Cursor paramCursor)
  {
    if (paramCursor == null)
      return "";
    return paramCursor.toString();
  }

  public int getCount()
  {
    if ((this.a) && (this.c != null))
      return this.c.getCount();
    return 0;
  }

  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.a)
    {
      this.c.moveToPosition(paramInt);
      if (paramView == null)
        paramView = b(this.d, this.c, paramViewGroup);
      a(paramView, this.d, this.c);
      return paramView;
    }
    return null;
  }

  public Filter getFilter()
  {
    if (this.h == null)
      this.h = new i(this);
    return this.h;
  }

  public Object getItem(int paramInt)
  {
    if ((this.a) && (this.c != null))
    {
      this.c.moveToPosition(paramInt);
      return this.c;
    }
    return null;
  }

  public long getItemId(int paramInt)
  {
    long l = 0L;
    if ((this.a) && (this.c != null) && (this.c.moveToPosition(paramInt)))
      l = this.c.getLong(this.e);
    return l;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!this.a)
      throw new IllegalStateException("this should only be called when the cursor is valid");
    if (!this.c.moveToPosition(paramInt))
      throw new IllegalStateException("couldn't move cursor to position " + paramInt);
    if (paramView == null)
      paramView = a(this.d, this.c, paramViewGroup);
    a(paramView, this.d, this.c);
    return paramView;
  }

  public boolean hasStableIds()
  {
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.f
 * JD-Core Version:    0.6.2
 */