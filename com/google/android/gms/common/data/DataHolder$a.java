package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.o;
import java.util.ArrayList;
import java.util.HashMap;

public class DataHolder$a
{
  private final String[] Kb;
  private final ArrayList<HashMap<String, Object>> Kk;
  private final String Kl;
  private final HashMap<Object, Integer> Km;
  private boolean Kn;
  private String Ko;

  private DataHolder$a(String[] paramArrayOfString, String paramString)
  {
    this.Kb = ((String[])o.i(paramArrayOfString));
    this.Kk = new ArrayList();
    this.Kl = paramString;
    this.Km = new HashMap();
    this.Kn = false;
    this.Ko = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataHolder.a
 * JD-Core Version:    0.6.2
 */