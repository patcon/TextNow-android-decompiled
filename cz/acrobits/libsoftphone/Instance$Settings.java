package cz.acrobits.libsoftphone;

import cz.acrobits.libsoftphone.data.Addon;

public final class Instance$Settings
{
  public static native void flushChanges();

  public static native String getAddonId(Addon paramAddon);

  public static String getAddonLicensing(Addon paramAddon)
  {
    return getAddonLicensing(getAddonId(paramAddon));
  }

  public static native String getAddonLicensing(String paramString);

  public static native String getApplicationIdForShop();

  public static String getFullyQualifiedAddonId(Addon paramAddon)
  {
    return getFullyQualifiedAddonId(getAddonId(paramAddon));
  }

  public static native String getFullyQualifiedAddonId(String paramString);

  public static native String getPrivateValue(String paramString1, String paramString2);

  public static boolean isAddonEnabled(Addon paramAddon)
  {
    return isAddonEnabled(getAddonId(paramAddon));
  }

  public static native boolean isAddonEnabled(String paramString);

  public static void setAddonEnabled(Addon paramAddon, boolean paramBoolean)
  {
    setAddonEnabled(getAddonId(paramAddon), paramBoolean);
  }

  public static native void setAddonEnabled(String paramString, boolean paramBoolean);

  public static native void setPrivateValue(String paramString1, String paramString2, String paramString3);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Instance.Settings
 * JD-Core Version:    0.6.2
 */