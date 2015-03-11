package twitter4j.internal.http;

public abstract interface HttpClient
{
  public abstract HttpResponse request(HttpRequest paramHttpRequest);

  public abstract void shutdown();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.http.HttpClient
 * JD-Core Version:    0.6.2
 */