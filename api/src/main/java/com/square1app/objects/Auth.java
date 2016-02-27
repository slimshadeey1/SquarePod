package com.square1app.objects;

/**
 * Created by benbyers on 2/26/16.
 *
 * https://docs.fabric.io/ios/digits/oauth-echo.html
 */
public class Auth implements IAuth {
    private String accountURL;
    private String oauthSignature;

    public Auth(String accountURL, String oauthSignature) {
        this.accountURL = accountURL;
        this.oauthSignature = oauthSignature;
    }

    @Override public String getAccountURL() {
        return accountURL;
    }

    @Override public void setAccountURL(String accountURL) {
        this.accountURL = accountURL;
    }

    @Override public String getOauthSignature() {
        return oauthSignature;
    }

    @Override public void setOauthSignature(String oauthSignature) {
        this.oauthSignature = oauthSignature;
    }
}
