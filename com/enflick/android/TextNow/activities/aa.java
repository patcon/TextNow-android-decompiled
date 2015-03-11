package com.enflick.android.TextNow.activities;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
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
import com.enflick.android.TextNow.tasks.c;
import com.enflick.android.TextNow.views.ExtendedEditText;
import textnow.k.w;
import textnow.k.x;

public class aa extends ao
  implements TextWatcher, AdapterView.OnItemClickListener, com.enflick.android.TextNow.views.d
{
  private boolean a = false;
  private ListView b;
  private ExtendedEditText g;
  private TextView h;
  private View i;
  private textnow.k.v j;

  public static aa a()
  {
    return new aa();
  }

  public final boolean B()
  {
    C();
    return super.B();
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

  protected final String k()
  {
    return "/Search";
  }

  protected final String l()
  {
    return "";
  }

  public final int m()
  {
    return 2131165272;
  }

  protected final boolean n()
  {
    return true;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.b.setAdapter(this.j);
    setHasOptionsMenu(true);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.j = new textnow.k.v(this.e, null);
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(2131755019, paramMenu);
    this.g = ((ExtendedEditText)android.support.v4.view.v.a(paramMenu.findItem(2131165790)).findViewById(2131165284));
    this.g.setImeOptions(6);
    this.g.addTextChangedListener(this);
    this.g.a(this);
    this.g.setText(this.j.c());
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (paramViewGroup != null)
      this.f = paramViewGroup.getApplicationWindowToken();
    View localView = paramLayoutInflater.inflate(2130903176, null);
    this.i = localView.findViewById(2131165643);
    this.h = ((TextView)localView.findViewById(2131165642));
    this.e.a(true);
    this.b = ((ListView)localView.findViewById(2131165644));
    this.b.setOnItemClickListener(this);
    this.a = true;
    return localView;
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    x localx = (x)paramView.getTag();
    C();
    ContentResolver localContentResolver1 = this.e.getContentResolver();
    String[] arrayOfString1 = new String[1];
    arrayOfString1[0] = localx.a.a();
    textnow.u.f localf = textnow.u.f.a(localContentResolver1, arrayOfString1);
    if (TextUtils.isEmpty(localx.b.f()))
    {
      localx.b.a("");
      localx.b.a(-1);
      this.e.a(2, localf, MessageViewFragment.MessageViewState.a, localx.b, null);
    }
    Cursor localCursor;
    do
    {
      return;
      ContentResolver localContentResolver2 = this.e.getContentResolver();
      Uri localUri = com.enflick.android.TextNow.persistence.contentproviders.f.d;
      String[] arrayOfString2 = { "_id" };
      String[] arrayOfString3 = new String[1];
      arrayOfString3[0] = localx.a.a();
      localCursor = localContentResolver2.query(localUri, arrayOfString2, "contact_value=?", arrayOfString3, "date");
    }
    while (localCursor == null);
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      return;
    }
    int k = -1;
    do
      if (localCursor.getLong(0) == localx.b.e())
        k = localCursor.getPosition();
    while ((k == -1) && (localCursor.moveToNext()));
    localCursor.close();
    localx.b.a(this.j.c());
    localx.b.a(k + 1);
    this.e.a(2, localf, MessageViewFragment.MessageViewState.a, localx.b, null);
  }

  public void onPause()
  {
    super.onPause();
    C();
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence != null) && (paramCharSequence.length() == 0))
    {
      this.i.setVisibility(4);
      this.h.setVisibility(0);
    }
    while (true)
    {
      if (!paramCharSequence.toString().equalsIgnoreCase(this.j.c()))
        this.j.getFilter().filter(paramCharSequence);
      return;
      this.i.setVisibility(0);
      this.h.setVisibility(8);
    }
  }

  protected final IBinder x()
  {
    if (this.a)
      return this.g.getApplicationWindowToken();
    return super.x();
  }

  public final void y()
  {
    this.e.a(true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.aa
 * JD-Core Version:    0.6.2
 */