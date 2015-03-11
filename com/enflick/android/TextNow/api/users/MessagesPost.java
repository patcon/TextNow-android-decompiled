package com.enflick.android.TextNow.api.users;

import android.content.Context;
import android.util.Log;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import java.nio.charset.Charset;
import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.StringBody;
import textnow.s.h;
import textnow.t.b;
import textnow.t.d;
import textnow.t.g;
import textnow.u.c;

@b(a="POST")
@d(a="users/{0}/messages")
@g(a="Ljava/util/HashMap;")
public class MessagesPost extends TNHttpCommand
{
  private static final String BOUNDARY = "OzdXgyWTpdjLPdkd";

  public MessagesPost(Context paramContext)
  {
    super(paramContext);
  }

  protected String getContentType()
  {
    if (((o)getRequest().b()).g == null)
      return super.getContentType();
    return "multipart/form-data;charset=utf-8;boundary=OzdXgyWTpdjLPdkd";
  }

  protected HttpEntity getEntityBody()
  {
    o localo = (o)getRequest().b();
    if (localo.g == null)
      return super.getEntityBody();
    try
    {
      MultipartEntity localMultipartEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE, "OzdXgyWTpdjLPdkd", Charset.defaultCharset());
      String str = localo.a();
      localMultipartEntity.addPart("json", new StringBody(str, Charset.defaultCharset()));
      ContentBody localContentBody = localo.g.b(this.mContext);
      if (localContentBody == null)
      {
        new StringBuilder().append("Can't get file: ").append(localo.g.a()).toString();
        return null;
      }
      localMultipartEntity.addPart("upload", localContentBody);
      new StringBuilder().append(getClass().getSimpleName()).append(" request body: ").append(str).toString();
      return localMultipartEntity;
    }
    catch (Exception localException)
    {
      Log.getStackTraceString(localException);
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.MessagesPost
 * JD-Core Version:    0.6.2
 */