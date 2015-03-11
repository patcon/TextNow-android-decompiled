package com.google.android.gms.common.data;

import com.google.android.gms.internal.hm;
import java.util.ArrayList;
import java.util.HashMap;

public class DataHolder$a
{
  private final String[] EG;
  private final ArrayList<HashMap<String, Object>> EP;
  private final String EQ;
  private final HashMap<Object, Integer> ER;
  private boolean ES;
  private String ET;

  private DataHolder$a(String[] paramArrayOfString, String paramString)
  {
    this.EG = ((String[])hm.f(paramArrayOfString));
    this.EP = new ArrayList();
    this.EQ = paramString;
    this.ER = new HashMap();
    this.ES = false;
    this.ET = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataHolder.a
 * JD-Core Version:    0.6.2
 */