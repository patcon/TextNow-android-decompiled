package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import textnow.c.a;

public class g extends DataSetObservable
{
  private static final String a = g.class.getSimpleName();
  private static final Object b = new Object();
  private static final Map<String, g> c = new HashMap();
  private final Object d;
  private final List<h> e;
  private final List<j> f;
  private final Context g;
  private final String h;
  private Intent i;
  private i j;
  private int k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private k p;

  private boolean a(j paramj)
  {
    boolean bool = this.f.add(paramj);
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
          l locall = new l(this, (byte)0);
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = this.f;
          arrayOfObject[1] = this.h;
          a.a(locall, arrayOfObject);
        }
      }
      f();
      notifyChanged();
    }
    return bool;
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
        this.e.add(new h(this, localResolveInfo));
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
    //   1: getfield 58	android/support/v7/internal/widget/g:g	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 85	android/support/v7/internal/widget/g:h	Ljava/lang/String;
    //   8: invokevirtual 171	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 177	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore 13
    //   17: aload 13
    //   19: aload_2
    //   20: aconst_null
    //   21: invokeinterface 183 3 0
    //   26: iconst_0
    //   27: istore 14
    //   29: iload 14
    //   31: iconst_1
    //   32: if_icmpeq +21 -> 53
    //   35: iload 14
    //   37: iconst_2
    //   38: if_icmpeq +15 -> 53
    //   41: aload 13
    //   43: invokeinterface 186 1 0
    //   48: istore 14
    //   50: goto -21 -> 29
    //   53: ldc 188
    //   55: aload 13
    //   57: invokeinterface 191 1 0
    //   62: invokevirtual 196	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   65: ifne +51 -> 116
    //   68: new 165	org/xmlpull/v1/XmlPullParserException
    //   71: dup
    //   72: ldc 198
    //   74: invokespecial 199	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   77: athrow
    //   78: astore 9
    //   80: getstatic 43	android/support/v7/internal/widget/g:a	Ljava/lang/String;
    //   83: pop
    //   84: new 201	java/lang/StringBuilder
    //   87: dup
    //   88: invokespecial 202	java/lang/StringBuilder:<init>	()V
    //   91: ldc 204
    //   93: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: aload_0
    //   97: getfield 85	android/support/v7/internal/widget/g:h	Ljava/lang/String;
    //   100: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 211	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: pop
    //   107: aload_2
    //   108: ifnull +7 -> 115
    //   111: aload_2
    //   112: invokevirtual 216	java/io/FileInputStream:close	()V
    //   115: return
    //   116: aload_0
    //   117: getfield 64	android/support/v7/internal/widget/g:f	Ljava/util/List;
    //   120: astore 15
    //   122: aload 15
    //   124: invokeinterface 117 1 0
    //   129: aload 13
    //   131: invokeinterface 186 1 0
    //   136: istore 16
    //   138: iload 16
    //   140: iconst_1
    //   141: if_icmpeq +146 -> 287
    //   144: iload 16
    //   146: iconst_3
    //   147: if_icmpeq -18 -> 129
    //   150: iload 16
    //   152: iconst_4
    //   153: if_icmpeq -24 -> 129
    //   156: ldc 218
    //   158: aload 13
    //   160: invokeinterface 191 1 0
    //   165: invokevirtual 196	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   168: ifne +54 -> 222
    //   171: new 165	org/xmlpull/v1/XmlPullParserException
    //   174: dup
    //   175: ldc 220
    //   177: invokespecial 199	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   180: athrow
    //   181: astore 5
    //   183: getstatic 43	android/support/v7/internal/widget/g:a	Ljava/lang/String;
    //   186: pop
    //   187: new 201	java/lang/StringBuilder
    //   190: dup
    //   191: invokespecial 202	java/lang/StringBuilder:<init>	()V
    //   194: ldc 204
    //   196: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: aload_0
    //   200: getfield 85	android/support/v7/internal/widget/g:h	Ljava/lang/String;
    //   203: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 211	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: pop
    //   210: aload_2
    //   211: ifnull -96 -> 115
    //   214: aload_2
    //   215: invokevirtual 216	java/io/FileInputStream:close	()V
    //   218: return
    //   219: astore 8
    //   221: return
    //   222: aload 15
    //   224: new 222	android/support/v7/internal/widget/j
    //   227: dup
    //   228: aload 13
    //   230: aconst_null
    //   231: ldc 224
    //   233: invokeinterface 228 3 0
    //   238: aload 13
    //   240: aconst_null
    //   241: ldc 230
    //   243: invokeinterface 228 3 0
    //   248: invokestatic 236	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   251: aload 13
    //   253: aconst_null
    //   254: ldc 238
    //   256: invokeinterface 228 3 0
    //   261: invokestatic 244	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   264: invokespecial 247	android/support/v7/internal/widget/j:<init>	(Ljava/lang/String;JF)V
    //   267: invokeinterface 70 2 0
    //   272: pop
    //   273: goto -144 -> 129
    //   276: astore_3
    //   277: aload_2
    //   278: ifnull +7 -> 285
    //   281: aload_2
    //   282: invokevirtual 216	java/io/FileInputStream:close	()V
    //   285: aload_3
    //   286: athrow
    //   287: aload_2
    //   288: ifnull -173 -> 115
    //   291: aload_2
    //   292: invokevirtual 216	java/io/FileInputStream:close	()V
    //   295: return
    //   296: astore 17
    //   298: return
    //   299: astore 12
    //   301: return
    //   302: astore 4
    //   304: goto -19 -> 285
    //   307: astore_1
    //   308: return
    //
    // Exception table:
    //   from	to	target	type
    //   12	26	78	org/xmlpull/v1/XmlPullParserException
    //   41	50	78	org/xmlpull/v1/XmlPullParserException
    //   53	78	78	org/xmlpull/v1/XmlPullParserException
    //   116	129	78	org/xmlpull/v1/XmlPullParserException
    //   129	138	78	org/xmlpull/v1/XmlPullParserException
    //   156	181	78	org/xmlpull/v1/XmlPullParserException
    //   222	273	78	org/xmlpull/v1/XmlPullParserException
    //   12	26	181	java/io/IOException
    //   41	50	181	java/io/IOException
    //   53	78	181	java/io/IOException
    //   116	129	181	java/io/IOException
    //   129	138	181	java/io/IOException
    //   156	181	181	java/io/IOException
    //   222	273	181	java/io/IOException
    //   214	218	219	java/io/IOException
    //   12	26	276	finally
    //   41	50	276	finally
    //   53	78	276	finally
    //   80	107	276	finally
    //   116	129	276	finally
    //   129	138	276	finally
    //   156	181	276	finally
    //   183	210	276	finally
    //   222	273	276	finally
    //   291	295	296	java/io/IOException
    //   111	115	299	java/io/IOException
    //   281	285	302	java/io/IOException
    //   0	12	307	java/io/FileNotFoundException
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
        if (((h)localList.get(i2)).a == paramResolveInfo)
          return i2;
      return -1;
    }
  }

  public final ResolveInfo a(int paramInt)
  {
    synchronized (this.d)
    {
      e();
      ResolveInfo localResolveInfo = ((h)this.e.get(paramInt)).a;
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
      h localh = (h)this.e.get(paramInt);
      ComponentName localComponentName = new ComponentName(localh.a.activityInfo.packageName, localh.a.activityInfo.name);
      Intent localIntent = new Intent(this.i);
      localIntent.setComponent(localComponentName);
      if (this.p != null)
      {
        new Intent(localIntent);
        if (this.p.a())
          return null;
      }
      a(new j(localComponentName, System.currentTimeMillis(), 1.0F));
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
        ResolveInfo localResolveInfo = ((h)this.e.get(0)).a;
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
      h localh1 = (h)this.e.get(paramInt);
      h localh2 = (h)this.e.get(0);
      if (localh2 != null)
      {
        f1 = 5.0F + (localh2.b - localh1.b);
        a(new j(new ComponentName(localh1.a.activityInfo.packageName, localh1.a.activityInfo.name), System.currentTimeMillis(), f1));
        return;
      }
      float f1 = 1.0F;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.g
 * JD-Core Version:    0.6.2
 */