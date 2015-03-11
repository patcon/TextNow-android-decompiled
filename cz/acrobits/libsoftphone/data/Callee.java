package cz.acrobits.libsoftphone.data;

import cz.acrobits.ali.PointerHolder;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public final class Callee extends PointerHolder
  implements Externalizable
{
  private static final long serialVersionUID = 6307882129944593727L;

  public Callee()
  {
    set(null);
  }

  public Callee(String paramString)
  {
    set(paramString);
  }

  private native void set(String paramString);

  public final native String canonical();

  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Callee))
      return canonical().equals(((Callee)paramObject).canonical());
    return false;
  }

  public final native Callee.Area getArea();

  public final native Callee.Type getType();

  public final native String humanReadable();

  public final native boolean isEmpty();

  public final void readExternal(ObjectInput paramObjectInput)
  {
    set((String)paramObjectInput.readObject());
  }

  public final String toString()
  {
    return canonical();
  }

  public final void writeExternal(ObjectOutput paramObjectOutput)
  {
    paramObjectOutput.writeObject(toString());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.Callee
 * JD-Core Version:    0.6.2
 */