package textnow.bh;

import com.tremorvideo.sdk.android.videoad.r;
import java.io.StringReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

public final class a
{
  b a;
  d b;

  public a(String paramString)
  {
    XMLReader localXMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
    localXMLReader.setContentHandler(new b(this, (byte)0));
    localXMLReader.parse(new InputSource(new StringReader(paramString)));
    this.a = ((b)localXMLReader.getContentHandler());
    if (!this.a.g)
    {
      List localList = this.a.e;
      Collections.sort(localList, new Comparator()
      {
      });
      if (localList.size() > 0);
      for (d locald = (d)localList.get(0); ; locald = null)
      {
        this.b = locald;
        if (this.b != null)
          break;
        throw new Exception("No valid media file found.");
      }
      if (this.b.a <= 0)
        throw new Exception("Invalid width: " + this.b.a);
      if (this.b.b <= 0)
        throw new Exception("Invalid height: " + this.b.b);
    }
  }

  public final List<e> a()
  {
    return this.a.c;
  }

  public final boolean b()
  {
    return this.a.g;
  }

  public final String c()
  {
    return this.b.c;
  }

  public final String d()
  {
    return this.a.h;
  }

  public final int e()
  {
    return this.b.a;
  }

  public final int f()
  {
    return this.b.b;
  }

  public final String g()
  {
    return this.a.d;
  }

  public final int h()
  {
    return this.a.i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bh.a
 * JD-Core Version:    0.6.2
 */