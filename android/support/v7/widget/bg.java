package android.support.v7.widget;

import android.view.View;

final class bg
{
  static int a(bb parambb, ak paramak, View paramView1, View paramView2, as paramas, boolean paramBoolean)
  {
    if ((paramas.k() == 0) || (parambb.e() == 0) || (paramView1 == null) || (paramView2 == null))
      return 0;
    if (!paramBoolean)
      return 1 + Math.abs(as.c(paramView1) - as.c(paramView2));
    int i = paramak.b(paramView2) - paramak.a(paramView1);
    return Math.min(paramak.f(), i);
  }

  static int a(bb parambb, ak paramak, View paramView1, View paramView2, as paramas, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = paramas.k();
    int j = 0;
    if (i != 0)
    {
      int k = parambb.e();
      j = 0;
      if (k != 0)
      {
        j = 0;
        if (paramView1 != null)
        {
          j = 0;
          if (paramView2 != null)
            break label46;
        }
      }
    }
    while (true)
    {
      return j;
      label46: int m = Math.min(as.c(paramView1), as.c(paramView2));
      int n = Math.max(as.c(paramView1), as.c(paramView2));
      if (paramBoolean2);
      for (j = Math.max(0, -1 + (parambb.e() - n)); paramBoolean1; j = Math.max(0, m - 1))
      {
        int i1 = Math.abs(paramak.b(paramView2) - paramak.a(paramView1));
        int i2 = 1 + Math.abs(as.c(paramView1) - as.c(paramView2));
        return Math.round(i1 / i2 * j + (paramak.c() - paramak.a(paramView1)));
      }
    }
  }

  static int b(bb parambb, ak paramak, View paramView1, View paramView2, as paramas, boolean paramBoolean)
  {
    if ((paramas.k() == 0) || (parambb.e() == 0) || (paramView1 == null) || (paramView2 == null))
      return 0;
    if (!paramBoolean)
      return parambb.e();
    int i = paramak.b(paramView2) - paramak.a(paramView1);
    int j = 1 + Math.abs(as.c(paramView1) - as.c(paramView2));
    return (int)(i / j * parambb.e());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bg
 * JD-Core Version:    0.6.2
 */