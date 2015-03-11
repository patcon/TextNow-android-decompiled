package textnow.q;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.app.at;
import android.support.v4.app.av;
import android.support.v4.app.aw;
import android.text.TextUtils;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.WelcomeActivity;
import com.enflick.android.TextNow.activities.quickreply.QuickReplyActivityBase;
import com.enflick.android.TextNow.activities.quickreply.QuickReplyKeyGuardActivity;
import com.enflick.android.TextNow.widget.TNWidget;
import com.enflick.android.TextNow.widget.TNWidget.MessageType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import textnow.u.d;
import textnow.u.r;

public final class o
{
  private static final long[] a = { 0L, 200L, 100L, 200L };
  private static o d;
  private static boolean i = true;
  private Context b;
  private NotificationManager c;
  private long e;
  private long f = -1L;
  private String g = "";
  private boolean h;
  private Map<String, p> j = new HashMap();

  private o(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    this.c = ((NotificationManager)this.b.getSystemService("notification"));
  }

  public static o a(Context paramContext)
  {
    if (d == null)
      d = new o(paramContext);
    return d;
  }

  private void a(av paramav, String paramString)
  {
    if ((paramString == null) || (paramString.startsWith("android.resource")))
      paramav.a(Uri.parse("android.resource://" + this.b.getPackageName() + "/" + 2131099649));
    while (paramString.length() == 0)
      return;
    paramav.a(Uri.parse(paramString));
  }

  public final void a()
  {
    this.c.cancel(0);
    this.j.clear();
    this.h = false;
  }

  public final void a(String paramString)
  {
    if (this.g.equals(paramString))
    {
      this.c.cancel(0);
      this.j.clear();
      this.h = false;
    }
  }

  @TargetApi(11)
  public final void a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, int paramInt3, long paramLong)
  {
    if ((this.g.equals(paramString1)) && (paramLong <= this.f) && (paramInt3 == 0));
    while (true)
    {
      return;
      p localp1;
      if (this.j.containsKey(paramString1))
        localp1 = (p)this.j.get(paramString1);
      int k;
      while (true)
      {
        for (k = 0; localp1.a.size() > 4; k = 1)
          localp1.a.removeFirst();
        localp1 = new p((byte)0);
        this.j.put(paramString1, localp1);
      }
      localp1.a.add(paramString3);
      if (paramInt2 == 0)
        continue;
      String str1;
      label135: r localr;
      av localav1;
      int i1;
      int i2;
      label262: Intent localIntent1;
      String str2;
      label320: String str3;
      label417: aw localaw;
      label596: Bitmap localBitmap1;
      int m;
      int n;
      if (paramString1 == null)
      {
        str1 = "";
        this.g = str1;
        this.f = paramLong;
        localr = new r(this.b);
        if (!localr.l())
          continue;
        localav1 = new av(this.b);
        long l = System.currentTimeMillis();
        if (l - this.e > 3000L)
        {
          a(localav1, localr.v());
          this.e = l;
        }
        if (localr.y())
          localav1 = localav1.a(a);
        if (localr.z())
        {
          i1 = localr.ac().intValue();
          if (i1 != 0)
            break label975;
          i2 = 2131296331;
          localav1.a(this.b.getResources().getColor(i2), 800, 3000);
        }
        localIntent1 = new Intent(this.b, WelcomeActivity.class);
        localIntent1.putExtra("extra_from_notification", true);
        if (TextUtils.isEmpty(paramString2))
          break label989;
        str2 = paramString2;
        localp1.b = str2;
        av localav2 = localav1.a(str2).c(true).c(localr.b() + this.b.getResources().getString(2131493099)).a(2130838062);
        if (TextUtils.isEmpty(paramString2))
          break label995;
        str3 = paramString2 + ": " + paramString3;
        localav2.d(str3);
        localaw = new aw();
        if (this.j.size() != 1)
          break label1102;
        localIntent1.putExtra("extra_notification_contact_value", paramString1);
        localav1.a(PendingIntent.getActivity(this.b, 0, localIntent1, 134217728));
        if (paramInt2 != 2)
          break label1025;
        if (Build.VERSION.SDK_INT >= 16)
        {
          Bitmap localBitmap2 = q.a(this.b).a(paramString3 + "&thumb=" + 250);
          if (localBitmap2 != null)
            localav1.a(new at().a(localBitmap2));
        }
        paramString3 = this.b.getString(2131493158);
        localav1.d(str2 + ": " + paramString3);
        if (Build.VERSION.SDK_INT >= 11)
        {
          Uri localUri = k.a(this.b.getContentResolver(), paramString1, paramInt1);
          localBitmap1 = q.a(this.b).a(localUri, q.a());
          if (localBitmap1 != null)
          {
            m = this.b.getResources().getDimensionPixelSize(17104901);
            n = this.b.getResources().getDimensionPixelSize(17104902);
          }
        }
      }
      try
      {
        localav1.a(Bitmap.createScaledBitmap(localBitmap1, m, n, false));
        label686: d locald = new d(paramString1, paramInt1, paramString2, "");
        if (locald.j())
          localav1.a(2130837891, this.b.getResources().getString(2131493102), TNWidget.getDialerIntent(locald, this.b, 1, "InteractiveNotification"));
        Intent localIntent3 = TNWidget.createConversationIntent(null, this.b, TNWidget.MessageType.EXISTING, "InteractiveNotification");
        localIntent3.putExtra("extra_selected_cv", paramString1);
        localIntent3.putExtra("extra_selected_ct", paramInt1);
        localIntent3.putExtra("extra_widget_reply", true);
        localav1.a(2130837910, this.b.getString(2131493263), PendingIntent.getActivity(this.b, 1, localIntent3, 134217728));
        this.h = true;
        label826: this.c.notify(0, localav1.a());
        KeyguardManager localKeyguardManager = (KeyguardManager)this.b.getSystemService("keyguard");
        if ((TextNowApp.c()) || (!localr.A()))
          continue;
        if ((localKeyguardManager.inKeyguardRestrictedInputMode()) && (localr.B()));
        for (Intent localIntent2 = new Intent(this.b, QuickReplyKeyGuardActivity.class); ; localIntent2 = new Intent(this.b, QuickReplyActivityBase.class))
        {
          localIntent2.addFlags(268435456);
          if (TextUtils.isEmpty(paramString1))
            break;
          localIntent2.putExtra("extra_contact", new d(paramString1, paramInt1, paramString2, null, true));
          localIntent2.putExtra("extra_message", paramString3);
          localIntent2.putExtra("extra_source", paramInt3);
          this.b.startActivity(localIntent2);
          return;
          str1 = paramString1;
          break label135;
          label975: i2 = ab.a(this.b, i1);
          break label262;
          label989: str2 = paramString1;
          break label320;
          label995: str3 = paramString1 + ": " + paramString3;
          break label417;
          label1025: localaw.a(str2);
          if (k != 0)
            localaw.b("...");
          Iterator localIterator2 = localp1.a.iterator();
          while (localIterator2.hasNext())
            localaw.b((String)localIterator2.next());
          localav1.a(localaw).b(paramString3);
          break label596;
          label1102: localav1.a(PendingIntent.getActivity(this.b, 1, localIntent1, 134217728));
          if (this.h)
          {
            this.c.cancel(0);
            this.h = false;
          }
          if (Build.VERSION.SDK_INT >= 11)
            localav1.a(((BitmapDrawable)this.b.getResources().getDrawable(2130837598)).getBitmap());
          localaw.a(this.b.getString(2131493120));
          if (k != 0)
            localaw.b("...");
          Iterator localIterator1 = this.j.values().iterator();
          while (localIterator1.hasNext())
          {
            p localp2 = (p)localIterator1.next();
            localaw.b(localp2.b + ": " + (String)localp2.a.getLast());
          }
          localav1.a(localaw).b(paramString3);
          break label826;
        }
      }
      catch (Throwable localThrowable)
      {
        break label686;
      }
    }
  }

  public final void a(d paramd, long paramLong)
  {
    av localav = new av(this.b);
    Object localObject = paramd.a();
    String str = k.a(this.b.getContentResolver(), (String)localObject);
    if (str == null);
    while (true)
    {
      Intent localIntent1 = new Intent(this.b, MainActivity.class);
      localIntent1.putExtra("extra_show_dialer", true);
      localIntent1.putExtra("extra_dialer_contact", paramd);
      localav.a(PendingIntent.getActivity(this.b, 2, localIntent1, 134217728)).a((CharSequence)localObject).c(true).b(this.b.getString(2131493517)).a(2130837667).b(true).a(true).a(paramLong).b(1);
      Intent localIntent2 = new Intent(this.b, MainActivity.class);
      localIntent2.putExtra("extra_dialer_hangup", true);
      PendingIntent localPendingIntent = PendingIntent.getActivity(this.b, 3, localIntent2, 134217728);
      localav.a(2130837673, this.b.getString(2131493518), localPendingIntent);
      this.c.notify(1, localav.a());
      return;
      localObject = str;
    }
  }

  public final void b()
  {
    this.c.cancelAll();
  }

  public final void b(String paramString)
  {
    r localr = new r(this.b);
    av localav = new av(this.b);
    long l = System.currentTimeMillis();
    if (l - this.e > 3000L)
    {
      a(localav, localr.v());
      this.e = l;
    }
    if (localr.y())
      localav = localav.a(a);
    if (Build.VERSION.SDK_INT >= 11);
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeResource(this.b.getResources(), 2130837598);
      if (localBitmap != null)
        localav.a(localBitmap);
      label108: Intent localIntent = new Intent(this.b, WelcomeActivity.class);
      localIntent.putExtra("extra_from_notification", true);
      localIntent.addFlags(1048576);
      localav.a(PendingIntent.getActivity(this.b, 0, localIntent, 134217728)).a(this.b.getString(2131493012)).b(paramString).c(true).a(2130838062).d(paramString);
      this.c.notify(0, localav.a());
      return;
    }
    catch (Throwable localThrowable)
    {
      break label108;
    }
  }

  public final void c()
  {
    this.c.cancel(1);
  }

  // ERROR //
  public final void d()
  {
    // Byte code:
    //   0: getstatic 33	textnow/q/o:i	Z
    //   3: ifeq +469 -> 472
    //   6: ldc_w 525
    //   9: invokestatic 110	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   12: astore_2
    //   13: iconst_1
    //   14: anewarray 78	java/lang/String
    //   17: astore_3
    //   18: aload_3
    //   19: iconst_0
    //   20: aload_0
    //   21: getfield 58	textnow/q/o:b	Landroid/content/Context;
    //   24: invokevirtual 95	android/content/Context:getPackageName	()Ljava/lang/String;
    //   27: aastore
    //   28: aload_0
    //   29: getfield 58	textnow/q/o:b	Landroid/content/Context;
    //   32: invokevirtual 321	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   35: aload_2
    //   36: iconst_1
    //   37: anewarray 78	java/lang/String
    //   40: dup
    //   41: iconst_0
    //   42: ldc_w 527
    //   45: aastore
    //   46: ldc_w 529
    //   49: aload_3
    //   50: aconst_null
    //   51: invokevirtual 535	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   54: astore 4
    //   56: aload 4
    //   58: ifnonnull +8 -> 66
    //   61: iconst_0
    //   62: putstatic 33	textnow/q/o:i	Z
    //   65: return
    //   66: new 174	textnow/u/r
    //   69: dup
    //   70: aload_0
    //   71: getfield 58	textnow/q/o:b	Landroid/content/Context;
    //   74: invokespecial 175	textnow/u/r:<init>	(Landroid/content/Context;)V
    //   77: invokevirtual 179	textnow/u/r:l	()Z
    //   80: ifeq +386 -> 466
    //   83: aload_0
    //   84: getfield 58	textnow/q/o:b	Landroid/content/Context;
    //   87: invokevirtual 321	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   90: getstatic 540	com/enflick/android/TextNow/persistence/contentproviders/f:d	Landroid/net/Uri;
    //   93: iconst_1
    //   94: anewarray 78	java/lang/String
    //   97: dup
    //   98: iconst_0
    //   99: ldc_w 542
    //   102: aastore
    //   103: ldc_w 544
    //   106: aconst_null
    //   107: aconst_null
    //   108: invokevirtual 535	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   111: astore 18
    //   113: aload 18
    //   115: ifnull +351 -> 466
    //   118: aload 18
    //   120: invokeinterface 549 1 0
    //   125: ifeq +335 -> 460
    //   128: aload 18
    //   130: iconst_0
    //   131: invokeinterface 552 2 0
    //   136: istore 20
    //   138: iload 20
    //   140: istore 5
    //   142: aload 18
    //   144: invokeinterface 555 1 0
    //   149: iconst_0
    //   150: istore 6
    //   152: iconst_0
    //   153: istore 7
    //   155: aload 4
    //   157: invokeinterface 558 1 0
    //   162: ifeq +69 -> 231
    //   165: aload 4
    //   167: iconst_0
    //   168: invokeinterface 559 2 0
    //   173: astore 16
    //   175: ldc_w 561
    //   178: aload 16
    //   180: invokevirtual 135	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   183: istore 17
    //   185: iload 17
    //   187: ifeq +27 -> 214
    //   190: iconst_1
    //   191: istore 6
    //   193: goto -38 -> 155
    //   196: astore 19
    //   198: aload 18
    //   200: invokeinterface 555 1 0
    //   205: aload 19
    //   207: athrow
    //   208: astore_1
    //   209: iconst_0
    //   210: putstatic 33	textnow/q/o:i	Z
    //   213: return
    //   214: ldc_w 563
    //   217: aload 16
    //   219: invokevirtual 135	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   222: ifeq -67 -> 155
    //   225: iconst_1
    //   226: istore 7
    //   228: goto -73 -> 155
    //   231: iload 7
    //   233: ifeq +78 -> 311
    //   236: iload 6
    //   238: ifeq +73 -> 311
    //   241: new 84	java/lang/StringBuilder
    //   244: dup
    //   245: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   248: ldc_w 565
    //   251: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: iload 5
    //   256: invokevirtual 101	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   259: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   262: pop
    //   263: new 567	android/content/ContentValues
    //   266: dup
    //   267: invokespecial 568	android/content/ContentValues:<init>	()V
    //   270: astore 14
    //   272: aload 14
    //   274: ldc_w 570
    //   277: iload 5
    //   279: invokestatic 574	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   282: invokevirtual 577	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   285: aload_0
    //   286: getfield 58	textnow/q/o:b	Landroid/content/Context;
    //   289: invokevirtual 321	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   292: aload_2
    //   293: aload 14
    //   295: ldc_w 529
    //   298: aload_3
    //   299: invokevirtual 581	android/content/ContentResolver:update	(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   302: pop
    //   303: aload 4
    //   305: invokeinterface 555 1 0
    //   310: return
    //   311: iload 7
    //   313: ifne +65 -> 378
    //   316: new 567	android/content/ContentValues
    //   319: dup
    //   320: invokespecial 568	android/content/ContentValues:<init>	()V
    //   323: astore 11
    //   325: aload 11
    //   327: ldc_w 583
    //   330: aload_0
    //   331: getfield 58	textnow/q/o:b	Landroid/content/Context;
    //   334: invokevirtual 95	android/content/Context:getPackageName	()Ljava/lang/String;
    //   337: invokevirtual 586	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   340: aload 11
    //   342: ldc_w 527
    //   345: ldc_w 563
    //   348: invokevirtual 586	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   351: aload 11
    //   353: ldc_w 570
    //   356: iload 5
    //   358: invokestatic 574	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   361: invokevirtual 577	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   364: aload_0
    //   365: getfield 58	textnow/q/o:b	Landroid/content/Context;
    //   368: invokevirtual 321	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   371: aload_2
    //   372: aload 11
    //   374: invokevirtual 590	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   377: pop
    //   378: iload 6
    //   380: ifne -77 -> 303
    //   383: new 567	android/content/ContentValues
    //   386: dup
    //   387: invokespecial 568	android/content/ContentValues:<init>	()V
    //   390: astore 9
    //   392: aload 9
    //   394: ldc_w 583
    //   397: aload_0
    //   398: getfield 58	textnow/q/o:b	Landroid/content/Context;
    //   401: invokevirtual 95	android/content/Context:getPackageName	()Ljava/lang/String;
    //   404: invokevirtual 586	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   407: aload 9
    //   409: ldc_w 527
    //   412: ldc_w 561
    //   415: invokevirtual 586	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   418: aload 9
    //   420: ldc_w 570
    //   423: iload 5
    //   425: invokestatic 574	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   428: invokevirtual 577	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   431: aload_0
    //   432: getfield 58	textnow/q/o:b	Landroid/content/Context;
    //   435: invokevirtual 321	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   438: aload_2
    //   439: aload 9
    //   441: invokevirtual 590	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   444: pop
    //   445: goto -142 -> 303
    //   448: astore 8
    //   450: aload 4
    //   452: invokeinterface 555 1 0
    //   457: aload 8
    //   459: athrow
    //   460: iconst_0
    //   461: istore 5
    //   463: goto -321 -> 142
    //   466: iconst_0
    //   467: istore 5
    //   469: goto -320 -> 149
    //   472: return
    //
    // Exception table:
    //   from	to	target	type
    //   118	138	196	finally
    //   6	56	208	java/lang/Exception
    //   61	65	208	java/lang/Exception
    //   66	113	208	java/lang/Exception
    //   142	149	208	java/lang/Exception
    //   198	208	208	java/lang/Exception
    //   303	310	208	java/lang/Exception
    //   450	460	208	java/lang/Exception
    //   155	185	448	finally
    //   214	225	448	finally
    //   241	303	448	finally
    //   316	378	448	finally
    //   383	445	448	finally
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.o
 * JD-Core Version:    0.6.2
 */