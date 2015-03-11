package android.support.v7.internal.widget;

final class z
  implements Runnable
{
  private int b;
  private int c;
  private boolean d;

  z(ProgressBarICS paramProgressBarICS, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBoolean;
  }

  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBoolean;
  }

  public final void run()
  {
    ProgressBarICS.a(this.a, this.b, this.c, this.d, true);
    ProgressBarICS.a(this.a, this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.z
 * JD-Core Version:    0.6.2
 */