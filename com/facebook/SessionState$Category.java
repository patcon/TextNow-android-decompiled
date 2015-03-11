package com.facebook;

 enum SessionState$Category
{
  static
  {
    CLOSED_CATEGORY = new Category("CLOSED_CATEGORY", 2);
    Category[] arrayOfCategory = new Category[3];
    arrayOfCategory[0] = CREATED_CATEGORY;
    arrayOfCategory[1] = OPENED_CATEGORY;
    arrayOfCategory[2] = CLOSED_CATEGORY;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.SessionState.Category
 * JD-Core Version:    0.6.2
 */