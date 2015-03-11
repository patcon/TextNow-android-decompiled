package com.facebook.widget;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class PickerFragment$MultiSelectionStrategy extends PickerFragment.SelectionStrategy
{
  private Set<String> selectedIds = new HashSet();

  PickerFragment$MultiSelectionStrategy(PickerFragment paramPickerFragment)
  {
    super(paramPickerFragment);
  }

  public void clear()
  {
    this.selectedIds.clear();
  }

  public Collection<String> getSelectedIds()
  {
    return this.selectedIds;
  }

  boolean isEmpty()
  {
    return this.selectedIds.isEmpty();
  }

  boolean isSelected(String paramString)
  {
    return (paramString != null) && (this.selectedIds.contains(paramString));
  }

  void readSelectionFromBundle(Bundle paramBundle, String paramString)
  {
    if (paramBundle != null)
    {
      String str = paramBundle.getString(paramString);
      if (str != null)
      {
        String[] arrayOfString = TextUtils.split(str, ",");
        this.selectedIds.clear();
        Collections.addAll(this.selectedIds, arrayOfString);
      }
    }
  }

  void saveSelectionToBundle(Bundle paramBundle, String paramString)
  {
    if (!this.selectedIds.isEmpty())
      paramBundle.putString(paramString, TextUtils.join(",", this.selectedIds));
  }

  boolean shouldShowCheckBoxIfUnselected()
  {
    return true;
  }

  void toggleSelection(String paramString)
  {
    if (paramString != null)
    {
      if (this.selectedIds.contains(paramString))
        this.selectedIds.remove(paramString);
    }
    else
      return;
    this.selectedIds.add(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.PickerFragment.MultiSelectionStrategy
 * JD-Core Version:    0.6.2
 */