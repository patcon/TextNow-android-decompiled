package cz.acrobits.libsoftphone;

import cz.acrobits.ali.XMLTree;

public final class Instance$NumberRewriting
{
  public static native String[] getABMatchingNumbers(String paramString);

  public static native XMLTree getABMatchingRules();

  public static native XMLTree getRewriterRules(String paramString);

  public static native Instance.NumberRewriting.Result rewrite(String paramString1, String paramString2);

  public static native boolean setABMatchingRules(XMLTree paramXMLTree);

  public static native boolean setRewriterRules(String paramString, XMLTree paramXMLTree);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Instance.NumberRewriting
 * JD-Core Version:    0.6.2
 */