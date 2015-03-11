package com.enflick.android.TextNow.broadcast.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.enflick.android.TextNow.tasks.ReceiveSMSTask;
import textnow.aa.a;
import textnow.v.b;
import textnow.z.u;

public class SmsReceiver extends BroadcastReceiver
{
  private static final String TAG = "SmsReceiver";

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    u localu = new u(paramContext.getApplicationContext());
    boolean bool = b.j(paramContext);
    if ((bool) && ("android.provider.Telephony.SMS_RECEIVED".equals(paramIntent.getAction())));
    Object[] arrayOfObject;
    SmsBroadcast[] arrayOfSmsBroadcast;
    int j;
    label129: label173: 
    do
    {
      do
        return;
      while ((!bool) && (!localu.S()));
      Bundle localBundle = paramIntent.getExtras();
      if (localBundle == null)
        break;
      arrayOfObject = (Object[])localBundle.get("pdus");
      arrayOfSmsBroadcast = new SmsBroadcast[arrayOfObject.length];
      int i = 0;
      j = 0;
      if (i < arrayOfSmsBroadcast.length)
      {
        SmsMessage localSmsMessage = SmsMessage.createFromPdu((byte[])arrayOfObject[i]);
        String str1 = localSmsMessage.getOriginatingAddress();
        String str2 = b.b(str1);
        if (str2 != null)
        {
          if (str2 == null)
            break label173;
          arrayOfSmsBroadcast[i] = new SmsBroadcast(str2, localSmsMessage.getMessageBody());
          j++;
        }
        while (true)
        {
          i++;
          break;
          str2 = b.a(str1, true);
          break label129;
          arrayOfSmsBroadcast[i] = null;
        }
      }
    }
    while (j <= 0);
    new StringBuilder().append("Found ").append(j).append(" valid messages, consuming broadcast and running task").toString();
    abortBroadcast();
    new ReceiveSMSTask(arrayOfSmsBroadcast).b(paramContext.getApplicationContext());
    a.a(paramContext.getApplicationContext()).a(arrayOfSmsBroadcast[(-1 + arrayOfObject.length)].getSender(), b.f(arrayOfSmsBroadcast[(-1 + arrayOfObject.length)].getSender()), 2, arrayOfSmsBroadcast[(-1 + arrayOfObject.length)].getContents(), 1, 1, 0L);
    return;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.broadcast.sms.SmsReceiver
 * JD-Core Version:    0.6.2
 */