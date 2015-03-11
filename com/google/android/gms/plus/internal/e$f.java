package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.e.d;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.model.people.PersonBuffer;

final class e$f extends e<d>.d<BaseImplementation.b<People.LoadPeopleResult>>
  implements People.LoadPeopleResult
{
  private final Status CM;
  private final String Nq;
  private PersonBuffer alz;

  public e$f(BaseImplementation.b<People.LoadPeopleResult> paramb, Status paramStatus, DataHolder paramDataHolder, String paramString)
  {
    super(paramb, paramStatus, paramString);
    this.CM = paramDataHolder;
    Object localObject;
    this.Nq = localObject;
  }

  protected final void a(BaseImplementation.b<People.LoadPeopleResult> paramb, DataHolder paramDataHolder)
  {
    if (paramDataHolder != null);
    for (PersonBuffer localPersonBuffer = new PersonBuffer(paramDataHolder); ; localPersonBuffer = null)
    {
      this.alz = localPersonBuffer;
      paramb.b(this);
      return;
    }
  }

  public final String getNextPageToken()
  {
    return this.Nq;
  }

  public final PersonBuffer getPersonBuffer()
  {
    return this.alz;
  }

  public final Status getStatus()
  {
    return this.CM;
  }

  public final void release()
  {
    if (this.alz != null)
      this.alz.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.e.f
 * JD-Core Version:    0.6.2
 */