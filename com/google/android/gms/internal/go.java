package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class go extends gg
{
  private static final long Cp = TimeUnit.HOURS.toMillis(24L);
  private static final long Cq = TimeUnit.HOURS.toMillis(24L);
  private static final long Cr = TimeUnit.HOURS.toMillis(24L);
  private static final long Cs = TimeUnit.SECONDS.toMillis(1L);
  private static final String NAMESPACE = gi.al("com.google.cast.media");
  private final gr CA;
  private final gr CB;
  private final gr CC;
  private final gr CD;
  private final gr CE;
  private final List<gr> CF = new ArrayList();
  private final Runnable CG = new go.a(this, null);
  private boolean CH;
  private long Ct;
  private MediaStatus Cu;
  private final gr Cv = new gr(Cq);
  private final gr Cw;
  private final gr Cx;
  private final gr Cy;
  private final gr Cz;
  private final Handler mHandler = new Handler(Looper.getMainLooper());

  public go()
  {
    this(null);
  }

  public go(String paramString)
  {
    super(NAMESPACE, "MediaControlChannel", paramString);
    this.CF.add(this.Cv);
    this.Cw = new gr(Cp);
    this.CF.add(this.Cw);
    this.Cx = new gr(Cp);
    this.CF.add(this.Cx);
    this.Cy = new gr(Cp);
    this.CF.add(this.Cy);
    this.Cz = new gr(Cr);
    this.CF.add(this.Cz);
    this.CA = new gr(Cp);
    this.CF.add(this.CA);
    this.CB = new gr(Cp);
    this.CF.add(this.CB);
    this.CC = new gr(Cp);
    this.CF.add(this.CC);
    this.CD = new gr(Cp);
    this.CF.add(this.CD);
    this.CE = new gr(Cp);
    this.CF.add(this.CE);
    et();
  }

  private void a(long paramLong, JSONObject paramJSONObject)
  {
    int i = 1;
    boolean bool = this.Cv.p(paramLong);
    int j;
    if ((this.Cz.ev()) && (!this.Cz.p(paramLong)))
    {
      j = i;
      if (((!this.CA.ev()) || (this.CA.p(paramLong))) && ((!this.CB.ev()) || (this.CB.p(paramLong))))
        break label227;
      label80: if (j == 0)
        break label249;
    }
    label227: label249: for (int k = 2; ; k = 0)
    {
      if (i != 0)
        k |= 1;
      if ((bool) || (this.Cu == null))
      {
        this.Cu = new MediaStatus(paramJSONObject);
        this.Ct = SystemClock.elapsedRealtime();
      }
      for (int m = 7; ; m = this.Cu.a(paramJSONObject, k))
      {
        if ((m & 0x1) != 0)
        {
          this.Ct = SystemClock.elapsedRealtime();
          onStatusUpdated();
        }
        if ((m & 0x2) != 0)
        {
          this.Ct = SystemClock.elapsedRealtime();
          onStatusUpdated();
        }
        if ((m & 0x4) != 0)
          onMetadataUpdated();
        Iterator localIterator = this.CF.iterator();
        while (localIterator.hasNext())
          ((gr)localIterator.next()).c(paramLong, 0);
        j = 0;
        break;
        i = 0;
        break label80;
      }
      return;
    }
  }

  private void et()
  {
    z(false);
    this.Ct = 0L;
    this.Cu = null;
    this.Cv.clear();
    this.Cz.clear();
    this.CA.clear();
  }

  private void z(boolean paramBoolean)
  {
    if (this.CH != paramBoolean)
    {
      this.CH = paramBoolean;
      if (paramBoolean)
        this.mHandler.postDelayed(this.CG, Cs);
    }
    else
    {
      return;
    }
    this.mHandler.removeCallbacks(this.CG);
  }

  public long a(gq paramgq)
  {
    JSONObject localJSONObject = new JSONObject();
    long l = ed();
    this.CC.a(l, paramgq);
    z(true);
    try
    {
      localJSONObject.put("requestId", l);
      localJSONObject.put("type", "GET_STATUS");
      if (this.Cu != null)
        localJSONObject.put("mediaSessionId", this.Cu.ea());
      label65: a(localJSONObject.toString(), l, null);
      return l;
    }
    catch (JSONException localJSONException)
    {
      break label65;
    }
  }

  public long a(gq paramgq, double paramDouble, JSONObject paramJSONObject)
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble)))
      throw new IllegalArgumentException("Volume cannot be " + paramDouble);
    JSONObject localJSONObject1 = new JSONObject();
    long l = ed();
    this.CA.a(l, paramgq);
    z(true);
    try
    {
      localJSONObject1.put("requestId", l);
      localJSONObject1.put("type", "SET_VOLUME");
      localJSONObject1.put("mediaSessionId", ea());
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("level", paramDouble);
      localJSONObject1.put("volume", localJSONObject2);
      if (paramJSONObject != null)
        localJSONObject1.put("customData", paramJSONObject);
      label151: a(localJSONObject1.toString(), l, null);
      return l;
    }
    catch (JSONException localJSONException)
    {
      break label151;
    }
  }

  public long a(gq paramgq, long paramLong, int paramInt, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l = ed();
    this.Cz.a(l, paramgq);
    z(true);
    try
    {
      localJSONObject.put("requestId", l);
      localJSONObject.put("type", "SEEK");
      localJSONObject.put("mediaSessionId", ea());
      localJSONObject.put("currentTime", gi.o(paramLong));
      if (paramInt == 1)
        localJSONObject.put("resumeState", "PLAYBACK_START");
      while (true)
      {
        if (paramJSONObject != null)
          localJSONObject.put("customData", paramJSONObject);
        label110: a(localJSONObject.toString(), l, null);
        return l;
        if (paramInt == 2)
          localJSONObject.put("resumeState", "PLAYBACK_PAUSE");
      }
    }
    catch (JSONException localJSONException)
    {
      break label110;
    }
  }

  public long a(gq paramgq, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l = ed();
    this.Cv.a(l, paramgq);
    z(true);
    try
    {
      localJSONObject.put("requestId", l);
      localJSONObject.put("type", "LOAD");
      localJSONObject.put("media", paramMediaInfo.dZ());
      localJSONObject.put("autoplay", paramBoolean);
      localJSONObject.put("currentTime", gi.o(paramLong));
      if (paramJSONObject != null)
        localJSONObject.put("customData", paramJSONObject);
      label104: a(localJSONObject.toString(), l, null);
      return l;
    }
    catch (JSONException localJSONException)
    {
      break label104;
    }
  }

  public long a(gq paramgq, TextTrackStyle paramTextTrackStyle)
  {
    JSONObject localJSONObject = new JSONObject();
    long l = ed();
    this.CE.a(l, paramgq);
    z(true);
    try
    {
      localJSONObject.put("requestId", l);
      localJSONObject.put("type", "EDIT_TRACKS_INFO");
      if (paramTextTrackStyle != null)
        localJSONObject.put("textTrackStyle", paramTextTrackStyle.dZ());
      localJSONObject.put("mediaSessionId", ea());
      label75: a(localJSONObject.toString(), l, null);
      return l;
    }
    catch (JSONException localJSONException)
    {
      break label75;
    }
  }

  public long a(gq paramgq, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l = ed();
    this.Cw.a(l, paramgq);
    z(true);
    try
    {
      localJSONObject.put("requestId", l);
      localJSONObject.put("type", "PAUSE");
      localJSONObject.put("mediaSessionId", ea());
      if (paramJSONObject != null)
        localJSONObject.put("customData", paramJSONObject);
      label72: a(localJSONObject.toString(), l, null);
      return l;
    }
    catch (JSONException localJSONException)
    {
      break label72;
    }
  }

  public long a(gq paramgq, boolean paramBoolean, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject1 = new JSONObject();
    long l = ed();
    this.CB.a(l, paramgq);
    z(true);
    try
    {
      localJSONObject1.put("requestId", l);
      localJSONObject1.put("type", "SET_VOLUME");
      localJSONObject1.put("mediaSessionId", ea());
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("muted", paramBoolean);
      localJSONObject1.put("volume", localJSONObject2);
      if (paramJSONObject != null)
        localJSONObject1.put("customData", paramJSONObject);
      label107: a(localJSONObject1.toString(), l, null);
      return l;
    }
    catch (JSONException localJSONException)
    {
      break label107;
    }
  }

  public long a(gq paramgq, long[] paramArrayOfLong)
  {
    JSONObject localJSONObject = new JSONObject();
    long l = ed();
    this.CD.a(l, paramgq);
    z(true);
    try
    {
      localJSONObject.put("requestId", l);
      localJSONObject.put("type", "EDIT_TRACKS_INFO");
      localJSONObject.put("mediaSessionId", ea());
      JSONArray localJSONArray = new JSONArray();
      for (int i = 0; i < paramArrayOfLong.length; i++)
        localJSONArray.put(i, paramArrayOfLong[i]);
      localJSONObject.put("activeTrackIds", localJSONArray);
      label106: a(localJSONObject.toString(), l, null);
      return l;
    }
    catch (JSONException localJSONException)
    {
      break label106;
    }
  }

  public void a(long paramLong, int paramInt)
  {
    Iterator localIterator = this.CF.iterator();
    while (localIterator.hasNext())
      ((gr)localIterator.next()).c(paramLong, paramInt);
  }

  public final void ai(String paramString)
  {
    this.BD.b("message received: %s", new Object[] { paramString });
    JSONObject localJSONObject1;
    String str;
    long l;
    try
    {
      localJSONObject1 = new JSONObject(paramString);
      str = localJSONObject1.getString("type");
      l = localJSONObject1.optLong("requestId", -1L);
      if (str.equals("MEDIA_STATUS"))
      {
        JSONArray localJSONArray = localJSONObject1.getJSONArray("status");
        if (localJSONArray.length() > 0)
        {
          a(l, localJSONArray.getJSONObject(0));
          return;
        }
        this.Cu = null;
        onStatusUpdated();
        onMetadataUpdated();
        this.CC.c(l, 0);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      gn localgn = this.BD;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localJSONException.getMessage();
      arrayOfObject[1] = paramString;
      localgn.d("Message is malformed (%s); ignoring: %s", arrayOfObject);
      return;
    }
    if (str.equals("INVALID_PLAYER_STATE"))
    {
      this.BD.d("received unexpected error: Invalid Player State.", new Object[0]);
      JSONObject localJSONObject5 = localJSONObject1.optJSONObject("customData");
      Iterator localIterator2 = this.CF.iterator();
      while (localIterator2.hasNext())
        ((gr)localIterator2.next()).b(l, 1, localJSONObject5);
    }
    if (str.equals("LOAD_FAILED"))
    {
      JSONObject localJSONObject4 = localJSONObject1.optJSONObject("customData");
      this.Cv.b(l, 1, localJSONObject4);
      return;
    }
    if (str.equals("LOAD_CANCELLED"))
    {
      JSONObject localJSONObject3 = localJSONObject1.optJSONObject("customData");
      this.Cv.b(l, 2, localJSONObject3);
      return;
    }
    if (str.equals("INVALID_REQUEST"))
    {
      this.BD.d("received unexpected error: Invalid Request.", new Object[0]);
      JSONObject localJSONObject2 = localJSONObject1.optJSONObject("customData");
      Iterator localIterator1 = this.CF.iterator();
      while (localIterator1.hasNext())
        ((gr)localIterator1.next()).b(l, 1, localJSONObject2);
    }
  }

  public long b(gq paramgq, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l = ed();
    this.Cy.a(l, paramgq);
    z(true);
    try
    {
      localJSONObject.put("requestId", l);
      localJSONObject.put("type", "STOP");
      localJSONObject.put("mediaSessionId", ea());
      if (paramJSONObject != null)
        localJSONObject.put("customData", paramJSONObject);
      label72: a(localJSONObject.toString(), l, null);
      return l;
    }
    catch (JSONException localJSONException)
    {
      break label72;
    }
  }

  public long c(gq paramgq, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l = ed();
    this.Cx.a(l, paramgq);
    z(true);
    try
    {
      localJSONObject.put("requestId", l);
      localJSONObject.put("type", "PLAY");
      localJSONObject.put("mediaSessionId", ea());
      if (paramJSONObject != null)
        localJSONObject.put("customData", paramJSONObject);
      label72: a(localJSONObject.toString(), l, null);
      return l;
    }
    catch (JSONException localJSONException)
    {
      break label72;
    }
  }

  public long ea()
  {
    if (this.Cu == null)
      throw new IllegalStateException("No current media session");
    return this.Cu.ea();
  }

  public void ee()
  {
    et();
  }

  public long getApproximateStreamPosition()
  {
    MediaInfo localMediaInfo = getMediaInfo();
    if (localMediaInfo == null);
    while (this.Ct == 0L)
      return 0L;
    double d = this.Cu.getPlaybackRate();
    long l1 = this.Cu.getStreamPosition();
    int i = this.Cu.getPlayerState();
    if ((d == 0.0D) || (i != 2))
      return l1;
    long l2 = SystemClock.elapsedRealtime() - this.Ct;
    if (l2 < 0L);
    for (long l3 = 0L; ; l3 = l2)
    {
      if (l3 == 0L)
        return l1;
      long l4 = localMediaInfo.getStreamDuration();
      long l5 = l1 + ()(d * l3);
      if (l5 > l4);
      while (true)
      {
        return l4;
        if (l5 < 0L)
          l4 = 0L;
        else
          l4 = l5;
      }
    }
  }

  public MediaInfo getMediaInfo()
  {
    if (this.Cu == null)
      return null;
    return this.Cu.getMediaInfo();
  }

  public MediaStatus getMediaStatus()
  {
    return this.Cu;
  }

  public long getStreamDuration()
  {
    MediaInfo localMediaInfo = getMediaInfo();
    if (localMediaInfo != null)
      return localMediaInfo.getStreamDuration();
    return 0L;
  }

  protected void onMetadataUpdated()
  {
  }

  protected void onStatusUpdated()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.go
 * JD-Core Version:    0.6.2
 */