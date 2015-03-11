package cz.acrobits.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.libsoftphone.data.AudioRoute;

public class VoiceUnit$Receiver extends BroadcastReceiver
{
  public VoiceUnit$Receiver(VoiceUnit paramVoiceUnit)
  {
    AndroidUtil.getApplicationContext().registerReceiver(this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (!paramIntent.getAction().equals("android.intent.action.HEADSET_PLUG"));
    label84: label90: 
    while (true)
    {
      return;
      AudioRoute localAudioRoute1 = this.this$0.getRoute();
      VoiceUnit localVoiceUnit = this.this$0;
      boolean bool;
      if (paramIntent.getExtras().getInt("state") > 0)
      {
        bool = true;
        VoiceUnit.access$0(localVoiceUnit, bool);
        if (!VoiceUnit.access$1(this.this$0))
          break label84;
      }
      for (AudioRoute localAudioRoute2 = AudioRoute.Receiver; ; localAudioRoute2 = AudioRoute.Headset)
      {
        if (localAudioRoute1 != localAudioRoute2)
          break label90;
        this.this$0.onRouteChanged();
        return;
        bool = false;
        break;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.internal.VoiceUnit.Receiver
 * JD-Core Version:    0.6.2
 */