package org.apache.http.entity.mime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Header
  implements Iterable<MinimalField>
{
  private final Map<String, List<MinimalField>> fieldMap = new HashMap();
  private final List<MinimalField> fields = new LinkedList();

  public void addField(MinimalField paramMinimalField)
  {
    if (paramMinimalField == null)
      return;
    String str = paramMinimalField.getName().toLowerCase(Locale.US);
    Object localObject = (List)this.fieldMap.get(str);
    if (localObject == null)
    {
      localObject = new LinkedList();
      this.fieldMap.put(str, localObject);
    }
    ((List)localObject).add(paramMinimalField);
    this.fields.add(paramMinimalField);
  }

  public MinimalField getField(String paramString)
  {
    if (paramString == null)
      return null;
    String str = paramString.toLowerCase(Locale.US);
    List localList = (List)this.fieldMap.get(str);
    if ((localList != null) && (!localList.isEmpty()))
      return (MinimalField)localList.get(0);
    return null;
  }

  public List<MinimalField> getFields()
  {
    return new ArrayList(this.fields);
  }

  public List<MinimalField> getFields(String paramString)
  {
    if (paramString == null)
      return null;
    String str = paramString.toLowerCase(Locale.US);
    List localList = (List)this.fieldMap.get(str);
    if ((localList == null) || (localList.isEmpty()))
      return Collections.emptyList();
    return new ArrayList(localList);
  }

  public Iterator<MinimalField> iterator()
  {
    return Collections.unmodifiableList(this.fields).iterator();
  }

  public int removeFields(String paramString)
  {
    if (paramString == null)
      return 0;
    String str = paramString.toLowerCase(Locale.US);
    List localList = (List)this.fieldMap.remove(str);
    if ((localList == null) || (localList.isEmpty()))
      return 0;
    this.fields.removeAll(localList);
    return localList.size();
  }

  public void setField(MinimalField paramMinimalField)
  {
    if (paramMinimalField == null)
      return;
    String str = paramMinimalField.getName().toLowerCase(Locale.US);
    List localList = (List)this.fieldMap.get(str);
    if ((localList == null) || (localList.isEmpty()))
    {
      addField(paramMinimalField);
      return;
    }
    localList.clear();
    localList.add(paramMinimalField);
    Iterator localIterator = this.fields.iterator();
    int i = 0;
    int j = -1;
    while (localIterator.hasNext())
    {
      if (((MinimalField)localIterator.next()).getName().equalsIgnoreCase(paramMinimalField.getName()))
      {
        localIterator.remove();
        if (j == -1)
          j = i;
      }
      i++;
    }
    this.fields.add(j, paramMinimalField);
  }

  public String toString()
  {
    return this.fields.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     org.apache.http.entity.mime.Header
 * JD-Core Version:    0.6.2
 */