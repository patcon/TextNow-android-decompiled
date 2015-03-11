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
import android.preference.enflick.preferences.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import textnow.z.u;

public abstract class ac extends av
{
  protected View a;
  protected int b;
  private PreferenceManager f;
  private Handler g = new Handler()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default:
        return;
      case 0:
      }
      ac.a(ac.this);
    }
  };
  private ListView h;
  private int i;

  private void a()
  {
    if (this.g.hasMessages(0))
      return;
    this.g.obtainMessage(0).sendToTarget();
  }

  private void a(Preference paramPreference)
  {
    a(paramPreference, null);
    if ((paramPreference instanceof PreferenceGroup))
    {
      PreferenceGroup localPreferenceGroup = (PreferenceGroup)paramPreference;
      for (int j = 0; j < localPreferenceGroup.getPreferenceCount(); j++)
        a(localPreferenceGroup.getPreference(j));
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
      arrayOfObject[0] = this.d;
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
    if (this.f == null)
      return null;
    return this.f.findPreference(paramCharSequence);
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
    int j = 0;
    if (!paramBoolean)
      a(paramPreference, null);
    if ((paramPreference instanceof PreferenceGroup))
    {
      PreferenceGroup localPreferenceGroup = (PreferenceGroup)paramPreference;
      while (j < localPreferenceGroup.getPreferenceCount())
      {
        a(localPreferenceGroup.getPreference(j), paramBoolean, paramInt, paramString);
        j++;
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
    return this.f;
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
    //   7: ldc 144
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
    //   23: ldc 146
    //   25: aload_3
    //   26: invokevirtual 150	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   29: astore 4
    //   31: aload 4
    //   33: iconst_1
    //   34: invokevirtual 153	java/lang/reflect/Method:setAccessible	(Z)V
    //   37: aload_0
    //   38: getfield 111	com/enflick/android/TextNow/activities/ac:f	Landroid/preference/PreferenceManager;
    //   41: astore 5
    //   43: iconst_3
    //   44: anewarray 97	java/lang/Object
    //   47: astore 6
    //   49: aload 6
    //   51: iconst_0
    //   52: aload_0
    //   53: getfield 100	com/enflick/android/TextNow/activities/ac:d	Lcom/enflick/android/TextNow/activities/MainActivity;
    //   56: aastore
    //   57: aload 6
    //   59: iconst_1
    //   60: iload_1
    //   61: invokestatic 104	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   64: aastore
    //   65: aload 6
    //   67: iconst_2
    //   68: aload_0
    //   69: invokevirtual 61	com/enflick/android/TextNow/activities/ac:c	()Landroid/preference/PreferenceScreen;
    //   72: aastore
    //   73: aload 4
    //   75: aload 5
    //   77: aload 6
    //   79: invokevirtual 157	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   82: checkcast 65	android/preference/PreferenceScreen
    //   85: astore 7
    //   87: ldc 85
    //   89: ldc 159
    //   91: iconst_1
    //   92: anewarray 75	java/lang/Class
    //   95: dup
    //   96: iconst_0
    //   97: ldc 65
    //   99: aastore
    //   100: invokevirtual 150	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   103: astore 13
    //   105: aload 13
    //   107: iconst_1
    //   108: invokevirtual 153	java/lang/reflect/Method:setAccessible	(Z)V
    //   111: aload 13
    //   113: aload_0
    //   114: getfield 111	com/enflick/android/TextNow/activities/ac:f	Landroid/preference/PreferenceManager;
    //   117: iconst_1
    //   118: anewarray 97	java/lang/Object
    //   121: dup
    //   122: iconst_0
    //   123: aload 7
    //   125: aastore
    //   126: invokevirtual 157	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   129: checkcast 161	java/lang/Boolean
    //   132: invokevirtual 165	java/lang/Boolean:booleanValue	()Z
    //   135: ifeq +12 -> 147
    //   138: aload 7
    //   140: ifnull +7 -> 147
    //   143: aload_0
    //   144: invokespecial 167	com/enflick/android/TextNow/activities/ac:a	()V
    //   147: getstatic 173	android/os/Build:MODEL	Ljava/lang/String;
    //   150: ldc 175
    //   152: invokevirtual 181	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   155: ifne +14 -> 169
    //   158: getstatic 173	android/os/Build:MODEL	Ljava/lang/String;
    //   161: ldc 183
    //   163: invokevirtual 181	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   166: ifeq +93 -> 259
    //   169: getstatic 188	android/os/Build$VERSION:SDK_INT	I
    //   172: bipush 10
    //   174: if_icmpgt +85 -> 259
    //   177: iconst_0
    //   178: istore 9
    //   180: iload 9
    //   182: aload 7
    //   184: invokevirtual 189	android/preference/PreferenceScreen:getPreferenceCount	()I
    //   187: if_icmpge +72 -> 259
    //   190: aload 7
    //   192: iload 9
    //   194: invokevirtual 190	android/preference/PreferenceScreen:getPreference	(I)Landroid/preference/Preference;
    //   197: astore 10
    //   199: aload 10
    //   201: instanceof 192
    //   204: ifeq +41 -> 245
    //   207: aload 10
    //   209: checkcast 192	android/preference/PreferenceCategory
    //   212: astore 11
    //   214: iconst_0
    //   215: istore 12
    //   217: iload 12
    //   219: aload 11
    //   221: invokevirtual 193	android/preference/PreferenceCategory:getPreferenceCount	()I
    //   224: if_icmpge +28 -> 252
    //   227: aload 11
    //   229: iload 12
    //   231: invokevirtual 194	android/preference/PreferenceCategory:getPreference	(I)Landroid/preference/Preference;
    //   234: ldc 195
    //   236: invokevirtual 198	android/preference/Preference:setLayoutResource	(I)V
    //   239: iinc 12 1
    //   242: goto -25 -> 217
    //   245: aload 10
    //   247: ldc 195
    //   249: invokevirtual 198	android/preference/Preference:setLayoutResource	(I)V
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
      PreferenceScreen localPreferenceScreen = (PreferenceScreen)localMethod.invoke(this.f, new Object[0]);
      return localPreferenceScreen;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public boolean o()
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
      PreferenceManager localPreferenceManager = this.f;
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
    this.f = d();
    this.a = LayoutInflater.from(this.d).inflate(2130903181, null);
    this.h = ((ListView)this.a.findViewById(16908298));
    this.h.setScrollBarStyle(0);
    if (paramBundle != null)
    {
      this.i = paramBundle.getInt("xml");
      b(this.i);
      a();
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    a();
    for (int j = 0; j < c().getPreferenceCount(); j++)
      a(c().getPreference(j));
    return this.a;
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.h = null;
    this.a = null;
    try
    {
      Method localMethod = PreferenceManager.class.getDeclaredMethod("dispatchActivityDestroy", new Class[0]);
      localMethod.setAccessible(true);
      localMethod.invoke(this.f, new Object[0]);
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
      this.d.E();
      this.d.i(false);
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("xml", this.i);
    super.onSaveInstanceState(paramBundle);
  }

  public void onStart()
  {
    super.onStart();
    if (this.b == 0)
      new GetUserInfoTask(this.c.b()).b(this.d);
  }

  public void onStop()
  {
    super.onStop();
    try
    {
      Method localMethod = PreferenceManager.class.getDeclaredMethod("dispatchActivityStop", new Class[0]);
      localMethod.setAccessible(true);
      localMethod.invoke(this.f, new Object[0]);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ac
 * JD-Core Version:    0.6.2
 */