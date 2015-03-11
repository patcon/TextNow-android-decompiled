package com.enflick.android.TextNow.activities;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.app.z;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.enflick.android.TextNow.views.AvatarView;
import java.util.Locale;
import textnow.p.k;
import textnow.p.w;
import textnow.v.b;
import textnow.v.o;
import textnow.z.f;

public class ContactDetailsActivity extends an
  implements AdapterView.OnItemClickListener
{
  private TextView a;
  private AvatarView b;
  private boolean c;
  private Uri d;
  private k e;
  private k f;
  private w o;

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903135);
    d(true);
    setTitle(2131296586);
    this.d = ((Uri)getIntent().getParcelableExtra("contact_uri"));
    this.c = getIntent().getBooleanExtra("phone_only", false);
    final String str1 = this.d.getLastPathSegment();
    this.a = ((TextView)findViewById(2131558750));
    this.b = ((AvatarView)findViewById(2131558557));
    Cursor localCursor = getContentResolver().query(this.d, new String[] { "display_name", "photo_id" }, null, null, null);
    if (localCursor != null)
    {
      if (localCursor.moveToFirst())
      {
        String str2 = localCursor.getString(0);
        this.a.setText(str2);
        this.b.a(str2);
        long l = localCursor.getLong(1);
        o.a(this).a(this.b, l);
      }
      localCursor.close();
    }
    this.e = new k(this, null);
    if (this.c)
    {
      ListView localListView2 = (ListView)findViewById(2131558751);
      localListView2.setAdapter(this.e);
      localListView2.setOnItemClickListener(this);
    }
    while (true)
    {
      getSupportLoaderManager().a(1, null, new aa()
      {
        public final android.support.v4.content.j<Cursor> onCreateLoader(int paramAnonymousInt, Bundle paramAnonymousBundle)
        {
          return textnow.p.j.a(ContactDetailsActivity.this, 1, str1);
        }

        public final void onLoaderReset(android.support.v4.content.j<Cursor> paramAnonymousj)
        {
          ContactDetailsActivity.a(ContactDetailsActivity.this).b(null);
        }
      });
      if (!this.c)
        getSupportLoaderManager().a(2, null, new aa()
        {
          public final android.support.v4.content.j<Cursor> onCreateLoader(int paramAnonymousInt, Bundle paramAnonymousBundle)
          {
            return textnow.p.j.a(ContactDetailsActivity.this, 2, str1);
          }

          public final void onLoaderReset(android.support.v4.content.j<Cursor> paramAnonymousj)
          {
            ContactDetailsActivity.b(ContactDetailsActivity.this).b(null);
          }
        });
      return;
      this.f = new k(this, null);
      this.o = new w();
      this.o.a(this.e);
      this.o.a(this.f);
      ListView localListView1 = (ListView)findViewById(2131558751);
      localListView1.setAdapter(this.o);
      localListView1.setOnItemClickListener(this);
    }
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    String str1 = ((TextView)paramView.findViewById(2131558626)).getText().toString().trim();
    if (((Integer)paramView.getTag()).intValue() == 1);
    for (int i = 2; i == 2; i = 3)
    {
      str2 = b.b(str1);
      if (str2 != null)
        break label95;
      Toast.makeText(this, 2131296547, 0).show();
      return;
    }
    if (!b.a(str1))
    {
      Toast.makeText(this, 2131296548, 0).show();
      return;
    }
    String str2 = str1;
    label95: String str3;
    if (str2.toLowerCase(Locale.US).endsWith("@textnow.me"))
      str3 = str2.substring(0, str2.indexOf("@"));
    for (int j = 1; ; j = i)
    {
      String str4 = this.a.getText().toString().trim();
      Intent localIntent = new Intent();
      localIntent.putExtra("extra_contact", new f(str3, j, str4, this.d.toString()));
      setResult(-1, localIntent);
      finish();
      return;
      str3 = str2;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ContactDetailsActivity
 * JD-Core Version:    0.6.2
 */