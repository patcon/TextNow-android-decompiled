package textnow.bh;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

final class b extends DefaultHandler
{
  c a = c.l;
  boolean b = false;
  List<e> c = new ArrayList();
  String d;
  List<d> e = new ArrayList();
  d f;
  boolean g;
  String h;
  int i;
  StringBuilder j = new StringBuilder();

  private b(a parama)
  {
  }

  private static c a(String paramString)
  {
    try
    {
      c localc = c.valueOf(paramString);
      return localc;
    }
    catch (Exception localException)
    {
    }
    return c.l;
  }

  public final void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.j.append(paramArrayOfChar, paramInt1, paramInt2);
  }

  public final void endElement(String paramString1, String paramString2, String paramString3)
  {
    int m = 1;
    if (a(paramString2) == c.d)
      this.b = false;
    while (true)
    {
      this.j.setLength(0);
      return;
      String str1 = this.j.toString().trim();
      if (str1.length() > 0)
        if (this.b)
        {
          if (this.a == c.f)
          {
            ((e)this.c.get(-1 + this.c.size())).b = str1;
          }
          else if (this.a == c.g)
          {
            this.d = str1;
          }
          else if (this.a == c.h)
          {
            this.c.add(new e("click", str1));
          }
          else
          {
            if (this.a == c.i)
            {
              String str2 = this.f.d;
              int n;
              if (str2.equalsIgnoreCase("video/3gp"))
                n = m;
              while (true)
              {
                if (n != 0)
                {
                  if (str1.toLowerCase().endsWith(".flv"))
                    m = 0;
                  if (m != 0)
                  {
                    this.f.c = str1;
                    this.e.add(this.f);
                  }
                }
                this.f = null;
                break;
                if (str2.equalsIgnoreCase("video/3gpp"))
                  n = m;
                else if (str2.equalsIgnoreCase("video/mp4"))
                  n = m;
                else
                  n = 0;
              }
            }
            if (this.a == c.e)
            {
              String[] arrayOfString = str1.split(":");
              this.i = 0;
              this.i += Math.round(1000.0F * (60.0F * (60.0F * Float.parseFloat(arrayOfString[0]))));
              this.i += Math.round(1000.0F * (60.0F * Float.parseFloat(arrayOfString[m])));
              this.i += Math.round(1000.0F * Float.parseFloat(arrayOfString[2]));
            }
          }
        }
        else if (this.a == c.c)
          this.c.add(new e("impression", str1));
        else if (this.a == c.k)
          this.h = str1;
    }
  }

  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    this.a = a(paramString2);
    if (this.a == c.a)
    {
      float f1 = Float.parseFloat(paramAttributes.getValue("version").split("\\.")[0]);
      if ((f1 < 2.0D) || (f1 >= 3.0D))
        throw new SAXException("Invalid VAST Version: " + paramAttributes.getValue("version"));
    }
    else
    {
      if (this.a != c.d)
        break label110;
      this.b = true;
    }
    label110: 
    do
    {
      do
      {
        return;
        if (this.a == c.j)
        {
          this.g = true;
          return;
        }
      }
      while (!this.b);
      if (this.a == c.f)
      {
        this.c.add(new e(paramAttributes.getValue("event")));
        return;
      }
    }
    while (this.a != c.i);
    this.f = new d(this.k);
    this.f.a = Integer.parseInt(paramAttributes.getValue("width"));
    this.f.b = Integer.parseInt(paramAttributes.getValue("height"));
    this.f.e = Integer.parseInt(paramAttributes.getValue("bitrate"));
    this.f.d = paramAttributes.getValue("type");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bh.b
 * JD-Core Version:    0.6.2
 */