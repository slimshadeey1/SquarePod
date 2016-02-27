package com.square1app.objects;

/**
 * Created by benbyers on 2/26/16.
 */
public interface IAuth {
    String getAccountURL();

    void setAccountURL(String accountURL);

    String getOauthSignature();

    void setOauthSignature(String oauthSignature);
}
