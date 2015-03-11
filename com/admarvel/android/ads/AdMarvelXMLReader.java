package com.admarvel.android.ads;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Stack;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class AdMarvelXMLReader extends DefaultHandler
{
  private AdMarvelXMLElement a = null;
  private Stack<AdMarvelXMLElement> b = null;

  // ERROR //
  private static String chkAndReplace(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +57 -> 58
    //   4: new 23	java/lang/StringBuffer
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 26	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   12: astore_3
    //   13: iconst_0
    //   14: istore 4
    //   16: aload_3
    //   17: invokevirtual 30	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   20: aload_1
    //   21: iload 4
    //   23: invokevirtual 36	java/lang/String:indexOf	(Ljava/lang/String;I)I
    //   26: istore 8
    //   28: iload 8
    //   30: iconst_m1
    //   31: if_icmpeq +53 -> 84
    //   34: aload_3
    //   35: iload 8
    //   37: iload 8
    //   39: aload_1
    //   40: invokevirtual 40	java/lang/String:length	()I
    //   43: iadd
    //   44: aload_2
    //   45: invokevirtual 44	java/lang/StringBuffer:replace	(IILjava/lang/String;)Ljava/lang/StringBuffer;
    //   48: pop
    //   49: iload 8
    //   51: iconst_1
    //   52: iadd
    //   53: istore 4
    //   55: goto -39 -> 16
    //   58: new 23	java/lang/StringBuffer
    //   61: dup
    //   62: ldc 46
    //   64: invokespecial 26	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   67: astore_3
    //   68: goto -55 -> 13
    //   71: astore 7
    //   73: aconst_null
    //   74: astore 6
    //   76: aload 7
    //   78: invokevirtual 49	java/lang/Exception:printStackTrace	()V
    //   81: aload 6
    //   83: astore_3
    //   84: aload_3
    //   85: ifnonnull +5 -> 90
    //   88: aconst_null
    //   89: areturn
    //   90: aload_3
    //   91: invokevirtual 30	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   94: areturn
    //   95: astore 5
    //   97: aload_3
    //   98: astore 6
    //   100: aload 5
    //   102: astore 7
    //   104: goto -28 -> 76
    //
    // Exception table:
    //   from	to	target	type
    //   4	13	71	java/lang/Exception
    //   58	68	71	java/lang/Exception
    //   16	28	95	java/lang/Exception
    //   34	49	95	java/lang/Exception
  }

  static String xmlDecode(String paramString)
  {
    if (paramString != null)
      return chkAndReplace(chkAndReplace(chkAndReplace(chkAndReplace(paramString, "&amp;", "&"), "&quot;", "\""), "&gt;", ">"), "&lt;", "<");
    return null;
  }

  static String xmlEncode(String paramString)
  {
    if (paramString != null)
      return chkAndReplace(chkAndReplace(chkAndReplace(chkAndReplace(paramString, "&", "&amp;"), "\"", "&quot;"), "<", "&lt;"), ">", "&gt;");
    return null;
  }

  public void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    String str = new String(paramArrayOfChar).substring(paramInt1, paramInt1 + paramInt2);
    ((AdMarvelXMLElement)this.b.peek()).appendData(str);
  }

  public void endElement(String paramString1, String paramString2, String paramString3)
  {
    this.b.pop();
  }

  public AdMarvelXMLElement getParsedXMLData()
  {
    return this.a;
  }

  public void parseXMLString(String paramString)
  {
    this.b = new Stack();
    XMLReader localXMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
    localXMLReader.setContentHandler(this);
    localXMLReader.parse(new InputSource(new StringReader(paramString)));
  }

  public void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    if (paramAttributes != null)
    {
      int i = paramAttributes.getLength();
      for (int j = 0; j < i; j++)
        localLinkedHashMap.put(paramAttributes.getLocalName(j), paramAttributes.getValue(j));
    }
    AdMarvelXMLElement localAdMarvelXMLElement1 = new AdMarvelXMLElement(paramString2, localLinkedHashMap);
    if (this.b.empty())
      this.a = localAdMarvelXMLElement1;
    while (true)
    {
      this.b.push(localAdMarvelXMLElement1);
      return;
      AdMarvelXMLElement localAdMarvelXMLElement2 = (AdMarvelXMLElement)this.b.peek();
      ArrayList localArrayList = (ArrayList)localAdMarvelXMLElement2.getChildren().get(paramString2);
      if (localArrayList == null)
      {
        localArrayList = new ArrayList();
        localAdMarvelXMLElement2.getChildren().put(paramString2, localArrayList);
      }
      localArrayList.add(localAdMarvelXMLElement1);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelXMLReader
 * JD-Core Version:    0.6.2
 */