package cz.acrobits.ali;

public abstract class PointerHolder
{
  protected Object mOwner = null;
  private long mPointer = 0L;

  protected native void enqueueStalker();

  protected void finalize()
  {
    enqueueStalker();
    super.finalize();
  }

  public native boolean isModifiable();

  public boolean isReleased()
  {
    return this.mPointer == 0L;
  }

  public native void release();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.ali.PointerHolder
 * JD-Core Version:    0.6.2
 */