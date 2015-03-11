package com.enflick.android.TextNow.activities;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.view.z;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.TextView;
import com.enflick.android.TextNow.persistence.contentproviders.g;
import com.enflick.android.TextNow.tasks.c;
import com.enflick.android.TextNow.views.ExtendedEditText;
import com.enflick.android.TextNow.views.e;
import textnow.p.ac;
import textnow.p.ad;
import textnow.p.ae;
import textnow.z.f;
import textnow.z.h;

public class ag extends av
  implements TextWatcher, AdapterView.OnItemClickListener, e
{
  private boolean a = false;
  private ListView b;
  private ExtendedEditText f;
  private TextView g;
  private View h;
  private ac i;

  public static ag a()
  {
    return new ag();
  }

  public final boolean C()
  {
    e();
    return super.C();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  public void afterTextChanged(Editable paramEditable)
  {
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  protected final String l()
  {
    return "/Search";
  }

  protected final String m()
  {
    return "";
  }

  public final int n()
  {
    return 2131558500;
  }

  protected final boolean o()
  {
    return true;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.b.setAdapter(this.i);
    setHasOptionsMenu(true);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.i = new ac(this.d, null);
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(2131755021, paramMenu);
    this.f = ((ExtendedEditText)z.a(paramMenu.findItem(2131559094)).findViewById(2131558512));
    this.f.setImeOptions(6);
    this.f.addTextChangedListener(this);
    this.f.a(this);
    this.f.setText(this.i.c());
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (paramViewGroup != null)
      this.e = paramViewGroup.getApplicationWindowToken();
    View localView = paramLayoutInflater.inflate(2130903194, null);
    this.h = localView.findViewById(2131558945);
    this.g = ((TextView)localView.findViewById(2131558944));
    this.d.e(true);
    this.b = ((ListView)localView.findViewById(2131558946));
    this.b.setOnItemClickListener(this);
    this.a = true;
    return localView;
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ae localae = (ae)paramView.getTag();
    e();
    ContentResolver localContentResolver1 = this.d.getContentResolver();
    String[] arrayOfString1 = new String[1];
    arrayOfString1[0] = localae.a.a();
    h localh = h.a(localContentResolver1, arrayOfString1);
    if (TextUtils.isEmpty(localae.b.d()))
      this.d.a(2, localh, MessageViewFragment.MessageViewState.a);
    Cursor localCursor;
    do
    {
      return;
      ContentResolver localContentResolver2 = this.d.getContentResolver();
      Uri localUri = g.d;
      String[] arrayOfString2 = { "_id" };
      String[] arrayOfString3 = new String[1];
      arrayOfString3[0] = localae.a.a();
      localCursor = localContentResolver2.query(localUri, arrayOfString2, "contact_value=?", arrayOfString3, "date");
    }
    while (localCursor == null);
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      return;
    }
    int j = -1;
    do
      if (localCursor.getLong(0) == localae.b.c())
        j = localCursor.getPosition();
    while ((j == -1) && (localCursor.moveToNext()));
    localCursor.close();
    MessageViewFragment.MessageViewState localMessageViewState = new MessageViewFragment.MessageViewState();
    localMessageViewState.e = this.i.c();
    localMessageViewState.f = (j + 1);
    this.d.a(2, localh, localMessageViewState);
  }

  public void onPause()
  {
    super.onPause();
    e();
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence != null) && (paramCharSequence.length() == 0))
    {
      this.h.setVisibility(4);
      this.g.setVisibility(0);
    }
    while (true)
    {
      if (!paramCharSequence.toString().equalsIgnoreCase(this.i.c()))
        this.i.getFilter().filter(paramCharSequence);
      return;
      this.h.setVisibility(0);
      this.g.setVisibility(8);
    }
  }

  protected final IBinder y()
  {
    if (this.a)
      return this.f.getApplicationWindowToken();
    return super.y();
  }

  public final void z()
  {
    this.d.e(true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ag
 * JD-Core Version:    0.6.2
 */