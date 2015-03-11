package com.enflick.android.TextNow.wear;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.phone.h;
import com.enflick.android.TextNow.activities.phone.w;
import com.enflick.android.TextNow.tasks.SendMessageTask;
import com.enflick.android.TextNow.widget.TNWidget;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.WearableListenerService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import textnow.z.f;
import textnow.z.u;

public class WearListenerService extends WearableListenerService
{
  private GoogleApiClient a;
  private u b;
  private ExecutorService c;

  private String a(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    switch (paramInt1)
    {
    default:
      paramString = getString(2131296556);
    case 2:
    case 0:
    case 1:
    case 8:
    case 100:
    case 101:
    case 102:
    case 103:
    }
    while (true)
    {
      return paramString;
      if (paramInt2 == 1);
      for (int i = 2131296554; ; i = 2131296553)
        return getString(i);
      if (paramString != null);
      try
      {
        JSONObject localJSONObject = new JSONObject(paramString);
        if (localJSONObject.has("string"))
        {
          String str = localJSONObject.getString("string");
          paramString = str;
        }
        label144: if ((paramString == null) || (paramInt3 <= 0) || (paramString.length() <= paramInt3))
          continue;
        return paramString.substring(0, paramInt3);
        return getString(2131296921);
        if ((paramString == null) || (paramInt3 <= 0) || (paramString.length() <= paramInt3))
          continue;
        return paramString.substring(0, paramInt3);
        return getString(2131296555);
        return getString(2131296764);
        return getString(2131296765);
        return getString(2131296763);
      }
      catch (Exception localException)
      {
        break label144;
      }
    }
  }

  private void a()
  {
    new AsyncTask()
    {
    }
    .executeOnExecutor(this.c, new Void[0]);
  }

  public void onCreate()
  {
    super.onCreate();
    this.b = new u(this);
    this.c = Executors.newFixedThreadPool(5);
    this.a = new GoogleApiClient.Builder(this).addApi(Wearable.API).build();
    this.a.connect();
  }

  public void onDestroy()
  {
    if ((this.a != null) && (this.a.isConnected()))
      this.a.disconnect();
    this.c.shutdown();
    super.onDestroy();
  }

  public void onMessageReceived(MessageEvent paramMessageEvent)
  {
    new StringBuilder().append("message recevied from wearable ").append(paramMessageEvent.getSourceNodeId()).append(" path: ").append(paramMessageEvent.getPath()).toString();
    if (paramMessageEvent.getPath().equals("/SYNC_CONV"))
    {
      com.enflick.android.TextNow.ads.b.a("wearable", "sync_conversations", "");
      a();
    }
    while (true)
    {
      return;
      byte[] arrayOfByte4;
      if (paramMessageEvent.getPath().equals("/SEND_MSG"))
      {
        com.enflick.android.TextNow.ads.b.a("wearable", "send_message", "");
        arrayOfByte4 = paramMessageEvent.getData();
        if (!this.b.l());
      }
      try
      {
        JSONObject localJSONObject2 = new JSONObject(new String(arrayOfByte4));
        String str6 = localJSONObject2.getString("cv");
        String str7 = localJSONObject2.getString("name");
        String str8 = localJSONObject2.getString("msg");
        new SendMessageTask(this, f.d(str6), str6, str7, "", 1, 2, true, str8, null).b(this);
        label191: a();
        return;
        if (paramMessageEvent.getPath().equals("/CALL_CONTACT"))
        {
          com.enflick.android.TextNow.ads.b.a("wearable", "call_contact", "");
          byte[] arrayOfByte3 = paramMessageEvent.getData();
          try
          {
            JSONObject localJSONObject1 = new JSONObject(new String(arrayOfByte3));
            String str4 = localJSONObject1.getString("cv");
            String str5 = localJSONObject1.getString("name");
            f localf = new f(str4, f.d(str4), str5, "");
            Intent localIntent2 = new Intent(this, MainActivity.class);
            localIntent2.putExtra("extra_show_dialer", true);
            localIntent2.putExtra("extra_dialer_contact", localf);
            localIntent2.putExtra("extra_launched_from_widget", "WearableWidget");
            localIntent2.setAction("widget_action_dialer");
            localIntent2.addFlags(268435456);
            startActivity(localIntent2);
            return;
          }
          catch (Exception localException3)
          {
            return;
          }
        }
        byte[] arrayOfByte2;
        Intent localIntent1;
        if (paramMessageEvent.getPath().equals("/OPEN_CONV"))
        {
          com.enflick.android.TextNow.ads.b.a("wearable", "open_on_phone", "");
          arrayOfByte2 = paramMessageEvent.getData();
          localIntent1 = new Intent(this, MainActivity.class);
          localIntent1.addFlags(268435456);
          if (arrayOfByte2 == null);
        }
        try
        {
          String str3 = new JSONObject(new String(arrayOfByte2)).getString("cv");
          int i = f.d(str3);
          localIntent1.putExtra("extra_msg_view_type", 2);
          localIntent1.putExtra("extra_selected_cv", str3);
          localIntent1.putExtra("extra_selected_ct", i);
          label486: startActivity(localIntent1);
          return;
          if (paramMessageEvent.getPath().equals("/SYNC_MSG"))
          {
            com.enflick.android.TextNow.ads.b.a("wearable", "sync_messages", "");
            final String str2 = new String(paramMessageEvent.getData());
            if (TextUtils.isEmpty(str2))
              continue;
            new AsyncTask()
            {
            }
            .executeOnExecutor(this.c, new Void[0]);
            return;
          }
          if (paramMessageEvent.getPath().equals("/ACCPT_CALL"))
          {
            com.enflick.android.TextNow.ads.b.a("wearable", "accept_call", "");
            try
            {
              TNWidget.getAnswerCallIntent(this, 1, "WearableAnswerCall", textnow.v.b.k(this)).send();
              return;
            }
            catch (PendingIntent.CanceledException localCanceledException2)
            {
              localCanceledException2.printStackTrace();
              return;
            }
          }
          if (paramMessageEvent.getPath().equals("/REJECT_CALL"))
          {
            com.enflick.android.TextNow.ads.b.a("wearable", "reject_call", "");
            try
            {
              TNWidget.getRejectCallIntent(this, 1, "WearableRejectCall", textnow.v.b.k(this)).send();
              return;
            }
            catch (PendingIntent.CanceledException localCanceledException1)
            {
              localCanceledException1.printStackTrace();
              return;
            }
          }
          if (paramMessageEvent.getPath().equals("/SYNC_CALLER_AVATAR"))
          {
            byte[] arrayOfByte1 = paramMessageEvent.getData();
            if (arrayOfByte1 == null)
              continue;
            try
            {
              String str1 = new String(arrayOfByte1);
              final w localw = h.a().f(str1);
              if ((localw == null) || (localw.b() == null))
                continue;
              new AsyncTask()
              {
              }
              .executeOnExecutor(this.c, new Void[0]);
              return;
            }
            catch (Exception localException1)
            {
              return;
            }
          }
          if (paramMessageEvent.getPath().equals("/SYNC_CALL_STATE"))
          {
            new AsyncTask()
            {
              private Void a()
              {
                int i = 1;
                if ((!WearListenerService.a(WearListenerService.this).isConnected()) && (!WearListenerService.a(WearListenerService.this).blockingConnect(15L, TimeUnit.SECONDS).isSuccess()));
                while (true)
                {
                  return null;
                  Node localNode = a.a(WearListenerService.a(WearListenerService.this), 15);
                  if (localNode == null)
                    continue;
                  try
                  {
                    w localw = h.a().I();
                    if (localw == null);
                    label73: 
                    while (i != 0)
                    {
                      MessageApi.SendMessageResult localSendMessageResult = (MessageApi.SendMessageResult)Wearable.MessageApi.sendMessage(WearListenerService.a(WearListenerService.this), localNode.getId(), "/CLOSE_ANSWER_CALL", null).await(15L, TimeUnit.SECONDS);
                      if (localSendMessageResult.getStatus().isSuccess())
                        break;
                      new StringBuilder().append("ERROR: failed to send close call message to wearable: ").append(localSendMessageResult.getStatus()).toString();
                      return null;
                      i = 0;
                    }
                  }
                  catch (Exception localException)
                  {
                    break label73;
                  }
                }
              }
            }
            .executeOnExecutor(this.c, new Void[0]);
            return;
          }
          new StringBuilder().append("Unknow action path ").append(paramMessageEvent.getPath()).toString();
          return;
        }
        catch (Exception localException2)
        {
          break label486;
        }
      }
      catch (Exception localException4)
      {
        break label191;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.wear.WearListenerService
 * JD-Core Version:    0.6.2
 */