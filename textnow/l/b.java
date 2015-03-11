package textnow.l;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.ag;
import android.support.v4.app.ah;
import android.support.v4.app.v;
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
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.tasks.AddGroupMemberTask;
import com.enflick.android.TextNow.tasks.DeleteGroupTask;
import com.enflick.android.TextNow.tasks.UpdateGroupInfoTask;
import textnow.k.n;

public final class b extends ao
  implements ah<Cursor>
{
  private TextView a;
  private n b;
  private ag g;
  private android.support.v4.content.d h;
  private String i;
  private String j;

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
        this.e.c(2131493426);
        new c(this, (byte)0).execute(new Void[0]);
      }
    while ((paramc.getClass() != AddGroupMemberTask.class) || (!paramc.h()) || ("GROUP_MEMBER_EXISTS".equals(paramc.j())))
      return false;
    this.e.c(2131493025);
    return false;
  }

  public final String k()
  {
    return "/Group_Members";
  }

  public final String l()
  {
    return this.e.getString(2131493408);
  }

  public final int m()
  {
    return 2131165537;
  }

  public final boolean n()
  {
    return true;
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.i = getArguments().getString("arg_contact_value");
    setHasOptionsMenu(true);
  }

  public final j<Cursor> onCreateLoader(int paramInt, Bundle paramBundle)
  {
    String[] arrayOfString1 = { "_id", "member_contact_value", "member_display_name", "member_contact_uri" };
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = this.i;
    this.h = new android.support.v4.content.d(getActivity(), com.enflick.android.TextNow.persistence.contentproviders.d.d, arrayOfString1, "contact_value=?", arrayOfString2, null);
    return this.h;
  }

  public final void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    paramMenuInflater.inflate(2131755013, paramMenu);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903125, null);
    this.a = ((TextView)localView.findViewById(2131165491));
    new c(this, (byte)0).execute(new Void[0]);
    ListView localListView = (ListView)localView.findViewById(2131165492);
    this.b = new n(getActivity(), null, 0);
    localListView.setAdapter(this.b);
    this.g = getLoaderManager();
    this.g.a(2, null, this);
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
    case 2131165781:
      AlertDialog.Builder localBuilder2 = new AlertDialog.Builder(getActivity());
      localBuilder2.setTitle(2131493419);
      this.j = this.a.getText().toString();
      View localView = this.e.getLayoutInflater().inflate(2130903116, null);
      localBuilder2.setView(localView);
      final EditText localEditText = (EditText)localView.findViewById(2131165469);
      localEditText.setText(this.j);
      localEditText.setInputType(8192);
      localBuilder2.setPositiveButton(2131493020, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          String str = localEditText.getText().toString();
          new StringBuilder().append("Updating group name to: ").append(str).toString();
          new UpdateGroupInfoTask(b.a(b.this), str).b(b.this.getActivity());
          b.b(b.this).setText(str);
        }
      });
      localBuilder2.setNegativeButton(2131493019, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
        }
      });
      localBuilder2.create().show();
      return true;
    case 2131165782:
      AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(getActivity());
      localBuilder1.setTitle(2131493411).setMessage(2131493412).setCancelable(true).setPositiveButton(2131493020, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          ContentResolver localContentResolver = b.this.getActivity().getContentResolver();
          textnow.w.a.a(localContentResolver, b.a(b.this));
          textnow.w.b.c(localContentResolver, b.a(b.this));
          new DeleteGroupTask(b.a(b.this)).b(b.this.getActivity());
          b.c(b.this).h();
        }
      }).setNegativeButton(2131493019, null);
      localBuilder1.show();
      return true;
    case 2131165780:
    }
    this.e.a(a.a(this.i));
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.l.b
 * JD-Core Version:    0.6.2
 */