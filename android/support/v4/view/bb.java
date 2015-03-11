package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class bb extends ba
{
  static Field b;
  static boolean c = false;

  public final void a(View paramView, a parama)
  {
    paramView.setAccessibilityDelegate((View.AccessibilityDelegate)parama.a());
  }

  public final boolean a(View paramView, int paramInt)
  {
    return paramView.canScrollHorizontally(paramInt);
  }

  public final boolean b(View paramView, int paramInt)
  {
    return paramView.canScrollVertically(paramInt);
  }

  // ERROR //
  public final boolean c(View paramView)
  {
    // Byte code:
    //   0: getstatic 12	android/support/v4/view/bb:c	Z
    //   3: ifeq +5 -> 8
    //   6: iconst_0
    //   7: ireturn
    //   8: getstatic 43	android/support/v4/view/bb:b	Ljava/lang/reflect/Field;
    //   11: ifnonnull +23 -> 34
    //   14: ldc 26
    //   16: ldc 45
    //   18: invokevirtual 51	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   21: astore 5
    //   23: aload 5
    //   25: putstatic 43	android/support/v4/view/bb:b	Ljava/lang/reflect/Field;
    //   28: aload 5
    //   30: iconst_1
    //   31: invokevirtual 57	java/lang/reflect/Field:setAccessible	(Z)V
    //   34: getstatic 43	android/support/v4/view/bb:b	Ljava/lang/reflect/Field;
    //   37: aload_1
    //   38: invokevirtual 61	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   41: astore_3
    //   42: aload_3
    //   43: ifnull -37 -> 6
    //   46: iconst_1
    //   47: ireturn
    //   48: astore 4
    //   50: iconst_1
    //   51: putstatic 12	android/support/v4/view/bb:c	Z
    //   54: iconst_0
    //   55: ireturn
    //   56: astore_2
    //   57: iconst_1
    //   58: putstatic 12	android/support/v4/view/bb:c	Z
    //   61: iconst_0
    //   62: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   14	34	48	java/lang/Throwable
    //   34	42	56	java/lang/Throwable
  }

  public final cd s(View paramView)
  {
    if (this.a == null)
      this.a = new WeakHashMap();
    cd localcd = (cd)this.a.get(paramView);
    if (localcd == null)
    {
      localcd = new cd(paramView);
      this.a.put(paramView, localcd);
    }
    return localcd;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.bb
 * JD-Core Version:    0.6.2
 */