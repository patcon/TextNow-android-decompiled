package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ep
{
  private final Context mContext;
  private int mState = 0;
  private String so;
  private final float sp;
  private float sq;
  private float sr;
  private float ss;

  public ep(Context paramContext)
  {
    this.mContext = paramContext;
    this.sp = paramContext.getResources().getDisplayMetrics().density;
  }

  public ep(Context paramContext, String paramString)
  {
    this(paramContext);
    this.so = paramString;
  }

  private void a(int paramInt, float paramFloat1, float paramFloat2)
  {
    if (paramInt == 0)
    {
      this.mState = 0;
      this.sq = paramFloat1;
      this.sr = paramFloat2;
      this.ss = paramFloat2;
    }
    label24: label224: 
    do
    {
      do
      {
        break label24;
        do
          return;
        while (this.mState == -1);
        if (paramInt != 2)
          break;
        if (paramFloat2 > this.sr)
          this.sr = paramFloat2;
        while (this.sr - this.ss > 30.0F * this.sp)
        {
          this.mState = -1;
          return;
          if (paramFloat2 < this.ss)
            this.ss = paramFloat2;
        }
        if ((this.mState == 0) || (this.mState == 2))
          if (paramFloat1 - this.sq >= 50.0F * this.sp)
            this.sq = paramFloat1;
        for (this.mState = (1 + this.mState); ; this.mState = (1 + this.mState))
        {
          do
          {
            if ((this.mState != 1) && (this.mState != 3))
              break label224;
            if (paramFloat1 <= this.sq)
              break;
            this.sq = paramFloat1;
            return;
          }
          while (((this.mState != 1) && (this.mState != 3)) || (paramFloat1 - this.sq > -50.0F * this.sp));
          this.sq = paramFloat1;
        }
      }
      while ((this.mState != 2) || (paramFloat1 >= this.sq));
      this.sq = paramFloat1;
      return;
    }
    while ((paramInt != 1) || (this.mState != 4));
    showDialog();
  }

  private void showDialog()
  {
    final String str1;
    if (!TextUtils.isEmpty(this.so))
    {
      Uri localUri = new Uri.Builder().encodedQuery(this.so).build();
      StringBuilder localStringBuilder = new StringBuilder();
      Map localMap = eo.c(localUri);
      Iterator localIterator = localMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        localStringBuilder.append(str2).append(" = ").append((String)localMap.get(str2)).append("\n\n");
      }
      str1 = localStringBuilder.toString().trim();
      if (TextUtils.isEmpty(str1));
    }
    while (true)
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.mContext);
      localBuilder.setMessage(str1);
      localBuilder.setTitle("Ad Information");
      localBuilder.setPositiveButton("Share", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          ep.a(ep.this).startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str1), "Share via"));
        }
      });
      localBuilder.setNegativeButton("Close", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
        }
      });
      localBuilder.create().show();
      return;
      str1 = "No debug information";
      continue;
      str1 = "No debug information";
    }
  }

  public final void c(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getHistorySize();
    for (int j = 0; j < i; j++)
      a(paramMotionEvent.getActionMasked(), paramMotionEvent.getHistoricalX(0, j), paramMotionEvent.getHistoricalY(0, j));
    a(paramMotionEvent.getActionMasked(), paramMotionEvent.getX(), paramMotionEvent.getY());
  }

  public final void x(String paramString)
  {
    this.so = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ep
 * JD-Core Version:    0.6.2
 */