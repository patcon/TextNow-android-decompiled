package cz.acrobits.util;

import cz.acrobits.ali.AndroidUtil;

public final class CpuFeatures
{
  public static final int ANDROID_CPU_ARM_FEATURE_ARMv7 = 1;
  public static final int ANDROID_CPU_ARM_FEATURE_LDREX_STREX = 8;
  public static final int ANDROID_CPU_ARM_FEATURE_NEON = 4;
  public static final int ANDROID_CPU_ARM_FEATURE_VFPv3 = 2;
  public static final int ANDROID_CPU_FAMILY_ARM = 1;
  public static final int ANDROID_CPU_FAMILY_UNKNOWN = 0;
  public static final int ANDROID_CPU_FAMILY_X86 = 2;

  static
  {
    AndroidUtil.log("CpuFeatures", "Loading library");
    System.loadLibrary("cpufeatures");
  }

  public static native int getCpuCount();

  public static native int getCpuFamily();

  public static native int getCpuFeatures();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.util.CpuFeatures
 * JD-Core Version:    0.6.2
 */