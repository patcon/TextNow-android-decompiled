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
    if (this.UF.UE == null)
      this.UF.UE = new ArrayList();
    this.UF.UE.add(paramCountrySpecification);
    return this;
  }

  public final Builder addAllowedCountrySpecifications(Collection<CountrySpecification> paramCollection)
  {
    if (this.UF.UE == null)
      this.UF.UE = new ArrayList();
    this.UF.UE.addAll(paramCollection);
    return this;
  }

  public final UserAddressRequest build()
  {
    if (this.UF.UE != null)
      this.UF.UE = Collections.unmodifiableList(this.UF.UE);
    return this.UF;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.identity.intents.UserAddressRequest.Builder
 * JD-Core Version:    0.6.2
 */