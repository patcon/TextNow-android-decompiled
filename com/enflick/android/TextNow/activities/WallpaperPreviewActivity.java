package com.enflick.android.TextNow.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class WallpaperPreviewActivity extends ah
  implements View.OnClickListener
{
  private Button b;

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165717:
    }
    setResult(-1);
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903202);
    setTitle(2131493254);
    b(true);
    this.b = ((Button)findViewById(2131165717));
    this.b.setOnClickListener(this);
    final ImageView localImageView = (ImageView)findViewById(2131165716);
    View localView = findViewById(2131165369);
    final Uri localUri = getIntent().getData();
    new AsyncTask()
    {
      // ERROR //
      private String a()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 28	com/enflick/android/TextNow/activities/WallpaperPreviewActivity$1:a	Ljava/lang/String;
        //   4: invokestatic 50	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
        //   7: ifne +120 -> 127
        //   10: aload_0
        //   11: getfield 28	com/enflick/android/TextNow/activities/WallpaperPreviewActivity$1:a	Ljava/lang/String;
        //   14: invokevirtual 55	java/lang/String:toLowerCase	()Ljava/lang/String;
        //   17: ldc 57
        //   19: invokevirtual 61	java/lang/String:startsWith	(Ljava/lang/String;)Z
        //   22: ifne +105 -> 127
        //   25: aload_0
        //   26: getfield 28	com/enflick/android/TextNow/activities/WallpaperPreviewActivity$1:a	Ljava/lang/String;
        //   29: aload_0
        //   30: getfield 26	com/enflick/android/TextNow/activities/WallpaperPreviewActivity$1:f	Lcom/enflick/android/TextNow/activities/WallpaperPreviewActivity;
        //   33: invokestatic 66	textnow/q/ad:a	(Landroid/content/Context;)I
        //   36: invokestatic 71	textnow/q/f:a	(Ljava/lang/String;I)Landroid/graphics/Bitmap;
        //   39: astore 14
        //   41: aload_0
        //   42: getfield 28	com/enflick/android/TextNow/activities/WallpaperPreviewActivity$1:a	Ljava/lang/String;
        //   45: aload 14
        //   47: invokestatic 74	textnow/q/f:a	(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
        //   50: astore_1
        //   51: aconst_null
        //   52: astore_2
        //   53: aload_1
        //   54: ifnull +71 -> 125
        //   57: aload_0
        //   58: getfield 32	com/enflick/android/TextNow/activities/WallpaperPreviewActivity$1:c	J
        //   61: lconst_0
        //   62: lcmp
        //   63: iflt +89 -> 152
        //   66: aload_0
        //   67: getfield 32	com/enflick/android/TextNow/activities/WallpaperPreviewActivity$1:c	J
        //   70: invokestatic 77	textnow/q/ad:a	(J)Ljava/lang/String;
        //   73: astore 8
        //   75: aload_0
        //   76: getfield 26	com/enflick/android/TextNow/activities/WallpaperPreviewActivity$1:f	Lcom/enflick/android/TextNow/activities/WallpaperPreviewActivity;
        //   79: aload 8
        //   81: iconst_0
        //   82: invokevirtual 81	com/enflick/android/TextNow/activities/WallpaperPreviewActivity:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
        //   85: astore 9
        //   87: aload 9
        //   89: astore 4
        //   91: aload_1
        //   92: getstatic 87	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
        //   95: bipush 100
        //   97: aload 4
        //   99: invokevirtual 93	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   102: pop
        //   103: aload_0
        //   104: getfield 26	com/enflick/android/TextNow/activities/WallpaperPreviewActivity$1:f	Lcom/enflick/android/TextNow/activities/WallpaperPreviewActivity;
        //   107: aload 8
        //   109: invokevirtual 97	com/enflick/android/TextNow/activities/WallpaperPreviewActivity:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
        //   112: invokevirtual 102	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   115: astore 13
        //   117: aload 13
        //   119: astore_2
        //   120: aload 4
        //   122: invokestatic 107	textnow/q/n:a	(Ljava/io/OutputStream;)V
        //   125: aload_2
        //   126: areturn
        //   127: aload_0
        //   128: getfield 26	com/enflick/android/TextNow/activities/WallpaperPreviewActivity$1:f	Lcom/enflick/android/TextNow/activities/WallpaperPreviewActivity;
        //   131: invokevirtual 111	com/enflick/android/TextNow/activities/WallpaperPreviewActivity:getContentResolver	()Landroid/content/ContentResolver;
        //   134: aload_0
        //   135: getfield 30	com/enflick/android/TextNow/activities/WallpaperPreviewActivity$1:b	Landroid/net/Uri;
        //   138: aload_0
        //   139: getfield 26	com/enflick/android/TextNow/activities/WallpaperPreviewActivity$1:f	Lcom/enflick/android/TextNow/activities/WallpaperPreviewActivity;
        //   142: invokestatic 66	textnow/q/ad:a	(Landroid/content/Context;)I
        //   145: invokestatic 114	textnow/q/f:a	(Landroid/content/ContentResolver;Landroid/net/Uri;I)Landroid/graphics/Bitmap;
        //   148: astore_1
        //   149: goto -98 -> 51
        //   152: ldc 116
        //   154: astore 8
        //   156: goto -81 -> 75
        //   159: astore 7
        //   161: aconst_null
        //   162: astore 4
        //   164: aload 4
        //   166: invokestatic 107	textnow/q/n:a	(Ljava/io/OutputStream;)V
        //   169: aconst_null
        //   170: areturn
        //   171: astore 6
        //   173: aconst_null
        //   174: astore 4
        //   176: aload 4
        //   178: invokestatic 107	textnow/q/n:a	(Ljava/io/OutputStream;)V
        //   181: aconst_null
        //   182: areturn
        //   183: astore_3
        //   184: aconst_null
        //   185: astore 4
        //   187: aload_3
        //   188: astore 5
        //   190: aload 4
        //   192: invokestatic 107	textnow/q/n:a	(Ljava/io/OutputStream;)V
        //   195: aload 5
        //   197: athrow
        //   198: astore 5
        //   200: goto -10 -> 190
        //   203: astore 11
        //   205: goto -29 -> 176
        //   208: astore 10
        //   210: goto -46 -> 164
        //
        // Exception table:
        //   from	to	target	type
        //   57	75	159	java/io/FileNotFoundException
        //   75	87	159	java/io/FileNotFoundException
        //   57	75	171	java/lang/OutOfMemoryError
        //   75	87	171	java/lang/OutOfMemoryError
        //   57	75	183	finally
        //   75	87	183	finally
        //   91	117	198	finally
        //   91	117	203	java/lang/OutOfMemoryError
        //   91	117	208	java/io/FileNotFoundException
      }

      protected final void onPreExecute()
      {
        WallpaperPreviewActivity.this.a(2131493250, false);
      }
    }
    .execute(new Void[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.WallpaperPreviewActivity
 * JD-Core Version:    0.6.2
 */