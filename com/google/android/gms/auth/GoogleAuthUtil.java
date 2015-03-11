package com.google.android.gms.auth;

import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.internal.if;
import java.net.URISyntaxException;

public final class GoogleAuthUtil
{
  public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
  public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
  public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
  public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
  private static final ComponentName Dn = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
  private static final ComponentName Do = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
  private static final Intent Dp = new Intent().setPackage("com.google.android.gms").setComponent(Dn);
  private static final Intent Dq = new Intent().setPackage("com.google.android.gms").setComponent(Do);
  public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
  public static final String KEY_ANDROID_PACKAGE_NAME;
  public static final String KEY_CALLER_UID = "callerUid";
  public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";

  @Deprecated
  public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
  public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";

  static
  {
    KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
  }

  private static void D(Context paramContext)
  {
    try
    {
      GooglePlayServicesUtil.D(paramContext);
      return;
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      throw new GooglePlayServicesAvailabilityException(localGooglePlayServicesRepairableException.getConnectionStatusCode(), localGooglePlayServicesRepairableException.getMessage(), localGooglePlayServicesRepairableException.getIntent());
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      throw new GoogleAuthException(localGooglePlayServicesNotAvailableException.getMessage());
    }
  }

  private static String a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramBundle == null)
      paramBundle = new Bundle();
    try
    {
      String str = getToken(paramContext, paramString1, paramString2, paramBundle);
      return str;
    }
    catch (GooglePlayServicesAvailabilityException localGooglePlayServicesAvailabilityException)
    {
      int i = localGooglePlayServicesAvailabilityException.getConnectionStatusCode();
      if (b(paramContext, i))
      {
        GoogleAuthUtil.a locala = new GoogleAuthUtil.a(paramContext.getApplicationContext());
        locala.sendMessageDelayed(locala.obtainMessage(1), 30000L);
      }
      while (true)
      {
        throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        GooglePlayServicesUtil.showErrorNotification(i, paramContext);
      }
    }
    catch (UserRecoverableAuthException localUserRecoverableAuthException)
    {
    }
    throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
  }

  private static boolean aw(String paramString)
  {
    return ("NetworkError".equals(paramString)) || ("ServiceUnavailable".equals(paramString)) || ("Timeout".equals(paramString));
  }

  private static boolean ax(String paramString)
  {
    return ("BadAuthentication".equals(paramString)) || ("CaptchaRequired".equals(paramString)) || ("DeviceManagementRequiredOrSyncDisabled".equals(paramString)) || ("NeedPermission".equals(paramString)) || ("NeedsBrowser".equals(paramString)) || ("UserCancel".equals(paramString)) || ("AppDownloadRequired".equals(paramString)) || (if.DT.ft().equals(paramString)) || (if.DU.ft().equals(paramString)) || (if.DV.ft().equals(paramString)) || (if.DW.ft().equals(paramString)) || (if.DX.ft().equals(paramString)) || (if.DY.ft().equals(paramString));
  }

  private static boolean b(Context paramContext, int paramInt)
  {
    if (paramInt == 1)
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      try
      {
        boolean bool = localPackageManager.getApplicationInfo("com.google.android.gms", 8192).enabled;
        if (bool)
          return true;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
      }
    }
    return false;
  }

  // ERROR //
  public static void clearToken(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 137	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore_2
    //   5: ldc 239
    //   7: invokestatic 244	com/google/android/gms/common/internal/o:aU	(Ljava/lang/String;)V
    //   10: aload_2
    //   11: invokestatic 245	com/google/android/gms/auth/GoogleAuthUtil:D	(Landroid/content/Context;)V
    //   14: new 120	android/os/Bundle
    //   17: dup
    //   18: invokespecial 121	android/os/Bundle:<init>	()V
    //   21: astore_3
    //   22: aload_0
    //   23: invokevirtual 248	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   26: getfield 251	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   29: astore 4
    //   31: aload_3
    //   32: ldc 253
    //   34: aload 4
    //   36: invokevirtual 256	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   39: aload_3
    //   40: getstatic 48	com/google/android/gms/auth/GoogleAuthUtil:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   43: invokevirtual 259	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   46: ifne +12 -> 58
    //   49: aload_3
    //   50: getstatic 48	com/google/android/gms/auth/GoogleAuthUtil:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   53: aload 4
    //   55: invokevirtual 256	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: new 261	com/google/android/gms/common/a
    //   61: dup
    //   62: invokespecial 262	com/google/android/gms/common/a:<init>	()V
    //   65: astore 5
    //   67: aload_2
    //   68: getstatic 78	com/google/android/gms/auth/GoogleAuthUtil:Dp	Landroid/content/Intent;
    //   71: aload 5
    //   73: iconst_1
    //   74: invokevirtual 266	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   77: ifeq +95 -> 172
    //   80: aload 5
    //   82: invokevirtual 270	com/google/android/gms/common/a:fW	()Landroid/os/IBinder;
    //   85: invokestatic 275	com/google/android/gms/internal/r$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/r;
    //   88: aload_1
    //   89: aload_3
    //   90: invokeinterface 280 3 0
    //   95: astore 9
    //   97: aload 9
    //   99: getstatic 283	com/google/android/gms/internal/if:Ev	Ljava/lang/String;
    //   102: invokevirtual 287	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   105: astore 10
    //   107: aload 9
    //   109: ldc_w 289
    //   112: invokevirtual 292	android/os/Bundle:getBoolean	(Ljava/lang/String;)Z
    //   115: ifne +37 -> 152
    //   118: new 110	com/google/android/gms/auth/GoogleAuthException
    //   121: dup
    //   122: aload 10
    //   124: invokespecial 114	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   127: athrow
    //   128: astore 8
    //   130: new 294	java/io/IOException
    //   133: dup
    //   134: ldc_w 296
    //   137: invokespecial 297	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   140: athrow
    //   141: astore 7
    //   143: aload_2
    //   144: aload 5
    //   146: invokevirtual 301	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   149: aload 7
    //   151: athrow
    //   152: aload_2
    //   153: aload 5
    //   155: invokevirtual 301	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   158: return
    //   159: astore 6
    //   161: new 110	com/google/android/gms/auth/GoogleAuthException
    //   164: dup
    //   165: ldc_w 303
    //   168: invokespecial 114	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   171: athrow
    //   172: new 294	java/io/IOException
    //   175: dup
    //   176: ldc_w 305
    //   179: invokespecial 297	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   182: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   80	128	128	android/os/RemoteException
    //   80	128	141	finally
    //   130	141	141	finally
    //   161	172	141	finally
    //   80	128	159	java/lang/InterruptedException
  }

  // ERROR //
  public static java.util.List<AccountChangeEvent> getAccountChangeEvents(Context paramContext, int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_2
    //   1: ldc_w 309
    //   4: invokestatic 312	com/google/android/gms/common/internal/o:b	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   7: pop
    //   8: ldc 239
    //   10: invokestatic 244	com/google/android/gms/common/internal/o:aU	(Ljava/lang/String;)V
    //   13: aload_0
    //   14: invokevirtual 137	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   17: astore 4
    //   19: aload 4
    //   21: invokestatic 245	com/google/android/gms/auth/GoogleAuthUtil:D	(Landroid/content/Context;)V
    //   24: new 261	com/google/android/gms/common/a
    //   27: dup
    //   28: invokespecial 262	com/google/android/gms/common/a:<init>	()V
    //   31: astore 5
    //   33: aload 4
    //   35: getstatic 78	com/google/android/gms/auth/GoogleAuthUtil:Dp	Landroid/content/Intent;
    //   38: aload 5
    //   40: iconst_1
    //   41: invokevirtual 266	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   44: ifeq +84 -> 128
    //   47: aload 5
    //   49: invokevirtual 270	com/google/android/gms/common/a:fW	()Landroid/os/IBinder;
    //   52: invokestatic 275	com/google/android/gms/internal/r$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/r;
    //   55: new 314	com/google/android/gms/auth/AccountChangeEventsRequest
    //   58: dup
    //   59: invokespecial 315	com/google/android/gms/auth/AccountChangeEventsRequest:<init>	()V
    //   62: aload_2
    //   63: invokevirtual 319	com/google/android/gms/auth/AccountChangeEventsRequest:setAccountName	(Ljava/lang/String;)Lcom/google/android/gms/auth/AccountChangeEventsRequest;
    //   66: iload_1
    //   67: invokevirtual 323	com/google/android/gms/auth/AccountChangeEventsRequest:setEventIndex	(I)Lcom/google/android/gms/auth/AccountChangeEventsRequest;
    //   70: invokeinterface 326 2 0
    //   75: invokevirtual 332	com/google/android/gms/auth/AccountChangeEventsResponse:getEvents	()Ljava/util/List;
    //   78: astore 9
    //   80: aload 4
    //   82: aload 5
    //   84: invokevirtual 301	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   87: aload 9
    //   89: areturn
    //   90: astore 8
    //   92: new 294	java/io/IOException
    //   95: dup
    //   96: ldc_w 296
    //   99: invokespecial 297	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   102: athrow
    //   103: astore 7
    //   105: aload 4
    //   107: aload 5
    //   109: invokevirtual 301	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   112: aload 7
    //   114: athrow
    //   115: astore 6
    //   117: new 110	com/google/android/gms/auth/GoogleAuthException
    //   120: dup
    //   121: ldc_w 303
    //   124: invokespecial 114	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   127: athrow
    //   128: new 294	java/io/IOException
    //   131: dup
    //   132: ldc_w 305
    //   135: invokespecial 297	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   138: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   47	80	90	android/os/RemoteException
    //   47	80	103	finally
    //   92	103	103	finally
    //   117	128	103	finally
    //   47	80	115	java/lang/InterruptedException
  }

  public static String getAccountId(Context paramContext, String paramString)
  {
    o.b(paramString, "accountName must be provided");
    o.aU("Calling this from your main thread can lead to deadlock");
    D(paramContext.getApplicationContext());
    return getToken(paramContext, paramString, "^^_account_id_^^", new Bundle());
  }

  public static String getAppCert(Context paramContext, String paramString)
  {
    return "spatula";
  }

  public static String getToken(Context paramContext, String paramString1, String paramString2)
  {
    return getToken(paramContext, paramString1, paramString2, new Bundle());
  }

  // ERROR //
  public static String getToken(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 137	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore 4
    //   6: ldc 239
    //   8: invokestatic 244	com/google/android/gms/common/internal/o:aU	(Ljava/lang/String;)V
    //   11: aload 4
    //   13: invokestatic 245	com/google/android/gms/auth/GoogleAuthUtil:D	(Landroid/content/Context;)V
    //   16: aload_3
    //   17: ifnonnull +125 -> 142
    //   20: new 120	android/os/Bundle
    //   23: dup
    //   24: invokespecial 121	android/os/Bundle:<init>	()V
    //   27: astore 5
    //   29: aload_0
    //   30: invokevirtual 248	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   33: getfield 251	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   36: astore 6
    //   38: aload 5
    //   40: ldc 253
    //   42: aload 6
    //   44: invokevirtual 256	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: aload 5
    //   49: getstatic 48	com/google/android/gms/auth/GoogleAuthUtil:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   52: invokevirtual 259	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   55: ifne +13 -> 68
    //   58: aload 5
    //   60: getstatic 48	com/google/android/gms/auth/GoogleAuthUtil:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   63: aload 6
    //   65: invokevirtual 256	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: new 261	com/google/android/gms/common/a
    //   71: dup
    //   72: invokespecial 262	com/google/android/gms/common/a:<init>	()V
    //   75: astore 7
    //   77: aload 4
    //   79: getstatic 78	com/google/android/gms/auth/GoogleAuthUtil:Dp	Landroid/content/Intent;
    //   82: aload 7
    //   84: iconst_1
    //   85: invokevirtual 266	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   88: ifeq +176 -> 264
    //   91: aload 7
    //   93: invokevirtual 270	com/google/android/gms/common/a:fW	()Landroid/os/IBinder;
    //   96: invokestatic 275	com/google/android/gms/internal/r$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/r;
    //   99: aload_1
    //   100: aload_2
    //   101: aload 5
    //   103: invokeinterface 343 4 0
    //   108: astore 11
    //   110: aload 11
    //   112: ldc_w 345
    //   115: invokevirtual 287	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   118: astore 12
    //   120: aload 12
    //   122: invokestatic 351	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   125: istore 13
    //   127: iload 13
    //   129: ifne +26 -> 155
    //   132: aload 4
    //   134: aload 7
    //   136: invokevirtual 301	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   139: aload 12
    //   141: areturn
    //   142: new 120	android/os/Bundle
    //   145: dup
    //   146: aload_3
    //   147: invokespecial 354	android/os/Bundle:<init>	(Landroid/os/Bundle;)V
    //   150: astore 5
    //   152: goto -123 -> 29
    //   155: aload 11
    //   157: ldc_w 356
    //   160: invokevirtual 287	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   163: astore 14
    //   165: aload 11
    //   167: ldc_w 358
    //   170: invokevirtual 362	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   173: checkcast 66	android/content/Intent
    //   176: astore 15
    //   178: aload 14
    //   180: invokestatic 364	com/google/android/gms/auth/GoogleAuthUtil:ax	(Ljava/lang/String;)Z
    //   183: ifeq +40 -> 223
    //   186: new 118	com/google/android/gms/auth/UserRecoverableAuthException
    //   189: dup
    //   190: aload 14
    //   192: aload 15
    //   194: invokespecial 367	com/google/android/gms/auth/UserRecoverableAuthException:<init>	(Ljava/lang/String;Landroid/content/Intent;)V
    //   197: athrow
    //   198: astore 10
    //   200: new 294	java/io/IOException
    //   203: dup
    //   204: ldc_w 296
    //   207: invokespecial 297	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   210: athrow
    //   211: astore 9
    //   213: aload 4
    //   215: aload 7
    //   217: invokevirtual 301	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   220: aload 9
    //   222: athrow
    //   223: aload 14
    //   225: invokestatic 369	com/google/android/gms/auth/GoogleAuthUtil:aw	(Ljava/lang/String;)Z
    //   228: ifeq +26 -> 254
    //   231: new 294	java/io/IOException
    //   234: dup
    //   235: aload 14
    //   237: invokespecial 297	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   240: athrow
    //   241: astore 8
    //   243: new 110	com/google/android/gms/auth/GoogleAuthException
    //   246: dup
    //   247: ldc_w 303
    //   250: invokespecial 114	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   253: athrow
    //   254: new 110	com/google/android/gms/auth/GoogleAuthException
    //   257: dup
    //   258: aload 14
    //   260: invokespecial 114	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   263: athrow
    //   264: new 294	java/io/IOException
    //   267: dup
    //   268: ldc_w 305
    //   271: invokespecial 297	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   274: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   91	127	198	android/os/RemoteException
    //   155	198	198	android/os/RemoteException
    //   223	241	198	android/os/RemoteException
    //   254	264	198	android/os/RemoteException
    //   91	127	211	finally
    //   155	198	211	finally
    //   200	211	211	finally
    //   223	241	211	finally
    //   243	254	211	finally
    //   254	264	211	finally
    //   91	127	241	java/lang/InterruptedException
    //   155	198	241	java/lang/InterruptedException
    //   223	241	241	java/lang/InterruptedException
    //   254	264	241	java/lang/InterruptedException
  }

  public static String getTokenWithNotification(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramBundle == null)
      paramBundle = new Bundle();
    paramBundle.putBoolean("handle_notification", true);
    return a(paramContext, paramString1, paramString2, paramBundle);
  }

  public static String getTokenWithNotification(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, Intent paramIntent)
  {
    h(paramIntent);
    if (paramBundle == null)
      paramBundle = new Bundle();
    paramBundle.putParcelable("callback_intent", paramIntent);
    paramBundle.putBoolean("handle_notification", true);
    return a(paramContext, paramString1, paramString2, paramBundle);
  }

  public static String getTokenWithNotification(Context paramContext, String paramString1, String paramString2, Bundle paramBundle1, String paramString3, Bundle paramBundle2)
  {
    if (TextUtils.isEmpty(paramString3))
      throw new IllegalArgumentException("Authority cannot be empty or null.");
    if (paramBundle1 == null)
      paramBundle1 = new Bundle();
    if (paramBundle2 == null)
      paramBundle2 = new Bundle();
    ContentResolver.validateSyncExtrasBundle(paramBundle2);
    paramBundle1.putString("authority", paramString3);
    paramBundle1.putBundle("sync_extras", paramBundle2);
    paramBundle1.putBoolean("handle_notification", true);
    return a(paramContext, paramString1, paramString2, paramBundle1);
  }

  private static void h(Intent paramIntent)
  {
    if (paramIntent == null)
      throw new IllegalArgumentException("Callback cannot be null.");
    String str = paramIntent.toUri(1);
    try
    {
      Intent.parseUri(str, 1);
      return;
    }
    catch (URISyntaxException localURISyntaxException)
    {
    }
    throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
  }

  @Deprecated
  public static void invalidateToken(Context paramContext, String paramString)
  {
    AccountManager.get(paramContext).invalidateAuthToken("com.google", paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.GoogleAuthUtil
 * JD-Core Version:    0.6.2
 */