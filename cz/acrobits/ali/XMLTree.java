package cz.acrobits.ali;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class XMLTree extends PointerHolder
  implements Parcelable, Cloneable
{
  public static final XMLTree.ParcelableCreator CREATOR = new XMLTree.ParcelableCreator();

  public static native XMLTree create(String paramString);

  public static XMLTree create(String paramString1, String paramString2)
  {
    XMLTree localXMLTree = create(paramString1);
    localXMLTree.setValue(paramString2);
    return localXMLTree;
  }

  public static XMLTree fromBundle(String paramString, Bundle paramBundle)
  {
    Class[] arrayOfClass = { Bundle.class, [Ljava.lang.String.class, [Ljava.lang.Boolean.class, [Ljava.lang.Byte.class, [Ljava.lang.Character.class, [Ljava.lang.Double.class, [Ljava.lang.Float.class, [Ljava.lang.Integer.class, [Ljava.lang.Long.class, [Ljava.lang.Short.class };
    XMLTree localXMLTree = create(paramString);
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      int i = arrayOfClass.length;
      int j = 0;
      int k = 0;
      if (j < i)
      {
        Class localClass = arrayOfClass[j];
        label129: if (localClass.isInstance(localObject))
          localXMLTree.createChild(str, localClass.cast(localObject));
        for (int m = 1; ; m = k)
        {
          j++;
          k = m;
          break;
          localClass = localClass.getComponentType();
          if (localClass != null)
            break label129;
        }
      }
      if (k == 0)
        AndroidUtil.log("XMLTree", "WARNING: Unexpected object " + localObject.getClass().getName() + " in Bundle, skipped");
    }
    return localXMLTree;
  }

  public static native XMLTree load(String paramString);

  public static native XMLTree parse(String paramString);

  public final boolean addOrReplaceChild(XMLTree paramXMLTree)
  {
    boolean bool = removeChild(paramXMLTree.getName());
    setChild(paramXMLTree);
    return bool;
  }

  public final boolean addOrReplaceChild(String paramString1, String paramString2)
  {
    return addOrReplaceChild(create(paramString1, paramString2));
  }

  public final native XMLTree clone();

  public final XMLTree copyChild(XMLTree paramXMLTree)
  {
    return setChild(paramXMLTree.clone());
  }

  public final XMLTree createChild(String paramString)
  {
    return setChild(create(paramString));
  }

  public final XMLTree createChild(String paramString, Bundle paramBundle)
  {
    XMLTree localXMLTree = fromBundle(paramString, paramBundle);
    setChild(localXMLTree);
    return localXMLTree;
  }

  public final XMLTree createChild(String paramString, Boolean paramBoolean)
  {
    if (paramBoolean.booleanValue());
    for (String str = "0"; ; str = "1")
      return createChild(paramString, str);
  }

  public final <T> XMLTree createChild(String paramString, T paramT)
  {
    return createChild(paramString, paramT.toString());
  }

  public final XMLTree createChild(String paramString1, String paramString2)
  {
    XMLTree localXMLTree = createChild(paramString1);
    localXMLTree.setValue(paramString2);
    return localXMLTree;
  }

  public final <T> XMLTree[] createChildren(String paramString, AbstractCollection<T> paramAbstractCollection)
  {
    return createChildren(paramString, paramAbstractCollection.toArray());
  }

  public final <T> XMLTree[] createChildren(String paramString, T[] paramArrayOfT)
  {
    XMLTree[] arrayOfXMLTree = new XMLTree[paramArrayOfT.length];
    for (int i = 0; i < paramArrayOfT.length; i++)
      arrayOfXMLTree[i] = createChild(paramString, paramArrayOfT[i]);
    return arrayOfXMLTree;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final native String getAttribute(String paramString);

  public final native Map<String, String> getAttributes();

  public final native XMLTree getChild(String paramString);

  public final String getChildValue(String paramString)
  {
    XMLTree localXMLTree = getChild(paramString);
    if (localXMLTree == null)
      return null;
    return localXMLTree.getValue();
  }

  public final native XMLTree[] getChildren();

  public final native XMLTree getFirstChildAtPath(String paramString);

  public final native XMLTree getFirstChildWithAttribute(String paramString1, String paramString2, String paramString3);

  public final String getFirstValueAtPath(String paramString)
  {
    int i = paramString.indexOf('?');
    if (i >= 0);
    XMLTree localXMLTree;
    for (String str = paramString.substring(0, i); ; str = paramString)
    {
      localXMLTree = getFirstChildAtPath(str);
      if (localXMLTree != null)
        break;
      return null;
    }
    if (i < 0)
      return localXMLTree.getValue();
    return localXMLTree.getAttribute(paramString.substring(i + 1));
  }

  public final native String getName();

  public final XMLTree getRoot()
  {
    while (true)
    {
      if (isRoot())
        return this;
      this = (XMLTree)this.mOwner;
    }
  }

  public final native String getValue();

  public final boolean hasAttribute(String paramString)
  {
    return getAttribute(paramString) != null;
  }

  public final boolean hasAttributeWithValue(String paramString1, String paramString2)
  {
    String str = getAttribute(paramString1);
    return (str != null) && (str.equals(paramString2));
  }

  public final boolean isRoot()
  {
    return this.mOwner == null;
  }

  public final void removeAttribute(String paramString)
  {
    setAttribute(paramString, null);
  }

  public final native boolean removeChild(String paramString);

  public final native boolean save(String paramString);

  public final native void setAttribute(String paramString1, String paramString2);

  public final native XMLTree setChild(XMLTree paramXMLTree);

  public final void setChildValue(String paramString1, String paramString2)
  {
    XMLTree localXMLTree = getChild(paramString1);
    if (localXMLTree == null)
      localXMLTree = createChild(paramString1);
    localXMLTree.setValue(paramString2);
  }

  public final native void setValue(String paramString);

  public final native String toString();

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(toString());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.ali.XMLTree
 * JD-Core Version:    0.6.2
 */