package com.enflick.android.TextNow.activities;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ag;
import android.support.v4.content.j;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;
import textnow.k.e;
import textnow.k.f;
import textnow.k.p;
import textnow.q.b;
import textnow.q.q;
import textnow.u.d;

public class ContactDetailsActivity extends ah
  implements AdapterView.OnItemClickListener
{
  private TextView b;
  private ImageView c;
  private boolean d;
  private Uri e;
  private f f;
  private f l;
  private p m;

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903121);
    b(true);
    setTitle(2131493171);
    this.e = ((Uri)getIntent().getParcelableExtra("contact_uri"));
    this.d = getIntent().getBooleanExtra("phone_only", false);
    final String str = this.e.getLastPathSegment();
    this.b = ((TextView)findViewById(2131165479));
    this.c = ((ImageView)findViewById(2131165361));
    Cursor localCursor = getContentResolver().query(this.e, new String[] { "display_name", "photo_id" }, null, null, null);
    if (localCursor != null)
    {
      if (localCursor.moveToFirst())
      {
        this.b.setText(localCursor.getString(0));
        long l1 = localCursor.getLong(1);
        q.a(this).a(this.c, l1);
      }
      localCursor.close();
    }
    this.f = new f(this, null);
    if (this.d)
    {
      ListView localListView2 = (ListView)findViewById(2131165480);
      localListView2.setAdapter(this.f);
      localListView2.setOnItemClickListener(this);
    }
    while (true)
    {
      getSupportLoaderManager().a(1, null, new android.support.v4.app.ah()
      {
        public final j<Cursor> onCreateLoader(int paramAnonymousInt, Bundle paramAnonymousBundle)
        {
          return e.a(ContactDetailsActivity.this, 1, str);
        }

        public final void onLoaderReset(j<Cursor> paramAnonymousj)
        {
          ContactDetailsActivity.a(ContactDetailsActivity.this).b(null);
        }
      });
      if (!this.d)
        getSupportLoaderManager().a(2, null, new android.support.v4.app.ah()
        {
          public final j<Cursor> onCreateLoader(int paramAnonymousInt, Bundle paramAnonymousBundle)
          {
            return e.a(ContactDetailsActivity.this, 2, str);
          }

          public final void onLoaderReset(j<Cursor> paramAnonymousj)
          {
            ContactDetailsActivity.b(ContactDetailsActivity.this).b(null);
          }
        });
      return;
      this.l = new f(this, null);
      this.m = new p();
      this.m.a(this.f);
      this.m.a(this.l);
      ListView localListView1 = (ListView)findViewById(2131165480);
      localListView1.setAdapter(this.m);
      localListView1.setOnItemClickListener(this);
    }
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    String str1 = ((TextView)paramView.findViewById(2131165359)).getText().toString().trim();
    if (((Integer)paramView.getTag()).intValue() == 1);
    for (int i = 2; i == 2; i = 3)
    {
      str2 = b.b(str1);
      if (str2 != null)
        break label95;
      Toast.makeText(this, 2131493135, 0).show();
      return;
    }
    if (!b.a(str1))
    {
      Toast.makeText(this, 2131493136, 0).show();
      return;
    }
    String str2 = str1;
    label95: String str3;
    if (str2.toLowerCase(Locale.US).endsWith("@textnow.me"))
      str3 = str2.substring(0, str2.indexOf("@"));
    for (int j = 1; ; j = i)
    {
      String str4 = this.b.getText().toString().trim();
      Intent localIntent = new Intent();
      localIntent.putExtra("extra_contact", new d(str3, j, str4, this.e.toString()));
      setResult(-1, localIntent);
      finish();
      return;
      str3 = str2;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ContactDetailsActivity
 * JD-Core Version:    0.6.2
 */