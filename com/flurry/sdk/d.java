package com.flurry.sdk;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private static final String a = d.class.getSimpleName();

  public static List<e> a(DataInput paramDataInput)
  {
    if (46586 != paramDataInput.readUnsignedShort())
      throw new IOException("Unexpected data format");
    return b(paramDataInput);
  }

  public static void a(List<e> paramList, DataOutput paramDataOutput)
  {
    paramDataOutput.writeShort(46586);
    b(paramList, paramDataOutput);
    paramDataOutput.writeShort(0);
  }

  private static List<e> b(DataInput paramDataInput)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      while (true)
      {
        if (1 != paramDataInput.readUnsignedShort())
          return localArrayList;
        localArrayList.add(new e(paramDataInput));
      }
    }
    catch (IOException localIOException)
    {
      eo.a(3, a, "unable to read adLog: ", localIOException);
    }
    return localArrayList;
  }

  private static void b(List<e> paramList, DataOutput paramDataOutput)
  {
    Iterator localIterator = paramList.iterator();
    while (true)
      if (localIterator.hasNext())
      {
        e locale = (e)localIterator.next();
        try
        {
          paramDataOutput.writeShort(1);
          locale.a(paramDataOutput);
        }
        catch (IOException localIOException)
        {
          eo.a(3, a, "unable to write adLog with GUID: " + locale.b(), localIOException);
        }
      }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.d
 * JD-Core Version:    0.6.2
 */