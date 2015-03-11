package com.mopub.mobileads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.factories.HttpClientFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

class MoPubConversionTracker$TrackOpen
  implements Runnable
{
  private MoPubConversionTracker$TrackOpen(MoPubConversionTracker paramMoPubConversionTracker)
  {
  }

  public void run()
  {
    String str = new MoPubConversionTracker.ConversionUrlGenerator(this.this$0, null).generateUrlString("ads.mopub.com");
    MoPubLog.d("Conversion track: " + str);
    DefaultHttpClient localDefaultHttpClient = HttpClientFactory.create();
    HttpResponse localHttpResponse;
    try
    {
      localHttpResponse = localDefaultHttpClient.execute(new HttpGet(str));
      if (localHttpResponse.getStatusLine().getStatusCode() != 200)
      {
        MoPubLog.d("Conversion track failed: Status code != 200.");
        return;
      }
    }
    catch (Exception localException)
    {
      MoPubLog.d("Conversion track failed [" + localException.getClass().getSimpleName() + "]: " + str);
      return;
    }
    HttpEntity localHttpEntity = localHttpResponse.getEntity();
    if ((localHttpEntity == null) || (localHttpEntity.getContentLength() == 0L))
    {
      MoPubLog.d("Conversion track failed: Response was empty.");
      return;
    }
    MoPubLog.d("Conversion track successful.");
    MoPubConversionTracker.access$400(this.this$0).edit().putBoolean(MoPubConversionTracker.access$300(this.this$0), true).commit();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MoPubConversionTracker.TrackOpen
 * JD-Core Version:    0.6.2
 */