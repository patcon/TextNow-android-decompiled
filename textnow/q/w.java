package textnow.q;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import com.enflick.android.TextNow.persistence.contentproviders.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import textnow.e.e;

final class w extends HandlerThread
  implements Handler.Callback
{
  private final ContentResolver b;
  private final StringBuilder c = new StringBuilder();
  private final Set<Long> d = new HashSet();
  private final Set<String> e = new HashSet();
  private final Set<Uri> f = new HashSet();
  private final Map<Long, Uri> g = new HashMap();
  private final List<Uri> h = new ArrayList();
  private Handler i;
  private int j = 0;

  public w(u paramu, ContentResolver paramContentResolver)
  {
    super("PhotoLoader");
    this.b = paramContentResolver;
  }

  private Object a(long paramLong)
  {
    if (this.g.containsKey(Long.valueOf(paramLong)))
      return this.g.get(Long.valueOf(paramLong));
    return Long.valueOf(paramLong);
  }

  private void a(boolean paramBoolean)
  {
    if (this.d.isEmpty())
      return;
    if ((!paramBoolean) && (this.j == 1))
    {
      Iterator localIterator2 = this.f.iterator();
      while (localIterator2.hasNext())
      {
        Uri localUri = (Uri)localIterator2.next();
        this.h.remove(localUri);
      }
      if (this.h.isEmpty())
        this.j = 2;
    }
    this.c.setLength(0);
    this.c.append("_id IN(");
    for (int k = 0; k < this.e.size(); k++)
    {
      if (k != 0)
        this.c.append(',');
      this.c.append('?');
    }
    this.c.append(')');
    try
    {
      new StringBuilder().append("Loading photo id:").append(TextUtils.join(",", this.e)).toString();
      Cursor localCursor2 = this.b.query(ContactsContract.Data.CONTENT_URI, u.h(), this.c.toString(), (String[])this.e.toArray(u.i()), null);
      localCursor1 = localCursor2;
      if (localCursor1 != null);
      try
      {
        if (localCursor1.moveToNext())
        {
          Long localLong2 = Long.valueOf(localCursor1.getLong(0));
          byte[] arrayOfByte = localCursor1.getBlob(1);
          u.a(this.a, a(localLong2.longValue()), arrayOfByte, paramBoolean);
          this.d.remove(localLong2);
          this.e.remove(String.valueOf(localLong2));
        }
      }
      finally
      {
        if (localCursor1 != null)
          localCursor1.close();
      }
      Iterator localIterator1 = this.d.iterator();
      while (localIterator1.hasNext())
      {
        Long localLong1 = (Long)localIterator1.next();
        u.a(this.a, a(localLong1.longValue()), null, paramBoolean);
      }
      u.c(this.a).sendEmptyMessage(2);
      return;
    }
    finally
    {
      while (true)
        Cursor localCursor1 = null;
    }
  }

  private void c()
  {
    if (this.i == null)
      this.i = new Handler(getLooper(), this);
  }

  private void d()
  {
    try
    {
      Cursor localCursor2 = this.b.query(c.d, new String[] { "contact_uri" }, "contact_uri NOT NULL AND contact_uri != 'NON_CONTACT'", null, "latest_message_date DESC LIMIT 100");
      localCursor1 = localCursor2;
      if (localCursor1 != null);
      try
      {
        if (localCursor1.moveToNext())
          this.h.add(0, Uri.parse(localCursor1.getString(0)));
      }
      finally
      {
        if (localCursor1 != null)
          localCursor1.close();
      }
      return;
    }
    finally
    {
      while (true)
        Cursor localCursor1 = null;
    }
  }

  private void e()
  {
    this.g.clear();
    if (this.f.isEmpty())
      return;
    Iterator localIterator = this.f.iterator();
    if (localIterator.hasNext())
    {
      Uri localUri = (Uri)localIterator.next();
      String[] arrayOfString = localUri.toString().split(",");
      int k = arrayOfString.length;
      int m = 0;
      label68: if (m < k)
      {
        String str = arrayOfString[m];
        long l = k.a(this.b, Uri.parse(str));
        if (l == 0L)
          break label154;
        this.d.add(Long.valueOf(l));
        this.e.add(String.valueOf(l));
        this.g.put(Long.valueOf(l), localUri);
      }
      while (true)
      {
        m++;
        break label68;
        break;
        label154: u.a(this.a, localUri, null, false);
      }
    }
    this.f.clear();
  }

  public final void a()
  {
    if (this.j == 2);
    do
    {
      return;
      c();
    }
    while (this.i.hasMessages(1));
    this.i.sendEmptyMessageDelayed(0, 1000L);
  }

  public final void b()
  {
    c();
    this.i.removeMessages(0);
    this.i.sendEmptyMessage(1);
  }

  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 0:
      do
        return true;
      while (this.j == 2);
      if (this.j == 0)
      {
        d();
        if (this.h.isEmpty());
        for (this.j = 2; ; this.j = 1)
        {
          a();
          return true;
        }
      }
      if (u.a(this.a).size() > u.b(this.a))
      {
        this.j = 2;
        return true;
      }
      this.f.clear();
      int k = this.h.size();
      int m = 0;
      while ((k > 0) && (this.f.size() < 25))
      {
        int n = k - 1;
        m++;
        Uri localUri = (Uri)this.h.get(n);
        this.f.add(localUri);
        this.h.remove(n);
        k = n;
      }
      e();
      a(true);
      if (k == 0)
        this.j = 2;
      new StringBuilder().append("Preloaded ").append(m).append(" photos.  Cached bytes: ").append(u.a(this.a).size()).toString();
      a();
      return true;
    case 1:
    }
    u.a(this.a, this.d, this.e, this.f);
    e();
    a(false);
    a();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.w
 * JD-Core Version:    0.6.2
 */