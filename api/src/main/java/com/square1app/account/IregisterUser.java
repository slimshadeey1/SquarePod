package com.square1app.account;

/**
 * Created by benbyers on 2/27/16.
 */
public interface IregisterUser {
    String getPhonenumber();

    void setPhonenumber(String phonenumber);

    String getVcard();

    void setVcard(String vcard);

    String getFullname();

    void setFullname(String fullname);

    String getEmail();

    void setEmail(String email);

    String getToken();

    void setToken(String token);
}
