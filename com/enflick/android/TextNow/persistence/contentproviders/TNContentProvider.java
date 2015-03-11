package com.enflick.android.TextNow.persistence.contentproviders;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import textnow.ab.a;

public class TNContentProvider extends ContentProvider
{
  private static final UriMatcher b = new UriMatcher(-1);
  private static final HashMap<Integer, b> c = new HashMap();
  private a a;
  private g d;
  private d e;
  private f f;
  private e g;
  private h h;
  private c i;

  static
  {
    g.a(b);
    d.a(b);
    f.a(b);
    e.a(b);
    h.a(b);
    c.a(b);
  }

  public static void a(int paramInt, b paramb)
  {
    c.put(Integer.valueOf(paramInt), paramb);
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    int j = b.match(paramUri);
    return ((b)c.get(Integer.valueOf(j))).a(paramUri, paramString, paramArrayOfString, j);
  }

  public String getType(Uri paramUri)
  {
    int j = b.match(paramUri);
    return ((b)c.get(Integer.valueOf(j))).a(j);
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    int j = b.match(paramUri);
    return ((b)c.get(Integer.valueOf(j))).a(paramUri, paramContentValues, j);
  }

  public boolean onCreate()
  {
    this.a = new a(getContext());
    this.d = new g(this, getContext(), this.a);
    this.d.a();
    this.e = new d(this, getContext(), this.a);
    this.e.a();
    this.f = new f(this, getContext(), this.a);
    this.f.a();
    this.g = new e(this, getContext(), this.a);
    this.g.a();
    this.h = new h(this, getContext(), this.a);
    this.h.a();
    this.i = new c(this, getContext(), this.a);
    this.i.a();
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    int j = b.match(paramUri);
    return ((b)c.get(Integer.valueOf(j))).a(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, j);
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    int j = b.match(paramUri);
    return ((b)c.get(Integer.valueOf(j))).a(paramUri, paramContentValues, paramString, paramArrayOfString, j);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.persistence.contentproviders.TNContentProvider
 * JD-Core Version:    0.6.2
 */