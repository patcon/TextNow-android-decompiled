package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class d extends DataSetObservable
{
  private static final String a = d.class.getSimpleName();
  private static final Object b = new Object();
  private static final Map<String, d> c = new HashMap();
  private final Object d;
  private final List<e> e;
  private final List<g> f;
  private final Context g;
  private final String h;
  private Intent i;
  private f j;
  private int k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private h p;

  private boolean a(g paramg)
  {
    boolean bool = this.f.add(paramg);
    if (bool)
    {
      this.n = true;
      g();
      if (!this.m)
        throw new IllegalStateException("No preceding call to #readHistoricalData");
      if (this.n)
      {
        this.n = false;
        if (!TextUtils.isEmpty(this.h))
        {
          if (Build.VERSION.SDK_INT < 11)
            break label137;
          i locali1 = new i(this, (byte)0);
          Executor localExecutor = AsyncTask.SERIAL_EXECUTOR;
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = new ArrayList(this.f);
          arrayOfObject1[1] = this.h;
          locali1.executeOnExecutor(localExecutor, arrayOfObject1);
        }
      }
    }
    while (true)
    {
      f();
      notifyChanged();
      return bool;
      label137: i locali2 = new i(this, (byte)0);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = new ArrayList(this.f);
      arrayOfObject2[1] = this.h;
      locali2.execute(arrayOfObject2);
    }
  }

  private void e()
  {
    boolean bool = true;
    int i1;
    if ((this.o) && (this.i != null))
    {
      this.o = false;
      this.e.clear();
      List localList = this.g.getPackageManager().queryIntentActivities(this.i, 0);
      int i3 = localList.size();
      for (int i4 = 0; i4 < i3; i4++)
      {
        ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i4);
        this.e.add(new e(this, localResolveInfo));
      }
      i1 = bool;
      if ((!this.l) || (!this.n) || (TextUtils.isEmpty(this.h)))
        break label173;
      this.l = false;
      this.m = bool;
      h();
    }
    while (true)
    {
      int i2 = i1 | bool;
      g();
      if (i2 != 0)
      {
        f();
        notifyChanged();
      }
      return;
      i1 = 0;
      break;
      label173: bool = false;
    }
  }

  private boolean f()
  {
    if ((this.j != null) && (this.i != null) && (!this.e.isEmpty()) && (!this.f.isEmpty()))
    {
      Collections.unmodifiableList(this.f);
      return true;
    }
    return false;
  }

  private void g()
  {
    int i1 = this.f.size() - this.k;
    if (i1 <= 0);
    while (true)
    {
      return;
      this.n = true;
      for (int i2 = 0; i2 < i1; i2++)
        this.f.remove(0);
    }
  }

  // ERROR //
  private void h()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 58	android/support/v7/internal/widget/d:g	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 85	android/support/v7/internal/widget/d:h	Ljava/lang/String;
    //   8: invokevirtual 190	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 196	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore 13
    //   17: aload 13
    //   19: aload_2
    //   20: aconst_null
    //   21: invokeinterface 202 3 0
    //   26: iconst_0
    //   27: istore 14
    //   29: iload 14
    //   31: iconst_1
    //   32: if_icmpeq +21 -> 53
    //   35: iload 14
    //   37: iconst_2
    //   38: if_icmpeq +15 -> 53
    //   41: aload 13
    //   43: invokeinterface 205 1 0
    //   48: istore 14
    //   50: goto -21 -> 29
    //   53: ldc 207
    //   55: aload 13
    //   57: invokeinterface 210 1 0
    //   62: invokevirtual 215	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   65: ifne +51 -> 116
    //   68: new 184	org/xmlpull/v1/XmlPullParserException
    //   71: dup
    //   72: ldc 217
    //   74: invokespecial 218	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   77: athrow
    //   78: astore 9
    //   80: getstatic 43	android/support/v7/internal/widget/d:a	Ljava/lang/String;
    //   83: pop
    //   84: new 220	java/lang/StringBuilder
    //   87: dup
    //   88: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   91: ldc 223
    //   93: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: aload_0
    //   97: getfield 85	android/support/v7/internal/widget/d:h	Ljava/lang/String;
    //   100: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: pop
    //   107: aload_2
    //   108: ifnull +7 -> 115
    //   111: aload_2
    //   112: invokevirtual 235	java/io/FileInputStream:close	()V
    //   115: return
    //   116: aload_0
    //   117: getfield 64	android/support/v7/internal/widget/d:f	Ljava/util/List;
    //   120: astore 15
    //   122: aload 15
    //   124: invokeinterface 136 1 0
    //   129: aload 13
    //   131: invokeinterface 205 1 0
    //   136: istore 16
    //   138: iload 16
    //   140: iconst_1
    //   141: if_icmpeq +147 -> 288
    //   144: iload 16
    //   146: iconst_3
    //   147: if_icmpeq -18 -> 129
    //   150: iload 16
    //   152: iconst_4
    //   153: if_icmpeq -24 -> 129
    //   156: ldc 237
    //   158: aload 13
    //   160: invokeinterface 210 1 0
    //   165: invokevirtual 215	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   168: ifne +54 -> 222
    //   171: new 184	org/xmlpull/v1/XmlPullParserException
    //   174: dup
    //   175: ldc 239
    //   177: invokespecial 218	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   180: athrow
    //   181: astore 5
    //   183: getstatic 43	android/support/v7/internal/widget/d:a	Ljava/lang/String;
    //   186: pop
    //   187: new 220	java/lang/StringBuilder
    //   190: dup
    //   191: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   194: ldc 223
    //   196: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: aload_0
    //   200: getfield 85	android/support/v7/internal/widget/d:h	Ljava/lang/String;
    //   203: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: pop
    //   210: aload_2
    //   211: ifnull -96 -> 115
    //   214: aload_2
    //   215: invokevirtual 235	java/io/FileInputStream:close	()V
    //   218: return
    //   219: astore 8
    //   221: return
    //   222: aload 15
    //   224: new 241	android/support/v7/internal/widget/g
    //   227: dup
    //   228: aload 13
    //   230: aconst_null
    //   231: ldc 243
    //   233: invokeinterface 247 3 0
    //   238: aload 13
    //   240: aconst_null
    //   241: ldc 249
    //   243: invokeinterface 247 3 0
    //   248: invokestatic 255	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   251: aload 13
    //   253: aconst_null
    //   254: ldc_w 257
    //   257: invokeinterface 247 3 0
    //   262: invokestatic 263	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   265: invokespecial 266	android/support/v7/internal/widget/g:<init>	(Ljava/lang/String;JF)V
    //   268: invokeinterface 70 2 0
    //   273: pop
    //   274: goto -145 -> 129
    //   277: astore_3
    //   278: aload_2
    //   279: ifnull +7 -> 286
    //   282: aload_2
    //   283: invokevirtual 235	java/io/FileInputStream:close	()V
    //   286: aload_3
    //   287: athrow
    //   288: aload_2
    //   289: ifnull -174 -> 115
    //   292: aload_2
    //   293: invokevirtual 235	java/io/FileInputStream:close	()V
    //   296: return
    //   297: astore 17
    //   299: return
    //   300: astore 12
    //   302: return
    //   303: astore 4
    //   305: goto -19 -> 286
    //   308: astore_1
    //   309: return
    //
    // Exception table:
    //   from	to	target	type
    //   12	26	78	org/xmlpull/v1/XmlPullParserException
    //   41	50	78	org/xmlpull/v1/XmlPullParserException
    //   53	78	78	org/xmlpull/v1/XmlPullParserException
    //   116	129	78	org/xmlpull/v1/XmlPullParserException
    //   129	138	78	org/xmlpull/v1/XmlPullParserException
    //   156	181	78	org/xmlpull/v1/XmlPullParserException
    //   222	274	78	org/xmlpull/v1/XmlPullParserException
    //   12	26	181	java/io/IOException
    //   41	50	181	java/io/IOException
    //   53	78	181	java/io/IOException
    //   116	129	181	java/io/IOException
    //   129	138	181	java/io/IOException
    //   156	181	181	java/io/IOException
    //   222	274	181	java/io/IOException
    //   214	218	219	java/io/IOException
    //   12	26	277	finally
    //   41	50	277	finally
    //   53	78	277	finally
    //   80	107	277	finally
    //   116	129	277	finally
    //   129	138	277	finally
    //   156	181	277	finally
    //   183	210	277	finally
    //   222	274	277	finally
    //   292	296	297	java/io/IOException
    //   111	115	300	java/io/IOException
    //   282	286	303	java/io/IOException
    //   0	12	308	java/io/FileNotFoundException
  }

  public final int a()
  {
    synchronized (this.d)
    {
      e();
      int i1 = this.e.size();
      return i1;
    }
  }

  public final int a(ResolveInfo paramResolveInfo)
  {
    synchronized (this.d)
    {
      e();
      List localList = this.e;
      int i1 = localList.size();
      for (int i2 = 0; i2 < i1; i2++)
        if (((e)localList.get(i2)).a == paramResolveInfo)
          return i2;
      return -1;
    }
  }

  public final ResolveInfo a(int paramInt)
  {
    synchronized (this.d)
    {
      e();
      ResolveInfo localResolveInfo = ((e)this.e.get(paramInt)).a;
      return localResolveInfo;
    }
  }

  public final Intent b(int paramInt)
  {
    synchronized (this.d)
    {
      if (this.i == null)
        return null;
      e();
      e locale = (e)this.e.get(paramInt);
      ComponentName localComponentName = new ComponentName(locale.a.activityInfo.packageName, locale.a.activityInfo.name);
      Intent localIntent = new Intent(this.i);
      localIntent.setComponent(localComponentName);
      if (this.p != null)
      {
        new Intent(localIntent);
        if (this.p.a())
          return null;
      }
      a(new g(localComponentName, System.currentTimeMillis(), 1.0F));
      return localIntent;
    }
  }

  public final ResolveInfo b()
  {
    synchronized (this.d)
    {
      e();
      if (!this.e.isEmpty())
      {
        ResolveInfo localResolveInfo = ((e)this.e.get(0)).a;
        return localResolveInfo;
      }
      return null;
    }
  }

  public final int c()
  {
    synchronized (this.d)
    {
      e();
      int i1 = this.f.size();
      return i1;
    }
  }

  public final void c(int paramInt)
  {
    synchronized (this.d)
    {
      e();
      e locale1 = (e)this.e.get(paramInt);
      e locale2 = (e)this.e.get(0);
      if (locale2 != null)
      {
        f1 = 5.0F + (locale2.b - locale1.b);
        a(new g(new ComponentName(locale1.a.activityInfo.packageName, locale1.a.activityInfo.name), System.currentTimeMillis(), f1));
        return;
      }
      float f1 = 1.0F;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.d
 * JD-Core Version:    0.6.2
 */