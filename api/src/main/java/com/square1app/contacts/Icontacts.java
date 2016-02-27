package com.square1app.contacts;

import javax.inject.Named;

/**
 * Created by benbyers on 2/27/16.
 */
public interface Icontacts {
    Iusername getUsername(@Named("ownerid") String ownerid, String token);

    Icard getCard(@Named("ownerid") String ownerid, String token);

    Iqr getQr(@Named("ownerid") String ownerid, String token);

    IsetUser setUser(@Named("userid") String userid, String token, String user);

    Ilist list(@Named("ownerid") String ownerid, String token);
}
