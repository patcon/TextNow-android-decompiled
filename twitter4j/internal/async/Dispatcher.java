package twitter4j.internal.async;

public abstract interface Dispatcher
{
  public abstract void invokeLater(Runnable paramRunnable);

  public abstract void shutdown();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.async.Dispatcher
 * JD-Core Version:    0.6.2
 */