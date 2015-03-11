package com.enflick.android.TextNow.push;

import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerBase;

public class TNADMMessageHandler extends ADMMessageHandlerBase
{
  private static final String TAG = "TNADMMessageHandler";

  public TNADMMessageHandler()
  {
    super(TNADMMessageHandler.class.getName());
  }

  public TNADMMessageHandler(String paramString)
  {
    super(paramString);
  }

  protected void onMessage(Intent paramIntent)
  {
    new PushMessageHandler().onMessage(paramIntent, this);
  }

  protected void onRegistered(String paramString)
  {
    new StringBuilder().append("TNADMMessageHandler:onRegistered regId = ").append(paramString).toString();
    PushMessageHandler.registerWithServer(this, paramString);
  }

  protected void onRegistrationError(String paramString)
  {
    new StringBuilder().append("TNADMMessageHandler:onRegistrationError ").append(paramString).toString();
  }

  protected void onUnregistered(String paramString)
  {
    PushMessageHandler.unregisterWithServer(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.push.TNADMMessageHandler
 * JD-Core Version:    0.6.2
 */