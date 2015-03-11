package textnow.p;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class u extends BaseAdapter
{
  protected ContentObserver a = new ContentObserver(new Handler())
  {
    public final boolean deliverSelfNotifications()
    {
      return true;
    }

    public final void onChange(boolean paramAnonymousBoolean)
    {
      u.a();
    }
  };
  protected DataSetObserver b = new DataSetObserver()
  {
    public final void onChanged()
    {
      u.this.notifyDataSetChanged();
    }

    public final void onInvalidated()
    {
      u.this.notifyDataSetInvalidated();
    }
  };
  private Context c;
  private Cursor d;
  private int e;
  private int f;
  private int g;
  private long[] h;
  private SparseIntArray i = new SparseIntArray();
  private int j;
  private int k;
  private int l;
  private v m = new v();

  public u(Context paramContext)
  {
    this.c = paramContext;
    b();
  }

  protected static void a()
  {
  }

  private void a(v paramv, int paramInt)
  {
    if (v.a(paramv) == paramInt)
      return;
    int n = this.j;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    if (n != -1)
    {
      if (paramInt > this.j)
        break label222;
      int i7 = this.i.indexOfKey(paramInt);
      if (i7 < 0)
      {
        i7 = -1 + (i7 ^ 0xFFFFFFFF);
        if (i7 >= this.i.size())
          i7--;
      }
      i1 = 0;
      i2 = 0;
      i3 = 0;
      if (i7 >= 0)
      {
        i3 = this.i.keyAt(i7);
        i1 = this.i.valueAt(i7);
        i2 = (int)(0xFFFFFFFF & this.h[i1]);
      }
    }
    while (i1 < this.g)
    {
      long l1 = this.h[i1];
      int i4 = (int)(0xFFFFFFFF & l1);
      int i5 = i3 + (i4 - i2);
      if (i1 > this.l)
      {
        this.i.append(i5, i1);
        this.j = i5;
        this.k = i4;
        this.l = i1;
      }
      if (paramInt < i5)
      {
        paramv.a = 0;
        paramv.c = (i4 - (i5 - paramInt));
        return;
        label222: i1 = this.l;
        i3 = this.j;
        i2 = this.k;
      }
      else
      {
        if ((0x0 & l1) != 0L);
        int i6;
        for (boolean bool = true; ; bool = false)
        {
          i6 = (int)((l1 & 0x0) >> 32);
          if (paramInt != i5)
            break;
          paramv.a = 1;
          v.b(paramv, i1);
          paramv.b = bool;
          paramv.d = i6;
          paramv.c = i4;
          return;
        }
        if (bool)
          if (paramInt < 1 + (i5 + i6))
          {
            paramv.a = 2;
            paramv.c = (-1 + (i4 + (paramInt - i5)));
            return;
          }
        for (i3 = i5 + (i6 + 1); ; i3 = i5 + 1)
        {
          i2 = i4 + i6;
          i1++;
          break;
        }
      }
    }
    paramv.a = 0;
    paramv.c = (i2 + (paramInt - i3));
  }

  private void b()
  {
    this.e = -1;
    this.j = -1;
    this.k = -1;
    this.l = -1;
    v.a(this.m, -1);
    this.i.clear();
  }

  protected abstract View a(Context paramContext, ViewGroup paramViewGroup);

  protected void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1;
    if (this.g >= this.h.length)
      i1 = 8 * (128 + this.h.length);
    for (int i2 = 4; ; i2++)
      if (i2 < 32)
      {
        if (i1 <= -12 + (1 << i2))
          i1 = -12 + (1 << i2);
      }
      else
      {
        long[] arrayOfLong2 = new long[i1 / 8];
        System.arraycopy(this.h, 0, arrayOfLong2, 0, this.g);
        this.h = arrayOfLong2;
        long l1 = paramInt2 << 32 | paramInt1;
        if (paramBoolean)
          l1 |= -9223372036854775808L;
        long[] arrayOfLong1 = this.h;
        int n = this.g;
        this.g = (n + 1);
        arrayOfLong1[n] = l1;
        return;
      }
  }

  protected abstract void a(Cursor paramCursor);

  protected abstract void a(View paramView, Cursor paramCursor);

  protected abstract void a(View paramView, Cursor paramCursor, int paramInt);

  protected abstract View b(Context paramContext, ViewGroup paramViewGroup);

  public final void b(Cursor paramCursor)
  {
    if (paramCursor == this.d)
      return;
    if (this.d != null);
    try
    {
      this.d.unregisterContentObserver(this.a);
    }
    catch (Exception localException1)
    {
      try
      {
        while (true)
        {
          this.d.unregisterDataSetObserver(this.b);
          this.d.close();
          this.d = paramCursor;
          b();
          this.g = 0;
          this.h = new long[16];
          if (this.d != null)
            a(this.d);
          if (this.d == null)
            break;
          this.d.registerContentObserver(this.a);
          this.d.registerDataSetObserver(this.b);
          this.f = this.d.getColumnIndexOrThrow("_id");
          notifyDataSetChanged();
          return;
          localException1 = localException1;
          localException1.printStackTrace();
        }
      }
      catch (Exception localException2)
      {
        while (true)
          localException2.printStackTrace();
        notifyDataSetInvalidated();
      }
    }
  }

  protected abstract void b(View paramView, Cursor paramCursor);

  protected abstract View c(Context paramContext, ViewGroup paramViewGroup);

  public int getCount()
  {
    if (this.d == null)
      return 0;
    if (this.e != -1)
      return this.e;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    if (n < this.g)
    {
      long l1 = this.h[n];
      int i3 = (int)(0xFFFFFFFF & l1);
      int i4;
      label67: int i5;
      int i6;
      if ((0x0 & l1) != 0L)
      {
        i4 = 1;
        i5 = (int)((l1 & 0x0) >> 32);
        i6 = i1 + (i3 - i2);
        if (i4 == 0)
          break label118;
      }
      label118: for (i1 = i6 + (i5 + 1); ; i1 = i6 + 1)
      {
        i2 = i3 + i5;
        n++;
        break;
        i4 = 0;
        break label67;
      }
    }
    this.e = (i1 + this.d.getCount() - i2);
    return this.e;
  }

  public Object getItem(int paramInt)
  {
    if (this.d == null);
    do
    {
      return null;
      a(this.m, paramInt);
    }
    while (!this.d.moveToPosition(this.m.c));
    return this.d;
  }

  public long getItemId(int paramInt)
  {
    if (getItem(paramInt) != null)
      return this.d.getLong(this.f);
    return -1L;
  }

  public int getItemViewType(int paramInt)
  {
    a(this.m, paramInt);
    return this.m.a;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    a(this.m, paramInt);
    if (paramView == null)
      switch (this.m.a)
      {
      default:
      case 0:
      case 1:
      case 2:
      }
    while (true)
    {
      this.d.moveToPosition(this.m.c);
      switch (this.m.a)
      {
      default:
        return paramView;
        paramView = a(this.c, paramViewGroup);
        continue;
        paramView = b(this.c, paramViewGroup);
        continue;
        paramView = c(this.c, paramViewGroup);
      case 0:
      case 1:
      case 2:
      }
    }
    a(paramView, this.d);
    return paramView;
    Cursor localCursor = this.d;
    int n = this.m.d;
    a(paramView, localCursor, n);
    return paramView;
    b(paramView, this.d);
    return paramView;
  }

  public int getViewTypeCount()
  {
    return 3;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.u
 * JD-Core Version:    0.6.2
 */