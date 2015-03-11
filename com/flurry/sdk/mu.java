package com.flurry.sdk;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public abstract class mu extends mq
{
  protected final mv[] d;

  protected mu(mv parammv, mv[] paramArrayOfmv)
  {
    super(parammv);
    this.d = paramArrayOfmv;
  }

  protected mt a(int paramInt, mv parammv)
  {
    this.d[paramInt] = parammv;
    return c(paramInt);
  }

  protected sh a(qr paramqr, TypeVariable<?>[] paramArrayOfTypeVariable)
  {
    if ((paramArrayOfTypeVariable != null) && (paramArrayOfTypeVariable.length > 0))
    {
      paramqr = paramqr.a();
      int i = paramArrayOfTypeVariable.length;
      int j = 0;
      if (j < i)
      {
        TypeVariable<?> localTypeVariable = paramArrayOfTypeVariable[j];
        paramqr.b(localTypeVariable.getName());
        Type localType = localTypeVariable.getBounds()[0];
        if (localType == null);
        for (sh localsh = qs.b(); ; localsh = paramqr.a(localType))
        {
          paramqr.a(localTypeVariable.getName(), localsh);
          j++;
          break;
        }
      }
    }
    return paramqr.a(c());
  }

  public abstract Object a(Object paramObject);

  public abstract Object a(Object[] paramArrayOfObject);

  public final <A extends Annotation> A a(Class<A> paramClass)
  {
    return this.b.a(paramClass);
  }

  public final void a(int paramInt, Annotation paramAnnotation)
  {
    mv localmv = this.d[paramInt];
    if (localmv == null)
    {
      localmv = new mv();
      this.d[paramInt] = localmv;
    }
    localmv.b(paramAnnotation);
  }

  public final void a(Annotation paramAnnotation)
  {
    this.b.b(paramAnnotation);
  }

  public abstract Type b(int paramInt);

  public final void b(Annotation paramAnnotation)
  {
    this.b.a(paramAnnotation);
  }

  public final mt c(int paramInt)
  {
    return new mt(this, b(paramInt), this.d[paramInt], paramInt);
  }

  public abstract Object g();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mu
 * JD-Core Version:    0.6.2
 */