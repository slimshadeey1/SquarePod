package com.square1app.contacts;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;
import com.square1app.Constants;
import com.square1app.contacts.Objects.card;
import com.square1app.contacts.Objects.qr;
import com.square1app.contacts.Objects.username;

import javax.inject.Named;

@Api(
    name = "contacts",
    version = "v1",
    clientIds = {Constants.API_EXPLORER_CLIENT_ID},

    description = "Square 1 API",
    namespace = @ApiNamespace(ownerDomain = "square1app.com", ownerName = "Square 1", packagePath = "com.square1app"))
class contacts implements Icontacts {


    @Override public Iusername getUsername(@Named("ownerid")String ownerid,@Named("token") String token) {
        return new username(ownerid);
    }


    @Override public Icard getCard(@Named("ownerid")String ownerid,@Named("token") String token) {
        return new card(ownerid);
    }

    @Override public Iqr getQr(@Named("ownerid") String ownerid,@Named("token") String token) {
        return new qr(ownerid);
    }

    @Override public IsetUser setUser(@Named("userid") String userid,@Named("token") String token,@Named("user") String user) {
        return new setUser(userid, user);
    }

    @Override public Ilist list(@Named("ownerid") String ownerid,@Named("token") String token) {
        return new userlist(ownerid);
    }
}
