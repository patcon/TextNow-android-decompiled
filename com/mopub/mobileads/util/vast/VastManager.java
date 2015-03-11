package com.mopub.mobileads.util.vast;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.mopub.common.CacheService;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.mobileads.VastVideoDownloadTask;
import com.mopub.mobileads.VastVideoDownloadTask.VastVideoDownloadTaskListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class VastManager
  implements VastXmlManagerAggregator.VastXmlManagerAggregatorListener
{
  private static final double AREA_WEIGHT = 60.0D;
  private static final double ASPECT_RATIO_WEIGHT = 40.0D;
  private static final List<String> COMPANION_IMAGE_MIME_TYPES = Arrays.asList(new String[] { "image/jpeg", "image/png", "image/bmp", "image/gif" });
  private static final List<String> VIDEO_MIME_TYPES = Arrays.asList(new String[] { "video/mp4", "video/3gpp" });
  private int mScreenArea;
  private double mScreenAspectRatio;
  private VastManager.VastManagerListener mVastManagerListener;
  private VastXmlManagerAggregator mVastXmlManagerAggregator;

  public VastManager(Context paramContext)
  {
    initializeScreenDimensions(paramContext);
  }

  private double calculateFitness(int paramInt1, int paramInt2)
  {
    double d1 = paramInt1 / paramInt2;
    int i = paramInt1 * paramInt2;
    double d2 = d1 / this.mScreenAspectRatio;
    double d3 = i / this.mScreenArea;
    return 40.0D * Math.abs(Math.log(d2)) + 60.0D * Math.abs(Math.log(d3));
  }

  private VastVideoConfiguration createVastVideoConfigurationFromXml(List<VastXmlManager> paramList)
  {
    VastVideoConfiguration localVastVideoConfiguration = new VastVideoConfiguration();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      VastXmlManager localVastXmlManager = (VastXmlManager)localIterator.next();
      localVastVideoConfiguration.addImpressionTrackers(localVastXmlManager.getImpressionTrackers());
      localVastVideoConfiguration.addStartTrackers(localVastXmlManager.getVideoStartTrackers());
      localVastVideoConfiguration.addFirstQuartileTrackers(localVastXmlManager.getVideoFirstQuartileTrackers());
      localVastVideoConfiguration.addMidpointTrackers(localVastXmlManager.getVideoMidpointTrackers());
      localVastVideoConfiguration.addThirdQuartileTrackers(localVastXmlManager.getVideoThirdQuartileTrackers());
      localVastVideoConfiguration.addCompleteTrackers(localVastXmlManager.getVideoCompleteTrackers());
      localVastVideoConfiguration.addClickTrackers(localVastXmlManager.getClickTrackers());
      if (localVastVideoConfiguration.getClickThroughUrl() == null)
        localVastVideoConfiguration.setClickThroughUrl(localVastXmlManager.getClickThroughUrl());
      localArrayList1.addAll(localVastXmlManager.getMediaXmlManagers());
      localArrayList2.addAll(localVastXmlManager.getCompanionAdXmlManagers());
    }
    localVastVideoConfiguration.setNetworkMediaFileUrl(getBestMediaFileUrl(localArrayList1));
    localVastVideoConfiguration.setVastCompanionAd(getBestCompanionAd(localArrayList2));
    return localVastVideoConfiguration;
  }

  private void initializeScreenDimensions(Context paramContext)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int i = localDisplay.getWidth();
    int j = localDisplay.getHeight();
    int k = Math.max(i, j);
    int m = Math.min(i, j);
    this.mScreenAspectRatio = (k / m);
    this.mScreenArea = (m * k);
  }

  private boolean updateDiskMediaFileUrl(VastVideoConfiguration paramVastVideoConfiguration)
  {
    String str = paramVastVideoConfiguration.getNetworkMediaFileUrl();
    if (CacheService.containsKeyDiskCache(str))
    {
      paramVastVideoConfiguration.setDiskMediaFileUrl(CacheService.getFilePathDiskCache(str));
      return true;
    }
    return false;
  }

  public void cancel()
  {
    if (this.mVastXmlManagerAggregator != null)
    {
      this.mVastXmlManagerAggregator.cancel(true);
      this.mVastXmlManagerAggregator = null;
    }
  }

  VastCompanionAd getBestCompanionAd(List<VastXmlManager.ImageCompanionAdXmlManager> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList);
    double d1 = (1.0D / 0.0D);
    Iterator localIterator = localArrayList.iterator();
    Object localObject1 = null;
    Object localObject3;
    double d3;
    while (localIterator.hasNext())
    {
      VastXmlManager.ImageCompanionAdXmlManager localImageCompanionAdXmlManager = (VastXmlManager.ImageCompanionAdXmlManager)localIterator.next();
      String str1 = localImageCompanionAdXmlManager.getType();
      String str2 = localImageCompanionAdXmlManager.getImageUrl();
      if ((!COMPANION_IMAGE_MIME_TYPES.contains(str1)) || (str2 == null))
      {
        localIterator.remove();
      }
      else
      {
        Integer localInteger1 = localImageCompanionAdXmlManager.getWidth();
        Integer localInteger2 = localImageCompanionAdXmlManager.getHeight();
        if ((localInteger1 != null) && (localInteger1.intValue() > 0) && (localInteger2 != null) && (localInteger2.intValue() > 0))
        {
          double d2 = calculateFitness(localInteger1.intValue(), localInteger2.intValue());
          if (d2 >= d1)
            break label249;
          localObject3 = localImageCompanionAdXmlManager;
          d3 = d2;
        }
      }
    }
    while (true)
    {
      d1 = d3;
      localObject1 = localObject3;
      break;
      if ((localObject1 == null) && (!localArrayList.isEmpty()));
      for (Object localObject2 = (VastXmlManager.ImageCompanionAdXmlManager)localArrayList.get(0); ; localObject2 = localObject1)
      {
        if (localObject2 != null)
          return new VastCompanionAd(((VastXmlManager.ImageCompanionAdXmlManager)localObject2).getWidth(), ((VastXmlManager.ImageCompanionAdXmlManager)localObject2).getHeight(), ((VastXmlManager.ImageCompanionAdXmlManager)localObject2).getImageUrl(), ((VastXmlManager.ImageCompanionAdXmlManager)localObject2).getClickThroughUrl(), new ArrayList(((VastXmlManager.ImageCompanionAdXmlManager)localObject2).getClickTrackers()));
        return null;
      }
      label249: d3 = d1;
      localObject3 = localObject1;
    }
  }

  String getBestMediaFileUrl(List<VastXmlManager.MediaXmlManager> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList);
    double d1 = (1.0D / 0.0D);
    Object localObject1 = null;
    Iterator localIterator = localArrayList.iterator();
    String str2;
    double d2;
    while (localIterator.hasNext())
    {
      VastXmlManager.MediaXmlManager localMediaXmlManager = (VastXmlManager.MediaXmlManager)localIterator.next();
      String str1 = localMediaXmlManager.getType();
      str2 = localMediaXmlManager.getMediaUrl();
      if ((!VIDEO_MIME_TYPES.contains(str1)) || (str2 == null))
      {
        localIterator.remove();
      }
      else
      {
        Integer localInteger1 = localMediaXmlManager.getWidth();
        Integer localInteger2 = localMediaXmlManager.getHeight();
        if ((localInteger1 != null) && (localInteger1.intValue() > 0) && (localInteger2 != null) && (localInteger2.intValue() > 0))
        {
          d2 = calculateFitness(localInteger1.intValue(), localInteger2.intValue());
          if (d2 >= d1)
            break label197;
        }
      }
    }
    for (Object localObject2 = str2; ; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      d1 = d2;
      break;
      if ((localObject1 == null) && (!localArrayList.isEmpty()))
        localObject1 = ((VastXmlManager.MediaXmlManager)localArrayList.get(0)).getMediaUrl();
      return localObject1;
      label197: d2 = d1;
    }
  }

  @Deprecated
  int getScreenArea()
  {
    return this.mScreenArea;
  }

  @Deprecated
  double getScreenAspectRatio()
  {
    return this.mScreenAspectRatio;
  }

  public void onAggregationComplete(List<VastXmlManager> paramList)
  {
    this.mVastXmlManagerAggregator = null;
    if (paramList == null)
      if (this.mVastManagerListener != null)
        this.mVastManagerListener.onVastVideoConfigurationPrepared(null);
    do
    {
      final VastVideoConfiguration localVastVideoConfiguration;
      do
      {
        return;
        localVastVideoConfiguration = createVastVideoConfigurationFromXml(paramList);
        if (!updateDiskMediaFileUrl(localVastVideoConfiguration))
          break;
      }
      while (this.mVastManagerListener == null);
      this.mVastManagerListener.onVastVideoConfigurationPrepared(localVastVideoConfiguration);
      return;
      VastVideoDownloadTask localVastVideoDownloadTask = new VastVideoDownloadTask(new VastVideoDownloadTask.VastVideoDownloadTaskListener()
      {
        public void onComplete(boolean paramAnonymousBoolean)
        {
          if ((paramAnonymousBoolean) && (VastManager.this.updateDiskMediaFileUrl(localVastVideoConfiguration)))
            if (VastManager.this.mVastManagerListener != null)
              VastManager.this.mVastManagerListener.onVastVideoConfigurationPrepared(localVastVideoConfiguration);
          while (VastManager.this.mVastManagerListener == null)
            return;
          VastManager.this.mVastManagerListener.onVastVideoConfigurationPrepared(null);
        }
      });
      try
      {
        String[] arrayOfString = new String[1];
        arrayOfString[0] = localVastVideoConfiguration.getNetworkMediaFileUrl();
        AsyncTasks.safeExecuteOnExecutor(localVastVideoDownloadTask, arrayOfString);
        return;
      }
      catch (Exception localException)
      {
        MoPubLog.d("Failed to download vast video", localException);
      }
    }
    while (this.mVastManagerListener == null);
    this.mVastManagerListener.onVastVideoConfigurationPrepared(null);
  }

  public void prepareVastVideoConfiguration(String paramString, VastManager.VastManagerListener paramVastManagerListener)
  {
    if (this.mVastXmlManagerAggregator == null)
    {
      this.mVastManagerListener = paramVastManagerListener;
      this.mVastXmlManagerAggregator = new VastXmlManagerAggregator(this);
    }
    try
    {
      AsyncTasks.safeExecuteOnExecutor(this.mVastXmlManagerAggregator, new String[] { paramString });
      return;
    }
    catch (Exception localException)
    {
      do
        MoPubLog.d("Failed to aggregate vast xml", localException);
      while (this.mVastManagerListener == null);
      this.mVastManagerListener.onVastVideoConfigurationPrepared(null);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.vast.VastManager
 * JD-Core Version:    0.6.2
 */