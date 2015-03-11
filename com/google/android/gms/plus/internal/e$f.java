package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.hb;
import com.google.android.gms.internal.hb.d;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.model.people.PersonBuffer;

final class e$f extends hb<d>.d<a.d<People.LoadPeopleResult>>
  implements People.LoadPeopleResult
{
  private final String HS;
  private PersonBuffer abP;
  private final Status yz;

  public e$f(a.d<People.LoadPeopleResult> paramd, Status paramStatus, DataHolder paramDataHolder, String paramString)
  {
    super(paramd, paramStatus, paramString);
    this.yz = paramDataHolder;
    Object localObject;
    this.HS = localObject;
  }

  protected final void a(a.d<People.LoadPeopleResult> paramd, DataHolder paramDataHolder)
  {
    if (paramDataHolder != null);
    for (PersonBuffer localPersonBuffer = new PersonBuffer(paramDataHolder); ; localPersonBuffer = null)
    {
      this.abP = localPersonBuffer;
      paramd.a(this);
      return;
    }
  }

  public final String getNextPageToken()
  {
    return this.HS;
  }

  public final PersonBuffer getPersonBuffer()
  {
    return this.abP;
  }

  public final Status getStatus()
  {
    return this.yz;
  }

  public final void release()
  {
    if (this.abP != null)
      this.abP.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.e.f
 * JD-Core Version:    0.6.2
 */