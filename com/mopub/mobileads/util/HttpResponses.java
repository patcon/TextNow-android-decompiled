package com.mopub.mobileads.util;

import com.mopub.common.util.ResponseHeader;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

public class HttpResponses
{
  public static boolean extractBooleanHeader(HttpResponse paramHttpResponse, ResponseHeader paramResponseHeader, boolean paramBoolean)
  {
    String str = extractHeader(paramHttpResponse, paramResponseHeader);
    if (str == null)
      return paramBoolean;
    return str.equals("1");
  }

  public static String extractHeader(HttpResponse paramHttpResponse, ResponseHeader paramResponseHeader)
  {
    Header localHeader = paramHttpResponse.getFirstHeader(paramResponseHeader.getKey());
    if (localHeader != null)
      return localHeader.getValue();
    return null;
  }

  public static int extractIntHeader(HttpResponse paramHttpResponse, ResponseHeader paramResponseHeader, int paramInt)
  {
    Integer localInteger = extractIntegerHeader(paramHttpResponse, paramResponseHeader);
    if (localInteger == null)
      return paramInt;
    return localInteger.intValue();
  }

  public static Integer extractIntegerHeader(HttpResponse paramHttpResponse, ResponseHeader paramResponseHeader)
  {
    NumberFormat localNumberFormat = NumberFormat.getInstance(Locale.US);
    localNumberFormat.setParseIntegerOnly(true);
    String str = extractHeader(paramHttpResponse, paramResponseHeader);
    try
    {
      Integer localInteger = Integer.valueOf(localNumberFormat.parse(str.trim()).intValue());
      return localInteger;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.HttpResponses
 * JD-Core Version:    0.6.2
 */