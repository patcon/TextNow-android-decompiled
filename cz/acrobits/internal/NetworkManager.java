package cz.acrobits.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Build.VERSION;
import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.libsoftphone.data.Network;

public final class NetworkManager
{
  public static final String TAG = "NetworkManager";
  private final ConnectivityManager mManager = (ConnectivityManager)AndroidUtil.getApplicationContext().getSystemService("connectivity");
  private final NetworkManager.ConnectivityReceiver mReceiver;
  private boolean mShouldLock = false;
  private final WifiManager.WifiLock mWifiLock;
  private final WifiManager mWifiManager = (WifiManager)AndroidUtil.getApplicationContext().getSystemService("wifi");

  protected NetworkManager()
  {
    WifiManager localWifiManager = this.mWifiManager;
    if (Build.VERSION.SDK_INT >= 12);
    for (int i = 3; ; i = 1)
    {
      this.mWifiLock = localWifiManager.createWifiLock(i, "NetworkManager");
      this.mWifiLock.setReferenceCounted(false);
      this.mReceiver = new NetworkManager.ConnectivityReceiver(this);
      return;
    }
  }

  private void lockWifi()
  {
    if (this.mWifiLock.isHeld())
      return;
    this.mWifiLock.acquire();
    AndroidUtil.log("NetworkManager", "WiFi locked");
  }

  private void unlockWifi()
  {
    if (!this.mWifiLock.isHeld())
      return;
    this.mWifiLock.release();
    AndroidUtil.log("NetworkManager", "WiFi unlocked");
  }

  private native void update(Network paramNetwork);

  protected final Network detect()
  {
    NetworkInfo localNetworkInfo = this.mManager.getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (localNetworkInfo.getState() != NetworkInfo.State.CONNECTED))
      return Network.NoneAvailable;
    if (localNetworkInfo.getType() == 1)
      return Network.WiFi;
    return Network.ThreeG;
  }

  protected final boolean isLocked()
  {
    return this.mShouldLock;
  }

  protected final void lock()
  {
    this.mShouldLock = true;
    manageLocks(detect());
  }

  protected final void manageLocks(Network paramNetwork)
  {
    if (this.mShouldLock)
    {
      if (paramNetwork == Network.WiFi)
      {
        lockWifi();
        return;
      }
      unlockWifi();
      return;
    }
    unlockWifi();
  }

  protected final void unlock()
  {
    this.mShouldLock = false;
    manageLocks(detect());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.internal.NetworkManager
 * JD-Core Version:    0.6.2
 */