package android.support.v7.widget;

import android.view.View;
import java.util.List;

final class y
{
  boolean a = true;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h = 0;
  boolean i = false;
  List<be> j = null;

  final View a(aw paramaw)
  {
    int m;
    int n;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i2;
    if (this.j != null)
    {
      int k = this.j.size();
      m = 2147483647;
      n = 0;
      localObject1 = null;
      if (n < k)
      {
        localObject2 = (be)this.j.get(n);
        if ((!this.i) && (((be)localObject2).l()))
          break label175;
        int i1 = (((be)localObject2).c() - this.d) * this.e;
        if ((i1 < 0) || (i1 >= m))
          break label175;
        if (i1 == 0)
          break label124;
        localObject3 = localObject2;
        i2 = i1;
      }
    }
    while (true)
    {
      n++;
      localObject1 = localObject3;
      m = i2;
      break;
      localObject2 = localObject1;
      label124: if (localObject2 != null)
      {
        this.d = (((be)localObject2).c() + this.e);
        return ((be)localObject2).a;
      }
      return null;
      View localView = paramaw.b(this.d);
      this.d += this.e;
      return localView;
      label175: i2 = m;
      localObject3 = localObject1;
    }
  }

  final boolean a(bb parambb)
  {
    return (this.d >= 0) && (this.d < parambb.e());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.y
 * JD-Core Version:    0.6.2
 */