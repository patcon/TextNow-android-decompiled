package cz.acrobits.ali;

public class AndroidUtil$MainThreadRunner
  implements Runnable
{
  public RuntimeException mException = null;
  public Runnable mRunnable;

  AndroidUtil$MainThreadRunner(Runnable paramRunnable)
  {
    this.mRunnable = paramRunnable;
  }

  public void run()
  {
    try
    {
      this.mRunnable.run();
      notifyAll();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
        this.mException = localRuntimeException;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.ali.AndroidUtil.MainThreadRunner
 * JD-Core Version:    0.6.2
 */