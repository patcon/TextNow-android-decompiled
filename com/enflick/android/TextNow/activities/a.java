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
import textnow.k.i;
import textnow.q.b;
import textnow.q.k;
import textnow.u.d;

public final class a
  implements AdapterView.OnItemClickListener
{
  private RecipientField a;
  private MultiAutoCompleteTextView.Tokenizer b;
  private ListView c;

  public a(ListView paramListView, RecipientField paramRecipientField, MultiAutoCompleteTextView.Tokenizer paramTokenizer)
  {
    this.c = paramListView;
    this.a = paramRecipientField;
    this.b = paramTokenizer;
  }

  private void a(d paramd)
  {
    if (this.a != null)
    {
      this.a.a(paramd, this.b);
      this.a.requestFocus();
      this.c.setVisibility(4);
    }
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((paramView != null) && (paramView.getTag() != null))
      a(((i)paramView.getTag()).a);
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
    d locald;
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
        locald = new d(str2.substring(0, str2.indexOf("@")), 1, str1, k.a(l).toString());
      }
    }
    while (true)
    {
      a(locald);
      localCursor.close();
      return;
      label192: locald = new d(str2, 3, str1, k.a(l).toString());
      continue;
      label217: locald = new d(b.e(str2), 2, str1, k.a(l).toString());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.a
 * JD-Core Version:    0.6.2
 */