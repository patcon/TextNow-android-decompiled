package textnow.p;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FilterQueryProvider;
import android.widget.ImageView;
import android.widget.TextView;
import com.enflick.android.TextNow.views.AvatarView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;
import textnow.v.b;
import textnow.v.k;
import textnow.v.o;
import textnow.z.f;
import textnow.z.u;

public final class l extends j
{
  public l(final Context paramContext, Cursor paramCursor)
  {
    super(paramContext, null);
    a(new FilterQueryProvider()
    {
      public final Cursor runQuery(CharSequence paramAnonymousCharSequence)
      {
        Context localContext = paramContext;
        if (paramAnonymousCharSequence == null);
        for (String str = ""; ; str = paramAnonymousCharSequence.toString())
          return j.a(localContext, str);
      }
    });
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903106, paramViewGroup, false);
    localView.setTag(new n(localView));
    return localView;
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    n localn1 = (n)paramView.getTag();
    if (localn1 == null);
    for (n localn2 = new n(paramView); ; localn2 = localn1)
    {
      int i = 0;
      if (paramCursor != null)
      {
        if (!paramCursor.moveToPrevious())
          break label287;
        long l3 = paramCursor.getLong(5);
        paramCursor.moveToNext();
        boolean bool = l3 < paramCursor.getLong(5);
        i = 0;
        if (!bool)
          i = 1;
      }
      long l1 = paramCursor.getLong(1);
      String str1 = paramCursor.getString(2);
      String str2 = paramCursor.getString(3);
      String str3 = paramCursor.getString(4);
      long l2 = paramCursor.getLong(5);
      if (i != 0)
      {
        localn2.b.setVisibility(4);
        localn2.c.setVisibility(8);
        localn2.d.setText(str2 + ": " + str3);
        if (a(str3) != 1)
          break label380;
        localn2.a = new f(b.e(str3), 2, str1, k.a(l2).toString());
        label218: if (TextUtils.isEmpty(new u(this.d).v()))
          break label478;
      }
      label287: label478: for (int j = 1; ; j = 0)
      {
        if (j != 0)
        {
          localn2.c.setTextColor(this.d.getResources().getColor(2131230803));
          localn2.d.setTextColor(this.d.getResources().getColor(2131230809));
        }
        return;
        paramCursor.moveToNext();
        i = 0;
        break;
        if (TextUtils.isEmpty(str1));
        for (String str4 = str3; ; str4 = str1)
        {
          localn2.b.setVisibility(0);
          localn2.c.setVisibility(0);
          ((AvatarView)localn2.b).a(str4);
          o.a(this.d).a(localn2.b, l1);
          localn2.c.setText(str4);
          break;
        }
        label380: if ((str3 == null) || (str3.indexOf("@") < 0))
          break label218;
        if (str3.toLowerCase(Locale.US).endsWith("@textnow.me"))
        {
          localn2.a = new f(str3.substring(0, str3.indexOf("@")), 1, str1, k.a(l2).toString());
          break label218;
        }
        localn2.a = new f(str3, 3, str1, k.a(l2).toString());
        break label218;
      }
    }
  }

  public final CharSequence c(Cursor paramCursor)
  {
    String str2;
    if (paramCursor == null)
      str2 = "";
    String str1;
    do
    {
      return str2;
      str1 = paramCursor.getString(2);
      str2 = paramCursor.getString(4);
    }
    while (str1 == null);
    return str1;
  }

  protected final Cursor d(Cursor paramCursor)
  {
    TreeSet localTreeSet = new TreeSet();
    HashSet localHashSet = new HashSet();
    MatrixCursor localMatrixCursor = new MatrixCursor(j);
    label227: 
    while ((paramCursor != null) && (!paramCursor.isClosed()) && (paramCursor.moveToNext()))
    {
      int i = paramCursor.getInt(0);
      long l1 = paramCursor.getLong(1);
      String str1 = paramCursor.getString(2);
      int j = paramCursor.getInt(3);
      String str2 = paramCursor.getString(4);
      long l2 = paramCursor.getLong(5);
      String str3 = paramCursor.getString(6);
      if (str2 != null)
      {
        String str4;
        if (a(str2) == 1)
          str4 = ContactsContract.CommonDataKinds.Phone.getTypeLabel(this.d.getResources(), j, str3).toString();
        for (String str5 = b.e(str2); ; str5 = str2.trim().toLowerCase())
        {
          if (localHashSet.contains(str5))
            break label227;
          localHashSet.add(str5);
          localTreeSet.add(new m(i, l1, str1, str2, str4, l2));
          break;
          str4 = ContactsContract.CommonDataKinds.Email.getTypeLabel(this.d.getResources(), j, str3).toString();
        }
      }
    }
    Iterator localIterator = localTreeSet.iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      localMatrixCursor.newRow().add(Integer.valueOf(localm.a)).add(Long.valueOf(localm.b)).add(localm.c).add(localm.e).add(localm.d).add(Long.valueOf(localm.f));
    }
    if (paramCursor != null)
      paramCursor.close();
    return localMatrixCursor;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.l
 * JD-Core Version:    0.6.2
 */