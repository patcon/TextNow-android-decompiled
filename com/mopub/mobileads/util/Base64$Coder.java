package com.mopub.mobileads.util;

abstract class Base64$Coder
{
  public int op;
  public byte[] output;

  public abstract int maxOutputSize(int paramInt);

  public abstract boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.Base64.Coder
 * JD-Core Version:    0.6.2
 */