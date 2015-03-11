package textnow.q;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.app.k;
import android.support.v4.app.z;
import android.support.v4.content.d;
import android.support.v4.content.j;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.persistence.contentproviders.e;
import com.enflick.android.TextNow.tasks.AddGroupMemberTask;
import com.enflick.android.TextNow.tasks.DeleteGroupTask;
import com.enflick.android.TextNow.tasks.UpdateGroupInfoTask;
import textnow.p.s;

public final class b extends av
  implements aa<Cursor>
{
  private TextView a;
  private s b;
  private z f;
  private d g;
  private String h;
  private String i;

  public static b a(String paramString1, String paramString2)
  {
    b localb = new b();
    Bundle localBundle = new Bundle();
    localBundle.putString("arg_contact_value", paramString1);
    localBundle.putString("arg_title", paramString2);
    localb.setArguments(localBundle);
    return localb;
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    if (paramc.getClass() == UpdateGroupInfoTask.class)
      if (paramc.h())
      {
        this.d.b(2131296818);
        new c(this, (byte)0).execute(new Void[0]);
      }
    while ((paramc.getClass() != AddGroupMemberTask.class) || (!paramc.h()) || ("GROUP_MEMBER_EXISTS".equals(paramc.j())))
      return false;
    this.d.b(2131296432);
    return false;
  }

  public final String l()
  {
    return "/Group_Members";
  }

  public final String m()
  {
    return this.d.getString(2131296805);
  }

  public final int n()
  {
    return 2131558814;
  }

  public final boolean o()
  {
    return true;
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.h = getArguments().getString("arg_contact_value");
    setHasOptionsMenu(true);
  }

  public final j<Cursor> onCreateLoader(int paramInt, Bundle paramBundle)
  {
    String[] arrayOfString1 = { "_id", "member_contact_value", "member_display_name", "member_contact_uri" };
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = this.h;
    this.g = new d(getActivity(), e.d, arrayOfString1, "contact_value=?", arrayOfString2, null);
    return this.g;
  }

  public final void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    paramMenuInflater.inflate(2131755015, paramMenu);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903139, null);
    this.a = ((TextView)localView.findViewById(2131558762));
    new c(this, (byte)0).execute(new Void[0]);
    ListView localListView = (ListView)localView.findViewById(2131558763);
    this.b = new s(getActivity(), null, 0);
    localListView.setAdapter(this.b);
    this.f = getLoaderManager();
    this.f.a(2, null, this);
    return localView;
  }

  public final void onDestroy()
  {
    super.onDestroy();
  }

  public final void onLoaderReset(j<Cursor> paramj)
  {
    if (this.b != null)
      this.b.b(null);
  }

  public final boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131559086:
      AlertDialog.Builder localBuilder2 = new AlertDialog.Builder(getActivity());
      localBuilder2.setTitle(2131296816);
      this.i = this.a.getText().toString();
      View localView = this.d.getLayoutInflater().inflate(2130903130, null);
      localBuilder2.setView(localView);
      final EditText localEditText = (EditText)localView.findViewById(2131558740);
      localEditText.setText(this.i);
      localEditText.setInputType(8192);
      localEditText.setHint(2131296812);
      localBuilder2.setPositiveButton(2131296427, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          String str = localEditText.getText().toString();
          new StringBuilder().append("Updating group name to: ").append(str).toString();
          new UpdateGroupInfoTask(b.a(b.this), str).b(b.this.getActivity());
          b.b(b.this).setText(str);
        }
      });
      localBuilder2.setNegativeButton(2131296425, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
        }
      });
      localBuilder2.create().show();
      return true;
    case 2131559087:
      AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(getActivity());
      localBuilder1.setTitle(2131296808).setMessage(2131296809).setCancelable(true).setPositiveButton(2131296427, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          ContentResolver localContentResolver = b.this.getActivity().getContentResolver();
          textnow.ac.a.a(localContentResolver, b.a(b.this));
          textnow.ac.b.c(localContentResolver, b.a(b.this));
          new DeleteGroupTask(b.a(b.this)).b(b.this.getActivity());
          b.c(b.this).j();
        }
      }).setNegativeButton(2131296425, null);
      localBuilder1.show();
      return true;
    case 2131559085:
    }
    this.d.a(a.a(this.h));
    return true;
  }

  public final void onPause()
  {
    super.onPause();
  }

  public final void onResume()
  {
    super.onResume();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.q.b
 * JD-Core Version:    0.6.2
 */