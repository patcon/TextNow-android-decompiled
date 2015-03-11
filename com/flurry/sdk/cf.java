package com.flurry.sdk;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;
import org.apache.http.client.utils.URIUtils;

public class cf
{
  private static final Pattern a = Pattern.compile("/");

  public static String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    URI localURI;
    do
    {
      return null;
      localURI = f(paramString);
    }
    while (localURI == null);
    return localURI.toString();
  }

  public static String a(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)));
    String[] arrayOfString1;
    int i;
    int j;
    int k;
    Object localObject1;
    Object localObject2;
    StringBuilder localStringBuilder;
    boolean bool1;
    URI localURI5;
    do
    {
      URI localURI2;
      URI localURI4;
      String str3;
      String str4;
      do
      {
        String str1;
        String str2;
        do
        {
          do
          {
            URI localURI3;
            do
            {
              URI localURI1;
              do
              {
                return paramString1;
                localURI1 = f(paramString1);
              }
              while (localURI1 == null);
              localURI2 = localURI1.normalize();
              localURI3 = f(paramString2);
            }
            while (localURI3 == null);
            localURI4 = localURI3.normalize();
          }
          while ((localURI2.isOpaque()) || (localURI4.isOpaque()));
          str1 = localURI2.getScheme();
          str2 = localURI4.getScheme();
        }
        while (((str2 == null) && (str1 != null)) || ((str2 != null) && (!str2.equals(str1))));
        str3 = localURI2.getAuthority();
        str4 = localURI4.getAuthority();
      }
      while (((str4 == null) && (str3 != null)) || ((str4 != null) && (!str4.equals(str3))));
      String str5 = localURI2.getPath();
      String str6 = localURI4.getPath();
      arrayOfString1 = a.split(str5, -1);
      String[] arrayOfString2 = a.split(str6, -1);
      i = arrayOfString1.length;
      j = arrayOfString2.length;
      for (k = 0; (k < j) && (k < i) && (arrayOfString1[k].equals(arrayOfString2[k])); k++);
      localObject1 = localURI2.getQuery();
      localObject2 = localURI2.getFragment();
      localStringBuilder = new StringBuilder();
      if ((k != j) || (k != i))
        break label389;
      String str7 = localURI4.getQuery();
      String str8 = localURI4.getFragment();
      bool1 = TextUtils.equals((CharSequence)localObject1, str7);
      boolean bool2 = TextUtils.equals((CharSequence)localObject2, str8);
      if ((!bool1) || (!bool2))
        break;
      localObject2 = null;
      localObject1 = null;
      localURI5 = a(null, null, localStringBuilder.toString(), (String)localObject1, (String)localObject2);
    }
    while (localURI5 == null);
    return localURI5.toString();
    if ((bool1) && (!TextUtils.isEmpty((CharSequence)localObject2)));
    for (Object localObject3 = null; ; localObject3 = localObject1)
    {
      if ((TextUtils.isEmpty((CharSequence)localObject3)) && (TextUtils.isEmpty((CharSequence)localObject2)))
        localStringBuilder.append(arrayOfString1[(i - 1)]);
      for (Object localObject4 = localObject2; ; localObject4 = localObject2)
      {
        localObject2 = localObject4;
        break;
        label389: int m = i - 1;
        int n = j - 1;
        for (int i1 = k; i1 < n; i1++)
        {
          localStringBuilder.append("..");
          localStringBuilder.append("/");
        }
        while (k < m)
        {
          localStringBuilder.append(arrayOfString1[k]);
          localStringBuilder.append("/");
          k++;
        }
        if (k < i)
          localStringBuilder.append(arrayOfString1[k]);
        if (localStringBuilder.length() != 0)
          break;
        localStringBuilder.append(".");
        localStringBuilder.append("/");
        break;
        localObject1 = localObject3;
      }
    }
  }

  private static URI a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      if (TextUtils.isEmpty(paramString1));
      String str;
      for (Object localObject = paramString1; ; localObject = str)
      {
        return new URI((String)localObject, paramString2, paramString3, paramString4, paramString5);
        str = paramString1.toLowerCase();
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
    }
    return null;
  }

  public static String b(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    URI localURI3;
    do
    {
      URI localURI2;
      do
      {
        URI localURI1;
        do
        {
          return paramString;
          localURI1 = f(paramString);
        }
        while (localURI1 == null);
        localURI2 = localURI1.normalize();
      }
      while (localURI2.isOpaque());
      localURI3 = a(localURI2.getScheme(), localURI2.getAuthority(), "/", null, null);
    }
    while (localURI3 == null);
    return localURI3.toString();
  }

  public static String c(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    URI localURI3;
    do
    {
      URI localURI2;
      do
      {
        URI localURI1;
        do
        {
          return paramString;
          localURI1 = f(paramString);
        }
        while (localURI1 == null);
        localURI2 = localURI1.normalize();
      }
      while (localURI2.isOpaque());
      localURI3 = URIUtils.resolve(localURI2, "./");
    }
    while (localURI3 == null);
    return localURI3.toString();
  }

  public static boolean d(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    boolean bool2 = false;
    if (!bool1)
    {
      Uri localUri = Uri.parse(paramString);
      String str = localUri.getScheme();
      bool2 = false;
      if (str != null)
      {
        boolean bool3 = localUri.getScheme().equals("market");
        bool2 = false;
        if (bool3)
          bool2 = true;
      }
    }
    return bool2;
  }

  public static boolean e(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    boolean bool2 = false;
    if (!bool1)
    {
      Uri localUri = Uri.parse(paramString);
      String str1 = localUri.getHost();
      bool2 = false;
      if (str1 != null)
      {
        boolean bool3 = localUri.getHost().equals("play.google.com");
        bool2 = false;
        if (bool3)
        {
          String str2 = localUri.getScheme();
          bool2 = false;
          if (str2 != null)
          {
            boolean bool4 = localUri.getScheme().startsWith("http");
            bool2 = false;
            if (bool4)
              bool2 = true;
          }
        }
      }
    }
    return bool2;
  }

  // ERROR //
  private static URI f(String paramString)
  {
    // Byte code:
    //   0: new 31	java/net/URI
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 136	java/net/URI:<init>	(Ljava/lang/String;)V
    //   8: astore_1
    //   9: aload_1
    //   10: invokevirtual 47	java/net/URI:getScheme	()Ljava/lang/String;
    //   13: aload_1
    //   14: invokevirtual 56	java/net/URI:getAuthority	()Ljava/lang/String;
    //   17: aload_1
    //   18: invokevirtual 59	java/net/URI:getPath	()Ljava/lang/String;
    //   21: aload_1
    //   22: invokevirtual 66	java/net/URI:getQuery	()Ljava/lang/String;
    //   25: aload_1
    //   26: invokevirtual 69	java/net/URI:getFragment	()Ljava/lang/String;
    //   29: invokestatic 81	com/flurry/sdk/cf:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/net/URI;
    //   32: astore_3
    //   33: aload_3
    //   34: areturn
    //   35: astore 4
    //   37: aconst_null
    //   38: areturn
    //   39: astore_2
    //   40: aload_1
    //   41: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	9	35	java/net/URISyntaxException
    //   9	33	39	java/net/URISyntaxException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.cf
 * JD-Core Version:    0.6.2
 */