package com.mopub.mobileads;

class MraidStateProperty extends MraidProperty
{
  private final MraidView.ViewState mViewState;

  MraidStateProperty(MraidView.ViewState paramViewState)
  {
    this.mViewState = paramViewState;
  }

  public static MraidStateProperty createWithViewState(MraidView.ViewState paramViewState)
  {
    return new MraidStateProperty(paramViewState);
  }

  public String toJsonPair()
  {
    return "state: '" + this.mViewState.toString().toLowerCase() + "'";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidStateProperty
 * JD-Core Version:    0.6.2
 */