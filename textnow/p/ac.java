package textnow.p;

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
import android.widget.TextView;
import com.enflick.android.TextNow.persistence.contentproviders.d;
import com.enflick.android.TextNow.persistence.contentproviders.g;
import com.enflick.android.TextNow.views.AvatarView;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import textnow.v.b;
import textnow.v.k;
import textnow.v.o;
import textnow.z.h;

public final class ac extends android.support.v4.widget.f
{
  private static final String[] j = { "_id", "message_text", "contact_name", "contact_value", "date", "message_type", "contact_type", "contact_uri" };
  private volatile String k = "";

  public ac(final Context paramContext, Cursor paramCursor)
  {
    super(paramContext, null, true);
    a(new FilterQueryProvider()
    {
      public final Cursor runQuery(CharSequence paramAnonymousCharSequence)
      {
        if (TextUtils.isEmpty(paramAnonymousCharSequence))
        {
          ac.a(ac.this, "");
          return new MatrixCursor(ac.d());
        }
        ac.a(ac.this, paramAnonymousCharSequence.toString().toLowerCase(Locale.US));
        String str = "%" + paramAnonymousCharSequence.toString() + "%";
        MatrixCursor localMatrixCursor = new MatrixCursor(ac.d());
        Cursor localCursor1 = paramContext.getContentResolver().query(d.d, ad.a(), "contact_name like ? or contact_value like ? ", new String[] { str, str }, "latest_message_date DESC");
        if (localCursor1 != null)
          try
          {
            if (localCursor1.moveToNext())
              ad.b(localCursor1).a(localMatrixCursor);
          }
          finally
          {
            localCursor1.close();
          }
        if (paramAnonymousCharSequence.length() > 1)
        {
          Cursor localCursor2 = paramContext.getContentResolver().query(g.d, ad.b(), "(message_type=1 OR message_type=0) AND message_text like ? ", new String[] { str }, "date DESC");
          if (localCursor2 != null)
            try
            {
              while (localCursor2.moveToNext())
              {
                ad localad = ad.a(localCursor2);
                if (localad.b.toLowerCase(Locale.US).contains(ac.a(ac.this)))
                  localad.a(localMatrixCursor);
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
    paramSpannable.setSpan(new BackgroundColorSpan(this.d.getResources().getColor(2131230820)), paramInt1, paramInt2, 33);
    return paramSpannable;
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903193, paramViewGroup, false);
    localView.setTag(new ae(localView));
    return localView;
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    ae localae1 = (ae)paramView.getTag();
    if (localae1 == null);
    for (ae localae2 = new ae(paramView); ; localae2 = localae1)
    {
      if (paramCursor == null)
      {
        paramView.setVisibility(8);
        return;
      }
      paramView.setVisibility(0);
      localae2.b = new ad(paramCursor);
      ContentResolver localContentResolver = paramContext.getContentResolver();
      String str1 = localae2.b.d;
      String str2 = localae2.b.d;
      int i;
      Spannable localSpannable2;
      Spannable.Factory localFactory;
      if ((str2 == null) || (str2.indexOf("@") >= 0))
      {
        i = 3;
        Uri localUri1 = k.a(localContentResolver, str1, i);
        if (localUri1 != null)
          localae2.b.h = localUri1.toString();
        if ((localae2.b.h != null) && (TextUtils.isEmpty(localae2.b.c)))
          localae2.b.c = k.b(paramContext.getContentResolver(), Uri.parse(localae2.b.h));
        localae2.a = new textnow.z.f(localae2.b.d, localae2.b.g, localae2.b.c, localae2.b.h);
        if (!TextUtils.isEmpty(localae2.b.b))
          break label884;
        localSpannable2 = Spannable.Factory.getInstance().newSpannable(localae2.a.g());
        if (!TextUtils.isEmpty(this.k))
        {
          int i9 = localae2.a.g().toLowerCase(Locale.US).indexOf(this.k);
          if (i9 >= 0)
            a(localSpannable2, i9, i9 + this.k.length());
        }
        localae2.c.setText(localSpannable2);
        if (localae2.a.h())
          break label695;
        localFactory = Spannable.Factory.getInstance();
        if (localae2.a.b() != 3)
          break label476;
      }
      Spannable localSpannable3;
      int i5;
      String str5;
      label476: for (String str4 = localae2.a.a(); ; str4 = b.f(localae2.a.a()))
      {
        localSpannable3 = localFactory.newSpannable(str4);
        if (TextUtils.isEmpty(this.k))
          break label578;
        i5 = localae2.a.a().toLowerCase(Locale.US).indexOf(this.k);
        if (i5 < 0)
          break label578;
        if (localae2.a.b() != 2)
          break label673;
        str5 = localSpannable3.toString().toLowerCase(Locale.US);
        for (int i6 = 0; (i6 <= i5) && (i6 < str5.length()); i6++)
          if (!Character.isDigit(str5.charAt(i6)))
            i5++;
        i = 2;
        break;
      }
      int i7 = Math.min(i5 + this.k.length(), -1 + str5.length());
      for (int i8 = i5; (i8 < i7) && (i8 < str5.length()); i8++)
        if (!Character.isDigit(str5.charAt(i8)))
          i7++;
      a(localSpannable3, i5, Math.min(i7, -1 + str5.length()));
      label578: localae2.e.setVisibility(0);
      localae2.e.setText(localSpannable3);
      label597: localae2.f.setImageDrawable(null);
      localae2.f.a(false, 1);
      localae2.f.setVisibility(0);
      if (localae2.a.a().equalsIgnoreCase("support@enflick.com"))
      {
        localae2.f.setImageResource(2130837562);
        localae2.f.setTag(null);
      }
      while (true)
      {
        localae2.d.setVisibility(8);
        return;
        label673: a(localSpannable3, i5, i5 + this.k.length());
        break;
        label695: localae2.e.setVisibility(8);
        break label597;
        String str3 = localae2.a.d();
        if (str3 == null)
          str3 = "";
        if (localae2.a.b() == 5)
        {
          localae2.f.setTag(null);
          int i4 = str3.split(",").length;
          localae2.f.a(true, i4);
          localae2.f.a(i4 + "");
        }
        else if (h.c(str3))
        {
          localae2.f.a(localSpannable2.toString());
          localae2.f.setTag(null);
        }
        else
        {
          Uri localUri2 = Uri.parse(str3);
          localae2.f.setTag(localUri2);
          localae2.f.a(localSpannable2.toString());
          o.a(this.d).a(localae2.f, localUri2);
        }
      }
      label884: localae2.c.setText(localae2.a.g());
      localae2.d.setVisibility(0);
      localae2.d.setText(DateFormat.getDateInstance().format(new Date(localae2.b.e)).toString());
      Object localObject = Spannable.Factory.getInstance().newSpannable(localae2.b.b);
      if (!TextUtils.isEmpty(this.k))
      {
        int m = localae2.b.b.toLowerCase(Locale.US).indexOf(this.k);
        if (m >= 0)
        {
          int n = m - 25;
          if (n <= 0)
            break label1173;
          int i3 = localae2.b.b.indexOf(" ", n - 1);
          localae2.b.b = (".." + localae2.b.b.substring(i3 + 1));
        }
      }
      label1173: for (int i1 = 1; ; i1 = -1)
      {
        Spannable localSpannable1 = Spannable.Factory.getInstance().newSpannable(localae2.b.b);
        int i2 = localae2.b.b.toLowerCase(Locale.US).indexOf(this.k, i1 + 1);
        if (i2 >= 0)
          a(localSpannable1, i2, i2 + this.k.length());
        localObject = localSpannable1;
        localae2.e.setVisibility(0);
        localae2.e.setText((CharSequence)localObject);
        localae2.f.setVisibility(8);
        return;
      }
    }
  }

  public final String c()
  {
    return this.k;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.ac
 * JD-Core Version:    0.6.2
 */