package textnow.q;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.enflick.android.TextNow.tasks.TwitterPostTask;
import java.util.concurrent.TimeUnit;
import textnow.u.r;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

public final class ac
{
  private static Twitter a;
  private static RequestToken b;

  public static void a(final Activity paramActivity, final String paramString)
  {
    ConfigurationBuilder localConfigurationBuilder = new ConfigurationBuilder();
    localConfigurationBuilder.setOAuthConsumerKey("oNr9zYKbAmzNuYEvhxCaxA");
    localConfigurationBuilder.setOAuthConsumerSecret("ARxY46gsehbtaBkwe8B51avOxPioJsdbfw0OG4SM");
    a = new TwitterFactory(localConfigurationBuilder.build()).getInstance();
    r localr = new r(paramActivity);
    String str1 = localr.V();
    String str2 = localr.W();
    if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)))
    {
      new AsyncTask()
      {
        private Void a()
        {
          try
          {
            ac.a(ac.a().getOAuthRequestToken("twitter://callback"));
            Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(ac.b().getAuthenticationURL()));
            ac.this.D(paramString);
            ac.this.n();
            paramActivity.startActivity(localIntent);
            return null;
          }
          catch (TwitterException localTwitterException)
          {
            while (true)
              localTwitterException.toString();
          }
        }
      }
      .execute(new Void[0]);
      return;
    }
    new TwitterPostTask(paramString).b(paramActivity);
  }

  public static boolean a(final Context paramContext, String paramString)
  {
    AsyncTask localAsyncTask = new AsyncTask()
    {
      private Boolean a()
      {
        try
        {
          AccessToken localAccessToken = ac.a().getOAuthAccessToken(ac.b(), ac.this);
          r localr = new r(paramContext);
          localr.B(localAccessToken.getToken());
          localr.C(localAccessToken.getTokenSecret());
          localr.n();
          return Boolean.valueOf(true);
        }
        catch (TwitterException localTwitterException)
        {
          new StringBuilder().append("Couldn't store credentials: ").append(localTwitterException.toString()).toString();
          return Boolean.valueOf(false);
        }
        catch (Exception localException)
        {
          new StringBuilder().append("Caught exception: ").append(localException.toString()).toString();
        }
        return Boolean.valueOf(false);
      }
    }
    .execute(new Void[0]);
    try
    {
      boolean bool = ((Boolean)localAsyncTask.get(10L, TimeUnit.SECONDS)).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
      localException.toString();
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.ac
 * JD-Core Version:    0.6.2
 */