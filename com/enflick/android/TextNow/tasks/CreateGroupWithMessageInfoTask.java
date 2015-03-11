package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.responsemodel.Group;
import java.util.Map;

public class CreateGroupWithMessageInfoTask extends c
{
  private String d = null;
  private Map<String, Integer> e;
  private String f;
  private int g;
  private String h;
  private String i;

  public CreateGroupWithMessageInfoTask(String paramString1, Map<String, Integer> paramMap, String paramString2, int paramInt, String paramString3)
  {
    this.e = paramMap;
    this.f = paramString2;
    this.g = paramInt;
    this.h = paramString3;
  }

  public final String a()
  {
    return this.i;
  }

  public final String b()
  {
    return this.f;
  }

  public final String c()
  {
    return this.h;
  }

  public final String d()
  {
    return this.d;
  }

  public void run()
  {
    CreateGroupTask localCreateGroupTask = new CreateGroupTask(this.d, this.e);
    localCreateGroupTask.c(g());
    if ((!localCreateGroupTask.d_()) && (a(localCreateGroupTask.a())))
      return;
    Group localGroup = localCreateGroupTask.b();
    if (localGroup == null)
    {
      a(true);
      return;
    }
    this.i = localGroup.contact_value;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.CreateGroupWithMessageInfoTask
 * JD-Core Version:    0.6.2
 */