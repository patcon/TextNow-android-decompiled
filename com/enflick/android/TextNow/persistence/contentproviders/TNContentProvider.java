package com.enflick.android.TextNow.persistence.contentproviders;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import textnow.v.a;

public class TNContentProvider extends ContentProvider
{
  private static final UriMatcher b = new UriMatcher(-1);
  private static final HashMap<Integer, b> c = new HashMap();
  private a a;
  private f d;
  private c e;
  private e f;
  private d g;
  private g h;

  static
  {
    f.a(b);
    c.a(b);
    e.a(b);
    d.a(b);
    g.a(b);
  }

  public static void a(int paramInt, b paramb)
  {
    c.put(Integer.valueOf(paramInt), paramb);
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    int i = b.match(paramUri);
    return ((b)c.get(Integer.valueOf(i))).a(paramUri, paramString, paramArrayOfString, i);
  }

  public String getType(Uri paramUri)
  {
    int i = b.match(paramUri);
    return ((b)c.get(Integer.valueOf(i))).a(i);
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    int i = b.match(paramUri);
    return ((b)c.get(Integer.valueOf(i))).a(paramUri, paramContentValues, i);
  }

  public boolean onCreate()
  {
    this.a = new a(getContext());
    this.d = new f(this, getContext(), this.a);
    this.d.a();
    this.e = new c(this, getContext(), this.a);
    this.e.a();
    this.f = new e(this, getContext(), this.a);
    this.f.a();
    this.g = new d(this, getContext(), this.a);
    this.g.a();
    this.h = new g(this, getContext(), this.a);
    this.h.a();
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    int i = b.match(paramUri);
    return ((b)c.get(Integer.valueOf(i))).a(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, i);
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    int i = b.match(paramUri);
    return ((b)c.get(Integer.valueOf(i))).a(paramUri, paramContentValues, paramString, paramArrayOfString, i);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.persistence.contentproviders.TNContentProvider
 * JD-Core Version:    0.6.2
 */