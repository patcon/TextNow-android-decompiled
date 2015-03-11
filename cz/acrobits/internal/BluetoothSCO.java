package cz.acrobits.internal;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Handler;
import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.libsoftphone.data.AudioRoute;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;

public final class BluetoothSCO
{
  public static final String ACTION_SCO_AUDIO_STATE_UPDATED;
  private static final int RECONNECT_COUNT = 2;
  public static final String TAG = "Bluetooth SCO";
  private static int[] sSupportedClasses = { 1056, 1032, 1028 };
  private boolean mActive = false;
  private BluetoothAdapter mAdapter;
  private Boolean mAvailable;
  private boolean mConnected = false;
  private boolean mPresent = false;
  private final BluetoothSCO.Receiver mReceiver = new BluetoothSCO.Receiver(this);
  private int mReconnect = 0;
  private boolean mRunning = false;
  private final Runnable mTimeoutRunnable = new Runnable()
  {
    public void run()
    {
      if ((!BluetoothSCO.this.mRunning) || (BluetoothSCO.this.mConnected))
        return;
      AndroidUtil.log("Bluetooth SCO", "Connection timeout");
      BluetoothSCO.this.onConnectionFailed();
    }
  };
  private final VoiceUnit mVoiceUnit;

  static
  {
    if (Build.VERSION.SDK_INT >= 14);
    for (String str = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"; ; str = "android.media.SCO_AUDIO_STATE_CHANGED")
    {
      ACTION_SCO_AUDIO_STATE_UPDATED = str;
      return;
    }
  }

  public BluetoothSCO(VoiceUnit paramVoiceUnit)
  {
    this.mVoiceUnit = paramVoiceUnit;
  }

  private void connect()
  {
    try
    {
      this.mVoiceUnit.getAudioManager().startBluetoothSco();
      AndroidUtil.handler.postDelayed(this.mTimeoutRunnable, 3000L);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private void disconnect()
  {
    if (!this.mRunning)
      return;
    this.mVoiceUnit.getAudioManager().setBluetoothScoOn(false);
    this.mVoiceUnit.getAudioManager().stopBluetoothSco();
    this.mRunning = false;
    this.mConnected = false;
    if (this.mVoiceUnit.getDesiredRoute() == AudioRoute.Speaker)
    {
      AndroidUtil.handler.postDelayed(new Runnable()
      {
        public void run()
        {
          BluetoothSCO.this.mVoiceUnit.setSpeakerphone(true);
          BluetoothSCO.this.mVoiceUnit.onRouteChanged();
        }
      }
      , 100L);
      return;
    }
    this.mVoiceUnit.onRouteChanged();
  }

  private boolean getAvailable()
  {
    if (getAdapter() == null)
    {
      AndroidUtil.log("Bluetooth SCO", "No Bluetooth adapter");
      return false;
    }
    if ((this.mVoiceUnit.getAudioManager() == null) || (!this.mVoiceUnit.getAudioManager().isBluetoothScoAvailableOffCall()))
    {
      AndroidUtil.log("Bluetooth SCO", "Not supported by the platform");
      return false;
    }
    StringBuilder localStringBuilder;
    if (isAlreadyConnected())
    {
      AndroidUtil.log("Bluetooth SCO", "A headset is already connected");
      this.mPresent = true;
      localStringBuilder = new StringBuilder("Ready to be used, headset is ");
      if (!this.mPresent)
        break label291;
    }
    label261: label283: label285: label291: for (String str = ""; ; str = "not ")
    {
      boolean bool;
      label176: Iterator localIterator;
      while (true)
      {
        AndroidUtil.log("Bluetooth SCO", str + "present");
        return true;
        try
        {
          Method localMethod = this.mAdapter.getClass().getMethod("getProfileConnectionState", new Class[] { Integer.class });
          BluetoothAdapter localBluetoothAdapter = this.mAdapter;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(1);
          if (((Integer)localMethod.invoke(localBluetoothAdapter, arrayOfObject)).byteValue() != 2)
            break label261;
          bool = true;
          this.mPresent = bool;
        }
        catch (Throwable localThrowable)
        {
          localIterator = this.mAdapter.getBondedDevices().iterator();
        }
      }
      label199: int i;
      int[] arrayOfInt;
      int j;
      while (localIterator.hasNext())
      {
        BluetoothClass localBluetoothClass = ((BluetoothDevice)localIterator.next()).getBluetoothClass();
        if (localBluetoothClass != null)
        {
          i = localBluetoothClass.getDeviceClass();
          arrayOfInt = sSupportedClasses;
          j = arrayOfInt.length;
        }
      }
      for (int k = 0; ; k++)
      {
        if (k >= j);
        while (true)
        {
          if (this.mPresent)
            break label283;
          break label199;
          break;
          bool = false;
          break label176;
          if (i != arrayOfInt[k])
            break label285;
          this.mPresent = true;
        }
        break;
      }
    }
  }

  private void onConnectionFailed()
  {
    if ((!this.mActive) || (this.mReconnect == 0))
    {
      if (this.mActive)
        AndroidUtil.log("Bluetooth SCO", "No more tries, bailing out");
      disconnect();
      return;
    }
    this.mReconnect = (-1 + this.mReconnect);
    AndroidUtil.log("Bluetooth SCO", "Trying once more...");
    AndroidUtil.handler.postDelayed(new Runnable()
    {
      public void run()
      {
        BluetoothSCO.this.mVoiceUnit.getAudioManager().stopBluetoothSco();
        BluetoothSCO.this.connect();
      }
    }
    , 250L);
  }

  public final BluetoothAdapter getAdapter()
  {
    if (this.mAdapter == null)
      AndroidUtil.runAsMainThread(new Runnable()
      {
        public void run()
        {
          BluetoothSCO.this.mAdapter = BluetoothAdapter.getDefaultAdapter();
        }
      });
    return this.mAdapter;
  }

  public final boolean isActive()
  {
    return this.mActive;
  }

  public final boolean isAlreadyConnected()
  {
    Intent localIntent = AndroidUtil.getApplicationContext().registerReceiver(null, new IntentFilter(ACTION_SCO_AUDIO_STATE_UPDATED));
    int i = -2147483648;
    if (localIntent != null)
      i = localIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
    return i == 1;
  }

  public final boolean isAvailable()
  {
    if (this.mAvailable == null)
      this.mAvailable = Boolean.valueOf(getAvailable());
    return this.mAvailable.booleanValue();
  }

  public final boolean isConnected()
  {
    return this.mConnected;
  }

  public final boolean isHeadsetConnected()
  {
    if (!isAvailable())
      return false;
    return this.mPresent;
  }

  protected final void onConnected()
  {
    this.mConnected = true;
    this.mPresent = true;
    this.mVoiceUnit.onRouteChanged();
    if (this.mVoiceUnit.getDesiredRoute() == AudioRoute.BluetoothSCO)
    {
      this.mVoiceUnit.getAudioManager().setBluetoothScoOn(true);
      return;
    }
    if (this.mRunning)
    {
      stop();
      return;
    }
    AndroidUtil.log("Bluetooth SCO", "We are not running?");
    disconnect();
  }

  public final void start()
  {
    this.mActive = true;
    if (this.mRunning)
      AndroidUtil.log("Bluetooth SCO", "Start requested before stop completed, will carry on");
    do
    {
      return;
      this.mReconnect = 2;
      this.mRunning = true;
      AndroidUtil.log("Bluetooth SCO", "Starting");
      connect();
    }
    while (!isAlreadyConnected());
    AndroidUtil.log("Bluetooth SCO", "Headset already connected");
    onConnected();
  }

  public final void stop()
  {
    this.mActive = false;
    if (!this.mRunning)
      return;
    if (!this.mConnected)
    {
      AndroidUtil.log("Bluetooth SCO", "Stop requested, will stop as soon as possible");
      return;
    }
    AndroidUtil.log("Bluetooth SCO", "Stopping");
    disconnect();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.internal.BluetoothSCO
 * JD-Core Version:    0.6.2
 */