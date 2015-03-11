package com.facebook;

import android.os.Bundle;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObject.Factory;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

class AppEventsLogger$SessionEventsState
{
  public static final String ENCODED_EVENTS_KEY = "encoded_events";
  public static final String EVENT_COUNT_KEY = "event_count";
  public static final String NUM_SKIPPED_KEY = "num_skipped";
  private final int MAX_ACCUMULATED_LOG_EVENTS = 1000;
  private List<AppEventsLogger.AppEvent> accumulatedEvents = new ArrayList();
  private AttributionIdentifiers attributionIdentifiers;
  private String hashedDeviceAndAppId;
  private List<AppEventsLogger.AppEvent> inFlightEvents = new ArrayList();
  private int numSkippedEventsDueToFullBuffer;
  private String packageName;

  public AppEventsLogger$SessionEventsState(AttributionIdentifiers paramAttributionIdentifiers, String paramString1, String paramString2)
  {
    this.attributionIdentifiers = paramAttributionIdentifiers;
    this.packageName = paramString1;
    this.hashedDeviceAndAppId = paramString2;
  }

  private byte[] getStringAsByteArray(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Utility.logd("Encoding exception: ", localUnsupportedEncodingException);
    }
    return null;
  }

  private void populateRequest(Request paramRequest, int paramInt, JSONArray paramJSONArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    GraphObject localGraphObject = GraphObject.Factory.create();
    localGraphObject.setProperty("event", "CUSTOM_APP_EVENTS");
    if (this.numSkippedEventsDueToFullBuffer > 0)
      localGraphObject.setProperty("num_skipped_events", Integer.valueOf(paramInt));
    if (paramBoolean1)
      Utility.setAppEventAttributionParameters(localGraphObject, this.attributionIdentifiers, this.hashedDeviceAndAppId, paramBoolean2);
    try
    {
      Utility.setAppEventExtendedDeviceInfoParameters(localGraphObject, AppEventsLogger.access$1000());
      label64: localGraphObject.setProperty("application_package_name", this.packageName);
      paramRequest.setGraphObject(localGraphObject);
      Bundle localBundle = paramRequest.getParameters();
      if (localBundle == null)
        localBundle = new Bundle();
      String str = paramJSONArray.toString();
      if (str != null)
      {
        localBundle.putByteArray("custom_events_file", getStringAsByteArray(str));
        paramRequest.setTag(str);
      }
      paramRequest.setParameters(localBundle);
      return;
    }
    catch (Exception localException)
    {
      break label64;
    }
  }

  public void accumulatePersistedEvents(List<AppEventsLogger.AppEvent> paramList)
  {
    try
    {
      this.accumulatedEvents.addAll(paramList);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void addEvent(AppEventsLogger.AppEvent paramAppEvent)
  {
    try
    {
      if (this.accumulatedEvents.size() + this.inFlightEvents.size() >= 1000)
        this.numSkippedEventsDueToFullBuffer = (1 + this.numSkippedEventsDueToFullBuffer);
      while (true)
      {
        return;
        this.accumulatedEvents.add(paramAppEvent);
      }
    }
    finally
    {
    }
  }

  public void clearInFlightAndStats(boolean paramBoolean)
  {
    if (paramBoolean);
    try
    {
      this.accumulatedEvents.addAll(this.inFlightEvents);
      this.inFlightEvents.clear();
      this.numSkippedEventsDueToFullBuffer = 0;
      return;
    }
    finally
    {
    }
  }

  public int getAccumulatedEventCount()
  {
    try
    {
      int i = this.accumulatedEvents.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public List<AppEventsLogger.AppEvent> getEventsToPersist()
  {
    try
    {
      List localList = this.accumulatedEvents;
      this.accumulatedEvents = new ArrayList();
      return localList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public int populateRequest(Request paramRequest, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i;
    JSONArray localJSONArray;
    try
    {
      i = this.numSkippedEventsDueToFullBuffer;
      this.inFlightEvents.addAll(this.accumulatedEvents);
      this.accumulatedEvents.clear();
      localJSONArray = new JSONArray();
      Iterator localIterator = this.inFlightEvents.iterator();
      while (localIterator.hasNext())
      {
        AppEventsLogger.AppEvent localAppEvent = (AppEventsLogger.AppEvent)localIterator.next();
        if ((paramBoolean1) || (!localAppEvent.getIsImplicit()))
          localJSONArray.put(localAppEvent.getJSONObject());
      }
    }
    finally
    {
    }
    if (localJSONArray.length() == 0)
      return 0;
    populateRequest(paramRequest, i, localJSONArray, paramBoolean2, paramBoolean3);
    return localJSONArray.length();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.SessionEventsState
 * JD-Core Version:    0.6.2
 */