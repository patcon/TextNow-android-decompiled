package cz.acrobits.libsoftphone.data;

public class ModificationProps
{
  public static final int defaultCorePriority = 10;
  public static final int defaultExtProvPriority = 20;
  public static final int defaultGuiPriority = 30;
  public int mPriority;
  public ModificationProps.SourceTag mSourceTag;

  public ModificationProps()
  {
    this.mSourceTag = ModificationProps.SourceTag.Default;
    this.mPriority = 0;
  }

  public ModificationProps(ModificationProps.SourceTag paramSourceTag)
  {
    this.mSourceTag = paramSourceTag;
    switch (1.$SwitchMap$cz$acrobits$libsoftphone$data$ModificationProps$SourceTag[paramSourceTag.ordinal()])
    {
    default:
      return;
    case 1:
      this.mPriority = 0;
      return;
    case 2:
      this.mPriority = 30;
      return;
    case 3:
      this.mPriority = 10;
      return;
    case 4:
    }
    this.mPriority = 20;
  }

  public ModificationProps(ModificationProps.SourceTag paramSourceTag, int paramInt)
  {
    this.mSourceTag = paramSourceTag;
    this.mPriority = paramInt;
  }

  public static native ModificationProps.SourceTag fromString(String paramString);

  public static native String toString(ModificationProps.SourceTag paramSourceTag);

  public boolean ge(ModificationProps paramModificationProps)
  {
    return (this.mSourceTag == paramModificationProps.mSourceTag) || (paramModificationProps.mSourceTag == ModificationProps.SourceTag.Default) || (this.mPriority >= paramModificationProps.mPriority);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.ModificationProps
 * JD-Core Version:    0.6.2
 */