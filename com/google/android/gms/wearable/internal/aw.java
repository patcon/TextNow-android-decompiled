package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.e.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class aw extends e<af>
{
  private final ExecutorService aqA = Executors.newCachedThreadPool();
  private final HashMap<DataApi.DataListener, ax> avQ = new HashMap();
  private final HashMap<MessageApi.MessageListener, ax> avR = new HashMap();
  private final HashMap<NodeApi.NodeListener, ax> avS = new HashMap();

  public aw(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
  }

  private FutureTask<Boolean> a(final ParcelFileDescriptor paramParcelFileDescriptor, final byte[] paramArrayOfByte)
  {
    return new FutureTask(new Callable()
    {
      // ERROR //
      public Boolean qa()
      {
        // Byte code:
        //   0: ldc 39
        //   2: iconst_3
        //   3: invokestatic 45	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
        //   6: ifeq +26 -> 32
        //   9: new 47	java/lang/StringBuilder
        //   12: dup
        //   13: invokespecial 48	java/lang/StringBuilder:<init>	()V
        //   16: ldc 50
        //   18: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   21: aload_0
        //   22: getfield 24	com/google/android/gms/wearable/internal/aw$2:avU	Landroid/os/ParcelFileDescriptor;
        //   25: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   28: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   31: pop
        //   32: new 63	android/os/ParcelFileDescriptor$AutoCloseOutputStream
        //   35: dup
        //   36: aload_0
        //   37: getfield 24	com/google/android/gms/wearable/internal/aw$2:avU	Landroid/os/ParcelFileDescriptor;
        //   40: invokespecial 66	android/os/ParcelFileDescriptor$AutoCloseOutputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
        //   43: astore_1
        //   44: aload_1
        //   45: aload_0
        //   46: getfield 26	com/google/android/gms/wearable/internal/aw$2:CY	[B
        //   49: invokevirtual 70	android/os/ParcelFileDescriptor$AutoCloseOutputStream:write	([B)V
        //   52: aload_1
        //   53: invokevirtual 73	android/os/ParcelFileDescriptor$AutoCloseOutputStream:flush	()V
        //   56: ldc 39
        //   58: iconst_3
        //   59: invokestatic 45	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
        //   62: ifeq +26 -> 88
        //   65: new 47	java/lang/StringBuilder
        //   68: dup
        //   69: invokespecial 48	java/lang/StringBuilder:<init>	()V
        //   72: ldc 75
        //   74: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   77: aload_0
        //   78: getfield 24	com/google/android/gms/wearable/internal/aw$2:avU	Landroid/os/ParcelFileDescriptor;
        //   81: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   84: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   87: pop
        //   88: iconst_1
        //   89: invokestatic 81	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
        //   92: astore 9
        //   94: ldc 39
        //   96: iconst_3
        //   97: invokestatic 45	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
        //   100: ifeq +26 -> 126
        //   103: new 47	java/lang/StringBuilder
        //   106: dup
        //   107: invokespecial 48	java/lang/StringBuilder:<init>	()V
        //   110: ldc 83
        //   112: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   115: aload_0
        //   116: getfield 24	com/google/android/gms/wearable/internal/aw$2:avU	Landroid/os/ParcelFileDescriptor;
        //   119: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   122: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   125: pop
        //   126: aload_1
        //   127: invokevirtual 86	android/os/ParcelFileDescriptor$AutoCloseOutputStream:close	()V
        //   130: aload 9
        //   132: areturn
        //   133: astore 5
        //   135: new 47	java/lang/StringBuilder
        //   138: dup
        //   139: invokespecial 48	java/lang/StringBuilder:<init>	()V
        //   142: ldc 88
        //   144: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   147: aload_0
        //   148: getfield 24	com/google/android/gms/wearable/internal/aw$2:avU	Landroid/os/ParcelFileDescriptor;
        //   151: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   154: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   157: pop
        //   158: ldc 39
        //   160: iconst_3
        //   161: invokestatic 45	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
        //   164: ifeq +26 -> 190
        //   167: new 47	java/lang/StringBuilder
        //   170: dup
        //   171: invokespecial 48	java/lang/StringBuilder:<init>	()V
        //   174: ldc 83
        //   176: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: aload_0
        //   180: getfield 24	com/google/android/gms/wearable/internal/aw$2:avU	Landroid/os/ParcelFileDescriptor;
        //   183: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   186: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   189: pop
        //   190: aload_1
        //   191: invokevirtual 86	android/os/ParcelFileDescriptor$AutoCloseOutputStream:close	()V
        //   194: iconst_0
        //   195: invokestatic 81	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
        //   198: areturn
        //   199: astore_2
        //   200: ldc 39
        //   202: iconst_3
        //   203: invokestatic 45	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
        //   206: ifeq +26 -> 232
        //   209: new 47	java/lang/StringBuilder
        //   212: dup
        //   213: invokespecial 48	java/lang/StringBuilder:<init>	()V
        //   216: ldc 83
        //   218: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: aload_0
        //   222: getfield 24	com/google/android/gms/wearable/internal/aw$2:avU	Landroid/os/ParcelFileDescriptor;
        //   225: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   228: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   231: pop
        //   232: aload_1
        //   233: invokevirtual 86	android/os/ParcelFileDescriptor$AutoCloseOutputStream:close	()V
        //   236: aload_2
        //   237: athrow
        //   238: astore_3
        //   239: goto -3 -> 236
        //   242: astore 7
        //   244: goto -50 -> 194
        //   247: astore 10
        //   249: aload 9
        //   251: areturn
        //
        // Exception table:
        //   from	to	target	type
        //   44	88	133	java/io/IOException
        //   88	94	133	java/io/IOException
        //   44	88	199	finally
        //   88	94	199	finally
        //   135	158	199	finally
        //   200	232	238	java/io/IOException
        //   232	236	238	java/io/IOException
        //   158	190	242	java/io/IOException
        //   190	194	242	java/io/IOException
        //   94	126	247	java/io/IOException
        //   126	130	247	java/io/IOException
      }
    });
  }

  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    if (Log.isLoggable("WearableClient", 2))
      new StringBuilder().append("onPostInitHandler: statusCode ").append(paramInt).toString();
    a local1;
    af localaf;
    if (paramInt == 0)
      try
      {
        local1 = new a()
        {
          public void a(Status paramAnonymousStatus)
          {
          }
        };
        if (Log.isLoggable("WearableClient", 2))
          new StringBuilder().append("onPostInitHandler: service ").append(paramIBinder).toString();
        localaf = af.a.bT(paramIBinder);
        Iterator localIterator1 = this.avQ.entrySet().iterator();
        while (localIterator1.hasNext())
        {
          Map.Entry localEntry3 = (Map.Entry)localIterator1.next();
          if (Log.isLoggable("WearableClient", 2))
            new StringBuilder().append("onPostInitHandler: adding Data listener ").append(localEntry3.getValue()).toString();
          localaf.a(local1, new b((ax)localEntry3.getValue()));
        }
      }
      catch (RemoteException localRemoteException)
      {
      }
    while (true)
    {
      super.a(paramInt, paramIBinder, paramBundle);
      return;
      Iterator localIterator2 = this.avR.entrySet().iterator();
      while (localIterator2.hasNext())
      {
        Map.Entry localEntry2 = (Map.Entry)localIterator2.next();
        if (Log.isLoggable("WearableClient", 2))
          new StringBuilder().append("onPostInitHandler: adding Message listener ").append(localEntry2.getValue()).toString();
        localaf.a(local1, new b((ax)localEntry2.getValue()));
      }
      Iterator localIterator3 = this.avS.entrySet().iterator();
      while (localIterator3.hasNext())
      {
        Map.Entry localEntry1 = (Map.Entry)localIterator3.next();
        if (Log.isLoggable("WearableClient", 2))
          new StringBuilder().append("onPostInitHandler: adding Node listener ").append(localEntry1.getValue()).toString();
        localaf.a(local1, new b((ax)localEntry1.getValue()));
      }
    }
  }

  public void a(final BaseImplementation.b<DataApi.DataItemResult> paramb, Uri paramUri)
  {
    ((af)gS()).a(new a()
    {
      public void a(x paramAnonymousx)
      {
        paramb.b(new f.a(new Status(paramAnonymousx.statusCode), paramAnonymousx.avA));
      }
    }
    , paramUri);
  }

  public void a(final BaseImplementation.b<DataApi.GetFdForAssetResult> paramb, Asset paramAsset)
  {
    ((af)gS()).a(new a()
    {
      public void a(z paramAnonymousz)
      {
        paramb.b(new f.c(new Status(paramAnonymousz.statusCode), paramAnonymousz.avB));
      }
    }
    , paramAsset);
  }

  public void a(BaseImplementation.b<Status> paramb, DataApi.DataListener paramDataListener)
  {
    ae localae;
    synchronized (this.avQ)
    {
      localae = (ae)this.avQ.remove(paramDataListener);
      if (localae == null)
      {
        paramb.b(new Status(4002));
        return;
      }
    }
    a(paramb, localae);
  }

  public void a(final BaseImplementation.b<Status> paramb, final DataApi.DataListener paramDataListener, IntentFilter[] paramArrayOfIntentFilter)
  {
    ax localax = ax.a(paramDataListener, paramArrayOfIntentFilter);
    synchronized (this.avQ)
    {
      if (this.avQ.get(paramDataListener) != null)
      {
        paramb.b(new Status(4001));
        return;
      }
      this.avQ.put(paramDataListener, localax);
      ((af)gS()).a(new a()
      {
        public void a(Status paramAnonymousStatus)
        {
          if (!paramAnonymousStatus.isSuccess());
          synchronized (aw.b(aw.this))
          {
            aw.b(aw.this).remove(paramDataListener);
            paramb.b(paramAnonymousStatus);
            return;
          }
        }
      }
      , new b(localax));
      return;
    }
  }

  public void a(BaseImplementation.b<DataApi.GetFdForAssetResult> paramb, DataItemAsset paramDataItemAsset)
  {
    a(paramb, Asset.createFromRef(paramDataItemAsset.getId()));
  }

  public void a(BaseImplementation.b<Status> paramb, MessageApi.MessageListener paramMessageListener)
  {
    synchronized (this.avR)
    {
      ae localae = (ae)this.avR.remove(paramMessageListener);
      if (localae == null)
      {
        paramb.b(new Status(4002));
        return;
      }
      a(paramb, localae);
    }
  }

  public void a(final BaseImplementation.b<Status> paramb, final MessageApi.MessageListener paramMessageListener, IntentFilter[] paramArrayOfIntentFilter)
  {
    ax localax = ax.a(paramMessageListener, paramArrayOfIntentFilter);
    synchronized (this.avR)
    {
      if (this.avR.get(paramMessageListener) != null)
      {
        paramb.b(new Status(4001));
        return;
      }
      this.avR.put(paramMessageListener, localax);
      ((af)gS()).a(new a()
      {
        public void a(Status paramAnonymousStatus)
        {
          if (!paramAnonymousStatus.isSuccess());
          synchronized (aw.c(aw.this))
          {
            aw.c(aw.this).remove(paramMessageListener);
            paramb.b(paramAnonymousStatus);
            return;
          }
        }
      }
      , new b(localax));
      return;
    }
  }

  public void a(final BaseImplementation.b<Status> paramb, final NodeApi.NodeListener paramNodeListener)
  {
    ax localax = ax.a(paramNodeListener);
    synchronized (this.avS)
    {
      if (this.avS.get(paramNodeListener) != null)
      {
        paramb.b(new Status(4001));
        return;
      }
      this.avS.put(paramNodeListener, localax);
      ((af)gS()).a(new a()
      {
        public void a(Status paramAnonymousStatus)
        {
          if (!paramAnonymousStatus.isSuccess());
          synchronized (aw.d(aw.this))
          {
            aw.d(aw.this).remove(paramNodeListener);
            paramb.b(paramAnonymousStatus);
            return;
          }
        }
      }
      , new b(localax));
      return;
    }
  }

  public void a(BaseImplementation.b<DataApi.DataItemResult> paramb, PutDataRequest paramPutDataRequest)
  {
    Iterator localIterator1 = paramPutDataRequest.getAssets().entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Asset localAsset2 = (Asset)((Map.Entry)localIterator1.next()).getValue();
      if ((localAsset2.getData() == null) && (localAsset2.getDigest() == null) && (localAsset2.getFd() == null) && (localAsset2.getUri() == null))
        throw new IllegalArgumentException("Put for " + paramPutDataRequest.getUri() + " contains invalid asset: " + localAsset2);
    }
    PutDataRequest localPutDataRequest = PutDataRequest.k(paramPutDataRequest.getUri());
    localPutDataRequest.setData(paramPutDataRequest.getData());
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator2 = paramPutDataRequest.getAssets().entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator2.next();
      Asset localAsset1 = (Asset)localEntry.getValue();
      if (localAsset1.getData() == null)
        localPutDataRequest.putAsset((String)localEntry.getKey(), (Asset)localEntry.getValue());
      else
        try
        {
          ParcelFileDescriptor[] arrayOfParcelFileDescriptor = ParcelFileDescriptor.createPipe();
          if (Log.isLoggable("WearableClient", 3))
            new StringBuilder().append("processAssets: replacing data with FD in asset: ").append(localAsset1).append(" read:").append(arrayOfParcelFileDescriptor[0]).append(" write:").append(arrayOfParcelFileDescriptor[1]).toString();
          localPutDataRequest.putAsset((String)localEntry.getKey(), Asset.createFromFd(arrayOfParcelFileDescriptor[0]));
          FutureTask localFutureTask = a(arrayOfParcelFileDescriptor[1], localAsset1.getData());
          localArrayList.add(localFutureTask);
          this.aqA.submit(localFutureTask);
        }
        catch (IOException localIOException)
        {
          throw new IllegalStateException("Unable to create ParcelFileDescriptor for asset in request: " + paramPutDataRequest, localIOException);
        }
    }
    try
    {
      ((af)gS()).a(new aw.a(paramb, localArrayList), localPutDataRequest);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      throw new IllegalStateException("Unable to putDataItem: " + paramPutDataRequest, localNullPointerException);
    }
  }

  public void a(final BaseImplementation.b<Status> paramb, ae paramae)
  {
    ((af)gS()).a(new a()
    {
      public void a(Status paramAnonymousStatus)
      {
        paramb.b(paramAnonymousStatus);
      }
    }
    , new aq(paramae));
  }

  public void a(final BaseImplementation.b<MessageApi.SendMessageResult> paramb, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    ((af)gS()).a(new a()
    {
      public void a(as paramAnonymousas)
      {
        paramb.b(new ag.a(new Status(paramAnonymousas.statusCode), paramAnonymousas.avO));
      }
    }
    , paramString1, paramString2, paramArrayOfByte);
  }

  protected void a(l paraml, e.e parame)
  {
    paraml.e(parame, 6171000, getContext().getPackageName());
  }

  public void b(final BaseImplementation.b<DataItemBuffer> paramb, Uri paramUri)
  {
    ((af)gS()).b(new a()
    {
      public void aa(DataHolder paramAnonymousDataHolder)
      {
        paramb.b(new DataItemBuffer(paramAnonymousDataHolder));
      }
    }
    , paramUri);
  }

  public void b(BaseImplementation.b<Status> paramb, NodeApi.NodeListener paramNodeListener)
  {
    synchronized (this.avS)
    {
      ae localae = (ae)this.avS.remove(paramNodeListener);
      if (localae == null)
      {
        paramb.b(new Status(4002));
        return;
      }
      a(paramb, localae);
    }
  }

  protected af bU(IBinder paramIBinder)
  {
    return af.a.bT(paramIBinder);
  }

  public void c(final BaseImplementation.b<DataApi.DeleteDataItemsResult> paramb, Uri paramUri)
  {
    ((af)gS()).c(new a()
    {
      public void a(p paramAnonymousp)
      {
        paramb.b(new f.b(new Status(paramAnonymousp.statusCode), paramAnonymousp.avw));
      }
    }
    , paramUri);
  }

  public void disconnect()
  {
    super.disconnect();
    this.avQ.clear();
    this.avR.clear();
    this.avS.clear();
  }

  protected String getServiceDescriptor()
  {
    return "com.google.android.gms.wearable.internal.IWearableService";
  }

  protected String getStartServiceAction()
  {
    return "com.google.android.gms.wearable.BIND";
  }

  public void o(final BaseImplementation.b<DataItemBuffer> paramb)
  {
    ((af)gS()).b(new a()
    {
      public void aa(DataHolder paramAnonymousDataHolder)
      {
        paramb.b(new DataItemBuffer(paramAnonymousDataHolder));
      }
    });
  }

  public void p(final BaseImplementation.b<NodeApi.GetLocalNodeResult> paramb)
  {
    ((af)gS()).c(new a()
    {
      public void a(ab paramAnonymousab)
      {
        paramb.b(new aj.b(new Status(paramAnonymousab.statusCode), paramAnonymousab.avC));
      }
    });
  }

  public void q(final BaseImplementation.b<NodeApi.GetConnectedNodesResult> paramb)
  {
    ((af)gS()).d(new a()
    {
      public void a(v paramAnonymousv)
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll(paramAnonymousv.avz);
        paramb.b(new aj.a(new Status(paramAnonymousv.statusCode), localArrayList));
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.aw
 * JD-Core Version:    0.6.2
 */