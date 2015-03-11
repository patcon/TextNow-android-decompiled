package cz.acrobits.libsoftphone;

import android.content.Context;
import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.ali.XMLTree;
import cz.acrobits.util.CpuFeatures;

public final class Instance
{
  public static String library = null;
  public static Preferences preferences = null;

  public static void init(Context paramContext)
  {
    init(paramContext, null, null);
  }

  public static void init(Context paramContext, XMLTree paramXMLTree)
  {
    init(paramContext, paramXMLTree, null);
  }

  public static void init(Context paramContext, XMLTree paramXMLTree, Class<? extends Preferences> paramClass)
  {
    loadLibrary(paramContext);
    init(paramXMLTree, paramClass);
  }

  public static void init(Context paramContext, Class<? extends Preferences> paramClass)
  {
    init(paramContext, null, paramClass);
  }

  private static native void init(XMLTree paramXMLTree, Class<? extends Preferences> paramClass);

  public static void loadLibrary(Context paramContext)
  {
    AndroidUtil.setContext(paramContext);
    if (library != null)
      return;
    System.loadLibrary("gnustl_shared");
    int i = CpuFeatures.getCpuFeatures();
    AndroidUtil.log("Library", "Loading library...");
    if ((i & 0x4) != 0);
    try
    {
      library = "softphone-neon";
      System.loadLibrary("softphone-neon");
      if (library != null);
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError2)
    {
      try
      {
        library = "softphone";
        System.loadLibrary("softphone");
        AndroidUtil.log("Library", "Loaded " + library);
        AndroidUtil.checkAllNativeClassesImplemented();
        return;
        localUnsatisfiedLinkError2 = localUnsatisfiedLinkError2;
        library = null;
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError1)
      {
        library = null;
        throw localUnsatisfiedLinkError1;
      }
    }
  }

  public static native void setObserver(Observer paramObserver);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Instance
 * JD-Core Version:    0.6.2
 */