package com.mopub.nativeads;

import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Numbers;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

class MoPubCustomEventNative$MoPubForwardingNativeAd extends BaseForwardingNativeAd
{
  MoPubCustomEventNative$MoPubForwardingNativeAd(String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Json String cannot be null");
    JSONObject localJSONObject = new JSONObject(new JSONTokener(paramString));
    if (!containsRequiredKeys(localJSONObject))
      throw new IllegalArgumentException("JSONObject did not contain required keys.");
    Iterator localIterator = localJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      NativeResponse.Parameter localParameter = NativeResponse.Parameter.from(str);
      if (localParameter != null)
        try
        {
          addInstanceVariable(localParameter, localJSONObject.opt(str));
        }
        catch (ClassCastException localClassCastException)
        {
          throw new IllegalArgumentException("JSONObject key (" + str + ") contained unexpected value.");
        }
      else
        addExtra(str, localJSONObject.opt(str));
    }
  }

  private void addImpressionTrackers(Object paramObject)
  {
    if (!(paramObject instanceof JSONArray))
      throw new ClassCastException("Expected impression trackers of type JSONArray.");
    JSONArray localJSONArray = (JSONArray)paramObject;
    int i = 0;
    while (true)
      if (i < localJSONArray.length())
        try
        {
          addImpressionTracker(localJSONArray.getString(i));
          i++;
        }
        catch (JSONException localJSONException)
        {
          while (true)
            MoPubLog.d("Unable to parse impression trackers.");
        }
  }

  private void addInstanceVariable(NativeResponse.Parameter paramParameter, Object paramObject)
  {
    try
    {
      switch (MoPubCustomEventNative.2.$SwitchMap$com$mopub$nativeads$NativeResponse$Parameter[paramParameter.ordinal()])
      {
      default:
        MoPubLog.d("Unable to add JSON key to internal mapping: " + paramParameter.name);
        return;
      case 1:
        setMainImageUrl((String)paramObject);
        return;
      case 2:
      case 3:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 4:
      }
    }
    catch (ClassCastException localClassCastException)
    {
      if (!paramParameter.required)
      {
        MoPubLog.d("Ignoring class cast exception for optional key: " + paramParameter.name);
        return;
        setIconImageUrl((String)paramObject);
        return;
        addImpressionTrackers(paramObject);
        return;
        setClickDestinationUrl((String)paramObject);
        return;
        setCallToAction((String)paramObject);
        return;
        setTitle((String)paramObject);
        return;
        setText((String)paramObject);
        return;
        setStarRating(Numbers.parseDouble(paramObject));
        return;
      }
      throw localClassCastException;
    }
  }

  private boolean containsRequiredKeys(JSONObject paramJSONObject)
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
      localHashSet.add(localIterator.next());
    return localHashSet.containsAll(NativeResponse.Parameter.requiredKeys);
  }

  private boolean isImageKey(String paramString)
  {
    return (paramString != null) && (paramString.toLowerCase().endsWith("image"));
  }

  List<String> getAllImageUrls()
  {
    ArrayList localArrayList = new ArrayList();
    if (getMainImageUrl() != null)
      localArrayList.add(getMainImageUrl());
    if (getIconImageUrl() != null)
      localArrayList.add(getIconImageUrl());
    localArrayList.addAll(getExtrasImageUrls());
    return localArrayList;
  }

  List<String> getExtrasImageUrls()
  {
    ArrayList localArrayList = new ArrayList(getExtras().size());
    Iterator localIterator = getExtras().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((isImageKey((String)localEntry.getKey())) && ((localEntry.getValue() instanceof String)))
        localArrayList.add((String)localEntry.getValue());
    }
    return localArrayList;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.MoPubCustomEventNative.MoPubForwardingNativeAd
 * JD-Core Version:    0.6.2
 */