package cz.acrobits.libsoftphone;

public enum Instance$Ringtones$Format
{
  public final String extension;

  static
  {
    CoreAudio = new Format("CoreAudio", 1, "caf");
    Format[] arrayOfFormat = new Format[2];
    arrayOfFormat[0] = WaveformAudio;
    arrayOfFormat[1] = CoreAudio;
  }

  private Instance$Ringtones$Format(String paramString)
  {
    this.extension = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Instance.Ringtones.Format
 * JD-Core Version:    0.6.2
 */