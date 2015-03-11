package textnow.z;

import android.content.Context;
import android.text.TextUtils;
import java.io.Serializable;
import org.apache.http.entity.mime.content.ContentBody;
import textnow.v.g;

public abstract class c
  implements Serializable
{
  protected final String a;

  protected c(String paramString)
  {
    this.a = paramString;
  }

  public static c a(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    if (paramString.startsWith("content://"))
    {
      String str = g.a(paramContext, paramString);
      if ((TextUtils.isEmpty(str)) || (str.toLowerCase().startsWith("http")))
        return new w(paramString);
      return new a(paramString);
    }
    return new b(paramString);
  }

  public String a()
  {
    return this.a;
  }

  public abstract ContentBody b(Context paramContext);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.z.c
 * JD-Core Version:    0.6.2
 */