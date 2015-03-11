package textnow.h;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import org.xmlpull.v1.XmlPullParser;

public final class d extends MenuInflater
{
  private static final Class<?>[] a = arrayOfClass;
  private static final Class<?>[] b = arrayOfClass;
  private final Object[] c;
  private final Object[] d;
  private Context e;
  private Object f;

  static
  {
    Class[] arrayOfClass = { Context.class };
  }

  public d(Context paramContext)
  {
    super(paramContext);
    this.e = paramContext;
    this.f = paramContext;
    this.c = new Object[] { paramContext };
    this.d = this.c;
  }

  private void a(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    f localf = new f(this, paramMenu);
    int i = paramXmlPullParser.getEventType();
    String str3;
    label51: Object localObject;
    int j;
    int k;
    int m;
    if (i == 2)
    {
      str3 = paramXmlPullParser.getName();
      if (str3.equals("menu"))
      {
        i = paramXmlPullParser.next();
        localObject = null;
        j = 0;
        k = i;
        m = 0;
        label64: if (m != 0)
          return;
      }
    }
    label96: int n;
    switch (k)
    {
    default:
      n = j;
    case 2:
    case 3:
      while (true)
      {
        int i1 = paramXmlPullParser.next();
        int i2 = n;
        k = i1;
        j = i2;
        break label64;
        throw new RuntimeException("Expecting menu, got " + str3);
        i = paramXmlPullParser.next();
        if (i != 1)
          break;
        break label51;
        if (j != 0)
          break label96;
        String str2 = paramXmlPullParser.getName();
        if (str2.equals("group"))
        {
          localf.a(paramAttributeSet);
          n = j;
        }
        else if (str2.equals("item"))
        {
          localf.b(paramAttributeSet);
          n = j;
        }
        else if (str2.equals("menu"))
        {
          a(paramXmlPullParser, paramAttributeSet, localf.c());
          n = j;
        }
        else
        {
          localObject = str2;
          n = 1;
          continue;
          String str1 = paramXmlPullParser.getName();
          if ((j != 0) && (str1.equals(localObject)))
          {
            localObject = null;
            n = 0;
          }
          else if (str1.equals("group"))
          {
            localf.a();
            n = j;
          }
          else
          {
            if (str1.equals("item"))
            {
              if (localf.d())
                break label96;
              if (f.a(localf) != null)
                f.a(localf);
              localf.b();
              n = j;
              continue;
            }
            if (!str1.equals("menu"))
              break label96;
            m = 1;
            n = j;
          }
        }
      }
    case 1:
    }
    throw new RuntimeException("Unexpected end of document");
  }

  // ERROR //
  public final void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 122
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: aload_2
    //   10: invokespecial 124	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   13: return
    //   14: aconst_null
    //   15: astore_3
    //   16: aload_0
    //   17: getfield 31	textnow/h/d:e	Landroid/content/Context;
    //   20: invokevirtual 128	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   23: iload_1
    //   24: invokevirtual 134	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
    //   27: astore_3
    //   28: aload_0
    //   29: aload_3
    //   30: aload_3
    //   31: invokestatic 140	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   34: aload_2
    //   35: invokespecial 99	textnow/h/d:a	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   38: aload_3
    //   39: ifnull -26 -> 13
    //   42: aload_3
    //   43: invokeinterface 145 1 0
    //   48: return
    //   49: astore 6
    //   51: new 147	android/view/InflateException
    //   54: dup
    //   55: ldc 149
    //   57: aload 6
    //   59: invokespecial 152	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   62: athrow
    //   63: astore 5
    //   65: aload_3
    //   66: ifnull +9 -> 75
    //   69: aload_3
    //   70: invokeinterface 145 1 0
    //   75: aload 5
    //   77: athrow
    //   78: astore 4
    //   80: new 147	android/view/InflateException
    //   83: dup
    //   84: ldc 149
    //   86: aload 4
    //   88: invokespecial 152	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   91: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   16	38	49	org/xmlpull/v1/XmlPullParserException
    //   16	38	63	finally
    //   51	63	63	finally
    //   80	92	63	finally
    //   16	38	78	java/io/IOException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.h.d
 * JD-Core Version:    0.6.2
 */