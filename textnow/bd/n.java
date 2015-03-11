package textnow.bd;

abstract class n
{
  public abstract String a();

  public String toString()
  {
    String str = a();
    if (str != null)
      return str.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "");
    return "";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bd.n
 * JD-Core Version:    0.6.2
 */