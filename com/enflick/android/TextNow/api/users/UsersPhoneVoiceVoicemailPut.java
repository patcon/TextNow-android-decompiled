package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import java.nio.charset.Charset;
import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import textnow.x.h;
import textnow.y.b;
import textnow.y.d;

@b(a="PUT")
@d(a="users/{0}/phone/voice/voicemail")
public class UsersPhoneVoiceVoicemailPut extends TNHttpCommand
{
  private static final String BOUNDARY = "OzdXgyWTpdjLPdkd";
  private static final String TAG = "UsersPhoneVoiceVoicemailPut";

  public UsersPhoneVoiceVoicemailPut(Context paramContext)
  {
    super(paramContext);
  }

  protected String getContentType()
  {
    if (((ae)getRequest().b()).c == null)
      return super.getContentType();
    return "multipart/form-data;boundary=OzdXgyWTpdjLPdkd";
  }

  protected HttpEntity getEntityBody()
  {
    ae localae = (ae)getRequest().b();
    if (localae.c == null)
      return super.getEntityBody();
    try
    {
      MultipartEntity localMultipartEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE, "OzdXgyWTpdjLPdkd", Charset.defaultCharset());
      String str = localae.a();
      localMultipartEntity.addPart("json", new StringBody(str, Charset.defaultCharset()));
      localMultipartEntity.addPart("upload", new FileBody(localae.c, "application/octet-stream"));
      new StringBuilder().append("Request body: ").append(str).toString();
      return localMultipartEntity;
    }
    catch (Exception localException)
    {
      localException.toString();
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.UsersPhoneVoiceVoicemailPut
 * JD-Core Version:    0.6.2
 */