package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ah extends f
{
  private int j;
  private int k;
  private LayoutInflater l;

  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.l.inflate(this.j, paramViewGroup, false);
  }

  public final View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.l.inflate(this.k, paramViewGroup, false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.ah
 * JD-Core Version:    0.6.2
 */