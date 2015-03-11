package textnow.k;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FilterQueryProvider;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import textnow.q.b;
import textnow.q.k;
import textnow.q.q;
import textnow.q.s;
import textnow.u.d;

public final class v extends android.support.v4.widget.c
{
  private static final String[] j = { "_id", "message_text", "contact_name", "contact_value", "date", "message_type", "contact_type", "contact_uri" };
  private static final s k = new l();
  private volatile String l = "";

  public v(final Context paramContext, Cursor paramCursor)
  {
    super(paramContext, null, true);
    a(new FilterQueryProvider()
    {
      public final Cursor runQuery(CharSequence paramAnonymousCharSequence)
      {
        if (TextUtils.isEmpty(paramAnonymousCharSequence))
        {
          v.a(v.this, "");
          return new MatrixCursor(v.d());
        }
        v.a(v.this, paramAnonymousCharSequence.toString().toLowerCase(Locale.US));
        String str = "%" + paramAnonymousCharSequence.toString() + "%";
        MatrixCursor localMatrixCursor = new MatrixCursor(v.d());
        Cursor localCursor1 = paramContext.getContentResolver().query(com.enflick.android.TextNow.persistence.contentproviders.c.d, w.a(), "contact_name like ? or contact_value like ? ", new String[] { str, str }, "latest_message_date DESC");
        if (localCursor1 != null)
          try
          {
            if (localCursor1.moveToNext())
              w.b(localCursor1).a(localMatrixCursor);
          }
          finally
          {
            localCursor1.close();
          }
        if (paramAnonymousCharSequence.length() > 1)
        {
          Cursor localCursor2 = paramContext.getContentResolver().query(com.enflick.android.TextNow.persistence.contentproviders.f.d, w.b(), "(message_type=1 OR message_type=0) AND message_text like ? ", new String[] { str }, "date DESC");
          if (localCursor2 != null)
            try
            {
              while (localCursor2.moveToNext())
              {
                w localw = w.a(localCursor2);
                if (localw.b.toLowerCase(Locale.US).contains(v.a(v.this)))
                  localw.a(localMatrixCursor);
              }
            }
            finally
            {
              localCursor2.close();
            }
        }
        return localMatrixCursor;
      }
    });
  }

  private Spannable a(Spannable paramSpannable, int paramInt1, int paramInt2)
  {
    paramSpannable.setSpan(new BackgroundColorSpan(this.d.getResources().getColor(2131296300)), paramInt1, paramInt2, 33);
    return paramSpannable;
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903175, paramViewGroup, false);
    localView.setTag(new x(localView));
    return localView;
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    x localx1 = (x)paramView.getTag();
    if (localx1 == null);
    for (x localx2 = new x(paramView); ; localx2 = localx1)
    {
      if (paramCursor == null)
      {
        paramView.setVisibility(8);
        return;
      }
      paramView.setVisibility(0);
      localx2.b = new w(paramCursor);
      ContentResolver localContentResolver = paramContext.getContentResolver();
      String str1 = localx2.b.d;
      String str2 = localx2.b.d;
      int i;
      Spannable.Factory localFactory;
      if ((str2 == null) || (str2.indexOf("@") >= 0))
      {
        i = 3;
        Uri localUri1 = k.a(localContentResolver, str1, i);
        if (localUri1 != null)
          localx2.b.h = localUri1.toString();
        if ((localx2.b.h != null) && (TextUtils.isEmpty(localx2.b.c)))
          localx2.b.c = k.b(paramContext.getContentResolver(), Uri.parse(localx2.b.h));
        localx2.a = new d(localx2.b.d, localx2.b.g, localx2.b.c, localx2.b.h);
        if (!TextUtils.isEmpty(localx2.b.b))
          break label1055;
        Spannable localSpannable2 = Spannable.Factory.getInstance().newSpannable(localx2.a.g());
        if (!TextUtils.isEmpty(this.l))
        {
          int i9 = localx2.a.g().toLowerCase(Locale.US).indexOf(this.l);
          if (i9 >= 0)
            a(localSpannable2, i9, i9 + this.l.length());
        }
        localx2.c.setText(localSpannable2);
        if (localx2.a.h())
          break label676;
        localFactory = Spannable.Factory.getInstance();
        if (localx2.a.b() != 3)
          break label476;
      }
      Spannable localSpannable3;
      int i5;
      String str5;
      label476: for (String str4 = localx2.a.a(); ; str4 = b.f(localx2.a.a()))
      {
        localSpannable3 = localFactory.newSpannable(str4);
        if (TextUtils.isEmpty(this.l))
          break label578;
        i5 = localx2.a.a().toLowerCase(Locale.US).indexOf(this.l);
        if (i5 < 0)
          break label578;
        if (localx2.a.b() != 2)
          break label654;
        str5 = localSpannable3.toString().toLowerCase(Locale.US);
        for (int i6 = 0; (i6 <= i5) && (i6 < str5.length()); i6++)
          if (!Character.isDigit(str5.charAt(i6)))
            i5++;
        i = 2;
        break;
      }
      int i7 = Math.min(i5 + this.l.length(), -1 + str5.length());
      for (int i8 = i5; (i8 < i7) && (i8 < str5.length()); i8++)
        if (!Character.isDigit(str5.charAt(i8)))
          i7++;
      a(localSpannable3, i5, Math.min(i7, -1 + str5.length()));
      label578: localx2.e.setVisibility(0);
      localx2.e.setText(localSpannable3);
      label597: localx2.f.setVisibility(0);
      if (localx2.a.a().equalsIgnoreCase("support@enflick.com"))
      {
        localx2.f.setImageResource(2130837598);
        localx2.f.setTag(null);
      }
      while (true)
      {
        localx2.d.setVisibility(8);
        return;
        label654: a(localSpannable3, i5, i5 + this.l.length());
        break;
        label676: localx2.e.setVisibility(8);
        break label597;
        String str3 = localx2.a.d();
        if (str3 == null)
          str3 = "";
        if (localx2.a.b() == 5)
        {
          localx2.f.setVisibility(8);
          localx2.f.setTag(null);
          localx2.h.setVisibility(0);
          localx2.l.setTag(null);
          localx2.k.setTag(null);
          localx2.j.setTag(null);
          localx2.i.setTag(null);
          String[] arrayOfString = str3.split(",");
          int i4 = arrayOfString.length;
          if (i4 > 4)
            i4 = 4;
          switch (i4)
          {
          default:
            break;
          case 1:
          case 4:
          case 3:
          case 2:
            while (true)
            {
              q.a(this.d).a(localx2.i, Uri.parse(arrayOfString[0]), k);
              break;
              q.a(this.d).a(localx2.l, Uri.parse(arrayOfString[3]), k);
              q.a(this.d).a(localx2.k, Uri.parse(arrayOfString[2]), k);
              q.a(this.d).a(localx2.j, Uri.parse(arrayOfString[1]), k);
            }
          }
        }
        else if (textnow.u.f.c(str3))
        {
          localx2.f.setVisibility(0);
          localx2.h.setVisibility(8);
          localx2.f.setTag(null);
          localx2.f.setImageResource(2130837594);
        }
        else
        {
          localx2.f.setVisibility(0);
          localx2.h.setVisibility(8);
          Uri localUri2 = Uri.parse(str3);
          localx2.f.setTag(localUri2);
          q.a(this.d).a(localx2.f, localUri2);
        }
      }
      label1055: localx2.c.setText(localx2.a.g());
      localx2.d.setVisibility(0);
      localx2.d.setText(DateFormat.getDateInstance().format(new Date(localx2.b.e)).toString());
      Object localObject = Spannable.Factory.getInstance().newSpannable(localx2.b.b);
      if (!TextUtils.isEmpty(this.l))
      {
        int m = localx2.b.b.toLowerCase(Locale.US).indexOf(this.l);
        if (m >= 0)
        {
          int n = m - 25;
          if (n <= 0)
            break label1354;
          int i3 = localx2.b.b.indexOf(" ", n - 1);
          localx2.b.b = (".." + localx2.b.b.substring(i3 + 1));
        }
      }
      label1354: for (int i1 = 1; ; i1 = -1)
      {
        Spannable localSpannable1 = Spannable.Factory.getInstance().newSpannable(localx2.b.b);
        int i2 = localx2.b.b.toLowerCase(Locale.US).indexOf(this.l, i1 + 1);
        if (i2 >= 0)
          a(localSpannable1, i2, i2 + this.l.length());
        localObject = localSpannable1;
        localx2.e.setVisibility(0);
        localx2.e.setText((CharSequence)localObject);
        localx2.f.setVisibility(8);
        localx2.h.setVisibility(8);
        return;
      }
    }
  }

  public final String c()
  {
    return this.l;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.k.v
 * JD-Core Version:    0.6.2
 */