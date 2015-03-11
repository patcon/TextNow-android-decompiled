package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class StaggeredGridLayoutManager$LazySpanLookup
{
  int[] a;
  int b;
  List<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> c;

  final int a(int paramInt)
  {
    if (this.c != null)
      for (int i = -1 + this.c.size(); i >= 0; i--)
        if (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.c.get(i)).a >= paramInt)
          this.c.remove(i);
    return b(paramInt);
  }

  public final StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem a(int paramInt1, int paramInt2, int paramInt3)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem;
    if (this.c == null)
    {
      localFullSpanItem = null;
      return localFullSpanItem;
    }
    for (int i = 0; ; i++)
    {
      if (i >= this.c.size())
        break label85;
      localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.c.get(i);
      if (localFullSpanItem.a >= paramInt2)
        return null;
      if ((localFullSpanItem.a >= paramInt1) && ((paramInt3 == 0) || (localFullSpanItem.b == paramInt3)))
        break;
    }
    label85: return null;
  }

  final void a()
  {
    if (this.a != null)
      Arrays.fill(this.a, -1);
    this.c = null;
  }

  final void a(int paramInt1, int paramInt2)
  {
    if ((this.a == null) || (paramInt1 >= this.a.length));
    do
    {
      return;
      c(paramInt1 + paramInt2);
      System.arraycopy(this.a, paramInt1 + paramInt2, this.a, paramInt1, this.a.length - paramInt1 - paramInt2);
      Arrays.fill(this.a, this.a.length - paramInt2, this.a.length, -1);
    }
    while (this.c == null);
    int i = paramInt1 + paramInt2;
    int j = -1 + this.c.size();
    label92: StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem;
    if (j >= 0)
    {
      localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.c.get(j);
      if (localFullSpanItem.a >= paramInt1)
      {
        if (localFullSpanItem.a >= i)
          break label149;
        this.c.remove(j);
      }
    }
    while (true)
    {
      j--;
      break label92;
      break;
      label149: localFullSpanItem.a -= paramInt2;
    }
  }

  public final void a(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem paramFullSpanItem)
  {
    if (this.c == null)
      this.c = new ArrayList();
    int i = this.c.size();
    for (int j = 0; j < i; j++)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.c.get(j);
      if (localFullSpanItem.a == paramFullSpanItem.a)
        this.c.remove(j);
      if (localFullSpanItem.a >= paramFullSpanItem.a)
      {
        this.c.add(j, paramFullSpanItem);
        return;
      }
    }
    this.c.add(paramFullSpanItem);
  }

  final int b(int paramInt)
  {
    if (this.a == null)
      return -1;
    if (paramInt >= this.a.length)
      return -1;
    int k;
    if (this.c != null)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem1 = d(paramInt);
      if (localFullSpanItem1 != null)
        this.c.remove(localFullSpanItem1);
      int j = this.c.size();
      k = 0;
      if (k >= j)
        break label182;
      if (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.c.get(k)).a < paramInt);
    }
    while (true)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem2;
      if (k != -1)
      {
        localFullSpanItem2 = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.c.get(k);
        this.c.remove(k);
      }
      for (int i = localFullSpanItem2.a; ; i = -1)
      {
        if (i != -1)
          break label166;
        Arrays.fill(this.a, paramInt, this.a.length, -1);
        return this.a.length;
        k++;
        break;
      }
      label166: Arrays.fill(this.a, paramInt, i + 1, -1);
      return i + 1;
      label182: k = -1;
    }
  }

  final void b(int paramInt1, int paramInt2)
  {
    if ((this.a == null) || (paramInt1 >= this.a.length));
    while (true)
    {
      return;
      c(paramInt1 + paramInt2);
      System.arraycopy(this.a, paramInt1, this.a, paramInt1 + paramInt2, this.a.length - paramInt1 - paramInt2);
      Arrays.fill(this.a, paramInt1, paramInt1 + paramInt2, -1);
      if (this.c != null)
        for (int i = -1 + this.c.size(); i >= 0; i--)
        {
          StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.c.get(i);
          if (localFullSpanItem.a >= paramInt1)
            localFullSpanItem.a = (paramInt2 + localFullSpanItem.a);
        }
    }
  }

  final void c(int paramInt)
  {
    if (this.a == null)
    {
      this.a = new int[1 + Math.max(paramInt, 10)];
      Arrays.fill(this.a, -1);
    }
    while (paramInt < this.a.length)
      return;
    int[] arrayOfInt = this.a;
    int i = this.a.length;
    while (i <= paramInt)
      i *= 2;
    if (i > this.b)
      i = this.b;
    this.a = new int[i];
    System.arraycopy(arrayOfInt, 0, this.a, 0, arrayOfInt.length);
    Arrays.fill(this.a, arrayOfInt.length, this.a.length, -1);
  }

  public final StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem d(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem;
    if (this.c == null)
    {
      localFullSpanItem = null;
      return localFullSpanItem;
    }
    for (int i = -1 + this.c.size(); ; i--)
    {
      if (i < 0)
        break label55;
      localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.c.get(i);
      if (localFullSpanItem.a == paramInt)
        break;
    }
    label55: return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager.LazySpanLookup
 * JD-Core Version:    0.6.2
 */