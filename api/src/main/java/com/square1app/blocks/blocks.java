package com.square1app.blocks;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;
import java.lang.Override;

@Api(
    name = "blocks",
    version = "v1",
    description = "Square 1 API",
    namespace = @ApiNamespace(ownerDomain = "Square1app.com", ownerName = "Square 1", packagePath = "com.Square1app.blocks")
)
class blocks implements Iblocks {

  public Iblock block() {
    return block();
  }


  public Iunblock unblock() {
    return unblock();
  }


  public Ilist list() {
    return list();
  }
}
