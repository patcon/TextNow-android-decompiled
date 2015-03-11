package textnow.x;

public abstract class a
  implements f
{
  private h request;
  private i response;
  private g responseListener;
  private boolean terminated;

  public h getRequest()
  {
    return this.request;
  }

  public i getResponse()
  {
    return this.response;
  }

  public g getResponseListener()
  {
    return this.responseListener;
  }

  public boolean isTerminated()
  {
    return this.terminated;
  }

  public void setRequest(h paramh)
  {
    this.request = paramh;
  }

  public void setResponse(i parami)
  {
    this.response = parami;
  }

  public void setResponseListener(g paramg)
  {
    this.responseListener = paramg;
  }

  public void setTerminated(boolean paramBoolean)
  {
    this.terminated = paramBoolean;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.x.a
 * JD-Core Version:    0.6.2
 */