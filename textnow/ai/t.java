package textnow.ai;

import java.io.Writer;

final class t extends Writer
{
  private final Appendable a;
  private final u b = new u();

  private t(Appendable paramAppendable)
  {
    this.a = paramAppendable;
  }

  public final void close()
  {
  }

  public final void flush()
  {
  }

  public final void write(int paramInt)
  {
    this.a.append((char)paramInt);
  }

  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.b.a = paramArrayOfChar;
    this.a.append(this.b, paramInt1, paramInt1 + paramInt2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ai.t
 * JD-Core Version:    0.6.2
 */