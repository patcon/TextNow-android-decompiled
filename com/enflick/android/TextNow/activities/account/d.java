package com.enflick.android.TextNow.activities.account;

import android.text.TextUtils;
import com.stripe.android.model.Card;

public final class d extends Card
{
  public d(String paramString1, Integer paramInteger1, Integer paramInteger2, String paramString2)
  {
    super(paramString1, paramInteger1, paramInteger2, paramString2);
  }

  public d(String paramString1, Integer paramInteger1, Integer paramInteger2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
  {
    super(null, null, null, null, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9);
  }

  public static String a(String paramString)
  {
    if (paramString == null)
      return null;
    return paramString.trim().replaceAll("\\s+|-", "");
  }

  public final i a()
  {
    String str = getType();
    if ("Visa".equals(str))
      return i.d;
    if ("MasterCard".equals(str))
      return i.c;
    if ("American Express".equals(str))
      return i.b;
    if ("Discover".equals(str))
      return i.a;
    if ("JCB".equals(str))
      return i.e;
    if ("Diners Club".equals(str))
      return i.f;
    return i.g;
  }

  public final int b()
  {
    if (TextUtils.isEmpty(getName()))
      return 2131493496;
    if ((TextUtils.isEmpty(getAddressLine1())) && (TextUtils.isEmpty(getAddressLine2())))
      return 2131493497;
    if (TextUtils.isEmpty(getAddressZip()))
      return 2131493498;
    if ((getAddressCountry() != null) && (((getAddressCountry().equalsIgnoreCase("Canada")) && (!getAddressZip().toUpperCase().matches("^[ABCEGHJKLMNPRSTVXY]\\d[ABCEGHJKLMNPRSTVWXYZ]( )?\\d[ABCEGHJKLMNPRSTVWXYZ]\\d$"))) || ((getAddressCountry().equalsIgnoreCase("United States")) && (!getAddressZip().matches("^\\d{5}(-\\d{4})?$")))))
      return 2131493499;
    return 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.d
 * JD-Core Version:    0.6.2
 */