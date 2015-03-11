package com.enflick.android.TextNow.views;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import com.enflick.android.TextNow.activities.phone.h;
import com.enflick.android.TextNow.activities.phone.n;
import com.enflick.android.TextNow.activities.phone.w;
import com.enflick.android.TextNow.ads.b;
import textnow.z.p;
import textnow.z.s;
import textnow.z.u;

public final class c
{
  private Context a;

  public c(Context paramContext)
  {
    this.a = paramContext;
  }

  private static int a(float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, float paramFloat3)
  {
    float f = paramFloat3 * (0.1F + paramFloat1 * (0.08F / (0.0F - paramFloat2)));
    int i = (int)(paramInt2 + f * paramInt1);
    if (paramInt1 > 0)
      return Math.min(paramInt1, i);
    return Math.max(paramInt1, i);
  }

  public static boolean a(Context paramContext)
  {
    p localp = new p(paramContext);
    u localu = new u(paramContext);
    if (localp.a());
    while (true)
    {
      return true;
      try
      {
        w localw = h.a().F();
        if ((localu.Z()) && ("ACTIVE".equalsIgnoreCase(new s(paramContext).f())) && (localw != null) && (!"cdma".equalsIgnoreCase(localw.a())) && (System.currentTimeMillis() - localp.c() >= 1000 * (3600 * localp.l())) && (localw.l() > 15000L))
        {
          int i = (int)(100.0D * Math.random());
          float f1 = localp.e();
          float f2 = localp.d();
          float f3 = localp.b();
          int j = (int)(100.0F * (f1 * (1.0F - f3 / 5.0F)));
          if (j < (int)(100.0F * f2))
            j = (int)(100.0F * f2);
          if (i <= j);
        }
        else
        {
          return false;
        }
      }
      catch (n localn)
      {
        localn.printStackTrace();
      }
    }
    return false;
  }

  public final void a()
  {
    if (((this.a instanceof Activity)) && (((Activity)this.a).isFinishing()))
      return;
    final p localp = new p(this.a);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
    LinearLayout localLinearLayout = (LinearLayout)((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(2130903084, null);
    final RatingBar localRatingBar = (RatingBar)localLinearLayout.findViewById(2131558581);
    localRatingBar.setMax(5);
    localRatingBar.setRating(4.0F);
    localRatingBar.setStepSize(0.5F);
    localBuilder.setView(localLinearLayout);
    localBuilder.setTitle(this.a.getResources().getString(2131296984));
    localBuilder.setCancelable(false);
    localBuilder.setPositiveButton(this.a.getResources().getString(2131296985), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        localp.a((float)()localRatingBar.getRating());
        localp.B();
        float f = localp.b();
        new StringBuilder().append("Average Call Rating = ").append(f).toString();
        if (localRatingBar.getRating() < localp.k())
        {
          c.a(c.this, f, localp);
          localp.B();
        }
        new StringBuilder().append("pingThresholdOffset = ").append(localp.g()).append(" bandWidthThresholdOffset = ").append(localp.o()).toString();
        b.a("call_rating", "" + Math.round(2.0D * f) / 2.0D, "pingThresholdOffset = " + localp.g() + " bandWidthThresholdOffset = " + localp.o());
      }
    });
    localBuilder.setNegativeButton(2131296426, null);
    localBuilder.create().show();
    localp.a(System.currentTimeMillis());
    localp.B();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.c
 * JD-Core Version:    0.6.2
 */