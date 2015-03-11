package com.enflick.android.TextNow.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.mopub.common.util.ResponseHeader;
import com.mopub.mobileads.MoPubView;
import java.util.Map;

public class TNMoPubView extends MoPubView
{
  private String a;

  public TNMoPubView(Context paramContext)
  {
    super(paramContext);
  }

  public TNMoPubView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(String paramString)
  {
    this.a = paramString;
  }

  protected void loadCustomEvent(Map<String, String> paramMap)
  {
    if (!TextUtils.isEmpty(this.a))
      paramMap.put(ResponseHeader.CUSTOM_EVENT_NAME.getKey(), this.a);
    super.loadCustomEvent(paramMap);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.TNMoPubView
 * JD-Core Version:    0.6.2
 */