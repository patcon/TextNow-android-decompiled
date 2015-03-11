package textnow.p;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.widget.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.enflick.android.TextNow.views.AvatarView;
import textnow.v.o;

public final class s extends f
{
  public s(Context paramContext, Cursor paramCursor, int paramInt)
  {
    super(paramContext, null, 0);
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903140, paramViewGroup, false);
    localView.setTag(new t(localView));
    return localView;
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    t localt1 = (t)paramView.getTag();
    if (localt1 == null);
    for (t localt2 = new t(paramView); ; localt2 = localt1)
    {
      localt2.b.setText(paramCursor.getString(paramCursor.getColumnIndex("member_display_name")));
      ((AvatarView)localt2.a).a(localt2.b.getText().toString());
      String str = paramCursor.getString(paramCursor.getColumnIndex("member_contact_uri"));
      if (str != null)
        o.a(paramContext).a(localt2.a, Uri.parse(str));
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.s
 * JD-Core Version:    0.6.2
 */