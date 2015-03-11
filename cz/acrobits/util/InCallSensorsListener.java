package cz.acrobits.util;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.libsoftphone.SDK;
import cz.acrobits.video.VideoCallView;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public class InCallSensorsListener extends OrientationEventListener
  implements SensorEventListener
{
  public static final float ACCELEROMETER_FLAT = 1.5F;
  public static final float ACCELEROMETER_FULL = 9.31F;
  public static final float ACCELEROMETER_THRESHOLD = 0.5F;
  public static final String TAG = "InCallSensorsListener";
  private static final Sensor sAccelerometer;
  private static InCallSensorsListener sActiveListener;
  private static String[] sBacktrace;
  private static final PowerManager.WakeLock sProximityLock;
  private static final Method sProximityRelease;
  private static final int sProximityWaitFlag;
  private static final PowerManager.WakeLock sScreenLock;
  public final Activity mActivity;
  private boolean mAutoSpeaker = false;
  private final SensorManager mSensorManager;
  private final Set<VideoCallView> mVideoViews = Collections.newSetFromMap(new WeakHashMap());

  // ERROR //
  static
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: aconst_null
    //   3: putstatic 45	cz/acrobits/util/InCallSensorsListener:sActiveListener	Lcz/acrobits/util/InCallSensorsListener;
    //   6: aconst_null
    //   7: putstatic 47	cz/acrobits/util/InCallSensorsListener:sBacktrace	[Ljava/lang/String;
    //   10: invokestatic 53	cz/acrobits/ali/AndroidUtil:getApplicationContext	()Landroid/content/Context;
    //   13: astore_1
    //   14: aload_1
    //   15: ldc 55
    //   17: invokevirtual 61	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   20: checkcast 63	android/os/PowerManager
    //   23: astore_2
    //   24: aload_1
    //   25: ldc 65
    //   27: invokevirtual 61	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   30: checkcast 67	android/hardware/SensorManager
    //   33: iconst_1
    //   34: invokevirtual 71	android/hardware/SensorManager:getDefaultSensor	(I)Landroid/hardware/Sensor;
    //   37: putstatic 73	cz/acrobits/util/InCallSensorsListener:sAccelerometer	Landroid/hardware/Sensor;
    //   40: aload_2
    //   41: ldc 63
    //   43: ldc 75
    //   45: invokevirtual 81	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   48: aconst_null
    //   49: invokevirtual 87	java/lang/reflect/Field:getInt	(Ljava/lang/Object;)I
    //   52: ldc 89
    //   54: invokevirtual 93	android/os/PowerManager:newWakeLock	(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
    //   57: astore 13
    //   59: aload 13
    //   61: astore 4
    //   63: aload 4
    //   65: putstatic 95	cz/acrobits/util/InCallSensorsListener:sProximityLock	Landroid/os/PowerManager$WakeLock;
    //   68: aload_2
    //   69: ldc 96
    //   71: ldc 98
    //   73: invokevirtual 93	android/os/PowerManager:newWakeLock	(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
    //   76: astore 12
    //   78: aload 12
    //   80: astore 6
    //   82: aload 6
    //   84: putstatic 100	cz/acrobits/util/InCallSensorsListener:sScreenLock	Landroid/os/PowerManager$WakeLock;
    //   87: getstatic 95	cz/acrobits/util/InCallSensorsListener:sProximityLock	Landroid/os/PowerManager$WakeLock;
    //   90: ifnull +134 -> 224
    //   93: ldc 63
    //   95: ldc 102
    //   97: invokevirtual 81	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   100: aconst_null
    //   101: invokevirtual 87	java/lang/reflect/Field:getInt	(Ljava/lang/Object;)I
    //   104: istore 10
    //   106: iload 10
    //   108: istore 7
    //   110: iconst_1
    //   111: anewarray 77	java/lang/Class
    //   114: astore 11
    //   116: aload 11
    //   118: iconst_0
    //   119: getstatic 108	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   122: aastore
    //   123: ldc 110
    //   125: ldc 112
    //   127: aload 11
    //   129: invokevirtual 116	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   132: astore_0
    //   133: ldc 17
    //   135: ldc 118
    //   137: invokestatic 122	cz/acrobits/ali/AndroidUtil:log	(Ljava/lang/String;Ljava/lang/String;)V
    //   140: aload_0
    //   141: putstatic 124	cz/acrobits/util/InCallSensorsListener:sProximityRelease	Ljava/lang/reflect/Method;
    //   144: iload 7
    //   146: putstatic 126	cz/acrobits/util/InCallSensorsListener:sProximityWaitFlag	I
    //   149: return
    //   150: astore_3
    //   151: ldc 17
    //   153: ldc 128
    //   155: invokestatic 122	cz/acrobits/ali/AndroidUtil:log	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: aconst_null
    //   159: astore 4
    //   161: goto -98 -> 63
    //   164: astore 5
    //   166: ldc 17
    //   168: ldc 130
    //   170: invokestatic 122	cz/acrobits/ali/AndroidUtil:log	(Ljava/lang/String;Ljava/lang/String;)V
    //   173: aconst_null
    //   174: astore 6
    //   176: goto -94 -> 82
    //   179: astore 8
    //   181: aload 8
    //   183: astore 9
    //   185: iconst_0
    //   186: istore 7
    //   188: ldc 17
    //   190: new 132	java/lang/StringBuilder
    //   193: dup
    //   194: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   197: ldc 137
    //   199: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: aload 9
    //   204: invokevirtual 145	java/lang/Throwable:toString	()Ljava/lang/String;
    //   207: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   213: invokestatic 122	cz/acrobits/ali/AndroidUtil:log	(Ljava/lang/String;Ljava/lang/String;)V
    //   216: goto -76 -> 140
    //   219: astore 9
    //   221: goto -33 -> 188
    //   224: iconst_0
    //   225: istore 7
    //   227: aconst_null
    //   228: astore_0
    //   229: goto -89 -> 140
    //
    // Exception table:
    //   from	to	target	type
    //   40	59	150	java/lang/Throwable
    //   68	78	164	java/lang/Throwable
    //   93	106	179	java/lang/Throwable
    //   110	140	219	java/lang/Throwable
  }

  public InCallSensorsListener(Activity paramActivity)
  {
    super(paramActivity);
    this.mActivity = paramActivity;
    this.mSensorManager = ((SensorManager)paramActivity.getSystemService("sensor"));
  }

  private void disableProximityLock()
  {
    if ((sProximityLock == null) || (!sProximityLock.isHeld()))
      return;
    if (sProximityRelease != null)
      try
      {
        Method localMethod = sProximityRelease;
        PowerManager.WakeLock localWakeLock = sProximityLock;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(sProximityWaitFlag);
        localMethod.invoke(localWakeLock, arrayOfObject);
        return;
      }
      catch (Throwable localThrowable)
      {
        AndroidUtil.log("InCallSensorsListener", "Failed to invoke the correct release method on proximity lock: " + localThrowable.toString());
      }
    sProximityLock.release();
  }

  private void enableProximityLock()
  {
    if ((sProximityLock == null) || (sProximityLock.isHeld()))
      return;
    sProximityLock.acquire();
  }

  private void fillViews(View paramView)
  {
    if ((paramView instanceof VideoCallView))
      this.mVideoViews.add((VideoCallView)paramView);
    while (true)
    {
      return;
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        for (int i = 0; i < localViewGroup.getChildCount(); i++)
          fillViews(localViewGroup.getChildAt(i));
      }
    }
  }

  private native boolean proximityLockRequested();

  private native void setAutoSpeaker(boolean paramBoolean);

  public void disable()
  {
    if (sActiveListener != this)
      throw new IllegalStateException("This InCallSensorsListener is not running");
    AndroidUtil.log("InCallSensorsListener", "Disable");
    sBacktrace = null;
    disableProximityLock();
    this.mVideoViews.clear();
    this.mSensorManager.unregisterListener(this);
    sScreenLock.release();
    sActiveListener = null;
    super.disable();
  }

  public void enable()
  {
    if (sActiveListener != null)
      if (sActiveListener != this);
    do
    {
      return;
      StringBuilder localStringBuilder = new StringBuilder().append("There is already an InCallSensorsListener running");
      if (sBacktrace == null);
      for (String str = ""; ; str = " from:\n.. " + TextUtils.join("\n.. ", sBacktrace))
        throw new IllegalStateException(str);
      AndroidUtil.log("InCallSensorsListener", "Enable");
      super.enable();
      if (SDK.debug)
        sBacktrace = AndroidUtil.getBacktrace();
      sActiveListener = this;
      sScreenLock.acquire();
      this.mAutoSpeaker = false;
      this.mVideoViews.clear();
      fillViews(this.mActivity.findViewById(16908290));
      if (!this.mSensorManager.registerListener(this, sAccelerometer, 3))
        AndroidUtil.log("InCallSensorsListener", "Failed to register for accelerometer");
    }
    while (!proximityLockRequested());
    enableProximityLock();
  }

  public boolean isEnabled()
  {
    return sActiveListener == this;
  }

  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public void onOrientationChanged(int paramInt)
  {
    Iterator localIterator = this.mVideoViews.iterator();
    int i = 0;
    int j = 0;
    while (localIterator.hasNext())
    {
      VideoCallView localVideoCallView = (VideoCallView)localIterator.next();
      if (localVideoCallView.isRunning())
      {
        int i1 = localVideoCallView.getOrientation();
        localVideoCallView.updateOrientation(paramInt);
        int i2 = localVideoCallView.getOrientation();
        j = i1;
        i = i2;
      }
    }
    if (j == i)
      return;
    int k = VideoCallView.getSurfaceRotation();
    int m = (j + k) % 360;
    int n = (k + i) % 360;
    onVideoRotationChanged(360 - m, 360 - n);
  }

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (paramSensorEvent.sensor.equals(sAccelerometer))
    {
      if (!this.mAutoSpeaker)
        break label75;
      if ((Math.abs(paramSensorEvent.values[0]) <= 2.0F) && (Math.abs(paramSensorEvent.values[1]) <= 2.0F) && (paramSensorEvent.values[2] <= -8.81F));
    }
    for (this.mAutoSpeaker = false; ; this.mAutoSpeaker = true)
      label75: 
      do
      {
        setAutoSpeaker(this.mAutoSpeaker);
        return;
      }
      while ((Math.abs(paramSensorEvent.values[0]) >= 1.5F) || (Math.abs(paramSensorEvent.values[1]) >= 1.5F) || (paramSensorEvent.values[2] >= -9.31F));
  }

  public void onVideoRotationChanged(int paramInt1, int paramInt2)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.util.InCallSensorsListener
 * JD-Core Version:    0.6.2
 */