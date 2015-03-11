package com.facebook.android;

import android.content.Context;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

@Deprecated
public class AsyncFacebookRunner
{
  Facebook fb;

  public AsyncFacebookRunner(Facebook paramFacebook)
  {
    this.fb = paramFacebook;
  }

  @Deprecated
  public void logout(Context paramContext, AsyncFacebookRunner.RequestListener paramRequestListener)
  {
    logout(paramContext, paramRequestListener, null);
  }

  @Deprecated
  public void logout(final Context paramContext, final AsyncFacebookRunner.RequestListener paramRequestListener, final Object paramObject)
  {
    new Thread()
    {
      public void run()
      {
        try
        {
          String str = AsyncFacebookRunner.this.fb.logoutImpl(paramContext);
          if ((str.length() == 0) || (str.equals("false")))
          {
            paramRequestListener.onFacebookError(new FacebookError("auth.expireSession failed"), paramObject);
            return;
          }
          paramRequestListener.onComplete(str, paramObject);
          return;
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          paramRequestListener.onFileNotFoundException(localFileNotFoundException, paramObject);
          return;
        }
        catch (MalformedURLException localMalformedURLException)
        {
          paramRequestListener.onMalformedURLException(localMalformedURLException, paramObject);
          return;
        }
        catch (IOException localIOException)
        {
          paramRequestListener.onIOException(localIOException, paramObject);
        }
      }
    }
    .start();
  }

  @Deprecated
  public void request(Bundle paramBundle, AsyncFacebookRunner.RequestListener paramRequestListener)
  {
    request(null, paramBundle, "GET", paramRequestListener, null);
  }

  @Deprecated
  public void request(Bundle paramBundle, AsyncFacebookRunner.RequestListener paramRequestListener, Object paramObject)
  {
    request(null, paramBundle, "GET", paramRequestListener, paramObject);
  }

  @Deprecated
  public void request(String paramString, Bundle paramBundle, AsyncFacebookRunner.RequestListener paramRequestListener)
  {
    request(paramString, paramBundle, "GET", paramRequestListener, null);
  }

  @Deprecated
  public void request(String paramString, Bundle paramBundle, AsyncFacebookRunner.RequestListener paramRequestListener, Object paramObject)
  {
    request(paramString, paramBundle, "GET", paramRequestListener, paramObject);
  }

  @Deprecated
  public void request(final String paramString1, final Bundle paramBundle, final String paramString2, final AsyncFacebookRunner.RequestListener paramRequestListener, final Object paramObject)
  {
    new Thread()
    {
      public void run()
      {
        try
        {
          String str = AsyncFacebookRunner.this.fb.requestImpl(paramString1, paramBundle, paramString2);
          paramRequestListener.onComplete(str, paramObject);
          return;
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          paramRequestListener.onFileNotFoundException(localFileNotFoundException, paramObject);
          return;
        }
        catch (MalformedURLException localMalformedURLException)
        {
          paramRequestListener.onMalformedURLException(localMalformedURLException, paramObject);
          return;
        }
        catch (IOException localIOException)
        {
          paramRequestListener.onIOException(localIOException, paramObject);
        }
      }
    }
    .start();
  }

  @Deprecated
  public void request(String paramString, AsyncFacebookRunner.RequestListener paramRequestListener)
  {
    request(paramString, new Bundle(), "GET", paramRequestListener, null);
  }

  @Deprecated
  public void request(String paramString, AsyncFacebookRunner.RequestListener paramRequestListener, Object paramObject)
  {
    request(paramString, new Bundle(), "GET", paramRequestListener, paramObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.android.AsyncFacebookRunner
 * JD-Core Version:    0.6.2
 */