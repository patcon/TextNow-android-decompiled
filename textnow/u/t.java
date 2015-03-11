package textnow.u;

import java.io.File;
import java.io.FileNotFoundException;

public final class t
{
  private File a;
  private int b;

  public t(File paramFile, int paramInt)
  {
    if (paramFile == null)
      throw new NullPointerException("file cannot be null");
    if (!paramFile.exists())
      throw new FileNotFoundException("File " + paramFile.getAbsolutePath() + " does not exist");
    if (paramFile.isDirectory())
      throw new IllegalArgumentException("File " + paramFile.getAbsolutePath() + " should  be a file");
    if (paramInt <= 0)
      throw new IllegalArgumentException("Voicemail length must be > 0 seconds");
    this.a = paramFile;
    this.b = paramInt;
  }

  public final File a()
  {
    return this.a;
  }

  public final int b()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.u.t
 * JD-Core Version:    0.6.2
 */