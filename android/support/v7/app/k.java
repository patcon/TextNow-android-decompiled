package android.support.v7.app;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

final class k
  implements Window.Callback
{
  final Window.Callback a;

  public k(j paramj, Window.Callback paramCallback)
  {
    this.a = paramCallback;
  }

  public final boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    return this.a.dispatchGenericMotionEvent(paramMotionEvent);
  }

  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return this.a.dispatchKeyEvent(paramKeyEvent);
  }

  public final boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    return this.a.dispatchKeyShortcutEvent(paramKeyEvent);
  }

  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return this.a.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.a.dispatchTouchEvent(paramMotionEvent);
  }

  public final boolean dispatchTrackballEvent(MotionEvent paramMotionEvent)
  {
    return this.a.dispatchTrackballEvent(paramMotionEvent);
  }

  public final void onActionModeFinished(ActionMode paramActionMode)
  {
    this.a.onActionModeFinished(paramActionMode);
    this.b.b(paramActionMode);
  }

  public final void onActionModeStarted(ActionMode paramActionMode)
  {
    this.a.onActionModeStarted(paramActionMode);
    this.b.a(paramActionMode);
  }

  public final void onAttachedToWindow()
  {
    this.a.onAttachedToWindow();
  }

  public final void onContentChanged()
  {
    this.a.onContentChanged();
  }

  public final boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return this.a.onCreatePanelMenu(paramInt, paramMenu);
  }

  public final View onCreatePanelView(int paramInt)
  {
    return this.a.onCreatePanelView(paramInt);
  }

  public final void onDetachedFromWindow()
  {
    this.a.onDetachedFromWindow();
  }

  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    return this.a.onMenuItemSelected(paramInt, paramMenuItem);
  }

  public final boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return this.a.onMenuOpened(paramInt, paramMenu);
  }

  public final void onPanelClosed(int paramInt, Menu paramMenu)
  {
    this.a.onPanelClosed(paramInt, paramMenu);
  }

  public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return this.a.onPreparePanel(paramInt, paramView, paramMenu);
  }

  public final boolean onSearchRequested()
  {
    return this.a.onSearchRequested();
  }

  public final void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    this.a.onWindowAttributesChanged(paramLayoutParams);
  }

  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    this.a.onWindowFocusChanged(paramBoolean);
  }

  public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return this.a.onWindowStartingActionMode(paramCallback);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.k
 * JD-Core Version:    0.6.2
 */