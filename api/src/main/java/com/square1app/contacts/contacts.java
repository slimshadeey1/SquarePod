package com.square1app.contacts;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;
import com.square1app.contacts.Objects.card;
import com.square1app.contacts.Objects.qr;
import com.square1app.contacts.Objects.username;


import java.lang.Override;
import java.lang.String;
import javax.inject.Named;

@Api(
    name = "contacts",
    version = "v1",
    description = "Square 1 API",
    namespace = @ApiNamespace(ownerDomain = "square1app.com", ownerName = "Square 1", packagePath = "com.square1app.contacts")
)
class contacts implements Icontacts {


  public Iusername getUsername(@Named("ownerid") String ownerid) {
    return new username(ownerid);
  }


  public Icard getCard(@Named("ownerid") String ownerid) {
    return new card(ownerid);
  }

  public Iqr getQr(@Named("ownerid") String ownerid) {
    return new qr(ownerid);
  }

  public IsetUser setUser(@Named("userid") String userid) {
    return new setUser(userid);
  }

  public Ilist list() {
    return list();
  }
}
