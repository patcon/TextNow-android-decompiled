package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.Field;
import java.util.ArrayList;
import java.util.List;

public class DataTypeCreateRequest$Builder
{
  private List<Field> SY = new ArrayList();
  private String mName;

  public Builder addField(Field paramField)
  {
    if (!this.SY.contains(paramField))
      this.SY.add(paramField);
    return this;
  }

  public Builder addField(String paramString, int paramInt)
  {
    if ((paramString != null) || (!paramString.isEmpty()));
    for (boolean bool = true; ; bool = false)
    {
      o.b(bool, "Invalid name specified");
      return addField(new Field(paramString, paramInt));
    }
  }

  public DataTypeCreateRequest build()
  {
    boolean bool1 = true;
    boolean bool2;
    if (this.mName != null)
    {
      bool2 = bool1;
      o.a(bool2, "Must set the name");
      if (this.SY.isEmpty())
        break label50;
    }
    while (true)
    {
      o.a(bool1, "Must specify the data fields");
      return new DataTypeCreateRequest(this, null);
      bool2 = false;
      break;
      label50: bool1 = false;
    }
  }

  public Builder setName(String paramString)
  {
    this.mName = paramString;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.DataTypeCreateRequest.Builder
 * JD-Core Version:    0.6.2
 */