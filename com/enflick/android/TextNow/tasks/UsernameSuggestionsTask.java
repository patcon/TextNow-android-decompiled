package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.responsemodel.Suggestion;
import com.enflick.android.TextNow.api.users.SuggestionsPost;
import com.enflick.android.TextNow.api.users.r;
import textnow.q.b;
import textnow.s.i;

public class UsernameSuggestionsTask extends c
{
  private String d;
  private String e;
  private String f;

  public UsernameSuggestionsTask(String paramString1, String paramString2, String paramString3)
  {
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
  }

  public void run()
  {
    int i;
    String[] arrayOfString1;
    String[] arrayOfString2;
    if (TextUtils.isEmpty(this.d))
    {
      i = 1;
      arrayOfString1 = new String[i];
      arrayOfString1[0] = (this.e + "." + this.f);
      if (arrayOfString1[0].length() > 18)
      {
        arrayOfString1[0] = (this.e.substring(0, 1) + "." + this.f);
        if (arrayOfString1[0].length() > 18)
        {
          arrayOfString1[0] = this.f;
          if (arrayOfString1[0].length() > 18)
            arrayOfString1[0] = arrayOfString1[0].substring(0, 18);
        }
      }
      if (!TextUtils.isEmpty(this.d))
      {
        arrayOfString1[1] = this.d;
        if (arrayOfString1[1].length() > 18)
          arrayOfString1[1] = arrayOfString1[1].substring(0, 18);
      }
      arrayOfString2 = (String[])arrayOfString1.clone();
    }
    for (int j = 0; ; j++)
    {
      if (j >= arrayOfString1.length)
        break label293;
      arrayOfString2[j] = "";
      int k = 0;
      while (true)
        if (k < arrayOfString1[j].length())
        {
          char c = arrayOfString1[j].charAt(k);
          if ((b.a(c)) || (c == '.') || (c == '_'))
            arrayOfString2[j] = (arrayOfString2[j] + c);
          k++;
          continue;
          i = 2;
          break;
        }
    }
    label293: r localr = new r(arrayOfString2);
    i locali = new SuggestionsPost(this.a).runSync(localr);
    if (a(locali))
    {
      new StringBuilder().append(i()).append("").toString();
      return;
    }
    a(((Suggestion)locali.c()).username);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.UsernameSuggestionsTask
 * JD-Core Version:    0.6.2
 */