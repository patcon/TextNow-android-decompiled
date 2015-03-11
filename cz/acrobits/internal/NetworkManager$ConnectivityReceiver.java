package cz.acrobits.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.libsoftphone.data.Network;

public final class NetworkManager$ConnectivityReceiver extends BroadcastReceiver
{
  private String mLastVpnState;

  protected NetworkManager$ConnectivityReceiver(NetworkManager paramNetworkManager)
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    localIntentFilter.addAction("vpn.connectivity");
    AndroidUtil.getApplicationContext().registerReceiver(this, localIntentFilter);
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("vpn.connectivity"))
    {
      String str = paramIntent.getSerializableExtra("connection_state").toString();
      if (str.equals(this.mLastVpnState))
        AndroidUtil.log("Connectivity", "VPN state not changed");
      while ((!str.equals("CONNECTED")) && (!str.equals("DISCONNECTING")))
        return;
      this.mLastVpnState = str;
    }
    Network localNetwork = this.this$0.detect();
    NetworkManager.access$0(this.this$0, localNetwork);
    this.this$0.manageLocks(localNetwork);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.internal.NetworkManager.ConnectivityReceiver
 * JD-Core Version:    0.6.2
 */