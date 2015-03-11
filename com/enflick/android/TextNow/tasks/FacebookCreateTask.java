package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.users.UsersPut;
import com.enflick.android.TextNow.api.users.af;
import com.facebook.model.GraphUser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import textnow.q.l;
import textnow.s.i;
import textnow.u.r;

public class FacebookCreateTask extends c
{
  private String d;

  public FacebookCreateTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    if (l.a == null)
    {
      a(true);
      a("USER_NOT_SET");
      return;
    }
    int i = -20 + Calendar.getInstance().get(1);
    String str1 = i + "-01-01";
    String str2 = l.a.getFirstName();
    String str3 = l.a.getLastName();
    if ((TextUtils.isEmpty(str2)) || (TextUtils.isEmpty(str3)))
    {
      a(true);
      a("EMPTY_JSON");
      return;
    }
    while (true)
    {
      try
      {
        String str11 = l.a.getInnerJSONObject().getString("email");
        str4 = str11;
      }
      catch (JSONException localJSONException2)
      {
        try
        {
          boolean bool = l.a.getInnerJSONObject().getString("gender").equals("male");
          if (bool)
          {
            i1 = 1;
            j = i1;
          }
        }
        catch (JSONException localJSONException2)
        {
          try
          {
            String str8 = l.a.getBirthday();
            if (!TextUtils.isEmpty(str8))
            {
              Date localDate = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH).parse(str8);
              Calendar localCalendar = Calendar.getInstance();
              localCalendar.setTime(localDate);
              i = localCalendar.get(1);
              String str10 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(localDate);
              str9 = str10;
              n = i;
              str5 = str9;
              m = n;
              af localaf = new af(this.d, l.a.getId(), com.facebook.Session.getActiveSession().getAccessToken(), str4, str2, str3);
              localaf.g = str5;
              localaf.f = j;
              locali = new UsersPut(this.a).runSync(localaf);
              if (a(locali))
              {
                if ("FACEBOOK_ID_IN_USE".equals(j()))
                  break;
                "FACEBOOK_VERIFY_FAILED".equals(j());
                return;
                localJSONException1 = localJSONException1;
                localJSONException1.printStackTrace();
                str4 = "";
                continue;
                i1 = 2;
                continue;
                localJSONException2 = localJSONException2;
                localJSONException2.printStackTrace();
                j = 0;
                continue;
              }
            }
          }
          catch (ParseException localParseException)
          {
            String str4;
            int i1;
            int j;
            i locali;
            int k = i;
            localParseException.printStackTrace();
            String str5 = str1;
            int m = k;
            continue;
            String str6 = ((com.enflick.android.TextNow.api.responsemodel.Session)locali.c()).sessionId;
            r localr = new r(this.a);
            String str7 = localr.b();
            if ((!TextUtils.isEmpty(str7)) && (!this.d.equals(str7)))
            {
              localr.a();
              localr.n();
              localr = new r(this.a);
            }
            localr.f(l.a.getId());
            if (!TextUtils.isEmpty(this.d))
              localr.a(this.d);
            localr.g(str2);
            localr.j(str3);
            localr.c(j);
            localr.b(m);
            localr.l(str6);
            localr.c(true);
            localr.I();
            localr.n();
            return;
          }
        }
      }
      String str9 = str1;
      int n = i;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.FacebookCreateTask
 * JD-Core Version:    0.6.2
 */