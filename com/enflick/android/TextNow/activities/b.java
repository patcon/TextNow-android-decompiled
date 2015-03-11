package com.enflick.android.TextNow.activities;

import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView.Tokenizer;
import com.enflick.android.TextNow.views.RecipientField;
import java.util.Locale;
import textnow.p.n;
import textnow.v.k;
import textnow.z.f;

public final class b
  implements AdapterView.OnItemClickListener
{
  private RecipientField a;
  private MultiAutoCompleteTextView.Tokenizer b;
  private ListView c;

  public b(ListView paramListView, RecipientField paramRecipientField, MultiAutoCompleteTextView.Tokenizer paramTokenizer)
  {
    this.c = paramListView;
    this.a = paramRecipientField;
    this.b = paramTokenizer;
  }

  private void a(f paramf)
  {
    if (this.a != null)
    {
      this.a.a(paramf, this.b);
      this.a.requestFocus();
      this.c.setVisibility(4);
    }
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((paramView != null) && (paramView.getTag() != null))
      a(((n)paramView.getTag()).a);
    Object localObject;
    do
    {
      do
        return;
      while ((paramAdapterView == null) || (paramAdapterView.getAdapter() == null));
      localObject = paramAdapterView.getAdapter().getItem(paramInt);
    }
    while (!(localObject instanceof Cursor));
    Cursor localCursor = (Cursor)localObject;
    String str1;
    String str2;
    long l;
    f localf;
    if ((!localCursor.isBeforeFirst()) && (!localCursor.isAfterLast()))
    {
      str1 = localCursor.getString(2);
      str2 = localCursor.getString(4);
      l = localCursor.getLong(5);
      if (str2 != null)
      {
        if (str2.indexOf("@") < 0)
          break label217;
        if (!str2.toLowerCase(Locale.US).endsWith("@textnow.me"))
          break label192;
        localf = new f(str2.substring(0, str2.indexOf("@")), 1, str1, k.a(l).toString());
      }
    }
    while (true)
    {
      a(localf);
      localCursor.close();
      return;
      label192: localf = new f(str2, 3, str1, k.a(l).toString());
      continue;
      label217: localf = new f(textnow.v.b.e(str2), 2, str1, k.a(l).toString());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.b
 * JD-Core Version:    0.6.2
 */