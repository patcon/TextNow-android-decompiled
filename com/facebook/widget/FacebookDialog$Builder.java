package com.facebook.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.NativeAppCallAttachmentStore;
import com.facebook.NativeAppCallContentProvider;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.DialogFeatureConfig;
import com.facebook.internal.Validate;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public abstract class FacebookDialog$Builder<CONCRETE extends Builder<?>>
{
  protected final Activity activity;
  protected final FacebookDialog.PendingCall appCall;
  protected final String applicationId;
  protected String applicationName;
  protected Fragment fragment;
  protected HashMap<String, File> imageAttachmentFiles = new HashMap();
  protected HashMap<String, Bitmap> imageAttachments = new HashMap();

  public FacebookDialog$Builder(Activity paramActivity)
  {
    Validate.notNull(paramActivity, "activity");
    this.activity = paramActivity;
    this.applicationId = Utility.getMetadataApplicationId(paramActivity);
    this.appCall = new FacebookDialog.PendingCall(64207);
  }

  protected CONCRETE addImageAttachment(String paramString, Bitmap paramBitmap)
  {
    this.imageAttachments.put(paramString, paramBitmap);
    return this;
  }

  protected CONCRETE addImageAttachment(String paramString, File paramFile)
  {
    this.imageAttachmentFiles.put(paramString, paramFile);
    return this;
  }

  protected List<String> addImageAttachmentFiles(Collection<File> paramCollection)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      File localFile = (File)localIterator.next();
      String str = UUID.randomUUID().toString();
      addImageAttachment(str, localFile);
      localArrayList.add(NativeAppCallContentProvider.getAttachmentUrl(this.applicationId, this.appCall.getCallId(), str));
    }
    return localArrayList;
  }

  protected List<String> addImageAttachments(Collection<Bitmap> paramCollection)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      Bitmap localBitmap = (Bitmap)localIterator.next();
      String str = UUID.randomUUID().toString();
      addImageAttachment(str, localBitmap);
      localArrayList.add(NativeAppCallContentProvider.getAttachmentUrl(this.applicationId, this.appCall.getCallId(), str));
    }
    return localArrayList;
  }

  public FacebookDialog build()
  {
    validate();
    String str = FacebookDialog.access$100(getDialogFeatures());
    int i = FacebookDialog.access$300(this.activity, str, FacebookDialog.access$200(this.applicationId, str, getDialogFeatures()));
    if (NativeProtocol.isVersionCompatibleWithBucketedIntent(i));
    Intent localIntent;
    for (Bundle localBundle = getMethodArguments(); ; localBundle = setBundleExtras(new Bundle()))
    {
      localIntent = NativeProtocol.createPlatformActivityIntent(this.activity, this.appCall.getCallId().toString(), str, i, this.applicationName, localBundle);
      if (localIntent != null)
        break;
      FacebookDialog.access$500(this.activity, this.fragment, FacebookDialog.access$400(str, localBundle.containsKey("com.facebook.platform.extra.PHOTOS")), "Failed");
      throw new FacebookException("Unable to create Intent; this likely means the Facebook app is not installed.");
    }
    FacebookDialog.PendingCall.access$600(this.appCall, localIntent);
    return new FacebookDialog(this.activity, this.fragment, this.appCall, getOnPresentCallback(), null);
  }

  public boolean canPresent()
  {
    return FacebookDialog.access$800(this.activity, getDialogFeatures());
  }

  protected abstract EnumSet<? extends FacebookDialog.DialogFeature> getDialogFeatures();

  List<String> getImageAttachmentNames()
  {
    return new ArrayList(this.imageAttachments.keySet());
  }

  protected abstract Bundle getMethodArguments();

  FacebookDialog.OnPresentCallback getOnPresentCallback()
  {
    return new FacebookDialog.OnPresentCallback()
    {
      public void onPresent(Context paramAnonymousContext)
      {
        if ((FacebookDialog.Builder.this.imageAttachments != null) && (FacebookDialog.Builder.this.imageAttachments.size() > 0))
          FacebookDialog.access$900().addAttachmentsForCall(paramAnonymousContext, FacebookDialog.Builder.this.appCall.getCallId(), FacebookDialog.Builder.this.imageAttachments);
        if ((FacebookDialog.Builder.this.imageAttachmentFiles != null) && (FacebookDialog.Builder.this.imageAttachmentFiles.size() > 0))
          FacebookDialog.access$900().addAttachmentFilesForCall(paramAnonymousContext, FacebookDialog.Builder.this.appCall.getCallId(), FacebookDialog.Builder.this.imageAttachmentFiles);
      }
    };
  }

  protected String getWebFallbackUrlInternal()
  {
    Iterator localIterator = getDialogFeatures().iterator();
    String str2;
    String str1;
    if (localIterator.hasNext())
    {
      FacebookDialog.DialogFeature localDialogFeature = (FacebookDialog.DialogFeature)localIterator.next();
      str2 = localDialogFeature.name();
      str1 = localDialogFeature.getAction();
    }
    while (true)
    {
      Utility.DialogFeatureConfig localDialogFeatureConfig = Utility.getDialogFeatureConfig(this.applicationId, str1, str2);
      Uri localUri;
      if (localDialogFeatureConfig != null)
      {
        localUri = localDialogFeatureConfig.getFallbackUrl();
        if (localUri != null)
          break label76;
      }
      label76: Bundle localBundle2;
      do
      {
        return null;
        Bundle localBundle1 = getMethodArguments();
        int i = NativeProtocol.getLatestKnownVersion();
        localBundle2 = ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(this.activity, this.appCall.getCallId().toString(), i, this.applicationName, localBundle1);
      }
      while (localBundle2 == null);
      if (localUri.isRelative())
        localUri = Utility.buildUri(ServerProtocol.getDialogAuthority(), localUri.toString(), localBundle2);
      return localUri.toString();
      str1 = null;
      str2 = null;
    }
  }

  protected void putExtra(Bundle paramBundle, String paramString1, String paramString2)
  {
    if (paramString2 != null)
      paramBundle.putString(paramString1, paramString2);
  }

  public CONCRETE setApplicationName(String paramString)
  {
    this.applicationName = paramString;
    return this;
  }

  protected Bundle setBundleExtras(Bundle paramBundle)
  {
    return paramBundle;
  }

  public CONCRETE setFragment(Fragment paramFragment)
  {
    this.fragment = paramFragment;
    return this;
  }

  public CONCRETE setRequestCode(int paramInt)
  {
    FacebookDialog.PendingCall.access$000(this.appCall, paramInt);
    return this;
  }

  void validate()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.Builder
 * JD-Core Version:    0.6.2
 */