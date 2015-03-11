package com.enflick.android.TextNow.views.emoticons;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.Editable;
import android.text.SpanWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import textnow.e.e;

public final class d
{
  private static d b;
  public HashMap<String, a> a;
  private final Context c;
  private final Pattern d;
  private final Pattern e;
  private final String[] f = { "https:/", "http:/" };
  private float g = 1.0F;
  private e<Object, WeakReference<Bitmap>> h;
  private ArrayList<a> i = new ArrayList();
  private String[] j;
  private String[] k;

  private d(Context paramContext)
  {
    this.c = paramContext;
    b();
    this.d = a(false);
    this.e = a(true);
    this.g = (1.25F / BitmapFactory.decodeResource(paramContext.getResources(), ((a)this.i.get(0)).a()).getHeight());
    this.h = new e(2 * this.i.size());
  }

  public static d a(Context paramContext)
  {
    if (b == null)
      b = new d(paramContext.getApplicationContext());
    return b;
  }

  private Pattern a(boolean paramBoolean)
  {
    String[] arrayOfString;
    StringBuilder localStringBuilder1;
    int m;
    if (paramBoolean)
    {
      arrayOfString = this.f;
      localStringBuilder1 = new StringBuilder(4 * arrayOfString.length);
      localStringBuilder1.append('(');
      m = arrayOfString.length;
    }
    for (int n = 0; ; n++)
    {
      if (n >= m)
        break label377;
      String str1 = arrayOfString[n];
      localStringBuilder1.append(Pattern.quote(str1)).append('|');
      StringBuilder localStringBuilder2 = new StringBuilder(str1);
      if (str1.matches(".*[a-zA-Z].*"))
      {
        if ((!paramBoolean) && (a(str1)))
        {
          String str2 = str1.toUpperCase();
          localStringBuilder1.append(Pattern.quote(str2)).append('|');
          this.a.put(str2, this.a.get(str1));
        }
        int i1 = 0;
        label140: if (i1 < str1.length())
        {
          if (Character.isLowerCase(str1.charAt(i1)))
          {
            localStringBuilder2.setCharAt(i1, Character.toUpperCase(str1.charAt(i1)));
            if ((!paramBoolean) && (!this.a.containsKey(localStringBuilder2)))
            {
              localStringBuilder1.append(Pattern.quote(localStringBuilder2.toString()));
              localStringBuilder1.append('|');
              this.a.put(localStringBuilder2.toString(), this.a.get(str1));
            }
            localStringBuilder2.setCharAt(i1, str1.charAt(i1));
          }
          while (true)
          {
            i1++;
            break label140;
            arrayOfString = this.j;
            break;
            if (Character.isUpperCase(str1.charAt(i1)))
            {
              localStringBuilder2.setCharAt(i1, Character.toLowerCase(str1.charAt(i1)));
              if ((!paramBoolean) && (!this.a.containsKey(localStringBuilder2)))
              {
                localStringBuilder1.append(Pattern.quote(localStringBuilder2.toString()));
                localStringBuilder1.append('|');
                this.a.put(localStringBuilder2.toString(), this.a.get(str1));
              }
              localStringBuilder2.setCharAt(i1, str1.charAt(i1));
            }
          }
        }
      }
    }
    label377: localStringBuilder1.replace(-1 + localStringBuilder1.length(), localStringBuilder1.length(), ")");
    return Pattern.compile(localStringBuilder1.toString());
  }

  private static boolean a(String paramString)
  {
    int m = 0;
    int n = 0;
    while (m < paramString.length())
    {
      if (Character.isLetter(paramString.charAt(m)))
        n++;
      m++;
    }
    boolean bool = false;
    if (n > 2)
      bool = true;
    return bool;
  }

  private void b()
  {
    this.j = this.c.getResources().getStringArray(2131623944);
    this.k = this.c.getResources().getStringArray(2131623945);
    if (this.j.length != this.k.length)
      throw new IllegalStateException("Emoticon resource ID/text mismatch");
    this.a = new HashMap(this.j.length);
    HashMap localHashMap = new HashMap();
    int m = 0;
    if (m < this.j.length)
    {
      String str = this.j[m];
      int n = this.c.getResources().getIdentifier(this.k[m], "drawable", this.c.getPackageName());
      a locala;
      if (!localHashMap.containsKey(Integer.valueOf(n)))
      {
        locala = new a(n, str);
        this.i.add(locala);
        localHashMap.put(Integer.valueOf(n), locala);
      }
      while (true)
      {
        this.a.put(this.j[m], locala);
        m++;
        break;
        locala = (a)localHashMap.get(Integer.valueOf(n));
      }
    }
  }

  public final ArrayList<a> a()
  {
    return this.i;
  }

  public final void a(Editable paramEditable, float paramFloat, int paramInt1, int paramInt2)
  {
    Matcher localMatcher1 = this.d.matcher(paramEditable.toString().subSequence(paramInt1, paramInt2));
    Matcher localMatcher2 = this.e.matcher(paramEditable.toString().subSequence(0, paramInt2));
    while (true)
    {
      int m;
      int i1;
      int i2;
      try
      {
        float f1 = paramFloat * this.g;
        Matrix localMatrix = new Matrix();
        localMatrix.setScale(f1, f1);
        m = paramEditable.length();
        if (localMatcher1.find())
        {
          int n = 0;
          if (localMatcher2.find())
          {
            if (localMatcher2.end() - paramInt1 != localMatcher1.end())
              continue;
            n = 1;
            continue;
          }
          if (n != 0)
            continue;
          String str1 = localMatcher1.group();
          a locala = (a)this.a.get(str1);
          String str2 = String.valueOf(locala.a()) + paramFloat;
          Object localObject = (WeakReference)this.h.get(str2);
          if ((localObject == null) || (((WeakReference)localObject).get() == null))
          {
            Bitmap localBitmap = BitmapFactory.decodeResource(this.c.getResources(), locala.a());
            WeakReference localWeakReference = new WeakReference(Bitmap.createBitmap(localBitmap, 0, 0, localBitmap.getWidth(), localBitmap.getHeight(), localMatrix, true));
            this.h.put(str2, localWeakReference);
            localObject = localWeakReference;
          }
          b localb = new b(this.c, locala.b(), (Bitmap)((WeakReference)localObject).get(), 0);
          i1 = localMatcher1.end();
          if ((i1 >= m - 1) || (!Character.isWhitespace(paramEditable.charAt(i1))))
            break label363;
          i1++;
          break label363;
          paramEditable.setSpan(localb, paramInt1 + localMatcher1.start(), i2, 33);
          continue;
        }
      }
      catch (Exception localException)
      {
        paramEditable.clearSpans();
        return;
        i2 = i1 + paramInt1;
        continue;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        System.gc();
        return;
      }
      label363: if (paramInt1 + i1 > m)
        i2 = m;
    }
  }

  public final void a(TextView paramTextView)
  {
    Editable localEditable;
    float f1;
    Matcher localMatcher;
    if (paramTextView != null)
    {
      localEditable = paramTextView.getEditableText();
      f1 = paramTextView.getTextSize();
      localMatcher = this.d.matcher(localEditable.toString());
    }
    try
    {
      float f2 = f1 * this.g;
      Matrix localMatrix = new Matrix();
      localMatrix.setScale(f2, f2);
      int m = localEditable.length();
      if (!(paramTextView instanceof EditText))
      {
        SpanWatcher[] arrayOfSpanWatcher = (SpanWatcher[])localEditable.getSpans(0, localEditable.length(), SpanWatcher.class);
        int i2 = arrayOfSpanWatcher.length;
        for (int i3 = 0; i3 < i2; i3++)
          localEditable.removeSpan(arrayOfSpanWatcher[i3]);
      }
      while (localMatcher.find())
      {
        String str1 = localMatcher.group();
        a locala = (a)this.a.get(str1);
        String str2 = String.valueOf(locala.a()) + f1;
        Object localObject = (WeakReference)this.h.get(str2);
        if ((localObject == null) || (((WeakReference)localObject).get() == null))
        {
          Bitmap localBitmap = BitmapFactory.decodeResource(this.c.getResources(), locala.a());
          WeakReference localWeakReference = new WeakReference(Bitmap.createBitmap(localBitmap, 0, 0, localBitmap.getWidth(), localBitmap.getHeight(), localMatrix, true));
          this.h.put(str2, localWeakReference);
          localObject = localWeakReference;
        }
        b localb = new b(this.c, locala.b(), (Bitmap)((WeakReference)localObject).get(), 0);
        int n = localMatcher.end();
        if ((n < m - 1) && (Character.isWhitespace(localEditable.charAt(n))))
          n++;
        int i1 = localMatcher.start();
        if ((str1.compareTo(":/") != 0) || (n >= m) || (localEditable.charAt(n) != '/'))
          localEditable.setSpan(localb, i1, n, 33);
      }
    }
    catch (Exception localException)
    {
      localEditable.clearSpans();
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      System.gc();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.emoticons.d
 * JD-Core Version:    0.6.2
 */