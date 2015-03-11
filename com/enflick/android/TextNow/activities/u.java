package com.enflick.android.TextNow.activities;

import android.text.Editable;
import android.text.Editable.Factory;
import android.text.TextUtils;
import com.enflick.android.TextNow.views.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import textnow.q.b;
import textnow.u.d;

public final class u
{
  public static v a(Editable paramEditable)
  {
    Editable localEditable = Editable.Factory.getInstance().newEditable(paramEditable);
    j[] arrayOfj = (j[])localEditable.getSpans(0, localEditable.length(), j.class);
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int i = arrayOfj.length;
    for (int j = 0; j < i; j++)
    {
      j localj = arrayOfj[j];
      d locald4 = localj.a();
      if ((locald4.b() != 3) || (b.a(locald4.a())))
        if (locald4.b() == 2)
        {
          String str5 = b.b(locald4.a());
          if (str5 != null)
            locald4.a(str5);
        }
        else
        {
          if (!localHashSet.contains(locald4.a()))
          {
            localHashSet.add(locald4.a());
            localArrayList1.add(locald4);
          }
          localEditable.replace(localEditable.getSpanStart(localj), localEditable.getSpanEnd(localj), "");
        }
    }
    String[] arrayOfString = localEditable.toString().split(",");
    int k = arrayOfString.length;
    int m = 0;
    String str1;
    String str4;
    if (m < k)
    {
      str1 = arrayOfString[m].trim();
      if (!TextUtils.isEmpty(str1))
      {
        if (!str1.contains("@"))
          break label346;
        if (!b.a(str1))
          break label335;
        if (!str1.toLowerCase(Locale.US).endsWith("@textnow.me"))
          break label521;
        str4 = str1.substring(0, str1.indexOf("@"));
      }
    }
    for (int n = 1; ; n = 3)
    {
      d locald3 = new d(str4, n, "", null, true);
      if (!localHashSet.contains(str4))
      {
        localHashSet.add(str4);
        localArrayList1.add(locald3);
      }
      while (true)
      {
        m++;
        break;
        label335: localArrayList2.add(str1);
        continue;
        label346: if (b.b(str1.charAt(0)))
        {
          String str3 = str1 + "@textnow.me";
          d locald2 = new d(str3, 3, str3, null, true);
          if (!localHashSet.contains(str3))
          {
            localHashSet.add(str3);
            localArrayList1.add(locald2);
          }
        }
        else
        {
          if ("911".equals(b.e(str1)));
          for (String str2 = "911"; ; str2 = b.b(str1))
          {
            if (str2 == null)
              break label498;
            d locald1 = new d(str2, 2, "", null, true);
            if (localHashSet.contains(str2))
              break;
            localHashSet.add(str2);
            localArrayList1.add(locald1);
            break;
          }
          label498: localArrayList2.add(str1);
        }
      }
      return new v(localArrayList1, localArrayList2);
      label521: str4 = str1;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.u
 * JD-Core Version:    0.6.2
 */