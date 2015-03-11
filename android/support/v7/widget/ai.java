package android.support.v7.widget;

import java.util.List;

final class ai
{
  final aj a;

  public ai(aj paramaj)
  {
    this.a = paramaj;
  }

  final void a(List<m> paramList)
  {
    int i;
    int j;
    label11: int k;
    label39: int m;
    m localm1;
    m localm2;
    int i4;
    while (true)
    {
      i = -1 + paramList.size();
      j = 0;
      if (i < 0)
        break label251;
      if (((m)paramList.get(i)).a != 3)
        break;
      if (j == 0)
        break label1222;
      k = i;
      if (k == -1)
        break label1179;
      m = k + 1;
      localm1 = (m)paramList.get(k);
      localm2 = (m)paramList.get(m);
      switch (localm2.a)
      {
      default:
        break;
      case 0:
        if (localm1.c >= localm2.b)
          break label1192;
        i4 = -1;
        label127: if (localm1.b < localm2.b)
          i4++;
        if (localm2.b <= localm1.b)
          localm1.b += localm2.c;
        if (localm2.b <= localm1.c)
          localm1.c += localm2.c;
        localm2.b = (i4 + localm2.b);
        paramList.set(k, localm2);
        paramList.set(m, localm1);
      case 1:
      case 2:
      }
    }
    label308: label1204: label1213: label1222: for (int i5 = 1; ; i5 = j)
    {
      i--;
      j = i5;
      break label11;
      label251: k = -1;
      break label39;
      int i1;
      int i2;
      if (localm1.b < localm1.c)
      {
        if ((localm2.b != localm1.b) || (localm2.c != localm1.c - localm1.b))
          break label1213;
        i1 = 0;
        i2 = 1;
      }
      while (true)
      {
        label333: m localm3;
        if (localm1.c < localm2.b)
        {
          localm2.b = (-1 + localm2.b);
          if (localm1.b > localm2.b)
            break label517;
          localm2.b = (1 + localm2.b);
          localm3 = null;
        }
        while (true)
        {
          if (i2 != 0)
          {
            paramList.set(k, localm2);
            paramList.remove(m);
            this.a.a(localm1);
            break;
            if ((localm2.b != 1 + localm1.c) || (localm2.c != localm1.b - localm1.c))
              break label1204;
            i1 = 1;
            i2 = 1;
            break label308;
            if (localm1.c >= localm2.b + localm2.c)
              break label333;
            localm2.c = (-1 + localm2.c);
            localm1.a = 1;
            localm1.c = 1;
            if (localm2.c != 0)
              break;
            paramList.remove(m);
            this.a.a(localm2);
            break;
            if (localm1.b >= localm2.b + localm2.c)
              break label1198;
            int i3 = localm2.b + localm2.c - localm1.b;
            localm3 = this.a.a(1, 1 + localm1.b, i3);
            localm2.c = (localm1.b - localm2.b);
            continue;
          }
          if (i1 != 0)
          {
            if (localm3 != null)
            {
              if (localm1.b > localm3.b)
                localm1.b -= localm3.c;
              if (localm1.c > localm3.b)
                localm1.c -= localm3.c;
            }
            if (localm1.b > localm2.b)
              localm1.b -= localm2.c;
            if (localm1.c > localm2.b)
              localm1.c -= localm2.c;
            label721: paramList.set(k, localm2);
            if (localm1.b == localm1.c)
              break label898;
            paramList.set(m, localm1);
          }
          while (localm3 != null)
          {
            paramList.add(k, localm3);
            break;
            if (localm3 != null)
            {
              if (localm1.b >= localm3.b)
                localm1.b -= localm3.c;
              if (localm1.c >= localm3.b)
                localm1.c -= localm3.c;
            }
            if (localm1.b >= localm2.b)
              localm1.b -= localm2.c;
            if (localm1.c < localm2.b)
              break label721;
            localm1.c -= localm2.c;
            break label721;
            paramList.remove(m);
          }
          Object localObject1;
          if (localm1.c < localm2.b)
          {
            localm2.b = (-1 + localm2.b);
            localObject1 = null;
          }
          while (true)
          {
            Object localObject2;
            if (localm1.b <= localm2.b)
            {
              localm2.b = (1 + localm2.b);
              localObject2 = null;
            }
            while (true)
            {
              label966: paramList.set(m, localm1);
              if (localm2.c > 0)
                paramList.set(k, localm2);
              while (true)
              {
                if (localObject1 != null)
                  paramList.add(k, localObject1);
                if (localObject2 == null)
                  break;
                paramList.add(k, localObject2);
                break;
                if (localm1.c >= localm2.b + localm2.c)
                  break label1186;
                localm2.c = (-1 + localm2.c);
                localObject1 = this.a.a(2, localm1.b, 1);
                break label938;
                if (localm1.b >= localm2.b + localm2.c)
                  break label1180;
                int n = localm2.b + localm2.c - localm1.b;
                localObject2 = this.a.a(2, 1 + localm1.b, n);
                localm2.c -= n;
                break label966;
                paramList.remove(k);
                this.a.a(localm2);
              }
              return;
              localObject2 = null;
            }
            localObject1 = null;
          }
          i4 = 0;
          break label127;
          localm3 = null;
        }
        i1 = 1;
        i2 = 0;
        continue;
        i1 = 0;
        i2 = 0;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ai
 * JD-Core Version:    0.6.2
 */