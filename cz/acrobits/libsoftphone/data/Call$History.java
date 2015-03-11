package cz.acrobits.libsoftphone.data;

public final class Call$History
{
  public static native boolean deleteAllRecords();

  public static native boolean deleteMissedRecords();

  public static native boolean deleteRecord(long paramLong);

  public static native Call.History.Record[] getAllRecords();

  public static native Call.History.Record[] getChangedRecords();

  public static native Call.History.Record getRecord(long paramLong);

  public static native long getVersion();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.Call.History
 * JD-Core Version:    0.6.2
 */