package twitter4j.internal.http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import twitter4j.conf.ConfigurationContext;
import twitter4j.internal.logging.Logger;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONObject;

public abstract class HttpResponse
{
  private static final Logger logger = Logger.getLogger(HttpResponseImpl.class);
  protected final HttpClientConfiguration CONF;
  protected InputStream is;
  private JSONObject json = null;
  private JSONArray jsonArray = null;
  protected String responseAsString = null;
  protected int statusCode;
  private boolean streamConsumed = false;

  HttpResponse()
  {
    this.CONF = ConfigurationContext.getInstance();
  }

  public HttpResponse(HttpClientConfiguration paramHttpClientConfiguration)
  {
    this.CONF = paramHttpClientConfiguration;
  }

  private void disconnectForcibly()
  {
    try
    {
      disconnect();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  // ERROR //
  public JSONArray asJSONArray()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 43	twitter4j/internal/http/HttpResponse:jsonArray	Ltwitter4j/internal/org/json/JSONArray;
    //   4: ifnonnull +80 -> 84
    //   7: aconst_null
    //   8: astore_1
    //   9: aload_0
    //   10: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   13: astore 5
    //   15: aconst_null
    //   16: astore_1
    //   17: aload 5
    //   19: ifnonnull +70 -> 89
    //   22: aload_0
    //   23: invokevirtual 68	twitter4j/internal/http/HttpResponse:asReader	()Ljava/io/Reader;
    //   26: astore_1
    //   27: aload_0
    //   28: new 70	twitter4j/internal/org/json/JSONArray
    //   31: dup
    //   32: new 72	twitter4j/internal/org/json/JSONTokener
    //   35: dup
    //   36: aload_1
    //   37: invokespecial 75	twitter4j/internal/org/json/JSONTokener:<init>	(Ljava/io/Reader;)V
    //   40: invokespecial 78	twitter4j/internal/org/json/JSONArray:<init>	(Ltwitter4j/internal/org/json/JSONTokener;)V
    //   43: putfield 43	twitter4j/internal/http/HttpResponse:jsonArray	Ltwitter4j/internal/org/json/JSONArray;
    //   46: aload_0
    //   47: getfield 51	twitter4j/internal/http/HttpResponse:CONF	Ltwitter4j/internal/http/HttpClientConfiguration;
    //   50: invokeinterface 84 1 0
    //   55: ifeq +120 -> 175
    //   58: getstatic 32	twitter4j/internal/http/HttpResponse:logger	Ltwitter4j/internal/logging/Logger;
    //   61: aload_0
    //   62: getfield 43	twitter4j/internal/http/HttpResponse:jsonArray	Ltwitter4j/internal/org/json/JSONArray;
    //   65: iconst_1
    //   66: invokevirtual 88	twitter4j/internal/org/json/JSONArray:toString	(I)Ljava/lang/String;
    //   69: invokevirtual 92	twitter4j/internal/logging/Logger:debug	(Ljava/lang/String;)V
    //   72: aload_1
    //   73: ifnull +7 -> 80
    //   76: aload_1
    //   77: invokevirtual 97	java/io/Reader:close	()V
    //   80: aload_0
    //   81: invokespecial 99	twitter4j/internal/http/HttpResponse:disconnectForcibly	()V
    //   84: aload_0
    //   85: getfield 43	twitter4j/internal/http/HttpResponse:jsonArray	Ltwitter4j/internal/org/json/JSONArray;
    //   88: areturn
    //   89: aload_0
    //   90: new 70	twitter4j/internal/org/json/JSONArray
    //   93: dup
    //   94: aload_0
    //   95: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   98: invokespecial 101	twitter4j/internal/org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   101: putfield 43	twitter4j/internal/http/HttpResponse:jsonArray	Ltwitter4j/internal/org/json/JSONArray;
    //   104: aconst_null
    //   105: astore_1
    //   106: goto -60 -> 46
    //   109: astore 4
    //   111: getstatic 32	twitter4j/internal/http/HttpResponse:logger	Ltwitter4j/internal/logging/Logger;
    //   114: invokevirtual 104	twitter4j/internal/logging/Logger:isDebugEnabled	()Z
    //   117: ifeq +102 -> 219
    //   120: new 106	twitter4j/TwitterException
    //   123: dup
    //   124: new 108	java/lang/StringBuilder
    //   127: dup
    //   128: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   131: aload 4
    //   133: invokevirtual 113	twitter4j/internal/org/json/JSONException:getMessage	()Ljava/lang/String;
    //   136: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: ldc 119
    //   141: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: aload_0
    //   145: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   148: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   154: aload 4
    //   156: invokespecial 124	twitter4j/TwitterException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   159: athrow
    //   160: astore_2
    //   161: aload_1
    //   162: ifnull +7 -> 169
    //   165: aload_1
    //   166: invokevirtual 97	java/io/Reader:close	()V
    //   169: aload_0
    //   170: invokespecial 99	twitter4j/internal/http/HttpResponse:disconnectForcibly	()V
    //   173: aload_2
    //   174: athrow
    //   175: getstatic 32	twitter4j/internal/http/HttpResponse:logger	Ltwitter4j/internal/logging/Logger;
    //   178: astore 6
    //   180: aload_0
    //   181: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   184: ifnull +19 -> 203
    //   187: aload_0
    //   188: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   191: astore 8
    //   193: aload 6
    //   195: aload 8
    //   197: invokevirtual 92	twitter4j/internal/logging/Logger:debug	(Ljava/lang/String;)V
    //   200: goto -128 -> 72
    //   203: aload_0
    //   204: getfield 43	twitter4j/internal/http/HttpResponse:jsonArray	Ltwitter4j/internal/org/json/JSONArray;
    //   207: invokevirtual 125	twitter4j/internal/org/json/JSONArray:toString	()Ljava/lang/String;
    //   210: astore 7
    //   212: aload 7
    //   214: astore 8
    //   216: goto -23 -> 193
    //   219: new 106	twitter4j/TwitterException
    //   222: dup
    //   223: aload 4
    //   225: invokevirtual 113	twitter4j/internal/org/json/JSONException:getMessage	()Ljava/lang/String;
    //   228: aload 4
    //   230: invokespecial 124	twitter4j/TwitterException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   233: athrow
    //   234: astore 9
    //   236: goto -156 -> 80
    //   239: astore_3
    //   240: goto -71 -> 169
    //
    // Exception table:
    //   from	to	target	type
    //   9	15	109	twitter4j/internal/org/json/JSONException
    //   22	46	109	twitter4j/internal/org/json/JSONException
    //   46	72	109	twitter4j/internal/org/json/JSONException
    //   89	104	109	twitter4j/internal/org/json/JSONException
    //   175	193	109	twitter4j/internal/org/json/JSONException
    //   193	200	109	twitter4j/internal/org/json/JSONException
    //   203	212	109	twitter4j/internal/org/json/JSONException
    //   9	15	160	finally
    //   22	46	160	finally
    //   46	72	160	finally
    //   89	104	160	finally
    //   111	160	160	finally
    //   175	193	160	finally
    //   193	200	160	finally
    //   203	212	160	finally
    //   219	234	160	finally
    //   76	80	234	java/io/IOException
    //   165	169	239	java/io/IOException
  }

  // ERROR //
  public JSONObject asJSONObject()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 41	twitter4j/internal/http/HttpResponse:json	Ltwitter4j/internal/org/json/JSONObject;
    //   4: ifnonnull +80 -> 84
    //   7: aconst_null
    //   8: astore_1
    //   9: aload_0
    //   10: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   13: astore 5
    //   15: aconst_null
    //   16: astore_1
    //   17: aload 5
    //   19: ifnonnull +70 -> 89
    //   22: aload_0
    //   23: invokevirtual 68	twitter4j/internal/http/HttpResponse:asReader	()Ljava/io/Reader;
    //   26: astore_1
    //   27: aload_0
    //   28: new 129	twitter4j/internal/org/json/JSONObject
    //   31: dup
    //   32: new 72	twitter4j/internal/org/json/JSONTokener
    //   35: dup
    //   36: aload_1
    //   37: invokespecial 75	twitter4j/internal/org/json/JSONTokener:<init>	(Ljava/io/Reader;)V
    //   40: invokespecial 130	twitter4j/internal/org/json/JSONObject:<init>	(Ltwitter4j/internal/org/json/JSONTokener;)V
    //   43: putfield 41	twitter4j/internal/http/HttpResponse:json	Ltwitter4j/internal/org/json/JSONObject;
    //   46: aload_0
    //   47: getfield 51	twitter4j/internal/http/HttpResponse:CONF	Ltwitter4j/internal/http/HttpClientConfiguration;
    //   50: invokeinterface 84 1 0
    //   55: ifeq +93 -> 148
    //   58: getstatic 32	twitter4j/internal/http/HttpResponse:logger	Ltwitter4j/internal/logging/Logger;
    //   61: aload_0
    //   62: getfield 41	twitter4j/internal/http/HttpResponse:json	Ltwitter4j/internal/org/json/JSONObject;
    //   65: iconst_1
    //   66: invokevirtual 131	twitter4j/internal/org/json/JSONObject:toString	(I)Ljava/lang/String;
    //   69: invokevirtual 92	twitter4j/internal/logging/Logger:debug	(Ljava/lang/String;)V
    //   72: aload_1
    //   73: ifnull +7 -> 80
    //   76: aload_1
    //   77: invokevirtual 97	java/io/Reader:close	()V
    //   80: aload_0
    //   81: invokespecial 99	twitter4j/internal/http/HttpResponse:disconnectForcibly	()V
    //   84: aload_0
    //   85: getfield 41	twitter4j/internal/http/HttpResponse:json	Ltwitter4j/internal/org/json/JSONObject;
    //   88: areturn
    //   89: aload_0
    //   90: new 129	twitter4j/internal/org/json/JSONObject
    //   93: dup
    //   94: aload_0
    //   95: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   98: invokespecial 132	twitter4j/internal/org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   101: putfield 41	twitter4j/internal/http/HttpResponse:json	Ltwitter4j/internal/org/json/JSONObject;
    //   104: aconst_null
    //   105: astore_1
    //   106: goto -60 -> 46
    //   109: astore 4
    //   111: aload_0
    //   112: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   115: ifnonnull +77 -> 192
    //   118: new 106	twitter4j/TwitterException
    //   121: dup
    //   122: aload 4
    //   124: invokevirtual 113	twitter4j/internal/org/json/JSONException:getMessage	()Ljava/lang/String;
    //   127: aload 4
    //   129: invokespecial 124	twitter4j/TwitterException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   132: athrow
    //   133: astore_2
    //   134: aload_1
    //   135: ifnull +7 -> 142
    //   138: aload_1
    //   139: invokevirtual 97	java/io/Reader:close	()V
    //   142: aload_0
    //   143: invokespecial 99	twitter4j/internal/http/HttpResponse:disconnectForcibly	()V
    //   146: aload_2
    //   147: athrow
    //   148: getstatic 32	twitter4j/internal/http/HttpResponse:logger	Ltwitter4j/internal/logging/Logger;
    //   151: astore 6
    //   153: aload_0
    //   154: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   157: ifnull +19 -> 176
    //   160: aload_0
    //   161: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   164: astore 8
    //   166: aload 6
    //   168: aload 8
    //   170: invokevirtual 92	twitter4j/internal/logging/Logger:debug	(Ljava/lang/String;)V
    //   173: goto -101 -> 72
    //   176: aload_0
    //   177: getfield 41	twitter4j/internal/http/HttpResponse:json	Ltwitter4j/internal/org/json/JSONObject;
    //   180: invokevirtual 133	twitter4j/internal/org/json/JSONObject:toString	()Ljava/lang/String;
    //   183: astore 7
    //   185: aload 7
    //   187: astore 8
    //   189: goto -23 -> 166
    //   192: new 106	twitter4j/TwitterException
    //   195: dup
    //   196: new 108	java/lang/StringBuilder
    //   199: dup
    //   200: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   203: aload 4
    //   205: invokevirtual 113	twitter4j/internal/org/json/JSONException:getMessage	()Ljava/lang/String;
    //   208: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: ldc 119
    //   213: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: aload_0
    //   217: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   220: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: aload 4
    //   228: invokespecial 124	twitter4j/TwitterException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   231: athrow
    //   232: astore 9
    //   234: goto -154 -> 80
    //   237: astore_3
    //   238: goto -96 -> 142
    //
    // Exception table:
    //   from	to	target	type
    //   9	15	109	twitter4j/internal/org/json/JSONException
    //   22	46	109	twitter4j/internal/org/json/JSONException
    //   46	72	109	twitter4j/internal/org/json/JSONException
    //   89	104	109	twitter4j/internal/org/json/JSONException
    //   148	166	109	twitter4j/internal/org/json/JSONException
    //   166	173	109	twitter4j/internal/org/json/JSONException
    //   176	185	109	twitter4j/internal/org/json/JSONException
    //   9	15	133	finally
    //   22	46	133	finally
    //   46	72	133	finally
    //   89	104	133	finally
    //   111	133	133	finally
    //   148	166	133	finally
    //   166	173	133	finally
    //   176	185	133	finally
    //   192	232	133	finally
    //   76	80	232	java/io/IOException
    //   138	142	237	java/io/IOException
  }

  public Reader asReader()
  {
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(this.is, "UTF-8"));
      return localBufferedReader;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return new InputStreamReader(this.is);
  }

  public InputStream asStream()
  {
    if (this.streamConsumed)
      throw new IllegalStateException("Stream has already been consumed.");
    return this.is;
  }

  // ERROR //
  public String asString()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   4: ifnonnull +204 -> 208
    //   7: aload_0
    //   8: invokevirtual 160	twitter4j/internal/http/HttpResponse:asStream	()Ljava/io/InputStream;
    //   11: astore 12
    //   13: aload 12
    //   15: astore 8
    //   17: aload 8
    //   19: ifnonnull +19 -> 38
    //   22: aload 8
    //   24: ifnull +8 -> 32
    //   27: aload 8
    //   29: invokevirtual 163	java/io/InputStream:close	()V
    //   32: aload_0
    //   33: invokespecial 99	twitter4j/internal/http/HttpResponse:disconnectForcibly	()V
    //   36: aconst_null
    //   37: areturn
    //   38: new 137	java/io/BufferedReader
    //   41: dup
    //   42: new 139	java/io/InputStreamReader
    //   45: dup
    //   46: aload 8
    //   48: ldc 143
    //   50: invokespecial 146	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   53: invokespecial 147	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   56: astore 7
    //   58: new 108	java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   65: astore 13
    //   67: aload 7
    //   69: invokevirtual 166	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   72: astore 15
    //   74: aload 15
    //   76: ifnull +84 -> 160
    //   79: aload 13
    //   81: aload 15
    //   83: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: ldc 168
    //   88: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: pop
    //   92: goto -25 -> 67
    //   95: astore_2
    //   96: aload 8
    //   98: astore 14
    //   100: aload 7
    //   102: astore 4
    //   104: aload 14
    //   106: astore_3
    //   107: new 106	twitter4j/TwitterException
    //   110: dup
    //   111: aload_2
    //   112: invokevirtual 169	java/io/IOException:getMessage	()Ljava/lang/String;
    //   115: aload_2
    //   116: invokespecial 124	twitter4j/TwitterException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   119: athrow
    //   120: astore 5
    //   122: aload_3
    //   123: astore 6
    //   125: aload 4
    //   127: astore 7
    //   129: aload 6
    //   131: astore 8
    //   133: aload 8
    //   135: ifnull +8 -> 143
    //   138: aload 8
    //   140: invokevirtual 163	java/io/InputStream:close	()V
    //   143: aload 7
    //   145: ifnull +8 -> 153
    //   148: aload 7
    //   150: invokevirtual 170	java/io/BufferedReader:close	()V
    //   153: aload_0
    //   154: invokespecial 99	twitter4j/internal/http/HttpResponse:disconnectForcibly	()V
    //   157: aload 5
    //   159: athrow
    //   160: aload_0
    //   161: aload 13
    //   163: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: putfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   169: getstatic 32	twitter4j/internal/http/HttpResponse:logger	Ltwitter4j/internal/logging/Logger;
    //   172: aload_0
    //   173: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   176: invokevirtual 92	twitter4j/internal/logging/Logger:debug	(Ljava/lang/String;)V
    //   179: aload 8
    //   181: invokevirtual 163	java/io/InputStream:close	()V
    //   184: aload_0
    //   185: iconst_1
    //   186: putfield 39	twitter4j/internal/http/HttpResponse:streamConsumed	Z
    //   189: aload 8
    //   191: ifnull +8 -> 199
    //   194: aload 8
    //   196: invokevirtual 163	java/io/InputStream:close	()V
    //   199: aload 7
    //   201: invokevirtual 170	java/io/BufferedReader:close	()V
    //   204: aload_0
    //   205: invokespecial 99	twitter4j/internal/http/HttpResponse:disconnectForcibly	()V
    //   208: aload_0
    //   209: getfield 37	twitter4j/internal/http/HttpResponse:responseAsString	Ljava/lang/String;
    //   212: areturn
    //   213: astore 21
    //   215: goto -183 -> 32
    //   218: astore 18
    //   220: goto -21 -> 199
    //   223: astore 17
    //   225: goto -21 -> 204
    //   228: astore 10
    //   230: goto -87 -> 143
    //   233: astore 9
    //   235: goto -82 -> 153
    //   238: astore 11
    //   240: aload 11
    //   242: astore 5
    //   244: aconst_null
    //   245: astore 7
    //   247: aconst_null
    //   248: astore 8
    //   250: goto -117 -> 133
    //   253: astore 20
    //   255: aload 20
    //   257: astore 5
    //   259: aconst_null
    //   260: astore 7
    //   262: goto -129 -> 133
    //   265: astore 5
    //   267: goto -134 -> 133
    //   270: astore_1
    //   271: aload_1
    //   272: astore_2
    //   273: aconst_null
    //   274: astore_3
    //   275: aconst_null
    //   276: astore 4
    //   278: goto -171 -> 107
    //   281: astore 19
    //   283: aload 8
    //   285: astore_3
    //   286: aload 19
    //   288: astore_2
    //   289: aconst_null
    //   290: astore 4
    //   292: goto -185 -> 107
    //
    // Exception table:
    //   from	to	target	type
    //   58	67	95	java/io/IOException
    //   67	74	95	java/io/IOException
    //   79	92	95	java/io/IOException
    //   160	189	95	java/io/IOException
    //   107	120	120	finally
    //   27	32	213	java/io/IOException
    //   194	199	218	java/io/IOException
    //   199	204	223	java/io/IOException
    //   138	143	228	java/io/IOException
    //   148	153	233	java/io/IOException
    //   7	13	238	finally
    //   38	58	253	finally
    //   58	67	265	finally
    //   67	74	265	finally
    //   79	92	265	finally
    //   160	189	265	finally
    //   7	13	270	java/io/IOException
    //   38	58	281	java/io/IOException
  }

  public abstract void disconnect();

  public abstract String getResponseHeader(String paramString);

  public abstract Map<String, List<String>> getResponseHeaderFields();

  public int getStatusCode()
  {
    return this.statusCode;
  }

  public String toString()
  {
    return "HttpResponse{statusCode=" + this.statusCode + ", responseAsString='" + this.responseAsString + '\'' + ", is=" + this.is + ", streamConsumed=" + this.streamConsumed + '}';
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.http.HttpResponse
 * JD-Core Version:    0.6.2
 */