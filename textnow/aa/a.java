package textnow.aa;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.app.an;
import android.support.v4.app.ao;
import android.support.v4.app.ap;
import android.support.v4.app.ar;
import android.support.v4.app.bc;
import android.support.v4.app.bo;
import android.text.TextUtils;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.MessageViewFragment;
import com.enflick.android.TextNow.activities.WelcomeActivity;
import com.enflick.android.TextNow.activities.quickreply.QuickReplyActivityBase;
import com.enflick.android.TextNow.activities.quickreply.QuickReplyKeyGuardActivity;
import com.enflick.android.TextNow.chatheads.ChatHeadIntentService;
import com.enflick.android.TextNow.widget.TNWidget;
import com.enflick.android.TextNow.widget.TNWidget.MessageType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import textnow.v.k;
import textnow.v.o;
import textnow.v.y;
import textnow.z.f;
import textnow.z.h;
import textnow.z.u;

public final class a
{
  private static final long[] a = { 0L, 200L, 100L, 200L };
  private static a d;
  private static boolean i = true;
  private Context b;
  private bo c;
  private long e;
  private long f = -1L;
  private String g = "";
  private boolean h;
  private Map<String, b> j = new HashMap();

  private a(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    this.c = bo.a(paramContext);
  }

  public static a a(Context paramContext)
  {
    if (d == null)
      d = new a(paramContext);
    return d;
  }

  private void a(ap paramap, String paramString)
  {
    if ((paramString == null) || (paramString.startsWith("android.resource")))
      paramap.a(Uri.parse("android.resource://" + this.b.getPackageName() + "/" + 2131099649));
    while (paramString.length() == 0)
      return;
    paramap.a(Uri.parse(paramString));
  }

  public final void a()
  {
    this.c.a(0);
    this.j.clear();
    this.h = false;
  }

  public final void a(String paramString)
  {
    if (this.g.equals(paramString))
    {
      this.c.a(0);
      this.j.clear();
      this.h = false;
    }
  }

  @TargetApi(11)
  public final void a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, int paramInt3, long paramLong)
  {
    if ((this.g.equals(paramString1)) && (paramLong <= this.f) && (paramInt3 == 0));
    Object localObject;
    int k;
    String str1;
    label139: u localu;
    do
    {
      do
      {
        return;
        if (this.j.containsKey(paramString1));
        b localb1;
        for (localObject = (b)this.j.get(paramString1); ; localObject = localb1)
        {
          for (k = 0; ((b)localObject).a.size() > 4; k = 1)
            ((b)localObject).a.removeFirst();
          localb1 = new b((byte)0);
          this.j.put(paramString1, localb1);
        }
        ((b)localObject).a.add(paramString3);
      }
      while (paramInt2 == 0);
      if (paramString1 != null)
        break;
      str1 = "";
      this.g = str1;
      this.f = paramLong;
      localu = new u(this.b);
    }
    while (!localu.l());
    ap localap1 = new ap(this.b);
    Set localSet = h.b(this.b);
    textnow.z.g localg = f.a(this.b, localSet, paramString1, 2);
    String str2;
    label219: h localh;
    long l;
    if (localg != null)
    {
      str2 = localg.a;
      localh = h.a(this.b.getContentResolver(), new String[] { str2 });
      l = System.currentTimeMillis();
      if (l - this.e > 3000L)
      {
        if ((localh == null) || (localh.n()))
          break label1173;
        a(localap1, localu.t());
        this.e = l;
      }
      label289: if ((!localu.w()) || ((localh != null) && (localh.n())))
        break label1709;
    }
    label402: label539: label1066: label1709: for (ap localap2 = localap1.a(a); ; localap2 = localap1)
    {
      int i6;
      label353: Intent localIntent1;
      String str3;
      String str4;
      label499: ar localar;
      Uri localUri;
      String str5;
      f localf;
      bc localbc;
      if (localu.x())
      {
        if (localu.ab().intValue() == 0)
        {
          i6 = this.b.getResources().getColor(2131230878);
          localap2.a(i6, 800, 3000);
        }
      }
      else
      {
        localIntent1 = new Intent(this.b, WelcomeActivity.class);
        localIntent1.putExtra("extra_from_notification", true);
        if (TextUtils.isEmpty(paramString2))
          break label1213;
        str3 = paramString2;
        ((b)localObject).b = str3;
        ap localap3 = localap2.a(str3).c(true).c(localu.b() + this.b.getResources().getString(2131296506)).a(2130838023);
        if (TextUtils.isEmpty(paramString2))
          break label1219;
        str4 = paramString2 + ": " + paramString3;
        localap3.d(str4);
        localar = new ar();
        localUri = k.a(this.b.getContentResolver(), paramString1, paramInt1);
        if (localUri != null)
          break label1249;
        str5 = "";
        localf = new f(paramString1, paramInt1, paramString2, str5, true);
        if (this.j.size() != 1)
          break label1403;
        localbc = com.enflick.android.TextNow.wear.a.a(this.b, paramString1, paramString2);
        localIntent1.putExtra("extra_notification_contact_value", paramString1);
        localap2.a(PendingIntent.getActivity(this.b, 0, localIntent1, 134217728));
        if (paramInt2 != 2)
          break label1259;
        if (Build.VERSION.SDK_INT < 16)
          break label1703;
        Bitmap localBitmap2 = o.a(this.b).a(paramString3 + "&thumb=" + 250);
        if (localBitmap2 == null)
          break label1703;
        localap2.a(new an().a(localBitmap2));
        localbc.a(localBitmap2);
      }
      for (int i5 = 1; ; i5 = 0)
        while (true)
        {
          paramString3 = this.b.getString(2131296570);
          localap2.d(str3 + ": " + paramString3);
          int i2 = i5;
          label742: Bitmap localBitmap1;
          int i3;
          int i4;
          if (Build.VERSION.SDK_INT >= 11)
          {
            localBitmap1 = o.a(this.b).a(localUri, o.a(), true, true);
            if (localBitmap1 != null)
            {
              if (i2 == 0)
                localbc.a(localBitmap1);
              i3 = this.b.getResources().getDimensionPixelSize(17104901);
              i4 = this.b.getResources().getDimensionPixelSize(17104902);
            }
          }
          try
          {
            localap2.a(Bitmap.createScaledBitmap(localBitmap1, i3, i4, false));
            label833: if (localf.j())
              localap2.a(2130837848, this.b.getResources().getString(2131296509), TNWidget.getDialerIntent(localf, this.b, 1, "InteractiveNotification"));
            Intent localIntent3 = TNWidget.createConversationIntent(null, this.b, TNWidget.MessageType.EXISTING, "InteractiveNotification");
            localIntent3.putExtra("extra_selected_cv", paramString1);
            localIntent3.putExtra("extra_selected_ct", paramInt1);
            localIntent3.putExtra("extra_widget_reply", true);
            localap2.a(2130837874, this.b.getString(2131296672), PendingIntent.getActivity(this.b, 1, localIntent3, 134217728));
            localap2.a(localbc);
            this.h = true;
            label967: if (MessageViewFragment.a.compareTo(paramString1) != 0)
              this.c.a(0, localap2.a());
            KeyguardManager localKeyguardManager = (KeyguardManager)this.b.getSystemService("keyguard");
            if (TextNowApp.c())
              break;
            int m;
            int n;
            int i1;
            Intent localIntent2;
            if ((localKeyguardManager.inKeyguardRestrictedInputMode()) && (localu.A()))
            {
              m = 1;
              if ((localu.y()) || (!localu.z()))
                break label1612;
              n = 1;
              if ((!textnow.v.b.f()) || (!localu.y()))
                break label1618;
              i1 = 1;
              if (m == 0)
                break label1624;
              localIntent2 = new Intent(this.b, QuickReplyKeyGuardActivity.class);
            }
            while (localIntent2 != null)
            {
              localIntent2.addFlags(268435456);
              if (TextUtils.isEmpty(paramString1))
                break;
              localIntent2.putExtra("extra_contact", localf);
              localIntent2.putExtra("extra_message", paramString3);
              localIntent2.putExtra("extra_source", paramInt3);
              if ((m == 0) && (n == 0))
                break label1687;
              this.b.startActivity(localIntent2);
              return;
              str1 = paramString1;
              break label139;
              str2 = paramString1;
              break label219;
              if (localh != null)
                break label289;
              a(localap1, localu.t());
              this.e = l;
              break label289;
              i6 = y.b(this.b, 2130772068);
              break label353;
              label1213: str3 = paramString1;
              break label402;
              label1219: str4 = paramString1 + ": " + paramString3;
              break label499;
              label1249: str5 = localUri.toString();
              break label539;
              label1259: if ((((b)localObject).a != null) && (((b)localObject).a.size() == 1))
              {
                ao localao = new ao();
                localao.b(paramString3);
                localao.a(str3);
                localap2.a(localao).b(paramString3);
                i2 = 0;
                break label742;
              }
              localar.a(str3);
              if (k != 0)
                localar.b("...");
              Iterator localIterator2 = ((b)localObject).a.iterator();
              while (localIterator2.hasNext())
                localar.b((String)localIterator2.next());
              localap2.a(localar).b(paramString3);
              i2 = 0;
              break label742;
              label1403: localap2.a(PendingIntent.getActivity(this.b, 1, localIntent1, 134217728));
              if (this.h)
              {
                this.c.a(0);
                this.h = false;
              }
              if (Build.VERSION.SDK_INT >= 11)
                localap2.a(((BitmapDrawable)this.b.getResources().getDrawable(2130837562)).getBitmap());
              localar.a(this.b.getString(2131296532));
              if (k != 0)
                localar.b("...");
              Iterator localIterator1 = this.j.values().iterator();
              while (localIterator1.hasNext())
              {
                b localb2 = (b)localIterator1.next();
                localar.b(localb2.b + ": " + (String)localb2.a.getLast());
              }
              localap2.a(localar).b(paramString3);
              break label967;
              m = 0;
              break label1030;
              label1612: n = 0;
              break label1049;
              label1618: i1 = 0;
              break label1066;
              label1624: if (n != 0)
              {
                localIntent2 = new Intent(this.b, QuickReplyActivityBase.class);
              }
              else
              {
                localIntent2 = null;
                if (i1 != 0)
                {
                  com.enflick.android.TextNow.ads.b.a("Floating_Chat_metrics", "action", "creating Floating Chat on incoming message");
                  localIntent2 = new Intent(this.b, ChatHeadIntentService.class);
                }
              }
            }
            this.b.startService(localIntent2);
            return;
          }
          catch (Throwable localThrowable)
          {
            break label833;
          }
        }
    }
  }

  public final void a(f paramf, long paramLong)
  {
    ap localap = new ap(this.b);
    Object localObject = paramf.a();
    String str = k.a(this.b.getContentResolver(), (String)localObject);
    if (str == null);
    while (true)
    {
      Intent localIntent1 = new Intent(this.b, MainActivity.class);
      localIntent1.putExtra("extra_show_dialer", true);
      localIntent1.putExtra("extra_dialer_contact", paramf);
      localap.a(PendingIntent.getActivity(this.b, 2, localIntent1, 134217728)).a((CharSequence)localObject).c(true).b(this.b.getString(2131296891)).a(2130837620).b(true).a(true).a(paramLong).b(1);
      Intent localIntent2 = new Intent(this.b, MainActivity.class);
      localIntent2.putExtra("extra_dialer_hangup", true);
      PendingIntent localPendingIntent = PendingIntent.getActivity(this.b, 3, localIntent2, 134217728);
      localap.a(2130837626, this.b.getString(2131296892), localPendingIntent);
      this.c.a(1, localap.a());
      return;
      localObject = str;
    }
  }

  public final void b()
  {
    this.c.a();
  }

  public final void b(String paramString)
  {
    u localu = new u(this.b);
    ap localap = new ap(this.b);
    long l = System.currentTimeMillis();
    if (l - this.e > 3000L)
    {
      a(localap, localu.t());
      this.e = l;
    }
    if (localu.w())
      localap = localap.a(a);
    if (Build.VERSION.SDK_INT >= 11);
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeResource(this.b.getResources(), 2130837562);
      if (localBitmap != null)
        localap.a(localBitmap);
      label108: Intent localIntent = new Intent(this.b, WelcomeActivity.class);
      localIntent.putExtra("extra_from_notification", true);
      localIntent.addFlags(1048576);
      localap.a(PendingIntent.getActivity(this.b, 0, localIntent, 134217728)).a(this.b.getString(2131296418)).b(paramString).c(true).a(2130838023).d(paramString);
      this.c.a(0, localap.a());
      return;
    }
    catch (Throwable localThrowable)
    {
      break label108;
    }
  }

  public final void c()
  {
    this.c.a(1);
  }

  public final void d()
  {
    if (com.enflick.android.TextNow.chatheads.g.f())
      com.enflick.android.TextNow.chatheads.g.a(this.b).h();
  }

  // ERROR //
  public final void e()
  {
    // Byte code:
    //   0: getstatic 33	textnow/aa/a:i	Z
    //   3: ifeq +456 -> 459
    //   6: ldc_w 600
    //   9: invokestatic 107	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   12: astore_2
    //   13: iconst_1
    //   14: anewarray 75	java/lang/String
    //   17: astore_3
    //   18: aload_3
    //   19: iconst_0
    //   20: aload_0
    //   21: getfield 58	textnow/aa/a:b	Landroid/content/Context;
    //   24: invokevirtual 92	android/content/Context:getPackageName	()Ljava/lang/String;
    //   27: aastore
    //   28: aload_0
    //   29: getfield 58	textnow/aa/a:b	Landroid/content/Context;
    //   32: invokevirtual 194	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   35: aload_2
    //   36: iconst_1
    //   37: anewarray 75	java/lang/String
    //   40: dup
    //   41: iconst_0
    //   42: ldc_w 602
    //   45: aastore
    //   46: ldc_w 604
    //   49: aload_3
    //   50: aconst_null
    //   51: invokevirtual 610	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   54: astore 4
    //   56: aload 4
    //   58: ifnonnull +8 -> 66
    //   61: iconst_0
    //   62: putstatic 33	textnow/aa/a:i	Z
    //   65: return
    //   66: new 170	textnow/z/u
    //   69: dup
    //   70: aload_0
    //   71: getfield 58	textnow/aa/a:b	Landroid/content/Context;
    //   74: invokespecial 171	textnow/z/u:<init>	(Landroid/content/Context;)V
    //   77: invokevirtual 175	textnow/z/u:l	()Z
    //   80: ifeq +373 -> 453
    //   83: aload_0
    //   84: getfield 58	textnow/aa/a:b	Landroid/content/Context;
    //   87: invokevirtual 194	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   90: getstatic 615	com/enflick/android/TextNow/persistence/contentproviders/g:d	Landroid/net/Uri;
    //   93: iconst_1
    //   94: anewarray 75	java/lang/String
    //   97: dup
    //   98: iconst_0
    //   99: ldc_w 617
    //   102: aastore
    //   103: ldc_w 619
    //   106: aconst_null
    //   107: aconst_null
    //   108: invokevirtual 610	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   111: astore 18
    //   113: aload 18
    //   115: ifnull +338 -> 453
    //   118: aload 18
    //   120: invokeinterface 624 1 0
    //   125: ifeq +322 -> 447
    //   128: aload 18
    //   130: iconst_0
    //   131: invokeinterface 627 2 0
    //   136: istore 20
    //   138: iload 20
    //   140: istore 5
    //   142: aload 18
    //   144: invokeinterface 630 1 0
    //   149: iconst_0
    //   150: istore 6
    //   152: iconst_0
    //   153: istore 7
    //   155: aload 4
    //   157: invokeinterface 633 1 0
    //   162: ifeq +298 -> 460
    //   165: aload 4
    //   167: iconst_0
    //   168: invokeinterface 634 2 0
    //   173: astore 16
    //   175: ldc_w 636
    //   178: aload 16
    //   180: invokevirtual 131	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   183: istore 17
    //   185: iload 17
    //   187: ifeq +27 -> 214
    //   190: iconst_1
    //   191: istore 6
    //   193: goto -38 -> 155
    //   196: astore 19
    //   198: aload 18
    //   200: invokeinterface 630 1 0
    //   205: aload 19
    //   207: athrow
    //   208: astore_1
    //   209: iconst_0
    //   210: putstatic 33	textnow/aa/a:i	Z
    //   213: return
    //   214: ldc_w 638
    //   217: aload 16
    //   219: invokevirtual 131	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   222: ifeq -67 -> 155
    //   225: iconst_1
    //   226: istore 7
    //   228: goto -73 -> 155
    //   231: new 81	java/lang/StringBuilder
    //   234: dup
    //   235: invokespecial 82	java/lang/StringBuilder:<init>	()V
    //   238: ldc_w 640
    //   241: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: iload 5
    //   246: invokevirtual 98	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   249: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   252: pop
    //   253: new 642	android/content/ContentValues
    //   256: dup
    //   257: invokespecial 643	android/content/ContentValues:<init>	()V
    //   260: astore 10
    //   262: aload 10
    //   264: ldc_w 645
    //   267: iload 5
    //   269: invokestatic 649	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   272: invokevirtual 652	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   275: aload_0
    //   276: getfield 58	textnow/aa/a:b	Landroid/content/Context;
    //   279: invokevirtual 194	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   282: aload_2
    //   283: aload 10
    //   285: ldc_w 604
    //   288: aload_3
    //   289: invokevirtual 656	android/content/ContentResolver:update	(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   292: pop
    //   293: iload 7
    //   295: ifne +65 -> 360
    //   298: new 642	android/content/ContentValues
    //   301: dup
    //   302: invokespecial 643	android/content/ContentValues:<init>	()V
    //   305: astore 12
    //   307: aload 12
    //   309: ldc_w 658
    //   312: aload_0
    //   313: getfield 58	textnow/aa/a:b	Landroid/content/Context;
    //   316: invokevirtual 92	android/content/Context:getPackageName	()Ljava/lang/String;
    //   319: invokevirtual 661	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   322: aload 12
    //   324: ldc_w 602
    //   327: ldc_w 638
    //   330: invokevirtual 661	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   333: aload 12
    //   335: ldc_w 645
    //   338: iload 5
    //   340: invokestatic 649	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   343: invokevirtual 652	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   346: aload_0
    //   347: getfield 58	textnow/aa/a:b	Landroid/content/Context;
    //   350: invokevirtual 194	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   353: aload_2
    //   354: aload 12
    //   356: invokevirtual 665	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   359: pop
    //   360: iload 6
    //   362: ifne +65 -> 427
    //   365: new 642	android/content/ContentValues
    //   368: dup
    //   369: invokespecial 643	android/content/ContentValues:<init>	()V
    //   372: astore 14
    //   374: aload 14
    //   376: ldc_w 658
    //   379: aload_0
    //   380: getfield 58	textnow/aa/a:b	Landroid/content/Context;
    //   383: invokevirtual 92	android/content/Context:getPackageName	()Ljava/lang/String;
    //   386: invokevirtual 661	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   389: aload 14
    //   391: ldc_w 602
    //   394: ldc_w 636
    //   397: invokevirtual 661	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   400: aload 14
    //   402: ldc_w 645
    //   405: iload 5
    //   407: invokestatic 649	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   410: invokevirtual 652	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   413: aload_0
    //   414: getfield 58	textnow/aa/a:b	Landroid/content/Context;
    //   417: invokevirtual 194	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   420: aload_2
    //   421: aload 14
    //   423: invokevirtual 665	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   426: pop
    //   427: aload 4
    //   429: invokeinterface 630 1 0
    //   434: return
    //   435: astore 8
    //   437: aload 4
    //   439: invokeinterface 630 1 0
    //   444: aload 8
    //   446: athrow
    //   447: iconst_0
    //   448: istore 5
    //   450: goto -308 -> 142
    //   453: iconst_0
    //   454: istore 5
    //   456: goto -307 -> 149
    //   459: return
    //   460: iload 7
    //   462: ifne -231 -> 231
    //   465: iload 6
    //   467: ifeq -174 -> 293
    //   470: goto -239 -> 231
    //
    // Exception table:
    //   from	to	target	type
    //   118	138	196	finally
    //   6	56	208	java/lang/Exception
    //   61	65	208	java/lang/Exception
    //   66	113	208	java/lang/Exception
    //   142	149	208	java/lang/Exception
    //   198	208	208	java/lang/Exception
    //   427	434	208	java/lang/Exception
    //   437	447	208	java/lang/Exception
    //   155	185	435	finally
    //   214	225	435	finally
    //   231	293	435	finally
    //   298	360	435	finally
    //   365	427	435	finally
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.aa.a
 * JD-Core Version:    0.6.2
 */