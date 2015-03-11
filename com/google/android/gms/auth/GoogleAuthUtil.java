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
import java.net.URISyntaxException;

public final class GoogleAuthUtil
{
  public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
  public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
  public static final String KEY_CALLER_UID = "callerUid";
  public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";

  @Deprecated
  public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
  public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
  private static final ComponentName yU = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
  private static final ComponentName yV = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
  private static final Intent yW = new Intent().setPackage("com.google.android.gms").setComponent(yU);
  private static final Intent yX = new Intent().setPackage("com.google.android.gms").setComponent(yV);

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

  private static boolean ac(String paramString)
  {
    return ("NetworkError".equals(paramString)) || ("ServiceUnavailable".equals(paramString)) || ("Timeout".equals(paramString));
  }

  private static boolean ad(String paramString)
  {
    return ("BadAuthentication".equals(paramString)) || ("CaptchaRequired".equals(paramString)) || ("DeviceManagementRequiredOrSyncDisabled".equals(paramString)) || ("NeedPermission".equals(paramString)) || ("NeedsBrowser".equals(paramString)) || ("UserCancel".equals(paramString)) || ("AppDownloadRequired".equals(paramString));
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
    //   1: invokevirtual 101	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore_2
    //   5: ldc 184
    //   7: invokestatic 189	com/google/android/gms/internal/hm:az	(Ljava/lang/String;)V
    //   10: aload_2
    //   11: invokestatic 192	com/google/android/gms/auth/GoogleAuthUtil:z	(Landroid/content/Context;)V
    //   14: new 81	android/os/Bundle
    //   17: dup
    //   18: invokespecial 82	android/os/Bundle:<init>	()V
    //   21: astore_3
    //   22: aload_0
    //   23: invokevirtual 195	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   26: getfield 198	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   29: astore 4
    //   31: aload_3
    //   32: ldc 200
    //   34: aload 4
    //   36: invokevirtual 203	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   39: aload_3
    //   40: getstatic 40	com/google/android/gms/auth/GoogleAuthUtil:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   43: invokevirtual 206	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   46: ifne +12 -> 58
    //   49: aload_3
    //   50: getstatic 40	com/google/android/gms/auth/GoogleAuthUtil:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   53: aload 4
    //   55: invokevirtual 203	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: new 208	com/google/android/gms/common/a
    //   61: dup
    //   62: invokespecial 209	com/google/android/gms/common/a:<init>	()V
    //   65: astore 5
    //   67: aload_2
    //   68: getstatic 70	com/google/android/gms/auth/GoogleAuthUtil:yW	Landroid/content/Intent;
    //   71: aload 5
    //   73: iconst_1
    //   74: invokevirtual 213	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   77: ifeq +92 -> 169
    //   80: aload 5
    //   82: invokevirtual 217	com/google/android/gms/common/a:ew	()Landroid/os/IBinder;
    //   85: invokestatic 222	com/google/android/gms/internal/r$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/r;
    //   88: aload_1
    //   89: aload_3
    //   90: invokeinterface 227 3 0
    //   95: astore 9
    //   97: aload 9
    //   99: getstatic 232	com/google/android/gms/internal/gd:zL	Ljava/lang/String;
    //   102: invokevirtual 236	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   105: astore 10
    //   107: aload 9
    //   109: ldc 238
    //   111: invokevirtual 241	android/os/Bundle:getBoolean	(Ljava/lang/String;)Z
    //   114: ifne +36 -> 150
    //   117: new 243	com/google/android/gms/auth/GoogleAuthException
    //   120: dup
    //   121: aload 10
    //   123: invokespecial 244	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   126: athrow
    //   127: astore 8
    //   129: new 246	java/io/IOException
    //   132: dup
    //   133: ldc 248
    //   135: invokespecial 249	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   138: athrow
    //   139: astore 7
    //   141: aload_2
    //   142: aload 5
    //   144: invokevirtual 253	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   147: aload 7
    //   149: athrow
    //   150: aload_2
    //   151: aload 5
    //   153: invokevirtual 253	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   156: return
    //   157: astore 6
    //   159: new 243	com/google/android/gms/auth/GoogleAuthException
    //   162: dup
    //   163: ldc 255
    //   165: invokespecial 244	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   168: athrow
    //   169: new 246	java/io/IOException
    //   172: dup
    //   173: ldc_w 257
    //   176: invokespecial 249	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   179: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   80	127	127	android/os/RemoteException
    //   80	127	139	finally
    //   129	139	139	finally
    //   159	169	139	finally
    //   80	127	157	java/lang/InterruptedException
  }

  private static void g(Intent paramIntent)
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

  public static String getToken(Context paramContext, String paramString1, String paramString2)
  {
    return getToken(paramContext, paramString1, paramString2, new Bundle());
  }

  // ERROR //
  public static String getToken(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 101	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore 4
    //   6: ldc 184
    //   8: invokestatic 189	com/google/android/gms/internal/hm:az	(Ljava/lang/String;)V
    //   11: aload 4
    //   13: invokestatic 192	com/google/android/gms/auth/GoogleAuthUtil:z	(Landroid/content/Context;)V
    //   16: aload_3
    //   17: ifnonnull +125 -> 142
    //   20: new 81	android/os/Bundle
    //   23: dup
    //   24: invokespecial 82	android/os/Bundle:<init>	()V
    //   27: astore 5
    //   29: aload_0
    //   30: invokevirtual 195	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   33: getfield 198	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   36: astore 6
    //   38: aload 5
    //   40: ldc 200
    //   42: aload 6
    //   44: invokevirtual 203	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: aload 5
    //   49: getstatic 40	com/google/android/gms/auth/GoogleAuthUtil:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   52: invokevirtual 206	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   55: ifne +13 -> 68
    //   58: aload 5
    //   60: getstatic 40	com/google/android/gms/auth/GoogleAuthUtil:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   63: aload 6
    //   65: invokevirtual 203	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: new 208	com/google/android/gms/common/a
    //   71: dup
    //   72: invokespecial 209	com/google/android/gms/common/a:<init>	()V
    //   75: astore 7
    //   77: aload 4
    //   79: getstatic 70	com/google/android/gms/auth/GoogleAuthUtil:yW	Landroid/content/Intent;
    //   82: aload 7
    //   84: iconst_1
    //   85: invokevirtual 213	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   88: ifeq +174 -> 262
    //   91: aload 7
    //   93: invokevirtual 217	com/google/android/gms/common/a:ew	()Landroid/os/IBinder;
    //   96: invokestatic 222	com/google/android/gms/internal/r$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/r;
    //   99: aload_1
    //   100: aload_2
    //   101: aload 5
    //   103: invokeinterface 280 4 0
    //   108: astore 11
    //   110: aload 11
    //   112: ldc_w 282
    //   115: invokevirtual 236	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   118: astore 12
    //   120: aload 12
    //   122: invokestatic 288	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   125: istore 13
    //   127: iload 13
    //   129: ifne +26 -> 155
    //   132: aload 4
    //   134: aload 7
    //   136: invokevirtual 253	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   139: aload 12
    //   141: areturn
    //   142: new 81	android/os/Bundle
    //   145: dup
    //   146: aload_3
    //   147: invokespecial 291	android/os/Bundle:<init>	(Landroid/os/Bundle;)V
    //   150: astore 5
    //   152: goto -123 -> 29
    //   155: aload 11
    //   157: ldc_w 293
    //   160: invokevirtual 236	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   163: astore 14
    //   165: aload 11
    //   167: ldc_w 295
    //   170: invokevirtual 299	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   173: checkcast 58	android/content/Intent
    //   176: astore 15
    //   178: aload 14
    //   180: invokestatic 301	com/google/android/gms/auth/GoogleAuthUtil:ad	(Ljava/lang/String;)Z
    //   183: ifeq +39 -> 222
    //   186: new 79	com/google/android/gms/auth/UserRecoverableAuthException
    //   189: dup
    //   190: aload 14
    //   192: aload 15
    //   194: invokespecial 304	com/google/android/gms/auth/UserRecoverableAuthException:<init>	(Ljava/lang/String;Landroid/content/Intent;)V
    //   197: athrow
    //   198: astore 10
    //   200: new 246	java/io/IOException
    //   203: dup
    //   204: ldc 248
    //   206: invokespecial 249	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   209: athrow
    //   210: astore 9
    //   212: aload 4
    //   214: aload 7
    //   216: invokevirtual 253	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   219: aload 9
    //   221: athrow
    //   222: aload 14
    //   224: invokestatic 306	com/google/android/gms/auth/GoogleAuthUtil:ac	(Ljava/lang/String;)Z
    //   227: ifeq +25 -> 252
    //   230: new 246	java/io/IOException
    //   233: dup
    //   234: aload 14
    //   236: invokespecial 249	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   239: athrow
    //   240: astore 8
    //   242: new 243	com/google/android/gms/auth/GoogleAuthException
    //   245: dup
    //   246: ldc 255
    //   248: invokespecial 244	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   251: athrow
    //   252: new 243	com/google/android/gms/auth/GoogleAuthException
    //   255: dup
    //   256: aload 14
    //   258: invokespecial 244	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   261: athrow
    //   262: new 246	java/io/IOException
    //   265: dup
    //   266: ldc_w 257
    //   269: invokespecial 249	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   272: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   91	127	198	android/os/RemoteException
    //   155	198	198	android/os/RemoteException
    //   222	240	198	android/os/RemoteException
    //   252	262	198	android/os/RemoteException
    //   91	127	210	finally
    //   155	198	210	finally
    //   200	210	210	finally
    //   222	240	210	finally
    //   242	252	210	finally
    //   252	262	210	finally
    //   91	127	240	java/lang/InterruptedException
    //   155	198	240	java/lang/InterruptedException
    //   222	240	240	java/lang/InterruptedException
    //   252	262	240	java/lang/InterruptedException
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
    g(paramIntent);
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

  @Deprecated
  public static void invalidateToken(Context paramContext, String paramString)
  {
    AccountManager.get(paramContext).invalidateAuthToken("com.google", paramString);
  }

  private static void z(Context paramContext)
  {
    try
    {
      GooglePlayServicesUtil.z(paramContext);
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.GoogleAuthUtil
 * JD-Core Version:    0.6.2
 */