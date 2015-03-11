package textnow.p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import textnow.j.a;
import textnow.j.b;

public final class d
{
  boolean a = false;
  String b = "IabHelper";
  boolean c = false;
  boolean d = false;
  String e = "";
  Context f;
  a g;
  ServiceConnection h;
  int i;
  String j = null;
  g k;

  public d(Context paramContext, String paramString)
  {
    this.f = paramContext.getApplicationContext();
    this.j = paramString;
    b("IAB helper created.");
  }

  private int a(Bundle paramBundle)
  {
    if (paramBundle != null);
    for (Object localObject = paramBundle.get("RESPONSE_CODE"); localObject == null; localObject = null)
    {
      b("Bundle with null response code, assuming OK (known issue)");
      return 0;
    }
    if ((localObject instanceof Integer))
      return ((Integer)localObject).intValue();
    if ((localObject instanceof Long))
      return (int)((Long)localObject).longValue();
    c("Unexpected type for bundle response code.");
    c(localObject.getClass().getName());
    throw new RuntimeException("Unexpected type for bundle response code: " + localObject.getClass().getName());
  }

  private int a(k paramk, List<String> paramList)
  {
    b("Querying SKU details.");
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(paramk.a());
    if (paramList != null)
      localArrayList.addAll(paramList);
    if (localArrayList.size() == 0)
    {
      b("queryPrices: nothing to do because there are no SKUs.");
      return 0;
    }
    Bundle localBundle1 = new Bundle();
    localBundle1.putStringArrayList("ITEM_ID_LIST", localArrayList);
    Bundle localBundle2 = this.g.a(3, this.f.getPackageName(), "inapp", localBundle1);
    if (!localBundle2.containsKey("DETAILS_LIST"))
    {
      int m = a(localBundle2);
      if (m != 0)
      {
        b("getSkuDetails() failed: " + a(m));
        return m;
      }
      c("getSkuDetails() returned a bundle with neither an error nor a detail list.");
      return -1002;
    }
    Iterator localIterator = localBundle2.getStringArrayList("DETAILS_LIST").iterator();
    while (localIterator.hasNext())
    {
      n localn = new n((String)localIterator.next());
      b("Got sku details: " + localn);
      paramk.a.put(localn.a, localn);
    }
    return 0;
  }

  public static String a(int paramInt)
  {
    String[] arrayOfString1 = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
    String[] arrayOfString2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error".split("/");
    if (paramInt <= -1000)
    {
      int m = -1000 - paramInt;
      if ((m >= 0) && (m < arrayOfString2.length))
        return arrayOfString2[m];
      return String.valueOf(paramInt) + ":Unknown IAB Helper Error";
    }
    if ((paramInt < 0) || (paramInt >= arrayOfString1.length))
      return String.valueOf(paramInt) + ":Unknown";
    return arrayOfString1[paramInt];
  }

  private void a(final List<l> paramList, final e parame, final f paramf)
  {
    try
    {
      d("consume");
      new Thread(new Runnable()
      {
        public final void run()
        {
          final ArrayList localArrayList = new ArrayList();
          Iterator localIterator = paramList.iterator();
          while (localIterator.hasNext())
          {
            l locall = (l)localIterator.next();
            d locald;
            String str1;
            String str2;
            try
            {
              locald = d.this;
              locald.a("consume");
              try
              {
                str1 = locall.b();
                str2 = locall.a();
                if ((str1 != null) && (!str1.equals("")))
                  break label203;
                locald.c("Can't consume " + str2 + ". No token.");
                throw new c(-1007, "PurchaseInfo is missing token for sku: " + str2 + " " + locall);
              }
              catch (RemoteException localRemoteException)
              {
                throw new c(-1001, "Remote exception while consuming. PurchaseInfo: " + locall, localRemoteException);
              }
            }
            catch (c localc)
            {
              localArrayList.add(localc.a());
            }
            continue;
            label203: locald.b("Consuming sku: " + str2 + ", token: " + str1);
            int i = locald.g.b(3, locald.f.getPackageName(), str1);
            if (i == 0)
            {
              locald.b("Successfully consumed sku: " + str2);
              localArrayList.add(new j(0, "Successful consume of sku " + locall.a()));
            }
            else
            {
              locald.b("Error consuming consuming sku " + str2 + ". " + d.a(i));
              throw new c(i, "Error consuming sku " + str2);
            }
          }
          d.this.b();
          if (parame != null)
            this.c.post(new Runnable()
            {
              public final void run()
              {
                d.3.this.b.a((l)localArrayList.get(0), (j)localArrayList.get(0));
              }
            });
          if (paramf != null)
            this.c.post(new Runnable()
            {
              public final void run()
              {
                d.3.this.d.a(localArrayList, localArrayList);
              }
            });
        }
      }).start();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      j localj;
      do
      {
        localj = new j(-1009, "Task in progress");
        if (parame != null)
          parame.a((l)paramList.get(0), localj);
      }
      while (paramf == null);
      j[] arrayOfj = new j[paramList.size()];
      Arrays.fill(arrayOfj, localj);
      paramf.a(paramList, Arrays.asList(arrayOfj));
    }
  }

  private void d(String paramString)
  {
    if (this.d)
      throw new IllegalStateException("Can't start async operation (" + paramString + ") because another async operation(" + this.e + ") is in progress.");
    this.e = paramString;
    this.d = true;
    b("Starting async operation: " + paramString);
  }

  private void e(String paramString)
  {
    new StringBuilder().append("In-app billing warning: ").append(paramString).toString();
  }

  public final k a(boolean paramBoolean, List<String> paramList)
  {
    a("queryInventory");
    while (true)
    {
      k localk;
      int i2;
      int i3;
      try
      {
        localk = new k();
        b("Querying owned items...");
        b("Package name: " + this.f.getPackageName());
        m = 0;
        str1 = null;
        b("Calling getPurchases with continuation token: " + str1);
        localBundle = this.g.a(3, this.f.getPackageName(), "inapp", str1);
        n = a(localBundle);
        b("Owned items response: " + String.valueOf(n));
        if (n != 0)
        {
          b("getPurchases() failed: " + a(n));
          if (n == 0)
            continue;
          throw new c(n, "Error refreshing inventory (querying owned items).");
        }
      }
      catch (RemoteException localRemoteException)
      {
        Bundle localBundle;
        throw new c(-1001, "Remote exception while refreshing inventory.", localRemoteException);
        if ((!localBundle.containsKey("INAPP_PURCHASE_ITEM_LIST")) || (!localBundle.containsKey("INAPP_PURCHASE_DATA_LIST")) || (!localBundle.containsKey("INAPP_DATA_SIGNATURE_LIST")))
        {
          c("Bundle returned from getPurchases() doesn't contain required fields.");
          n = -1002;
          continue;
        }
        ArrayList localArrayList1 = localBundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList localArrayList2 = localBundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList localArrayList3 = localBundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        i2 = 0;
        if (i2 < localArrayList2.size())
        {
          String str2 = (String)localArrayList2.get(i2);
          String str3 = (String)localArrayList3.get(i2);
          String str4 = (String)localArrayList1.get(i2);
          if (m.a(this.j, str2, str3))
          {
            b("Sku is owned: " + str4);
            l locall = new l(str2, str3);
            if (TextUtils.isEmpty(locall.b()))
            {
              e("BUG: empty/null token!");
              b("Purchase data: " + str2);
            }
            localk.b.put(locall.a(), locall);
            i3 = m;
            break label626;
          }
          e("Purchase signature verification **FAILED**. Not adding item.");
          b("   Purchase data: " + str2);
          b("   Signature: " + str3);
          i3 = 1;
          break label626;
        }
        String str1 = localBundle.getString("INAPP_CONTINUATION_TOKEN");
        b("Continuation token: " + str1);
        if (!TextUtils.isEmpty(str1))
          continue;
        if (m == 0)
          break label636;
        n = -1003;
        continue;
        if (paramBoolean)
        {
          int i1 = a(localk, paramList);
          if (i1 != 0)
            throw new c(i1, "Error refreshing inventory (querying prices of items).");
        }
      }
      catch (JSONException localJSONException)
      {
        throw new c(-1002, "Error parsing JSON response while refreshing inventory.", localJSONException);
      }
      return localk;
      label626: i2++;
      int m = i3;
      continue;
      label636: int n = 0;
    }
  }

  public final void a()
  {
    b("Disposing.");
    this.c = false;
    if (this.h != null)
    {
      b("Unbinding from service.");
      if (this.f != null)
        this.f.unbindService(this.h);
      this.h = null;
      this.g = null;
      this.k = null;
    }
  }

  // ERROR //
  public final void a(android.app.Activity paramActivity, String paramString1, int paramInt, g paramg, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 397
    //   4: invokevirtual 297	textnow/p/d:a	(Ljava/lang/String;)V
    //   7: aload_0
    //   8: ldc_w 397
    //   11: invokespecial 226	textnow/p/d:d	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: new 97	java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   22: ldc_w 399
    //   25: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload_2
    //   29: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: invokevirtual 56	textnow/p/d:b	(Ljava/lang/String;)V
    //   38: aload_0
    //   39: getfield 138	textnow/p/d:g	Ltextnow/j/a;
    //   42: iconst_3
    //   43: aload_0
    //   44: getfield 51	textnow/p/d:f	Landroid/content/Context;
    //   47: invokevirtual 141	android/content/Context:getPackageName	()Ljava/lang/String;
    //   50: aload_2
    //   51: ldc 143
    //   53: aload 5
    //   55: invokeinterface 402 6 0
    //   60: astore 14
    //   62: aload_0
    //   63: aload 14
    //   65: invokespecial 156	textnow/p/d:a	(Landroid/os/Bundle;)I
    //   68: istore 15
    //   70: iload 15
    //   72: ifeq +60 -> 132
    //   75: aload_0
    //   76: new 97	java/lang/StringBuilder
    //   79: dup
    //   80: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   83: ldc_w 404
    //   86: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: iload 15
    //   91: invokestatic 161	textnow/p/d:a	(I)Ljava/lang/String;
    //   94: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   100: invokevirtual 83	textnow/p/d:c	(Ljava/lang/String;)V
    //   103: new 244	textnow/p/j
    //   106: dup
    //   107: iload 15
    //   109: ldc_w 406
    //   112: invokespecial 249	textnow/p/j:<init>	(ILjava/lang/String;)V
    //   115: astore 16
    //   117: aload 4
    //   119: ifnull +13 -> 132
    //   122: aload 4
    //   124: aload 16
    //   126: aconst_null
    //   127: invokeinterface 411 3 0
    //   132: aload 14
    //   134: ldc_w 413
    //   137: invokevirtual 417	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   140: checkcast 419	android/app/PendingIntent
    //   143: astore 17
    //   145: aload_0
    //   146: new 97	java/lang/StringBuilder
    //   149: dup
    //   150: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   153: ldc_w 421
    //   156: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: aload_2
    //   160: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: ldc_w 423
    //   166: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: sipush 1208
    //   172: invokevirtual 426	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   175: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   178: invokevirtual 56	textnow/p/d:b	(Ljava/lang/String;)V
    //   181: aload_0
    //   182: sipush 1208
    //   185: putfield 428	textnow/p/d:i	I
    //   188: aload_0
    //   189: aload 4
    //   191: putfield 390	textnow/p/d:k	Ltextnow/p/g;
    //   194: aload_1
    //   195: aload 17
    //   197: invokevirtual 432	android/app/PendingIntent:getIntentSender	()Landroid/content/IntentSender;
    //   200: sipush 1208
    //   203: new 434	android/content/Intent
    //   206: dup
    //   207: invokespecial 435	android/content/Intent:<init>	()V
    //   210: iconst_0
    //   211: invokestatic 438	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   214: invokevirtual 73	java/lang/Integer:intValue	()I
    //   217: iconst_0
    //   218: invokestatic 438	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   221: invokevirtual 73	java/lang/Integer:intValue	()I
    //   224: iconst_0
    //   225: invokestatic 438	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   228: invokevirtual 73	java/lang/Integer:intValue	()I
    //   231: invokevirtual 444	android/app/Activity:startIntentSenderForResult	(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    //   234: return
    //   235: astore 6
    //   237: new 244	textnow/p/j
    //   240: dup
    //   241: sipush -1009
    //   244: ldc 246
    //   246: invokespecial 249	textnow/p/j:<init>	(ILjava/lang/String;)V
    //   249: astore 7
    //   251: aload 4
    //   253: ifnull -19 -> 234
    //   256: aload 4
    //   258: aload 7
    //   260: aconst_null
    //   261: invokeinterface 411 3 0
    //   266: return
    //   267: astore 12
    //   269: aload_0
    //   270: new 97	java/lang/StringBuilder
    //   273: dup
    //   274: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   277: ldc_w 446
    //   280: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: aload_2
    //   284: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   287: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   290: invokevirtual 83	textnow/p/d:c	(Ljava/lang/String;)V
    //   293: aload 12
    //   295: invokevirtual 449	android/content/IntentSender$SendIntentException:printStackTrace	()V
    //   298: new 244	textnow/p/j
    //   301: dup
    //   302: sipush -1004
    //   305: ldc_w 451
    //   308: invokespecial 249	textnow/p/j:<init>	(ILjava/lang/String;)V
    //   311: astore 13
    //   313: aload 4
    //   315: ifnull -81 -> 234
    //   318: aload 4
    //   320: aload 13
    //   322: aconst_null
    //   323: invokeinterface 411 3 0
    //   328: return
    //   329: astore 10
    //   331: aload_0
    //   332: new 97	java/lang/StringBuilder
    //   335: dup
    //   336: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   339: ldc_w 453
    //   342: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: aload_2
    //   346: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   352: invokevirtual 83	textnow/p/d:c	(Ljava/lang/String;)V
    //   355: aload 10
    //   357: invokevirtual 454	android/os/RemoteException:printStackTrace	()V
    //   360: new 244	textnow/p/j
    //   363: dup
    //   364: sipush -1001
    //   367: ldc_w 456
    //   370: invokespecial 249	textnow/p/j:<init>	(ILjava/lang/String;)V
    //   373: astore 11
    //   375: aload 4
    //   377: ifnull -143 -> 234
    //   380: aload 4
    //   382: aload 11
    //   384: aconst_null
    //   385: invokeinterface 411 3 0
    //   390: return
    //   391: astore 8
    //   393: aload_0
    //   394: ldc_w 458
    //   397: invokevirtual 83	textnow/p/d:c	(Ljava/lang/String;)V
    //   400: aload 8
    //   402: invokevirtual 459	java/lang/Exception:printStackTrace	()V
    //   405: new 244	textnow/p/j
    //   408: dup
    //   409: sipush -1008
    //   412: ldc_w 461
    //   415: invokespecial 249	textnow/p/j:<init>	(ILjava/lang/String;)V
    //   418: astore 9
    //   420: aload 4
    //   422: ifnull -188 -> 234
    //   425: aload 4
    //   427: aload 9
    //   429: aconst_null
    //   430: invokeinterface 411 3 0
    //   435: return
    //
    // Exception table:
    //   from	to	target	type
    //   7	14	235	java/lang/IllegalStateException
    //   14	70	267	android/content/IntentSender$SendIntentException
    //   75	117	267	android/content/IntentSender$SendIntentException
    //   122	132	267	android/content/IntentSender$SendIntentException
    //   132	234	267	android/content/IntentSender$SendIntentException
    //   14	70	329	android/os/RemoteException
    //   75	117	329	android/os/RemoteException
    //   122	132	329	android/os/RemoteException
    //   132	234	329	android/os/RemoteException
    //   14	70	391	java/lang/Exception
    //   75	117	391	java/lang/Exception
    //   122	132	391	java/lang/Exception
    //   132	234	391	java/lang/Exception
  }

  final void a(String paramString)
  {
    if (!this.c)
    {
      c("Illegal state for operation (" + paramString + "): IAB helper is not set up.");
      throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + paramString);
    }
  }

  public final void a(List<l> paramList, f paramf)
  {
    a("consume");
    a(paramList, null, paramf);
  }

  public final void a(final h paramh)
  {
    if (this.c)
      throw new IllegalStateException("IAB helper is already set up.");
    b("Starting in-app billing setup.");
    this.h = new ServiceConnection()
    {
      public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        d.this.b("Billing service connected.");
        d.this.g = b.a(paramAnonymousIBinder);
        String str = d.this.f.getPackageName();
        try
        {
          d.this.b("Checking for in-app billing 3 support.");
          int i = d.this.g.a(3, str, "inapp");
          if (i != 0)
          {
            if (paramh != null)
              paramh.a(new j(i, "Error checking for billing v3 support."));
          }
          else
          {
            d.this.b("In-app billing version 3 supported for " + str);
            d.this.c = true;
            if (paramh != null)
            {
              paramh.a(new j(0, "Setup successful."));
              return;
            }
          }
        }
        catch (RemoteException localRemoteException)
        {
          if (paramh != null)
            paramh.a(new j(-1001, "RemoteException while setting up in-app billing."));
          localRemoteException.printStackTrace();
        }
      }

      public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        d.this.b("Billing service disconnected.");
        d.this.g = null;
      }
    };
    if ((!this.f.bindService(new Intent("com.android.vending.billing.InAppBillingService.BIND"), this.h, 1)) && (paramh != null))
      paramh.a(new j(-1008, "Setup failed"));
  }

  public final void a(l paraml, e parame)
  {
    a("consume");
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paraml);
    a(localArrayList, parame, null);
  }

  public final void a(boolean paramBoolean)
  {
    this.a = true;
  }

  public final void a(boolean paramBoolean, final List<String> paramList, final i parami)
  {
    a("queryInventory");
    try
    {
      d("refresh inventory");
      new Thread(new Runnable()
      {
        public final void run()
        {
          final j localj = new j(0, "Inventory refresh successful.");
          try
          {
            k localk2 = d.this.a(this.a, paramList);
            localk1 = localk2;
            d.this.b();
            this.c.post(new Runnable()
            {
              public final void run()
              {
                d.2.this.d.a(localj, localk1);
              }
            });
            return;
          }
          catch (c localc)
          {
            while (true)
            {
              localj = localc.a();
              final k localk1 = null;
            }
          }
        }
      }).start();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      j localj;
      do
        localj = new j(-1009, "Task in progress");
      while (parami == null);
      parami.a(localj, null);
    }
  }

  public final boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 != this.i)
      return false;
    a("handleActivityResult");
    b();
    if (paramIntent == null)
    {
      c("Null data in IAB activity result.");
      j localj7 = new j(-1002, "Null data in IAB result");
      if (this.k != null)
        this.k.a(localj7, null);
      return true;
    }
    Bundle localBundle = paramIntent.getExtras();
    Object localObject;
    int m;
    if (localBundle == null)
    {
      localObject = null;
      if (localObject != null)
        break label304;
      c("Intent with no response code, assuming OK (known issue)");
      m = 0;
    }
    String str1;
    String str2;
    while (true)
    {
      str1 = paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
      str2 = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE");
      if ((paramInt2 != -1) || (m != 0))
        break label604;
      b("Successful resultcode from purchase activity.");
      b("Purchase data: " + str1);
      b("Data signature: " + str2);
      b("Extras: " + paramIntent.getExtras());
      if ((str1 != null) && (str2 != null))
        break label401;
      c("BUG: either purchaseData or dataSignature is null.");
      b("Extras: " + paramIntent.getExtras().toString());
      j localj4 = new j(-1008, "IAB returned null purchaseData or dataSignature");
      if (this.k != null)
        this.k.a(localj4, null);
      return true;
      localObject = localBundle.get("RESPONSE_CODE");
      break;
      label304: if ((localObject instanceof Integer))
      {
        m = ((Integer)localObject).intValue();
      }
      else
      {
        if (!(localObject instanceof Long))
          break label347;
        m = (int)((Long)localObject).longValue();
      }
    }
    label347: c("Unexpected type for intent response code.");
    c(localObject.getClass().getName());
    throw new RuntimeException("Unexpected type for intent response code: " + localObject.getClass().getName());
    while (true)
    {
      try
      {
        label401: l locall = new l(str1, str2);
        String str3 = locall.a();
        if (!m.a(this.j, str1, str2))
        {
          c("Purchase signature verification FAILED for sku " + str3);
          j localj6 = new j(-1003, "Signature verification failed for sku " + str3);
          if (this.k == null)
            break;
          this.k.a(localj6, locall);
          break;
        }
        b("Purchase signature successfully verified.");
        if (this.k != null)
          this.k.a(new j(0, "Success"), locall);
        return true;
      }
      catch (JSONException localJSONException)
      {
        c("Failed to parse purchase data.");
        localJSONException.printStackTrace();
        j localj5 = new j(-1002, "Failed to parse purchase data.");
        if (this.k != null)
          this.k.a(localj5, null);
        return true;
      }
      label604: if (paramInt2 == -1)
      {
        b("Result code was OK but in-app billing response was not OK: " + a(m));
        if (this.k != null)
        {
          j localj3 = new j(m, "Problem purchashing item.");
          this.k.a(localj3, null);
        }
      }
      else if (paramInt2 == 0)
      {
        b("Purchase canceled - Response: " + a(m));
        j localj2 = new j(-1005, "User canceled.");
        if (this.k != null)
          this.k.a(localj2, null);
      }
      else
      {
        c("Purchase failed. Result code: " + Integer.toString(paramInt2) + ". Response: " + a(m));
        j localj1 = new j(-1006, "Unknown purchase response.");
        if (this.k != null)
          this.k.a(localj1, null);
      }
    }
    return true;
  }

  final void b()
  {
    b("Ending async operation: " + this.e);
    this.e = "";
    this.d = false;
  }

  final void b(String paramString)
  {
    if (this.a);
  }

  final void c(String paramString)
  {
    new StringBuilder().append("In-app billing error: ").append(paramString).toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.p.d
 * JD-Core Version:    0.6.2
 */