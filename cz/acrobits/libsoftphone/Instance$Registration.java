package cz.acrobits.libsoftphone;

import cz.acrobits.ali.XMLTree;
import cz.acrobits.libsoftphone.data.Balance.Record;
import cz.acrobits.libsoftphone.data.ModificationProps;
import cz.acrobits.libsoftphone.data.RegistrationState;
import cz.acrobits.libsoftphone.data.Voicemail.Record;

public final class Instance$Registration
{
  public static native boolean accountReadyForCallThrough(String paramString);

  public static native boolean accountReadyForMessaging(String paramString);

  public static native boolean accountReadyForVideo(String paramString);

  public static native boolean accountReadyForWebCallback(String paramString);

  public static native boolean deleteAccount(String paramString);

  public static native void excludeNonStandardSipHeader(String paramString1, String paramString2, String paramString3, String paramString4);

  public static native XMLTree findAccount(String paramString);

  public static native XMLTree getAccount(int paramInt);

  public static native int getAccountCount();

  public static native String getAccountId(int paramInt);

  public static native Balance.Record getBalance(String paramString);

  public static native String getDefaultAccount();

  public static native String[] getDisabledAccountIds();

  public static native int[] getDisabledAccounts();

  public static native String[] getEnabledAccountIds();

  public static native int[] getEnabledAccounts();

  public static native String getIncomingCallsSingleValue(XMLTree paramXMLTree, ModificationProps paramModificationProps);

  public static native RegistrationState getRegistrationState(String paramString);

  public static native Voicemail.Record getVoicemail(String paramString);

  public static native void includeNonStandardSipHeader(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  public static native boolean isAccountEnabled(String paramString);

  public static native boolean isWebCallbackPossible(XMLTree paramXMLTree);

  public static native void moveAccount(int paramInt1, int paramInt2);

  public static native ModificationProps priorityForKey(XMLTree paramXMLTree, String paramString);

  public static String saveAccount(XMLTree paramXMLTree)
  {
    return saveAccount(paramXMLTree, false);
  }

  public static native String saveAccount(XMLTree paramXMLTree, boolean paramBoolean);

  public static native void setDefaultAccount(String paramString);

  public static native void setPriorityForKey(XMLTree paramXMLTree, String paramString, ModificationProps paramModificationProps);

  public static native boolean setupIncomingCallsFromSingleValue(String paramString, XMLTree paramXMLTree, ModificationProps paramModificationProps);

  public static native void unregister(String paramString);

  public static native void unregisterAll();

  public static native boolean updateAccountWithPriority(XMLTree paramXMLTree, String paramString1, String paramString2, ModificationProps paramModificationProps);

  public static void updateAll()
  {
    updateAll(false);
  }

  public static native void updateAll(boolean paramBoolean);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Instance.Registration
 * JD-Core Version:    0.6.2
 */