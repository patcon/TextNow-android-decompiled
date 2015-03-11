package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class hz
  implements AppIndexApi, hu
{
  public static Uri a(String paramString, Uri paramUri)
  {
    if (!"android-app".equals(paramUri.getScheme()))
      throw new IllegalArgumentException("Uri scheme must be android-app: " + paramUri);
    if (!paramString.equals(paramUri.getHost()))
      throw new IllegalArgumentException("Uri host must match package name: " + paramUri);
    List localList = paramUri.getPathSegments();
    if ((localList.isEmpty()) || (((String)localList.get(0)).isEmpty()))
      throw new IllegalArgumentException("Uri path must exist: " + paramUri);
    String str = (String)localList.get(0);
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme(str);
    if (localList.size() > 1)
    {
      localBuilder.authority((String)localList.get(1));
      for (int i = 2; i < localList.size(); i++)
        localBuilder.appendPath((String)localList.get(i));
    }
    localBuilder.encodedQuery(paramUri.getEncodedQuery());
    localBuilder.encodedFragment(paramUri.getEncodedFragment());
    return localBuilder.build();
  }

  public final PendingResult<Status> a(GoogleApiClient paramGoogleApiClient, final hs[] paramArrayOfhs)
  {
    return paramGoogleApiClient.a(new hz.d(((hy)paramGoogleApiClient.a(hd.BN)).getContext().getPackageName())
    {
      protected void a(hv paramAnonymoushv)
      {
        paramAnonymoushv.a(new hz.e(this), this.CJ, paramArrayOfhs);
      }
    });
  }

  public final PendingResult<Status> view(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Intent paramIntent, String paramString, Uri paramUri, List<AppIndexApi.AppIndexingLink> paramList)
  {
    String str = ((hy)paramGoogleApiClient.a(hd.BN)).getContext().getPackageName();
    hs[] arrayOfhs = new hs[1];
    arrayOfhs[0] = new hs(str, paramIntent, paramString, paramUri, null, paramList);
    return a(paramGoogleApiClient, arrayOfhs);
  }

  public final PendingResult<Status> view(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Uri paramUri1, String paramString, Uri paramUri2, List<AppIndexApi.AppIndexingLink> paramList)
  {
    return view(paramGoogleApiClient, paramActivity, new Intent("android.intent.action.VIEW", a(((hy)paramGoogleApiClient.a(hd.BN)).getContext().getPackageName(), paramUri1)), paramString, paramUri2, paramList);
  }

  public final PendingResult<Status> viewEnd(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Intent paramIntent)
  {
    return a(paramGoogleApiClient, new hs[] { new hs(hs.a(((hy)paramGoogleApiClient.a(hd.BN)).getContext().getPackageName(), paramIntent), System.currentTimeMillis(), 3) });
  }

  public final PendingResult<Status> viewEnd(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Uri paramUri)
  {
    return viewEnd(paramGoogleApiClient, paramActivity, new Intent("android.intent.action.VIEW", a(((hy)paramGoogleApiClient.a(hd.BN)).getContext().getPackageName(), paramUri)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hz
 * JD-Core Version:    0.6.2
 */