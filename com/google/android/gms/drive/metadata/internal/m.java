package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class m extends j<UserMetadata>
{
  public m(String paramString, int paramInt)
  {
    super(paramString, bm(paramString), Collections.emptyList(), paramInt);
  }

  private String bl(String paramString)
  {
    return r(getName(), paramString);
  }

  private static Collection<String> bm(String paramString)
  {
    String[] arrayOfString = new String[5];
    arrayOfString[0] = r(paramString, "permissionId");
    arrayOfString[1] = r(paramString, "displayName");
    arrayOfString[2] = r(paramString, "picture");
    arrayOfString[3] = r(paramString, "isAuthenticatedUser");
    arrayOfString[4] = r(paramString, "emailAddress");
    return Arrays.asList(arrayOfString);
  }

  private static String r(String paramString1, String paramString2)
  {
    return paramString1 + "." + paramString2;
  }

  protected boolean b(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    return !paramDataHolder.h(bl("permissionId"), paramInt1, paramInt2);
  }

  protected UserMetadata j(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    String str1 = paramDataHolder.c(bl("permissionId"), paramInt1, paramInt2);
    if (str1 != null)
    {
      String str2 = paramDataHolder.c(bl("displayName"), paramInt1, paramInt2);
      String str3 = paramDataHolder.c(bl("picture"), paramInt1, paramInt2);
      Boolean localBoolean = Boolean.valueOf(paramDataHolder.d(bl("isAuthenticatedUser"), paramInt1, paramInt2));
      String str4 = paramDataHolder.c(bl("emailAddress"), paramInt1, paramInt2);
      return new UserMetadata(str1, str2, str3, localBoolean.booleanValue(), str4);
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.m
 * JD-Core Version:    0.6.2
 */