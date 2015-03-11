package com.facebook.model;

import java.util.Arrays;

public final class OpenGraphObject$Factory
{
  public static <T extends OpenGraphObject> T createForPost(Class<T> paramClass, String paramString)
  {
    return createForPost(paramClass, paramString, null, null, null, null);
  }

  public static <T extends OpenGraphObject> T createForPost(Class<T> paramClass, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    OpenGraphObject localOpenGraphObject = (OpenGraphObject)GraphObject.Factory.create(paramClass);
    if (paramString1 != null)
      localOpenGraphObject.setType(paramString1);
    if (paramString2 != null)
      localOpenGraphObject.setTitle(paramString2);
    if (paramString3 != null)
      localOpenGraphObject.setImageUrls(Arrays.asList(new String[] { paramString3 }));
    if (paramString4 != null)
      localOpenGraphObject.setUrl(paramString4);
    if (paramString5 != null)
      localOpenGraphObject.setDescription(paramString5);
    localOpenGraphObject.setCreateObject(true);
    localOpenGraphObject.setData(GraphObject.Factory.create());
    return localOpenGraphObject;
  }

  public static OpenGraphObject createForPost(String paramString)
  {
    return createForPost(OpenGraphObject.class, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.model.OpenGraphObject.Factory
 * JD-Core Version:    0.6.2
 */