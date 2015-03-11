package com.google.android.gms.identity.intents;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class UserAddressRequest$Builder
{
  private UserAddressRequest$Builder(UserAddressRequest paramUserAddressRequest)
  {
  }

  public final Builder addAllowedCountrySpecification(CountrySpecification paramCountrySpecification)
  {
    if (this.adL.adK == null)
      this.adL.adK = new ArrayList();
    this.adL.adK.add(paramCountrySpecification);
    return this;
  }

  public final Builder addAllowedCountrySpecifications(Collection<CountrySpecification> paramCollection)
  {
    if (this.adL.adK == null)
      this.adL.adK = new ArrayList();
    this.adL.adK.addAll(paramCollection);
    return this;
  }

  public final UserAddressRequest build()
  {
    if (this.adL.adK != null)
      this.adL.adK = Collections.unmodifiableList(this.adL.adK);
    return this.adL;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.identity.intents.UserAddressRequest.Builder
 * JD-Core Version:    0.6.2
 */