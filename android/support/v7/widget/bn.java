package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.widget.ah;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import textnow.g.b;

final class bn extends ah
  implements View.OnClickListener
{
  private SearchView j;
  private SearchableInfo k;
  private Context l;
  private WeakHashMap<String, Drawable.ConstantState> m;
  private boolean n;
  private int o;
  private ColorStateList p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;

  private Drawable a(ComponentName paramComponentName)
  {
    PackageManager localPackageManager = this.d.getPackageManager();
    ActivityInfo localActivityInfo;
    int i;
    try
    {
      localActivityInfo = localPackageManager.getActivityInfo(paramComponentName, 128);
      i = localActivityInfo.getIconResource();
      if (i == 0)
        return null;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localNameNotFoundException.toString();
      return null;
    }
    Drawable localDrawable = localPackageManager.getDrawable(paramComponentName.getPackageName(), i, localActivityInfo.applicationInfo);
    if (localDrawable == null)
    {
      new StringBuilder().append("Invalid icon resource ").append(i).append(" for ").append(paramComponentName.flattenToShortString()).toString();
      return null;
    }
    return localDrawable;
  }

  private Drawable a(Uri paramUri)
  {
    try
    {
      boolean bool = "android.resource".equals(paramUri.getScheme());
      if (bool)
        try
        {
          Drawable localDrawable2 = b(paramUri);
          return localDrawable2;
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          throw new FileNotFoundException("Resource does not exist: " + paramUri);
        }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      new StringBuilder().append("Icon not found: ").append(paramUri).append(", ").append(localFileNotFoundException.getMessage()).toString();
      return null;
    }
    InputStream localInputStream = this.l.getContentResolver().openInputStream(paramUri);
    if (localInputStream == null)
      throw new FileNotFoundException("Failed to open " + paramUri);
    try
    {
      Drawable localDrawable1 = Drawable.createFromStream(localInputStream, null);
      try
      {
        localInputStream.close();
        return localDrawable1;
      }
      catch (IOException localIOException2)
      {
        new StringBuilder().append("Error closing icon stream for ").append(paramUri).toString();
        return localDrawable1;
      }
    }
    finally
    {
    }
    try
    {
      localInputStream.close();
      throw localObject;
    }
    catch (IOException localIOException1)
    {
      while (true)
        new StringBuilder().append("Error closing icon stream for ").append(paramUri).toString();
    }
  }

  private Drawable a(String paramString)
  {
    Drawable localDrawable1;
    if ((paramString == null) || (paramString.length() == 0) || ("0".equals(paramString)))
      localDrawable1 = null;
    while (true)
    {
      return localDrawable1;
      try
      {
        int i = Integer.parseInt(paramString);
        String str = "android.resource://" + this.l.getPackageName() + "/" + i;
        localDrawable1 = b(str);
        if (localDrawable1 == null)
        {
          Drawable localDrawable3 = this.l.getResources().getDrawable(i);
          a(str, localDrawable3);
          return localDrawable3;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localDrawable1 = b(paramString);
        if (localDrawable1 == null)
        {
          Drawable localDrawable2 = a(Uri.parse(paramString));
          a(paramString, localDrawable2);
          return localDrawable2;
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        new StringBuilder().append("Icon resource not found: ").append(paramString).toString();
      }
    }
    return null;
  }

  private static String a(Cursor paramCursor, int paramInt)
  {
    if (paramInt == -1)
      return null;
    try
    {
      String str = paramCursor.getString(paramInt);
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String a(Cursor paramCursor, String paramString)
  {
    return a(paramCursor, paramCursor.getColumnIndex(paramString));
  }

  private static void a(ImageView paramImageView, Drawable paramDrawable, int paramInt)
  {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null)
    {
      paramImageView.setVisibility(paramInt);
      return;
    }
    paramImageView.setVisibility(0);
    paramDrawable.setVisible(false, false);
    paramDrawable.setVisible(true, false);
  }

  private static void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence))
    {
      paramTextView.setVisibility(8);
      return;
    }
    paramTextView.setVisibility(0);
  }

  private void a(String paramString, Drawable paramDrawable)
  {
    if (paramDrawable != null)
      this.m.put(paramString, paramDrawable.getConstantState());
  }

  private Drawable b(Uri paramUri)
  {
    String str = paramUri.getAuthority();
    if (TextUtils.isEmpty(str))
      throw new FileNotFoundException("No authority: " + paramUri);
    Resources localResources;
    List localList;
    try
    {
      localResources = this.d.getPackageManager().getResourcesForApplication(str);
      localList = paramUri.getPathSegments();
      if (localList == null)
        throw new FileNotFoundException("No path: " + paramUri);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new FileNotFoundException("No package found for authority: " + paramUri);
    }
    int i = localList.size();
    if (i == 1);
    int i1;
    while (true)
    {
      try
      {
        int i2 = Integer.parseInt((String)localList.get(0));
        i1 = i2;
        if (i1 != 0)
          break;
        throw new FileNotFoundException("No resource found for: " + paramUri);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new FileNotFoundException("Single path segment is not a resource ID: " + paramUri);
      }
      if (i == 2)
        i1 = localResources.getIdentifier((String)localList.get(1), (String)localList.get(0), str);
      else
        throw new FileNotFoundException("More than two path segments: " + paramUri);
    }
    return localResources.getDrawable(i1);
  }

  private Drawable b(String paramString)
  {
    Drawable.ConstantState localConstantState = (Drawable.ConstantState)this.m.get(paramString);
    if (localConstantState == null)
      return null;
    return localConstantState.newDrawable();
  }

  private static void d(Cursor paramCursor)
  {
    if (paramCursor != null);
    for (Bundle localBundle = paramCursor.getExtras(); ; localBundle = null)
    {
      if ((localBundle != null) && (localBundle.getBoolean("in_progress")));
      return;
    }
  }

  public final Cursor a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    for (String str1 = ""; (this.j.getVisibility() != 0) || (this.j.getWindowVisibility() != 0); str1 = paramCharSequence.toString())
      return null;
    try
    {
      SearchableInfo localSearchableInfo = this.k;
      Cursor localCursor;
      if (localSearchableInfo == null)
        localCursor = null;
      while (localCursor != null)
      {
        localCursor.getCount();
        return localCursor;
        String str2 = localSearchableInfo.getSuggestAuthority();
        if (str2 == null)
        {
          localCursor = null;
        }
        else
        {
          Uri.Builder localBuilder = new Uri.Builder().scheme("content").authority(str2).query("").fragment("");
          String str3 = localSearchableInfo.getSuggestPath();
          if (str3 != null)
            localBuilder.appendEncodedPath(str3);
          localBuilder.appendPath("search_suggest_query");
          String str4 = localSearchableInfo.getSuggestSelection();
          if (str4 != null);
          for (String[] arrayOfString = { str1 }; ; arrayOfString = null)
          {
            localBuilder.appendQueryParameter("limit", String.valueOf(50));
            Uri localUri = localBuilder.build();
            localCursor = this.d.getContentResolver().query(localUri, null, str4, arrayOfString, null);
            break;
            localBuilder.appendPath(str1);
          }
        }
      }
    }
    catch (RuntimeException localRuntimeException)
    {
    }
    return null;
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = super.a(paramContext, paramCursor, paramViewGroup);
    localView.setTag(new bo(localView));
    return localView;
  }

  public final void a(Cursor paramCursor)
  {
    if (this.n)
      if (paramCursor != null)
        paramCursor.close();
    while (true)
    {
      return;
      try
      {
        super.a(paramCursor);
        if (paramCursor != null)
        {
          this.q = paramCursor.getColumnIndex("suggest_text_1");
          this.r = paramCursor.getColumnIndex("suggest_text_2");
          this.s = paramCursor.getColumnIndex("suggest_text_2_url");
          this.t = paramCursor.getColumnIndex("suggest_icon_1");
          this.u = paramCursor.getColumnIndex("suggest_icon_2");
          this.v = paramCursor.getColumnIndex("suggest_flags");
          return;
        }
      }
      catch (Exception localException)
      {
      }
    }
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    bo localbo = (bo)paramView.getTag();
    if (this.v != -1);
    for (int i = paramCursor.getInt(this.v); ; i = 0)
    {
      if (localbo.a != null)
      {
        String str3 = a(paramCursor, this.q);
        a(localbo.a, str3);
      }
      Object localObject3;
      label211: Object localObject1;
      label247: ImageView localImageView1;
      if (localbo.b != null)
      {
        String str2 = a(paramCursor, this.s);
        if (str2 != null)
        {
          if (this.p == null)
          {
            TypedValue localTypedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(b.y, localTypedValue, true);
            this.p = this.d.getResources().getColorStateList(localTypedValue.resourceId);
          }
          SpannableString localSpannableString = new SpannableString(str2);
          localSpannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.p, null), 0, str2.length(), 33);
          localObject3 = localSpannableString;
          if (!TextUtils.isEmpty((CharSequence)localObject3))
            break label361;
          if (localbo.a != null)
          {
            localbo.a.setSingleLine(false);
            localbo.a.setMaxLines(2);
          }
          a(localbo.b, (CharSequence)localObject3);
        }
      }
      else
      {
        if (localbo.c != null)
        {
          ImageView localImageView2 = localbo.c;
          if (this.t != -1)
            break label390;
          localObject1 = null;
          a(localImageView2, (Drawable)localObject1, 4);
        }
        if (localbo.d != null)
        {
          localImageView1 = localbo.d;
          if (this.u != -1)
            break label543;
        }
      }
      label390: label531: label543: for (Drawable localDrawable1 = null; ; localDrawable1 = a(paramCursor.getString(this.u)))
      {
        a(localImageView1, localDrawable1, 8);
        if ((this.o != 2) && ((this.o != 1) || ((i & 0x1) == 0)))
          break label562;
        localbo.e.setVisibility(0);
        localbo.e.setTag(localbo.a.getText());
        localbo.e.setOnClickListener(this);
        return;
        localObject3 = a(paramCursor, this.r);
        break;
        label361: if (localbo.a == null)
          break label211;
        localbo.a.setSingleLine(true);
        localbo.a.setMaxLines(1);
        break label211;
        localObject1 = a(paramCursor.getString(this.t));
        if (localObject1 != null)
          break label247;
        ComponentName localComponentName = this.k.getSearchActivity();
        String str1 = localComponentName.flattenToShortString();
        if (this.m.containsKey(str1))
        {
          Drawable.ConstantState localConstantState = (Drawable.ConstantState)this.m.get(str1);
          if (localConstantState == null);
          for (localObject1 = null; ; localObject1 = localConstantState.newDrawable(this.l.getResources()))
          {
            label461: if (localObject1 != null)
              break label531;
            localObject1 = this.d.getPackageManager().getDefaultActivityIcon();
            break;
          }
        }
        Drawable localDrawable2 = a(localComponentName);
        if (localDrawable2 == null);
        for (Object localObject2 = null; ; localObject2 = localDrawable2.getConstantState())
        {
          this.m.put(str1, localObject2);
          localObject1 = localDrawable2;
          break label461;
          break;
        }
      }
      label562: localbo.e.setVisibility(8);
      return;
    }
  }

  public final CharSequence c(Cursor paramCursor)
  {
    if (paramCursor == null);
    String str2;
    do
    {
      do
      {
        return null;
        String str1 = a(paramCursor, "suggest_intent_query");
        if (str1 != null)
          return str1;
        if (this.k.shouldRewriteQueryFromData())
        {
          String str3 = a(paramCursor, "suggest_intent_data");
          if (str3 != null)
            return str3;
        }
      }
      while (!this.k.shouldRewriteQueryFromText());
      str2 = a(paramCursor, "suggest_text_1");
    }
    while (str2 == null);
    return str2;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      View localView2 = super.getView(paramInt, paramView, paramViewGroup);
      return localView2;
    }
    catch (RuntimeException localRuntimeException)
    {
      View localView1 = a(this.d, this.c, paramViewGroup);
      if (localView1 != null)
        ((bo)localView1.getTag()).a.setText(localRuntimeException.toString());
      return localView1;
    }
  }

  public final boolean hasStableIds()
  {
    return false;
  }

  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    d(a());
  }

  public final void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    d(a());
  }

  public final void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if ((localObject instanceof CharSequence))
      this.j.a((CharSequence)localObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bn
 * JD-Core Version:    0.6.2
 */