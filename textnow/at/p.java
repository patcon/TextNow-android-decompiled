package textnow.at;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

final class p extends Handler
{
  public final void handleMessage(Message paramMessage)
  {
    ArrayList localArrayList1 = (ArrayList)o.g().get();
    ArrayList localArrayList2 = (ArrayList)o.h().get();
    ArrayList localArrayList5;
    int i;
    switch (paramMessage.what)
    {
    default:
      return;
    case 0:
      localArrayList5 = (ArrayList)o.i().get();
      if ((localArrayList1.size() > 0) || (localArrayList2.size() > 0))
        i = 0;
      break;
    case 1:
    }
    while (true)
      if (localArrayList5.size() > 0)
      {
        ArrayList localArrayList6 = (ArrayList)localArrayList5.clone();
        localArrayList5.clear();
        int i5 = localArrayList6.size();
        int i6 = 0;
        if (i6 < i5)
        {
          o localo4 = (o)localArrayList6.get(i6);
          if (o.a(localo4) == 0L)
            o.b(localo4);
          while (true)
          {
            i6++;
            break;
            localArrayList2.add(localo4);
          }
          i = 1;
        }
      }
      else
      {
        long l = AnimationUtils.currentAnimationTimeMillis();
        ArrayList localArrayList3 = (ArrayList)o.j().get();
        ArrayList localArrayList4 = (ArrayList)o.k().get();
        int j = localArrayList2.size();
        for (int k = 0; k < j; k++)
        {
          o localo3 = (o)localArrayList2.get(k);
          if (o.a(localo3, l))
            localArrayList3.add(localo3);
        }
        int m = localArrayList3.size();
        if (m > 0)
        {
          for (int i4 = 0; i4 < m; i4++)
          {
            o localo2 = (o)localArrayList3.get(i4);
            o.b(localo2);
            o.a(localo2, true);
            localArrayList2.remove(localo2);
          }
          localArrayList3.clear();
        }
        int n = localArrayList1.size();
        int i1 = 0;
        int i2 = n;
        while (i1 < i2)
        {
          o localo1 = (o)localArrayList1.get(i1);
          if (localo1.c(l))
            localArrayList4.add(localo1);
          if (localArrayList1.size() == i2)
          {
            i1++;
          }
          else
          {
            i2--;
            localArrayList4.remove(localo1);
          }
        }
        if (localArrayList4.size() > 0)
        {
          for (int i3 = 0; i3 < localArrayList4.size(); i3++)
            o.c((o)localArrayList4.get(i3));
          localArrayList4.clear();
        }
        if ((i == 0) || ((localArrayList1.isEmpty()) && (localArrayList2.isEmpty())))
          break;
        sendEmptyMessageDelayed(1, Math.max(0L, o.l() - (AnimationUtils.currentAnimationTimeMillis() - l)));
        return;
        i = 1;
      }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.at.p
 * JD-Core Version:    0.6.2
 */