package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v4.content.c;
import android.util.TypedValue;
import textnow.g.b;
import textnow.g.f;

public class al
{
  static final PorterDuff.Mode a;
  private static final String b = al.class.getSimpleName();
  private static final am c;
  private static final int[] d;
  private static final int[] e;
  private static final int[] f;
  private static final int[] g;
  private static final int[] h = arrayOfInt5;
  private final Context i;
  private final Resources j;
  private final TypedValue k;
  private ColorStateList l;
  private ColorStateList m;
  private ColorStateList n;

  static
  {
    a = PorterDuff.Mode.SRC_IN;
    c = new am(6);
    int[] arrayOfInt1 = new int[14];
    arrayOfInt1[0] = f.g;
    arrayOfInt1[1] = f.j;
    arrayOfInt1[2] = f.q;
    arrayOfInt1[3] = f.i;
    arrayOfInt1[4] = f.h;
    arrayOfInt1[5] = f.p;
    arrayOfInt1[6] = f.k;
    arrayOfInt1[7] = f.l;
    arrayOfInt1[8] = f.o;
    arrayOfInt1[9] = f.n;
    arrayOfInt1[10] = f.m;
    arrayOfInt1[11] = f.r;
    arrayOfInt1[12] = f.C;
    arrayOfInt1[13] = f.A;
    d = arrayOfInt1;
    int[] arrayOfInt2 = new int[3];
    arrayOfInt2[0] = f.z;
    arrayOfInt2[1] = f.B;
    arrayOfInt2[2] = f.e;
    e = arrayOfInt2;
    int[] arrayOfInt3 = new int[3];
    arrayOfInt3[0] = f.u;
    arrayOfInt3[1] = f.c;
    arrayOfInt3[2] = f.t;
    f = arrayOfInt3;
    int[] arrayOfInt4 = new int[6];
    arrayOfInt4[0] = f.f;
    arrayOfInt4[1] = f.y;
    arrayOfInt4[2] = f.D;
    arrayOfInt4[3] = f.v;
    arrayOfInt4[4] = f.a;
    arrayOfInt4[5] = f.b;
    g = arrayOfInt4;
    int[] arrayOfInt5 = new int[1];
    arrayOfInt5[0] = f.d;
  }

  public al(Context paramContext)
  {
    this.i = paramContext;
    this.j = new an(paramContext.getResources(), this);
    this.k = new TypedValue();
  }

  private int a(int paramInt, float paramFloat)
  {
    int i1 = b(paramInt);
    int i2 = Color.alpha(i1);
    return i1 & 0xFFFFFF | Math.round(paramFloat * i2) << 24;
  }

  public static Drawable a(Context paramContext, int paramInt)
  {
    if ((a(f, paramInt)) || (a(d, paramInt)) || (a(e, paramInt)) || (a(g, paramInt)) || (a(h, paramInt)));
    for (int i1 = 1; i1 != 0; i1 = 0)
      return new al(paramContext).a(paramInt);
    return c.a(paramContext, paramInt);
  }

  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    int i1 = paramArrayOfInt.length;
    for (int i2 = 0; ; i2++)
    {
      boolean bool = false;
      if (i2 < i1)
      {
        if (paramArrayOfInt[i2] == paramInt)
          bool = true;
      }
      else
        return bool;
    }
  }

  private int b(int paramInt)
  {
    if (this.i.getTheme().resolveAttribute(paramInt, this.k, true))
    {
      if ((this.k.type >= 16) && (this.k.type <= 31))
        return this.k.data;
      if (this.k.type == 3)
        return this.j.getColor(this.k.resourceId);
    }
    return 0;
  }

  private int c(int paramInt)
  {
    this.i.getTheme().resolveAttribute(16842803, this.k, true);
    return a(paramInt, this.k.getFloat());
  }

  public final Drawable a(int paramInt)
  {
    Drawable localDrawable = c.a(this.i, paramInt);
    if (localDrawable != null)
    {
      if (a(g, paramInt))
      {
        if (this.l == null)
        {
          int i1 = b(b.n);
          int i2 = b(b.m);
          int[][] arrayOfInt5 = new int[7][];
          int[] arrayOfInt6 = new int[7];
          arrayOfInt5[0] = { -16842910 };
          arrayOfInt6[0] = c(b.n);
          arrayOfInt5[1] = { 16842908 };
          arrayOfInt6[1] = i2;
          arrayOfInt5[2] = { 16843518 };
          arrayOfInt6[2] = i2;
          arrayOfInt5[3] = { 16842919 };
          arrayOfInt6[3] = i2;
          arrayOfInt5[4] = { 16842912 };
          arrayOfInt6[4] = i2;
          arrayOfInt5[5] = { 16842913 };
          arrayOfInt6[5] = i2;
          arrayOfInt5[6] = new int[0];
          arrayOfInt6[6] = i1;
          this.l = new ColorStateList(arrayOfInt5, arrayOfInt6);
        }
        return new ak(localDrawable, this.l);
      }
      if (paramInt == f.x)
      {
        if (this.n == null)
        {
          int[][] arrayOfInt3 = new int[3][];
          int[] arrayOfInt4 = new int[3];
          arrayOfInt3[0] = { -16842910 };
          arrayOfInt4[0] = a(16842800, 0.1F);
          arrayOfInt3[1] = { 16842912 };
          arrayOfInt4[1] = a(b.m, 0.3F);
          arrayOfInt3[2] = new int[0];
          arrayOfInt4[2] = a(16842800, 0.3F);
          this.n = new ColorStateList(arrayOfInt3, arrayOfInt4);
        }
        return new ak(localDrawable, this.n);
      }
      if (paramInt == f.w)
      {
        if (this.m == null)
        {
          int[][] arrayOfInt1 = new int[3][];
          int[] arrayOfInt2 = new int[3];
          arrayOfInt1[0] = { -16842910 };
          arrayOfInt2[0] = c(b.o);
          arrayOfInt1[1] = { 16842912 };
          arrayOfInt2[1] = b(b.m);
          arrayOfInt1[2] = new int[0];
          arrayOfInt2[2] = b(b.o);
          this.m = new ColorStateList(arrayOfInt1, arrayOfInt2);
        }
        return new ak(localDrawable, this.m, PorterDuff.Mode.MULTIPLY);
      }
      if (a(h, paramInt))
        return this.j.getDrawable(paramInt);
      a(paramInt, localDrawable);
    }
    return localDrawable;
  }

  final void a(int paramInt, Drawable paramDrawable)
  {
    int i2;
    Object localObject;
    int i3;
    int i1;
    if (a(d, paramInt))
    {
      i2 = b.n;
      localObject = null;
      i3 = 1;
      i1 = -1;
    }
    while (true)
    {
      PorterDuffColorFilter localPorterDuffColorFilter1;
      PorterDuffColorFilter localPorterDuffColorFilter2;
      if (i3 != 0)
      {
        if (localObject == null)
          localObject = a;
        int i4 = b(i2);
        localPorterDuffColorFilter1 = c.a(i4, (PorterDuff.Mode)localObject);
        if (localPorterDuffColorFilter1 != null)
          break label199;
        localPorterDuffColorFilter2 = new PorterDuffColorFilter(i4, (PorterDuff.Mode)localObject);
        c.a(i4, (PorterDuff.Mode)localObject, localPorterDuffColorFilter2);
      }
      label199: for (PorterDuffColorFilter localPorterDuffColorFilter3 = localPorterDuffColorFilter2; ; localPorterDuffColorFilter3 = localPorterDuffColorFilter1)
      {
        paramDrawable.setColorFilter(localPorterDuffColorFilter3);
        if (i1 != -1)
          paramDrawable.setAlpha(i1);
        return;
        if (a(e, paramInt))
        {
          i2 = b.m;
          i3 = 1;
          i1 = -1;
          localObject = null;
          break;
        }
        if (a(f, paramInt))
        {
          PorterDuff.Mode localMode = PorterDuff.Mode.MULTIPLY;
          i3 = 1;
          i1 = -1;
          localObject = localMode;
          i2 = 16842801;
          break;
        }
        if (paramInt != f.s)
          break label206;
        i2 = 16842800;
        int i5 = Math.round(40.799999F);
        i3 = 1;
        i1 = i5;
        localObject = null;
        break;
      }
      label206: i1 = -1;
      localObject = null;
      i2 = 0;
      i3 = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.al
 * JD-Core Version:    0.6.2
 */