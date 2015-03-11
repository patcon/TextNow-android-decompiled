package com.facebook;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.model.GraphObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import textnow.m.c;
import textnow.m.d;
import textnow.m.h;
import textnow.m.i;
import textnow.m.j;

public class FacebookAppLinkResolver
{
  private static final String APP_LINK_ANDROID_TARGET_KEY = "android";
  private static final String APP_LINK_KEY = "app_links";
  private static final String APP_LINK_TARGET_APP_NAME_KEY = "app_name";
  private static final String APP_LINK_TARGET_CLASS_KEY = "class";
  private static final String APP_LINK_TARGET_PACKAGE_KEY = "package";
  private static final String APP_LINK_TARGET_SHOULD_FALLBACK_KEY = "should_fallback";
  private static final String APP_LINK_TARGET_URL_KEY = "url";
  private static final String APP_LINK_WEB_TARGET_KEY = "web";
  private final HashMap<Uri, c> cachedAppLinks = new HashMap();

  private static d getAndroidTargetFromJson(JSONObject paramJSONObject)
  {
    String str1 = tryGetStringFromJson(paramJSONObject, "package", null);
    if (str1 == null)
      return null;
    String str2 = tryGetStringFromJson(paramJSONObject, "class", null);
    String str3 = tryGetStringFromJson(paramJSONObject, "app_name", null);
    String str4 = tryGetStringFromJson(paramJSONObject, "url", null);
    Uri localUri = null;
    if (str4 != null)
      localUri = Uri.parse(str4);
    return new d(str1, str2, localUri, str3);
  }

  private static Uri getWebFallbackUriFromJson(Uri paramUri, JSONObject paramJSONObject)
  {
    try
    {
      JSONObject localJSONObject = paramJSONObject.getJSONObject("web");
      if (!tryGetBooleanFromJson(localJSONObject, "should_fallback", true))
        return null;
      String str = tryGetStringFromJson(localJSONObject, "url", null);
      Object localObject = null;
      if (str != null)
      {
        Uri localUri = Uri.parse(str);
        localObject = localUri;
      }
      if (localObject != null)
        return localObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return paramUri;
  }

  private static boolean tryGetBooleanFromJson(JSONObject paramJSONObject, String paramString, boolean paramBoolean)
  {
    try
    {
      boolean bool = paramJSONObject.getBoolean(paramString);
      return bool;
    }
    catch (JSONException localJSONException)
    {
    }
    return paramBoolean;
  }

  private static String tryGetStringFromJson(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    try
    {
      String str = paramJSONObject.getString(paramString1);
      return str;
    }
    catch (JSONException localJSONException)
    {
    }
    return paramString2;
  }

  public i<c> getAppLinkFromUrlInBackground(final Uri paramUri)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramUri);
    return getAppLinkFromUrlsInBackground(localArrayList).b(new h()
    {
      public c then(i<Map<Uri, c>> paramAnonymousi)
      {
        return (c)((Map)paramAnonymousi.d()).get(paramUri);
      }
    });
  }

  public i<Map<Uri, c>> getAppLinkFromUrlsInBackground(List<Uri> paramList)
  {
    final HashMap localHashMap1 = new HashMap();
    final HashSet localHashSet = new HashSet();
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Uri localUri = (Uri)localIterator.next();
      synchronized (this.cachedAppLinks)
      {
        c localc = (c)this.cachedAppLinks.get(localUri);
        if (localc != null)
          localHashMap1.put(localUri, localc);
      }
      localStringBuilder.append(',');
      localStringBuilder.append(localUri.toString());
      localHashSet.add(localUri);
    }
    if (localHashSet.isEmpty())
      return i.a(localHashMap1);
    final j localj = i.a();
    Bundle localBundle = new Bundle();
    localBundle.putString("ids", localStringBuilder.toString());
    localBundle.putString("fields", String.format("%s.fields(%s,%s)", new Object[] { "app_links", "android", "web" }));
    new Request(null, "", localBundle, null, new Request.Callback()
    {
      public void onCompleted(Response paramAnonymousResponse)
      {
        FacebookRequestError localFacebookRequestError = paramAnonymousResponse.getError();
        if (localFacebookRequestError != null)
        {
          localj.a(localFacebookRequestError.getException());
          return;
        }
        GraphObject localGraphObject = paramAnonymousResponse.getGraphObject();
        if (localGraphObject != null);
        for (JSONObject localJSONObject1 = localGraphObject.getInnerJSONObject(); localJSONObject1 == null; localJSONObject1 = null)
        {
          localj.a(localHashMap1);
          return;
        }
        Iterator localIterator = localHashSet.iterator();
        Uri localUri;
        do
        {
          if (!localIterator.hasNext())
            break;
          localUri = (Uri)localIterator.next();
        }
        while (!localJSONObject1.has(localUri.toString()));
        while (true)
        {
          int j;
          try
          {
            while (true)
            {
              JSONObject localJSONObject2 = localJSONObject1.getJSONObject(localUri.toString()).getJSONObject("app_links");
              JSONArray localJSONArray = localJSONObject2.getJSONArray("android");
              int i = localJSONArray.length();
              ArrayList localArrayList = new ArrayList(i);
              j = 0;
              if (j < i)
              {
                d locald = FacebookAppLinkResolver.getAndroidTargetFromJson(localJSONArray.getJSONObject(j));
                if (locald == null)
                  break;
                localArrayList.add(locald);
                break;
              }
              c localc = new c(localUri, localArrayList, FacebookAppLinkResolver.getWebFallbackUriFromJson(localUri, localJSONObject2));
              localHashMap1.put(localUri, localc);
              synchronized (FacebookAppLinkResolver.this.cachedAppLinks)
              {
                FacebookAppLinkResolver.this.cachedAppLinks.put(localUri, localc);
              }
            }
          }
          catch (JSONException localJSONException)
          {
          }
          break;
          localj.a(localHashMap1);
          return;
          j++;
        }
      }
    }).executeAsync();
    return localj.a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookAppLinkResolver
 * JD-Core Version:    0.6.2
 */