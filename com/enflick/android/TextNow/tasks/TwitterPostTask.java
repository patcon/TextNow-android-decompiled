package com.enflick.android.TextNow.tasks;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import textnow.q.a;
import textnow.u.r;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterPostTask extends c
{
  private String d;

  public TwitterPostTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    try
    {
      Context localContext = this.a;
      String str1 = this.d;
      new StringBuilder().append("Posting a tweet: ").append(str1).toString();
      r localr = new r(localContext);
      String str2 = localr.V();
      String str3 = localr.W();
      if ((!TextUtils.isEmpty(str1)) && (!TextUtils.isEmpty(str2)) && (!TextUtils.isEmpty(str3)))
      {
        ConfigurationBuilder localConfigurationBuilder = new ConfigurationBuilder();
        if (a.a)
          localConfigurationBuilder.setDebugEnabled(true);
        localConfigurationBuilder.setOAuthConsumerKey("oNr9zYKbAmzNuYEvhxCaxA").setOAuthConsumerSecret("ARxY46gsehbtaBkwe8B51avOxPioJsdbfw0OG4SM").setOAuthAccessToken(str2).setOAuthAccessTokenSecret(str3);
        new TwitterFactory(localConfigurationBuilder.build()).getInstance().updateStatus(str1);
        a(false);
        return;
      }
      throw new TwitterException("Access token or secret null");
    }
    catch (TwitterException localTwitterException)
    {
      Log.getStackTraceString(localTwitterException);
      a(true);
      a(localTwitterException.getStatusCode());
      a(String.valueOf(localTwitterException.getErrorCode()));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.TwitterPostTask
 * JD-Core Version:    0.6.2
 */