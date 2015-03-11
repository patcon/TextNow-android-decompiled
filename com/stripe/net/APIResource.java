package com.stripe.net;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.EventData;
import com.stripe.model.EventDataDeserializer;
import com.stripe.model.StripeObject;
import com.stripe.model.StripeRawJsonObject;
import com.stripe.model.StripeRawJsonObjectDeserializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.URLStreamHandler;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import textnow.af.d;
import textnow.af.f;
import textnow.af.h;

public abstract class APIResource extends StripeObject
{
  public static final String CHARSET = "UTF-8";
  private static final String CUSTOM_URL_STREAM_HANDLER_PROPERTY_NAME = "com.stripe.net.customURLStreamHandler";
  private static final String DNS_CACHE_TTL_PROPERTY_NAME = "networkaddress.cache.ttl";
  public static final f GSON = new h().a(d.d).a(EventData.class, new EventDataDeserializer()).a(StripeRawJsonObject.class, new StripeRawJsonObjectDeserializer()).c();

  // ERROR //
  protected static <T> T _request(APIResource.RequestMethod paramRequestMethod, String paramString1, Map<String, Object> paramMap, Class<T> paramClass, String paramString2)
  {
    // Byte code:
    //   0: getstatic 64	com/stripe/Stripe:apiKey	Ljava/lang/String;
    //   3: ifnull +12 -> 15
    //   6: getstatic 64	com/stripe/Stripe:apiKey	Ljava/lang/String;
    //   9: invokevirtual 70	java/lang/String:length	()I
    //   12: ifne +26 -> 38
    //   15: aload 4
    //   17: ifnull +11 -> 28
    //   20: aload 4
    //   22: invokevirtual 70	java/lang/String:length	()I
    //   25: ifne +13 -> 38
    //   28: new 72	com/stripe/exception/AuthenticationException
    //   31: dup
    //   32: ldc 74
    //   34: invokespecial 77	com/stripe/exception/AuthenticationException:<init>	(Ljava/lang/String;)V
    //   37: athrow
    //   38: aload 4
    //   40: ifnonnull +8 -> 48
    //   43: getstatic 64	com/stripe/Stripe:apiKey	Ljava/lang/String;
    //   46: astore 4
    //   48: aload_2
    //   49: invokestatic 81	com/stripe/net/APIResource:createQuery	(Ljava/util/Map;)Ljava/lang/String;
    //   52: astore 6
    //   54: aload_0
    //   55: aload_1
    //   56: aload 6
    //   58: aload 4
    //   60: invokestatic 85	com/stripe/net/APIResource:makeURLConnectionRequest	(Lcom/stripe/net/APIResource$RequestMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/net/StripeResponse;
    //   63: astore 11
    //   65: aload 11
    //   67: astore 8
    //   69: aload 8
    //   71: getfield 91	com/stripe/net/StripeResponse:responseCode	I
    //   74: istore 9
    //   76: aload 8
    //   78: getfield 94	com/stripe/net/StripeResponse:responseBody	Ljava/lang/String;
    //   81: astore 10
    //   83: iload 9
    //   85: sipush 200
    //   88: if_icmplt +11 -> 99
    //   91: iload 9
    //   93: sipush 300
    //   96: if_icmplt +10 -> 106
    //   99: aload 10
    //   101: iload 9
    //   103: invokestatic 98	com/stripe/net/APIResource:handleAPIError	(Ljava/lang/String;I)V
    //   106: getstatic 52	com/stripe/net/APIResource:GSON	Ltextnow/af/f;
    //   109: aload 10
    //   111: aload_3
    //   112: invokevirtual 103	textnow/af/f:a	(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   115: areturn
    //   116: astore 5
    //   118: new 105	com/stripe/exception/InvalidRequestException
    //   121: dup
    //   122: ldc 107
    //   124: aconst_null
    //   125: aload 5
    //   127: invokespecial 110	com/stripe/exception/InvalidRequestException:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   130: athrow
    //   131: astore 7
    //   133: ldc 112
    //   135: aconst_null
    //   136: invokestatic 118	java/lang/System:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   139: ifnull +17 -> 156
    //   142: aload_0
    //   143: aload_1
    //   144: aload 6
    //   146: aload 4
    //   148: invokestatic 121	com/stripe/net/APIResource:makeAppEngineRequest	(Lcom/stripe/net/APIResource$RequestMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/net/StripeResponse;
    //   151: astore 8
    //   153: goto -84 -> 69
    //   156: aload 7
    //   158: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   48	54	116	java/io/UnsupportedEncodingException
    //   54	65	131	java/lang/ClassCastException
  }

  private static void checkSSLCert(HttpsURLConnection paramHttpsURLConnection)
  {
    paramHttpsURLConnection.connect();
    Certificate[] arrayOfCertificate = paramHttpsURLConnection.getServerCertificates();
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      localMessageDigest.update(arrayOfCertificate[0].getEncoded());
      if (Arrays.equals(localMessageDigest.digest(), new byte[] { 5, -64, -77, 100, 54, -108, 71, 10, -120, -116, 110, 127, -21, 92, -98, 36, -24, 35, -36, 83 }))
        throwInvalidCertificateException();
      return;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException(localNoSuchAlgorithmException);
    }
    catch (CertificateEncodingException localCertificateEncodingException)
    {
      throwInvalidCertificateException();
    }
  }

  private static String className(Class<?> paramClass)
  {
    String str = paramClass.getSimpleName().toLowerCase().replace("$", " ");
    if (str.equals("applicationfee"))
      str = "application_fee";
    return str;
  }

  protected static String classURL(Class<?> paramClass)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = singleClassURL(paramClass);
    return String.format("%ss", arrayOfObject);
  }

  private static HttpsURLConnection createDeleteConnection(String paramString1, String paramString2, String paramString3)
  {
    HttpsURLConnection localHttpsURLConnection = createStripeConnection(String.format("%s?%s", new Object[] { paramString1, paramString2 }), paramString3);
    localHttpsURLConnection.setRequestMethod("DELETE");
    checkSSLCert(localHttpsURLConnection);
    return localHttpsURLConnection;
  }

  private static HttpsURLConnection createGetConnection(String paramString1, String paramString2, String paramString3)
  {
    HttpsURLConnection localHttpsURLConnection = createStripeConnection(String.format("%s?%s", new Object[] { paramString1, paramString2 }), paramString3);
    localHttpsURLConnection.setRequestMethod("GET");
    checkSSLCert(localHttpsURLConnection);
    return localHttpsURLConnection;
  }

  private static HttpsURLConnection createPostConnection(String paramString1, String paramString2, String paramString3)
  {
    HttpsURLConnection localHttpsURLConnection = createStripeConnection(paramString1, paramString3);
    localHttpsURLConnection.setDoOutput(true);
    localHttpsURLConnection.setRequestMethod("POST");
    localHttpsURLConnection.setRequestProperty("Content-Type", String.format("application/x-www-form-urlencoded;charset=%s", new Object[] { "UTF-8" }));
    checkSSLCert(localHttpsURLConnection);
    OutputStream localOutputStream = null;
    try
    {
      localOutputStream = localHttpsURLConnection.getOutputStream();
      localOutputStream.write(paramString2.getBytes("UTF-8"));
      return localHttpsURLConnection;
    }
    finally
    {
      if (localOutputStream != null)
        localOutputStream.close();
    }
  }

  private static String createQuery(Map<String, Object> paramMap)
  {
    Map localMap = flattenParams(paramMap);
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = localMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localStringBuilder.length() > 0)
        localStringBuilder.append("&");
      localStringBuilder.append(urlEncodePair((String)localEntry.getKey(), (String)localEntry.getValue()));
    }
    return localStringBuilder.toString();
  }

  private static HttpsURLConnection createStripeConnection(String paramString1, String paramString2)
  {
    String str = System.getProperty("com.stripe.net.customURLStreamHandler", null);
    if (str != null);
    HttpsURLConnection localHttpsURLConnection;
    while (true)
    {
      try
      {
        URL localURL2 = new URL(null, paramString1, (URLStreamHandler)Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]));
        localURL1 = localURL2;
        localHttpsURLConnection = (HttpsURLConnection)localURL1.openConnection();
        localHttpsURLConnection.setConnectTimeout(30000);
        localHttpsURLConnection.setReadTimeout(80000);
        localHttpsURLConnection.setUseCaches(false);
        Iterator localIterator = getHeaders(paramString2).entrySet().iterator();
        if (!localIterator.hasNext())
          break;
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localHttpsURLConnection.setRequestProperty((String)localEntry.getKey(), (String)localEntry.getValue());
        continue;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        throw new IOException(localClassNotFoundException);
      }
      catch (SecurityException localSecurityException)
      {
        throw new IOException(localSecurityException);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        throw new IOException(localNoSuchMethodException);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw new IOException(localIllegalArgumentException);
      }
      catch (InstantiationException localInstantiationException)
      {
        throw new IOException(localInstantiationException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new IOException(localIllegalAccessException);
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        throw new IOException(localInvocationTargetException);
      }
      URL localURL1 = new URL(paramString1);
    }
    return localHttpsURLConnection;
  }

  private static Map<String, String> flattenParams(Map<String, Object> paramMap)
  {
    if (paramMap == null)
      return new HashMap();
    HashMap localHashMap1 = new HashMap();
    Iterator localIterator1 = paramMap.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator1.next();
      String str = (String)localEntry1.getKey();
      Object localObject = localEntry1.getValue();
      if ((localObject instanceof Map))
      {
        HashMap localHashMap2 = new HashMap();
        Iterator localIterator2 = ((Map)localObject).entrySet().iterator();
        while (localIterator2.hasNext())
        {
          Map.Entry localEntry2 = (Map.Entry)localIterator2.next();
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = str;
          arrayOfObject[1] = localEntry2.getKey();
          localHashMap2.put(String.format("%s[%s]", arrayOfObject), localEntry2.getValue());
        }
        localHashMap1.putAll(flattenParams(localHashMap2));
      }
      else
      {
        if ("".equals(localObject))
          throw new InvalidRequestException("You cannot set '" + str + "' to an empty string. " + "We interpret empty strings as null in requests. " + "You may set '" + str + "' to null to delete the property.", str, null);
        if (localObject == null)
          localHashMap1.put(str, "");
        else if (localObject != null)
          localHashMap1.put(str, localObject.toString());
      }
    }
    return localHashMap1;
  }

  static Map<String, String> getHeaders(String paramString)
  {
    int i = 0;
    HashMap localHashMap1 = new HashMap();
    localHashMap1.put("Accept-Charset", "UTF-8");
    localHashMap1.put("User-Agent", String.format("Stripe/v1 JavaBindings/%s", new Object[] { "1.12.0" }));
    if (paramString == null)
      paramString = Stripe.apiKey;
    localHashMap1.put("Authorization", String.format("Bearer %s", new Object[] { paramString }));
    String[] arrayOfString = { "os.name", "os.version", "os.arch", "java.version", "java.vendor", "java.vm.version", "java.vm.vendor" };
    HashMap localHashMap2 = new HashMap();
    int j = arrayOfString.length;
    while (i < j)
    {
      String str = arrayOfString[i];
      localHashMap2.put(str, System.getProperty(str));
      i++;
    }
    localHashMap2.put("bindings.version", "1.12.0");
    localHashMap2.put("lang", "Java");
    localHashMap2.put("publisher", "Stripe");
    localHashMap1.put("X-Stripe-Client-User-Agent", GSON.a(localHashMap2));
    if (Stripe.apiVersion != null)
      localHashMap1.put("Stripe-Version", Stripe.apiVersion);
    return localHashMap1;
  }

  private static String getResponseBody(InputStream paramInputStream)
  {
    String str = new Scanner(paramInputStream, "UTF-8").useDelimiter("\\A").next();
    paramInputStream.close();
    return str;
  }

  private static void handleAPIError(String paramString, int paramInt)
  {
    APIResource.Error localError = APIResource.ErrorContainer.access$000((APIResource.ErrorContainer)GSON.a(paramString, APIResource.ErrorContainer.class));
    switch (paramInt)
    {
    case 403:
    default:
      throw new APIException(localError.message, null);
    case 400:
      throw new InvalidRequestException(localError.message, localError.param, null);
    case 404:
      throw new InvalidRequestException(localError.message, localError.param, null);
    case 401:
      throw new AuthenticationException(localError.message);
    case 402:
    }
    throw new CardException(localError.message, localError.code, localError.param, null);
  }

  protected static String instanceURL(Class<?> paramClass, String paramString)
  {
    try
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = classURL(paramClass);
      arrayOfObject[1] = urlEncode(paramString);
      String str = String.format("%s/%s", arrayOfObject);
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new InvalidRequestException("Unable to encode parameters to UTF-8. Please contact support@stripe.com for assistance.", null, localUnsupportedEncodingException);
    }
  }

  private static StripeResponse makeAppEngineRequest(APIResource.RequestMethod paramRequestMethod, String paramString1, String paramString2, String paramString3)
  {
    try
    {
      if ((paramRequestMethod == APIResource.RequestMethod.GET) || (paramRequestMethod == APIResource.RequestMethod.DELETE))
        paramString1 = String.format("%s?%s", new Object[] { paramString1, paramString2 });
      localURL = new URL(paramString1);
      localClass1 = Class.forName("com.google.appengine.api.urlfetch.HTTPMethod");
      localObject1 = localClass1.getDeclaredField(paramRequestMethod.name()).get(null);
      localClass2 = Class.forName("com.google.appengine.api.urlfetch.FetchOptions$Builder");
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      try
      {
        URL localURL;
        Class localClass1;
        Object localObject1;
        Object localObject7 = localClass2.getDeclaredMethod("validateCertificate", new Class[0]).invoke(null, new Object[0]);
        localObject2 = localObject7;
        Class localClass3 = Class.forName("com.google.appengine.api.urlfetch.FetchOptions");
        Method localMethod1 = localClass3.getDeclaredMethod("setDeadline", new Class[] { Double.class });
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = new Double(55.0D);
        localMethod1.invoke(localObject2, arrayOfObject1);
        localClass4 = Class.forName("com.google.appengine.api.urlfetch.HTTPRequest");
        localObject3 = localClass4.getDeclaredConstructor(new Class[] { URL.class, localClass1, localClass3 }).newInstance(new Object[] { localURL, localObject1, localObject2 });
        if (paramRequestMethod == APIResource.RequestMethod.POST)
        {
          Method localMethod3 = localClass4.getDeclaredMethod("setPayload", new Class[] { [B.class });
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = paramString2.getBytes();
          localMethod3.invoke(localObject3, arrayOfObject3);
        }
        Iterator localIterator = getHeaders(paramString3).entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          Class localClass5 = Class.forName("com.google.appengine.api.urlfetch.HTTPHeader");
          Constructor localConstructor = localClass5.getDeclaredConstructor(new Class[] { String.class, String.class });
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = localEntry.getKey();
          arrayOfObject2[1] = localEntry.getValue();
          Object localObject6 = localConstructor.newInstance(arrayOfObject2);
          localClass4.getDeclaredMethod("setHeader", new Class[] { localClass5 }).invoke(localObject3, new Object[] { localObject6 });
        }
        localInvocationTargetException = localInvocationTargetException;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", localInvocationTargetException);
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        Class localClass4;
        Object localObject3;
        while (true)
        {
          Class localClass2;
          System.err.println("Warning: this App Engine SDK version does not allow verification of SSL certificates;this exposes you to a MITM attack. Please upgrade your App Engine SDK to >=1.5.0. If you have questions, contact support@stripe.com.");
          Object localObject2 = localClass2.getDeclaredMethod("withDefaults", new Class[0]).invoke(null, new Object[0]);
        }
        Object localObject4 = Class.forName("com.google.appengine.api.urlfetch.URLFetchServiceFactory").getDeclaredMethod("getURLFetchService", new Class[0]).invoke(null, new Object[0]);
        Method localMethod2 = localObject4.getClass().getDeclaredMethod("fetch", new Class[] { localClass4 });
        localMethod2.setAccessible(true);
        Object localObject5 = localMethod2.invoke(localObject4, new Object[] { localObject3 });
        StripeResponse localStripeResponse = new StripeResponse(((Integer)localObject5.getClass().getDeclaredMethod("getResponseCode", new Class[0]).invoke(localObject5, new Object[0])).intValue(), new String((byte[])localObject5.getClass().getDeclaredMethod("getContent", new Class[0]).invoke(localObject5, new Object[0]), "UTF-8"));
        return localStripeResponse;
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", localMalformedURLException);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", localNoSuchFieldException);
    }
    catch (SecurityException localSecurityException)
    {
      throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", localSecurityException);
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", localNoSuchMethodException1);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", localClassNotFoundException);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", localIllegalArgumentException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", localIllegalAccessException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", localInstantiationException);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", localUnsupportedEncodingException);
    }
  }

  private static StripeResponse makeURLConnectionRequest(APIResource.RequestMethod paramRequestMethod, String paramString1, String paramString2, String paramString3)
  {
    HttpsURLConnection localHttpsURLConnection = null;
    try
    {
      switch (1.$SwitchMap$com$stripe$net$APIResource$RequestMethod[paramRequestMethod.ordinal()])
      {
      default:
        throw new APIConnectionException(String.format("Unrecognized HTTP method %s. This indicates a bug in the Stripe bindings. Please contact support@stripe.com for assistance.", new Object[] { paramRequestMethod }));
      case 1:
      case 2:
      case 3:
      }
    }
    catch (IOException localIOException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Stripe.getApiBase();
      throw new APIConnectionException(String.format("Could not connect to Stripe (%s). Please check your internet connection and try again. If this problem persists,you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", arrayOfObject), localIOException);
    }
    finally
    {
      if (localHttpsURLConnection != null)
        localHttpsURLConnection.disconnect();
    }
    localHttpsURLConnection = createGetConnection(paramString1, paramString2, paramString3);
    int i = localHttpsURLConnection.getResponseCode();
    if ((i >= 200) && (i < 300));
    String str;
    for (Object localObject2 = getResponseBody(localHttpsURLConnection.getInputStream()); ; localObject2 = str)
    {
      StripeResponse localStripeResponse = new StripeResponse(i, (String)localObject2, localHttpsURLConnection.getHeaderFields());
      if (localHttpsURLConnection != null)
        localHttpsURLConnection.disconnect();
      return localStripeResponse;
      localHttpsURLConnection = createPostConnection(paramString1, paramString2, paramString3);
      break;
      localHttpsURLConnection = createDeleteConnection(paramString1, paramString2, paramString3);
      break;
      str = getResponseBody(localHttpsURLConnection.getErrorStream());
    }
  }

  // ERROR //
  protected static <T> T request(APIResource.RequestMethod paramRequestMethod, String paramString1, Map<String, Object> paramMap, Class<T> paramClass, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: iconst_1
    //   4: invokestatic 680	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   7: astore 6
    //   9: ldc 14
    //   11: invokestatic 683	java/security/Security:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   14: astore 5
    //   16: ldc 14
    //   18: ldc_w 685
    //   21: invokestatic 688	java/security/Security:setProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: aload 5
    //   26: astore 9
    //   28: aload 6
    //   30: astore 10
    //   32: aload_0
    //   33: aload_1
    //   34: aload_2
    //   35: aload_3
    //   36: aload 4
    //   38: invokestatic 690	com/stripe/net/APIResource:_request	(Lcom/stripe/net/APIResource$RequestMethod;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   41: astore 12
    //   43: aload 10
    //   45: invokevirtual 693	java/lang/Boolean:booleanValue	()Z
    //   48: ifeq +16 -> 64
    //   51: aload 9
    //   53: ifnonnull +33 -> 86
    //   56: ldc 14
    //   58: ldc_w 695
    //   61: invokestatic 688	java/security/Security:setProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   64: aload 12
    //   66: areturn
    //   67: astore 7
    //   69: iconst_0
    //   70: invokestatic 680	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   73: astore 8
    //   75: aload 5
    //   77: astore 9
    //   79: aload 8
    //   81: astore 10
    //   83: goto -51 -> 32
    //   86: ldc 14
    //   88: aload 9
    //   90: invokestatic 688	java/security/Security:setProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   93: aload 12
    //   95: areturn
    //   96: astore 11
    //   98: aload 10
    //   100: invokevirtual 693	java/lang/Boolean:booleanValue	()Z
    //   103: ifeq +16 -> 119
    //   106: aload 9
    //   108: ifnonnull +14 -> 122
    //   111: ldc 14
    //   113: ldc_w 695
    //   116: invokestatic 688	java/security/Security:setProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   119: aload 11
    //   121: athrow
    //   122: ldc 14
    //   124: aload 9
    //   126: invokestatic 688	java/security/Security:setProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   129: goto -10 -> 119
    //
    // Exception table:
    //   from	to	target	type
    //   9	24	67	java/lang/SecurityException
    //   32	43	96	finally
  }

  protected static String singleClassURL(Class<?> paramClass)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Stripe.getApiBase();
    arrayOfObject[1] = className(paramClass);
    return String.format("%s/v1/%s", arrayOfObject);
  }

  private static void throwInvalidCertificateException()
  {
    throw new APIConnectionException("Invalid server certificate. You tried to connect to a server that has a revoked SSL certificate, which means we cannot securely send data to that server. Please email support@stripe.com if you need help connecting to the correct API server.");
  }

  private static String urlEncode(String paramString)
  {
    if (paramString == null)
      return null;
    return URLEncoder.encode(paramString, "UTF-8");
  }

  private static String urlEncodePair(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = urlEncode(paramString1);
    arrayOfObject[1] = urlEncode(paramString2);
    return String.format("%s=%s", arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.net.APIResource
 * JD-Core Version:    0.6.2
 */