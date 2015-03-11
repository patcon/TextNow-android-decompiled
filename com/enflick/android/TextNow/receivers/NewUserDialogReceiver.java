package com.enflick.android.TextNow.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.enflick.android.TextNow.activities.ShowNewUserDialogActivity;

public class NewUserDialogReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Intent localIntent = new Intent(paramContext, ShowNewUserDialogActivity.class);
    localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.receivers.NewUserDialogReceiver
 * JD-Core Version:    0.6.2
 */