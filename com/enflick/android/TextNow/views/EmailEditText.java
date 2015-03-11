package com.enflick.android.TextNow.views;

import android.content.Context;
import android.text.Editable;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import android.widget.EditText;
import com.enflick.android.TextNow.tasks.CheckEmailAvailabilityTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailEditText extends CompoundEditText
{
  private boolean f = false;

  public EmailEditText(Context paramContext)
  {
    super(paramContext);
  }

  public EmailEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private boolean a(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    int i = 0;
    String[] arrayOfString = paramString1.split("\\.");
    Pattern localPattern = Pattern.compile(paramString2, 0);
    String str = getContext().getString(paramInt2);
    boolean bool = false;
    while (i < arrayOfString.length)
    {
      Matcher localMatcher = localPattern.matcher(arrayOfString[i]);
      while (localMatcher.find())
      {
        bool = true;
        a().setSpan(new BackgroundColorSpan(this.a), paramInt1 + localMatcher.start(), paramInt1 + localMatcher.end(), 33);
      }
      paramInt1 = 1 + (paramInt1 + arrayOfString[i].length());
      i++;
    }
    a(bool, str);
    return bool;
  }

  private boolean a(String paramString1, String paramString2)
  {
    String[] arrayOfString = paramString1.split("\\.");
    if (arrayOfString.length < 2)
    {
      a(true, paramString2);
      return false;
    }
    for (int i = 0; i < arrayOfString.length; i++)
      if (!arrayOfString[i].matches("^[a-zA-Z0-9]+[a-zA-Z0-9-]*[a-zA-Z0-9]+$"))
      {
        a(true, paramString2);
        return false;
      }
    String str = arrayOfString[(-1 + arrayOfString.length)];
    try
    {
      Integer.valueOf(str);
      a(true, paramString2);
      return false;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return true;
  }

  private boolean b(String paramString)
  {
    String[] arrayOfString = toString().split("@");
    if ((arrayOfString.length != 2) || (!arrayOfString[0].matches("^[a-zA-Z0-9\\Q!#$%&'*+-/=?\\^_`{|}~\\.\\E]+$")))
    {
      a(true, paramString);
      return false;
    }
    String str = arrayOfString[0];
    char[] arrayOfChar = arrayOfString[0].toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    int m;
    for (int k = 46; j < i; k = m)
    {
      m = arrayOfChar[j];
      if ((m == 46) && (m == k))
      {
        a(true, paramString);
        return false;
      }
      j++;
    }
    if (str.charAt(-1 + str.length()) == '.')
    {
      a(true, paramString);
      return false;
    }
    return a(arrayOfString[1], paramString);
  }

  public final void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public final boolean b(int paramInt)
  {
    int i = 2;
    String str1 = getContext().getString(2131296475);
    boolean bool1 = toString().matches("^[a-zA-Z0-9\\Q!#$%&'*+-/=?\\.\\^_`{|}~\\E]{1,64}@[a-zA-Z0-9\\Q.-\\E]{1,255}$");
    String[] arrayOfString;
    boolean bool2;
    if (bool1)
    {
      arrayOfString = toString().split("@");
      if (arrayOfString.length <= 0)
        break label249;
      String str3 = arrayOfString[0];
      Matcher localMatcher = Pattern.compile("[^a-zA-Z0-9\\Q!#$%&'*+-/=?\\^_`{|}~\\.\\E]+", 0).matcher(str3);
      String str4 = getContext().getString(2131296475);
      for (bool2 = false; localMatcher.find(); bool2 = true)
        a().setSpan(new BackgroundColorSpan(this.a), localMatcher.start(), localMatcher.end(), 33);
      a(bool2, str4);
    }
    while (true)
    {
      if (arrayOfString.length >= i)
      {
        String str2 = arrayOfString[1];
        while (i < arrayOfString.length)
        {
          str2 = str2 + "@" + arrayOfString[i];
          i++;
        }
        if ((!a(1 + arrayOfString[0].length(), str2, 2131296475, "[^a-zA-Z0-9\\Q\\.-\\E]+")) && (!bool2))
          break label232;
      }
      label232: for (bool2 = true; (!bool2) && (b(str1)); bool2 = false)
        return true;
      return false;
      a(true, str1);
      return bool1;
      label249: bool2 = false;
    }
  }

  public void g()
  {
    int i;
    if ((!a(2131296475)) && (!a(toString(), 2131296474, 256)) && (b(2131296475)))
    {
      i = 1;
      if ((i == 0) || ((this.f) && (!e())))
        break label86;
      a(d.b);
      new CheckEmailAvailabilityTask(toString()).b(getContext());
    }
    label86: 
    while ((i == 0) || (!this.f))
    {
      return;
      i = 0;
      break;
    }
    a(d.c);
    a(false);
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.e.setInputType(33);
    this.e.setHint(2131296469);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.EmailEditText
 * JD-Core Version:    0.6.2
 */