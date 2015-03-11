package cz.acrobits.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.ali.PointerHolder;
import cz.acrobits.libsoftphone.Instance;
import cz.acrobits.libsoftphone.Preferences;
import cz.acrobits.libsoftphone.Preferences.Key;
import cz.acrobits.libsoftphone.Preferences.ROKey;
import cz.acrobits.libsoftphone.data.AudioRoute;
import java.lang.reflect.Field;
import java.util.ArrayList;

public final class VoiceUnit extends PointerHolder
{
  public static final String TAG = "VoiceUnit";
  private static final long[] VIBRATION = arrayOfLong;
  private final AudioManager mAudioManager;
  private final BluetoothSCO mBluetooth;
  private final int mCallMode;
  private Boolean mCanUseBluetooth;
  private boolean mHeadsetConnected;
  private final VoiceUnit.Receiver mReceiver;
  private AudioRoute mRoute;
  private final TelephonyManager mTelephonyManager;
  private Vibrator mVibrator;

  static
  {
    long[] arrayOfLong = new long[5];
    arrayOfLong[1] = 500L;
    arrayOfLong[2] = 300L;
    arrayOfLong[3] = 500L;
    arrayOfLong[4] = 300L;
  }

  protected VoiceUnit()
  {
    Context localContext = AndroidUtil.getApplicationContext();
    this.mAudioManager = ((AudioManager)localContext.getSystemService("audio"));
    this.mAudioManager.setMode(0);
    this.mAudioManager.setMicrophoneMute(false);
    this.mTelephonyManager = ((TelephonyManager)localContext.getSystemService("phone"));
    int i = 2;
    try
    {
      i = AudioManager.class.getField("MODE_IN_COMMUNICATION").getInt(AudioManager.class);
      AndroidUtil.log("VoiceUnit", "Detected call mode: MODE_IN_COMMUNICATION");
      this.mCallMode = i;
      this.mBluetooth = new BluetoothSCO(this);
      this.mReceiver = new VoiceUnit.Receiver(this);
      this.mHeadsetConnected = this.mAudioManager.isWiredHeadsetOn();
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AndroidUtil.log("VoiceUnit", "Detected call mode: MODE_IN_CALL");
    }
  }

  protected final boolean canUseBluetoothSCO()
  {
    return this.mBluetooth.isAvailable();
  }

  protected final AudioManager getAudioManager()
  {
    return this.mAudioManager;
  }

  protected final AudioRoute[] getAvailableRoutes()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(getReceiverRoute());
    localArrayList.add(AudioRoute.Speaker);
    if (this.mBluetooth.isHeadsetConnected())
      localArrayList.add(AudioRoute.BluetoothSCO);
    return (AudioRoute[])localArrayList.toArray(new AudioRoute[0]);
  }

  @TargetApi(17)
  protected final int getBestNativeSamplingRate()
  {
    int i = ((Integer)Instance.preferences.samplingRateOverride.get()).intValue();
    if ((i == 16000) || (i == 32000) || (i == 48000))
      return i;
    String str;
    if (Build.VERSION.SDK_INT >= 17)
    {
      str = this.mAudioManager.getProperty("android.media.property.PROPERTY_OUTPUT_SAMPLE_RATE");
      if (str == null);
    }
    while (true)
    {
      try
      {
        int j = Integer.parseInt(str);
        i = j;
        if (i == 0)
          i = AudioTrack.getNativeOutputSampleRate(0);
        switch (i)
        {
        case 16000:
        case 32000:
        case 48000:
        }
        return 16000;
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
      i = 0;
    }
  }

  protected final int getCallMode()
  {
    if (((Boolean)Instance.preferences.legacyAudio.get()).booleanValue())
      return 2;
    return this.mCallMode;
  }

  protected final AudioRoute getDesiredRoute()
  {
    if (this.mRoute == null)
      this.mRoute = getRoute();
    return this.mRoute;
  }

  protected final int getMaxVolume()
  {
    return this.mAudioManager.getStreamMaxVolume(0);
  }

  @TargetApi(17)
  protected final int getMinimumBufferSize(int paramInt)
  {
    return paramInt / 50;
  }

  public final AudioRoute getReceiverRoute()
  {
    if (this.mHeadsetConnected)
      return AudioRoute.Headset;
    return AudioRoute.Receiver;
  }

  protected final AudioRoute getRoute()
  {
    if (this.mBluetooth.isConnected())
      return AudioRoute.BluetoothSCO;
    if (this.mAudioManager.isSpeakerphoneOn())
      return AudioRoute.Speaker;
    return getReceiverRoute();
  }

  protected final int getVolume()
  {
    return this.mAudioManager.getStreamVolume(0);
  }

  protected final boolean isRingerMuted()
  {
    return this.mAudioManager.getRingerMode() != 2;
  }

  protected final boolean isVibrating()
  {
    return this.mVibrator != null;
  }

  protected final native void onRouteChanged();

  protected final void setCallMode()
  {
    setMode(getCallMode());
  }

  protected final void setDesiredRoute(AudioRoute paramAudioRoute)
  {
    if (paramAudioRoute == getDesiredRoute())
      return;
    AndroidUtil.log("VoiceUnit", "Switching route to " + paramAudioRoute.toString());
    this.mRoute = paramAudioRoute;
    switch ($SWITCH_TABLE$cz$acrobits$libsoftphone$data$AudioRoute()[paramAudioRoute.ordinal()])
    {
    default:
      return;
    case 1:
    case 2:
      trySetBluetooth(false);
      setSpeakerphone(false);
      onRouteChanged();
      return;
    case 3:
      trySetBluetooth(false);
      setSpeakerphone(true);
      onRouteChanged();
      return;
    case 4:
    case 5:
    }
    setSpeakerphone(false);
    trySetBluetooth(true);
    onRouteChanged();
  }

  protected final void setMode(int paramInt)
  {
    this.mAudioManager.setMode(paramInt);
  }

  protected final void setSpeakerphone(boolean paramBoolean)
  {
    this.mAudioManager.setSpeakerphoneOn(paramBoolean);
    AndroidUtil.handler.postDelayed(new Runnable()
    {
      public void run()
      {
        if (VoiceUnit.this.getRoute() == AudioRoute.Speaker)
          VoiceUnit.this.mAudioManager.setSpeakerphoneOn(true);
      }
    }
    , 500L);
  }

  protected final boolean shouldRingerVibrate()
  {
    return this.mAudioManager.shouldVibrate(0);
  }

  protected final boolean stopVibrating()
  {
    if (this.mVibrator == null)
      return false;
    this.mVibrator.cancel();
    this.mVibrator = null;
    return true;
  }

  protected final void trySetBluetooth(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.mBluetooth.isAvailable())
        this.mBluetooth.start();
      return;
    }
    this.mBluetooth.stop();
  }

  @TargetApi(11)
  protected final boolean vibrate(boolean paramBoolean)
  {
    if (this.mVibrator != null);
    do
    {
      return false;
      this.mVibrator = ((Vibrator)AndroidUtil.getContext().getSystemService("vibrator"));
    }
    while ((Build.VERSION.SDK_INT >= 11) && (!this.mVibrator.hasVibrator()));
    Vibrator localVibrator = this.mVibrator;
    long[] arrayOfLong = VIBRATION;
    if (paramBoolean);
    for (int i = -1; ; i = 0)
    {
      localVibrator.vibrate(arrayOfLong, i);
      if (paramBoolean)
        this.mVibrator = null;
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.internal.VoiceUnit
 * JD-Core Version:    0.6.2
 */