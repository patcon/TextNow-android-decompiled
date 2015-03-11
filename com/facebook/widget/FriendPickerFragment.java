package com.facebook.widget;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookException;
import com.facebook.Request;
import com.facebook.Session;
import com.facebook.android.R.drawable;
import com.facebook.android.R.layout;
import com.facebook.android.R.string;
import com.facebook.android.R.styleable;
import com.facebook.model.GraphUser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FriendPickerFragment extends PickerFragment<GraphUser>
{
  public static final String FRIEND_PICKER_TYPE_KEY = "com.facebook.widget.FriendPickerFragment.FriendPickerType";
  private static final String ID = "id";
  public static final String MULTI_SELECT_BUNDLE_KEY = "com.facebook.widget.FriendPickerFragment.MultiSelect";
  private static final String NAME = "name";
  public static final String USER_ID_BUNDLE_KEY = "com.facebook.widget.FriendPickerFragment.UserId";
  private FriendPickerFragment.FriendPickerType friendPickerType = FriendPickerFragment.FriendPickerType.FRIENDS;
  private boolean multiSelect = true;
  private List<String> preSelectedFriendIds = new ArrayList();
  private String userId;

  public FriendPickerFragment()
  {
    this(null);
  }

  @SuppressLint({"ValidFragment"})
  public FriendPickerFragment(Bundle paramBundle)
  {
    super(GraphUser.class, R.layout.com_facebook_friendpickerfragment, paramBundle);
    setFriendPickerSettingsFromBundle(paramBundle);
  }

  private Request createRequest(String paramString, Set<String> paramSet, Session paramSession)
  {
    Request localRequest = Request.newGraphPathRequest(paramSession, paramString + this.friendPickerType.getRequestPath(), null);
    HashSet localHashSet = new HashSet(paramSet);
    localHashSet.addAll(Arrays.asList(new String[] { "id", "name" }));
    String str = this.adapter.getPictureFieldSpecifier();
    if (str != null)
      localHashSet.add(str);
    Bundle localBundle = localRequest.getParameters();
    localBundle.putString("fields", TextUtils.join(",", localHashSet));
    localRequest.setParameters(localBundle);
    return localRequest;
  }

  private void setFriendPickerSettingsFromBundle(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("com.facebook.widget.FriendPickerFragment.UserId"))
        setUserId(paramBundle.getString("com.facebook.widget.FriendPickerFragment.UserId"));
      setMultiSelect(paramBundle.getBoolean("com.facebook.widget.FriendPickerFragment.MultiSelect", this.multiSelect));
      if (!paramBundle.containsKey("com.facebook.widget.FriendPickerFragment.FriendPickerType"));
    }
    try
    {
      this.friendPickerType = FriendPickerFragment.FriendPickerType.valueOf(paramBundle.getString("com.facebook.widget.FriendPickerFragment.FriendPickerType"));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  PickerFragment<GraphUser>.PickerFragmentAdapter<GraphUser> createAdapter()
  {
    // Byte code:
    //   0: new 175	com/facebook/widget/FriendPickerFragment$1
    //   3: dup
    //   4: aload_0
    //   5: aload_0
    //   6: invokevirtual 179	com/facebook/widget/FriendPickerFragment:getActivity	()Landroid/support/v4/app/k;
    //   9: invokespecial 182	com/facebook/widget/FriendPickerFragment$1:<init>	(Lcom/facebook/widget/FriendPickerFragment;Landroid/content/Context;)V
    //   12: astore_1
    //   13: aload_1
    //   14: iconst_1
    //   15: invokevirtual 187	com/facebook/widget/PickerFragment$PickerFragmentAdapter:setShowCheckbox	(Z)V
    //   18: aload_1
    //   19: aload_0
    //   20: invokevirtual 191	com/facebook/widget/FriendPickerFragment:getShowPictures	()Z
    //   23: invokevirtual 194	com/facebook/widget/PickerFragment$PickerFragmentAdapter:setShowPicture	(Z)V
    //   26: aload_1
    //   27: iconst_1
    //   28: anewarray 97	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: ldc 18
    //   35: aastore
    //   36: invokestatic 103	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   39: invokevirtual 198	com/facebook/widget/PickerFragment$PickerFragmentAdapter:setSortFields	(Ljava/util/List;)V
    //   42: aload_1
    //   43: ldc 18
    //   45: invokevirtual 201	com/facebook/widget/PickerFragment$PickerFragmentAdapter:setGroupByField	(Ljava/lang/String;)V
    //   48: aload_1
    //   49: areturn
  }

  PickerFragment<GraphUser>.LoadingStrategy createLoadingStrategy()
  {
    return new FriendPickerFragment.ImmediateLoadingStrategy(this, null);
  }

  PickerFragment<GraphUser>.SelectionStrategy createSelectionStrategy()
  {
    if (this.multiSelect)
      return new PickerFragment.MultiSelectionStrategy(this);
    return new PickerFragment.SingleSelectionStrategy(this);
  }

  String getDefaultTitleText()
  {
    return getString(R.string.com_facebook_choose_friends);
  }

  public boolean getMultiSelect()
  {
    return this.multiSelect;
  }

  Request getRequestForLoadData(Session paramSession)
  {
    if (this.adapter == null)
      throw new FacebookException("Can't issue requests until Fragment has been created.");
    if (this.userId != null);
    for (String str = this.userId; ; str = "me")
      return createRequest(str, this.extraFields, paramSession);
  }

  public List<GraphUser> getSelection()
  {
    return getSelectedGraphObjects();
  }

  public String getUserId()
  {
    return this.userId;
  }

  public void loadData(boolean paramBoolean)
  {
    super.loadData(paramBoolean);
    setSelectedGraphObjects(this.preSelectedFriendIds);
  }

  void logAppEvents(boolean paramBoolean)
  {
    AppEventsLogger localAppEventsLogger = AppEventsLogger.newLogger(getActivity(), getSession());
    Bundle localBundle = new Bundle();
    if (paramBoolean);
    for (String str = "Completed"; ; str = "Unknown")
    {
      localBundle.putString("fb_dialog_outcome", str);
      localBundle.putInt("num_friends_picked", getSelection().size());
      localAppEventsLogger.logSdkEvent("fb_friend_picker_usage", null, localBundle);
      return;
    }
  }

  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    TypedArray localTypedArray = paramActivity.obtainStyledAttributes(paramAttributeSet, R.styleable.com_facebook_friend_picker_fragment);
    setMultiSelect(localTypedArray.getBoolean(R.styleable.com_facebook_friend_picker_fragment_multi_select, this.multiSelect));
    localTypedArray.recycle();
  }

  void saveSettingsToBundle(Bundle paramBundle)
  {
    super.saveSettingsToBundle(paramBundle);
    paramBundle.putString("com.facebook.widget.FriendPickerFragment.UserId", this.userId);
    paramBundle.putBoolean("com.facebook.widget.FriendPickerFragment.MultiSelect", this.multiSelect);
  }

  public void setFriendPickerType(FriendPickerFragment.FriendPickerType paramFriendPickerType)
  {
    this.friendPickerType = paramFriendPickerType;
  }

  public void setMultiSelect(boolean paramBoolean)
  {
    if (this.multiSelect != paramBoolean)
    {
      this.multiSelect = paramBoolean;
      setSelectionStrategy(createSelectionStrategy());
    }
  }

  public void setSelection(List<GraphUser> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((GraphUser)localIterator.next()).getId());
    setSelectionByIds(localArrayList);
  }

  public void setSelection(GraphUser[] paramArrayOfGraphUser)
  {
    setSelection(Arrays.asList(paramArrayOfGraphUser));
  }

  public void setSelectionByIds(List<String> paramList)
  {
    this.preSelectedFriendIds.addAll(paramList);
  }

  public void setSelectionByIds(String[] paramArrayOfString)
  {
    setSelectionByIds(Arrays.asList(paramArrayOfString));
  }

  public void setSettingsFromBundle(Bundle paramBundle)
  {
    super.setSettingsFromBundle(paramBundle);
    setFriendPickerSettingsFromBundle(paramBundle);
  }

  public void setUserId(String paramString)
  {
    this.userId = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.FriendPickerFragment
 * JD-Core Version:    0.6.2
 */