package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@ez
public class df
{
  private final boolean rb;
  private final boolean rc;
  private final boolean rd;
  private final boolean re;
  private final boolean rf;

  private df(df.a parama)
  {
    this.rb = df.a.a(parama);
    this.rc = df.a.b(parama);
    this.rd = df.a.c(parama);
    this.re = df.a.d(parama);
    this.rf = df.a.e(parama);
  }

  public JSONObject bK()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("sms", this.rb).put("tel", this.rc).put("calendar", this.rd).put("storePicture", this.re).put("inlineVideo", this.rf);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      gs.b("Error occured while obtaining the MRAID capabilities.", localJSONException);
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.df
 * JD-Core Version:    0.6.2
 */