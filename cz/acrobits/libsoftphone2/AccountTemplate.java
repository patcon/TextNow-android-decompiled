package cz.acrobits.libsoftphone2;

import cz.acrobits.ali.PointerHolder;
import cz.acrobits.ali.XMLTree;

public class AccountTemplate extends PointerHolder
{
  public static final String PLIST = "plist";

  public native void applyTemplate(XMLTree paramXMLTree);

  public native String base64EncodedTemplateSource();

  public native void canonizeValues(XMLTree paramXMLTree);

  public native XMLTree getNode(String paramString);

  public native XMLTree getNodeWithTag(String paramString1, String paramString2);

  public XMLTree getPlistWithTag(String paramString)
  {
    return getNodeWithTag("plist", paramString);
  }

  public native String validate(XMLTree paramXMLTree);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone2.AccountTemplate
 * JD-Core Version:    0.6.2
 */