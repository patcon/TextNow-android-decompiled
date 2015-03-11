package com.flurry.sdk;

import java.sql.Timestamp;
import java.util.Date;

public class mh extends mc<Timestamp>
{
  public mh()
  {
    super(Timestamp.class);
  }

  public Timestamp b(hj paramhj, iz paramiz)
  {
    return new Timestamp(B(paramhj, paramiz).getTime());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mh
 * JD-Core Version:    0.6.2
 */