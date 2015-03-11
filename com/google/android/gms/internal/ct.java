package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class ct extends db.a
{
  private String lr;
  private Context mContext;
  private String pf;
  private ArrayList<String> pg;

  public ct(String paramString1, ArrayList<String> paramArrayList, Context paramContext, String paramString2)
  {
    this.pf = paramString1;
    this.pg = paramArrayList;
    this.lr = paramString2;
    this.mContext = paramContext;
  }

  private void bj()
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter");
      Class[] arrayOfClass = new Class[4];
      arrayOfClass[0] = Context.class;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      arrayOfClass[3] = Boolean.TYPE;
      Method localMethod = localClass.getDeclaredMethod("reportWithProductId", arrayOfClass);
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = this.mContext;
      arrayOfObject[1] = this.pf;
      arrayOfObject[2] = "";
      arrayOfObject[3] = Boolean.valueOf(true);
      localMethod.invoke(null, arrayOfObject);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      eu.D("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      eu.D("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
      return;
    }
    catch (Exception localException)
    {
      eu.c("Fail to report a conversion.", localException);
    }
  }

  protected final String a(String paramString, HashMap<String, String> paramHashMap)
  {
    String str1 = this.mContext.getPackageName();
    try
    {
      String str12 = this.mContext.getPackageManager().getPackageInfo(str1, 0).versionName;
      str2 = str12;
      l = SystemClock.elapsedRealtime() - eh.bK().bO();
      Iterator localIterator = paramHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str10 = (String)localIterator.next();
        String str11 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { str10 });
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = paramHashMap.get(str10);
        paramString = paramString.replaceAll(str11, String.format("$1%s$2", arrayOfObject5));
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      String str2;
      long l;
      while (true)
      {
        eu.c("Error to retrieve app version", localNameNotFoundException);
        str2 = "";
      }
      String str3 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "sessionid" });
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = eh.rQ;
      String str4 = paramString.replaceAll(str3, String.format("$1%s$2", arrayOfObject1)).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "appid" }), String.format("$1%s$2", new Object[] { str1 }));
      String str5 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "osversion" });
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = String.valueOf(Build.VERSION.SDK_INT);
      String str6 = str4.replaceAll(str5, String.format("$1%s$2", arrayOfObject2));
      String str7 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "sdkversion" });
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.lr;
      String str8 = str6.replaceAll(str7, String.format("$1%s$2", arrayOfObject3)).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "appversion" }), String.format("$1%s$2", new Object[] { str2 }));
      String str9 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "timestamp" });
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = String.valueOf(l);
      return str8.replaceAll(str9, String.format("$1%s$2", arrayOfObject4)).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] { "[^@]+" }), String.format("$1%s$2", new Object[] { "" })).replaceAll("@@", "@");
    }
  }

  public final String getProductId()
  {
    return this.pf;
  }

  protected final int l(int paramInt)
  {
    if (paramInt == 0)
      return 1;
    if (paramInt == 1)
      return 2;
    if (paramInt == 4)
      return 3;
    return 0;
  }

  public final void recordPlayBillingResolution(int paramInt)
  {
    if (paramInt == 0)
      bj();
    HashMap localHashMap = new HashMap();
    localHashMap.put("google_play_status", String.valueOf(paramInt));
    localHashMap.put("sku", this.pf);
    localHashMap.put("status", String.valueOf(l(paramInt)));
    Iterator localIterator = this.pg.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      new es(this.mContext, this.lr, a(str, localHashMap)).start();
    }
  }

  public final void recordResolution(int paramInt)
  {
    if (paramInt == 1)
      bj();
    HashMap localHashMap = new HashMap();
    localHashMap.put("status", String.valueOf(paramInt));
    localHashMap.put("sku", this.pf);
    Iterator localIterator = this.pg.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      new es(this.mContext, this.lr, a(str, localHashMap)).start();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ct
 * JD-Core Version:    0.6.2
 */