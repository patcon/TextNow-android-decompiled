package com.stripe.android;

import com.stripe.android.compat.AsyncTask;
import com.stripe.android.util.TextUtils;
import com.stripe.exception.AuthenticationException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public class Stripe
{
  private String defaultPublishableKey;
  Stripe.TokenCreator tokenCreator = new Stripe.TokenCreator()
  {
    public void create(final com.stripe.android.model.Card paramAnonymousCard, final String paramAnonymousString, Executor paramAnonymousExecutor, final TokenCallback paramAnonymousTokenCallback)
    {
      AsyncTask local1 = new AsyncTask()
      {
        protected Stripe.ResponseWrapper doInBackground(Void[] paramAnonymous2ArrayOfVoid)
        {
          try
          {
            com.stripe.model.Token localToken = com.stripe.model.Token.create(Stripe.this.hashMapFromCard(paramAnonymousCard), paramAnonymousString);
            com.stripe.model.Card localCard = localToken.getCard();
            com.stripe.android.model.Card localCard1 = Stripe.this.androidCardFromStripeCard(localCard);
            com.stripe.android.model.Token localToken1 = Stripe.this.androidTokenFromStripeToken(localCard1, localToken);
            Stripe.ResponseWrapper localResponseWrapper = new Stripe.ResponseWrapper(Stripe.this, localToken1, null, null);
            return localResponseWrapper;
          }
          catch (Exception localException)
          {
            return new Stripe.ResponseWrapper(Stripe.this, null, localException, null);
          }
        }

        protected void onPostExecute(Stripe.ResponseWrapper paramAnonymous2ResponseWrapper)
        {
          Stripe.this.tokenTaskPostExecution(paramAnonymous2ResponseWrapper, paramAnonymousTokenCallback);
        }
      };
      Stripe.this.executeTokenTask(paramAnonymousExecutor, local1);
    }
  };
  Stripe.TokenRequester tokenRequester = new Stripe.TokenRequester()
  {
    public void request(final String paramAnonymousString1, final String paramAnonymousString2, Executor paramAnonymousExecutor, final TokenCallback paramAnonymousTokenCallback)
    {
      AsyncTask local1 = new AsyncTask()
      {
        protected Stripe.ResponseWrapper doInBackground(Void[] paramAnonymous2ArrayOfVoid)
        {
          try
          {
            com.stripe.model.Token localToken = com.stripe.model.Token.retrieve(paramAnonymousString1, paramAnonymousString2);
            com.stripe.model.Card localCard = localToken.getCard();
            com.stripe.android.model.Card localCard1 = Stripe.this.androidCardFromStripeCard(localCard);
            com.stripe.android.model.Token localToken1 = Stripe.this.androidTokenFromStripeToken(localCard1, localToken);
            Stripe.ResponseWrapper localResponseWrapper = new Stripe.ResponseWrapper(Stripe.this, localToken1, null, null);
            return localResponseWrapper;
          }
          catch (Exception localException)
          {
            return new Stripe.ResponseWrapper(Stripe.this, null, localException, null);
          }
        }

        protected void onPostExecute(Stripe.ResponseWrapper paramAnonymous2ResponseWrapper)
        {
          Stripe.this.tokenTaskPostExecution(paramAnonymous2ResponseWrapper, paramAnonymousTokenCallback);
        }
      };
      Stripe.this.executeTokenTask(paramAnonymousExecutor, local1);
    }
  };

  public Stripe()
  {
  }

  public Stripe(String paramString)
  {
    setDefaultPublishableKey(paramString);
  }

  private com.stripe.android.model.Card androidCardFromStripeCard(com.stripe.model.Card paramCard)
  {
    return new com.stripe.android.model.Card(null, paramCard.getExpMonth(), paramCard.getExpYear(), null, paramCard.getName(), paramCard.getAddressLine1(), paramCard.getAddressLine2(), paramCard.getAddressCity(), paramCard.getAddressState(), paramCard.getAddressZip(), paramCard.getAddressCountry(), paramCard.getLast4(), paramCard.getType(), paramCard.getFingerprint(), paramCard.getCountry());
  }

  private com.stripe.android.model.Token androidTokenFromStripeToken(com.stripe.android.model.Card paramCard, com.stripe.model.Token paramToken)
  {
    return new com.stripe.android.model.Token(paramToken.getId(), paramToken.getLivemode().booleanValue(), new Date(1000L * paramToken.getCreated().longValue()), paramToken.getUsed(), paramCard);
  }

  private void executeTokenTask(Executor paramExecutor, AsyncTask<Void, Void, Stripe.ResponseWrapper> paramAsyncTask)
  {
    if (paramExecutor != null)
    {
      paramAsyncTask.executeOnExecutor(paramExecutor, new Void[0]);
      return;
    }
    paramAsyncTask.execute(new Void[0]);
  }

  private Map<String, Object> hashMapFromCard(com.stripe.android.model.Card paramCard)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap2.put("number", paramCard.getNumber());
    localHashMap2.put("cvc", paramCard.getCVC());
    localHashMap2.put("exp_month", paramCard.getExpMonth());
    localHashMap2.put("exp_year", paramCard.getExpYear());
    localHashMap2.put("name", paramCard.getName());
    localHashMap2.put("address_line1", paramCard.getAddressLine1());
    localHashMap2.put("address_line2", paramCard.getAddressLine2());
    localHashMap2.put("address_city", paramCard.getAddressCity());
    if (!TextUtils.isBlank(paramCard.getAddressZip()))
      localHashMap2.put("address_zip", paramCard.getAddressZip());
    localHashMap2.put("address_state", paramCard.getAddressState());
    localHashMap2.put("address_country", paramCard.getAddressCountry());
    localHashMap1.put("card", localHashMap2);
    return localHashMap1;
  }

  private void tokenTaskPostExecution(Stripe.ResponseWrapper paramResponseWrapper, TokenCallback paramTokenCallback)
  {
    if (paramResponseWrapper.token != null)
    {
      paramTokenCallback.onSuccess(paramResponseWrapper.token);
      return;
    }
    if (paramResponseWrapper.error != null)
    {
      paramTokenCallback.onError(paramResponseWrapper.error);
      return;
    }
    paramTokenCallback.onError(new RuntimeException("Somehow got neither a token response or an error response"));
  }

  private void validateKey(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      throw new AuthenticationException("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.");
    if (paramString.startsWith("sk_"))
      throw new AuthenticationException("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js");
  }

  public void createToken(com.stripe.android.model.Card paramCard, TokenCallback paramTokenCallback)
  {
    createToken(paramCard, this.defaultPublishableKey, paramTokenCallback);
  }

  public void createToken(com.stripe.android.model.Card paramCard, String paramString, TokenCallback paramTokenCallback)
  {
    createToken(paramCard, paramString, null, paramTokenCallback);
  }

  public void createToken(com.stripe.android.model.Card paramCard, String paramString, Executor paramExecutor, TokenCallback paramTokenCallback)
  {
    if (paramCard == null)
      try
      {
        throw new RuntimeException("Required Parameter: 'card' is required to create a token");
      }
      catch (AuthenticationException localAuthenticationException)
      {
        paramTokenCallback.onError(localAuthenticationException);
        return;
      }
    if (paramTokenCallback == null)
      throw new RuntimeException("Required Parameter: 'callback' is required to use the created token and handle errors");
    validateKey(paramString);
    this.tokenCreator.create(paramCard, paramString, paramExecutor, paramTokenCallback);
  }

  public void createToken(com.stripe.android.model.Card paramCard, Executor paramExecutor, TokenCallback paramTokenCallback)
  {
    createToken(paramCard, this.defaultPublishableKey, paramExecutor, paramTokenCallback);
  }

  public void requestToken(String paramString, TokenCallback paramTokenCallback)
  {
    requestToken(paramString, this.defaultPublishableKey, paramTokenCallback);
  }

  public void requestToken(String paramString1, String paramString2, TokenCallback paramTokenCallback)
  {
    requestToken(paramString1, paramString2, null, paramTokenCallback);
  }

  public void requestToken(String paramString1, String paramString2, Executor paramExecutor, TokenCallback paramTokenCallback)
  {
    if (paramString1 == null)
      try
      {
        throw new RuntimeException("Required Parameter: 'tokenId' is required to request a token");
      }
      catch (AuthenticationException localAuthenticationException)
      {
        paramTokenCallback.onError(localAuthenticationException);
        return;
      }
    if (paramTokenCallback == null)
      throw new RuntimeException("Required Parameter: 'callback' is required to use the requested token and handle errors");
    validateKey(paramString2);
    this.tokenRequester.request(paramString1, paramString2, paramExecutor, paramTokenCallback);
  }

  public void requestToken(String paramString, Executor paramExecutor, TokenCallback paramTokenCallback)
  {
    requestToken(paramString, this.defaultPublishableKey, paramExecutor, paramTokenCallback);
  }

  public void setDefaultPublishableKey(String paramString)
  {
    validateKey(paramString);
    this.defaultPublishableKey = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.android.Stripe
 * JD-Core Version:    0.6.2
 */