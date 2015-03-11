package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hm;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ActivityRecognitionResult
  implements SafeParcelable
{
  public static final ActivityRecognitionResultCreator CREATOR = new ActivityRecognitionResultCreator();
  public static final String EXTRA_ACTIVITY_RESULT = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT";
  List<DetectedActivity> UV;
  long UW;
  long UX;
  private final int xM;

  public ActivityRecognitionResult(int paramInt, List<DetectedActivity> paramList, long paramLong1, long paramLong2)
  {
    this.xM = 1;
    this.UV = paramList;
    this.UW = paramLong1;
    this.UX = paramLong2;
  }

  public ActivityRecognitionResult(DetectedActivity paramDetectedActivity, long paramLong1, long paramLong2)
  {
    this(Collections.singletonList(paramDetectedActivity), paramLong1, paramLong2);
  }

  public ActivityRecognitionResult(List<DetectedActivity> paramList, long paramLong1, long paramLong2)
  {
    if ((paramList != null) && (paramList.size() > 0));
    for (boolean bool1 = true; ; bool1 = false)
    {
      hm.b(bool1, "Must have at least 1 detected activity");
      boolean bool2 = paramLong1 < 0L;
      boolean bool3 = false;
      if (bool2)
      {
        boolean bool4 = paramLong2 < 0L;
        bool3 = false;
        if (bool4)
          bool3 = true;
      }
      hm.b(bool3, "Must set times");
      this.xM = 1;
      this.UV = paramList;
      this.UW = paramLong1;
      this.UX = paramLong2;
      return;
    }
  }

  public static ActivityRecognitionResult extractResult(Intent paramIntent)
  {
    if (!hasResult(paramIntent))
      return null;
    return (ActivityRecognitionResult)paramIntent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
  }

  public static boolean hasResult(Intent paramIntent)
  {
    if (paramIntent == null)
      return false;
    return paramIntent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
  }

  public int describeContents()
  {
    return 0;
  }

  public int getActivityConfidence(int paramInt)
  {
    Iterator localIterator = this.UV.iterator();
    while (localIterator.hasNext())
    {
      DetectedActivity localDetectedActivity = (DetectedActivity)localIterator.next();
      if (localDetectedActivity.getType() == paramInt)
        return localDetectedActivity.getConfidence();
    }
    return 0;
  }

  public long getElapsedRealtimeMillis()
  {
    return this.UX;
  }

  public DetectedActivity getMostProbableActivity()
  {
    return (DetectedActivity)this.UV.get(0);
  }

  public List<DetectedActivity> getProbableActivities()
  {
    return this.UV;
  }

  public long getTime()
  {
    return this.UW;
  }

  public int getVersionCode()
  {
    return this.xM;
  }

  public String toString()
  {
    return "ActivityRecognitionResult [probableActivities=" + this.UV + ", timeMillis=" + this.UW + ", elapsedRealtimeMillis=" + this.UX + "]";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ActivityRecognitionResultCreator.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.ActivityRecognitionResult
 * JD-Core Version:    0.6.2
 */