package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.support.v4.content.c;
import java.util.ArrayList;
import java.util.Iterator;

public final class ce
  implements Iterable<Intent>
{
  private static final cg a = new ch();
  private final ArrayList<Intent> b = new ArrayList();
  private final Context c;

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new ci();
      return;
    }
  }

  private ce(Context paramContext)
  {
    this.c = paramContext;
  }

  private ce a(ComponentName paramComponentName)
  {
    int i = this.b.size();
    try
    {
      Intent localIntent;
      for (Object localObject = ak.a(this.c, paramComponentName); localObject != null; localObject = localIntent)
      {
        this.b.add(i, localObject);
        localIntent = ak.a(this.c, ((Intent)localObject).getComponent());
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new IllegalArgumentException(localNameNotFoundException);
    }
    return this;
  }

  public static ce a(Context paramContext)
  {
    return new ce(paramContext);
  }

  public final ce a(Activity paramActivity)
  {
    boolean bool = paramActivity instanceof cf;
    Intent localIntent1 = null;
    if (bool)
      localIntent1 = ((cf)paramActivity).b();
    if (localIntent1 == null);
    for (Intent localIntent2 = ak.a(paramActivity); ; localIntent2 = localIntent1)
    {
      if (localIntent2 != null)
      {
        ComponentName localComponentName = localIntent2.getComponent();
        if (localComponentName == null)
          localComponentName = localIntent2.resolveActivity(this.c.getPackageManager());
        a(localComponentName);
        this.b.add(localIntent2);
      }
      return this;
    }
  }

  public final void a()
  {
    if (this.b.isEmpty())
      throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    Intent[] arrayOfIntent = (Intent[])this.b.toArray(new Intent[this.b.size()]);
    arrayOfIntent[0] = new Intent(arrayOfIntent[0]).addFlags(268484608);
    if (!c.a(this.c, arrayOfIntent, null))
    {
      Intent localIntent = new Intent(arrayOfIntent[(-1 + arrayOfIntent.length)]);
      localIntent.addFlags(268435456);
      this.c.startActivity(localIntent);
    }
  }

  public final Iterator<Intent> iterator()
  {
    return this.b.iterator();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ce
 * JD-Core Version:    0.6.2
 */