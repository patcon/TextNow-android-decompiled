package cz.acrobits.internal;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.libsoftphone.data.AudioRoute;

public class BluetoothSCO$Receiver extends BroadcastReceiver
{
  public BluetoothSCO$Receiver(BluetoothSCO paramBluetoothSCO)
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction(BluetoothSCO.ACTION_SCO_AUDIO_STATE_UPDATED);
    localIntentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
    localIntentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
    localIntentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
    AndroidUtil.getApplicationContext().registerReceiver(this, localIntentFilter);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (isInitialStickyBroadcast());
    String str;
    label326: 
    while (true)
    {
      return;
      str = paramIntent.getAction();
      if (str.equals(BluetoothSCO.ACTION_SCO_AUDIO_STATE_UPDATED))
      {
        int m = paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
        switch (m)
        {
        default:
          AndroidUtil.log("Bluetooth SCO", "Unknown state " + m);
          return;
        case 1:
          AndroidUtil.log("Bluetooth SCO", "Connected to a headset");
          this.this$0.onConnected();
          return;
        case 0:
          AndroidUtil.log("Bluetooth SCO", "Disconnected from the headset");
          BluetoothSCO.access$2(this.this$0);
          return;
        case 2:
          AndroidUtil.log("Bluetooth SCO", "Connecting to the headset...");
          return;
        case -1:
        }
        AndroidUtil.log("Bluetooth SCO", "Failed to connect to the headset");
        BluetoothSCO.access$2(this.this$0);
        return;
      }
      if ((!str.equals("android.bluetooth.device.action.ACL_CONNECTED")) && (!str.equals("android.bluetooth.device.action.ACL_DISCONNECTED")))
        break;
      BluetoothDevice localBluetoothDevice = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
      if (localBluetoothDevice != null)
      {
        BluetoothClass localBluetoothClass = localBluetoothDevice.getBluetoothClass();
        if (localBluetoothClass != null)
        {
          int i = localBluetoothClass.getDeviceClass();
          int[] arrayOfInt = BluetoothSCO.access$3();
          int j = arrayOfInt.length;
          for (int k = 0; ; k++)
          {
            if (k >= j)
              break label326;
            if (i == arrayOfInt[k])
            {
              if (str.equals("android.bluetooth.device.action.ACL_CONNECTED"))
              {
                AndroidUtil.log("Bluetooth SCO", "New headset connected");
                BluetoothSCO.access$5(this.this$0, Boolean.valueOf(BluetoothSCO.access$4(this.this$0)));
                BluetoothSCO.access$6(this.this$0, true);
                if (BluetoothSCO.access$7(this.this$0).getDesiredRoute() != AudioRoute.BluetoothSCO)
                  break;
                AndroidUtil.handler.postDelayed(new Runnable()
                {
                  public void run()
                  {
                    BluetoothSCO.Receiver.this.this$0.start();
                  }
                }
                , 100L);
                return;
              }
              AndroidUtil.log("Bluetooth SCO", "Headset disconnected");
              BluetoothSCO.access$6(this.this$0, false);
              BluetoothSCO.access$8(this.this$0);
              return;
            }
          }
        }
      }
    }
    if (str.equals("android.bluetooth.adapter.action.STATE_CHANGED"))
    {
      switch (paramIntent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0))
      {
      case 11:
      default:
        return;
      case 10:
        AndroidUtil.log("Bluetooth SCO", "Bluetooth disabled");
        BluetoothSCO.access$6(this.this$0, false);
        BluetoothSCO.access$5(this.this$0, Boolean.valueOf(false));
        BluetoothSCO.access$8(this.this$0);
        return;
      case 12:
      }
      AndroidUtil.log("Bluetooth SCO", "Bluetooth enabled");
      BluetoothSCO.access$5(this.this$0, Boolean.valueOf(BluetoothSCO.access$4(this.this$0)));
      return;
    }
    AndroidUtil.log("Bluetooth SCO", "Unknown action " + str);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.internal.BluetoothSCO.Receiver
 * JD-Core Version:    0.6.2
 */