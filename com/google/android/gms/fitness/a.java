package com.google.android.gms.fitness;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
{
  public static String bq(String paramString)
  {
    if (paramString.equals("https://www.googleapis.com/auth/fitness.activity.read"))
      paramString = "https://www.googleapis.com/auth/fitness.activity.write";
    do
    {
      return paramString;
      if (paramString.equals("https://www.googleapis.com/auth/fitness.location.read"))
        return "https://www.googleapis.com/auth/fitness.location.write";
    }
    while (!paramString.equals("https://www.googleapis.com/auth/fitness.body.read"));
    return "https://www.googleapis.com/auth/fitness.body.write";
  }

  public static String[] d(List<String> paramList)
  {
    HashSet localHashSet = new HashSet(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = bq(str1);
      if ((str2.equals(str1)) || (!paramList.contains(str2)))
        localHashSet.add(str1);
    }
    return (String[])localHashSet.toArray(new String[localHashSet.size()]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.a
 * JD-Core Version:    0.6.2
 */