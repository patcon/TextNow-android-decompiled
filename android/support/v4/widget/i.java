package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class i extends Filter
{
  j a;

  i(j paramj)
  {
    this.a = paramj;
  }

  public final CharSequence convertResultToString(Object paramObject)
  {
    return this.a.c((Cursor)paramObject);
  }

  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Cursor localCursor = this.a.a(paramCharSequence);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (localCursor != null)
    {
      localFilterResults.count = localCursor.getCount();
      localFilterResults.values = localCursor;
      return localFilterResults;
    }
    localFilterResults.count = 0;
    localFilterResults.values = null;
    return localFilterResults;
  }

  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    Cursor localCursor = this.a.a();
    if ((paramFilterResults.values != null) && (paramFilterResults.values != localCursor))
      this.a.a((Cursor)paramFilterResults.values);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.i
 * JD-Core Version:    0.6.2
 */