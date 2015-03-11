package com.enflick.android.TextNow.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import com.enflick.android.TextNow.activities.preferences.c;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import textnow.u.r;

public abstract class w extends ao
{
  protected View a;
  protected int b;
  private PreferenceManager g;
  private Handler h = new Handler()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default:
        return;
      case 0:
      }
      w.a(w.this);
    }
  };
  private ListView i;
  private int j;

  private void a()
  {
    if (this.h.hasMessages(0))
      return;
    this.h.obtainMessage(0).sendToTarget();
  }

  private void a(Preference paramPreference)
  {
    a(paramPreference, null);
    if ((paramPreference instanceof PreferenceGroup))
    {
      PreferenceGroup localPreferenceGroup = (PreferenceGroup)paramPreference;
      for (int k = 0; k < localPreferenceGroup.getPreferenceCount(); k++)
        a(localPreferenceGroup.getPreference(k));
    }
  }

  private PreferenceManager d()
  {
    try
    {
      Class[] arrayOfClass = new Class[2];
      arrayOfClass[0] = Activity.class;
      arrayOfClass[1] = Integer.TYPE;
      Constructor localConstructor = PreferenceManager.class.getDeclaredConstructor(arrayOfClass);
      localConstructor.setAccessible(true);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.e;
      arrayOfObject[1] = Integer.valueOf(100);
      PreferenceManager localPreferenceManager = (PreferenceManager)localConstructor.newInstance(arrayOfObject);
      return localPreferenceManager;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final Preference a(CharSequence paramCharSequence)
  {
    if (this.g == null)
      return null;
    return this.g.findPreference(paramCharSequence);
  }

  public final void a(int paramInt)
  {
    this.b = paramInt;
  }

  protected void a(Preference paramPreference, String paramString)
  {
    if (paramString != null)
      paramPreference.setSummary(paramString);
    do
    {
      return;
      if ((paramPreference instanceof ListPreference))
        paramPreference.setSummary(((ListPreference)paramPreference).getEntry());
    }
    while (!(paramPreference instanceof EditTextPreference));
    paramPreference.setSummary(((EditTextPreference)paramPreference).getText());
  }

  protected final void a(Preference paramPreference, boolean paramBoolean, int paramInt, String paramString)
  {
    int k = 0;
    if (!paramBoolean)
      a(paramPreference, null);
    if ((paramPreference instanceof PreferenceGroup))
    {
      PreferenceGroup localPreferenceGroup = (PreferenceGroup)paramPreference;
      while (k < localPreferenceGroup.getPreferenceCount())
      {
        a(localPreferenceGroup.getPreference(k), paramBoolean, paramInt, paramString);
        k++;
      }
    }
    if ((paramPreference instanceof c))
    {
      c localc = (c)paramPreference;
      boolean bool = false;
      if (!paramBoolean)
        bool = true;
      localc.a(bool);
    }
  }

  public final PreferenceManager b()
  {
    return this.g;
  }

  // ERROR //
  public final void b(int paramInt)
  {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray 75	java/lang/Class
    //   4: astore_3
    //   5: aload_3
    //   6: iconst_0
    //   7: ldc 145
    //   9: aastore
    //   10: aload_3
    //   11: iconst_1
    //   12: getstatic 83	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   15: aastore
    //   16: aload_3
    //   17: iconst_2
    //   18: ldc 65
    //   20: aastore
    //   21: ldc 85
    //   23: ldc 147
    //   25: aload_3
    //   26: invokevirtual 151	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   29: astore 4
    //   31: aload 4
    //   33: iconst_1
    //   34: invokevirtual 154	java/lang/reflect/Method:setAccessible	(Z)V
    //   37: aload_0
    //   38: getfield 112	com/enflick/android/TextNow/activities/w:g	Landroid/preference/PreferenceManager;
    //   41: astore 5
    //   43: iconst_3
    //   44: anewarray 97	java/lang/Object
    //   47: astore 6
    //   49: aload 6
    //   51: iconst_0
    //   52: aload_0
    //   53: getfield 101	com/enflick/android/TextNow/activities/w:e	Lcom/enflick/android/TextNow/activities/MainActivity;
    //   56: aastore
    //   57: aload 6
    //   59: iconst_1
    //   60: iload_1
    //   61: invokestatic 105	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   64: aastore
    //   65: aload 6
    //   67: iconst_2
    //   68: aload_0
    //   69: invokevirtual 61	com/enflick/android/TextNow/activities/w:c	()Landroid/preference/PreferenceScreen;
    //   72: aastore
    //   73: aload 4
    //   75: aload 5
    //   77: aload 6
    //   79: invokevirtual 158	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   82: checkcast 65	android/preference/PreferenceScreen
    //   85: astore 7
    //   87: ldc 85
    //   89: ldc 160
    //   91: iconst_1
    //   92: anewarray 75	java/lang/Class
    //   95: dup
    //   96: iconst_0
    //   97: ldc 65
    //   99: aastore
    //   100: invokevirtual 151	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   103: astore 13
    //   105: aload 13
    //   107: iconst_1
    //   108: invokevirtual 154	java/lang/reflect/Method:setAccessible	(Z)V
    //   111: aload 13
    //   113: aload_0
    //   114: getfield 112	com/enflick/android/TextNow/activities/w:g	Landroid/preference/PreferenceManager;
    //   117: iconst_1
    //   118: anewarray 97	java/lang/Object
    //   121: dup
    //   122: iconst_0
    //   123: aload 7
    //   125: aastore
    //   126: invokevirtual 158	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   129: checkcast 162	java/lang/Boolean
    //   132: invokevirtual 166	java/lang/Boolean:booleanValue	()Z
    //   135: ifeq +12 -> 147
    //   138: aload 7
    //   140: ifnull +7 -> 147
    //   143: aload_0
    //   144: invokespecial 168	com/enflick/android/TextNow/activities/w:a	()V
    //   147: getstatic 174	android/os/Build:MODEL	Ljava/lang/String;
    //   150: ldc 176
    //   152: invokevirtual 182	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   155: ifne +14 -> 169
    //   158: getstatic 174	android/os/Build:MODEL	Ljava/lang/String;
    //   161: ldc 184
    //   163: invokevirtual 182	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   166: ifeq +93 -> 259
    //   169: getstatic 189	android/os/Build$VERSION:SDK_INT	I
    //   172: bipush 10
    //   174: if_icmpgt +85 -> 259
    //   177: iconst_0
    //   178: istore 9
    //   180: iload 9
    //   182: aload 7
    //   184: invokevirtual 190	android/preference/PreferenceScreen:getPreferenceCount	()I
    //   187: if_icmpge +72 -> 259
    //   190: aload 7
    //   192: iload 9
    //   194: invokevirtual 191	android/preference/PreferenceScreen:getPreference	(I)Landroid/preference/Preference;
    //   197: astore 10
    //   199: aload 10
    //   201: instanceof 193
    //   204: ifeq +41 -> 245
    //   207: aload 10
    //   209: checkcast 193	android/preference/PreferenceCategory
    //   212: astore 11
    //   214: iconst_0
    //   215: istore 12
    //   217: iload 12
    //   219: aload 11
    //   221: invokevirtual 194	android/preference/PreferenceCategory:getPreferenceCount	()I
    //   224: if_icmpge +28 -> 252
    //   227: aload 11
    //   229: iload 12
    //   231: invokevirtual 195	android/preference/PreferenceCategory:getPreference	(I)Landroid/preference/Preference;
    //   234: ldc 196
    //   236: invokevirtual 199	android/preference/Preference:setLayoutResource	(I)V
    //   239: iinc 12 1
    //   242: goto -25 -> 217
    //   245: aload 10
    //   247: ldc 196
    //   249: invokevirtual 199	android/preference/Preference:setLayoutResource	(I)V
    //   252: iinc 9 1
    //   255: goto -75 -> 180
    //   258: astore_2
    //   259: return
    //   260: astore 8
    //   262: goto -115 -> 147
    //
    // Exception table:
    //   from	to	target	type
    //   0	87	258	java/lang/Exception
    //   147	169	258	java/lang/Exception
    //   169	177	258	java/lang/Exception
    //   180	214	258	java/lang/Exception
    //   217	239	258	java/lang/Exception
    //   245	252	258	java/lang/Exception
    //   87	138	260	java/lang/Exception
    //   143	147	260	java/lang/Exception
  }

  public final PreferenceScreen c()
  {
    try
    {
      Method localMethod = PreferenceManager.class.getDeclaredMethod("getPreferenceScreen", new Class[0]);
      localMethod.setAccessible(true);
      PreferenceScreen localPreferenceScreen = (PreferenceScreen)localMethod.invoke(this.g, new Object[0]);
      return localPreferenceScreen;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public boolean n()
  {
    return this.b != 0;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    try
    {
      Class[] arrayOfClass = new Class[3];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = Integer.TYPE;
      arrayOfClass[2] = Intent.class;
      Method localMethod = PreferenceManager.class.getDeclaredMethod("dispatchActivityResult", arrayOfClass);
      localMethod.setAccessible(true);
      PreferenceManager localPreferenceManager = this.g;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      arrayOfObject[2] = paramIntent;
      localMethod.invoke(localPreferenceManager, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.g = d();
    this.a = LayoutInflater.from(this.e).inflate(2130903163, null);
    this.i = ((ListView)this.a.findViewById(16908298));
    this.i.setScrollBarStyle(0);
    if (paramBundle != null)
    {
      this.j = paramBundle.getInt("xml");
      b(this.j);
      a();
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    a();
    for (int k = 0; k < c().getPreferenceCount(); k++)
      a(c().getPreference(k));
    return this.a;
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.i = null;
    this.a = null;
    try
    {
      Method localMethod = PreferenceManager.class.getDeclaredMethod("dispatchActivityDestroy", new Class[0]);
      localMethod.setAccessible(true);
      localMethod.invoke(this.g, new Object[0]);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    ViewParent localViewParent = this.a.getParent();
    if (localViewParent != null)
      ((ViewGroup)localViewParent).removeView(this.a);
    if (getActivity() != null)
    {
      this.e.z();
      this.e.f(false);
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("xml", this.j);
    super.onSaveInstanceState(paramBundle);
  }

  public void onStart()
  {
    super.onStart();
    if (this.b == 0)
      new GetUserInfoTask(this.c.b()).b(this.e);
  }

  public void onStop()
  {
    super.onStop();
    try
    {
      Method localMethod = PreferenceManager.class.getDeclaredMethod("dispatchActivityStop", new Class[0]);
      localMethod.setAccessible(true);
      localMethod.invoke(this.g, new Object[0]);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.w
 * JD-Core Version:    0.6.2
 */