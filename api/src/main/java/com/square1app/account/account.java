package com.square1app.account;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

@Api(
    name = "account",
    version = "v1",
    description = "Square 1 API",
    namespace = @ApiNamespace(ownerDomain = "Square1app.com", ownerName = "Square 1", packagePath = "com.Square1app"))
class account implements Iaccount {

    @Override public IregisterUser registerUser(@Named("phonenumber")String phonenumber,@Named("vcard") String vcard,@Named("fullname") String fullname,
        @Named("email")String email, @Named("token")String token) {
        return registerUser(phonenumber, vcard, fullname, email, token);
    }

    @Override public IverifyUser verifyUser(@Named("username") String username, @Named("token")String token) {
        return new verifyUser(username);
    }

    @Override public IcheckUser checkUser(@Named("username") String username) {
        return new checkUser(username);
    }

    @Override public IresetUser resetUser(@Named("username") String username,@Named("token") String token) {
        return new resetUser(username);
    }

    @Override public IremoveUser removeUser(@Named("ownerid")String ownerid, @Named("token")String token) {
        return new removeUser(ownerid);
    }
}
