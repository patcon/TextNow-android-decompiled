package com.flurry.sdk;

import android.text.TextUtils;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e
{
  private static int a = 1;
  private final int b;
  private final long c;
  private final String d;
  private List<c> e;

  public e(long paramLong1, String paramString, long paramLong2)
  {
    int i = a;
    a = i + 1;
    this.b = i;
    this.c = paramLong1;
    this.d = paramString;
    this.e = new ArrayList();
  }

  public e(DataInput paramDataInput)
  {
    this.b = paramDataInput.readInt();
    this.c = paramDataInput.readLong();
    String str = paramDataInput.readUTF();
    if (str.equals(""))
      str = null;
    this.d = str;
    this.e = new ArrayList();
    int i = paramDataInput.readShort();
    for (int j = 0; j < i; j = (short)(j + 1))
      this.e.add(new c(paramDataInput));
  }

  public int a()
  {
    return this.b;
  }

  public void a(c paramc)
  {
    this.e.add(paramc);
  }

  public void a(DataOutput paramDataOutput)
  {
    paramDataOutput.writeInt(this.b);
    paramDataOutput.writeLong(this.c);
    if (this.d == null);
    for (String str = ""; ; str = this.d)
    {
      paramDataOutput.writeUTF(str);
      paramDataOutput.writeShort(this.e.size());
      Iterator localIterator = this.e.iterator();
      while (localIterator.hasNext())
        ((c)localIterator.next()).a(paramDataOutput);
    }
  }

  public String b()
  {
    return this.d;
  }

  public long c()
  {
    return this.c;
  }

  public List<c> d()
  {
    return this.e;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    e locale;
    do
    {
      return true;
      if (!(paramObject instanceof e))
        return false;
      locale = (e)paramObject;
    }
    while ((this.b == locale.b) && (this.c == locale.c) && (TextUtils.equals(this.d, locale.d)) && ((this.e == locale.e) || ((this.e != null) && (this.e.equals(locale.e)))));
    return false;
  }

  public int hashCode()
  {
    int i = (int)(0x11 | this.b | this.c);
    if (this.d != null)
      i |= this.d.hashCode();
    if (this.e != null)
      i |= this.e.hashCode();
    return i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.e
 * JD-Core Version:    0.6.2
 */