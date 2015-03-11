package android.support.v7.widget;

import android.view.View;

public abstract class ak
{
  protected final as a;
  private int b = -2147483648;

  private ak(as paramas)
  {
    this.a = paramas;
  }

  public static ak a(as paramas, int paramInt)
  {
    // Byte code:
    //   0: iload_1
    //   1: tableswitch	default:+23 -> 24, 0:+33->34, 1:+42->43
    //   25: nop
    //   26: dload 89
    //   28: ldc 26
    //   30: invokespecial 29	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   33: athrow
    //   34: new 31	android/support/v7/widget/ak$1
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 32	android/support/v7/widget/ak$1:<init>	(Landroid/support/v7/widget/as;)V
    //   42: areturn
    //   43: new 34	android/support/v7/widget/ak$2
    //   46: dup
    //   47: aload_0
    //   48: invokespecial 35	android/support/v7/widget/ak$2:<init>	(Landroid/support/v7/widget/as;)V
    //   51: areturn
  }

  public abstract int a(View paramView);

  public final void a()
  {
    this.b = f();
  }

  public abstract void a(int paramInt);

  public final int b()
  {
    if (-2147483648 == this.b)
      return 0;
    return f() - this.b;
  }

  public abstract int b(View paramView);

  public abstract int c();

  public abstract int c(View paramView);

  public abstract int d();

  public abstract int d(View paramView);

  public abstract int e();

  public abstract int f();

  public abstract int g();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ak
 * JD-Core Version:    0.6.2
 */