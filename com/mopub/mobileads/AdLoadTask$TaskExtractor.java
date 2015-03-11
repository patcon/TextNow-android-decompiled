package com.mopub.mobileads;

import android.net.Uri;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Json;
import com.mopub.common.util.ResponseHeader;
import com.mopub.common.util.Strings;
import com.mopub.mobileads.util.HttpResponses;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

class AdLoadTask$TaskExtractor
{
  private String adType;
  private String adTypeCustomEventName;
  private final AdViewController adViewController;
  private String fullAdType;
  private final HttpResponse response;

  AdLoadTask$TaskExtractor(HttpResponse paramHttpResponse, AdViewController paramAdViewController)
  {
    this.response = paramHttpResponse;
    this.adViewController = paramAdViewController;
  }

  private AdLoadTask createCustomEventAdLoadTask(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(ResponseHeader.CUSTOM_EVENT_NAME.getKey(), this.adTypeCustomEventName);
    if (paramString != null)
      localHashMap.put(ResponseHeader.CUSTOM_EVENT_DATA.getKey(), paramString);
    return new AdLoadTask.CustomEventAdLoadTask(this.adViewController, localHashMap);
  }

  private boolean eventDataIsInResponseBody(String paramString)
  {
    return ("mraid".equals(paramString)) || ("html".equals(paramString)) || (("interstitial".equals(paramString)) && ("vast".equals(this.fullAdType)));
  }

  private AdLoadTask extractCustomEventAdLoadTask()
  {
    MoPubLog.i("Performing custom event.");
    this.adTypeCustomEventName = HttpResponses.extractHeader(this.response, ResponseHeader.CUSTOM_EVENT_NAME);
    if (this.adTypeCustomEventName != null)
      return createCustomEventAdLoadTask(HttpResponses.extractHeader(this.response, ResponseHeader.CUSTOM_EVENT_DATA));
    Header localHeader = this.response.getFirstHeader(ResponseHeader.CUSTOM_SELECTOR.getKey());
    return new AdLoadTask.LegacyCustomEventAdLoadTask(this.adViewController, localHeader);
  }

  private AdLoadTask extractCustomEventAdLoadTaskFromNativeParams()
  {
    return createCustomEventAdLoadTask(HttpResponses.extractHeader(this.response, ResponseHeader.NATIVE_PARAMS));
  }

  private AdLoadTask extractCustomEventAdLoadTaskFromResponseBody()
  {
    HttpEntity localHttpEntity = this.response.getEntity();
    if (localHttpEntity != null);
    for (String str1 = Strings.fromStream(localHttpEntity.getContent()); ; str1 = "")
    {
      this.adViewController.getAdConfiguration().setResponseString(str1);
      String str2 = HttpResponses.extractHeader(this.response, ResponseHeader.REDIRECT_URL);
      String str3 = HttpResponses.extractHeader(this.response, ResponseHeader.CLICKTHROUGH_URL);
      boolean bool = HttpResponses.extractBooleanHeader(this.response, ResponseHeader.SCROLLABLE, false);
      HashMap localHashMap = new HashMap();
      localHashMap.put("Html-Response-Body", Uri.encode(str1));
      localHashMap.put("Scrollable", Boolean.toString(bool));
      if (str2 != null)
        localHashMap.put("Redirect-Url", str2);
      if (str3 != null)
        localHashMap.put("Clickthrough-Url", str3);
      return createCustomEventAdLoadTask(Json.mapToJsonString(localHashMap));
    }
  }

  AdLoadTask extract()
  {
    this.adType = HttpResponses.extractHeader(this.response, ResponseHeader.AD_TYPE);
    this.fullAdType = HttpResponses.extractHeader(this.response, ResponseHeader.FULL_AD_TYPE);
    MoPubLog.d("Loading ad type: " + AdTypeTranslator.getAdNetworkType(this.adType, this.fullAdType));
    this.adTypeCustomEventName = AdTypeTranslator.getCustomEventNameForAdType(this.adViewController.getMoPubView(), this.adType, this.fullAdType);
    if ("custom".equals(this.adType))
      return extractCustomEventAdLoadTask();
    if (eventDataIsInResponseBody(this.adType))
      return extractCustomEventAdLoadTaskFromResponseBody();
    return extractCustomEventAdLoadTaskFromNativeParams();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.AdLoadTask.TaskExtractor
 * JD-Core Version:    0.6.2
 */