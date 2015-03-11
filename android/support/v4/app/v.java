package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class v extends Activity
{
  static final String FRAGMENTS_TAG = "android:support:fragments";
  private static final int HONEYCOMB = 11;
  static final int MSG_REALLY_STOPPED = 1;
  static final int MSG_RESUME_PENDING = 2;
  private static final String TAG = "FragmentActivity";
  textnow.e.l<String, ai> mAllLoaderManagers;
  boolean mCheckedForLoaderManager;
  final x mContainer = new x()
  {
    public final View a(int paramAnonymousInt)
    {
      return v.this.findViewById(paramAnonymousInt);
    }

    public final boolean a()
    {
      Window localWindow = v.this.getWindow();
      return (localWindow != null) && (localWindow.peekDecorView() != null);
    }
  };
  boolean mCreated;
  final z mFragments = new z();
  final Handler mHandler = new Handler()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default:
        super.handleMessage(paramAnonymousMessage);
      case 1:
        do
          return;
        while (!v.this.mStopped);
        v.this.doReallyStop(false);
        return;
      case 2:
      }
      v.this.onResumeFragments();
      v.this.mFragments.f();
    }
  };
  ai mLoaderManager;
  boolean mLoadersStarted;
  boolean mOptionsMenuInvalidated;
  boolean mReallyStopped;
  boolean mResumed;
  boolean mRetaining;
  boolean mStopped;

  private void dumpViewHierarchy(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null)
      paramPrintWriter.println("null");
    while (true)
    {
      return;
      paramPrintWriter.println(viewToString(paramView));
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int i = localViewGroup.getChildCount();
        if (i > 0)
        {
          String str = paramString + "  ";
          for (int j = 0; j < i; j++)
            dumpViewHierarchy(str, paramPrintWriter, localViewGroup.getChildAt(j));
        }
      }
    }
  }

  private static String viewToString(View paramView)
  {
    char c1 = 'F';
    char c2 = '.';
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramView.getClass().getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    localStringBuilder.append(' ');
    switch (paramView.getVisibility())
    {
    default:
      localStringBuilder.append(c2);
    case 0:
    case 4:
    case 8:
    }
    while (true)
    {
      char c3;
      label108: char c4;
      label126: char c5;
      label143: char c6;
      label161: char c7;
      label179: char c8;
      label197: char c9;
      label215: label236: char c10;
      label253: int i;
      Resources localResources;
      if (paramView.isFocusable())
      {
        c3 = c1;
        localStringBuilder.append(c3);
        if (!paramView.isEnabled())
          break label533;
        c4 = 'E';
        localStringBuilder.append(c4);
        if (!paramView.willNotDraw())
          break label539;
        c5 = c2;
        localStringBuilder.append(c5);
        if (!paramView.isHorizontalScrollBarEnabled())
          break label546;
        c6 = 'H';
        localStringBuilder.append(c6);
        if (!paramView.isVerticalScrollBarEnabled())
          break label552;
        c7 = 'V';
        localStringBuilder.append(c7);
        if (!paramView.isClickable())
          break label558;
        c8 = 'C';
        localStringBuilder.append(c8);
        if (!paramView.isLongClickable())
          break label564;
        c9 = 'L';
        localStringBuilder.append(c9);
        localStringBuilder.append(' ');
        if (!paramView.isFocused())
          break label570;
        localStringBuilder.append(c1);
        if (!paramView.isSelected())
          break label575;
        c10 = 'S';
        localStringBuilder.append(c10);
        if (paramView.isPressed())
          c2 = 'P';
        localStringBuilder.append(c2);
        localStringBuilder.append(' ');
        localStringBuilder.append(paramView.getLeft());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getTop());
        localStringBuilder.append('-');
        localStringBuilder.append(paramView.getRight());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getBottom());
        i = paramView.getId();
        if (i != -1)
        {
          localStringBuilder.append(" #");
          localStringBuilder.append(Integer.toHexString(i));
          localResources = paramView.getResources();
          if ((i != 0) && (localResources != null))
            switch (0xFF000000 & i)
            {
            default:
            case 2130706432:
            case 16777216:
            }
        }
      }
      try
      {
        String str1 = localResources.getResourcePackageName(i);
        while (true)
        {
          String str2 = localResources.getResourceTypeName(i);
          String str3 = localResources.getResourceEntryName(i);
          localStringBuilder.append(" ");
          localStringBuilder.append(str1);
          localStringBuilder.append(":");
          localStringBuilder.append(str2);
          localStringBuilder.append("/");
          localStringBuilder.append(str3);
          label485: localStringBuilder.append("}");
          return localStringBuilder.toString();
          localStringBuilder.append('V');
          break;
          localStringBuilder.append('I');
          break;
          localStringBuilder.append('G');
          break;
          c3 = c2;
          break label108;
          label533: c4 = c2;
          break label126;
          label539: c5 = 'D';
          break label143;
          label546: c6 = c2;
          break label161;
          label552: c7 = c2;
          break label179;
          label558: c8 = c2;
          break label197;
          label564: c9 = c2;
          break label215;
          label570: c1 = c2;
          break label236;
          label575: c10 = c2;
          break label253;
          str1 = "app";
          continue;
          str1 = "android";
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        break label485;
      }
    }
  }

  void doReallyStop(boolean paramBoolean)
  {
    if (!this.mReallyStopped)
    {
      this.mReallyStopped = true;
      this.mRetaining = paramBoolean;
      this.mHandler.removeMessages(1);
      onReallyStop();
    }
  }

  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.mCreated);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.mResumed);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.mStopped);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.mReallyStopped);
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.mLoadersStarted);
    if (this.mLoaderManager != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.mLoaderManager)));
      paramPrintWriter.println(":");
      this.mLoaderManager.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.mFragments.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    dumpViewHierarchy(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }

  public Object getLastCustomNonConfigurationInstance()
  {
    w localw = (w)getLastNonConfigurationInstance();
    if (localw != null)
      return localw.b;
    return null;
  }

  ai getLoaderManager(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.mAllLoaderManagers == null)
      this.mAllLoaderManagers = new textnow.e.l();
    ai localai = (ai)this.mAllLoaderManagers.get(paramString);
    if (localai == null)
    {
      if (paramBoolean2)
      {
        localai = new ai(paramString, this, paramBoolean1);
        this.mAllLoaderManagers.put(paramString, localai);
      }
      return localai;
    }
    localai.a(this);
    return localai;
  }

  public y getSupportFragmentManager()
  {
    return this.mFragments;
  }

  public ag getSupportLoaderManager()
  {
    if (this.mLoaderManager != null)
      return this.mLoaderManager;
    this.mCheckedForLoaderManager = true;
    this.mLoaderManager = getLoaderManager("(root)", this.mLoadersStarted, true);
    return this.mLoaderManager;
  }

  void invalidateSupportFragment(String paramString)
  {
    if (this.mAllLoaderManagers != null)
    {
      ai localai = (ai)this.mAllLoaderManagers.get(paramString);
      if ((localai != null) && (!localai.g))
      {
        localai.h();
        this.mAllLoaderManagers.remove(paramString);
      }
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.mFragments.i();
    int i = paramInt1 >> 16;
    if (i != 0)
    {
      int j = i - 1;
      if ((this.mFragments.f == null) || (j < 0) || (j >= this.mFragments.f.size()))
      {
        new StringBuilder().append("Activity result fragment index out of range: 0x").append(Integer.toHexString(paramInt1)).toString();
        return;
      }
      Fragment localFragment = (Fragment)this.mFragments.f.get(j);
      if (localFragment == null)
      {
        new StringBuilder().append("Activity result no fragment exists for index: 0x").append(Integer.toHexString(paramInt1)).toString();
        return;
      }
      localFragment.onActivityResult(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onAttachFragment(Fragment paramFragment)
  {
  }

  public void onBackPressed()
  {
    if (!this.mFragments.d())
      supportFinishAfterTransition();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.mFragments.a(paramConfiguration);
  }

  protected void onCreate(Bundle paramBundle)
  {
    this.mFragments.a(this, this.mContainer, null);
    if (getLayoutInflater().getFactory() == null)
      getLayoutInflater().setFactory(this);
    super.onCreate(paramBundle);
    w localw = (w)getLastNonConfigurationInstance();
    if (localw != null)
      this.mAllLoaderManagers = localw.e;
    Parcelable localParcelable;
    z localz;
    if (paramBundle != null)
    {
      localParcelable = paramBundle.getParcelable("android:support:fragments");
      localz = this.mFragments;
      if (localw == null)
        break label99;
    }
    label99: for (ArrayList localArrayList = localw.d; ; localArrayList = null)
    {
      localz.a(localParcelable, localArrayList);
      this.mFragments.j();
      return;
    }
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool = super.onCreatePanelMenu(paramInt, paramMenu) | this.mFragments.a(paramMenu, getMenuInflater());
      if (Build.VERSION.SDK_INT >= 11)
        return bool;
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }

  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView;
    if (!"fragment".equals(paramString))
      localView = super.onCreateView(paramString, paramContext, paramAttributeSet);
    do
    {
      return localView;
      localView = this.mFragments.onCreateView(paramString, paramContext, paramAttributeSet);
    }
    while (localView != null);
    return super.onCreateView(paramString, paramContext, paramAttributeSet);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    doReallyStop(false);
    this.mFragments.r();
    if (this.mLoaderManager != null)
      this.mLoaderManager.h();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    this.mFragments.s();
  }

  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      return true;
    switch (paramInt)
    {
    default:
      return false;
    case 0:
      return this.mFragments.a(paramMenuItem);
    case 6:
    }
    return this.mFragments.b(paramMenuItem);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.mFragments.i();
  }

  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.mFragments.b(paramMenu);
    }
  }

  protected void onPause()
  {
    super.onPause();
    this.mResumed = false;
    if (this.mHandler.hasMessages(2))
    {
      this.mHandler.removeMessages(2);
      onResumeFragments();
    }
    this.mFragments.n();
  }

  protected void onPostResume()
  {
    super.onPostResume();
    this.mHandler.removeMessages(2);
    onResumeFragments();
    this.mFragments.f();
  }

  protected boolean onPrepareOptionsPanel(View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(0, paramView, paramMenu);
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.mOptionsMenuInvalidated)
      {
        this.mOptionsMenuInvalidated = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      return onPrepareOptionsPanel(paramView, paramMenu) | this.mFragments.a(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }

  void onReallyStop()
  {
    if (this.mLoadersStarted)
    {
      this.mLoadersStarted = false;
      if (this.mLoaderManager != null)
      {
        if (this.mRetaining)
          break label41;
        this.mLoaderManager.c();
      }
    }
    while (true)
    {
      this.mFragments.p();
      return;
      label41: this.mLoaderManager.d();
    }
  }

  protected void onResume()
  {
    super.onResume();
    this.mHandler.sendEmptyMessage(2);
    this.mResumed = true;
    this.mFragments.f();
  }

  protected void onResumeFragments()
  {
    this.mFragments.m();
  }

  public Object onRetainCustomNonConfigurationInstance()
  {
    return null;
  }

  public final Object onRetainNonConfigurationInstance()
  {
    int i = 0;
    if (this.mStopped)
      doReallyStop(true);
    Object localObject = onRetainCustomNonConfigurationInstance();
    ArrayList localArrayList = this.mFragments.g();
    int j;
    if (this.mAllLoaderManagers != null)
    {
      int k = this.mAllLoaderManagers.size();
      ai[] arrayOfai = new ai[k];
      for (int m = k - 1; m >= 0; m--)
        arrayOfai[m] = ((ai)this.mAllLoaderManagers.c(m));
      j = 0;
      if (i < k)
      {
        ai localai = arrayOfai[i];
        if (localai.g)
          j = 1;
        while (true)
        {
          i++;
          break;
          localai.h();
          this.mAllLoaderManagers.remove(localai.d);
        }
      }
    }
    else
    {
      j = 0;
    }
    if ((localArrayList == null) && (j == 0) && (localObject == null))
      return null;
    w localw = new w();
    localw.a = null;
    localw.b = localObject;
    localw.c = null;
    localw.d = localArrayList;
    localw.e = this.mAllLoaderManagers;
    return localw;
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Parcelable localParcelable = this.mFragments.h();
    if (localParcelable != null)
      paramBundle.putParcelable("android:support:fragments", localParcelable);
  }

  protected void onStart()
  {
    super.onStart();
    this.mStopped = false;
    this.mReallyStopped = false;
    this.mHandler.removeMessages(1);
    if (!this.mCreated)
    {
      this.mCreated = true;
      this.mFragments.k();
    }
    this.mFragments.i();
    this.mFragments.f();
    if (!this.mLoadersStarted)
    {
      this.mLoadersStarted = true;
      if (this.mLoaderManager == null)
        break label146;
      this.mLoaderManager.b();
    }
    int i;
    ai[] arrayOfai;
    while (true)
    {
      this.mCheckedForLoaderManager = true;
      this.mFragments.l();
      if (this.mAllLoaderManagers == null)
        return;
      i = this.mAllLoaderManagers.size();
      arrayOfai = new ai[i];
      for (int j = i - 1; j >= 0; j--)
        arrayOfai[j] = ((ai)this.mAllLoaderManagers.c(j));
      label146: if (!this.mCheckedForLoaderManager)
      {
        this.mLoaderManager = getLoaderManager("(root)", this.mLoadersStarted, false);
        if ((this.mLoaderManager != null) && (!this.mLoaderManager.f))
          this.mLoaderManager.b();
      }
    }
    for (int k = 0; k < i; k++)
    {
      ai localai = arrayOfai[k];
      localai.e();
      localai.g();
    }
  }

  protected void onStop()
  {
    super.onStop();
    this.mStopped = true;
    this.mHandler.sendEmptyMessage(1);
    this.mFragments.o();
  }

  public void setEnterSharedElementCallback(cc paramcc)
  {
    l.a(this, paramcc);
  }

  public void setExitSharedElementCallback(cc paramcc)
  {
    l.b(this, paramcc);
  }

  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((paramInt != -1) && ((0xFFFF0000 & paramInt) != 0))
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    super.startActivityForResult(paramIntent, paramInt);
  }

  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    if (paramInt == -1)
    {
      super.startActivityForResult(paramIntent, -1);
      return;
    }
    if ((0xFFFF0000 & paramInt) != 0)
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    super.startActivityForResult(paramIntent, (1 + paramFragment.mIndex << 16) + (0xFFFF & paramInt));
  }

  public void supportFinishAfterTransition()
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      finishAfterTransition();
      return;
    }
    finish();
  }

  public void supportInvalidateOptionsMenu()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      invalidateOptionsMenu();
      return;
    }
    this.mOptionsMenuInvalidated = true;
  }

  public void supportPostponeEnterTransition()
  {
    if (Build.VERSION.SDK_INT >= 21)
      postponeEnterTransition();
  }

  public void supportStartPostponedEnterTransition()
  {
    if (Build.VERSION.SDK_INT >= 21)
      startPostponedEnterTransition();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.v
 * JD-Core Version:    0.6.2
 */