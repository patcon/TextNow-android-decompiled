package cz.acrobits.libsoftphone.data;

public final class SMS$FetchConstraint
{
  public int limit = -1;
  public int messageId = 0;
  public SMS.OrderDirection orderDirection = SMS.OrderDirection.Descending;
  public String recipients;
  public long sentDateFrom = 0L;
  public long sentDateTo = 0L;
  public long startAt = 0L;
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.SMS.FetchConstraint
 * JD-Core Version:    0.6.2
 */