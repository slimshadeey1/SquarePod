package com.square1app.account;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;
import java.lang.Override;
import java.lang.String;
import javax.inject.Named;

@Api(
    name = "account",
    version = "v1",
    description = "Square 1 API",
    namespace = @ApiNamespace(ownerDomain = "Square1app.com", ownerName = "Square 1", packagePath = "com.Square1app.account")
)
class account implements Iaccount {

  public IregisterUser registerUser() {
    return registerUser();
  }

  public IverifyUser verifyUser(@Named("username") String username) {
    return new verifyUser(username);
  }

  public IcheckUser checkUser(@Named("username") String username) {
    return new checkUser(username);
  }

  public IresetUser resetUser(@Named("username") String username) {
    return new resetUser(username);
  }

  public IremoveUser removeUser() {
    return removeUser();
  }
}
