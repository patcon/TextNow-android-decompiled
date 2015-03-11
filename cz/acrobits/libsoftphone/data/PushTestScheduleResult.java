package cz.acrobits.libsoftphone.data;

public enum PushTestScheduleResult
{
  static
  {
    PushNotEnabled = new PushTestScheduleResult("PushNotEnabled", 1);
    NoPushToken = new PushTestScheduleResult("NoPushToken", 2);
    Timeout = new PushTestScheduleResult("Timeout", 3);
    Failure = new PushTestScheduleResult("Failure", 4);
    PushTestScheduleResult[] arrayOfPushTestScheduleResult = new PushTestScheduleResult[5];
    arrayOfPushTestScheduleResult[0] = Success;
    arrayOfPushTestScheduleResult[1] = PushNotEnabled;
    arrayOfPushTestScheduleResult[2] = NoPushToken;
    arrayOfPushTestScheduleResult[3] = Timeout;
    arrayOfPushTestScheduleResult[4] = Failure;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.PushTestScheduleResult
 * JD-Core Version:    0.6.2
 */