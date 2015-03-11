package com.enflick.android.TextNow.wear;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.support.v4.app.am;
import android.support.v4.app.bc;
import android.support.v4.app.bz;
import android.support.v4.app.ca;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.widget.TNWidget;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.Wearable;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import textnow.z.f;
import textnow.z.u;

public final class a
{
  private static final Executor a = Executors.newFixedThreadPool(2);

  public static bc a(Context paramContext, String paramString1, String paramString2)
  {
    bc localbc = new bc();
    bz localbz = new ca("extra_voice_reply").a(paramContext.getString(2131296672)).a(paramContext.getResources().getStringArray(2131623952)).a();
    Intent localIntent = new Intent(paramContext, MainActivity.class);
    localIntent.putExtra("extra_selected_cv", paramString1);
    localIntent.putExtra("extra_selected_cn", paramString2);
    PendingIntent localPendingIntent1 = PendingIntent.getActivity(paramContext, 0, localIntent, 134217728);
    localbc.a(new am(2130837857, paramContext.getString(2131296672), localPendingIntent1).a(localbz).a());
    f localf = new f(paramString1, f.d(paramString1), paramString2, "");
    if (localf.j())
    {
      PendingIntent localPendingIntent2 = TNWidget.getDialerIntent(localf, paramContext, 1, "WearableWidget");
      localbc.a(new am(2130837843, paramContext.getString(2131296509), localPendingIntent2).a());
    }
    return localbc;
  }

  public static Asset a(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    return Asset.createFromBytes(localByteArrayOutputStream.toByteArray());
  }

  public static Node a(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    NodeApi.GetConnectedNodesResult localGetConnectedNodesResult = (NodeApi.GetConnectedNodesResult)Wearable.NodeApi.getConnectedNodes(paramGoogleApiClient).await(paramInt, TimeUnit.SECONDS);
    if (localGetConnectedNodesResult.getStatus().isSuccess())
    {
      List localList = localGetConnectedNodesResult.getNodes();
      if (localList.size() == 0)
        return null;
      return (Node)localList.get(0);
    }
    return null;
  }

  public static void a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 20)
      return;
    new AsyncTask()
    {
    }
    .executeOnExecutor(a, new Void[0]);
  }

  public static void a(Context paramContext, final f paramf, final String paramString)
  {
    if (Build.VERSION.SDK_INT < 20)
      return;
    new AsyncTask()
    {
      private Void a()
      {
        if (!new u(a.this).l());
        while (true)
        {
          return null;
          GoogleApiClient localGoogleApiClient = new GoogleApiClient.Builder(a.this).addApi(Wearable.API).build();
          localGoogleApiClient.connect();
          Node localNode = a.a(localGoogleApiClient, 3);
          if (localNode == null)
            continue;
          try
          {
            JSONObject localJSONObject = new JSONObject();
            localJSONObject.put("id", paramString);
            if (paramf != null);
            for (String str = paramf.g(); ; str = "")
            {
              localJSONObject.put("name", str);
              byte[] arrayOfByte2 = localJSONObject.toString().getBytes();
              arrayOfByte1 = arrayOfByte2;
              MessageApi.SendMessageResult localSendMessageResult = (MessageApi.SendMessageResult)Wearable.MessageApi.sendMessage(localGoogleApiClient, localNode.getId(), "/SHOW_ANSWER_CALL", arrayOfByte1).await(3L, TimeUnit.SECONDS);
              if (localSendMessageResult.getStatus().isSuccess())
                break;
              new StringBuilder().append("ERROR: failed to send incoming call message to wearable: ").append(localSendMessageResult.getStatus()).toString();
              return null;
            }
          }
          catch (Exception localException)
          {
            while (true)
              byte[] arrayOfByte1 = null;
          }
        }
      }
    }
    .executeOnExecutor(a, new Void[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.wear.a
 * JD-Core Version:    0.6.2
 */