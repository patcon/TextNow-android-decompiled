package com.flurry.sdk;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cj
{
  public static int a(String paramString)
  {
    if (paramString != null)
    {
      Matcher localMatcher = Pattern.compile("<VAST version=\"(.+?)\">").matcher(paramString);
      if ((localMatcher.find()) && (localMatcher.groupCount() == 1))
        try
        {
          int i = Math.round(Float.parseFloat(localMatcher.group(1)));
          if ((i > 0) && (i <= 3))
            return i;
          return 0;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          return 0;
        }
      return 0;
    }
    return 0;
  }

  static cv a(List<cv> paramList)
  {
    Object localObject1;
    Object localObject2;
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      localObject1 = null;
      while (localIterator.hasNext())
      {
        localObject2 = (cv)localIterator.next();
        if ((((cv)localObject2).b() > 500) || (((cv)localObject2).a() == null) || (((((cv)localObject2).c() == null) || (!((cv)localObject2).c().equalsIgnoreCase("video/mp4"))) && (!((cv)localObject2).a().endsWith("mp4"))))
          break label109;
        if (localObject1 == null)
          localObject1 = localObject2;
        else
          if (localObject1.b() >= ((cv)localObject2).b())
            break label109;
      }
    }
    while (true)
    {
      localObject1 = localObject2;
      break;
      localObject1 = null;
      return localObject1;
      label109: localObject2 = localObject1;
    }
  }

  static int b(String paramString)
  {
    int i = 0;
    Matcher localMatcher;
    if (paramString != null)
    {
      localMatcher = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})").matcher(paramString);
      boolean bool = localMatcher.find();
      i = 0;
      if (bool)
      {
        int j = localMatcher.groupCount();
        i = 0;
        if (j != 3);
      }
    }
    try
    {
      int k = Integer.parseInt(localMatcher.group(1));
      int m = Integer.parseInt(localMatcher.group(2));
      int n = Integer.parseInt(localMatcher.group(3));
      i = n + (60 * (k * 60) + m * 60);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.cj
 * JD-Core Version:    0.6.2
 */