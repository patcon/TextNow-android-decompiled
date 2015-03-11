package cz.acrobits.libsoftphone.data;

public enum SMS$Status
{
  static
  {
    SendFailed = new Status("SendFailed", 3);
    SendPartialSuccess = new Status("SendPartialSuccess", 4);
    SendSuccessful = new Status("SendSuccessful", 5);
    Status[] arrayOfStatus = new Status[6];
    arrayOfStatus[0] = Initial;
    arrayOfStatus[1] = Sending;
    arrayOfStatus[2] = SendingPartialSuccess;
    arrayOfStatus[3] = SendFailed;
    arrayOfStatus[4] = SendPartialSuccess;
    arrayOfStatus[5] = SendSuccessful;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.SMS.Status
 * JD-Core Version:    0.6.2
 */