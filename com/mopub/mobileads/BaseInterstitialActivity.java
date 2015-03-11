package com.mopub.mobileads;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Drawables;
import com.mopub.mobileads.util.Interstitials;

abstract class BaseInterstitialActivity extends Activity
{
  private static final float CLOSE_BUTTON_PADDING = 8.0F;
  private static final float CLOSE_BUTTON_SIZE_DP = 50.0F;
  private long mBroadcastIdentifier;
  private int mButtonPadding;
  private int mButtonSize;
  private ImageView mCloseButton;
  private View.OnClickListener mCloseOnClickListener;
  private RelativeLayout mLayout;

  private void createInterstitialCloseButton()
  {
    this.mCloseButton = new ImageButton(this);
    StateListDrawable localStateListDrawable = new StateListDrawable();
    localStateListDrawable.addState(new int[] { -16842919 }, Drawables.INTERSTITIAL_CLOSE_BUTTON_NORMAL.decodeImage(this));
    localStateListDrawable.addState(new int[] { 16842919 }, Drawables.INTERSTITIAL_CLOSE_BUTTON_PRESSED.decodeImage(this));
    this.mCloseButton.setImageDrawable(localStateListDrawable);
    this.mCloseButton.setBackgroundDrawable(null);
    this.mCloseButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        BaseInterstitialActivity.this.finish();
      }
    });
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(this.mButtonSize, this.mButtonSize);
    localLayoutParams.addRule(11);
    localLayoutParams.setMargins(this.mButtonPadding, 0, this.mButtonPadding, 0);
    this.mLayout.addView(this.mCloseButton, localLayoutParams);
  }

  void addCloseEventRegion()
  {
    int i = Dips.dipsToIntPixels(50.0F, this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(i, i);
    localLayoutParams.addRule(11);
    localLayoutParams.addRule(10);
    Interstitials.addCloseEventRegion(this.mLayout, localLayoutParams, this.mCloseOnClickListener);
  }

  protected AdConfiguration getAdConfiguration()
  {
    try
    {
      AdConfiguration localAdConfiguration = (AdConfiguration)getIntent().getSerializableExtra("Ad-Configuration");
      return localAdConfiguration;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    return null;
  }

  public abstract View getAdView();

  long getBroadcastIdentifier()
  {
    return this.mBroadcastIdentifier;
  }

  protected void hideInterstitialCloseButton()
  {
    this.mCloseButton.setVisibility(4);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    getWindow().addFlags(1024);
    this.mButtonSize = Dips.asIntPixels(50.0F, this);
    this.mButtonPadding = Dips.asIntPixels(8.0F, this);
    this.mCloseOnClickListener = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        BaseInterstitialActivity.this.finish();
      }
    };
    this.mLayout = new RelativeLayout(this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    this.mLayout.addView(getAdView(), localLayoutParams);
    setContentView(this.mLayout);
    AdConfiguration localAdConfiguration = getAdConfiguration();
    if (localAdConfiguration != null)
      this.mBroadcastIdentifier = localAdConfiguration.getBroadcastIdentifier();
    createInterstitialCloseButton();
  }

  protected void onDestroy()
  {
    this.mLayout.removeAllViews();
    super.onDestroy();
  }

  protected void showInterstitialCloseButton()
  {
    this.mCloseButton.setVisibility(0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.BaseInterstitialActivity
 * JD-Core Version:    0.6.2
 */