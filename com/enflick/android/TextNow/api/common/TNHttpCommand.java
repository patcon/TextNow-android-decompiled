package com.enflick.android.TextNow.api.common;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import textnow.q.aa;
import textnow.s.h;
import textnow.s.i;
import textnow.t.d;
import textnow.t.e;
import textnow.t.g;
import textnow.u.r;

public abstract class TNHttpCommand extends textnow.s.c
{
  private static final String TAG = "TNHttpCommand";
  private static final String USER_AGENT_FORMAT = "TextNow %1$s (%2$s; Android OS %3$s; %4$s)";
  private static String sUserAgent;

  public TNHttpCommand(Context paramContext)
  {
    super(paramContext);
  }

  public static String buildUserAgent(Context paramContext)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = textnow.q.b.a(paramContext);
    arrayOfObject[1] = Build.MODEL;
    arrayOfObject[2] = Build.VERSION.RELEASE;
    arrayOfObject[3] = Locale.getDefault().toString();
    return String.format("TextNow %1$s (%2$s; Android OS %3$s; %4$s)", arrayOfObject);
  }

  protected URI buildURI()
  {
    c localc = (c)getRequest().b();
    String str1 = getPath(localc);
    Map localMap = localc.b();
    String str2 = a.a(this.mContext, localMap);
    String str3 = a.a(getMethod(), str1 + str2, localc.a());
    return URI.create(aa.a + str1 + str2 + "&signature=" + str3);
  }

  protected String getContentType()
  {
    return "application/x-www-form-urlencoded";
  }

  protected HttpEntity getEntityBody()
  {
    String str = ((c)getRequest().b()).a();
    if (!TextUtils.isEmpty(str))
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new BasicNameValuePair("json", str));
      new StringBuilder().append(getClass().getSimpleName()).append(" request body: ").append(str).toString();
      try
      {
        UrlEncodedFormEntity localUrlEncodedFormEntity = new UrlEncodedFormEntity(localArrayList, "UTF-8");
        return localUrlEncodedFormEntity;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        Log.getStackTraceString(localUnsupportedEncodingException);
      }
    }
    return null;
  }

  protected Object getErrorResponse(Exception paramException)
  {
    if (((paramException instanceof HttpHostConnectException)) || ((paramException instanceof UnknownHostException)))
      return "NO_NETWORK";
    return super.getErrorResponse(paramException);
  }

  protected Object getErrorResponse(HttpResponse paramHttpResponse)
  {
    if (paramHttpResponse.getEntity() == null)
      return "";
    try
    {
      String str = getResponseAsString(paramHttpResponse.getEntity().getContent());
      return str;
    }
    catch (Exception localException)
    {
      Log.getStackTraceString(localException);
      return getErrorResponse(localException);
    }
  }

  protected String getPath(c paramc)
  {
    TreeMap localTreeMap = new TreeMap();
    Field[] arrayOfField = paramc.getClass().getFields();
    int i = arrayOfField.length;
    int j = 0;
    while (true)
      if (j < i)
      {
        Field localField = arrayOfField[j];
        e locale = (e)localField.getAnnotation(e.class);
        if (locale != null);
        try
        {
          localTreeMap.put(Integer.valueOf(locale.a()), URLEncoder.encode(String.valueOf(localField.get(paramc)), "UTF-8"));
          j++;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          while (true)
            localIllegalArgumentException.printStackTrace();
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          while (true)
            localIllegalAccessException.printStackTrace();
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          while (true)
            localUnsupportedEncodingException.printStackTrace();
        }
      }
    String str = ((d)getClass().getAnnotation(d.class)).a();
    if (localTreeMap.size() > 0)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localTreeMap.entrySet().iterator();
      while (localIterator.hasNext())
        localArrayList.add(((Map.Entry)localIterator.next()).getValue());
      return new MessageFormat(str).format(localArrayList.toArray());
    }
    return str;
  }

  protected Object getSuccessResponse(HttpResponse paramHttpResponse)
  {
    Object localObject = super.getSuccessResponse(paramHttpResponse);
    if ((localObject instanceof InputStream));
    try
    {
      String str = getResponseAsString((InputStream)localObject);
      localObject = str;
      return localObject;
    }
    catch (IOException localIOException)
    {
      Log.getStackTraceString(localIOException);
    }
    return null;
  }

  protected String getUserAgent()
  {
    if (sUserAgent == null)
      sUserAgent = buildUserAgent(this.mContext);
    return sUserAgent;
  }

  public void handleError(i parami)
  {
    Object localObject = parami.b();
    if ((!(localObject instanceof String)) || (TextUtils.isEmpty((String)localObject)) || (((String)localObject).startsWith("{")));
    while (true)
    {
      try
      {
        parami.c(new JSONObject((String)localObject).getString("error_code"));
        new StringBuilder().append(getClass().getSimpleName()).append(" ERROR - requestID:").append(parami.a()).append(" code:").append(parami.d()).append(" error: ").append(parami.c()).toString();
        return;
      }
      catch (JSONException localJSONException)
      {
        Log.getStackTraceString(localJSONException);
        continue;
      }
      parami.c(localObject);
    }
  }

  public void handleSuccess(i parami)
  {
    if (!getClass().isAnnotationPresent(g.class));
    Object localObject1;
    do
    {
      return;
      localObject1 = parami.b();
    }
    while ((!(localObject1 instanceof String)) || (TextUtils.isEmpty((String)localObject1)));
    String str = (String)localObject1;
    Class localClass = ((g)getClass().getAnnotation(g.class)).a();
    while (true)
    {
      Object localObject2;
      try
      {
        if (str.startsWith("{"))
        {
          localObject2 = new JSONObject(str);
          if (localObject2 == null)
            break;
          parami.c(b.a(localObject2, localClass));
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        new StringBuilder().append("Error parsing json string: ").append(str).toString();
        return;
      }
      if (str.startsWith("["))
      {
        localObject2 = new JSONArray(str);
      }
      else if (localClass == String.class)
      {
        parami.c(str);
        localObject2 = null;
      }
      else
      {
        new StringBuilder().append("Unable to detect type of JSON data - returning responseString: ").append(str).toString();
        localObject2 = null;
      }
    }
  }

  protected boolean isDebugLogOn()
  {
    return textnow.q.a.a;
  }

  protected void onAfterExecute()
  {
    super.onAfterExecute();
    i locali = getResponse();
    long l = locali.f().getTime() - new Date().getTime();
    r localr = new r(this.mContext);
    localr.b(l);
    localr.n();
    if (locali.e())
    {
      handleError(locali);
      return;
    }
    handleSuccess(locali);
  }

  public i runSync(c paramc)
  {
    h localh = new h();
    localh.a(paramc);
    setRequest(localh);
    run();
    return getResponse();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.common.TNHttpCommand
 * JD-Core Version:    0.6.2
 */