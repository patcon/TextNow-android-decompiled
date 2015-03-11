package textnow.s;

public abstract class b extends a
{
  protected abstract void execute();

  protected void notifyListener(boolean paramBoolean)
  {
    if (getResponseListener() != null)
    {
      if (paramBoolean)
        getResponse();
    }
    else
      return;
    getResponse();
  }

  protected void onAfterExecute()
  {
  }

  protected void onBeforeExecute()
  {
  }

  protected void prepare()
  {
  }

  public void run()
  {
    prepare();
    onBeforeExecute();
    execute();
    onAfterExecute();
    i locali = getResponse();
    if (locali != null)
      if (locali.e())
        break label40;
    label40: for (boolean bool = true; ; bool = false)
    {
      notifyListener(bool);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.s.b
 * JD-Core Version:    0.6.2
 */