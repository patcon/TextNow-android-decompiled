package textnow.v;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.tasks.ImportSMSTask;
import com.enflick.android.TextNow.views.AvatarView;

public final class z
{
  public static boolean a = false;
  public static boolean b = false;
  public static boolean c = false;
  public static boolean d = false;
  public static boolean e = bool2;
  private static int f = 24;
  private static DisplayMetrics g;

  static
  {
    boolean bool1 = a.c;
    boolean bool2 = false;
    if (!bool1)
      bool2 = true;
  }

  public static final int a(Context paramContext)
  {
    h(paramContext);
    return g.widthPixels;
  }

  public static final int a(Context paramContext, int paramInt)
  {
    h(paramContext);
    return (int)(0.5F + paramInt * g.density);
  }

  @TargetApi(11)
  public static Dialog a(Context paramContext, int paramInt1, int paramInt2, final String[] paramArrayOfString, final TypedArray paramTypedArray, DialogInterface.OnClickListener paramOnClickListener)
  {
    ArrayAdapter local2 = new ArrayAdapter(paramContext, 2130903195, 2131558948, paramArrayOfString)
    {
      public final View getView(int paramAnonymousInt, View paramAnonymousView, ViewGroup paramAnonymousViewGroup)
      {
        View localView = super.getView(paramAnonymousInt, paramAnonymousView, paramAnonymousViewGroup);
        ImageView localImageView = (ImageView)localView.findViewById(2131558947);
        if (paramTypedArray != null)
          localImageView.setImageResource(paramTypedArray.getResourceId(paramAnonymousInt, 0));
        while (true)
        {
          ((TextView)localView.findViewById(2131558948)).setText(paramArrayOfString[paramAnonymousInt]);
          return localView;
          localImageView.setVisibility(8);
        }
      }
    };
    ContextThemeWrapper localContextThemeWrapper;
    if (Build.VERSION.SDK_INT >= 11)
    {
      if (paramInt1 > 100);
      for (int j = 16973941; ; j = 16973937)
      {
        localContextThemeWrapper = new ContextThemeWrapper(paramContext, j);
        return new AlertDialog.Builder(localContextThemeWrapper).setTitle(2131296768).setAdapter(local2, paramOnClickListener).create();
      }
    }
    if (paramInt1 > 100);
    for (int i = 16973837; ; i = 16973833)
    {
      localContextThemeWrapper = new ContextThemeWrapper(paramContext, i);
      break;
    }
  }

  public static Uri a(Context paramContext, String paramString)
  {
    if (paramString == null)
      return Uri.parse("android.resource://" + paramContext.getPackageName() + "/" + 2131099650);
    if (paramString.length() == 0)
      return null;
    return Uri.parse(paramString);
  }

  public static final String a(long paramLong)
  {
    return "wallpaper_" + Long.toString(paramLong);
  }

  public static void a(final Dialog paramDialog, Activity paramActivity)
  {
    paramDialog.setOnShowListener(new DialogInterface.OnShowListener()
    {
      public final void onShow(DialogInterface paramAnonymousDialogInterface)
      {
        z.a(z.this);
        if (this.b != null)
          this.b.onShow(paramDialog);
      }
    });
    paramDialog.setOnDismissListener(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        z.b(z.this);
        if (this.b != null)
          this.b.onDismiss(paramDialog);
      }
    });
  }

  public static void a(Context paramContext, Uri paramUri)
  {
    if ((paramUri != null) && (paramUri.toString().startsWith("android.resource")))
      paramUri = i(paramContext);
    RingtoneManager.setActualDefaultRingtoneUri(paramContext, 1, paramUri);
  }

  public static void a(Context paramContext, ImageView paramImageView, Bitmap paramBitmap, boolean paramBoolean)
  {
    Drawable localDrawable = paramImageView.getDrawable();
    if ((paramBoolean) && (localDrawable != null))
    {
      Drawable[] arrayOfDrawable = new Drawable[2];
      TransitionDrawable localTransitionDrawable1;
      if ((localDrawable instanceof TransitionDrawable))
      {
        TransitionDrawable localTransitionDrawable2 = (TransitionDrawable)localDrawable;
        arrayOfDrawable[0] = localTransitionDrawable2.getDrawable(-1 + localTransitionDrawable2.getNumberOfLayers());
        arrayOfDrawable[1] = new BitmapDrawable(paramContext.getResources(), paramBitmap);
        localTransitionDrawable1 = new TransitionDrawable(arrayOfDrawable);
        if (!(paramImageView instanceof AvatarView))
          break label119;
        ((AvatarView)paramImageView).a(localTransitionDrawable1);
      }
      while (true)
      {
        localTransitionDrawable1.setCrossFadeEnabled(true);
        localTransitionDrawable1.startTransition(200);
        return;
        arrayOfDrawable[0] = localDrawable;
        break;
        label119: paramImageView.setImageDrawable(localTransitionDrawable1);
      }
    }
    if ((paramImageView instanceof AvatarView))
    {
      ((AvatarView)paramImageView).a(new BitmapDrawable(paramContext.getResources(), paramBitmap));
      return;
    }
    paramImageView.setImageBitmap(paramBitmap);
  }

  public static void a(Intent paramIntent, Uri paramUri1, Context paramContext, Uri paramUri2)
  {
    if (!b.h(paramContext))
    {
      if ((paramUri1 == null) || (paramUri1.toString().startsWith("android.resource")))
        paramUri1 = Settings.System.DEFAULT_NOTIFICATION_URI;
    }
    else
    {
      paramIntent.putExtra("android.intent.extra.ringtone.EXISTING_URI", paramUri1);
      paramIntent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
      if (paramUri2 == null)
        break label104;
      paramIntent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", paramUri2);
    }
    while (true)
    {
      paramIntent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
      paramIntent.putExtra("android.intent.extra.ringtone.TYPE", 1);
      paramIntent.putExtra("android.intent.extra.ringtone.TITLE", paramContext.getString(2131296652));
      return;
      if (paramUri1 != Uri.EMPTY)
        break;
      paramUri1 = null;
      break;
      label104: paramIntent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", j(paramContext));
    }
  }

  public static void a(View paramView, Context paramContext)
  {
    if (paramView == null)
      return;
    final Animation localAnimation1 = AnimationUtils.loadAnimation(paramContext, 2130968582);
    final Animation localAnimation2 = AnimationUtils.loadAnimation(paramContext, 2130968584);
    localAnimation1.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        z.this.startAnimation(localAnimation2);
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
    localAnimation2.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        z.this.startAnimation(localAnimation1);
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
    paramView.startAnimation(localAnimation1);
  }

  public static void a(MainActivity paramMainActivity)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramMainActivity);
    localBuilder.setMessage(2131296638).setCancelable(false).setPositiveButton(2131296423, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        new ImportSMSTask().a(z.this, MainActivity.class);
        z.this.g(true);
        z.this.h(false);
      }
    }).setNegativeButton(2131296424, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    });
    AlertDialog localAlertDialog = localBuilder.create();
    localAlertDialog.setTitle(2131296675);
    localAlertDialog.show();
  }

  public static void a(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(paramObject, "translationX", new float[] { 0.0F, 1.0F });
      localObjectAnimator.setInterpolator(new TimeInterpolator()
      {
        public final float getInterpolation(float paramAnonymousFloat)
        {
          return 10.0F * (FloatMath.sin(3.0F * (3.141593F * (2.0F * paramAnonymousFloat))) * (1.0F - paramAnonymousFloat));
        }
      });
      localObjectAnimator.start();
    }
  }

  public static boolean a()
  {
    return !e;
  }

  private static boolean a(Display paramDisplay, int paramInt)
  {
    int i = paramDisplay.getWidth();
    int j = paramDisplay.getHeight();
    switch (paramInt)
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    do
    {
      do
        return true;
      while (j > i);
      return false;
    }
    while (i > j);
    return false;
  }

  public static final int b(Context paramContext)
  {
    h(paramContext);
    return g.heightPixels;
  }

  public static final int c(Context paramContext)
  {
    h(paramContext);
    switch (g.densityDpi)
    {
    default:
      return 600;
    case 120:
      return 200;
    case 160:
      return 400;
    case 320:
    case 480:
    }
    return 800;
  }

  public static boolean d(Context paramContext)
  {
    if (b);
    do
    {
      return false;
      if (c)
        return true;
    }
    while ((!f(paramContext)) && ((!e(paramContext)) || (((paramContext instanceof MainActivity)) && (paramContext.getResources().getConfiguration().orientation != 2))));
    return true;
  }

  public static boolean e(Context paramContext)
  {
    return paramContext.getResources().getBoolean(2131427336);
  }

  public static boolean f(Context paramContext)
  {
    return paramContext.getResources().getBoolean(2131427337);
  }

  public static int g(Context paramContext)
  {
    int i = paramContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
    int j = 0;
    if (i > 0)
      j = paramContext.getResources().getDimensionPixelSize(i);
    if (j == 0)
      j = a(paramContext, f);
    return j;
  }

  private static void h(Context paramContext)
  {
    if (g == null)
      g = paramContext.getResources().getDisplayMetrics();
  }

  // ERROR //
  private static Uri i(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 442	java/io/File
    //   5: dup
    //   6: getstatic 448	android/os/Environment:DIRECTORY_RINGTONES	Ljava/lang/String;
    //   9: invokestatic 452	android/os/Environment:getExternalStoragePublicDirectory	(Ljava/lang/String;)Ljava/io/File;
    //   12: ldc_w 454
    //   15: invokespecial 457	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   18: astore_2
    //   19: aload_2
    //   20: invokevirtual 460	java/io/File:exists	()Z
    //   23: ifne +308 -> 331
    //   26: aload_0
    //   27: invokevirtual 464	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   30: aload_0
    //   31: invokestatic 301	textnow/v/z:j	(Landroid/content/Context;)Landroid/net/Uri;
    //   34: ldc_w 466
    //   37: invokevirtual 472	android/content/ContentResolver:openAssetFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   40: astore 10
    //   42: aload 10
    //   44: ifnull +287 -> 331
    //   47: aload 10
    //   49: invokevirtual 478	android/content/res/AssetFileDescriptor:createInputStream	()Ljava/io/FileInputStream;
    //   52: astore 11
    //   54: aload 11
    //   56: astore 4
    //   58: new 480	java/io/FileOutputStream
    //   61: dup
    //   62: aload_2
    //   63: invokespecial 483	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   66: astore 6
    //   68: aload 4
    //   70: aload 6
    //   72: invokestatic 488	textnow/v/n:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   75: aload 4
    //   77: invokestatic 491	textnow/v/n:a	(Ljava/io/InputStream;)V
    //   80: aload 6
    //   82: invokestatic 494	textnow/v/n:a	(Ljava/io/OutputStream;)V
    //   85: new 496	android/content/ContentValues
    //   88: dup
    //   89: invokespecial 497	android/content/ContentValues:<init>	()V
    //   92: astore 7
    //   94: aload 7
    //   96: ldc_w 499
    //   99: aload_2
    //   100: invokevirtual 502	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   103: invokevirtual 506	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: aload 7
    //   108: ldc_w 508
    //   111: ldc_w 510
    //   114: invokevirtual 506	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: aload 7
    //   119: ldc_w 512
    //   122: ldc_w 514
    //   125: invokevirtual 506	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload 7
    //   130: ldc_w 516
    //   133: aload_2
    //   134: invokevirtual 519	java/io/File:length	()J
    //   137: invokestatic 523	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   140: invokevirtual 526	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   143: aload 7
    //   145: ldc_w 528
    //   148: ldc_w 529
    //   151: invokestatic 534	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   154: invokevirtual 537	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   157: aload 7
    //   159: ldc_w 539
    //   162: iconst_1
    //   163: invokestatic 544	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   166: invokevirtual 547	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   169: aload 7
    //   171: ldc_w 549
    //   174: iconst_0
    //   175: invokestatic 544	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   178: invokevirtual 547	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   181: aload 7
    //   183: ldc_w 551
    //   186: iconst_0
    //   187: invokestatic 544	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   190: invokevirtual 547	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   193: aload 7
    //   195: ldc_w 553
    //   198: iconst_0
    //   199: invokestatic 544	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   202: invokevirtual 547	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   205: aload_2
    //   206: invokevirtual 502	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   209: invokestatic 558	android/provider/MediaStore$Audio$Media:getContentUriForPath	(Ljava/lang/String;)Landroid/net/Uri;
    //   212: astore 8
    //   214: aload_0
    //   215: invokevirtual 464	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   218: aload 8
    //   220: new 95	java/lang/StringBuilder
    //   223: dup
    //   224: invokespecial 97	java/lang/StringBuilder:<init>	()V
    //   227: ldc_w 560
    //   230: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: aload_2
    //   234: invokevirtual 502	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   237: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: ldc_w 562
    //   243: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   249: aconst_null
    //   250: invokevirtual 566	android/content/ContentResolver:delete	(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //   253: pop
    //   254: aload_0
    //   255: invokevirtual 464	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   258: aload 8
    //   260: aload 7
    //   262: invokevirtual 570	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   265: areturn
    //   266: astore 5
    //   268: aconst_null
    //   269: astore 6
    //   271: aconst_null
    //   272: astore 4
    //   274: aload 4
    //   276: invokestatic 491	textnow/v/n:a	(Ljava/io/InputStream;)V
    //   279: aload 6
    //   281: invokestatic 494	textnow/v/n:a	(Ljava/io/OutputStream;)V
    //   284: aconst_null
    //   285: areturn
    //   286: astore_3
    //   287: aconst_null
    //   288: astore 4
    //   290: aload 4
    //   292: invokestatic 491	textnow/v/n:a	(Ljava/io/InputStream;)V
    //   295: aload_1
    //   296: invokestatic 494	textnow/v/n:a	(Ljava/io/OutputStream;)V
    //   299: aload_3
    //   300: athrow
    //   301: astore_3
    //   302: aconst_null
    //   303: astore_1
    //   304: goto -14 -> 290
    //   307: astore 13
    //   309: aload 6
    //   311: astore_1
    //   312: aload 13
    //   314: astore_3
    //   315: goto -25 -> 290
    //   318: astore 14
    //   320: aconst_null
    //   321: astore 6
    //   323: goto -49 -> 274
    //   326: astore 12
    //   328: goto -54 -> 274
    //   331: aconst_null
    //   332: astore 6
    //   334: aconst_null
    //   335: astore 4
    //   337: goto -262 -> 75
    //
    // Exception table:
    //   from	to	target	type
    //   19	42	266	java/lang/Exception
    //   47	54	266	java/lang/Exception
    //   19	42	286	finally
    //   47	54	286	finally
    //   58	68	301	finally
    //   68	75	307	finally
    //   58	68	318	java/lang/Exception
    //   68	75	326	java/lang/Exception
  }

  private static Uri j(Context paramContext)
  {
    return Uri.parse("android.resource://" + paramContext.getPackageName() + "/" + 2131099650);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.v.z
 * JD-Core Version:    0.6.2
 */