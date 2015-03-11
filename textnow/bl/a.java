package textnow.bl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import textnow.bn.c;

public final class a extends BaseAdapter
{
  private Context a;
  private ArrayList<c> b;
  private SimpleDateFormat c;
  private SimpleDateFormat d;
  private Date e;
  private TextView f;
  private TextView g;
  private TextView h;

  public a(Context paramContext, ArrayList<c> paramArrayList)
  {
    this.a = paramContext;
    this.b = paramArrayList;
    this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    this.d = new SimpleDateFormat("d MMM h:mm a");
  }

  public final void a()
  {
    if (this.b != null)
      this.b.clear();
  }

  public final void a(c paramc)
  {
    if ((paramc != null) && (this.b != null))
      this.b.add(paramc);
  }

  public final int getCount()
  {
    return this.b.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.b.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    c localc = (c)this.b.get(paramInt);
    net.hockeyapp.android.views.a locala;
    if (paramView == null)
      locala = new net.hockeyapp.android.views.a(this.a);
    while (true)
    {
      if (localc != null)
      {
        this.f = ((TextView)locala.findViewById(12289));
        this.g = ((TextView)locala.findViewById(12290));
        this.h = ((TextView)locala.findViewById(12291));
      }
      try
      {
        this.e = this.c.parse(localc.b());
        this.g.setText(this.d.format(this.e));
        this.f.setText(localc.c());
        this.h.setText(localc.a());
        if (paramInt % 2 == 0)
        {
          i = 0;
          locala.a(i);
          return locala;
          locala = (net.hockeyapp.android.views.a)paramView;
        }
      }
      catch (ParseException localParseException)
      {
        while (true)
        {
          localParseException.printStackTrace();
          continue;
          int i = 1;
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bl.a
 * JD-Core Version:    0.6.2
 */