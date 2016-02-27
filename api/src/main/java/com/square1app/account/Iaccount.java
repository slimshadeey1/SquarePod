package com.square1app.account;

import javax.inject.Named;

/**
 * Created by benbyers on 2/27/16.
 */
public interface Iaccount {
    IregisterUser registerUser(String phonenumber, String vcard, String fullname, String email,
        String token);

    IverifyUser verifyUser(@Named("username") String username, String token);

    IcheckUser checkUser(@Named("username") String username);

    IresetUser resetUser(@Named("username") String username, String token);

    IremoveUser removeUser(String ownerid, String token);
}
