package com.flurry.sdk;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ri extends DateFormat
{
  protected static final String[] a = { "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd" };
  protected static final DateFormat b;
  protected static final DateFormat c;
  protected static final DateFormat d;
  protected static final DateFormat e;
  public static final ri f = new ri();
  protected transient DateFormat g;
  protected transient DateFormat h;
  protected transient DateFormat i;
  protected transient DateFormat j;

  static
  {
    TimeZone localTimeZone = TimeZone.getTimeZone("GMT");
    SimpleDateFormat localSimpleDateFormat1 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
    b = localSimpleDateFormat1;
    localSimpleDateFormat1.setTimeZone(localTimeZone);
    SimpleDateFormat localSimpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    c = localSimpleDateFormat2;
    localSimpleDateFormat2.setTimeZone(localTimeZone);
    SimpleDateFormat localSimpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    d = localSimpleDateFormat3;
    localSimpleDateFormat3.setTimeZone(localTimeZone);
    SimpleDateFormat localSimpleDateFormat4 = new SimpleDateFormat("yyyy-MM-dd");
    e = localSimpleDateFormat4;
    localSimpleDateFormat4.setTimeZone(localTimeZone);
  }

  private static final boolean b(String paramString)
  {
    int k = paramString.length();
    if (k >= 6)
    {
      int m = paramString.charAt(k - 6);
      if ((m == 43) || (m == 45));
      int i1;
      do
      {
        int n;
        do
        {
          return true;
          n = paramString.charAt(k - 5);
        }
        while ((n == 43) || (n == 45));
        i1 = paramString.charAt(k - 3);
      }
      while ((i1 == 43) || (i1 == 45));
    }
    return false;
  }

  public ri a()
  {
    return new ri();
  }

  protected Date a(String paramString, ParsePosition paramParsePosition)
  {
    int k = paramString.length();
    char c1 = paramString.charAt(k - 1);
    DateFormat localDateFormat;
    if ((k <= 10) && (Character.isDigit(c1)))
    {
      localDateFormat = this.j;
      if (localDateFormat == null)
      {
        localDateFormat = (DateFormat)e.clone();
        this.j = localDateFormat;
      }
    }
    while (true)
    {
      return localDateFormat.parse(paramString, paramParsePosition);
      if (c1 == 'Z')
      {
        localDateFormat = this.i;
        if (localDateFormat == null)
        {
          localDateFormat = (DateFormat)d.clone();
          this.i = localDateFormat;
        }
        if (paramString.charAt(k - 4) == ':')
        {
          StringBuilder localStringBuilder4 = new StringBuilder(paramString);
          localStringBuilder4.insert(k - 1, ".000");
          paramString = localStringBuilder4.toString();
        }
      }
      else
      {
        if (b(paramString))
        {
          int m = paramString.charAt(k - 3);
          StringBuilder localStringBuilder2;
          if (m == 58)
          {
            localStringBuilder2 = new StringBuilder(paramString);
            localStringBuilder2.delete(k - 3, k - 2);
          }
          for (paramString = localStringBuilder2.toString(); ; paramString = paramString + "00")
            do
            {
              int n = paramString.length();
              if (Character.isDigit(paramString.charAt(n - 9)))
              {
                StringBuilder localStringBuilder3 = new StringBuilder(paramString);
                localStringBuilder3.insert(n - 5, ".000");
                paramString = localStringBuilder3.toString();
              }
              localDateFormat = this.h;
              if (this.h != null)
                break;
              localDateFormat = (DateFormat)c.clone();
              this.h = localDateFormat;
              break;
            }
            while ((m != 43) && (m != 45));
        }
        StringBuilder localStringBuilder1 = new StringBuilder(paramString);
        if (-1 + (k - paramString.lastIndexOf('T')) <= 8)
          localStringBuilder1.append(".000");
        localStringBuilder1.append('Z');
        paramString = localStringBuilder1.toString();
        localDateFormat = this.i;
        if (localDateFormat == null)
        {
          localDateFormat = (DateFormat)d.clone();
          this.i = localDateFormat;
        }
      }
    }
  }

  protected boolean a(String paramString)
  {
    int k = paramString.length();
    boolean bool1 = false;
    if (k >= 5)
    {
      boolean bool2 = Character.isDigit(paramString.charAt(0));
      bool1 = false;
      if (bool2)
      {
        boolean bool3 = Character.isDigit(paramString.charAt(3));
        bool1 = false;
        if (bool3)
        {
          int m = paramString.charAt(4);
          bool1 = false;
          if (m == 45)
            bool1 = true;
        }
      }
    }
    return bool1;
  }

  protected Date b(String paramString, ParsePosition paramParsePosition)
  {
    if (this.g == null)
      this.g = ((DateFormat)b.clone());
    return this.g.parse(paramString, paramParsePosition);
  }

  public StringBuffer format(Date paramDate, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition)
  {
    if (this.h == null)
      this.h = ((DateFormat)c.clone());
    return this.h.format(paramDate, paramStringBuffer, paramFieldPosition);
  }

  public Date parse(String paramString)
  {
    String str1 = paramString.trim();
    ParsePosition localParsePosition = new ParsePosition(0);
    Date localDate = parse(str1, localParsePosition);
    if (localDate != null)
      return localDate;
    StringBuilder localStringBuilder = new StringBuilder();
    String[] arrayOfString = a;
    int k = arrayOfString.length;
    int m = 0;
    if (m < k)
    {
      String str2 = arrayOfString[m];
      if (localStringBuilder.length() > 0)
        localStringBuilder.append("\", \"");
      while (true)
      {
        localStringBuilder.append(str2);
        m++;
        break;
        localStringBuilder.append('"');
      }
    }
    localStringBuilder.append('"');
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = str1;
    arrayOfObject[1] = localStringBuilder.toString();
    throw new ParseException(String.format("Can not parse date \"%s\": not compatible with any of standard forms (%s)", arrayOfObject), localParsePosition.getErrorIndex());
  }

  public Date parse(String paramString, ParsePosition paramParsePosition)
  {
    if (a(paramString))
      return a(paramString, paramParsePosition);
    int k = paramString.length();
    int m;
    do
    {
      k--;
      if (k < 0)
        break;
      m = paramString.charAt(k);
    }
    while ((m >= 48) && (m <= 57));
    if ((k < 0) && (ii.a(paramString, false)))
      return new Date(Long.parseLong(paramString));
    return b(paramString, paramParsePosition);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ri
 * JD-Core Version:    0.6.2
 */