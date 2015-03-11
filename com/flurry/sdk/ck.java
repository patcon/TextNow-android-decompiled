package com.flurry.sdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

public class ck
{
  private static final String a = null;

  // ERROR //
  public static ci a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 15	java/io/StringReader
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 19	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   14: astore_1
    //   15: invokestatic 25	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   18: astore 5
    //   20: aload 5
    //   22: ldc 27
    //   24: iconst_0
    //   25: invokeinterface 33 3 0
    //   30: aload 5
    //   32: aload_1
    //   33: invokeinterface 37 2 0
    //   38: aload 5
    //   40: invokeinterface 41 1 0
    //   45: pop
    //   46: aload 5
    //   48: new 43	com/flurry/sdk/ci$a
    //   51: dup
    //   52: invokespecial 45	com/flurry/sdk/ci$a:<init>	()V
    //   55: new 47	java/util/ArrayList
    //   58: dup
    //   59: invokespecial 48	java/util/ArrayList:<init>	()V
    //   62: invokestatic 51	com/flurry/sdk/ck:a	(Lorg/xmlpull/v1/XmlPullParser;Lcom/flurry/sdk/ci$a;Ljava/util/List;)Lcom/flurry/sdk/ci;
    //   65: astore 7
    //   67: iconst_3
    //   68: ldc 53
    //   70: new 55	java/lang/StringBuilder
    //   73: dup
    //   74: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   77: ldc 58
    //   79: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: aload_0
    //   83: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   89: invokestatic 71	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   92: aload_1
    //   93: invokestatic 76	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   96: aload 7
    //   98: areturn
    //   99: astore 9
    //   101: aconst_null
    //   102: astore_1
    //   103: aload 9
    //   105: astore_2
    //   106: iconst_3
    //   107: ldc 53
    //   109: new 55	java/lang/StringBuilder
    //   112: dup
    //   113: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   116: ldc 78
    //   118: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: aload_0
    //   122: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: aload_2
    //   129: invokestatic 81	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   132: new 43	com/flurry/sdk/ci$a
    //   135: dup
    //   136: invokespecial 45	com/flurry/sdk/ci$a:<init>	()V
    //   139: invokevirtual 84	com/flurry/sdk/ci$a:a	()Lcom/flurry/sdk/ci$a;
    //   142: invokevirtual 88	com/flurry/sdk/ci$a:b	()Lcom/flurry/sdk/ci;
    //   145: astore 4
    //   147: aload_1
    //   148: invokestatic 76	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   151: aload 4
    //   153: areturn
    //   154: astore 8
    //   156: aconst_null
    //   157: astore_1
    //   158: aload 8
    //   160: astore_3
    //   161: aload_1
    //   162: invokestatic 76	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   165: aload_3
    //   166: athrow
    //   167: astore_3
    //   168: goto -7 -> 161
    //   171: astore_2
    //   172: goto -66 -> 106
    //
    // Exception table:
    //   from	to	target	type
    //   6	15	99	java/lang/Exception
    //   6	15	154	finally
    //   15	92	167	finally
    //   106	147	167	finally
    //   15	92	171	java/lang/Exception
  }

  private static ci a(XmlPullParser paramXmlPullParser, ci.a parama, List<cq> paramList)
  {
    paramXmlPullParser.require(2, a, "VAST");
    String str = paramXmlPullParser.getAttributeValue(a, "version");
    if (str != null)
      try
      {
        int i = Math.round(Float.parseFloat(str));
        if ((i > 0) && (i <= 3))
          parama.a(i);
        while (true)
          if (paramXmlPullParser.next() != 3)
            if (paramXmlPullParser.getEventType() == 2)
              if (paramXmlPullParser.getName().equals("Ad"))
              {
                paramList.add(a(paramXmlPullParser, new cq.a()));
                continue;
                throw new Exception();
              }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
          eo.a(3, "VASTXmlParser", "Could not identify VAST version");
      }
      catch (Exception localException)
      {
        while (true)
        {
          eo.a(3, "VASTXmlParser", "VAST version not supported");
          continue;
          b(paramXmlPullParser);
        }
        parama.a(paramList);
        parama.a(a(paramList));
      }
    while (true)
    {
      return parama.b();
      eo.a(3, "VASTXmlParser", "Could not identify VAST version");
    }
  }

  private static cq a(XmlPullParser paramXmlPullParser, cq.a parama)
  {
    paramXmlPullParser.require(2, a, "Ad");
    parama.a(paramXmlPullParser.getAttributeValue(a, "id"));
    try
    {
      parama.a(Integer.parseInt(paramXmlPullParser.getAttributeValue(a, "sequence")));
      while (true)
      {
        if (paramXmlPullParser.next() == 3)
          break label201;
        if (paramXmlPullParser.getEventType() == 2)
        {
          str = paramXmlPullParser.getName();
          if (!str.equals("InLine"))
            break;
          parama.a(a(paramXmlPullParser, new cs.a(), new cr.a(), new ArrayList(), new ArrayList()));
        }
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        String str;
        eo.a(3, "VASTXmlParser", "Could not identify Ad Sequence");
        continue;
        if (str.equals("Wrapper"))
          parama.a(a(paramXmlPullParser, new cs.a(), new cr.a(), new ArrayList(), new ArrayList(), new ArrayList()));
        else
          b(paramXmlPullParser);
      }
    }
    label201: return parama.a();
  }

  private static cs a(XmlPullParser paramXmlPullParser, cs.a parama, cr.a parama1, List<String> paramList1, List<String> paramList2)
  {
    parama.a(cl.b);
    paramXmlPullParser.require(2, a, "InLine");
    while (paramXmlPullParser.next() != 3)
      if (paramXmlPullParser.getEventType() == 2)
      {
        String str = paramXmlPullParser.getName();
        if (str.equals("Creatives"))
        {
          parama.d(a(paramXmlPullParser, new ArrayList()));
        }
        else if (str.equals("AdSystem"))
        {
          parama1.a(paramXmlPullParser.getAttributeValue(a, "version"));
          parama1.b(a(paramXmlPullParser));
          parama.a(parama1.a());
        }
        else if (str.equals("AdTitle"))
        {
          parama.a(a(paramXmlPullParser));
        }
        else if (str.equals("Impression"))
        {
          a(paramList1, a(paramXmlPullParser));
        }
        else if (str.equals("Error"))
        {
          a(paramList2, a(paramXmlPullParser));
        }
        else
        {
          b(paramXmlPullParser);
        }
      }
    parama.b(paramList1);
    parama.c(paramList2);
    return parama.a();
  }

  private static cs a(XmlPullParser paramXmlPullParser, cs.a parama, cr.a parama1, List<String> paramList1, List<String> paramList2, List<String> paramList3)
  {
    parama.a(cl.c);
    paramXmlPullParser.require(2, a, "Wrapper");
    while (paramXmlPullParser.next() != 3)
      if (paramXmlPullParser.getEventType() == 2)
      {
        String str = paramXmlPullParser.getName();
        if (str.equals("Creatives"))
        {
          parama.d(a(paramXmlPullParser, new ArrayList()));
        }
        else if (str.equals("AdSystem"))
        {
          parama1.a(paramXmlPullParser.getAttributeValue(a, "version"));
          parama1.b(a(paramXmlPullParser));
          parama.a(parama1.a());
        }
        else if (str.equals("VASTAdTagURI"))
        {
          a(paramList1, a(paramXmlPullParser));
        }
        else if (str.equals("Impression"))
        {
          a(paramList2, a(paramXmlPullParser));
        }
        else if (str.equals("Error"))
        {
          a(paramList3, a(paramXmlPullParser));
        }
        else
        {
          b(paramXmlPullParser);
        }
      }
    parama.a(paramList1);
    parama.b(paramList2);
    parama.c(paramList3);
    return parama.a();
  }

  private static ct a(XmlPullParser paramXmlPullParser, ct.a parama)
  {
    paramXmlPullParser.require(2, a, "Creative");
    parama.a(paramXmlPullParser.getAttributeValue(a, "id"));
    String str = paramXmlPullParser.getAttributeValue(a, "sequence");
    if (str != null);
    try
    {
      parama.a(Math.round(Float.parseFloat(str)));
      while (true)
      {
        if (paramXmlPullParser.next() == 3)
          break label140;
        if (paramXmlPullParser.getEventType() == 2)
        {
          if (!paramXmlPullParser.getName().equals("Linear"))
            break;
          parama.a(cm.b);
          parama.a(a(paramXmlPullParser, new cu.a()));
        }
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        eo.a(3, "VASTXmlParser", "Could not identify Creative sequence");
        continue;
        b(paramXmlPullParser);
      }
    }
    label140: return parama.a();
  }

  private static cu a(XmlPullParser paramXmlPullParser, cu.a parama)
  {
    paramXmlPullParser.require(2, a, "Linear");
    String str1 = paramXmlPullParser.getAttributeValue(a, "skipoffset");
    if (str1 != null)
      parama.b(cj.b(str1));
    while (paramXmlPullParser.next() != 3)
      if (paramXmlPullParser.getEventType() == 2)
      {
        String str2 = paramXmlPullParser.getName();
        if (str2.equals("Duration"))
          parama.a(cj.b(a(paramXmlPullParser)));
        else if (str2.equals("TrackingEvents"))
          parama.a(a(paramXmlPullParser, new ds()));
        else if (str2.equals("VideoClicks"))
          parama.a(a(paramXmlPullParser, new HashMap()));
        else if (str2.equals("MediaFiles"))
          parama.a(cj.a(b(paramXmlPullParser, new ArrayList())));
        else
          b(paramXmlPullParser);
      }
    return parama.a();
  }

  private static cv a(XmlPullParser paramXmlPullParser, cv.a parama)
  {
    paramXmlPullParser.require(2, a, "MediaFile");
    parama.a(paramXmlPullParser.getAttributeValue(a, "id"));
    parama.d(paramXmlPullParser.getAttributeValue(a, "type"));
    parama.b(paramXmlPullParser.getAttributeValue(a, "apiFramework"));
    parama.a(cn.a(paramXmlPullParser.getAttributeValue(a, "delivery")));
    try
    {
      parama.b(Integer.parseInt(paramXmlPullParser.getAttributeValue(a, "height")));
    }
    catch (NumberFormatException localNumberFormatException2)
    {
      try
      {
        parama.c(Integer.parseInt(paramXmlPullParser.getAttributeValue(a, "width")));
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        try
        {
          while (true)
          {
            parama.a(Integer.parseInt(paramXmlPullParser.getAttributeValue(a, "bitrate")));
            parama.b(Boolean.parseBoolean(paramXmlPullParser.getAttributeValue(a, "scalable")));
            parama.a(Boolean.parseBoolean(paramXmlPullParser.getAttributeValue(a, "maintainAspectRatio")));
            parama.c(a(paramXmlPullParser));
            return parama.a();
            localNumberFormatException1 = localNumberFormatException1;
            eo.a(3, "VASTXmlParser", "Could not identify MediaFile height");
            continue;
            localNumberFormatException2 = localNumberFormatException2;
            eo.a(3, "VASTXmlParser", "Could not identify MediaFile width");
          }
        }
        catch (NumberFormatException localNumberFormatException3)
        {
          while (true)
            eo.a(3, "VASTXmlParser", "Could not identify MediaFile bitRate");
        }
      }
    }
  }

  private static cw a(XmlPullParser paramXmlPullParser, cw.a parama)
  {
    paramXmlPullParser.require(2, a, "Tracking");
    parama.a(co.a(paramXmlPullParser.getAttributeValue(a, "event")));
    parama.a(a(paramXmlPullParser));
    return parama.a();
  }

  private static ds<co, String> a(XmlPullParser paramXmlPullParser, ds<co, String> paramds)
  {
    paramXmlPullParser.require(2, a, "TrackingEvents");
    while (paramXmlPullParser.next() != 3)
      if (paramXmlPullParser.getEventType() == 2)
        if (paramXmlPullParser.getName().equals("Tracking"))
        {
          cw localcw = a(paramXmlPullParser, new cw.a());
          if (!TextUtils.isEmpty(localcw.b()))
            paramds.a(localcw.a(), localcw.b());
        }
        else
        {
          b(paramXmlPullParser);
        }
    return paramds;
  }

  private static String a(XmlPullParser paramXmlPullParser)
  {
    int i = paramXmlPullParser.next();
    String str = null;
    if (i == 4)
    {
      str = paramXmlPullParser.getText().trim();
      paramXmlPullParser.nextTag();
    }
    return str;
  }

  private static List<ct> a(XmlPullParser paramXmlPullParser, List<ct> paramList)
  {
    paramXmlPullParser.require(2, a, "Creatives");
    while (paramXmlPullParser.next() != 3)
      if (paramXmlPullParser.getEventType() == 2)
        if (paramXmlPullParser.getName().equals("Creative"))
          paramList.add(a(paramXmlPullParser, new ct.a()));
        else
          b(paramXmlPullParser);
    return paramList;
  }

  private static Map<cp, String> a(XmlPullParser paramXmlPullParser, Map<cp, String> paramMap)
  {
    paramXmlPullParser.require(2, a, "VideoClicks");
    while (paramXmlPullParser.next() != 3)
      if (paramXmlPullParser.getEventType() == 2)
      {
        String str = paramXmlPullParser.getName();
        if (str.equals("ClickThrough"))
          paramMap.put(cp.b, a(paramXmlPullParser));
        else if (str.equals("ClickTracking"))
          paramMap.put(cp.c, a(paramXmlPullParser));
        else if (str.equals("CustomClick"))
          paramMap.put(cp.d, a(paramXmlPullParser));
        else
          b(paramXmlPullParser);
      }
    return paramMap;
  }

  private static void a(List<String> paramList, String paramString)
  {
    if (paramList == null);
    while (TextUtils.isEmpty(paramString))
      return;
    paramList.add(paramString);
  }

  public static boolean a(List<cq> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()))
      return false;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      cs localcs = ((cq)localIterator.next()).c();
      if ((localcs == null) || (!cl.b.equals(localcs.a())))
        return false;
    }
    return true;
  }

  private static List<cv> b(XmlPullParser paramXmlPullParser, List<cv> paramList)
  {
    paramXmlPullParser.require(2, a, "MediaFiles");
    while (paramXmlPullParser.next() != 3)
      if (paramXmlPullParser.getEventType() == 2)
        if (paramXmlPullParser.getName().equals("MediaFile"))
          paramList.add(a(paramXmlPullParser, new cv.a()));
        else
          b(paramXmlPullParser);
    return paramList;
  }

  private static void b(XmlPullParser paramXmlPullParser)
  {
    if (paramXmlPullParser.getEventType() != 2)
      throw new IllegalStateException();
    int i = 1;
    while (i != 0)
      switch (paramXmlPullParser.next())
      {
      default:
        break;
      case 2:
        i++;
        break;
      case 3:
        i--;
      }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ck
 * JD-Core Version:    0.6.2
 */