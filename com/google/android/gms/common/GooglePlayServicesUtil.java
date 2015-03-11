package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.v;
import android.support.v4.app.y;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.R.string;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.he;
import com.google.android.gms.internal.ip;
import java.io.UnsupportedEncodingException;

public final class GooglePlayServicesUtil
{
  static final byte[][] CV;
  static final byte[][] CW;
  static final byte[][] CX;
  static final byte[][] CY;
  static final byte[][] CZ;
  static final byte[][] Da;
  static final byte[][] Db;
  static final byte[][] Dc;
  private static final byte[][] Dd;
  private static final byte[][] De = arrayOfByte9;
  public static boolean Df = false;
  public static boolean Dg = false;
  private static int Dh = 0;
  private static final Object Di = new Object();
  public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 5089000;
  public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

  static
  {
    byte[][] arrayOfByte1 = new byte[2][];
    arrayOfByte1[0] = au("");
    arrayOfByte1[1] = au("");
    CV = arrayOfByte1;
    byte[][] arrayOfByte2 = new byte[2][];
    arrayOfByte2[0] = au("");
    arrayOfByte2[1] = au("");
    CW = arrayOfByte2;
    byte[][] arrayOfByte3 = new byte[1][];
    arrayOfByte3[0] = au("");
    CX = arrayOfByte3;
    byte[][] arrayOfByte4 = new byte[2][];
    arrayOfByte4[0] = au("");
    arrayOfByte4[1] = au("");
    CY = arrayOfByte4;
    byte[][] arrayOfByte5 = new byte[2][];
    arrayOfByte5[0] = au("");
    arrayOfByte5[1] = au("");
    CZ = arrayOfByte5;
    byte[][] arrayOfByte6 = new byte[2][];
    arrayOfByte6[0] = au("");
    arrayOfByte6[1] = au("");
    Da = arrayOfByte6;
    byte[][] arrayOfByte7 = new byte[2][];
    arrayOfByte7[0] = au("");
    arrayOfByte7[1] = au("");
    Db = arrayOfByte7;
    byte[][] arrayOfByte8 = new byte[2][];
    arrayOfByte8[0] = au("");
    arrayOfByte8[1] = au("");
    Dc = arrayOfByte8;
    byte[][][] arrayOfByte = new byte[8][][];
    arrayOfByte[0] = CV;
    arrayOfByte[1] = CW;
    arrayOfByte[2] = CX;
    arrayOfByte[3] = CY;
    arrayOfByte[4] = CZ;
    arrayOfByte[5] = Da;
    arrayOfByte[6] = Db;
    arrayOfByte[7] = Dc;
    Dd = a(arrayOfByte);
    byte[][] arrayOfByte9 = new byte[7][];
    arrayOfByte9[0] = CV[0];
    arrayOfByte9[1] = CW[0];
    arrayOfByte9[2] = CY[0];
    arrayOfByte9[3] = CZ[0];
    arrayOfByte9[4] = Da[0];
    arrayOfByte9[5] = Db[0];
    arrayOfByte9[6] = Dc[0];
  }

  private static void A(Context paramContext)
  {
    int i;
    try
    {
      ApplicationInfo localApplicationInfo2 = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      localApplicationInfo1 = localApplicationInfo2;
      Bundle localBundle = localApplicationInfo1.metaData;
      if (localBundle == null)
        break label115;
      i = localBundle.getInt("com.google.android.gms.version");
      if (i == 5089000)
        return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", localNameNotFoundException);
        ApplicationInfo localApplicationInfo1 = null;
      }
    }
    throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 5089000 but found " + i + ".  You must have the" + " following declaration within the <application> element: " + "    <meta-data android:name=\"" + "com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
    label115: throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
  }

  private static String B(Context paramContext)
  {
    String str = paramContext.getApplicationInfo().name;
    PackageManager localPackageManager;
    if (TextUtils.isEmpty(str))
    {
      str = paramContext.getPackageName();
      localPackageManager = paramContext.getApplicationContext().getPackageManager();
    }
    try
    {
      ApplicationInfo localApplicationInfo2 = localPackageManager.getApplicationInfo(paramContext.getPackageName(), 0);
      localApplicationInfo1 = localApplicationInfo2;
      if (localApplicationInfo1 != null)
        str = localPackageManager.getApplicationLabel(localApplicationInfo1).toString();
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        ApplicationInfo localApplicationInfo1 = null;
    }
  }

  public static Intent Z(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 1:
    case 2:
      return he.aD("com.google.android.gms");
    case 3:
      return he.aB("com.google.android.gms");
    case 12:
    }
    return he.fA();
  }

  private static Dialog a(int paramInt1, Activity paramActivity, Fragment paramFragment, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    if (ip.gf())
    {
      TypedValue localTypedValue = new TypedValue();
      paramActivity.getTheme().resolveAttribute(16843529, localTypedValue, true);
      if (!"Theme.Dialog.Alert".equals(paramActivity.getResources().getResourceEntryName(localTypedValue.resourceId)));
    }
    for (AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity, 5); ; localBuilder = null)
    {
      if (localBuilder == null)
        localBuilder = new AlertDialog.Builder(paramActivity);
      localBuilder.setMessage(d(paramActivity, paramInt1));
      if (paramOnCancelListener != null)
        localBuilder.setOnCancelListener(paramOnCancelListener);
      Intent localIntent = c(paramActivity, paramInt1);
      if (paramFragment == null);
      for (gz localgz = new gz(paramActivity, localIntent, paramInt2); ; localgz = new gz(paramFragment, localIntent, paramInt2))
      {
        String str = e(paramActivity, paramInt1);
        if (str != null)
          localBuilder.setPositiveButton(str, localgz);
        switch (paramInt1)
        {
        default:
          new StringBuilder().append("Unexpected error code ").append(paramInt1).toString();
          return localBuilder.create();
        case 0:
        case 4:
        case 6:
        case 1:
        case 3:
        case 2:
        case 9:
        case 7:
        case 8:
        case 10:
        case 5:
        case 11:
        case 12:
        }
      }
      return null;
      return localBuilder.create();
      return localBuilder.setTitle(R.string.common_google_play_services_install_title).create();
      return localBuilder.setTitle(R.string.common_google_play_services_enable_title).create();
      return localBuilder.setTitle(R.string.common_google_play_services_update_title).create();
      return localBuilder.setTitle(R.string.common_google_play_services_unsupported_title).create();
      return localBuilder.setTitle(R.string.common_google_play_services_network_error_title).create();
      return localBuilder.create();
      return localBuilder.create();
      return localBuilder.setTitle(R.string.common_google_play_services_invalid_account_title).create();
      return localBuilder.create();
      return localBuilder.setTitle(R.string.common_google_play_services_unsupported_title).create();
    }
  }

  public static boolean a(PackageManager paramPackageManager, PackageInfo paramPackageInfo)
  {
    boolean bool = false;
    if (paramPackageInfo == null);
    do
    {
      byte[] arrayOfByte2;
      do
      {
        return bool;
        if (!c(paramPackageManager))
          break;
        arrayOfByte2 = a(paramPackageInfo, Dd);
        bool = false;
      }
      while (arrayOfByte2 == null);
      return true;
      byte[] arrayOfByte1 = a(paramPackageInfo, De);
      bool = false;
      if (arrayOfByte1 != null)
        bool = true;
    }
    while (bool);
    a(paramPackageInfo, Dd);
    return bool;
  }

  public static boolean a(Resources paramResources)
  {
    if (paramResources == null);
    while (true)
    {
      return false;
      if ((0xF & paramResources.getConfiguration().screenLayout) > 3);
      for (int i = 1; ((ip.gc()) && (i != 0)) || (b(paramResources)); i = 0)
        return true;
    }
  }

  // ERROR //
  private static byte[] a(PackageInfo paramPackageInfo, byte[][] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc_w 365
    //   3: invokestatic 371	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   6: astore_3
    //   7: aload_0
    //   8: getfield 377	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   11: arraylength
    //   12: iconst_1
    //   13: if_icmpeq +8 -> 21
    //   16: aconst_null
    //   17: areturn
    //   18: astore_2
    //   19: aconst_null
    //   20: areturn
    //   21: aload_0
    //   22: getfield 377	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   25: iconst_0
    //   26: aaload
    //   27: invokevirtual 383	android/content/pm/Signature:toByteArray	()[B
    //   30: astore 4
    //   32: new 385	java/io/ByteArrayInputStream
    //   35: dup
    //   36: aload 4
    //   38: invokespecial 388	java/io/ByteArrayInputStream:<init>	([B)V
    //   41: astore 5
    //   43: aload_3
    //   44: aload 5
    //   46: invokevirtual 392	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   49: checkcast 394	java/security/cert/X509Certificate
    //   52: astore 7
    //   54: aload 7
    //   56: invokevirtual 397	java/security/cert/X509Certificate:checkValidity	()V
    //   59: iconst_0
    //   60: istore 10
    //   62: iload 10
    //   64: aload_1
    //   65: arraylength
    //   66: if_icmpge +40 -> 106
    //   69: aload_1
    //   70: iload 10
    //   72: aaload
    //   73: astore 12
    //   75: aload 12
    //   77: aload 4
    //   79: invokestatic 402	java/util/Arrays:equals	([B[B)Z
    //   82: ifeq +18 -> 100
    //   85: aload 12
    //   87: areturn
    //   88: astore 6
    //   90: aconst_null
    //   91: areturn
    //   92: astore 9
    //   94: aconst_null
    //   95: areturn
    //   96: astore 8
    //   98: aconst_null
    //   99: areturn
    //   100: iinc 10 1
    //   103: goto -41 -> 62
    //   106: ldc 145
    //   108: iconst_2
    //   109: invokestatic 406	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   112: ifeq +29 -> 141
    //   115: new 157	java/lang/StringBuilder
    //   118: dup
    //   119: invokespecial 158	java/lang/StringBuilder:<init>	()V
    //   122: ldc_w 408
    //   125: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: aload 4
    //   130: iconst_0
    //   131: invokestatic 414	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   134: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: invokevirtual 178	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: pop
    //   141: aconst_null
    //   142: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	7	18	java/security/cert/CertificateException
    //   43	54	88	java/security/cert/CertificateException
    //   54	59	92	java/security/cert/CertificateExpiredException
    //   54	59	96	java/security/cert/CertificateNotYetValidException
  }

  private static byte[][] a(byte[][][] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += paramArrayOfByte[j].length;
      j++;
    }
    byte[][] arrayOfByte = new byte[k][];
    int m = paramArrayOfByte.length;
    int n = 0;
    int i1 = 0;
    while (i1 < m)
    {
      byte[][] arrayOfByte1 = paramArrayOfByte[i1];
      int i2 = n;
      int i3 = 0;
      while (i3 < arrayOfByte1.length)
      {
        int i4 = i2 + 1;
        arrayOfByte[i2] = arrayOfByte1[i3];
        i3++;
        i2 = i4;
      }
      i1++;
      n = i2;
    }
    return arrayOfByte;
  }

  private static byte[] au(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("ISO-8859-1");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError(localUnsupportedEncodingException);
    }
  }

  public static boolean b(int paramInt1, Activity paramActivity, Fragment paramFragment, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Dialog localDialog = a(paramInt1, paramActivity, paramFragment, paramInt2, paramOnCancelListener);
    if (localDialog == null)
      return false;
    try
    {
      bool = paramActivity instanceof v;
      if (bool)
      {
        y localy = ((v)paramActivity).getSupportFragmentManager();
        SupportErrorDialogFragment.newInstance(localDialog, paramOnCancelListener).show(localy, "GooglePlayServicesErrorDialog");
      }
      while (true)
      {
        return true;
        if (!ip.gc())
          break;
        FragmentManager localFragmentManager = paramActivity.getFragmentManager();
        ErrorDialogFragment.newInstance(localDialog, paramOnCancelListener).show(localFragmentManager, "GooglePlayServicesErrorDialog");
      }
      throw new RuntimeException("This Activity does not support Fragments.");
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      while (true)
        boolean bool = false;
    }
  }

  public static boolean b(PackageManager paramPackageManager)
  {
    synchronized (Di)
    {
      int i = Dh;
      if (i == -1);
      try
      {
        PackageInfo localPackageInfo = paramPackageManager.getPackageInfo("com.google.android.gms", 64);
        byte[][] arrayOfByte = new byte[1][];
        arrayOfByte[0] = Dd[1];
        if (a(localPackageInfo, arrayOfByte) != null);
        for (Dh = 1; Dh != 0; Dh = 0)
          return true;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        while (true)
          Dh = 0;
      }
    }
    return false;
  }

  public static boolean b(PackageManager paramPackageManager, String paramString)
  {
    try
    {
      PackageInfo localPackageInfo = paramPackageManager.getPackageInfo(paramString, 64);
      return a(paramPackageManager, localPackageInfo);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      if (Log.isLoggable("GooglePlayServicesUtil", 3))
        new StringBuilder().append("Package manager can't find package ").append(paramString).append(", defaulting to false").toString();
    }
    return false;
  }

  private static boolean b(Resources paramResources)
  {
    Configuration localConfiguration = paramResources.getConfiguration();
    boolean bool1 = ip.ge();
    boolean bool2 = false;
    if (bool1)
    {
      int i = 0xF & localConfiguration.screenLayout;
      bool2 = false;
      if (i <= 3)
      {
        int j = localConfiguration.smallestScreenWidthDp;
        bool2 = false;
        if (j >= 600)
          bool2 = true;
      }
    }
    return bool2;
  }

  @Deprecated
  public static Intent c(Context paramContext, int paramInt)
  {
    return Z(paramInt);
  }

  public static boolean c(PackageManager paramPackageManager)
  {
    return (b(paramPackageManager)) || (!ey());
  }

  public static String d(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    case 4:
    case 6:
    case 8:
    case 10:
    case 11:
    default:
      return localResources.getString(R.string.common_google_play_services_unknown_issue);
    case 1:
      if (a(paramContext.getResources()))
        return localResources.getString(R.string.common_google_play_services_install_text_tablet);
      return localResources.getString(R.string.common_google_play_services_install_text_phone);
    case 3:
      return localResources.getString(R.string.common_google_play_services_enable_text);
    case 2:
      return localResources.getString(R.string.common_google_play_services_update_text);
    case 9:
      return localResources.getString(R.string.common_google_play_services_unsupported_text);
    case 7:
      return localResources.getString(R.string.common_google_play_services_network_error_text);
    case 5:
      return localResources.getString(R.string.common_google_play_services_invalid_account_text);
    case 12:
    }
    return localResources.getString(R.string.common_google_play_services_unsupported_date_text);
  }

  public static String e(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    default:
      return localResources.getString(17039370);
    case 1:
      return localResources.getString(R.string.common_google_play_services_install_button);
    case 3:
      return localResources.getString(R.string.common_google_play_services_enable_button);
    case 2:
    }
    return localResources.getString(R.string.common_google_play_services_update_button);
  }

  public static boolean ey()
  {
    if (Df)
      return Dg;
    return "user".equals(Build.TYPE);
  }

  public static String f(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    case 4:
    case 6:
    case 8:
    case 10:
    case 11:
    default:
      return localResources.getString(R.string.common_google_play_services_unknown_issue);
    case 1:
      return localResources.getString(R.string.common_google_play_services_notification_needs_installation_title);
    case 2:
      return localResources.getString(R.string.common_google_play_services_notification_needs_update_title);
    case 3:
      return localResources.getString(R.string.common_google_play_services_needs_enabling_title);
    case 9:
      return localResources.getString(R.string.common_google_play_services_unsupported_text);
    case 7:
      return localResources.getString(R.string.common_google_play_services_network_error_text);
    case 5:
      return localResources.getString(R.string.common_google_play_services_invalid_account_text);
    case 12:
    }
    return localResources.getString(R.string.common_google_play_services_unsupported_date_text);
  }

  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return getErrorDialog(paramInt1, paramActivity, paramInt2, null);
  }

  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return a(paramInt1, paramActivity, null, paramInt2, paramOnCancelListener);
  }

  public static PendingIntent getErrorPendingIntent(int paramInt1, Context paramContext, int paramInt2)
  {
    Intent localIntent = c(paramContext, paramInt1);
    if (localIntent == null)
      return null;
    return PendingIntent.getActivity(paramContext, paramInt2, localIntent, 268435456);
  }

  public static String getErrorString(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return "UNKNOWN_ERROR_CODE";
    case 0:
      return "SUCCESS";
    case 1:
      return "SERVICE_MISSING";
    case 2:
      return "SERVICE_VERSION_UPDATE_REQUIRED";
    case 3:
      return "SERVICE_DISABLED";
    case 4:
      return "SIGN_IN_REQUIRED";
    case 5:
      return "INVALID_ACCOUNT";
    case 6:
      return "RESOLUTION_REQUIRED";
    case 7:
      return "NETWORK_ERROR";
    case 8:
      return "INTERNAL_ERROR";
    case 9:
      return "SERVICE_INVALID";
    case 10:
      return "DEVELOPER_ERROR";
    case 11:
      return "LICENSE_CHECK_FAILED";
    case 12:
    }
    return "DATE_INVALID";
  }

  // ERROR //
  public static String getOpenSourceSoftwareLicenseInfo(Context paramContext)
  {
    // Byte code:
    //   0: new 599	android/net/Uri$Builder
    //   3: dup
    //   4: invokespecial 600	android/net/Uri$Builder:<init>	()V
    //   7: ldc_w 602
    //   10: invokevirtual 606	android/net/Uri$Builder:scheme	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   13: ldc 30
    //   15: invokevirtual 609	android/net/Uri$Builder:authority	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   18: ldc_w 611
    //   21: invokevirtual 614	android/net/Uri$Builder:appendPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   24: ldc_w 616
    //   27: invokevirtual 614	android/net/Uri$Builder:appendPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   30: invokevirtual 620	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   33: astore_1
    //   34: aload_0
    //   35: invokevirtual 624	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   38: aload_1
    //   39: invokevirtual 630	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   42: astore 4
    //   44: new 632	java/util/Scanner
    //   47: dup
    //   48: aload 4
    //   50: invokespecial 635	java/util/Scanner:<init>	(Ljava/io/InputStream;)V
    //   53: ldc_w 637
    //   56: invokevirtual 641	java/util/Scanner:useDelimiter	(Ljava/lang/String;)Ljava/util/Scanner;
    //   59: invokevirtual 644	java/util/Scanner:next	()Ljava/lang/String;
    //   62: astore 7
    //   64: aload 7
    //   66: astore_3
    //   67: aload 4
    //   69: ifnull +43 -> 112
    //   72: aload 4
    //   74: invokevirtual 649	java/io/InputStream:close	()V
    //   77: aload_3
    //   78: areturn
    //   79: astore 6
    //   81: aload 4
    //   83: ifnull +31 -> 114
    //   86: aload 4
    //   88: invokevirtual 649	java/io/InputStream:close	()V
    //   91: goto +23 -> 114
    //   94: astore 5
    //   96: aload 4
    //   98: ifnull +8 -> 106
    //   101: aload 4
    //   103: invokevirtual 649	java/io/InputStream:close	()V
    //   106: aload 5
    //   108: athrow
    //   109: astore_2
    //   110: aconst_null
    //   111: astore_3
    //   112: aload_3
    //   113: areturn
    //   114: aconst_null
    //   115: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   44	64	79	java/util/NoSuchElementException
    //   44	64	94	finally
    //   34	44	109	java/lang/Exception
    //   72	77	109	java/lang/Exception
    //   86	91	109	java/lang/Exception
    //   101	106	109	java/lang/Exception
    //   106	109	109	java/lang/Exception
  }

  public static Context getRemoteContext(Context paramContext)
  {
    try
    {
      Context localContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }

  public static Resources getRemoteResource(Context paramContext)
  {
    try
    {
      Resources localResources = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
      return localResources;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }

  // ERROR //
  public static int isGooglePlayServicesAvailable(Context paramContext)
  {
    // Byte code:
    //   0: bipush 9
    //   2: istore_1
    //   3: aload_0
    //   4: invokevirtual 119	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   7: astore_2
    //   8: aload_0
    //   9: invokevirtual 490	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   12: getstatic 493	com/google/android/gms/R$string:common_google_play_services_unknown_issue	I
    //   15: invokevirtual 496	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   18: pop
    //   19: invokestatic 671	java/lang/System:currentTimeMillis	()J
    //   22: ldc2_w 672
    //   25: lcmp
    //   26: ifge +8 -> 34
    //   29: bipush 12
    //   31: istore_1
    //   32: iload_1
    //   33: ireturn
    //   34: aload_0
    //   35: invokestatic 675	com/google/android/gms/common/GooglePlayServicesUtil:A	(Landroid/content/Context;)V
    //   38: aload_2
    //   39: ldc 30
    //   41: bipush 64
    //   43: invokevirtual 468	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   46: astore 5
    //   48: aload 5
    //   50: getfield 678	android/content/pm/PackageInfo:versionCode	I
    //   53: invokestatic 683	com/google/android/gms/internal/ii:aD	(I)Z
    //   56: ifeq +218 -> 274
    //   59: aload_2
    //   60: aload_0
    //   61: invokevirtual 123	android/content/Context:getPackageName	()Ljava/lang/String;
    //   64: bipush 64
    //   66: invokevirtual 468	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   69: astore 15
    //   71: invokestatic 489	com/google/android/gms/common/GooglePlayServicesUtil:ey	()Z
    //   74: ifne +108 -> 182
    //   77: iconst_2
    //   78: anewarray 39	[B
    //   81: astore 19
    //   83: aload 19
    //   85: iconst_0
    //   86: getstatic 49	com/google/android/gms/common/GooglePlayServicesUtil:CV	[[B
    //   89: iconst_1
    //   90: aaload
    //   91: aastore
    //   92: aload 19
    //   94: iconst_1
    //   95: getstatic 77	com/google/android/gms/common/GooglePlayServicesUtil:Da	[[B
    //   98: iconst_1
    //   99: aaload
    //   100: aastore
    //   101: aload 5
    //   103: aload 19
    //   105: invokestatic 341	com/google/android/gms/common/GooglePlayServicesUtil:a	(Landroid/content/pm/PackageInfo;[[B)[B
    //   108: ifnull -76 -> 32
    //   111: iconst_2
    //   112: anewarray 39	[B
    //   115: astore 20
    //   117: aload 20
    //   119: iconst_0
    //   120: getstatic 49	com/google/android/gms/common/GooglePlayServicesUtil:CV	[[B
    //   123: iconst_1
    //   124: aaload
    //   125: aastore
    //   126: aload 20
    //   128: iconst_1
    //   129: getstatic 77	com/google/android/gms/common/GooglePlayServicesUtil:Da	[[B
    //   132: iconst_1
    //   133: aaload
    //   134: aastore
    //   135: aload 15
    //   137: aload 20
    //   139: invokestatic 341	com/google/android/gms/common/GooglePlayServicesUtil:a	(Landroid/content/pm/PackageInfo;[[B)[B
    //   142: ifnonnull +150 -> 292
    //   145: new 157	java/lang/StringBuilder
    //   148: dup
    //   149: invokespecial 158	java/lang/StringBuilder:<init>	()V
    //   152: ldc_w 685
    //   155: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: aload 15
    //   160: getfield 688	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   163: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: ldc_w 690
    //   169: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: invokevirtual 178	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: pop
    //   176: iload_1
    //   177: ireturn
    //   178: astore 4
    //   180: iconst_1
    //   181: ireturn
    //   182: iconst_2
    //   183: anewarray 39	[B
    //   186: astore 16
    //   188: aload 16
    //   190: iconst_0
    //   191: getstatic 49	com/google/android/gms/common/GooglePlayServicesUtil:CV	[[B
    //   194: iconst_0
    //   195: aaload
    //   196: aastore
    //   197: aload 16
    //   199: iconst_1
    //   200: getstatic 77	com/google/android/gms/common/GooglePlayServicesUtil:Da	[[B
    //   203: iconst_0
    //   204: aaload
    //   205: aastore
    //   206: aload 5
    //   208: aload 16
    //   210: invokestatic 341	com/google/android/gms/common/GooglePlayServicesUtil:a	(Landroid/content/pm/PackageInfo;[[B)[B
    //   213: ifnull -181 -> 32
    //   216: iconst_1
    //   217: anewarray 39	[B
    //   220: astore 17
    //   222: aload 17
    //   224: iconst_0
    //   225: getstatic 77	com/google/android/gms/common/GooglePlayServicesUtil:Da	[[B
    //   228: iconst_0
    //   229: aaload
    //   230: aastore
    //   231: aload 15
    //   233: aload 17
    //   235: invokestatic 341	com/google/android/gms/common/GooglePlayServicesUtil:a	(Landroid/content/pm/PackageInfo;[[B)[B
    //   238: ifnonnull +54 -> 292
    //   241: new 157	java/lang/StringBuilder
    //   244: dup
    //   245: invokespecial 158	java/lang/StringBuilder:<init>	()V
    //   248: ldc_w 685
    //   251: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: aload 15
    //   256: getfield 688	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   259: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: ldc_w 692
    //   265: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: invokevirtual 178	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   271: pop
    //   272: iload_1
    //   273: ireturn
    //   274: aload_0
    //   275: invokestatic 696	com/google/android/gms/internal/ii:F	(Landroid/content/Context;)Z
    //   278: ifeq +61 -> 339
    //   281: aload 5
    //   283: getstatic 49	com/google/android/gms/common/GooglePlayServicesUtil:CV	[[B
    //   286: invokestatic 341	com/google/android/gms/common/GooglePlayServicesUtil:a	(Landroid/content/pm/PackageInfo;[[B)[B
    //   289: ifnull -257 -> 32
    //   292: ldc 32
    //   294: invokestatic 699	com/google/android/gms/internal/ii:aB	(I)I
    //   297: istore 9
    //   299: aload 5
    //   301: getfield 678	android/content/pm/PackageInfo:versionCode	I
    //   304: invokestatic 699	com/google/android/gms/internal/ii:aB	(I)I
    //   307: iload 9
    //   309: if_icmpge +74 -> 383
    //   312: new 157	java/lang/StringBuilder
    //   315: dup
    //   316: invokespecial 158	java/lang/StringBuilder:<init>	()V
    //   319: ldc_w 701
    //   322: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: aload 5
    //   327: getfield 678	android/content/pm/PackageInfo:versionCode	I
    //   330: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   333: invokevirtual 178	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   336: pop
    //   337: iconst_2
    //   338: ireturn
    //   339: aload_2
    //   340: ldc 35
    //   342: bipush 64
    //   344: invokevirtual 468	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   347: astore 7
    //   349: aload 7
    //   351: getstatic 49	com/google/android/gms/common/GooglePlayServicesUtil:CV	[[B
    //   354: invokestatic 341	com/google/android/gms/common/GooglePlayServicesUtil:a	(Landroid/content/pm/PackageInfo;[[B)[B
    //   357: astore 8
    //   359: aload 8
    //   361: ifnull -329 -> 32
    //   364: aload 5
    //   366: iconst_1
    //   367: anewarray 39	[B
    //   370: dup
    //   371: iconst_0
    //   372: aload 8
    //   374: aastore
    //   375: invokestatic 341	com/google/android/gms/common/GooglePlayServicesUtil:a	(Landroid/content/pm/PackageInfo;[[B)[B
    //   378: ifnonnull -86 -> 292
    //   381: iload_1
    //   382: ireturn
    //   383: aload_2
    //   384: ldc 30
    //   386: iconst_0
    //   387: invokevirtual 129	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   390: astore 12
    //   392: aload 12
    //   394: getfield 704	android/content/pm/ApplicationInfo:enabled	Z
    //   397: ifne +23 -> 420
    //   400: iconst_3
    //   401: ireturn
    //   402: astore 10
    //   404: ldc 145
    //   406: ldc_w 706
    //   409: invokestatic 709	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;)I
    //   412: pop
    //   413: aload 10
    //   415: invokevirtual 712	android/content/pm/PackageManager$NameNotFoundException:printStackTrace	()V
    //   418: iconst_1
    //   419: ireturn
    //   420: iconst_0
    //   421: ireturn
    //   422: astore 6
    //   424: iload_1
    //   425: ireturn
    //   426: astore 14
    //   428: iload_1
    //   429: ireturn
    //   430: astore_3
    //   431: goto -412 -> 19
    //
    // Exception table:
    //   from	to	target	type
    //   38	48	178	android/content/pm/PackageManager$NameNotFoundException
    //   383	392	402	android/content/pm/PackageManager$NameNotFoundException
    //   339	349	422	android/content/pm/PackageManager$NameNotFoundException
    //   59	71	426	android/content/pm/PackageManager$NameNotFoundException
    //   8	19	430	java/lang/Throwable
  }

  public static boolean isUserRecoverableError(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
    case 2:
    case 3:
    case 9:
    case 12:
    }
    return true;
  }

  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return showErrorDialogFragment(paramInt1, paramActivity, paramInt2, null);
  }

  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return b(paramInt1, paramActivity, null, paramInt2, paramOnCancelListener);
  }

  public static void showErrorNotification(int paramInt, Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    Notification localNotification = new Notification(17301642, localResources.getString(R.string.common_google_play_services_notification_ticker), System.currentTimeMillis());
    localNotification.flags = (0x10 | localNotification.flags);
    String str1 = f(paramContext, paramInt);
    String str2 = B(paramContext);
    localNotification.setLatestEventInfo(paramContext, str1, localResources.getString(R.string.common_google_play_services_error_notification_requested_by_msg, new Object[] { str2 }), getErrorPendingIntent(paramInt, paramContext, 0));
    ((NotificationManager)paramContext.getSystemService("notification")).notify(39789, localNotification);
  }

  public static void z(Context paramContext)
  {
    int i = isGooglePlayServicesAvailable(paramContext);
    if (i != 0)
    {
      Intent localIntent = c(paramContext, i);
      new StringBuilder().append("GooglePlayServices not available due to error ").append(i).toString();
      if (localIntent == null)
        throw new GooglePlayServicesNotAvailableException(i);
      throw new GooglePlayServicesRepairableException(i, "Google Play Services not available", localIntent);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GooglePlayServicesUtil
 * JD-Core Version:    0.6.2
 */