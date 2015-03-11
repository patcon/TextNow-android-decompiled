package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.List;

public class Balance extends APIResource
{
  List<Money> available;
  Boolean livemode;
  List<Money> pending;

  public static Balance retrieve()
  {
    return retrieve(null);
  }

  public static Balance retrieve(String paramString)
  {
    return (Balance)request(APIResource.RequestMethod.GET, singleClassURL(Balance.class), null, Balance.class, paramString);
  }

  public List<Money> getAvailable()
  {
    return this.available;
  }

  public Boolean getLivemode()
  {
    return this.livemode;
  }

  public List<Money> getPending()
  {
    return this.pending;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.Balance
 * JD-Core Version:    0.6.2
 */