package com.facebook;

import android.content.Context;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.FileLruCache.Limits;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObject.Factory;
import com.facebook.model.GraphObjectList;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Response
{
  private static final String BODY_KEY = "body";
  private static final String CODE_KEY = "code";
  private static final int INVALID_SESSION_FACEBOOK_ERROR_CODE = 190;
  public static final String NON_JSON_RESPONSE_PROPERTY = "FACEBOOK_NON_JSON_RESULT";
  private static final String RESPONSE_CACHE_TAG = "ResponseCache";
  private static final String RESPONSE_LOG_TAG = "Response";
  public static final String SUCCESS_KEY = "success";
  private static FileLruCache responseCache;
  private final HttpURLConnection connection;
  private final FacebookRequestError error;
  private final GraphObject graphObject;
  private final GraphObjectList<GraphObject> graphObjectList;
  private final boolean isFromCache;
  private final String rawResponse;
  private final Request request;

  static
  {
    if (!Response.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  Response(Request paramRequest, HttpURLConnection paramHttpURLConnection, FacebookRequestError paramFacebookRequestError)
  {
    this(paramRequest, paramHttpURLConnection, null, null, null, false, paramFacebookRequestError);
  }

  Response(Request paramRequest, HttpURLConnection paramHttpURLConnection, String paramString, GraphObject paramGraphObject, GraphObjectList<GraphObject> paramGraphObjectList, boolean paramBoolean, FacebookRequestError paramFacebookRequestError)
  {
    this.request = paramRequest;
    this.connection = paramHttpURLConnection;
    this.rawResponse = paramString;
    this.graphObject = paramGraphObject;
    this.graphObjectList = paramGraphObjectList;
    this.isFromCache = paramBoolean;
    this.error = paramFacebookRequestError;
  }

  Response(Request paramRequest, HttpURLConnection paramHttpURLConnection, String paramString, GraphObject paramGraphObject, boolean paramBoolean)
  {
    this(paramRequest, paramHttpURLConnection, paramString, paramGraphObject, null, paramBoolean, null);
  }

  Response(Request paramRequest, HttpURLConnection paramHttpURLConnection, String paramString, GraphObjectList<GraphObject> paramGraphObjectList, boolean paramBoolean)
  {
    this(paramRequest, paramHttpURLConnection, paramString, null, paramGraphObjectList, paramBoolean, null);
  }

  static List<Response> constructErrorResponses(List<Request> paramList, HttpURLConnection paramHttpURLConnection, FacebookException paramFacebookException)
  {
    int i = paramList.size();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
      localArrayList.add(new Response((Request)paramList.get(j), paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, paramFacebookException)));
    return localArrayList;
  }

  private static Response createResponseFromObject(Request paramRequest, HttpURLConnection paramHttpURLConnection, Object paramObject1, boolean paramBoolean, Object paramObject2)
  {
    if ((paramObject1 instanceof JSONObject))
    {
      JSONObject localJSONObject = (JSONObject)paramObject1;
      FacebookRequestError localFacebookRequestError = FacebookRequestError.checkResponseAndCreateError(localJSONObject, paramObject2, paramHttpURLConnection);
      if (localFacebookRequestError != null)
      {
        if (localFacebookRequestError.getErrorCode() == 190)
        {
          Session localSession = paramRequest.getSession();
          if (localSession != null)
            localSession.closeAndClearTokenInformation();
        }
        return new Response(paramRequest, paramHttpURLConnection, localFacebookRequestError);
      }
      Object localObject = Utility.getStringPropertyAsJSON(localJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
      if ((localObject instanceof JSONObject))
      {
        GraphObject localGraphObject = GraphObject.Factory.create((JSONObject)localObject);
        return new Response(paramRequest, paramHttpURLConnection, localObject.toString(), localGraphObject, paramBoolean);
      }
      if ((localObject instanceof JSONArray))
      {
        GraphObjectList localGraphObjectList = GraphObject.Factory.createList((JSONArray)localObject, GraphObject.class);
        return new Response(paramRequest, paramHttpURLConnection, localObject.toString(), localGraphObjectList, paramBoolean);
      }
      paramObject1 = JSONObject.NULL;
    }
    if (paramObject1 == JSONObject.NULL)
      return new Response(paramRequest, paramHttpURLConnection, paramObject1.toString(), null, paramBoolean);
    throw new FacebookException("Got unexpected object type in response, class: " + paramObject1.getClass().getSimpleName());
  }

  private static List<Response> createResponsesFromObject(HttpURLConnection paramHttpURLConnection, List<Request> paramList, Object paramObject, boolean paramBoolean)
  {
    int i = 0;
    assert ((paramHttpURLConnection != null) || (paramBoolean));
    int j = paramList.size();
    ArrayList localArrayList = new ArrayList(j);
    Request localRequest2;
    if (j == 1)
      localRequest2 = (Request)paramList.get(0);
    Object localObject;
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("body", paramObject);
        if (paramHttpURLConnection != null)
        {
          k = paramHttpURLConnection.getResponseCode();
          localJSONObject.put("code", k);
          localObject = new JSONArray();
          ((JSONArray)localObject).put(localJSONObject);
          if (((localObject instanceof JSONArray)) && (((JSONArray)localObject).length() == j))
            break;
          throw new FacebookException("Unexpected number of results");
        }
        int k = 200;
        continue;
      }
      catch (JSONException localJSONException2)
      {
        localArrayList.add(new Response(localRequest2, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localJSONException2)));
        localObject = paramObject;
        continue;
      }
      catch (IOException localIOException)
      {
        localArrayList.add(new Response(localRequest2, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localIOException)));
      }
      localObject = paramObject;
    }
    JSONArray localJSONArray = (JSONArray)localObject;
    while (true)
      if (i < localJSONArray.length())
      {
        Request localRequest1 = (Request)paramList.get(i);
        try
        {
          localArrayList.add(createResponseFromObject(localRequest1, paramHttpURLConnection, localJSONArray.get(i), paramBoolean, paramObject));
          i++;
        }
        catch (JSONException localJSONException1)
        {
          while (true)
            localArrayList.add(new Response(localRequest1, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localJSONException1)));
        }
        catch (FacebookException localFacebookException)
        {
          while (true)
            localArrayList.add(new Response(localRequest1, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localFacebookException)));
        }
      }
    return localArrayList;
  }

  static List<Response> createResponsesFromStream(InputStream paramInputStream, HttpURLConnection paramHttpURLConnection, RequestBatch paramRequestBatch, boolean paramBoolean)
  {
    String str = Utility.readStreamToString(paramInputStream);
    LoggingBehavior localLoggingBehavior = LoggingBehavior.INCLUDE_RAW_RESPONSES;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(str.length());
    arrayOfObject[1] = str;
    Logger.log(localLoggingBehavior, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", arrayOfObject);
    return createResponsesFromString(str, paramHttpURLConnection, paramRequestBatch, paramBoolean);
  }

  static List<Response> createResponsesFromString(String paramString, HttpURLConnection paramHttpURLConnection, RequestBatch paramRequestBatch, boolean paramBoolean)
  {
    List localList = createResponsesFromObject(paramHttpURLConnection, paramRequestBatch, new JSONTokener(paramString).nextValue(), paramBoolean);
    LoggingBehavior localLoggingBehavior = LoggingBehavior.REQUESTS;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramRequestBatch.getId();
    arrayOfObject[1] = Integer.valueOf(paramString.length());
    arrayOfObject[2] = localList;
    Logger.log(localLoggingBehavior, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", arrayOfObject);
    return localList;
  }

  // ERROR //
  static List<Response> fromHttpConnection(HttpURLConnection paramHttpURLConnection, RequestBatch paramRequestBatch)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: instanceof 273
    //   6: ifeq +495 -> 501
    //   9: aload_1
    //   10: checkcast 273	com/facebook/internal/CacheableRequestBatch
    //   13: astore 17
    //   15: invokestatic 277	com/facebook/Response:getResponseCache	()Lcom/facebook/internal/FileLruCache;
    //   18: astore 18
    //   20: aload 17
    //   22: invokevirtual 280	com/facebook/internal/CacheableRequestBatch:getCacheKeyOverride	()Ljava/lang/String;
    //   25: astore 19
    //   27: aload 19
    //   29: invokestatic 284	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   32: ifeq +21 -> 53
    //   35: aload_1
    //   36: invokevirtual 285	com/facebook/RequestBatch:size	()I
    //   39: iconst_1
    //   40: if_icmpne +66 -> 106
    //   43: aload_1
    //   44: iconst_0
    //   45: invokevirtual 288	com/facebook/RequestBatch:get	(I)Lcom/facebook/Request;
    //   48: invokevirtual 291	com/facebook/Request:getUrlForSingleRequest	()Ljava/lang/String;
    //   51: astore 19
    //   53: aload 17
    //   55: invokevirtual 294	com/facebook/internal/CacheableRequestBatch:getForceRoundTrip	()Z
    //   58: ifne +430 -> 488
    //   61: aload 18
    //   63: ifnull +425 -> 488
    //   66: aload 19
    //   68: invokestatic 284	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   71: ifne +417 -> 488
    //   74: aload 18
    //   76: aload 19
    //   78: invokevirtual 299	com/facebook/internal/FileLruCache:get	(Ljava/lang/String;)Ljava/io/InputStream;
    //   81: astore 27
    //   83: aload 27
    //   85: astore_2
    //   86: aload_2
    //   87: ifnull +33 -> 120
    //   90: aload_2
    //   91: aconst_null
    //   92: aload_1
    //   93: iconst_1
    //   94: invokestatic 301	com/facebook/Response:createResponsesFromStream	(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;Z)Ljava/util/List;
    //   97: astore 30
    //   99: aload_2
    //   100: invokestatic 305	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   103: aload 30
    //   105: areturn
    //   106: getstatic 260	com/facebook/LoggingBehavior:REQUESTS	Lcom/facebook/LoggingBehavior;
    //   109: ldc 23
    //   111: ldc_w 307
    //   114: invokestatic 310	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //   117: goto -64 -> 53
    //   120: aload_2
    //   121: invokestatic 305	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   124: aload 18
    //   126: astore_3
    //   127: aload 19
    //   129: astore 28
    //   131: aload_2
    //   132: astore 4
    //   134: aload 28
    //   136: astore 5
    //   138: aload_0
    //   139: invokevirtual 200	java/net/HttpURLConnection:getResponseCode	()I
    //   142: sipush 400
    //   145: if_icmplt +106 -> 251
    //   148: aload_0
    //   149: invokevirtual 314	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   152: astore 4
    //   154: aload 4
    //   156: aload_0
    //   157: aload_1
    //   158: iconst_0
    //   159: invokestatic 301	com/facebook/Response:createResponsesFromStream	(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;Z)Ljava/util/List;
    //   162: astore 16
    //   164: aload 4
    //   166: invokestatic 305	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   169: aload 16
    //   171: areturn
    //   172: astore 25
    //   174: aconst_null
    //   175: astore 26
    //   177: aload 26
    //   179: invokestatic 305	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   182: aload 19
    //   184: astore 5
    //   186: aload 26
    //   188: astore 4
    //   190: aload 18
    //   192: astore_3
    //   193: goto -55 -> 138
    //   196: astore 23
    //   198: aload_2
    //   199: invokestatic 305	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   202: aload 18
    //   204: astore_3
    //   205: aload 19
    //   207: astore 24
    //   209: aload_2
    //   210: astore 4
    //   212: aload 24
    //   214: astore 5
    //   216: goto -78 -> 138
    //   219: astore 21
    //   221: aload_2
    //   222: invokestatic 305	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   225: aload 18
    //   227: astore_3
    //   228: aload 19
    //   230: astore 22
    //   232: aload_2
    //   233: astore 4
    //   235: aload 22
    //   237: astore 5
    //   239: goto -101 -> 138
    //   242: astore 20
    //   244: aload_2
    //   245: invokestatic 305	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   248: aload 20
    //   250: athrow
    //   251: aload_0
    //   252: invokevirtual 317	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   255: astore 4
    //   257: aload_3
    //   258: ifnull -104 -> 154
    //   261: aload 5
    //   263: ifnull -109 -> 154
    //   266: aload 4
    //   268: ifnull -114 -> 154
    //   271: aload_3
    //   272: aload 5
    //   274: aload 4
    //   276: invokevirtual 321	com/facebook/internal/FileLruCache:interceptAndPut	(Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;
    //   279: astore 15
    //   281: aload 15
    //   283: ifnull -129 -> 154
    //   286: aload 15
    //   288: astore 4
    //   290: goto -136 -> 154
    //   293: astore 13
    //   295: getstatic 260	com/facebook/LoggingBehavior:REQUESTS	Lcom/facebook/LoggingBehavior;
    //   298: ldc 26
    //   300: ldc_w 323
    //   303: iconst_1
    //   304: anewarray 4	java/lang/Object
    //   307: dup
    //   308: iconst_0
    //   309: aload 13
    //   311: aastore
    //   312: invokestatic 244	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   315: aload_1
    //   316: aload_0
    //   317: aload 13
    //   319: invokestatic 325	com/facebook/Response:constructErrorResponses	(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //   322: astore 14
    //   324: aload 4
    //   326: invokestatic 305	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   329: aload 14
    //   331: areturn
    //   332: astore 11
    //   334: getstatic 260	com/facebook/LoggingBehavior:REQUESTS	Lcom/facebook/LoggingBehavior;
    //   337: ldc 26
    //   339: ldc_w 323
    //   342: iconst_1
    //   343: anewarray 4	java/lang/Object
    //   346: dup
    //   347: iconst_0
    //   348: aload 11
    //   350: aastore
    //   351: invokestatic 244	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   354: aload_1
    //   355: aload_0
    //   356: new 161	com/facebook/FacebookException
    //   359: dup
    //   360: aload 11
    //   362: invokespecial 328	com/facebook/FacebookException:<init>	(Ljava/lang/Throwable;)V
    //   365: invokestatic 325	com/facebook/Response:constructErrorResponses	(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //   368: astore 12
    //   370: aload 4
    //   372: invokestatic 305	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   375: aload 12
    //   377: areturn
    //   378: astore 9
    //   380: getstatic 260	com/facebook/LoggingBehavior:REQUESTS	Lcom/facebook/LoggingBehavior;
    //   383: ldc 26
    //   385: ldc_w 323
    //   388: iconst_1
    //   389: anewarray 4	java/lang/Object
    //   392: dup
    //   393: iconst_0
    //   394: aload 9
    //   396: aastore
    //   397: invokestatic 244	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   400: aload_1
    //   401: aload_0
    //   402: new 161	com/facebook/FacebookException
    //   405: dup
    //   406: aload 9
    //   408: invokespecial 328	com/facebook/FacebookException:<init>	(Ljava/lang/Throwable;)V
    //   411: invokestatic 325	com/facebook/Response:constructErrorResponses	(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //   414: astore 10
    //   416: aload 4
    //   418: invokestatic 305	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   421: aload 10
    //   423: areturn
    //   424: astore 7
    //   426: getstatic 260	com/facebook/LoggingBehavior:REQUESTS	Lcom/facebook/LoggingBehavior;
    //   429: ldc 26
    //   431: ldc_w 323
    //   434: iconst_1
    //   435: anewarray 4	java/lang/Object
    //   438: dup
    //   439: iconst_0
    //   440: aload 7
    //   442: aastore
    //   443: invokestatic 244	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   446: aload_1
    //   447: aload_0
    //   448: new 161	com/facebook/FacebookException
    //   451: dup
    //   452: aload 7
    //   454: invokespecial 328	com/facebook/FacebookException:<init>	(Ljava/lang/Throwable;)V
    //   457: invokestatic 325	com/facebook/Response:constructErrorResponses	(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //   460: astore 8
    //   462: aload 4
    //   464: invokestatic 305	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   467: aload 8
    //   469: areturn
    //   470: astore 6
    //   472: aload 4
    //   474: invokestatic 305	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   477: aload 6
    //   479: athrow
    //   480: astore 29
    //   482: aload_2
    //   483: astore 26
    //   485: goto -308 -> 177
    //   488: aload 18
    //   490: astore_3
    //   491: aload 19
    //   493: astore 5
    //   495: aconst_null
    //   496: astore 4
    //   498: goto -360 -> 138
    //   501: aconst_null
    //   502: astore_3
    //   503: aconst_null
    //   504: astore 4
    //   506: aconst_null
    //   507: astore 5
    //   509: goto -371 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   74	83	172	com/facebook/FacebookException
    //   74	83	196	org/json/JSONException
    //   90	99	196	org/json/JSONException
    //   74	83	219	java/io/IOException
    //   90	99	219	java/io/IOException
    //   74	83	242	finally
    //   90	99	242	finally
    //   138	154	293	com/facebook/FacebookException
    //   154	164	293	com/facebook/FacebookException
    //   251	257	293	com/facebook/FacebookException
    //   271	281	293	com/facebook/FacebookException
    //   138	154	332	org/json/JSONException
    //   154	164	332	org/json/JSONException
    //   251	257	332	org/json/JSONException
    //   271	281	332	org/json/JSONException
    //   138	154	378	java/io/IOException
    //   154	164	378	java/io/IOException
    //   251	257	378	java/io/IOException
    //   271	281	378	java/io/IOException
    //   138	154	424	java/lang/SecurityException
    //   154	164	424	java/lang/SecurityException
    //   251	257	424	java/lang/SecurityException
    //   271	281	424	java/lang/SecurityException
    //   138	154	470	finally
    //   154	164	470	finally
    //   251	257	470	finally
    //   271	281	470	finally
    //   295	324	470	finally
    //   334	370	470	finally
    //   380	416	470	finally
    //   426	462	470	finally
    //   90	99	480	com/facebook/FacebookException
  }

  static FileLruCache getResponseCache()
  {
    if (responseCache == null)
    {
      Context localContext = Session.getStaticContext();
      if (localContext != null)
        responseCache = new FileLruCache(localContext, "ResponseCache", new FileLruCache.Limits());
    }
    return responseCache;
  }

  public final HttpURLConnection getConnection()
  {
    return this.connection;
  }

  public final FacebookRequestError getError()
  {
    return this.error;
  }

  public final GraphObject getGraphObject()
  {
    return this.graphObject;
  }

  public final <T extends GraphObject> T getGraphObjectAs(Class<T> paramClass)
  {
    if (this.graphObject == null)
      return null;
    if (paramClass == null)
      throw new NullPointerException("Must pass in a valid interface that extends GraphObject");
    return this.graphObject.cast(paramClass);
  }

  public final GraphObjectList<GraphObject> getGraphObjectList()
  {
    return this.graphObjectList;
  }

  public final <T extends GraphObject> GraphObjectList<T> getGraphObjectListAs(Class<T> paramClass)
  {
    if (this.graphObjectList == null)
      return null;
    return this.graphObjectList.castToListOf(paramClass);
  }

  public final boolean getIsFromCache()
  {
    return this.isFromCache;
  }

  public String getRawResponse()
  {
    return this.rawResponse;
  }

  public Request getRequest()
  {
    return this.request;
  }

  public Request getRequestForPagedResults(Response.PagingDirection paramPagingDirection)
  {
    Response.PagingInfo localPagingInfo;
    String str;
    if (this.graphObject != null)
    {
      localPagingInfo = ((Response.PagedResults)this.graphObject.cast(Response.PagedResults.class)).getPaging();
      if (localPagingInfo != null)
        if (paramPagingDirection == Response.PagingDirection.NEXT)
          str = localPagingInfo.getNext();
    }
    while (true)
    {
      if (Utility.isNullOrEmpty(str));
      while ((str != null) && (str.equals(this.request.getUrlForSingleRequest())))
      {
        return null;
        str = localPagingInfo.getPrevious();
        break;
      }
      try
      {
        Request localRequest = new Request(this.request.getSession(), new URL(str));
        return localRequest;
      }
      catch (MalformedURLException localMalformedURLException)
      {
        return null;
      }
      str = null;
    }
  }

  public String toString()
  {
    try
    {
      Object[] arrayOfObject = new Object[1];
      if (this.connection != null);
      for (int i = this.connection.getResponseCode(); ; i = 200)
      {
        arrayOfObject[0] = Integer.valueOf(i);
        String str2 = String.format("%d", arrayOfObject);
        str1 = str2;
        return "{Response: " + " responseCode: " + str1 + ", graphObject: " + this.graphObject + ", error: " + this.error + ", isFromCache:" + this.isFromCache + "}";
      }
    }
    catch (IOException localIOException)
    {
      while (true)
        String str1 = "unknown";
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.Response
 * JD-Core Version:    0.6.2
 */