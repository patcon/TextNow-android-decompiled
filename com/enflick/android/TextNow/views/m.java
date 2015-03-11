package com.enflick.android.TextNow.views;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcelable;
import android.support.v4.view.ak;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.enflick.android.TextNow.activities.an;
import com.enflick.android.TextNow.views.imagezoom.ImageViewTouch;
import java.io.File;
import java.util.List;
import textnow.bk.ar;
import textnow.bk.as;
import textnow.bk.au;
import textnow.bk.bb;
import textnow.v.g;
import textnow.v.z;

public final class m extends ak
{
  private static as a;
  private List<textnow.z.m> b;
  private an c;
  private ar d;
  private au e;
  private ImageViewTouch f;

  static
  {
    as localas = new as();
    a = localas;
    localas.h = Integer.valueOf(2130837994);
    a.i = Integer.valueOf(2130837995);
  }

  public m(an paraman, List<textnow.z.m> paramList, ar paramar)
  {
    this.c = paraman;
    this.b = paramList;
    this.d = paramar;
    this.e = new au()
    {
      public final void a(ImageView paramAnonymousImageView, Bitmap paramAnonymousBitmap, bb paramAnonymousbb)
      {
        an localan;
        if (paramAnonymousImageView.getParent() != null)
        {
          localan = m.a(m.this);
          if ((paramAnonymousbb != bb.b) && (paramAnonymousbb != bb.c))
            break label43;
        }
        label43: for (boolean bool = true; ; bool = false)
        {
          z.a(localan, paramAnonymousImageView, paramAnonymousBitmap, bool);
          return;
        }
      }

      public final void a(String paramAnonymousString)
      {
        new StringBuilder().append("error ").append(paramAnonymousString).toString();
      }
    };
  }

  private void a(final String paramString)
  {
    if (paramString != null)
      new AsyncTask()
      {
      }
      .execute(new Void[0]);
  }

  public final Parcelable a()
  {
    return null;
  }

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    textnow.z.m localm = (textnow.z.m)this.b.get(paramInt);
    final ImageViewTouch localImageViewTouch = new ImageViewTouch(this.c);
    paramViewGroup.addView(localImageViewTouch);
    String str1 = localm.k();
    final String str2 = localm.e();
    String str3 = localm.a();
    boolean bool = TextUtils.isEmpty(str1);
    int i = 0;
    String str4;
    if (!bool)
    {
      if (!g.b(this.c, str1))
        break label286;
      if (!str1.startsWith("content://"))
        break label249;
      str4 = g.a(this.c, str1);
      if (!TextUtils.isEmpty(str4))
        break label186;
      this.c.supportInvalidateOptionsMenu();
      a(str3);
    }
    label286: 
    while (true)
    {
      if (i == 0)
      {
        if (TextUtils.isEmpty(str2))
          break;
        this.d.a(localImageViewTouch, str2 + "&thumb=" + 250, a, new au()
        {
          public final void a(ImageView paramAnonymousImageView, Bitmap paramAnonymousBitmap, bb paramAnonymousbb)
          {
            an localan;
            if (localImageViewTouch.getParent() != null)
            {
              localan = m.a(m.this);
              if ((paramAnonymousbb != bb.b) && (paramAnonymousbb != bb.c))
                break label89;
            }
            label89: for (boolean bool = true; ; bool = false)
            {
              z.a(localan, paramAnonymousImageView, paramAnonymousBitmap, bool);
              as localas = new as();
              localas.g = false;
              m.c(m.this).a(localImageViewTouch, str2, localas, new au()
              {
                public final void a(ImageView paramAnonymous2ImageView, Bitmap paramAnonymous2Bitmap, bb paramAnonymous2bb)
                {
                  if (paramAnonymous2ImageView.getParent() != null)
                    z.a(m.a(m.this), paramAnonymous2ImageView, paramAnonymous2Bitmap, false);
                }

                public final void a(String paramAnonymous2String)
                {
                }
              });
              return;
            }
          }

          public final void a(String paramAnonymousString)
          {
            if (localImageViewTouch.getParent() != null)
              m.c(m.this).a(localImageViewTouch, str2, m.d(), m.b(m.this));
          }
        });
      }
      return localImageViewTouch;
      label186: if (str4.toLowerCase().startsWith("http"))
      {
        this.c.supportInvalidateOptionsMenu();
        i = 0;
      }
      else
      {
        this.d.a(localImageViewTouch, Uri.fromFile(new File(str4)).toString(), a, this.e);
        i = 1;
        continue;
        label249: this.d.a(localImageViewTouch, Uri.fromFile(new File(str1)).toString(), a, this.e);
        i = 1;
        continue;
        a(str3);
        i = 0;
      }
    }
    localImageViewTouch.setImageResource(2130837994);
    return localImageViewTouch;
  }

  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
  }

  public final void a(ViewGroup paramViewGroup)
  {
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup.removeView((View)paramObject);
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }

  public final int b()
  {
    return this.b.size();
  }

  public final void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    this.c.supportInvalidateOptionsMenu();
    this.f = ((ImageViewTouch)paramObject);
  }

  public final ImageViewTouch c()
  {
    return this.f;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.m
 * JD-Core Version:    0.6.2
 */