package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener;
import com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class jc
  implements GeofencingApi
{
  public PendingResult<Status> addGeofences(GoogleApiClient paramGoogleApiClient, List<Geofence> paramList, final PendingIntent paramPendingIntent)
  {
    ArrayList localArrayList1;
    if (paramList != null)
    {
      localArrayList1 = new ArrayList(paramList.size());
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Geofence localGeofence = (Geofence)localIterator.next();
        hm.b(localGeofence instanceof jh, "Geofence must be created using Geofence.Builder.");
        localArrayList1.add((jh)localGeofence);
      }
    }
    for (final ArrayList localArrayList2 = localArrayList1; ; localArrayList2 = null)
      return paramGoogleApiClient.b(new jc.a(localArrayList2)
      {
        protected void a(jg paramAnonymousjg)
        {
          LocationClient.OnAddGeofencesResultListener local1 = new LocationClient.OnAddGeofencesResultListener()
          {
            public void onAddGeofencesResult(int paramAnonymous2Int, String[] paramAnonymous2ArrayOfString)
            {
              jc.1.this.b(LocationStatusCodes.cK(paramAnonymous2Int));
            }
          };
          paramAnonymousjg.addGeofences(localArrayList2, paramPendingIntent, local1);
        }
      });
  }

  public PendingResult<Status> removeGeofences(GoogleApiClient paramGoogleApiClient, final PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new jc.a(paramPendingIntent)
    {
      protected void a(jg paramAnonymousjg)
      {
        LocationClient.OnRemoveGeofencesResultListener local1 = new LocationClient.OnRemoveGeofencesResultListener()
        {
          public void onRemoveGeofencesByPendingIntentResult(int paramAnonymous2Int, PendingIntent paramAnonymous2PendingIntent)
          {
            jc.2.this.b(LocationStatusCodes.cK(paramAnonymous2Int));
          }

          public void onRemoveGeofencesByRequestIdsResult(int paramAnonymous2Int, String[] paramAnonymous2ArrayOfString)
          {
            Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
          }
        };
        paramAnonymousjg.removeGeofences(paramPendingIntent, local1);
      }
    });
  }

  public PendingResult<Status> removeGeofences(GoogleApiClient paramGoogleApiClient, final List<String> paramList)
  {
    return paramGoogleApiClient.b(new jc.a(paramList)
    {
      protected void a(jg paramAnonymousjg)
      {
        LocationClient.OnRemoveGeofencesResultListener local1 = new LocationClient.OnRemoveGeofencesResultListener()
        {
          public void onRemoveGeofencesByPendingIntentResult(int paramAnonymous2Int, PendingIntent paramAnonymous2PendingIntent)
          {
            Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
          }

          public void onRemoveGeofencesByRequestIdsResult(int paramAnonymous2Int, String[] paramAnonymous2ArrayOfString)
          {
            jc.3.this.b(LocationStatusCodes.cK(paramAnonymous2Int));
          }
        };
        paramAnonymousjg.removeGeofences(paramList, local1);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jc
 * JD-Core Version:    0.6.2
 */