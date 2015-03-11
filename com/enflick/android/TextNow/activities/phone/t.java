package com.enflick.android.TextNow.activities.phone;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

public final class t
{
  public static String a(Context paramContext, Set<String> paramSet, String paramString)
  {
    String str1;
    if (TextUtils.isEmpty(paramString))
      str1 = null;
    while (true)
    {
      return str1;
      if (paramSet.contains(paramString))
        return paramString;
      if (paramString.startsWith("1"));
      for (str1 = paramString.substring(1); !paramSet.contains(str1); str1 = "1" + paramString)
      {
        Iterator localIterator = paramSet.iterator();
        String str2;
        do
        {
          if (!localIterator.hasNext())
            break;
          str2 = (String)localIterator.next();
        }
        while (!PhoneNumberUtils.compare(paramContext, str2, paramString));
        return str2;
      }
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.t
 * JD-Core Version:    0.6.2
 */