package com.enflick.android.TextNow.activities.phone;

import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import textnow.z.e;

public final class f
{
  private final g a;

  public f(g paramg)
  {
    this.a = paramg;
  }

  private void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, false);
  }

  private static boolean a(String paramString)
  {
    return (paramString != null) && ((paramString.contains("@")) || (paramString.contains("%40")));
  }

  public final void a(Cursor paramCursor)
  {
    int i = paramCursor.getCount();
    if (i == 0);
    int k;
    label123: 
    do
    {
      return;
      paramCursor.moveToFirst();
      e locale1 = new e(paramCursor);
      String str1 = locale1.b();
      int j = locale1.e();
      Object localObject = str1;
      k = 1;
      int m = j;
      while (paramCursor.moveToNext())
      {
        e locale2 = new e(paramCursor);
        String str2 = locale2.b();
        int n = locale2.e();
        boolean bool;
        if ((a((String)localObject)) || (a(str2)))
          if ((localObject == null) || (str2 == null))
            if (localObject == str2)
            {
              bool = true;
              if ((!bool) || (m == 8) || (n == 8))
                break label186;
            }
        for (int i1 = 1; ; i1 = 0)
        {
          if (i1 == 0)
            break label192;
          k++;
          break;
          bool = false;
          break label123;
          bool = ((String)localObject).equalsIgnoreCase(str2);
          break label123;
          bool = PhoneNumberUtils.compare((String)localObject, str2);
          break label123;
        }
        if (k > 1)
          a(paramCursor.getPosition() - k, k);
        m = n;
        localObject = str2;
        k = 1;
      }
    }
    while (k <= 1);
    label186: label192: a(i - k, k);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.f
 * JD-Core Version:    0.6.2
 */