package com.enflick.android.TextNow.activities.phone;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Vibrator;
import android.util.Log;
import textnow.q.a;
import textnow.u.r;

public class u
{
  private static u f;
  Ringtone a;
  Vibrator b;
  volatile boolean c;
  v d;
  Context e;
  private w g;
  private Handler h;
  private long i = -1L;
  private long j = -1L;
  private MediaPlayer k;

  private u(Context paramContext)
  {
    this.e = paramContext;
    this.b = ((Vibrator)paramContext.getSystemService("vibrator"));
  }

  public static u a(Context paramContext)
  {
    try
    {
      if (f == null)
        f = new u(paramContext);
      while (true)
      {
        u localu = f;
        return localu;
        Log.wtf("Ringer", "init() called multiple times!  sInstance = " + f);
      }
    }
    finally
    {
    }
  }

  public final void a()
  {
    try
    {
      if ((new r(this.e).y()) && (this.d == null))
      {
        this.c = true;
        this.d = new v(this, (byte)0);
        this.d.start();
      }
      return;
    }
    finally
    {
    }
  }

  public final void a(final String paramString)
  {
    if (paramString != null);
    try
    {
      if (paramString.length() == 0)
        return;
      if (((AudioManager)this.e.getSystemService("audio")).getStreamVolume(2) == 0)
        return;
    }
    finally
    {
    }
    if (this.g != null)
    {
      new StringBuilder().append("Skipping making looper for: ").append(paramString).toString();
      if (this.i >= 0L)
        break label155;
      this.i = SystemClock.elapsedRealtime();
      this.h.sendEmptyMessage(1);
    }
    while (true)
    {
      return;
      new StringBuilder().append("Making ring looper with ringtone: ").append(paramString).toString();
      this.g = new w(this, "ringer");
      this.h = new Handler(this.g.a())
      {
        // ERROR //
        public final void handleMessage(Message paramAnonymousMessage)
        {
          // Byte code:
          //   0: aload_1
          //   1: getfield 29	android/os/Message:what	I
          //   4: tableswitch	default:+28 -> 32, 1:+29->33, 2:+28->32, 3:+246->250
          //   33: ldc 31
          //   35: invokestatic 34	com/enflick/android/TextNow/activities/phone/u:b	(Ljava/lang/String;)V
          //   38: aload_0
          //   39: iconst_3
          //   40: invokevirtual 38	com/enflick/android/TextNow/activities/phone/u$1:hasMessages	(I)Z
          //   43: ifne +94 -> 137
          //   46: aload_0
          //   47: getfield 16	com/enflick/android/TextNow/activities/phone/u$1:a	Ljava/lang/String;
          //   50: astore 10
          //   52: aload 10
          //   54: ifnonnull +22 -> 76
          //   57: new 40	textnow/u/r
          //   60: dup
          //   61: aload_0
          //   62: getfield 14	com/enflick/android/TextNow/activities/phone/u$1:b	Lcom/enflick/android/TextNow/activities/phone/u;
          //   65: getfield 44	com/enflick/android/TextNow/activities/phone/u:e	Landroid/content/Context;
          //   68: invokespecial 47	textnow/u/r:<init>	(Landroid/content/Context;)V
          //   71: invokevirtual 51	textnow/u/r:w	()Ljava/lang/String;
          //   74: astore 10
          //   76: aload_0
          //   77: getfield 14	com/enflick/android/TextNow/activities/phone/u$1:b	Lcom/enflick/android/TextNow/activities/phone/u;
          //   80: getfield 44	com/enflick/android/TextNow/activities/phone/u:e	Landroid/content/Context;
          //   83: aload 10
          //   85: invokestatic 56	textnow/q/ad:a	(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;
          //   88: astore 11
          //   90: aload_0
          //   91: getfield 14	com/enflick/android/TextNow/activities/phone/u$1:b	Lcom/enflick/android/TextNow/activities/phone/u;
          //   94: getfield 44	com/enflick/android/TextNow/activities/phone/u:e	Landroid/content/Context;
          //   97: aload 11
          //   99: invokestatic 62	android/media/RingtoneManager:getRingtone	(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/Ringtone;
          //   102: astore 17
          //   104: aload 17
          //   106: astore 14
          //   108: aload_0
          //   109: getfield 14	com/enflick/android/TextNow/activities/phone/u$1:b	Lcom/enflick/android/TextNow/activities/phone/u;
          //   112: astore 15
          //   114: aload 15
          //   116: monitorenter
          //   117: aload_0
          //   118: iconst_3
          //   119: invokevirtual 38	com/enflick/android/TextNow/activities/phone/u$1:hasMessages	(I)Z
          //   122: ifne +12 -> 134
          //   125: aload_0
          //   126: getfield 14	com/enflick/android/TextNow/activities/phone/u$1:b	Lcom/enflick/android/TextNow/activities/phone/u;
          //   129: aload 14
          //   131: putfield 65	com/enflick/android/TextNow/activities/phone/u:a	Landroid/media/Ringtone;
          //   134: aload 15
          //   136: monitorexit
          //   137: aload_0
          //   138: getfield 14	com/enflick/android/TextNow/activities/phone/u$1:b	Lcom/enflick/android/TextNow/activities/phone/u;
          //   141: getfield 65	com/enflick/android/TextNow/activities/phone/u:a	Landroid/media/Ringtone;
          //   144: astore_3
          //   145: aload_3
          //   146: ifnull -114 -> 32
          //   149: aload_0
          //   150: iconst_3
          //   151: invokevirtual 38	com/enflick/android/TextNow/activities/phone/u$1:hasMessages	(I)Z
          //   154: ifne -122 -> 32
          //   157: aload_3
          //   158: invokevirtual 71	android/media/Ringtone:isPlaying	()Z
          //   161: ifne -129 -> 32
          //   164: aload_3
          //   165: invokevirtual 75	android/media/Ringtone:play	()V
          //   168: aload_0
          //   169: getfield 14	com/enflick/android/TextNow/activities/phone/u$1:b	Lcom/enflick/android/TextNow/activities/phone/u;
          //   172: astore 6
          //   174: aload 6
          //   176: monitorenter
          //   177: aload_0
          //   178: getfield 14	com/enflick/android/TextNow/activities/phone/u$1:b	Lcom/enflick/android/TextNow/activities/phone/u;
          //   181: invokestatic 78	com/enflick/android/TextNow/activities/phone/u:a	(Lcom/enflick/android/TextNow/activities/phone/u;)J
          //   184: lconst_0
          //   185: lcmp
          //   186: ifge +14 -> 200
          //   189: aload_0
          //   190: getfield 14	com/enflick/android/TextNow/activities/phone/u$1:b	Lcom/enflick/android/TextNow/activities/phone/u;
          //   193: invokestatic 84	android/os/SystemClock:elapsedRealtime	()J
          //   196: invokestatic 87	com/enflick/android/TextNow/activities/phone/u:a	(Lcom/enflick/android/TextNow/activities/phone/u;J)J
          //   199: pop2
          //   200: aload 6
          //   202: monitorexit
          //   203: return
          //   204: astore 7
          //   206: aload 6
          //   208: monitorexit
          //   209: aload 7
          //   211: athrow
          //   212: astore 12
          //   214: aload 12
          //   216: invokestatic 93	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
          //   219: pop
          //   220: aconst_null
          //   221: astore 14
          //   223: goto -115 -> 108
          //   226: astore 16
          //   228: aload 15
          //   230: monitorexit
          //   231: aload 16
          //   233: athrow
          //   234: astore 4
          //   236: aload 4
          //   238: invokestatic 93	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
          //   241: pop
          //   242: aload_0
          //   243: invokevirtual 97	com/enflick/android/TextNow/activities/phone/u$1:getLooper	()Landroid/os/Looper;
          //   246: invokevirtual 102	android/os/Looper:quit	()V
          //   249: return
          //   250: ldc 104
          //   252: invokestatic 34	com/enflick/android/TextNow/activities/phone/u:b	(Ljava/lang/String;)V
          //   255: aload_1
          //   256: getfield 108	android/os/Message:obj	Ljava/lang/Object;
          //   259: checkcast 67	android/media/Ringtone
          //   262: astore_2
          //   263: aload_2
          //   264: ifnull +15 -> 279
          //   267: aload_2
          //   268: invokevirtual 111	android/media/Ringtone:stop	()V
          //   271: aload_0
          //   272: invokevirtual 97	com/enflick/android/TextNow/activities/phone/u$1:getLooper	()Landroid/os/Looper;
          //   275: invokevirtual 102	android/os/Looper:quit	()V
          //   278: return
          //   279: new 113	java/lang/StringBuilder
          //   282: dup
          //   283: invokespecial 115	java/lang/StringBuilder:<init>	()V
          //   286: ldc 117
          //   288: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   291: aload_1
          //   292: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   295: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   298: invokestatic 34	com/enflick/android/TextNow/activities/phone/u:b	(Ljava/lang/String;)V
          //   301: goto -30 -> 271
          //
          // Exception table:
          //   from	to	target	type
          //   177	200	204	finally
          //   200	203	204	finally
          //   90	104	212	java/lang/Exception
          //   117	134	226	finally
          //   134	137	226	finally
          //   164	168	234	java/lang/Exception
        }
      };
      break;
      label155: if (this.j > 0L)
      {
        if (a.a)
          new StringBuilder().append("delaying ring by ").append(this.j - this.i).toString();
        this.h.sendEmptyMessageDelayed(1, this.j - this.i);
      }
      else
      {
        this.i = SystemClock.elapsedRealtime();
      }
    }
  }

  public final void b()
  {
    try
    {
      if (this.k != null)
      {
        this.k.stop();
        this.k = null;
      }
      if (this.h != null)
      {
        this.h.removeCallbacksAndMessages(null);
        Message localMessage = this.h.obtainMessage(3);
        localMessage.obj = this.a;
        this.h.sendMessage(localMessage);
        this.g = null;
        this.h = null;
        this.a = null;
        this.i = -1L;
        this.j = -1L;
      }
      if (this.d != null)
      {
        this.c = false;
        this.d = null;
      }
      this.b.cancel();
      return;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.u
 * JD-Core Version:    0.6.2
 */