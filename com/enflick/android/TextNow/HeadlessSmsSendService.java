package com.enflick.android.TextNow;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.tasks.SendSMSTask;
import textnow.v.b;

public class HeadlessSmsSendService extends IntentService
{
  public HeadlessSmsSendService()
  {
    super("HeadlessSmsSendService");
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    Uri localUri2;
    if ((Build.VERSION.SDK_INT >= 19) && (b.j(this)) && ("android.intent.action.RESPOND_VIA_MESSAGE".equals(paramIntent.getAction())))
    {
      Uri localUri1 = paramIntent.getData();
      new StringBuilder().append("received send via message intent: ").append(localUri1).toString();
      localUri2 = paramIntent.getData();
      String str1 = paramIntent.getStringExtra("android.intent.extra.TEXT");
      if (localUri2 != null)
      {
        String str2 = localUri2.getSchemeSpecificPart();
        boolean bool = TextUtils.isEmpty(str2);
        String str3 = null;
        if (!bool)
          str3 = b.a(str2.split(",")[0], true);
        if (TextUtils.isEmpty(str1))
          break label138;
        new SendSMSTask(str3, b.f(str3), str1).b(this);
      }
    }
    return;
    label138: Intent localIntent = new Intent("android.intent.action.SEND", localUri2, this, MainActivity.class);
    localIntent.addFlags(268435456);
    localIntent.putExtras(paramIntent.getExtras());
    startActivity(localIntent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.HeadlessSmsSendService
 * JD-Core Version:    0.6.2
 */