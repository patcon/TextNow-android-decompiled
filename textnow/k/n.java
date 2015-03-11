package textnow.k;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.widget.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import textnow.q.q;

public final class n extends c
{
  public n(Context paramContext, Cursor paramCursor, int paramInt)
  {
    super(paramContext, null, 0);
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903126, paramViewGroup, false);
    localView.setTag(new o(localView));
    return localView;
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    o localo = (o)paramView.getTag();
    if (localo == null)
      localo = new o(paramView);
    localo.b.setText(paramCursor.getString(paramCursor.getColumnIndex("member_display_name")));
    String str = paramCursor.getString(paramCursor.getColumnIndex("member_contact_uri"));
    if (str != null)
      q.a(paramContext).a(localo.a, Uri.parse(str));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.k.n
 * JD-Core Version:    0.6.2
 */