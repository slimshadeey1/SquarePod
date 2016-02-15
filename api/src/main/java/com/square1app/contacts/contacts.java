package com.square1app.contacts;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;
import com.square1app.contacts.adduse.card;
import com.square1app.contacts.getuse.Iusername;

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
  @Override
  public Iusername username(@Named("ownerid") String ownerid) {
    return new com.square1app.contacts.getuse.username(ownerid);
  }

  @Override
  public Iusername username(@Named( = "ownerid") String ownerid) {
    return new username(ownerid);
  }

  @Override
  public Icard card(@Named( = "ownerid") String ownerid) {
    return new card(ownerid);
  }

  @Override
  public Icard card(@Named( = "ownerid") String ownerid) {
    return new card(ownerid);
  }

  @Override
  public Iqr qr(@Named( = "ownerid") String ownerid) {
    return new qr(ownerid);
  }

  @Override
  public Iqr qr(@Named( = "ownerid") String ownerid) {
    return new qr(ownerid);
  }

  @Override
  public IsetUser setUser(@Named( = "userid") String userid) {
    return new setUser(userid);
  }

  @Override
  public Ilist list() {
    return list();
  }
}
