package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar
{
  private long a = -1L;
  private boolean b = false;
  private boolean c = false;
  private boolean d = false;
  private final Runnable e = new Runnable()
  {
    public final void run()
    {
      ContentLoadingProgressBar.a(ContentLoadingProgressBar.this, false);
      ContentLoadingProgressBar.a(ContentLoadingProgressBar.this, -1L);
      ContentLoadingProgressBar.this.setVisibility(8);
    }
  };
  private final Runnable f = new Runnable()
  {
    public final void run()
    {
      ContentLoadingProgressBar.b(ContentLoadingProgressBar.this, false);
      if (!ContentLoadingProgressBar.a(ContentLoadingProgressBar.this))
      {
        ContentLoadingProgressBar.a(ContentLoadingProgressBar.this, System.currentTimeMillis());
        ContentLoadingProgressBar.this.setVisibility(0);
      }
    }
  };

  public ContentLoadingProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }

  private void a()
  {
    removeCallbacks(this.e);
    removeCallbacks(this.f);
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    a();
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.ContentLoadingProgressBar
 * JD-Core Version:    0.6.2
 */