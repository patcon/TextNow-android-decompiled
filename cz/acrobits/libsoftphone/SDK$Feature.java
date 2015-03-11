package cz.acrobits.libsoftphone;

public enum SDK$Feature
{
  static
  {
    CallThrough = new Feature("CallThrough", 4);
    Messaging = new Feature("Messaging", 5);
    MultipleAccounts = new Feature("MultipleAccounts", 6);
    NumberRewriting = new Feature("NumberRewriting", 7);
    Provisioning = new Feature("Provisioning", 8);
    Push = new Feature("Push", 9);
    Record = new Feature("Record", 10);
    Security = new Feature("Security", 11);
    Security_ZRTP = new Feature("Security_ZRTP", 12);
    Video = new Feature("Video", 13);
    Voicemail = new Feature("Voicemail", 14);
    WebCallback = new Feature("WebCallback", 15);
    Feature[] arrayOfFeature = new Feature[16];
    arrayOfFeature[0] = AccountTemplates;
    arrayOfFeature[1] = Addons;
    arrayOfFeature[2] = Balance;
    arrayOfFeature[3] = Conference;
    arrayOfFeature[4] = CallThrough;
    arrayOfFeature[5] = Messaging;
    arrayOfFeature[6] = MultipleAccounts;
    arrayOfFeature[7] = NumberRewriting;
    arrayOfFeature[8] = Provisioning;
    arrayOfFeature[9] = Push;
    arrayOfFeature[10] = Record;
    arrayOfFeature[11] = Security;
    arrayOfFeature[12] = Security_ZRTP;
    arrayOfFeature[13] = Video;
    arrayOfFeature[14] = Voicemail;
    arrayOfFeature[15] = WebCallback;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.SDK.Feature
 * JD-Core Version:    0.6.2
 */