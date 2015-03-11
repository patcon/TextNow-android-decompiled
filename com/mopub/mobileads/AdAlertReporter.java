package com.mopub.mobileads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.view.View;
import com.mopub.common.util.DateAndTime;
import com.mopub.mobileads.util.Base64;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AdAlertReporter
{
  private static final String BODY_SEPARATOR = "\n=================\n";
  private static final String DATE_FORMAT_PATTERN = "M/d/yy hh:mm:ss a z";
  private static final String EMAIL_RECIPIENT = "creative-review@mopub.com";
  private static final String EMAIL_SCHEME = "mailto:";
  private static final int IMAGE_QUALITY = 25;
  private static final String MARKUP_FILENAME = "mp_adalert_markup.html";
  private static final String PARAMETERS_FILENAME = "mp_adalert_parameters.txt";
  private static final String SCREEN_SHOT_FILENAME = "mp_adalert_screenshot.png";
  private final AdConfiguration mAdConfiguration;
  private final Context mContext;
  private final String mDateString;
  private ArrayList<Uri> mEmailAttachments;
  private Intent mEmailIntent;
  private String mParameters;
  private String mResponse;
  private final View mView;

  public AdAlertReporter(Context paramContext, View paramView, AdConfiguration paramAdConfiguration)
  {
    this.mView = paramView;
    this.mContext = paramContext;
    this.mAdConfiguration = paramAdConfiguration;
    this.mEmailAttachments = new ArrayList();
    this.mDateString = new SimpleDateFormat("M/d/yy hh:mm:ss a z").format(DateAndTime.now());
    initEmailIntent();
    Bitmap localBitmap = takeScreenShot();
    String str = convertBitmapInWEBPToBase64EncodedString(localBitmap);
    this.mParameters = formParameters();
    this.mResponse = getResponseString();
    addEmailSubject();
    String[] arrayOfString = new String[3];
    arrayOfString[0] = this.mParameters;
    arrayOfString[1] = this.mResponse;
    arrayOfString[2] = str;
    addEmailBody(arrayOfString);
    addTextAttachment("mp_adalert_parameters.txt", this.mParameters);
    addTextAttachment("mp_adalert_markup.html", this.mResponse);
    addImageAttachment("mp_adalert_screenshot.png", localBitmap);
  }

  private void addEmailBody(String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      localStringBuilder.append(paramArrayOfString[i]);
      if (i != -1 + paramArrayOfString.length)
        localStringBuilder.append("\n=================\n");
    }
    this.mEmailIntent.putExtra("android.intent.extra.TEXT", localStringBuilder.toString());
  }

  private void addEmailSubject()
  {
    this.mEmailIntent.putExtra("android.intent.extra.SUBJECT", "New creative violation report - " + this.mDateString);
  }

  // ERROR //
  private void addImageAttachment(String paramString, Bitmap paramBitmap)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: ifnull +7 -> 10
    //   6: aload_2
    //   7: ifnonnull +4 -> 11
    //   10: return
    //   11: aload_0
    //   12: getfield 52	com/mopub/mobileads/AdAlertReporter:mContext	Landroid/content/Context;
    //   15: aload_1
    //   16: iconst_1
    //   17: invokevirtual 147	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   20: astore 9
    //   22: aload 9
    //   24: astore_3
    //   25: aload_2
    //   26: getstatic 153	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   29: bipush 25
    //   31: aload_3
    //   32: invokevirtual 159	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   35: pop
    //   36: new 161	java/io/File
    //   39: dup
    //   40: new 117	java/lang/StringBuilder
    //   43: dup
    //   44: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   47: aload_0
    //   48: getfield 52	com/mopub/mobileads/AdAlertReporter:mContext	Landroid/content/Context;
    //   51: invokevirtual 165	android/content/Context:getFilesDir	()Ljava/io/File;
    //   54: invokevirtual 168	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   57: getstatic 171	java/io/File:separator	Ljava/lang/String;
    //   60: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: aload_1
    //   64: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokespecial 172	java/io/File:<init>	(Ljava/lang/String;)V
    //   73: invokestatic 178	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
    //   76: astore 11
    //   78: aload_0
    //   79: getfield 59	com/mopub/mobileads/AdAlertReporter:mEmailAttachments	Ljava/util/ArrayList;
    //   82: aload 11
    //   84: invokevirtual 182	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   87: pop
    //   88: aload_3
    //   89: invokestatic 188	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   92: return
    //   93: astore 7
    //   95: new 117	java/lang/StringBuilder
    //   98: dup
    //   99: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   102: ldc 190
    //   104: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: aload_1
    //   108: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 195	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   117: aload_3
    //   118: invokestatic 188	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   121: return
    //   122: astore 4
    //   124: aconst_null
    //   125: astore 5
    //   127: aload 4
    //   129: astore 6
    //   131: aload 5
    //   133: invokestatic 188	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   136: aload 6
    //   138: athrow
    //   139: astore 8
    //   141: aload_3
    //   142: astore 5
    //   144: aload 8
    //   146: astore 6
    //   148: goto -17 -> 131
    //
    // Exception table:
    //   from	to	target	type
    //   11	22	93	java/lang/Exception
    //   25	88	93	java/lang/Exception
    //   11	22	122	finally
    //   25	88	139	finally
    //   95	117	139	finally
  }

  // ERROR //
  private void addTextAttachment(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: ifnull +7 -> 10
    //   6: aload_2
    //   7: ifnonnull +4 -> 11
    //   10: return
    //   11: aload_0
    //   12: getfield 52	com/mopub/mobileads/AdAlertReporter:mContext	Landroid/content/Context;
    //   15: aload_1
    //   16: iconst_1
    //   17: invokevirtual 147	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   20: astore 9
    //   22: aload 9
    //   24: astore_3
    //   25: aload_3
    //   26: aload_2
    //   27: invokevirtual 199	java/lang/String:getBytes	()[B
    //   30: invokevirtual 205	java/io/FileOutputStream:write	([B)V
    //   33: new 161	java/io/File
    //   36: dup
    //   37: new 117	java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   44: aload_0
    //   45: getfield 52	com/mopub/mobileads/AdAlertReporter:mContext	Landroid/content/Context;
    //   48: invokevirtual 165	android/content/Context:getFilesDir	()Ljava/io/File;
    //   51: invokevirtual 168	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   54: getstatic 171	java/io/File:separator	Ljava/lang/String;
    //   57: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: aload_1
    //   61: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: invokespecial 172	java/io/File:<init>	(Ljava/lang/String;)V
    //   70: invokestatic 178	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
    //   73: astore 10
    //   75: aload_0
    //   76: getfield 59	com/mopub/mobileads/AdAlertReporter:mEmailAttachments	Ljava/util/ArrayList;
    //   79: aload 10
    //   81: invokevirtual 182	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   84: pop
    //   85: aload_3
    //   86: invokestatic 188	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   89: return
    //   90: astore 7
    //   92: new 117	java/lang/StringBuilder
    //   95: dup
    //   96: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   99: ldc 190
    //   101: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: aload_1
    //   105: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: invokestatic 195	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   114: aload_3
    //   115: invokestatic 188	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   118: return
    //   119: astore 4
    //   121: aconst_null
    //   122: astore 5
    //   124: aload 4
    //   126: astore 6
    //   128: aload 5
    //   130: invokestatic 188	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   133: aload 6
    //   135: athrow
    //   136: astore 8
    //   138: aload_3
    //   139: astore 5
    //   141: aload 8
    //   143: astore 6
    //   145: goto -17 -> 128
    //
    // Exception table:
    //   from	to	target	type
    //   11	22	90	java/lang/Exception
    //   25	85	90	java/lang/Exception
    //   11	22	119	finally
    //   25	85	136	finally
    //   92	114	136	finally
  }

  private void appendKeyValue(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    paramStringBuilder.append(paramString1);
    paramStringBuilder.append(" : ");
    paramStringBuilder.append(paramString2);
    paramStringBuilder.append("\n");
  }

  private String convertBitmapInWEBPToBase64EncodedString(Bitmap paramBitmap)
  {
    Object localObject = null;
    if (paramBitmap != null);
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 25, localByteArrayOutputStream);
      String str = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
      localObject = str;
      return localObject;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  private String formParameters()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.mAdConfiguration != null)
    {
      appendKeyValue(localStringBuilder, "sdk_version", this.mAdConfiguration.getSdkVersion());
      appendKeyValue(localStringBuilder, "creative_id", this.mAdConfiguration.getDspCreativeId());
      appendKeyValue(localStringBuilder, "platform_version", Integer.toString(this.mAdConfiguration.getPlatformVersion()));
      appendKeyValue(localStringBuilder, "device_model", this.mAdConfiguration.getDeviceModel());
      appendKeyValue(localStringBuilder, "ad_unit_id", this.mAdConfiguration.getAdUnitId());
      appendKeyValue(localStringBuilder, "device_locale", this.mAdConfiguration.getDeviceLocale());
      appendKeyValue(localStringBuilder, "device_id", this.mAdConfiguration.getHashedUdid());
      appendKeyValue(localStringBuilder, "network_type", this.mAdConfiguration.getNetworkType());
      appendKeyValue(localStringBuilder, "platform", this.mAdConfiguration.getPlatform());
      appendKeyValue(localStringBuilder, "timestamp", getFormattedTimeStamp(this.mAdConfiguration.getTimeStamp()));
      appendKeyValue(localStringBuilder, "ad_type", this.mAdConfiguration.getAdType());
      appendKeyValue(localStringBuilder, "ad_size", "{" + this.mAdConfiguration.getWidth() + ", " + this.mAdConfiguration.getHeight() + "}");
    }
    return localStringBuilder.toString();
  }

  private String getFormattedTimeStamp(long paramLong)
  {
    if (paramLong != -1L)
      return new SimpleDateFormat("M/d/yy hh:mm:ss a z").format(new Date(paramLong));
    return null;
  }

  private String getResponseString()
  {
    if (this.mAdConfiguration != null)
      return this.mAdConfiguration.getResponseString();
    return "";
  }

  private void initEmailIntent()
  {
    this.mEmailIntent = new Intent("android.intent.action.SEND_MULTIPLE", Uri.parse("mailto:"));
    this.mEmailIntent.setType("plain/text");
    this.mEmailIntent.putExtra("android.intent.extra.EMAIL", new String[] { "creative-review@mopub.com" });
  }

  private Bitmap takeScreenShot()
  {
    if ((this.mView == null) || (this.mView.getRootView() == null));
    View localView;
    boolean bool;
    Bitmap localBitmap1;
    do
    {
      return null;
      localView = this.mView.getRootView();
      bool = localView.isDrawingCacheEnabled();
      localView.setDrawingCacheEnabled(true);
      localBitmap1 = localView.getDrawingCache();
    }
    while (localBitmap1 == null);
    Bitmap localBitmap2 = Bitmap.createBitmap(localBitmap1);
    localView.setDrawingCacheEnabled(bool);
    return localBitmap2;
  }

  @Deprecated
  ArrayList<Uri> getEmailAttachments()
  {
    return this.mEmailAttachments;
  }

  @Deprecated
  Intent getEmailIntent()
  {
    return this.mEmailIntent;
  }

  @Deprecated
  String getParameters()
  {
    return this.mParameters;
  }

  @Deprecated
  String getResponse()
  {
    return this.mResponse;
  }

  public void send()
  {
    this.mEmailIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.mEmailAttachments);
    Intent localIntent = Intent.createChooser(this.mEmailIntent, "Send Email...");
    localIntent.addFlags(268435456);
    this.mContext.startActivity(localIntent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.AdAlertReporter
 * JD-Core Version:    0.6.2
 */