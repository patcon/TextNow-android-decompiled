package twitter4j;

import java.io.Serializable;

final class ExceptionDiagnosis
  implements Serializable
{
  private static final long serialVersionUID = 453958937114285988L;
  String hexString = "";
  int lineNumberHash;
  int stackLineHash;
  Throwable th;

  ExceptionDiagnosis(Throwable paramThrowable)
  {
    this(paramThrowable, new String[0]);
  }

  ExceptionDiagnosis(Throwable paramThrowable, String[] paramArrayOfString)
  {
    this.th = paramThrowable;
    StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
    this.stackLineHash = 0;
    this.lineNumberHash = 0;
    int i = -1 + arrayOfStackTraceElement.length;
    if (i >= 0)
    {
      StackTraceElement localStackTraceElement = arrayOfStackTraceElement[i];
      int j = paramArrayOfString.length;
      for (int k = 0; ; k++)
        if (k < j)
        {
          String str = paramArrayOfString[k];
          if (localStackTraceElement.getClassName().startsWith(str))
          {
            this.stackLineHash = (localStackTraceElement.getClassName().hashCode() + localStackTraceElement.getMethodName().hashCode() + 31 * this.stackLineHash);
            this.lineNumberHash = (31 * this.lineNumberHash + localStackTraceElement.getLineNumber());
          }
        }
        else
        {
          i--;
          break;
        }
    }
    this.hexString = (this.hexString + toHexString(this.stackLineHash) + "-" + toHexString(this.lineNumberHash));
    if (paramThrowable.getCause() != null)
      this.hexString = (this.hexString + " " + new ExceptionDiagnosis(paramThrowable.getCause(), paramArrayOfString).asHexString());
  }

  private String toHexString(int paramInt)
  {
    String str = "0000000" + Integer.toHexString(paramInt);
    return str.substring(-8 + str.length(), str.length());
  }

  final String asHexString()
  {
    return this.hexString;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    ExceptionDiagnosis localExceptionDiagnosis;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localExceptionDiagnosis = (ExceptionDiagnosis)paramObject;
      if (this.lineNumberHash != localExceptionDiagnosis.lineNumberHash)
        return false;
    }
    while (this.stackLineHash == localExceptionDiagnosis.stackLineHash);
    return false;
  }

  final int getLineNumberHash()
  {
    return this.lineNumberHash;
  }

  final String getLineNumberHashAsHex()
  {
    return toHexString(this.lineNumberHash);
  }

  final int getStackLineHash()
  {
    return this.stackLineHash;
  }

  final String getStackLineHashAsHex()
  {
    return toHexString(this.stackLineHash);
  }

  public final int hashCode()
  {
    return 31 * this.stackLineHash + this.lineNumberHash;
  }

  public final String toString()
  {
    return "ExceptionDiagnosis{stackLineHash=" + this.stackLineHash + ", lineNumberHash=" + this.lineNumberHash + '}';
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.ExceptionDiagnosis
 * JD-Core Version:    0.6.2
 */