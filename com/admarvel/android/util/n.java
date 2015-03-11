package com.admarvel.android.util;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class n extends Animation
{
  private final float a;
  private final float b;
  private final float c;
  private final float d;
  private final float e;
  private final boolean f;
  private Camera g;

  public n(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, boolean paramBoolean)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
    this.e = paramFloat5;
    this.f = paramBoolean;
  }

  protected void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = this.a;
    float f2 = f1 + paramFloat * (this.b - f1);
    float f3 = this.c;
    float f4 = this.d;
    Camera localCamera = this.g;
    Matrix localMatrix = paramTransformation.getMatrix();
    localCamera.save();
    if (this.f)
      localCamera.translate(0.0F, 0.0F, paramFloat * this.e);
    while (true)
    {
      localCamera.rotateY(f2);
      localCamera.getMatrix(localMatrix);
      localCamera.restore();
      localMatrix.preTranslate(-f3, -f4);
      localMatrix.postTranslate(f3, f4);
      return;
      localCamera.translate(0.0F, 0.0F, this.e * (1.0F - paramFloat));
    }
  }

  public void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    this.g = new Camera();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.n
 * JD-Core Version:    0.6.2
 */