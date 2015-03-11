package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.TypedValue;

public class hp
{
  public static String a(String paramString1, String paramString2, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2, String paramString3)
  {
    String str1;
    if (paramAttributeSet == null)
      str1 = null;
    while (true)
    {
      String str2;
      String str3;
      TypedValue localTypedValue;
      if ((str1 != null) && (str1.startsWith("@string/")) && (paramBoolean1))
      {
        str2 = str1.substring("@string/".length());
        str3 = paramContext.getPackageName();
        localTypedValue = new TypedValue();
      }
      try
      {
        paramContext.getResources().getValue(str3 + ":string/" + str2, localTypedValue, true);
        if (localTypedValue.string != null)
        {
          str1 = localTypedValue.string.toString();
          if ((paramBoolean2) && (str1 == null))
            new StringBuilder().append("Required XML attribute \"").append(paramString2).append("\" missing").toString();
          return str1;
          str1 = paramAttributeSet.getAttributeValue(paramString1, paramString2);
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        while (true)
        {
          new StringBuilder().append("Could not find resource for ").append(paramString2).append(": ").append(str1).toString();
          continue;
          new StringBuilder().append("Resource ").append(paramString2).append(" was not a string: ").append(localTypedValue).toString();
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hp
 * JD-Core Version:    0.6.2
 */