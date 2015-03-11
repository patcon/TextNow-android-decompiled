package textnow.k;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashSet;
import textnow.q.b;

public final class f extends e
{
  public f(Context paramContext, Cursor paramCursor)
  {
    super(paramContext, null);
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(2130903093, paramViewGroup, false);
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    TextView localTextView1 = (TextView)paramView.findViewById(2131165359);
    TextView localTextView2 = (TextView)paramView.findViewById(2131165360);
    String str1 = paramCursor.getString(1);
    String str2 = paramCursor.getString(2);
    if (str1 == null)
      str1 = "";
    localTextView2.setText(str1);
    if (str2 == null);
    for (String str3 = ""; ; str3 = str2)
    {
      localTextView1.setText(str3);
      paramView.setTag(Integer.valueOf(a(str2)));
      return;
    }
  }

  protected final Cursor d(Cursor paramCursor)
  {
    HashSet localHashSet = new HashSet();
    MatrixCursor localMatrixCursor = new MatrixCursor(k);
    label180: 
    while ((paramCursor != null) && (paramCursor.moveToNext()))
    {
      int i = paramCursor.getInt(0);
      int j = paramCursor.getInt(1);
      String str1 = paramCursor.getString(2);
      String str2 = paramCursor.getString(3);
      if (str1 != null)
      {
        String str3;
        if (a(str1) == 1)
          str3 = ContactsContract.CommonDataKinds.Phone.getTypeLabel(this.d.getResources(), j, str2).toString();
        for (String str4 = b.e(str1); ; str4 = str1.trim().toLowerCase())
        {
          if (localHashSet.contains(str4))
            break label180;
          localHashSet.add(str4);
          localMatrixCursor.newRow().add(Integer.valueOf(i)).add(str3).add(str1);
          break;
          str3 = ContactsContract.CommonDataKinds.Email.getTypeLabel(this.d.getResources(), j, str2).toString();
        }
      }
    }
    return localMatrixCursor;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.k.f
 * JD-Core Version:    0.6.2
 */