package twitter4j.internal.http;

public enum RequestMethod
{
  static
  {
    DELETE = new RequestMethod("DELETE", 2);
    HEAD = new RequestMethod("HEAD", 3);
    PUT = new RequestMethod("PUT", 4);
    RequestMethod[] arrayOfRequestMethod = new RequestMethod[5];
    arrayOfRequestMethod[0] = GET;
    arrayOfRequestMethod[1] = POST;
    arrayOfRequestMethod[2] = DELETE;
    arrayOfRequestMethod[3] = HEAD;
    arrayOfRequestMethod[4] = PUT;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.http.RequestMethod
 * JD-Core Version:    0.6.2
 */