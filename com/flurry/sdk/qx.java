package com.flurry.sdk;

public class qx
{
  public static String a(mr parammr)
  {
    String str1 = parammr.b();
    String str2 = b(parammr, str1);
    if (str2 == null)
      str2 = a(parammr, str1);
    return str2;
  }

  public static String a(mr parammr, String paramString)
  {
    if (paramString.startsWith("get"))
    {
      if (!"getCallbacks".equals(paramString))
        break label27;
      if (!c(parammr))
        break label43;
    }
    label27: 
    while (("getMetaClass".equals(paramString)) && (e(parammr)))
      return null;
    label43: return a(paramString.substring(3));
  }

  protected static String a(String paramString)
  {
    StringBuilder localStringBuilder = null;
    int i = paramString.length();
    if (i == 0)
      paramString = null;
    do
    {
      return paramString;
      for (int j = 0; j < i; j++)
      {
        char c1 = paramString.charAt(j);
        char c2 = Character.toLowerCase(c1);
        if (c1 == c2)
          break;
        if (localStringBuilder == null)
          localStringBuilder = new StringBuilder(paramString);
        localStringBuilder.setCharAt(j, c2);
      }
    }
    while (localStringBuilder == null);
    return localStringBuilder.toString();
  }

  public static String b(mr parammr)
  {
    String str1 = parammr.b();
    String str2;
    if (str1.startsWith("set"))
    {
      str2 = a(str1.substring(3));
      if (str2 != null)
        break label29;
    }
    label29: 
    while (("metaClass".equals(str2)) && (d(parammr)))
      return null;
    return str2;
  }

  public static String b(mr parammr, String paramString)
  {
    if (paramString.startsWith("is"))
    {
      Class localClass = parammr.d();
      if ((localClass == Boolean.class) || (localClass == Boolean.TYPE));
    }
    else
    {
      return null;
    }
    return a(paramString.substring(2));
  }

  protected static boolean c(mr parammr)
  {
    Class localClass = parammr.d();
    if ((localClass == null) || (!localClass.isArray()));
    String str;
    do
    {
      Package localPackage;
      do
      {
        return false;
        localPackage = localClass.getComponentType().getPackage();
      }
      while (localPackage == null);
      str = localPackage.getName();
    }
    while ((!str.startsWith("net.sf.cglib")) && (!str.startsWith("org.hibernate.repackage.cglib")));
    return true;
  }

  protected static boolean d(mr parammr)
  {
    Package localPackage = parammr.a(0).getPackage();
    boolean bool1 = false;
    if (localPackage != null)
    {
      boolean bool2 = localPackage.getName().startsWith("groovy.lang");
      bool1 = false;
      if (bool2)
        bool1 = true;
    }
    return bool1;
  }

  protected static boolean e(mr parammr)
  {
    Class localClass = parammr.d();
    if ((localClass == null) || (localClass.isArray()));
    Package localPackage;
    do
    {
      return false;
      localPackage = localClass.getPackage();
    }
    while ((localPackage == null) || (!localPackage.getName().startsWith("groovy.lang")));
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qx
 * JD-Core Version:    0.6.2
 */